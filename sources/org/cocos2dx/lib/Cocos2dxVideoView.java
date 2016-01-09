// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.lib;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.*;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.*;
import java.io.IOException;
import java.util.Map;

// Referenced classes of package org.cocos2dx.lib:
//            Cocos2dxActivity

public class Cocos2dxVideoView extends SurfaceView
    implements android.widget.MediaController.MediaPlayerControl
{
    public static interface OnVideoEventListener
    {

        public abstract void onVideoEvent(int i, int j);
    }


    public Cocos2dxVideoView(Cocos2dxActivity cocos2dxactivity, int i)
    {
        super(cocos2dxactivity);
        TAG = "VideoView";
        mCurrentState = 0;
        mTargetState = 0;
        mSurfaceHolder = null;
        mMediaPlayer = null;
        mVideoWidth = 0;
        mVideoHeight = 0;
        mCocos2dxActivity = null;
        mViewLeft = 0;
        mViewTop = 0;
        mViewWidth = 0;
        mViewHeight = 0;
        mVisibleLeft = 0;
        mVisibleTop = 0;
        mVisibleWidth = 0;
        mVisibleHeight = 0;
        mFullScreenEnabled = false;
        mFullScreenWidth = 0;
        mFullScreenHeight = 0;
        mViewTag = 0;
        mNeedResume = false;
        isAssetRouse = false;
        fileName = null;
        mKeepRatio = false;
        mSizeChangedListener = new android.media.MediaPlayer.OnVideoSizeChangedListener() {

            public void onVideoSizeChanged(MediaPlayer mediaplayer, int j, int k)
            {
                mVideoWidth = mediaplayer.getVideoWidth();
                mVideoHeight = mediaplayer.getVideoHeight();
                if(mVideoWidth != 0 && mVideoHeight != 0)
                    getHolder().setFixedSize(mVideoWidth, mVideoHeight);
            }

            final Cocos2dxVideoView this$0;

            
            {
                this$0 = Cocos2dxVideoView.this;
                super();
            }
        }
;
        mPreparedListener = new android.media.MediaPlayer.OnPreparedListener() {

            public void onPrepared(MediaPlayer mediaplayer)
            {
                mCurrentState = 2;
                if(mOnPreparedListener != null)
                    mOnPreparedListener.onPrepared(mMediaPlayer);
                mVideoWidth = mediaplayer.getVideoWidth();
                mVideoHeight = mediaplayer.getVideoHeight();
                int j = mSeekWhenPrepared;
                if(j != 0)
                    seekTo(j);
                if(mVideoWidth != 0 && mVideoHeight != 0)
                    fixSize();
                if(mTargetState == 3)
                    start();
            }

            final Cocos2dxVideoView this$0;

            
            {
                this$0 = Cocos2dxVideoView.this;
                super();
            }
        }
;
        mCompletionListener = new android.media.MediaPlayer.OnCompletionListener() {

            public void onCompletion(MediaPlayer mediaplayer)
            {
                mCurrentState = 5;
                mTargetState = 5;
                release(true);
                if(mOnVideoEventListener != null)
                    mOnVideoEventListener.onVideoEvent(mViewTag, 3);
            }

            final Cocos2dxVideoView this$0;

            
            {
                this$0 = Cocos2dxVideoView.this;
                super();
            }
        }
;
        mErrorListener = new android.media.MediaPlayer.OnErrorListener() {

            public boolean onError(MediaPlayer mediaplayer, int j, int k)
            {
                Log.d(TAG, (new StringBuilder()).append("Error: ").append(j).append(",").append(k).toString());
                mCurrentState = -1;
                mTargetState = -1;
                while(mOnErrorListener != null && mOnErrorListener.onError(mMediaPlayer, j, k) || getWindowToken() == null) 
                    return true;
                mediaplayer = mCocos2dxActivity.getResources();
                int l;
                if(j == 200)
                    j = mediaplayer.getIdentifier("VideoView_error_text_invalid_progressive_playback", "string", "android");
                else
                    j = mediaplayer.getIdentifier("VideoView_error_text_unknown", "string", "android");
                k = mediaplayer.getIdentifier("VideoView_error_title", "string", "android");
                l = mediaplayer.getIdentifier("VideoView_error_button", "string", "android");
                (new android.app.AlertDialog.Builder(mCocos2dxActivity)).setTitle(mediaplayer.getString(k)).setMessage(j).setPositiveButton(mediaplayer.getString(l), new android.content.DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        if(mOnVideoEventListener != null)
                            mOnVideoEventListener.onVideoEvent(mViewTag, 3);
                    }

                    final _cls4 this$1;

            
            {
                this$1 = _cls4.this;
                super();
            }
                }
).setCancelable(false).show();
                return true;
            }

            final Cocos2dxVideoView this$0;

            
            {
                this$0 = Cocos2dxVideoView.this;
                super();
            }
        }
