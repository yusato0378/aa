// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.lib;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

// Referenced classes of package org.cocos2dx.lib:
//            Cocos2dxVideoView, Cocos2dxActivity

public class Cocos2dxVideoHelper
{
    private class VideoEventRunnable
        implements Runnable
    {

        public void run()
        {
            Cocos2dxVideoHelper.nativeExecuteVideoCallback(mVideoTag, mVideoEvent);
        }

        private int mVideoEvent;
        private int mVideoTag;
        final Cocos2dxVideoHelper this$0;

        public VideoEventRunnable(int i, int j)
        {
            this$0 = Cocos2dxVideoHelper.this;
            super();
            mVideoTag = i;
            mVideoEvent = j;
        }
    }

    static class VideoHandler extends Handler
    {

        public void handleMessage(Message message)
        {
            message.what;
            JVM INSTR lookupswitch 14: default 128
        //                       0: 134
        //                       1: 154
        //                       2: 174
        //                       3: 225
        //                       4: 205
        //                       5: 338
        //                       6: 358
        //                       7: 378
        //                       8: 398
        //                       9: 422
        //                       10: 465
        //                       11: 485
        //                       12: 271
        //                       1000: 528;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
            super.handleMessage(message);
            return;
_L2:
            ((Cocos2dxVideoHelper)mReference.get())._createVideoView(message.arg1);
            continue; /* Loop/switch isn't completed */
_L3:
            ((Cocos2dxVideoHelper)mReference.get())._removeVideoView(message.arg1);
            continue; /* Loop/switch isn't completed */
_L4:
            ((Cocos2dxVideoHelper)mReference.get())._setVideoURL(message.arg1, message.arg2, (String)message.obj);
            continue; /* Loop/switch isn't completed */
_L6:
            ((Cocos2dxVideoHelper)mReference.get())._startVideo(message.arg1);
            continue; /* Loop/switch isn't completed */
_L5:
            Cocos2dxVideoHelper cocos2dxvideohelper = (Cocos2dxVideoHelper)mReference.get();
            Rect rect = (Rect)message.obj;
            cocos2dxvideohelper._setVideoRect(message.arg1, rect.left, rect.top, rect.right, rect.bottom);
            continue; /* Loop/switch isn't completed */
_L14:
            Cocos2dxVideoHelper cocos2dxvideohelper1 = (Cocos2dxVideoHelper)mReference.get();
            Rect rect1 = (Rect)message.obj;
            if(message.arg2 == 1)
                cocos2dxvideohelper1._setFullScreenEnabled(message.arg1, true, rect1.right, rect1.bottom);
            else
                cocos2dxvideohelper1._setFullScreenEnabled(message.arg1, false, rect1.right, rect1.bottom);
            continue; /* Loop/switch isn't completed */
_L7:
            ((Cocos2dxVideoHelper)mReference.get())._pauseVideo(message.arg1);
            continue; /* Loop/switch isn't completed */
_L8:
            ((Cocos2dxVideoHelper)mReference.get())._resumeVideo(message.arg1);
            continue; /* Loop/switch isn't completed */
_L9:
            ((Cocos2dxVideoHelper)mReference.get())._stopVideo(message.arg1);
            continue; /* Loop/switch isn't completed */
_L10:
            ((Cocos2dxVideoHelper)mReference.get())._seekVideoTo(message.arg1, message.arg2);
            continue; /* Loop/switch isn't completed */
_L11:
            Cocos2dxVideoHelper cocos2dxvideohelper2 = (Cocos2dxVideoHelper)mReference.get();
            if(message.arg2 == 1)
                cocos2dxvideohelper2._setVideoVisible(message.arg1, true);
            else
                cocos2dxvideohelper2._setVideoVisible(message.arg1, false);
            continue; /* Loop/switch isn't completed */
_L12:
            ((Cocos2dxVideoHelper)mReference.get())._restartVideo(message.arg1);
            continue; /* Loop/switch isn't completed */
_L13:
            Cocos2dxVideoHelper cocos2dxvideohelper3 = (Cocos2dxVideoHelper)mReference.get();
            if(message.arg2 == 1)
                cocos2dxvideohelper3._setVideoKeepRatio(message.arg1, true);
            else
                cocos2dxvideohelper3._setVideoKeepRatio(message.arg1, false);
            continue; /* Loop/switch isn't completed */
_L15:
            ((Cocos2dxVideoHelper)mReference.get()).onBackKeyEvent();
            if(true) goto _L1; else goto _L16
_L16:
        }

        WeakReference mReference;

        VideoHandler(Cocos2dxVideoHelper cocos2dxvideohelper)
        {
            mReference = new WeakReference(cocos2dxvideohelper);
        }
    }


