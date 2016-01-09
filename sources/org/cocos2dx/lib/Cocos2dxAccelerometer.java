// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.lib;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.*;
import android.view.Display;
import android.view.WindowManager;

// Referenced classes of package org.cocos2dx.lib:
//            Cocos2dxGLSurfaceView

public class Cocos2dxAccelerometer
    implements SensorEventListener
{

    public Cocos2dxAccelerometer(Context context)
    {
        mContext = context;
        mSensorManager = (SensorManager)mContext.getSystemService("sensor");
        mAccelerometer = mSensorManager.getDefaultSensor(1);
        mNaturalOrientation = ((WindowManager)mContext.getSystemService("window")).getDefaultDisplay().getOrientation();
    }

    public static native void onSensorChanged(float f, float f1, float f2, long l);

    public void disable()
    {
        mSensorManager.unregisterListener(this);
    }

    public void enable()
    {
        mSensorManager.registerListener(this, mAccelerometer, 1);
    }

    public void onAccuracyChanged(Sensor sensor, int i)
    {
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
        float f2;
        float f3;
        float f4;
        int i;
        if(sensorevent.sensor.getType() != 1)
            return;
        f2 = sensorevent.values[0];
        f3 = sensorevent.values[1];
        f4 = sensorevent.values[2];
        i = mContext.getResources().getConfiguration().orientation;
        if(i != 2 || mNaturalOrientation == 0) goto _L2; else goto _L1
_L1:
        float f;
        float f1;
        f = -f3;
        f1 = f2;
_L4:
        Cocos2dxGLSurfaceView.queueAccelerometer(f, f1, f4, sensorevent.timestamp);
        return;
_L2:
        f = f2;
        f1 = f3;
        if(i == 1)
        {
            f = f2;
            f1 = f3;
            if(mNaturalOrientation != 0)
            {
                f = f3;
                f1 = -f2;
            }
        }
        if(true) goto _L4; else goto _L3
_L3:
    }

    public void setInterval(float f)
    {
        if(android.os.Build.VERSION.SDK_INT < 11)
        {
            mSensorManager.registerListener(this, mAccelerometer, 1);
            return;
        } else
        {
            mSensorManager.registerListener(this, mAccelerometer, (int)(100000F * f));
            return;
        }
    }

    private static final String TAG = org/cocos2dx/lib/Cocos2dxAccelerometer.getSimpleName();
    private final Sensor mAccelerometer;
    private final Context mContext;
    private final int mNaturalOrientation;
    private final SensorManager mSensorManager;

}
