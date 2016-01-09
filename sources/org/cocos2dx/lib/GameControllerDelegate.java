// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.lib;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;

public interface GameControllerDelegate
{
    public static interface ControllerEventListener
    {

        public abstract void onAxisEvent(String s, int i, int j, float f, boolean flag);

        public abstract void onButtonEvent(String s, int i, int j, boolean flag, float f, boolean flag1);

        public abstract void onConnected(String s, int i);

        public abstract void onDisconnected(String s, int i);
    }


    public abstract boolean dispatchGenericMotionEvent(MotionEvent motionevent);

    public abstract boolean dispatchKeyEvent(KeyEvent keyevent);

    public abstract void onCreate(Context context);

    public abstract void onDestroy();

    public abstract void onPause();

    public abstract void onResume();

    public abstract void setControllerEventListener(ControllerEventListener controllereventlistener);

    public static final int BUTTON_A = 1004;
    public static final int BUTTON_B = 1005;
    public static final int BUTTON_C = 1006;
    public static final int BUTTON_DPAD_CENTER = 1014;
    public static final int BUTTON_DPAD_DOWN = 1011;
    public static final int BUTTON_DPAD_LEFT = 1012;
    public static final int BUTTON_DPAD_RIGHT = 1013;
    public static final int BUTTON_DPAD_UP = 1010;
    public static final int BUTTON_LEFT_SHOULDER = 1015;
    public static final int BUTTON_LEFT_THUMBSTICK = 1019;
    public static final int BUTTON_LEFT_TRIGGER = 1017;
    public static final int BUTTON_RIGHT_SHOULDER = 1016;
    public static final int BUTTON_RIGHT_THUMBSTICK = 1020;
    public static final int BUTTON_RIGHT_TRIGGER = 1018;
    public static final int BUTTON_SELECT = 1022;
    public static final int BUTTON_START = 1021;
    public static final int BUTTON_X = 1007;
    public static final int BUTTON_Y = 1008;
    public static final int BUTTON_Z = 1009;
    public static final int KEY_BASE = 1000;
    public static final int THUMBSTICK_LEFT_X = 1000;
    public static final int THUMBSTICK_LEFT_Y = 1001;
    public static final int THUMBSTICK_RIGHT_X = 1002;
    public static final int THUMBSTICK_RIGHT_Y = 1003;
}
