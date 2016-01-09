// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.plugin;

import java.util.Hashtable;

public interface InterfaceAnalytics
{

    public abstract String getPluginVersion();

    public abstract String getSDKVersion();

    public abstract void logError(String s, String s1);

    public abstract void logEvent(String s);

    public abstract void logEvent(String s, Hashtable hashtable);

    public abstract void logTimedEventBegin(String s);

    public abstract void logTimedEventEnd(String s);

    public abstract void setCaptureUncaughtException(boolean flag);

    public abstract void setDebugMode(boolean flag);

    public abstract void setSessionContinueMillis(int i);

    public abstract void startSession(String s);

    public abstract void stopSession();

    public static final int PluginType = 2;
}
