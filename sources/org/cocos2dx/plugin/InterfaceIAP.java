// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.plugin;

import java.util.Hashtable;

public interface InterfaceIAP
{

    public abstract void configDeveloperInfo(Hashtable hashtable);

    public abstract String getPluginVersion();

    public abstract String getSDKVersion();

    public abstract void payForProduct(Hashtable hashtable);

    public abstract void setDebugMode(boolean flag);

    public static final int PluginType = 3;
}