    Cocos2dxVideoHelper(Cocos2dxActivity cocos2dxactivity, FrameLayout framelayout)
    {
        mLayout = null;
        mActivity = null;
        sVideoViews = null;
        videoEventListener = new Cocos2dxVideoView.OnVideoEventListener() {

            public void onVideoEvent(int i, int j)
            {
                mActivity.runOnGLThread(new VideoEventRunnable(i, j));
            }

            final Cocos2dxVideoHelper this$0;

            
            {
                this$0 = Cocos2dxVideoHelper.this;
                super();
            }
        }
;
        mActivity = cocos2dxactivity;
        mLayout = framelayout;
        mVideoHandler = new VideoHandler(this);
        sVideoViews = new SparseArray();
    }

    private void _createVideoView(int i)
    {
        Cocos2dxVideoView cocos2dxvideoview = new Cocos2dxVideoView(mActivity, i);
        sVideoViews.put(i, cocos2dxvideoview);
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        mLayout.addView(cocos2dxvideoview, layoutparams);
        cocos2dxvideoview.setZOrderOnTop(true);
        cocos2dxvideoview.setOnCompletionListener(videoEventListener);
    }

    private void _pauseVideo(int i)
    {
        Cocos2dxVideoView cocos2dxvideoview = (Cocos2dxVideoView)sVideoViews.get(i);
        if(cocos2dxvideoview != null)
            cocos2dxvideoview.pause();
    }

    private void _removeVideoView(int i)
    {
        Cocos2dxVideoView cocos2dxvideoview = (Cocos2dxVideoView)sVideoViews.get(i);
        if(cocos2dxvideoview != null)
        {
            cocos2dxvideoview.stopPlayback();
            sVideoViews.remove(i);
            mLayout.removeView(cocos2dxvideoview);
        }
    }

    private void _restartVideo(int i)
    {
        Cocos2dxVideoView cocos2dxvideoview = (Cocos2dxVideoView)sVideoViews.get(i);
        if(cocos2dxvideoview != null)
            cocos2dxvideoview.restart();
    }

    private void _resumeVideo(int i)
    {
        Cocos2dxVideoView cocos2dxvideoview = (Cocos2dxVideoView)sVideoViews.get(i);
        if(cocos2dxvideoview != null)
            cocos2dxvideoview.resume();
    }

    private void _seekVideoTo(int i, int j)
    {
        Cocos2dxVideoView cocos2dxvideoview = (Cocos2dxVideoView)sVideoViews.get(i);
        if(cocos2dxvideoview != null)
            cocos2dxvideoview.seekTo(j);
    }

    private void _setFullScreenEnabled(int i, boolean flag, int j, int k)
    {
        Cocos2dxVideoView cocos2dxvideoview = (Cocos2dxVideoView)sVideoViews.get(i);
        if(cocos2dxvideoview != null)
            cocos2dxvideoview.setFullScreenEnabled(flag, j, k);
    }

    private void _setVideoKeepRatio(int i, boolean flag)
    {
        Cocos2dxVideoView cocos2dxvideoview = (Cocos2dxVideoView)sVideoViews.get(i);
        if(cocos2dxvideoview != null)
            cocos2dxvideoview.setKeepRatio(flag);
    }

    private void _setVideoRect(int i, int j, int k, int l, int i1)
    {
        Cocos2dxVideoView cocos2dxvideoview = (Cocos2dxVideoView)sVideoViews.get(i);
        if(cocos2dxvideoview != null)
            cocos2dxvideoview.setVideoRect(j, k, l, i1);
    }

    private void _setVideoURL(int i, int j, String s)
    {
        Cocos2dxVideoView cocos2dxvideoview = (Cocos2dxVideoView)sVideoViews.get(i);
        if(cocos2dxvideoview == null) goto _L2; else goto _L1
_L1:
        j;
        JVM INSTR tableswitch 0 1: default 40
    //                   0 41
    //                   1 48;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        cocos2dxvideoview.setVideoFileName(s);
        return;
_L4:
        cocos2dxvideoview.setVideoURL(s);
        return;
    }

    private void _setVideoVisible(int i, boolean flag)
    {
        Cocos2dxVideoView cocos2dxvideoview;
label0:
        {
            cocos2dxvideoview = (Cocos2dxVideoView)sVideoViews.get(i);
            if(cocos2dxvideoview != null)
            {
                if(!flag)
                    break label0;
                cocos2dxvideoview.fixSize();
                cocos2dxvideoview.setVisibility(0);
            }
            return;
        }
        cocos2dxvideoview.setVisibility(4);
    }

    private void _startVideo(int i)
    {
        Cocos2dxVideoView cocos2dxvideoview = (Cocos2dxVideoView)sVideoViews.get(i);
        if(cocos2dxvideoview != null)
            cocos2dxvideoview.start();
    }

