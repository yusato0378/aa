// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.dimage.android;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package jp.co.dimage.android:
//            f, c

public class g extends AsyncTask
{
    class a
    {

        public String a()
        {
            return h;
        }

        public void a(String s)
        {
            h = s;
        }

        public String b()
        {
            return i;
        }

        public void b(String s)
        {
            i = s;
        }

        public String c()
        {
            return j;
        }

        public void c(String s)
        {
            j = s;
        }

        public static final String a = "0";
        public static final String b = "1";
        public static final String c = "2";
        public static final String d = "0";
        public static final String e = "1";
        public static final String f = "2";
        final g g;
        private String h;
        private String i;
        private String j;

        a()
        {
            g = g.this;
            super();
        }
    }


    public g(c c1)
    {
        a = null;
        b = null;
        c = null;
        a = c1;
        b = new f(c1);
    }

    public g(c c1, String s)
    {
        a = null;
        b = null;
        c = null;
        a = c1;
        b = new f(c1);
        c = s;
    }

    protected transient a a(String as[])
    {
        Object obj;
        Object obj1;
        if(as == null || as.length == 0)
            return null;
        obj = new a();
        obj1 = new HttpGet(as[0]);
        as = new DefaultHttpClient();
        HttpConnectionParams.setConnectionTimeout(as.getParams(), 5000);
        as.getParams().setParameter("http.useragent", a.k());
        int i;
        obj1 = as.execute(((org.apache.http.client.methods.HttpUriRequest) (obj1)));
        i = ((HttpResponse) (obj1)).getStatusLine().getStatusCode();
        if(i == 200)
            break MISSING_BLOCK_LABEL_140;
        Log.e("F.O.X", (new StringBuilder()).append("ConversionTask faild. HTTP Status code = ").append(i).toString());
        as.getConnectionManager().shutdown();
        return ((a) (obj));
        obj1 = ((HttpResponse) (obj1)).getEntity();
        if(obj1 != null)
            break MISSING_BLOCK_LABEL_159;
        Log.e("F.O.X", "ConversionTask: Entity nothing.");
        obj1 = new LineNumberReader(new InputStreamReader(((HttpEntity) (obj1)).getContent()));
_L1:
        String s = ((LineNumberReader) (obj1)).readLine();
        if(s == null)
            break MISSING_BLOCK_LABEL_370;
        String as1[] = s.split(": *", 2);
        if(as1 == null)
            break MISSING_BLOCK_LABEL_213;
        if(as1.length == 2)
            break MISSING_BLOCK_LABEL_293;
        Log.e("F.O.X", (new StringBuilder()).append("invalid response format '").append(s).append("'").toString());
          goto _L1
        obj;
        Log.e("F.O.X", (new StringBuilder()).append("ConversionTask faild. ").append(((Exception) (obj)).getMessage()).toString());
        ((Exception) (obj)).printStackTrace();
        as.getConnectionManager().shutdown();
        return null;
        if("URL".equals(as1[0]))
            ((a) (obj)).a(as1[1]);
        if("TYPE".equals(as1[0]))
            ((a) (obj)).b(as1[1]);
        if("STATUS".equals(as1[0]))
            ((a) (obj)).c(as1[1]);
          goto _L1
        obj;
        as.getConnectionManager().shutdown();
        throw obj;
        as.getConnectionManager().shutdown();
        return ((a) (obj));
    }

    protected void a(a a1)
    {
        if(a1 != null)
        {
            Log.i("F.O.X", (new StringBuilder()).append("ConversionTask: url=").append(a1.a()).append(" type=").append(a1.b()).append(" status=").append(a1.c()).toString());
            if("0".equals(a1.c()))
            {
                Log.e("F.O.X", "ConversionTask: server status is failed.");
                return;
            }
            if("1".equals(a1.c()))
            {
                b.d();
                if(c != null)
                    b.h(c);
            }
            if(!"0".equals(a1.b()))
            {
                a1 = a1.a();
                if(a1 != null && a1.length() != 0 && !"*".equals(a1))
                    try
                    {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse(a1));
                        b.b(intent);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch(a a1)
                    {
                        return;
                    }
            }
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((a)obj);
    }

    private c a;
    private f b;
    private String c;
}
