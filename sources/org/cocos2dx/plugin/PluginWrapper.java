// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.plugin;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class PluginWrapper
{

    public PluginWrapper()
    {
    }

    public static Context getContext()
    {
        return sContext;
    }

    protected static int getPluginType(Object obj)
    {
        int i;
        try
        {
            i = ((Integer)obj.getClass().getField("PluginType").get(obj)).intValue();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            ((Exception) (obj)).printStackTrace();
            return -1;
        }
        return i;
    }

    public static void init(Context context)
    {
        sContext = context;
        if(sMainThreadHandler == null)
            sMainThreadHandler = new Handler();
    }

    protected static void initFromNativeActivity(Activity activity)
    {
        sContext = activity;
    }

    protected static Object initPlugin(String s)
    {
        Log.i("PluginWrapper", (new StringBuilder()).append("class name : ----").append(s).append("----").toString());
        Class class1;
        Context context;
        try
        {
            class1 = Class.forName(s.replace('/', '.'));
        }
        catch(ClassNotFoundException classnotfoundexception)
        {
            Log.e("PluginWrapper", (new StringBuilder()).append("Class ").append(s).append(" not found.").toString());
            classnotfoundexception.printStackTrace();
            return null;
        }
        try
        {
            context = getContext();
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            s.printStackTrace();
            return null;
        }
        if(context == null)
            break MISSING_BLOCK_LABEL_114;
        s = ((String) (class1.getDeclaredConstructor(new Class[] {
            android/content/Context
        }).newInstance(new Object[] {
            context
        })));
        return s;
        Log.e("PluginWrapper", (new StringBuilder()).append("Plugin ").append(s).append(" wasn't initialized.").toString());
        return null;
    }

    public static void runOnGLThread(Runnable runnable)
    {
        if(sGLSurfaceView != null)
        {
            sGLSurfaceView.queueEvent(runnable);
            return;
        }
        if(sGLThreadHandler != null)
        {
            sGLThreadHandler.post(runnable);
            return;
        } else
        {
            Log.i("PluginWrapper", "call back invoked on main thread");
            runnable.run();
            return;
        }
    }

    public static void runOnMainThread(Runnable runnable)
    {
        if(sMainThreadHandler != null)
            sMainThreadHandler.post(runnable);
        else
        if(sContext != null && (sContext instanceof Activity))
        {
            ((Activity)sContext).runOnUiThread(runnable);
            return;
        }
    }

    public static void setGLSurfaceView(GLSurfaceView glsurfaceview)
    {
        sGLSurfaceView = glsurfaceview;
    }

    private static final String TAG = "PluginWrapper";
    protected static Context sContext = null;
    protected static GLSurfaceView sGLSurfaceView = null;
    protected static Handler sGLThreadHandler = null;
    protected static Handler sMainThreadHandler = null;

}
