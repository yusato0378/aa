// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.cpp;

import android.app.Application;
import com.smrtbeat.SmartBeat;

public class RoguelikeApplication extends Application
{

    public RoguelikeApplication()
    {
    }

    public void onCreate()
    {
        SmartBeat.initAndStartSession(this, "9c97af1a-eebc-4305-92cf-0aea915c3be9");
    }
}
