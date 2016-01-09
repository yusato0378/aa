// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.lib;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.util.Log;
import java.io.FileInputStream;

public class Cocos2dxMusic
{

    public Cocos2dxMusic(Context context)
    {
        mManualPaused = false;
        mContext = context;
        initData();
    }

    private MediaPlayer createMediaplayer(String s)
    {
        MediaPlayer mediaplayer = new MediaPlayer();
        if(!s.startsWith("/"))
            break MISSING_BLOCK_LABEL_56;
        s = new FileInputStream(s);
        mediaplayer.setDataSource(s.getFD());
        s.close();
_L1:
        mediaplayer.prepare();
        mediaplayer.setVolume(mLeftVolume, mRightVolume);
        return mediaplayer;
        try
        {
            s = mContext.getAssets().openFd(s);
            mediaplayer.setDataSource(s.getFileDescriptor(), s.getStartOffset(), s.getLength());
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            Log.e(TAG, (new StringBuilder()).append("error: ").append(s.getMessage()).toString(), s);
            return null;
        }
          goto _L1
    }

    private void initData()
    {
        mLeftVolume = 0.5F;
        mRightVolume = 0.5F;
        mBackgroundMediaPlayer = null;
        mPaused = false;
        mCurrentPath = null;
    }

    public void end()
    {
        if(mBackgroundMediaPlayer != null)
            mBackgroundMediaPlayer.release();
        initData();
    }

    public float getBackgroundVolume()
    {
        if(mBackgroundMediaPlayer != null)
            return (mLeftVolume + mRightVolume) / 2.0F;
        else
            return 0.0F;
    }

    public boolean isBackgroundMusicPlaying()
    {
        if(mBackgroundMediaPlayer == null)
            return false;
        else
            return mBackgroundMediaPlayer.isPlaying();
    }

    public void onEnterBackground()
    {
        if(mBackgroundMediaPlayer != null && mBackgroundMediaPlayer.isPlaying())
        {
            mBackgroundMediaPlayer.pause();
            mPaused = true;
        }
    }

    public void onEnterForeground()
    {
        if(!mManualPaused && mBackgroundMediaPlayer != null && mPaused)
        {
            mBackgroundMediaPlayer.start();
            mPaused = false;
        }
    }

    public void pauseBackgroundMusic()
    {
        if(mBackgroundMediaPlayer != null && mBackgroundMediaPlayer.isPlaying())
        {
            mBackgroundMediaPlayer.pause();
            mPaused = true;
            mManualPaused = true;
        }
    }

    public void playBackgroundMusic(String s, boolean flag)
    {
        if(mCurrentPath != null) goto _L2; else goto _L1
_L1:
        mBackgroundMediaPlayer = createMediaplayer(s);
        mCurrentPath = s;
_L4:
        if(mBackgroundMediaPlayer == null)
        {
            Log.e(TAG, "playBackgroundMusic: background media player is null");
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if(!mCurrentPath.equals(s))
        {
            if(mBackgroundMediaPlayer != null)
                mBackgroundMediaPlayer.release();
            mBackgroundMediaPlayer = createMediaplayer(s);
            mCurrentPath = s;
        }
        if(true) goto _L4; else goto _L3
_L3:
        if(!mPaused) goto _L6; else goto _L5
_L5:
        mBackgroundMediaPlayer.seekTo(0);
        mBackgroundMediaPlayer.start();
_L7:
        mBackgroundMediaPlayer.setLooping(flag);
        mPaused = false;
        return;
_L6:
label0:
        {
            if(!mBackgroundMediaPlayer.isPlaying())
                break label0;
            mBackgroundMediaPlayer.seekTo(0);
        }
          goto _L7
        try
        {
            mBackgroundMediaPlayer.start();
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            Log.e(TAG, "playBackgroundMusic: error state");
            return;
        }
          goto _L7
    }

    public void preloadBackgroundMusic(String s)
    {
        if(mCurrentPath == null || !mCurrentPath.equals(s))
        {
            if(mBackgroundMediaPlayer != null)
                mBackgroundMediaPlayer.release();
            mBackgroundMediaPlayer = createMediaplayer(s);
            mCurrentPath = s;
        }
    }

    public void resumeBackgroundMusic()
    {
        if(mBackgroundMediaPlayer != null && mPaused)
        {
            mBackgroundMediaPlayer.start();
            mPaused = false;
            mManualPaused = false;
        }
    }

    public void rewindBackgroundMusic()
    {
        if(mBackgroundMediaPlayer == null)
            break MISSING_BLOCK_LABEL_41;
        mBackgroundMediaPlayer.stop();
        mBackgroundMediaPlayer.prepare();
        mBackgroundMediaPlayer.seekTo(0);
        mBackgroundMediaPlayer.start();
        mPaused = false;
        return;
        Exception exception;
        exception;
        Log.e(TAG, "rewindBackgroundMusic: error state");
        return;
    }

    public void setBackgroundVolume(float f)
    {
        float f1 = f;
        if(f < 0.0F)
            f1 = 0.0F;
        f = f1;
        if(f1 > 1.0F)
            f = 1.0F;
        mRightVolume = f;
        mLeftVolume = f;
        if(mBackgroundMediaPlayer != null)
            mBackgroundMediaPlayer.setVolume(mLeftVolume, mRightVolume);
    }

    public void stopBackgroundMusic()
    {
        if(mBackgroundMediaPlayer != null)
        {
            mBackgroundMediaPlayer.stop();
            mPaused = false;
        }
    }

    private static final String TAG = org/cocos2dx/lib/Cocos2dxMusic.getSimpleName();
    private MediaPlayer mBackgroundMediaPlayer;
    private final Context mContext;
    private String mCurrentPath;
    private float mLeftVolume;
    private boolean mManualPaused;
    private boolean mPaused;
    private float mRightVolume;

}
