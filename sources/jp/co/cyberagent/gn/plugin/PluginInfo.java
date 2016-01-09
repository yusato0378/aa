// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.gn.plugin;


// Referenced classes of package jp.co.cyberagent.gn.plugin:
//            PluginProtocol

public class PluginInfo
{

    public PluginInfo()
    {
        pluginId = null;
        pluginName = null;
        protocol = null;
    }

    public void release()
    {
        pluginId = null;
        pluginName = null;
        if(protocol != null)
        {
            protocol.release();
            protocol = null;
        }
    }

    public void set(String s, String s1, PluginProtocol pluginprotocol)
    {
        pluginId = new String(s);
        pluginName = new String(s1);
        protocol = pluginprotocol;
    }

    protected String pluginId;
    protected String pluginName;
    protected PluginProtocol protocol;
}