;
        mBufferingUpdateListener = new android.media.MediaPlayer.OnBufferingUpdateListener() {

            public void onBufferingUpdate(MediaPlayer mediaplayer, int j)
            {
                mCurrentBufferPercentage = j;
            }

            final Cocos2dxVideoView this$0;

            
            {
                this$0 = Cocos2dxVideoView.this;
                super();
            }
        }
;
        mSHCallback = new android.view.SurfaceHolder.Callback() {

            public void surfaceChanged(SurfaceHolder surfaceholder, int j, int k, int l)
            {
                if(mTargetState == 3)
                    j = 1;
                else
                    j = 0;
                if(mVideoWidth == k && mVideoHeight == l)
                    k = 1;
                else
                    k = 0;
                if(mMediaPlayer != null && j != 0 && k != 0)
                {
                    if(mSeekWhenPrepared != 0)
                        seekTo(mSeekWhenPrepared);
                    start();
                }
            }

            public void surfaceCreated(SurfaceHolder surfaceholder)
            {
                mSurfaceHolder = surfaceholder;
                openVideo();
            }

            public void surfaceDestroyed(SurfaceHolder surfaceholder)
            {
                mSurfaceHolder = null;
                release(true);
            }

            final Cocos2dxVideoView this$0;

            
            {
                this$0 = Cocos2dxVideoView.this;
                super();
            }
        }
