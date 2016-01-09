// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.gn.plugin.plugindevice;

import android.os.Build;
import jp.co.cyberagent.gn.plugin.PluginManager;
import jp.co.cyberagent.gn.plugin.PluginProtocol;

public class PluginDevice extends PluginProtocol
{

    public PluginDevice()
    {
    }

    public static String deviceName()
    {
        String s1 = Build.MODEL;
        PluginManager.logDebug("PluginDevice.getDeviceName : ");
        String s = s1;
        if(s1 == null)
            s = "Android0.0";
        return s;
    }

    public static String osVersion()
    {
        String s1 = android.os.Build.VERSION.RELEASE;
        PluginManager.logDebug("PluginDevice.getOsVersion : ");
        String s = s1;
        if(s1 == null)
            s = "0.0";
        return s;
    }

    public volatile PluginProtocol init()
    {
        return init();
    }

    public PluginDevice init()
    {
        return (PluginDevice)super.init("PluginDevice");
    }

    public static final String PLUGIN_NAME = "PluginDevice";
}
