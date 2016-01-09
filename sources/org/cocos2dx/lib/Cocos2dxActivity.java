// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.lib;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.*;
import android.util.Log;
import android.view.ScaleGestureDetector;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package org.cocos2dx.lib:
//            Cocos2dxEditText, Cocos2dxGLSurfaceView, Cocos2dxRenderer, Cocos2dxHelper, 
//            Cocos2dxHandler, Cocos2dxVideoHelper

public abstract class Cocos2dxActivity extends Activity
    implements Cocos2dxHelper.Cocos2dxHelperListener
{

    public Cocos2dxActivity()
    {
        mVideoHelper = null;
        mFrameLayout = null;
    }

    public static Context getContext()
    {
        return sContext;
    }

    private static final boolean isAndroidEmulator()
    {
        String s = Build.MODEL;
        Log.d(TAG, (new StringBuilder()).append("model=").append(s).toString());
        s = Build.PRODUCT;
        Log.d(TAG, (new StringBuilder()).append("product=").append(s).toString());
        boolean flag = false;
        if(s != null)
            if(s.equals("sdk") || s.contains("_sdk") || s.contains("sdk_"))
                flag = true;
            else
                flag = false;
        Log.d(TAG, (new StringBuilder()).append("isEmulator=").append(flag).toString());
        return flag;
    }

    public void init()
    {
        android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-1, -1);
        mFrameLayout = new FrameLayout(this);
        mFrameLayout.setLayoutParams(layoutparams);
        layoutparams = new android.view.ViewGroup.LayoutParams(-1, -2);
        Cocos2dxEditText cocos2dxedittext = new Cocos2dxEditText(this);
        cocos2dxedittext.setLayoutParams(layoutparams);
        mFrameLayout.addView(cocos2dxedittext);
        mGLSurfaceView = onCreateView();
        mFrameLayout.addView(mGLSurfaceView);
        if(isAndroidEmulator())
            mGLSurfaceView.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        mGLSurfaceView.setCocos2dxRenderer(new Cocos2dxRenderer());
        mGLSurfaceView.setCocos2dxEditText(cocos2dxedittext);
        setContentView(mFrameLayout);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        for(Iterator iterator = Cocos2dxHelper.getOnActivityResultListeners().iterator(); iterator.hasNext(); ((android.preference.PreferenceManager.OnActivityResultListener)iterator.next()).onActivityResult(i, j, intent));
        super.onActivityResult(i, j, intent);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        onLoadNativeLibraries();
        sContext = this;
        mHandler = new Cocos2dxHandler(this);
        Cocos2dxHelper.init(this);
        init();
        if(mVideoHelper == null)
            mVideoHelper = new Cocos2dxVideoHelper(this, mFrameLayout);
    }

    public Cocos2dxGLSurfaceView onCreateView()
    {
        Cocos2dxGLSurfaceView cocos2dxglsurfaceview = new Cocos2dxGLSurfaceView(this);
        cocos2dxglsurfaceview.setEGLConfigChooser(5, 6, 5, 0, 16, 8);
        return cocos2dxglsurfaceview;
    }

    protected void onDestroy()
    {
        super.onDestroy();
    }

    protected void onLoadNativeLibraries()
    {
        try
        {
            System.loadLibrary(getPackageManager().getApplicationInfo(getPackageName(), 128).metaData.getString("android.app.lib_name"));
            return;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    protected void onPause()
    {
        super.onPause();
        Cocos2dxHelper.onPause();
        mGLSurfaceView.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        Cocos2dxHelper.onResume();
        mGLSurfaceView.onResume();
    }

    public void runOnGLThread(Runnable runnable)
    {
        mGLSurfaceView.queueEvent(runnable);
    }

    public void setKeepScreenOn(final boolean newValue)
    {
        runOnUiThread(new Runnable() {

            public void run()
            {
                mGLSurfaceView.setKeepScreenOn(newValue);
            }

            final Cocos2dxActivity this$0;
            final boolean val$newValue;

            
            {
                this$0 = Cocos2dxActivity.this;
                newValue = flag;
                super();
            }
        }
);
    }

    public void setScaleGestureDetector(ScaleGestureDetector scalegesturedetector)
    {
        mGLSurfaceView.setScaleGestureDetector(scalegesturedetector);
    }

    public void showDialog(String s, String s1)
    {
        Message message = new Message();
        message.what = 1;
        message.obj = new Cocos2dxHandler.DialogMessage(s, s1);
        mHandler.sendMessage(message);
    }

    public void showEditTextDialog(String s, String s1, int i, int j, int k, int l, int i1)
    {
        Message message = new Message();
        message.what = 2;
        message.obj = new Cocos2dxHandler.EditBoxMessage(s, s1, i, j, k, l, i1);
        mHandler.sendMessage(message);
    }

    private static final String TAG = org/cocos2dx/lib/Cocos2dxActivity.getSimpleName();
    private static Cocos2dxActivity sContext = null;
    protected FrameLayout mFrameLayout;
    private Cocos2dxGLSurfaceView mGLSurfaceView;
    private Cocos2dxHandler mHandler;
    private Cocos2dxVideoHelper mVideoHelper;


}
