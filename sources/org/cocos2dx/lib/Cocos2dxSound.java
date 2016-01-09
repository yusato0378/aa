// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.lib;

import android.content.Context;
import android.content.res.AssetManager;
import android.media.SoundPool;
import android.util.Log;
import java.util.*;
import java.util.concurrent.Semaphore;

// Referenced classes of package org.cocos2dx.lib:
//            Cocos2dxHelper

public class Cocos2dxSound
{
    public class OnLoadCompletedListener
        implements android.media.SoundPool.OnLoadCompleteListener
    {

        public void onLoadComplete(SoundPool soundpool, int i, int j)
        {
            if(j != 0) goto _L2; else goto _L1
_L1:
label0:
            {
                soundpool = mEffecToPlayWhenLoadedArray.iterator();
                SoundInfoForLoadedCompleted soundinfoforloadedcompleted;
                do
                {
                    if(!soundpool.hasNext())
                        break label0;
                    soundinfoforloadedcompleted = (SoundInfoForLoadedCompleted)soundpool.next();
                } while(i != soundinfoforloadedcompleted.soundID);
                mStreamIdSyn = doPlayEffect(soundinfoforloadedcompleted.path, soundinfoforloadedcompleted.soundID, soundinfoforloadedcompleted.isLoop, soundinfoforloadedcompleted.pitch, soundinfoforloadedcompleted.pan, soundinfoforloadedcompleted.gain);
                mEffecToPlayWhenLoadedArray.remove(soundinfoforloadedcompleted);
            }
_L4:
            mSemaphore.release();
            return;
_L2:
            mStreamIdSyn = -1;
            if(true) goto _L4; else goto _L3
_L3:
        }

        final Cocos2dxSound this$0;

        public OnLoadCompletedListener()
        {
            this$0 = Cocos2dxSound.this;
            super();
        }
    }

    public class SoundInfoForLoadedCompleted
    {

        public float gain;
        public boolean isLoop;
        public float pan;
        public String path;
        public float pitch;
        public int soundID;
        final Cocos2dxSound this$0;

        public SoundInfoForLoadedCompleted(String s, int i, boolean flag, float f, float f1, float f2)
        {
            this$0 = Cocos2dxSound.this;
            super();
            path = s;
            soundID = i;
            isLoop = flag;
            pitch = f;
            pan = f1;
            gain = f2;
        }
    }


    public Cocos2dxSound(Context context)
    {
        mContext = context;
        initData();
    }

    private float clamp(float f, float f1, float f2)
    {
        return Math.max(f1, Math.min(f, f2));
    }

    private int doPlayEffect(String s, int i, boolean flag, float f, float f1, float f2)
    {
        float f4 = mLeftVolume;
        float f5 = clamp(f1, 0.0F, 1.0F);
        float f3 = mRightVolume;
        f1 = clamp(-f1, 0.0F, 1.0F);
        f = clamp(1.0F * f, 0.5F, 2.0F);
        Object obj = mSoundPool;
        f4 = clamp(f4 * f2 * (1.0F - f5), 0.0F, 1.0F);
        f1 = clamp(f3 * f2 * (1.0F - f1), 0.0F, 1.0F);
        ArrayList arraylist;
        byte byte0;
        if(flag)
            byte0 = -1;
        else
            byte0 = 0;
        i = ((SoundPool) (obj)).play(i, f4, f1, 1, byte0, f);
        arraylist = (ArrayList)mPathStreamIDsMap.get(s);
        obj = arraylist;
        if(arraylist == null)
        {
            obj = new ArrayList();
            mPathStreamIDsMap.put(s, obj);
        }
        ((ArrayList) (obj)).add(Integer.valueOf(i));
        return i;
    }

    private void initData()
    {
        if(Cocos2dxHelper.getDeviceModel().indexOf("GT-I9100") != -1)
            mSoundPool = new SoundPool(3, 3, 5);
        else
            mSoundPool = new SoundPool(5, 3, 5);
        mSoundPool.setOnLoadCompleteListener(new OnLoadCompletedListener());
        mLeftVolume = 0.5F;
        mRightVolume = 0.5F;
        mSemaphore = new Semaphore(0, true);
    }

    public int createSoundIDFromAsset(String s)
    {
        int i;
label0:
        {
            if(s.startsWith("/"))
            {
                i = mSoundPool.load(s, 0);
                break label0;
            }
            try
            {
                i = mSoundPool.load(mContext.getAssets().openFd(s), 0);
            }
            // Misplaced declaration of an exception variable
            catch(String s)
            {
                i = -1;
                Log.e("Cocos2dxSound", (new StringBuilder()).append("error: ").append(s.getMessage()).toString(), s);
            }
        }
        int j = i;
        if(i == 0)
            j = -1;
        return j;
    }

    public void end()
    {
        mSoundPool.release();
        mPathStreamIDsMap.clear();
        mPathSoundIDMap.clear();
        mEffecToPlayWhenLoadedArray.clear();
        mLeftVolume = 0.5F;
        mRightVolume = 0.5F;
        initData();
    }

    public float getEffectsVolume()
    {
        return (mLeftVolume + mRightVolume) / 2.0F;
    }

    public void onEnterBackground()
    {
        mSoundPool.autoPause();
    }

    public void onEnterForeground()
    {
        mSoundPool.autoResume();
    }

    public void pauseAllEffects()
    {
        if(!mPathStreamIDsMap.isEmpty())
        {
            for(Iterator iterator = mPathStreamIDsMap.entrySet().iterator(); iterator.hasNext();)
            {
                Iterator iterator1 = ((ArrayList)((java.util.Map.Entry)iterator.next()).getValue()).iterator();
                while(iterator1.hasNext()) 
                {
                    int i = ((Integer)iterator1.next()).intValue();
                    mSoundPool.pause(i);
                }
            }

        }
    }

