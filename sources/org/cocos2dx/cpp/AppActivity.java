// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.cpp;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.ScaleGestureDetector;
import com.growthpush.cocos2dx.GrowthPushJNI;
import com.mcraft.cocos2dx.McAndroid;
import com.smrtbeat.SmartBeat;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import jp.appAdForce.android.AnalyticsManager;
import jp.co.cyberagent.gn.plugin.PluginNativeActivity;
import mc.core.MCLog;
import mc.core.McScaleGestureListenerWrapper;
import mc.notification.LocalNotification;
import org.cocos2dx.lib.Cocos2dxActivity;
import org.cocos2dx.lib.Cocos2dxGLSurfaceView;
import org.cocos2dx.plugin.PluginWrapper;

public class AppActivity extends PluginNativeActivity
{

    public AppActivity()
    {
    }

    public static void addExtraData(String s, String s1)
    {
        SmartBeat.addExtraData(s, s1);
    }

    public static boolean appInstalled(Context context, String s)
    {
        MCLog.v("appInstalled", new Object[0]);
        context = context.getPackageManager();
        try
        {
            context.getPackageInfo(s, 1);
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            return false;
        }
        return true;
    }

    public static void openLine(String s)
    {
        MCLog.v("Start openLine()", new Object[0]);
        if(appInstalled(Cocos2dxActivity.getContext(), "jp.naver.line.android"))
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            String s1 = s;
            try
            {
                s = URLEncoder.encode(s, "utf-8");
            }
            // Misplaced declaration of an exception variable
            catch(String s)
            {
                MCLog.v("miss encode", new Object[0]);
                s = s1;
            }
            intent.setData(Uri.parse((new StringBuilder()).append("line://msg/text/").append(s).toString()));
            _myActivity.startActivity(intent);
        }
    }

    public static void openURL(String s, String s1, String s2)
    {
        MCLog.v("Start openURL()", new Object[0]);
        s = new Intent("android.intent.action.SENDTO", Uri.parse((new StringBuilder()).append("mailto:").append(s).toString()));
        s.putExtra("android.intent.extra.SUBJECT", s1);
        s.putExtra("android.intent.extra.TEXT", s2);
        _myActivity.startActivity(s);
    }

    public static void setUserId(String s)
    {
        SmartBeat.setUserId(s);
    }

    public void onCreate(Bundle bundle)
    {
        MCLog.v("onCreate", new Object[0]);
        super.onCreate(bundle);
        McAndroid.initialize(this);
        GrowthPushJNI.setContext(this);
        _myActivity = this;
        SmartBeat.enableLogCat();
        setScaleGestureDetector(new ScaleGestureDetector(this, new McScaleGestureListenerWrapper()));
        LocalNotification.onCreate(this);
    }

    public Cocos2dxGLSurfaceView onCreateView()
    {
        MCLog.v("Cocos2dxGLSurfaceView onCreateView", new Object[0]);
        Cocos2dxGLSurfaceView cocos2dxglsurfaceview = super.onCreateView();
        PluginWrapper.init(this);
        PluginWrapper.setGLSurfaceView(cocos2dxglsurfaceview);
        return cocos2dxglsurfaceview;
    }

    protected void onDestroy()
    {
        MCLog.v("onDestroy", new Object[0]);
        super.onDestroy();
    }

    protected void onPause()
    {
        MCLog.v("onPause", new Object[0]);
        super.onPause();
        SmartBeat.notifyOnPause(this);
    }

    protected void onResume()
    {
        MCLog.v("onResume", new Object[0]);
        super.onResume();
        AnalyticsManager.sendStartSession(this);
        SmartBeat.notifyOnResume(this);
    }

    private static Cocos2dxActivity _myActivity;
}
