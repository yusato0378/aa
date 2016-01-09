// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.mcraft.cocos2dx;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.*;
import android.webkit.*;
import android.widget.*;
import java.util.concurrent.*;
import org.cocos2dx.lib.Cocos2dxActivity;

// Referenced classes of package com.mcraft.cocos2dx:
//            WebViewHelperAndroid

public class WebViewAndroid
{

    public WebViewAndroid(int i)
    {
        mNativeInstanceId = i;
        mActivity = (Cocos2dxActivity)Cocos2dxActivity.getContext();
        mParentView = (ViewGroup)mActivity.getWindow().getDecorView().findViewById(0x1020002);
        mActivity.runOnUiThread(new Runnable() {

            public void run()
            {
                mLayout = new RelativeLayout(mActivity);
                mLayout.setGravity(83);
                android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1);
                mParentView.addView(mLayout, layoutparams);
                initWebView();
            }

            final WebViewAndroid this$0;

            
            {
                this$0 = WebViewAndroid.this;
                super();
            }
        }
);
    }

    private native void didFailLoad(int i, int j);

    private native void didFinishLoad(int i);

    private native void didStartLoad(int i);

    private void initWebView()
    {
        WebView webview = new WebView(mActivity) {

            public boolean onKeyDown(int i, KeyEvent keyevent)
            {
                if(keyevent.getAction() != 0)
                    throw new AssertionError();
                if(i == 4)
                {
                    if(canGoBack())
                        goBack();
                    return true;
                } else
                {
                    return super.onKeyDown(i, keyevent);
                }
            }

            final WebViewAndroid this$0;

            
            {
                this$0 = WebViewAndroid.this;
                super(context);
            }
        }
;
        webview.setScrollBarStyle(0);
        webview.setWebChromeClient(new WebChromeClient());
        webview.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView webview1, String s)
            {
                if(mIndicator != null)
                    mIndicator.setVisibility(8);
                mActivity.runOnGLThread(new Runnable() {

                    public void run()
                    {
                        didFinishLoad(mNativeInstanceId);
                    }

                    final _cls3 this$1;

            
            {
                this$1 = _cls3.this;
                super();
            }
                }
);
            }

            public void onPageStarted(WebView webview1, String s, Bitmap bitmap)
            {
                if(mPlatformIndicatorEnabled)
                {
                    if(mIndicator == null)
                    {
                        mIndicator = new ProgressBar(mActivity, null, 0x101007a);
                        webview1 = new FrameLayout(mActivity);
                        webview1.addView(mIndicator, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
                        mWebView.addView(webview1, new android.view.ViewGroup.LayoutParams(-1, -1));
                    }
                    mIndicator.setVisibility(0);
                }
                mActivity.runOnGLThread(new Runnable() {

                    public void run()
                    {
                        didStartLoad(mNativeInstanceId);
                    }

                    final _cls3 this$1;

            
            {
                this$1 = _cls3.this;
                super();
            }
                }
);
            }

            public void onReceivedError(WebView webview1, int i, String s, String s1)
            {
                if(mIndicator != null)
                    mIndicator.setVisibility(8);
                mActivity.runOnGLThread(new Runnable() {

                    public void run()
                    {
                        didFailLoad(mNativeInstanceId, 0);
                    }

                    final _cls3 this$1;

            
            {
                this$1 = _cls3.this;
                super();
            }
                }
);
            }

            public boolean shouldOverrideUrlLoading(WebView webview1, String s)
            {
                webview1 = new FutureTask(s. new Callable() {

                    public Boolean call()
                        throws Exception
                    {
                        return Boolean.valueOf(shouldStartLoad(mNativeInstanceId, url));
                    }

                    public volatile Object call()
                        throws Exception
                    {
                        return call();
                    }

                    final _cls3 this$1;
                    final String val$url;

            
            {
                this$1 = final__pcls3;
                url = String.this;
                super();
            }
                }
);
                mActivity.runOnGLThread(webview1);
                boolean flag;
                try
                {
                    flag = ((Boolean)webview1.get()).booleanValue();
                }
                // Misplaced declaration of an exception variable
                catch(WebView webview1)
                {
                    return false;
                }
                // Misplaced declaration of an exception variable
                catch(WebView webview1)
                {
                    return false;
                }
                return !flag;
            }

            final WebViewAndroid this$0;

            
            {
                this$0 = WebViewAndroid.this;
                super();
            }
        }
);
        Object obj = webview.getSettings();
        ((WebSettings) (obj)).setSupportZoom(false);
        ((WebSettings) (obj)).setJavaScriptEnabled(true);
        ((WebSettings) (obj)).setLoadWithOverviewMode(true);
        ((WebSettings) (obj)).setUseWideViewPort(true);
        ((WebSettings) (obj)).setUserAgentString(WebViewHelperAndroid.getDefaultUserAgent());
        obj = new android.widget.RelativeLayout.LayoutParams(0, 0);
        mLayout.addView(webview, ((android.view.ViewGroup.LayoutParams) (obj)));
        mWebView = webview;
    }

    public static void initialize()
    {
        if(!sClassLoaded)
        {
            if(!nativeInit())
                throw new RuntimeException("native init failed");
            sClassLoaded = true;
        }
    }

    private static native boolean nativeInit();

    private native boolean shouldStartLoad(int i, String s);

    public boolean canGoBack()
    {
        return mWebView.canGoBack();
    }

    public void dismiss()
    {
        mActivity.runOnUiThread(new Runnable() {

            public void run()
            {
                mWebView.destroy();
                mParentView.removeView(mLayout);
            }

            final WebViewAndroid this$0;

            
            {
                this$0 = WebViewAndroid.this;
                super();
            }
        }
);
    }

    public void execJavaScript(String s)
    {
        loadUrl((new StringBuilder()).append("javascript:").append(s).toString());
    }

    public void goBack()
    {
        mActivity.runOnUiThread(new Runnable() {

            public void run()
            {
                mWebView.goBack();
            }

            final WebViewAndroid this$0;

            
            {
                this$0 = WebViewAndroid.this;
                super();
            }
        }
);
    }

    public boolean isPlatformIndicatorEnabled()
    {
        return mPlatformIndicatorEnabled;
    }

    public void loadUrl(final String url)
    {
        mActivity.runOnUiThread(new Runnable() {

            public void run()
            {
                mWebView.loadUrl(url);
            }

            final WebViewAndroid this$0;
            final String val$url;

            
            {
                this$0 = WebViewAndroid.this;
                url = s;
                super();
            }
        }
);
    }

    public void reload()
    {
        mActivity.runOnUiThread(new Runnable() {

            public void run()
            {
                mWebView.reload();
            }

            final WebViewAndroid this$0;

            
            {
                this$0 = WebViewAndroid.this;
                super();
            }
        }
);
    }

    public void setContentSize(final float width, final float height)
    {
        mActivity.runOnUiThread(new Runnable() {

            public void run()
            {
                android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)mWebView.getLayoutParams();
                layoutparams.width = (int)width;
                layoutparams.height = (int)height;
                mLayout.updateViewLayout(mWebView, layoutparams);
            }

            final WebViewAndroid this$0;
            final float val$height;
            final float val$width;

            
            {
                this$0 = WebViewAndroid.this;
                width = f;
                height = f1;
                super();
            }
        }
);
    }

    public void setPlatformIndicatorEnabled(boolean flag)
    {
        mPlatformIndicatorEnabled = flag;
    }

    public void setVisible(final boolean visible)
    {
        mActivity.runOnUiThread(new Runnable() {

            public void run()
            {
                RelativeLayout relativelayout = mLayout;
                int i;
                if(visible)
                    i = 0;
                else
                    i = 8;
                relativelayout.setVisibility(i);
            }

            final WebViewAndroid this$0;
            final boolean val$visible;

            
            {
                this$0 = WebViewAndroid.this;
                visible = flag;
                super();
            }
        }
);
    }

    public void transform(float f, float f1, float f2, float f3, final float tx, final float ty)
    {
        mActivity.runOnUiThread(new Runnable() {

            public void run()
            {
                android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)mWebView.getLayoutParams();
                layoutparams.setMargins((int)tx, 0, 0, (int)ty);
                mLayout.updateViewLayout(mWebView, layoutparams);
            }

            final WebViewAndroid this$0;
            final float val$tx;
            final float val$ty;

            
            {
                this$0 = WebViewAndroid.this;
                tx = f;
                ty = f1;
                super();
            }
        }
);
    }

    private static boolean sClassLoaded;
    private Cocos2dxActivity mActivity;
    private ProgressBar mIndicator;
    private RelativeLayout mLayout;
    private boolean mLoading;
    private int mNativeInstanceId;
    private ViewGroup mParentView;
    private boolean mPlatformIndicatorEnabled;
    private WebView mWebView;

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



/*
    static RelativeLayout access$002(WebViewAndroid webviewandroid, RelativeLayout relativelayout)
    {
        webviewandroid.mLayout = relativelayout;
        return relativelayout;
    }

*/











/*
    static ProgressBar access$702(WebViewAndroid webviewandroid, ProgressBar progressbar)
    {
        webviewandroid.mIndicator = progressbar;
        return progressbar;
    }

*/


}
