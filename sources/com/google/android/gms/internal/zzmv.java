// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.internal:
//            zzmw

class zzmv
    implements zzmw
{

    zzmv()
    {
    }

    private InputStream zzb(HttpURLConnection httpurlconnection)
        throws IOException
    {
        int i = httpurlconnection.getResponseCode();
        if(i == 200)
            return httpurlconnection.getInputStream();
        httpurlconnection = (new StringBuilder()).append("Bad response: ").append(i).toString();
        if(i == 404)
            throw new FileNotFoundException(httpurlconnection);
        else
            throw new IOException(httpurlconnection);
    }

    private void zzc(HttpURLConnection httpurlconnection)
    {
        if(httpurlconnection != null)
            httpurlconnection.disconnect();
    }

    public void close()
    {
        zzc(zzaHG);
    }

    public InputStream zzev(String s)
        throws IOException
    {
        zzaHG = zzew(s);
        return zzb(zzaHG);
    }

    HttpURLConnection zzew(String s)
        throws IOException
    {
        s = (HttpURLConnection)(new URL(s)).openConnection();
        s.setReadTimeout(20000);
        s.setConnectTimeout(20000);
        return s;
    }

    private HttpURLConnection zzaHG;
}
