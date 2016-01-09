// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.mcraft.cocos2dx;

import android.app.Activity;
import android.content.Context;
import android.webkit.*;
import java.util.concurrent.*;
import org.cocos2dx.lib.Cocos2dxActivity;

public class WebViewHelperAndroid
{

    private WebViewHelperAndroid()
    {
    }

    private static void checkInit()
    {
        if(!sInitialized)
            throw new IllegalStateException("Need to call WebViewHelperAndroid.initialize(Context)!!");
        else
            return;
    }

    public static void clearCookies()
    {
        checkInit();
        CookieManager.getInstance().removeAllCookie();
        CookieSyncManager.getInstance().sync();
    }

    public static String getCookies(String s)
    {
        checkInit();
        return CookieManager.getInstance().getCookie(s);
    }

    public static String getDefaultUserAgent()
    {
label0:
        {
            checkInit();
            String s;
            synchronized(sDefaultUserAgentLock)
            {
                if(sDefaultUserAgent == null)
                    break label0;
                s = sDefaultUserAgent;
            }
            return s;
        }
        Object obj1;
        obj1 = new FutureTask(new Callable() {

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public String call()
                throws Exception
            {
                return (new WebView(Cocos2dxActivity.getContext())).getSettings().getUserAgentString();
            }

        }
);
        ((Activity)Cocos2dxActivity.getContext()).runOnUiThread(((Runnable) (obj1)));
        sDefaultUserAgent = (String)((FutureTask) (obj1)).get();
        obj1 = sDefaultUserAgent;
        obj;
        JVM INSTR monitorexit ;
        return ((String) (obj1));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj2;
        obj2;
        ((InterruptedException) (obj2)).printStackTrace();
        obj;
        JVM INSTR monitorexit ;
        return "";
        obj2;
        ((ExecutionException) (obj2)).printStackTrace();
        obj;
        JVM INSTR monitorexit ;
        return "";
    }

    private static void initialize()
    {
        if(!sClassLoaded)
        {
            if(!nativeInit())
                throw new RuntimeException("native init failed");
            sClassLoaded = true;
        }
        sInitialized = true;
    }

    public static void initialize(Context context)
    {
        CookieSyncManager.createInstance(context);
        CookieSyncManager.getInstance().startSync();
        CookieManager.getInstance().setAcceptCookie(true);
        initialize();
    }

    private static native boolean nativeInit();

    public static void setCookie(String s, String s1)
    {
        checkInit();
        CookieManager.getInstance().setCookie(s, s1);
        CookieSyncManager.getInstance().sync();
    }

    public static void setDefaultUserAgent(String s)
    {
        checkInit();
        synchronized(sDefaultUserAgentLock)
        {
            sDefaultUserAgent = s;
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    static boolean sClassLoaded;
    static String sDefaultUserAgent;
    static Object sDefaultUserAgentLock = new Object();
    static boolean sInitialized;

    static 
    {
        if(!nativeInit())
        {
            throw new RuntimeException("native init failed");
        } else
        {
            sClassLoaded = true;
        }
    }
}
