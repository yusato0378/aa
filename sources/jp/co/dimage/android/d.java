// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.dimage.android;

import android.os.AsyncTask;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package jp.co.dimage.android:
//            c, l, f

public class d extends AsyncTask
{

    public d(c c1, f f1, f.a a1)
    {
        m = null;
        n = null;
        m = c1;
        n = f1;
        a(a1);
    }

    private Map a(String s)
    {
        HashMap hashmap = new HashMap();
        StringTokenizer stringtokenizer = new StringTokenizer(s, ",");
_L2:
        s = hashmap;
        if(!stringtokenizer.hasMoreTokens())
            break; /* Loop/switch isn't completed */
        s = new StringTokenizer(stringtokenizer.nextToken(), "=");
        if(s.countTokens() == 2)
            hashmap.put(s.nextToken(), s.nextToken());
        if(true) goto _L2; else goto _L1
        s;
        s = null;
_L1:
        return s;
    }

    protected transient Long a(String as[])
    {
        DefaultHttpClient defaulthttpclient;
        if(as == null || as.length == 0)
            return null;
        as = new HttpGet(as[0]);
        defaulthttpclient = new DefaultHttpClient();
        HttpConnectionParams.setConnectionTimeout(defaulthttpclient.getParams(), 10000);
        defaulthttpclient.getParams().setParameter("http.useragent", m.k());
        int i1;
        as = defaulthttpclient.execute(as);
        i1 = as.getStatusLine().getStatusCode();
        if(i1 == 200)
            break MISSING_BLOCK_LABEL_131;
        Log.e("F.O.X", (new StringBuilder()).append("CheckCvModeTask failed. HTTP Status code = ").append(i1).toString());
        defaulthttpclient.getConnectionManager().shutdown();
        return null;
        as = as.getEntity();
        if(as != null)
            break MISSING_BLOCK_LABEL_163;
        Log.e("F.O.X", "CheckCvModeTask: Entity nothing.");
        defaulthttpclient.getConnectionManager().shutdown();
        return null;
        Map map;
        BufferedReader bufferedreader;
        bufferedreader = new BufferedReader(new InputStreamReader(as.getContent()));
        as = bufferedreader.readLine();
        if(jp.co.dimage.android.l.a(as))
            break MISSING_BLOCK_LABEL_231;
        map = a(((String) (as)));
        as = map;
        if(map != null)
            break MISSING_BLOCK_LABEL_233;
        Log.e("F.O.X", "CheckCvModeTask: Parameter is nothing.");
        defaulthttpclient.getConnectionManager().shutdown();
        return null;
        as = null;
        bufferedreader.close();
        n.b("1".equals(as.get("tke")));
        n.c("1".equals(as.get("fbe")));
        n.e("1".equals(as.get("bre")));
        n.f("1".equals(as.get("bri")));
        n.g("1".equals(as.get("sav")));
        n.h("1".equals(as.get("cke")));
        n.i("1".equals(as.get("fie")));
        n.a(true);
        n.d("1".equals(as.get("ade")));
        try
        {
            n.j("1".equals(as.get("ref")));
            n.a(Integer.valueOf(Integer.parseInt((String)as.get("delay"))));
        }
        // Misplaced declaration of an exception variable
        catch(String as[]) { }
        defaulthttpclient.getConnectionManager().shutdown();
        return a;
        as;
        Log.e("F.O.X", (new StringBuilder()).append("CheckCvModeTask faild. ").append(as.getMessage()).toString());
        as.printStackTrace();
        defaulthttpclient.getConnectionManager().shutdown();
        return null;
        as;
        defaulthttpclient.getConnectionManager().shutdown();
        throw as;
    }

    public f.a a()
    {
        return o;
    }

    protected void a(Long long1)
    {
        if(n != null && n.e())
            n.a(o);
    }

    public void a(f.a a1)
    {
        o = a1;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Long)obj);
    }

    private static Long a = Long.valueOf(1L);
    private static final String b = "tke";
    private static final String c = "fbe";
    private static final String d = "bre";
    private static final String e = "bri";
    private static final String f = "sav";
    private static final String g = "cke";
    private static final String h = "fie";
    private static final String i = "ref";
    private static final String j = "ade";
    private static final String k = "1";
    private static final String l = "delay";
    private c m;
    private f n;
    private f.a o;

}
