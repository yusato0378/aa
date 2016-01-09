// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.lib;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Process;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.*;

// Referenced classes of package org.cocos2dx.lib:
//            Cocos2dxAccelerometer, Cocos2dxMusic, Cocos2dxSound, Cocos2dxBitmap, 
//            Cocos2dxETCLoader, Cocos2dxActivity

public class Cocos2dxHelper
{
    public static interface Cocos2dxHelperListener
    {

        public abstract void runOnGLThread(Runnable runnable);

        public abstract void showDialog(String s, String s1);

        public abstract void showEditTextDialog(String s, String s1, int i, int j, int k, int l, int i1);
    }


    public Cocos2dxHelper()
    {
    }

    public static void addOnActivityResultListener(android.preference.PreferenceManager.OnActivityResultListener onactivityresultlistener)
    {
        onActivityResultListeners.add(onactivityresultlistener);
    }

    public static void disableAccelerometer()
    {
        sAccelerometerEnabled = false;
        sCocos2dxAccelerometer.disable();
    }

    public static void enableAccelerometer()
    {
        sAccelerometerEnabled = true;
        sCocos2dxAccelerometer.enable();
    }

    public static void end()
    {
        sCocos2dMusic.end();
        sCocos2dSound.end();
    }

    public static Activity getActivity()
    {
        return sActivity;
    }

    public static AssetManager getAssetManager()
    {
        return sAssetManager;
    }

    public static float getBackgroundMusicVolume()
    {
        return sCocos2dMusic.getBackgroundVolume();
    }

    public static boolean getBoolForKey(String s, boolean flag)
    {
        return sActivity.getSharedPreferences("Cocos2dxPrefsFile", 0).getBoolean(s, flag);
    }

    public static String getCocos2dxPackageName()
    {
        return sPackageName;
    }

    public static String getCocos2dxWritablePath()
    {
        return sFileDirectory;
    }

    public static String getCurrentLanguage()
    {
        return Locale.getDefault().getLanguage();
    }

    public static int getDPI()
    {
        if(sActivity != null)
        {
            DisplayMetrics displaymetrics = new DisplayMetrics();
            Object obj = sActivity.getWindowManager();
            if(obj != null)
            {
                obj = ((WindowManager) (obj)).getDefaultDisplay();
                if(obj != null)
                {
                    ((Display) (obj)).getMetrics(displaymetrics);
                    return (int)(displaymetrics.density * 160F);
                }
            }
        }
        return -1;
    }

    public static String getDeviceModel()
    {
        return Build.MODEL;
    }

    public static double getDoubleForKey(String s, double d)
    {
        return (double)sActivity.getSharedPreferences("Cocos2dxPrefsFile", 0).getFloat(s, (float)d);
    }

    public static float getEffectsVolume()
    {
        return sCocos2dSound.getEffectsVolume();
    }

    public static float getFloatForKey(String s, float f)
    {
        return sActivity.getSharedPreferences("Cocos2dxPrefsFile", 0).getFloat(s, f);
    }

    public static int getIntegerForKey(String s, int i)
    {
        return sActivity.getSharedPreferences("Cocos2dxPrefsFile", 0).getInt(s, i);
    }

    public static Set getOnActivityResultListeners()
    {
        return onActivityResultListeners;
    }

    public static String getStringForKey(String s, String s1)
    {
        return sActivity.getSharedPreferences("Cocos2dxPrefsFile", 0).getString(s, s1);
    }

    public static void init(Activity activity)
    {
        if(!sInited)
        {
            ApplicationInfo applicationinfo = activity.getApplicationInfo();
            sCocos2dxHelperListener = (Cocos2dxHelperListener)activity;
            sPackageName = applicationinfo.packageName;
            sFileDirectory = activity.getFilesDir().getAbsolutePath();
            nativeSetApkPath(applicationinfo.sourceDir);
            sCocos2dxAccelerometer = new Cocos2dxAccelerometer(activity);
            sCocos2dMusic = new Cocos2dxMusic(activity);
            sCocos2dSound = new Cocos2dxSound(activity);
            sAssetManager = activity.getAssets();
            nativeSetContext(activity, sAssetManager);
            Cocos2dxBitmap.setContext(activity);
            Cocos2dxETCLoader.setContext(activity);
            sActivity = activity;
            sInited = true;
        }
    }

    public static boolean isActivityVisible()
    {
        return sActivityVisible;
    }

    public static boolean isBackgroundMusicPlaying()
    {
        return sCocos2dMusic.isBackgroundMusicPlaying();
    }

    private static native void nativeSetApkPath(String s);

    private static native void nativeSetContext(Context context, AssetManager assetmanager);

    private static native void nativeSetEditTextDialogResult(byte abyte0[]);

    public static void onEnterBackground()
    {
        sCocos2dSound.onEnterBackground();
        sCocos2dMusic.onEnterBackground();
    }

    public static void onEnterForeground()
    {
        sCocos2dSound.onEnterForeground();
        sCocos2dMusic.onEnterForeground();
    }

    public static void onPause()
    {
        sActivityVisible = false;
        if(sAccelerometerEnabled)
            sCocos2dxAccelerometer.disable();
    }

    public static void onResume()
    {
        sActivityVisible = true;
        if(sAccelerometerEnabled)
            sCocos2dxAccelerometer.enable();
    }

