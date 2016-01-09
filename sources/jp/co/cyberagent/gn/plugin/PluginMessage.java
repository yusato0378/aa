// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.gn.plugin;


public class PluginMessage
{

    public PluginMessage()
    {
        requestId = null;
        result = null;
        sended = false;
    }

    public void release()
    {
        requestId = null;
        result = null;
    }

    protected String requestId;
    protected String result;
    protected boolean sended;
}