    private void _stopVideo(int i)
    {
        Cocos2dxVideoView cocos2dxvideoview = (Cocos2dxVideoView)sVideoViews.get(i);
        if(cocos2dxvideoview != null)
            cocos2dxvideoview.stop();
    }

    public static int createVideoWidget()
    {
        Message message = new Message();
        message.what = 0;
        message.arg1 = videoTag;
        mVideoHandler.sendMessage(message);
        int i = videoTag;
        videoTag = i + 1;
        return i;
    }

    public static native void nativeExecuteVideoCallback(int i, int j);

    private void onBackKeyEvent()
    {
        int j = sVideoViews.size();
        for(int i = 0; i < j; i++)
        {
            int k = sVideoViews.keyAt(i);
            Cocos2dxVideoView cocos2dxvideoview = (Cocos2dxVideoView)sVideoViews.get(k);
            if(cocos2dxvideoview != null)
            {
                cocos2dxvideoview.setFullScreenEnabled(false, 0, 0);
                mActivity.runOnGLThread(new VideoEventRunnable(k, 1000));
            }
        }

    }

    public static void pauseVideo(int i)
    {
        Message message = new Message();
        message.what = 5;
        message.arg1 = i;
        mVideoHandler.sendMessage(message);
    }

    public static void removeVideoWidget(int i)
    {
        Message message = new Message();
        message.what = 1;
        message.arg1 = i;
        mVideoHandler.sendMessage(message);
    }

    public static void restartVideo(int i)
    {
        Message message = new Message();
        message.what = 10;
        message.arg1 = i;
        mVideoHandler.sendMessage(message);
    }

    public static void resumeVideo(int i)
    {
        Message message = new Message();
        message.what = 6;
        message.arg1 = i;
        mVideoHandler.sendMessage(message);
    }

    public static void seekVideoTo(int i, int j)
    {
        Message message = new Message();
        message.what = 8;
        message.arg1 = i;
        message.arg2 = j;
        mVideoHandler.sendMessage(message);
    }

    public static void setFullScreenEnabled(int i, boolean flag, int j, int k)
    {
        Message message = new Message();
        message.what = 12;
        message.arg1 = i;
        if(flag)
            message.arg2 = 1;
        else
            message.arg2 = 0;
        message.obj = new Rect(0, 0, j, k);
        mVideoHandler.sendMessage(message);
    }

    public static void setVideoKeepRatioEnabled(int i, boolean flag)
    {
        Message message = new Message();
        message.what = 11;
        message.arg1 = i;
        if(flag)
            message.arg2 = 1;
        else
            message.arg2 = 0;
        mVideoHandler.sendMessage(message);
    }

    public static void setVideoRect(int i, int j, int k, int l, int i1)
    {
        Message message = new Message();
        message.what = 3;
        message.arg1 = i;
        message.obj = new Rect(j, k, l, i1);
        mVideoHandler.sendMessage(message);
    }

    public static void setVideoUrl(int i, int j, String s)
    {
        Message message = new Message();
        message.what = 2;
        message.arg1 = i;
        message.arg2 = j;
        message.obj = s;
        mVideoHandler.sendMessage(message);
    }

    public static void setVideoVisible(int i, boolean flag)
    {
        Message message = new Message();
        message.what = 9;
        message.arg1 = i;
        if(flag)
            message.arg2 = 1;
        else
            message.arg2 = 0;
        mVideoHandler.sendMessage(message);
    }

    public static void startVideo(int i)
    {
        Message message = new Message();
        message.what = 4;
        message.arg1 = i;
        mVideoHandler.sendMessage(message);
    }

    public static void stopVideo(int i)
    {
        Message message = new Message();
        message.what = 7;
        message.arg1 = i;
        mVideoHandler.sendMessage(message);
    }

    static final int KeyEventBack = 1000;
    private static final int VideoTaskCreate = 0;
    private static final int VideoTaskFullScreen = 12;
    private static final int VideoTaskKeepRatio = 11;
    private static final int VideoTaskPause = 5;
    private static final int VideoTaskRemove = 1;
    private static final int VideoTaskRestart = 10;
    private static final int VideoTaskResume = 6;
    private static final int VideoTaskSeek = 8;
    private static final int VideoTaskSetRect = 3;
    private static final int VideoTaskSetSource = 2;
    private static final int VideoTaskSetVisible = 9;
    private static final int VideoTaskStart = 4;
    private static final int VideoTaskStop = 7;
    static VideoHandler mVideoHandler = null;
    private static int videoTag = 0;
    private Cocos2dxActivity mActivity;
    private FrameLayout mLayout;
    private SparseArray sVideoViews;
    Cocos2dxVideoView.OnVideoEventListener videoEventListener;
















}