    public void pauseEffect(int i)
    {
        mSoundPool.pause(i);
    }

    public int playEffect(String s, boolean flag, float f, float f1, float f2)
    {
        Object obj = (Integer)mPathSoundIDMap.get(s);
        if(obj == null) goto _L2; else goto _L1
_L1:
        int i = doPlayEffect(s, ((Integer) (obj)).intValue(), flag, f, f1, f2);
_L4:
        return i;
_L2:
        Integer integer;
        integer = Integer.valueOf(preloadEffect(s));
        if(integer.intValue() == -1)
            return -1;
        obj = mSoundPool;
        obj;
        JVM INSTR monitorenter ;
        mEffecToPlayWhenLoadedArray.add(new SoundInfoForLoadedCompleted(s, integer.intValue(), flag, f, f1, f2));
        mSemaphore.acquire();
        i = mStreamIdSyn;
        if(true) goto _L4; else goto _L3
_L3:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        s;
        obj;
        JVM INSTR monitorexit ;
        return -1;
    }

    public int preloadEffect(String s)
    {
        Integer integer1 = (Integer)mPathSoundIDMap.get(s);
        Integer integer = integer1;
        if(integer1 == null)
        {
            Integer integer2 = Integer.valueOf(createSoundIDFromAsset(s));
            integer = integer2;
            if(integer2.intValue() != -1)
            {
                mPathSoundIDMap.put(s, integer2);
                integer = integer2;
            }
        }
        return integer.intValue();
    }

    public void resumeAllEffects()
    {
        if(!mPathStreamIDsMap.isEmpty())
        {
            for(Iterator iterator = mPathStreamIDsMap.entrySet().iterator(); iterator.hasNext();)
            {
                Iterator iterator1 = ((ArrayList)((java.util.Map.Entry)iterator.next()).getValue()).iterator();
                while(iterator1.hasNext()) 
                {
                    int i = ((Integer)iterator1.next()).intValue();
                    mSoundPool.resume(i);
                }
            }

        }
    }

    public void resumeEffect(int i)
    {
        mSoundPool.resume(i);
    }

    public void setEffectsVolume(float f)
    {
        float f1 = f;
        if(f < 0.0F)
            f1 = 0.0F;
        f = f1;
        if(f1 > 1.0F)
            f = 1.0F;
        mRightVolume = f;
        mLeftVolume = f;
        if(!mPathStreamIDsMap.isEmpty())
        {
            for(Iterator iterator = mPathStreamIDsMap.entrySet().iterator(); iterator.hasNext();)
            {
                Iterator iterator1 = ((ArrayList)((java.util.Map.Entry)iterator.next()).getValue()).iterator();
                while(iterator1.hasNext()) 
                {
                    int i = ((Integer)iterator1.next()).intValue();
                    mSoundPool.setVolume(i, mLeftVolume, mRightVolume);
                }
            }

        }
    }

    public void stopAllEffects()
    {
        if(!mPathStreamIDsMap.isEmpty())
        {
            for(Iterator iterator = mPathStreamIDsMap.entrySet().iterator(); iterator.hasNext();)
            {
                Iterator iterator1 = ((ArrayList)((java.util.Map.Entry)iterator.next()).getValue()).iterator();
                while(iterator1.hasNext()) 
                {
                    int i = ((Integer)iterator1.next()).intValue();
                    mSoundPool.stop(i);
                }
            }

        }
        mPathStreamIDsMap.clear();
    }

    public void stopEffect(int i)
    {
        mSoundPool.stop(i);
        Iterator iterator = mPathStreamIDsMap.keySet().iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            String s = (String)iterator.next();
            if(!((ArrayList)mPathStreamIDsMap.get(s)).contains(Integer.valueOf(i)))
                continue;
            ((ArrayList)mPathStreamIDsMap.get(s)).remove(((ArrayList)mPathStreamIDsMap.get(s)).indexOf(Integer.valueOf(i)));
            break;
        } while(true);
    }

    public void unloadEffect(String s)
    {
        Object obj = (ArrayList)mPathStreamIDsMap.get(s);
        if(obj != null)
        {
            Integer integer;
            for(obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); mSoundPool.stop(integer.intValue()))
                integer = (Integer)((Iterator) (obj)).next();

        }
        mPathStreamIDsMap.remove(s);
        obj = (Integer)mPathSoundIDMap.get(s);
        if(obj != null)
        {
            mSoundPool.unload(((Integer) (obj)).intValue());
            mPathSoundIDMap.remove(s);
        }
    }

    private static final int INVALID_SOUND_ID = -1;
    private static final int INVALID_STREAM_ID = -1;
    private static final int MAX_SIMULTANEOUS_STREAMS_DEFAULT = 5;
    private static final int MAX_SIMULTANEOUS_STREAMS_I9100 = 3;
    private static final int SOUND_PRIORITY = 1;
    private static final int SOUND_QUALITY = 5;
    private static final float SOUND_RATE = 1F;
    private static final String TAG = "Cocos2dxSound";
    private final Context mContext;
    private final ArrayList mEffecToPlayWhenLoadedArray = new ArrayList();
    private float mLeftVolume;
    private final HashMap mPathSoundIDMap = new HashMap();
    private final HashMap mPathStreamIDsMap = new HashMap();
    private float mRightVolume;
    private Semaphore mSemaphore;
    private SoundPool mSoundPool;
    private int mStreamIdSyn;



/*
    static int access$102(Cocos2dxSound cocos2dxsound, int i)
    {
        cocos2dxsound.mStreamIdSyn = i;
        return i;
    }

*/


}
