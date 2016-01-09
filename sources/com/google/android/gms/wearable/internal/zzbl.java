// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.wearable.DataEventBuffer;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ChannelEventParcelable, AncsNotificationParcelable, CapabilityInfoParcelable, MessageEventParcelable, 
//            NodeParcelable

final class zzbl extends zzas.zza
{

    private zzbl(com.google.android.gms.wearable.zza.zza zza1, com.google.android.gms.wearable.DataApi.DataListener datalistener, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener, com.google.android.gms.wearable.NodeApi.zza zza2, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, 
            IntentFilter aintentfilter[], String s, String s1)
    {
        zzaMP = zza1;
        zzaMQ = datalistener;
        zzaMR = messagelistener;
        zzaMS = nodelistener;
        zzaMT = zza2;
        zzaMU = channellistener;
        zzaMV = capabilitylistener;
        zzaLX = aintentfilter;
        zzaMW = s;
        zzaLp = s1;
    }

    public static zzbl zza(com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, String s)
    {
        return new zzbl(null, null, null, null, null, null, (com.google.android.gms.wearable.CapabilityApi.CapabilityListener)zzv.zzr(capabilitylistener), null, null, s);
    }

    public static zzbl zza(com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener, String s)
    {
        return new zzbl(null, null, null, null, null, (com.google.android.gms.wearable.ChannelApi.ChannelListener)zzv.zzr(channellistener), null, null, (String)zzv.zzr(s), null);
    }

    public static zzbl zza(com.google.android.gms.wearable.DataApi.DataListener datalistener, IntentFilter aintentfilter[])
    {
        return new zzbl(null, (com.google.android.gms.wearable.DataApi.DataListener)zzv.zzr(datalistener), null, null, null, null, null, aintentfilter, null, null);
    }

    public static zzbl zza(com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, IntentFilter aintentfilter[])
    {
        return new zzbl(null, null, (com.google.android.gms.wearable.MessageApi.MessageListener)zzv.zzr(messagelistener), null, null, null, null, aintentfilter, null, null);
    }

    public static zzbl zza(com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
    {
        return new zzbl(null, null, null, (com.google.android.gms.wearable.NodeApi.NodeListener)zzv.zzr(nodelistener), null, null, null, null, null, null);
    }

    public static zzbl zzb(com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener)
    {
        return new zzbl(null, null, null, null, null, (com.google.android.gms.wearable.ChannelApi.ChannelListener)zzv.zzr(channellistener), null, null, null, null);
    }

    public void clear()
    {
        zzaMP = null;
        zzaMQ = null;
        zzaMR = null;
        zzaMS = null;
        zzaMT = null;
        zzaMU = null;
        zzaMV = null;
    }

    public void onConnectedNodes(List list)
    {
        if(zzaMT != null)
            zzaMT.onConnectedNodes(list);
    }

    public void zza(AncsNotificationParcelable ancsnotificationparcelable)
    {
        if(zzaMP != null)
            zzaMP.zza(ancsnotificationparcelable);
    }

    public void zza(CapabilityInfoParcelable capabilityinfoparcelable)
    {
        if(zzaMV != null)
            zzaMV.onCapabilityChanged(capabilityinfoparcelable);
    }

    public void zza(ChannelEventParcelable channeleventparcelable)
    {
        if(zzaMU != null)
            channeleventparcelable.zza(zzaMU);
    }

    public void zza(MessageEventParcelable messageeventparcelable)
    {
        if(zzaMR != null)
            zzaMR.onMessageReceived(messageeventparcelable);
    }

    public void zza(NodeParcelable nodeparcelable)
    {
        if(zzaMS != null)
            zzaMS.onPeerConnected(nodeparcelable);
    }

    public void zzac(DataHolder dataholder)
    {
        if(zzaMQ == null)
            break MISSING_BLOCK_LABEL_36;
        zzaMQ.onDataChanged(new DataEventBuffer(dataholder));
        dataholder.close();
        return;
        Exception exception;
        exception;
        dataholder.close();
        throw exception;
        dataholder.close();
        return;
    }

    public void zzb(NodeParcelable nodeparcelable)
    {
        if(zzaMS != null)
            zzaMS.onPeerDisconnected(nodeparcelable);
    }

    public IntentFilter[] zzzo()
    {
        return zzaLX;
    }

    public String zzzp()
    {
        return zzaMW;
    }

    public String zzzq()
    {
        return zzaLp;
    }

    private final IntentFilter zzaLX[];
    private final String zzaLp;
    private com.google.android.gms.wearable.zza.zza zzaMP;
    private com.google.android.gms.wearable.DataApi.DataListener zzaMQ;
    private com.google.android.gms.wearable.MessageApi.MessageListener zzaMR;
    private com.google.android.gms.wearable.NodeApi.NodeListener zzaMS;
    private com.google.android.gms.wearable.NodeApi.zza zzaMT;
    private com.google.android.gms.wearable.ChannelApi.ChannelListener zzaMU;
    private com.google.android.gms.wearable.CapabilityApi.CapabilityListener zzaMV;
    private final String zzaMW;
}
