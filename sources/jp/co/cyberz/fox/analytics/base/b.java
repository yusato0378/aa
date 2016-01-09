// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberz.fox.analytics.base;

import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package jp.co.cyberz.fox.analytics.base:
//            e

public class b extends AsyncTask
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

        final b a;
        private int b;

        a()
        {
            a = b.this;
            super();
        }
    }


    public b(List list, List list1)
    {
        a = null;
        b = null;
        if(list != null)
        {
            a = list;
            b = list1;
            return;
        } else
        {
            a = new ArrayList();
            return;
        }
    }

    protected transient a a(String as[])
    {
        a a1;
        HttpPost httppost;
        while(as == null || as.length == 0 || a == null || b == null || b.size() == 0) 
            return null;
        a1 = new a();
        httppost = new HttpPost(as[0]);
        as = new DefaultHttpClient();
        int i;
        httppost.setEntity(new UrlEncodedFormEntity(b, "UTF-8"));
        HttpConnectionParams.setConnectionTimeout(as.getParams(), 5000);
        as.getParams().setParameter("http.useragent", "ADMAGESMPHSDK/Android/v2.15.7g/CZ/{0}/{1}/{2}/GL");
        a.a(a1, as.execute(httppost).getStatusLine().getStatusCode());
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
        if(a1 == null)
            return;
        if(200 != a1.a())
        {
            e.a(a);
            return;
        } else
        {
            e.a();
            return;
        }
    }

    protected transient void b(String as[])
    {
        super.onProgressUpdate(as);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onCancelled()
    {
        super.onCancelled();
    }

    protected void onPostExecute(Object obj)
    {
        a((a)obj);
    }

    protected void onPreExecute()
    {
        super.onPreExecute();
    }

    protected void onProgressUpdate(Object aobj[])
    {
        b((String[])aobj);
    }

    public List a;
    public List b;
}
