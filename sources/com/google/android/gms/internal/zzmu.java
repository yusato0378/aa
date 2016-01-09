// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.zzbg;
import java.io.*;
import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.google.android.gms.internal:
//            zzmw

class zzmu
    implements zzmw
{

    zzmu()
    {
    }

    private InputStream zza(HttpClient httpclient, HttpResponse httpresponse)
        throws IOException
    {
        int i = httpresponse.getStatusLine().getStatusCode();
        if(i == 200)
        {
            zzbg.zzam("Success response");
            return httpresponse.getEntity().getContent();
        }
        httpclient = (new StringBuilder()).append("Bad response: ").append(i).toString();
        if(i == 404)
            throw new FileNotFoundException(httpclient);
        else
            throw new IOException(httpclient);
    }

    private void zza(HttpClient httpclient)
    {
        if(httpclient != null && httpclient.getConnectionManager() != null)
            httpclient.getConnectionManager().shutdown();
    }

    public void close()
    {
        zza(zzaHF);
    }

    public InputStream zzev(String s)
        throws IOException
    {
        zzaHF = zzyL();
        s = zzaHF.execute(new HttpGet(s));
        return zza(zzaHF, s);
    }

    HttpClient zzyL()
    {
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 20000);
        HttpConnectionParams.setSoTimeout(basichttpparams, 20000);
        return new DefaultHttpClient(basichttpparams);
    }

    private HttpClient zzaHF;
}
