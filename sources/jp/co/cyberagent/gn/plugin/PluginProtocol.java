// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.gn.plugin;

import android.content.Intent;

public abstract class PluginProtocol
{

    public PluginProtocol()
    {
    }

    public boolean handleActivityResult(int i, int j, Intent intent)
    {
        return false;
    }

    public PluginProtocol init()
    {
        return init("");
    }

    public PluginProtocol init(String s)
    {
        pluginName = new String(s);
        pluginVersion = new String();
        debug = false;
        return this;
    }

    public void release()
    {
        pluginName = null;
        pluginVersion = null;
    }

    protected boolean debug;
    protected String pluginName;
    protected String pluginVersion;
}
