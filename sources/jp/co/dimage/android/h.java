// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.dimage.android;

import android.os.AsyncTask;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package jp.co.dimage.android:
//            c

public class h extends AsyncTask
{
    class a
    {

        static int a(a a1)
        {
            return a1.b;
        }

        static int a(a a1, int i)
        {
            a1.b = i;
            return i;
        }

        public int a()
        {
            return b;
        }

        public void a(int i)
        {
            b = i;
        }

        final h a;
        private int b;

        a()
        {
            a = h.this;
            super();
        }
    }


    public h(c c1, String s)
    {
        a = null;
        b = null;
        b = c1;
        a = s;
    }

    protected transient a a(String as[])
    {
        a a1;
        HttpGet httpget;
        if(as == null || as.length == 0)
            return null;
        a1 = new a();
        httpget = new HttpGet(as[0]);
        as = new DefaultHttpClient();
        int i;
        HttpConnectionParams.setConnectionTimeout(as.getParams(), 5000);
        as.getParams().setParameter("http.useragent", "ADMAGESMPHSDK/Android/v2.15.7g/CZ/{0}/{1}/{2}/GL");
        a.a(a1, as.execute(httpget).getStatusLine().getStatusCode());
        i = a.a(a1);
        if(i != 200)
        {
            as.getConnectionManager().shutdown();
            return a1;
        } else
        {
            as.getConnectionManager().shutdown();
            return a1;
        }
        Exception exception1;
        exception1;
        a1.a(503);
        as.getConnectionManager().shutdown();
        return a1;
        Exception exception;
        exception;
        as.getConnectionManager().shutdown();
        throw exception;
    }

    protected void a(a a1)
    {
        while(a1 == null || 200 != a1.a()) 
            return;
        b.c(a);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((a)obj);
    }

    private String a;
    private c b;
}