;
        mViewTag = i;
        mCocos2dxActivity = cocos2dxactivity;
        initVideoView();
    }

    private void initVideoView()
    {
        mVideoWidth = 0;
        mVideoHeight = 0;
        getHolder().addCallback(mSHCallback);
        setFocusable(true);
        setFocusableInTouchMode(true);
        mCurrentState = 0;
        mTargetState = 0;
    }

    private void openVideo()
    {
        if(mSurfaceHolder != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if(!isAssetRouse) goto _L4; else goto _L3
_L3:
        if(fileName == null) goto _L1; else goto _L5
_L5:
        Intent intent = new Intent("com.android.music.musicservicecommand");
        intent.putExtra("command", "pause");
        mCocos2dxActivity.sendBroadcast(intent);
        release(false);
        mMediaPlayer = new MediaPlayer();
        mMediaPlayer.setOnPreparedListener(mPreparedListener);
        mMediaPlayer.setOnVideoSizeChangedListener(mSizeChangedListener);
        mMediaPlayer.setOnCompletionListener(mCompletionListener);
        mMediaPlayer.setOnErrorListener(mErrorListener);
        mMediaPlayer.setOnBufferingUpdateListener(mBufferingUpdateListener);
        mMediaPlayer.setDisplay(mSurfaceHolder);
        mMediaPlayer.setAudioStreamType(3);
        mMediaPlayer.setScreenOnWhilePlaying(true);
        mDuration = -1;
        mCurrentBufferPercentage = 0;
        if(!isAssetRouse)
            break MISSING_BLOCK_LABEL_279;
        AssetFileDescriptor assetfiledescriptor = mCocos2dxActivity.getAssets().openFd(fileName);
        mMediaPlayer.setDataSource(assetfiledescriptor.getFileDescriptor(), assetfiledescriptor.getStartOffset(), assetfiledescriptor.getLength());
_L6:
        IOException ioexception;
        mMediaPlayer.prepareAsync();
        mCurrentState = 1;
        return;
_L4:
        if(mUri == null)
            return;
          goto _L5
        try
        {
            mMediaPlayer.setDataSource(mCocos2dxActivity, mUri);
        }
        // Misplaced declaration of an exception variable
        catch(IOException ioexception)
        {
            Log.w(TAG, (new StringBuilder()).append("Unable to open content: ").append(mUri).toString(), ioexception);
            mCurrentState = -1;
            mTargetState = -1;
            mErrorListener.onError(mMediaPlayer, 1, 0);
            return;
        }
        catch(IllegalArgumentException illegalargumentexception)
        {
            Log.w(TAG, (new StringBuilder()).append("Unable to open content: ").append(mUri).toString(), illegalargumentexception);
            mCurrentState = -1;
            mTargetState = -1;
            mErrorListener.onError(mMediaPlayer, 1, 0);
            return;
        }
          goto _L6
    }

    private void release(boolean flag)
    {
        if(mMediaPlayer != null)
        {
            mMediaPlayer.reset();
            mMediaPlayer.release();
            mMediaPlayer = null;
            mCurrentState = 0;
            if(flag)
                mTargetState = 0;
        }
    }

    private void setVideoURI(Uri uri, Map map)
    {
        mUri = uri;
        mSeekWhenPrepared = 0;
        mVideoWidth = 0;
        mVideoHeight = 0;
        openVideo();
        requestLayout();
        invalidate();
    }

    public boolean canPause()
    {
        return true;
    }

    public boolean canSeekBackward()
    {
        return true;
    }

    public boolean canSeekForward()
    {
        return true;
    }

    public void fixSize()
    {
        if(mFullScreenEnabled)
        {
            fixSize(0, 0, mFullScreenWidth, mFullScreenHeight);
            return;
        } else
        {
            fixSize(mViewLeft, mViewTop, mViewWidth, mVideoHeight);
            return;
        }
    }

    public void fixSize(int i, int j, int k, int l)
    {
        if(k != 0 && l != 0)
        {
            if(mKeepRatio)
            {
                android.widget.FrameLayout.LayoutParams layoutparams;
                if(mVideoWidth * l > mVideoHeight * k)
                {
                    mVisibleWidth = k;
                    mVisibleHeight = (mVideoHeight * k) / mVideoWidth;
                } else
                if(mVideoWidth * l < mVideoHeight * k)
                {
                    mVisibleWidth = (mVideoWidth * l) / mVideoHeight;
                    mVisibleHeight = l;
                }
                mVisibleLeft = (k - mVisibleWidth) / 2 + i;
                mVisibleTop = (l - mVisibleHeight) / 2 + j;
            } else
            {
                mVisibleLeft = i;
                mVisibleTop = j;
                mVisibleWidth = k;
                mVisibleHeight = l;
            }
        } else
        {
            mVisibleLeft = i;
            mVisibleTop = j;
            mVisibleWidth = mVideoWidth;
            mVisibleHeight = mVideoHeight;
        }
        getHolder().setFixedSize(mVisibleWidth, mVisibleHeight);
        layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutparams.leftMargin = mVisibleLeft;
        layoutparams.topMargin = mVisibleTop;
        setLayoutParams(layoutparams);
    }

    public int getAudioSessionId()
    {
        return mMediaPlayer.getAudioSessionId();
    }

    public int getBufferPercentage()
    {
        if(mMediaPlayer != null)
            return mCurrentBufferPercentage;
        else
            return 0;
    }

    public int getCurrentPosition()
    {
        if(isInPlaybackState())
            return mMediaPlayer.getCurrentPosition();
        else
            return 0;
    }

    public int getDuration()
    {
        if(isInPlaybackState())
        {
            if(mDuration > 0)
            {
                return mDuration;
            } else
            {
                mDuration = mMediaPlayer.getDuration();
                return mDuration;
            }
        } else
        {
            mDuration = -1;
            return mDuration;
        }
    }

    public boolean isInPlaybackState()
    {
        return mMediaPlayer != null && mCurrentState != -1 && mCurrentState != 0 && mCurrentState != 1;
    }

    public boolean isPlaying()
    {
        return isInPlaybackState() && mMediaPlayer.isPlaying();
    }

    protected void onMeasure(int i, int j)
    {
        if(mVideoWidth == 0 || mVideoHeight == 0)
        {
            setMeasuredDimension(mViewWidth, mViewHeight);
            Log.i(TAG, (new StringBuilder()).append("").append(mViewWidth).append(":").append(mViewHeight).toString());
            return;
        } else
        {
            setMeasuredDimension(mVisibleWidth, mVisibleHeight);
            Log.i(TAG, (new StringBuilder()).append("").append(mVisibleWidth).append(":").append(mVisibleHeight).toString());
            return;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if((motionevent.getAction() & 0xff) == 1)
            if(isPlaying())
                pause();
            else
            if(mCurrentState == 4)
            {
                resume();
                return true;
            }
        return true;
    }

    public void pause()
    {
        if(isInPlaybackState() && mMediaPlayer.isPlaying())
        {
            mMediaPlayer.pause();
            mCurrentState = 4;
            if(mOnVideoEventListener != null)
                mOnVideoEventListener.onVideoEvent(mViewTag, 1);
        }
        mTargetState = 4;
    }

    public int resolveAdjustedSize(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getMode(j);
        j = android.view.View.MeasureSpec.getSize(j);
        switch(k)
        {
        default:
            return i;

        case 0: // '\0'
            return i;

        case -2147483648: 
            return Math.min(i, j);

        case 1073741824: 
            return j;
        }
    }

    public void restart()
    {
        if(isInPlaybackState())
        {
            mMediaPlayer.seekTo(0);
            mMediaPlayer.start();
            mCurrentState = 3;
            mTargetState = 3;
        }
    }

    public void resume()
    {
        if(isInPlaybackState() && mCurrentState == 4)
        {
            mMediaPlayer.start();
            mCurrentState = 3;
            if(mOnVideoEventListener != null)
                mOnVideoEventListener.onVideoEvent(mViewTag, 0);
        }
    }

    public void seekTo(int i)
    {
        if(isInPlaybackState())
        {
            mMediaPlayer.seekTo(i);
            mSeekWhenPrepared = 0;
            return;
        } else
        {
            mSeekWhenPrepared = i;
            return;
        }
    }

    public void setFullScreenEnabled(boolean flag, int i, int j)
    {
        if(mFullScreenEnabled != flag)
        {
            mFullScreenEnabled = flag;
            if(i != 0 && j != 0)
            {
                mFullScreenWidth = i;
                mFullScreenHeight = j;
            }
            fixSize();
        }
    }

    public void setKeepRatio(boolean flag)
    {
        mKeepRatio = flag;
        fixSize();
    }

    public void setOnCompletionListener(OnVideoEventListener onvideoeventlistener)
    {
        mOnVideoEventListener = onvideoeventlistener;
    }

    public void setOnErrorListener(android.media.MediaPlayer.OnErrorListener onerrorlistener)
    {
        mOnErrorListener = onerrorlistener;
    }

    public void setOnPreparedListener(android.media.MediaPlayer.OnPreparedListener onpreparedlistener)
    {
        mOnPreparedListener = onpreparedlistener;
    }

    public void setVideoFileName(String s)
    {
        if(s.startsWith("/"))
        {
            isAssetRouse = false;
            setVideoURI(Uri.parse(s), null);
            return;
        } else
        {
            fileName = s;
            isAssetRouse = true;
            setVideoURI(Uri.parse(s), null);
            return;
        }
    }

    public void setVideoRect(int i, int j, int k, int l)
    {
        mViewLeft = i;
        mViewTop = j;
        mViewWidth = k;
        mViewHeight = l;
        if(mVideoWidth != 0 && mVideoHeight != 0)
            fixSize(mViewLeft, mViewTop, mViewWidth, mVideoHeight);
    }

    public void setVideoURL(String s)
    {
        isAssetRouse = false;
        setVideoURI(Uri.parse(s), null);
    }

    public void setVisibility(int i)
    {
        if(i != 4) goto _L2; else goto _L1
_L1:
        mNeedResume = isPlaying();
        if(mNeedResume)
            mSeekWhenPrepared = getCurrentPosition();
_L4:
        super.setVisibility(i);
        return;
_L2:
        if(mNeedResume)
        {
            start();
            mNeedResume = false;
        }
        if(true) goto _L4; else goto _L3
_L3:
    }

    public void start()
    {
        if(isInPlaybackState())
        {
            mMediaPlayer.start();
            mCurrentState = 3;
            if(mOnVideoEventListener != null)
                mOnVideoEventListener.onVideoEvent(mViewTag, 0);
        }
        mTargetState = 3;
    }

    public void stop()
    {
        if(isInPlaybackState() && mMediaPlayer.isPlaying())
        {
            stopPlayback();
            if(mOnVideoEventListener != null)
                mOnVideoEventListener.onVideoEvent(mViewTag, 2);
        }
    }

    public void stopPlayback()
    {
        if(mMediaPlayer != null)
        {
            mMediaPlayer.stop();
            mMediaPlayer.release();
            mMediaPlayer = null;
            mCurrentState = 0;
            mTargetState = 0;
        }
    }

    public void suspend()
    {
        release(false);
    }

    private static final int EVENT_COMPLETED = 3;
    private static final int EVENT_PAUSED = 1;
    private static final int EVENT_PLAYING = 0;
    private static final int EVENT_STOPPED = 2;
    private static final int STATE_ERROR = -1;
    private static final int STATE_IDLE = 0;
    private static final int STATE_PAUSED = 4;
    private static final int STATE_PLAYBACK_COMPLETED = 5;
    private static final int STATE_PLAYING = 3;
    private static final int STATE_PREPARED = 2;
    private static final int STATE_PREPARING = 1;
    private String TAG;
    private String fileName;
    private boolean isAssetRouse;
    private android.media.MediaPlayer.OnBufferingUpdateListener mBufferingUpdateListener;
    protected Cocos2dxActivity mCocos2dxActivity;
    private android.media.MediaPlayer.OnCompletionListener mCompletionListener;
    private int mCurrentBufferPercentage;
    private int mCurrentState;
    private int mDuration;
    private android.media.MediaPlayer.OnErrorListener mErrorListener;
    protected boolean mFullScreenEnabled;
    protected int mFullScreenHeight;
    protected int mFullScreenWidth;
    private boolean mKeepRatio;
    private MediaPlayer mMediaPlayer;
    private boolean mNeedResume;
    private android.media.MediaPlayer.OnErrorListener mOnErrorListener;
    private android.media.MediaPlayer.OnPreparedListener mOnPreparedListener;
    private OnVideoEventListener mOnVideoEventListener;
    android.media.MediaPlayer.OnPreparedListener mPreparedListener;
    android.view.SurfaceHolder.Callback mSHCallback;
    private int mSeekWhenPrepared;
    protected android.media.MediaPlayer.OnVideoSizeChangedListener mSizeChangedListener;
    private SurfaceHolder mSurfaceHolder;
    private int mTargetState;
    private Uri mUri;
    private int mVideoHeight;
    private int mVideoWidth;
    protected int mViewHeight;
    protected int mViewLeft;
    private int mViewTag;
    protected int mViewTop;
    protected int mViewWidth;
    protected int mVisibleHeight;
    protected int mVisibleLeft;
    protected int mVisibleTop;
    protected int mVisibleWidth;



/*
    static int access$002(Cocos2dxVideoView cocos2dxvideoview, int i)
    {
        cocos2dxvideoview.mVideoWidth = i;
        return i;
    }

*/




/*
    static int access$102(Cocos2dxVideoView cocos2dxvideoview, int i)
    {
        cocos2dxvideoview.mVideoHeight = i;
        return i;
    }

*/



/*
    static int access$1202(Cocos2dxVideoView cocos2dxvideoview, int i)
    {
        cocos2dxvideoview.mCurrentBufferPercentage = i;
        return i;
    }

*/


/*
    static SurfaceHolder access$1302(Cocos2dxVideoView cocos2dxvideoview, SurfaceHolder surfaceholder)
    {
        cocos2dxvideoview.mSurfaceHolder = surfaceholder;
        return surfaceholder;
    }

*/



/*
    static int access$202(Cocos2dxVideoView cocos2dxvideoview, int i)
    {
        cocos2dxvideoview.mCurrentState = i;
        return i;
    }

*/






/*
    static int access$602(Cocos2dxVideoView cocos2dxvideoview, int i)
    {
        cocos2dxvideoview.mTargetState = i;
        return i;
    }

*/



}
