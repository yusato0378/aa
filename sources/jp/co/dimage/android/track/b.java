// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.dimage.android.track;

import android.os.AsyncTask;
import android.util.Log;
import java.util.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;

class b extends AsyncTask
{

    b(String s)
    {
        a = Collections.synchronizedList(new LinkedList());
        b = s;
    }

    private void b()
    {
        if(a.size() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        DefaultHttpClient defaulthttpclient;
        String s;
        if(a.size() <= 0)
            continue; /* Loop/switch isn't completed */
        s = (String)a.get(0);
        defaulthttpclient = new DefaultHttpClient();
        defaulthttpclient.getParams().setParameter("http.useragent", b);
        defaulthttpclient.execute(new HttpGet(s));
        defaulthttpclient.getConnectionManager().shutdown();
_L4:
        a.remove(0);
        if(true) goto _L2; else goto _L3
_L3:
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
        Log.e("F.O.X", (new StringBuilder()).append("TrackTask faild. ").append(((Exception) (obj)).getMessage()).toString());
        defaulthttpclient.getConnectionManager().shutdown();
          goto _L4
        obj;
        defaulthttpclient.getConnectionManager().shutdown();
        throw obj;
        if(true) goto _L1; else goto _L5
_L5:
    }

    protected transient Void a(Void avoid[])
    {
        this;
        JVM INSTR monitorenter ;
_L1:
        boolean flag = c;
        if(flag)
            break MISSING_BLOCK_LABEL_59;
        wait();
_L2:
        b();
          goto _L1
        avoid;
        this;
        JVM INSTR monitorexit ;
        throw avoid;
        avoid;
        Log.e("F.O.X", (new StringBuilder()).append("TrackTask faild. ").append(avoid.getMessage()).toString());
          goto _L2
        this;
        JVM INSTR monitorexit ;
        return null;
    }

    void a()
    {
        this;
        JVM INSTR monitorenter ;
        c = true;
        notify();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        a.add(s);
        notify();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    private List a;
    private String b;
    private boolean c;
}