    public static void pauseAllEffects()
    {
        sCocos2dSound.pauseAllEffects();
    }

    public static void pauseBackgroundMusic()
    {
        sCocos2dMusic.pauseBackgroundMusic();
    }

    public static void pauseEffect(int i)
    {
        sCocos2dSound.pauseEffect(i);
    }

    public static void playBackgroundMusic(String s, boolean flag)
    {
        sCocos2dMusic.playBackgroundMusic(s, flag);
    }

    public static int playEffect(String s, boolean flag, float f, float f1, float f2)
    {
        return sCocos2dSound.playEffect(s, flag, f, f1, f2);
    }

    public static void preloadBackgroundMusic(String s)
    {
        sCocos2dMusic.preloadBackgroundMusic(s);
    }

    public static void preloadEffect(String s)
    {
        sCocos2dSound.preloadEffect(s);
    }

    public static void resumeAllEffects()
    {
        sCocos2dSound.resumeAllEffects();
    }

    public static void resumeBackgroundMusic()
    {
        sCocos2dMusic.resumeBackgroundMusic();
    }

    public static void resumeEffect(int i)
    {
        sCocos2dSound.resumeEffect(i);
    }

    public static void rewindBackgroundMusic()
    {
        sCocos2dMusic.rewindBackgroundMusic();
    }

    public static void runOnGLThread(Runnable runnable)
    {
        ((Cocos2dxActivity)sActivity).runOnGLThread(runnable);
    }

    public static void setAccelerometerInterval(float f)
    {
        sCocos2dxAccelerometer.setInterval(f);
    }

    public static void setBackgroundMusicVolume(float f)
    {
        sCocos2dMusic.setBackgroundVolume(f);
    }

    public static void setBoolForKey(String s, boolean flag)
    {
        android.content.SharedPreferences.Editor editor = sActivity.getSharedPreferences("Cocos2dxPrefsFile", 0).edit();
        editor.putBoolean(s, flag);
        editor.commit();
    }

    public static void setDoubleForKey(String s, double d)
    {
        android.content.SharedPreferences.Editor editor = sActivity.getSharedPreferences("Cocos2dxPrefsFile", 0).edit();
        editor.putFloat(s, (float)d);
        editor.commit();
    }

    public static void setEditTextDialogResult(String s)
    {
        try
        {
            s = s.getBytes("UTF8");
            sCocos2dxHelperListener.runOnGLThread(new Runnable(s) {

                public void run()
                {
                    Cocos2dxHelper.nativeSetEditTextDialogResult(bytesUTF8);
                }

                final byte val$bytesUTF8[];

            
            {
                bytesUTF8 = abyte0;
                super();
            }
            }
);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            return;
        }
    }

    public static void setEffectsVolume(float f)
    {
        sCocos2dSound.setEffectsVolume(f);
    }

    public static void setFloatForKey(String s, float f)
    {
        android.content.SharedPreferences.Editor editor = sActivity.getSharedPreferences("Cocos2dxPrefsFile", 0).edit();
        editor.putFloat(s, f);
        editor.commit();
    }

    public static void setIntegerForKey(String s, int i)
    {
        android.content.SharedPreferences.Editor editor = sActivity.getSharedPreferences("Cocos2dxPrefsFile", 0).edit();
        editor.putInt(s, i);
        editor.commit();
    }

    public static void setKeepScreenOn(boolean flag)
    {
        ((Cocos2dxActivity)sActivity).setKeepScreenOn(flag);
    }

    public static void setStringForKey(String s, String s1)
    {
        android.content.SharedPreferences.Editor editor = sActivity.getSharedPreferences("Cocos2dxPrefsFile", 0).edit();
        editor.putString(s, s1);
        editor.commit();
    }

    private static void showDialog(String s, String s1)
    {
        sCocos2dxHelperListener.showDialog(s, s1);
    }

    private static void showEditTextDialog(String s, String s1, int i, int j, int k, int l, int i1)
    {
        sCocos2dxHelperListener.showEditTextDialog(s, s1, i, j, k, l, i1);
    }

    public static void stopAllEffects()
    {
        sCocos2dSound.stopAllEffects();
    }

    public static void stopBackgroundMusic()
    {
        sCocos2dMusic.stopBackgroundMusic();
    }

    public static void stopEffect(int i)
    {
        sCocos2dSound.stopEffect(i);
    }

    public static void terminateProcess()
    {
        Process.killProcess(Process.myPid());
    }

    public static void unloadEffect(String s)
    {
        sCocos2dSound.unloadEffect(s);
    }

    private static final String PREFS_NAME = "Cocos2dxPrefsFile";
    private static final int RUNNABLES_PER_FRAME = 5;
    private static Set onActivityResultListeners = new LinkedHashSet();
    private static boolean sAccelerometerEnabled;
    private static Activity sActivity = null;
    private static boolean sActivityVisible;
    private static AssetManager sAssetManager;
    private static Cocos2dxMusic sCocos2dMusic;
    private static Cocos2dxSound sCocos2dSound;
    private static Cocos2dxAccelerometer sCocos2dxAccelerometer;
    private static Cocos2dxHelperListener sCocos2dxHelperListener;
    private static String sFileDirectory;
    private static boolean sInited = false;
    private static String sPackageName;


}
