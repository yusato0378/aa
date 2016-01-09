// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberz.fox.notify;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package jp.co.cyberz.fox.notify:
//            a

public class c extends AsyncTask
{

    public c()
    {
        b = "F.O.X Notify";
    }

    public c(Context context, String s)
    {
        b = "F.O.X Notify";
        c = context;
        d = s;
    }

    protected transient Long a(String as[])
    {
        Object obj;
        if(as == null || as.length == 0)
            return Long.valueOf(0L);
        obj = new HttpGet(as[0]);
        as = new DefaultHttpClient();
        HttpConnectionParams.setConnectionTimeout(as.getParams(), 5000);
        int i;
        obj = as.execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
        i = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        if(i == 200)
            break MISSING_BLOCK_LABEL_107;
        Log.e("F.O.X Notify", (new StringBuilder()).append("PushManagerTask failed. HTTP Status code = ").append(i).toString());
        as.getConnectionManager().shutdown();
        return Long.valueOf(0L);
        if(((HttpResponse) (obj)).getEntity() != null)
            break MISSING_BLOCK_LABEL_138;
        Log.e("F.O.X Notify", "PushManagerTask failed: Entity nothing.");
        as.getConnectionManager().shutdown();
        return Long.valueOf(0L);
        Log.d("F.O.X Notify", (new StringBuilder()).append("status code : ").append(i).toString());
        as.getConnectionManager().shutdown();
        return a;
        Object obj1;
        obj1;
        Log.e("F.O.X Notify", (new StringBuilder()).append("PushManagerTask failed: ").append(((ClientProtocolException) (obj1)).getMessage()).toString());
        ((ClientProtocolException) (obj1)).printStackTrace();
        as.getConnectionManager().shutdown();
        return Long.valueOf(0L);
        obj1;
        Log.e("F.O.X Notify", (new StringBuilder()).append("PushManagerTask failed. ").append(((IOException) (obj1)).getMessage()).toString());
        ((IOException) (obj1)).printStackTrace();
        as.getConnectionManager().shutdown();
        return Long.valueOf(0L);
        obj1;
        as.getConnectionManager().shutdown();
        throw obj1;
    }

    protected void a(Long long1)
    {
        System.out.println((new StringBuilder()).append("result: ").append(long1).toString());
        if(long1.longValue() == 1L && d != null)
        {
            jp.co.cyberz.fox.notify.a.c(c, d);
            Log.d("F.O.X Notify", "logged registed status");
            d = null;
            jp.co.cyberz.fox.notify.a.d();
        }
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
    private final String b;
    private Context c;
    private String d;

}
