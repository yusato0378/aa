// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.plugin;

import java.util.Hashtable;

public interface InterfaceUser
{

    public abstract void configDeveloperInfo(Hashtable hashtable);

    public abstract String getPluginVersion();

    public abstract String getSDKVersion();

    public abstract String getSessionID();

    public abstract boolean isLogined();

    public abstract void login();

    public abstract void logout();

    public abstract void setDebugMode(boolean flag);

    public static final int PluginType = 5;
}
