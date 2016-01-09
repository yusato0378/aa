// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.wearable.Channel;

final class zzbf
    implements com.google.android.gms.wearable.ChannelApi.ChannelListener
{

    zzbf(String s, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener)
    {
        zzaLw = (String)zzv.zzr(s);
        zzaMC = (com.google.android.gms.wearable.ChannelApi.ChannelListener)zzv.zzr(channellistener);
    }

    public boolean equals(Object obj)
    {
        if(this != obj)
        {
            if(!(obj instanceof zzbf))
                return false;
            obj = (zzbf)obj;
            if(!zzaMC.equals(((zzbf) (obj)).zzaMC) || !zzaLw.equals(((zzbf) (obj)).zzaLw))
                return false;
        }
        return true;
    }

    public int hashCode()
    {
        return zzaLw.hashCode() * 31 + zzaMC.hashCode();
    }

    public void onChannelClosed(Channel channel, int i, int j)
    {
        zzaMC.onChannelClosed(channel, i, j);
    }

    public void onChannelOpened(Channel channel)
    {
        zzaMC.onChannelOpened(channel);
    }

    public void onInputClosed(Channel channel, int i, int j)
    {
        zzaMC.onInputClosed(channel, i, j);
    }

    public void onOutputClosed(Channel channel, int i, int j)
    {
        zzaMC.onOutputClosed(channel, i, j);
    }

    private final String zzaLw;
    private final com.google.android.gms.wearable.ChannelApi.ChannelListener zzaMC;
}
