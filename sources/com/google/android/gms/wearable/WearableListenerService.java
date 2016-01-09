// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable;

import android.app.Service;
import android.content.Intent;
import android.os.*;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable:
//            CapabilityInfo, Channel, DataEventBuffer, MessageEvent, 
//            Node, zzh

public abstract class WearableListenerService extends Service
    implements CapabilityApi.CapabilityListener, ChannelApi.ChannelListener, DataApi.DataListener, MessageApi.MessageListener, NodeApi.NodeListener, NodeApi.zza
{
    private class zza extends com.google.android.gms.wearable.internal.zzas.zza
    {

        public void onConnectedNodes(List list)
        {
label0:
            {
                if(Log.isLoggable("WearableLS", 3))
                    Log.d("WearableLS", (new StringBuilder()).append("onConnectedNodes: ").append(WearableListenerService.zza(zzaKR)).append(": ").append(list).toString());
                WearableListenerService.zzb(zzaKR);
                synchronized(WearableListenerService.zzc(zzaKR))
                {
                    if(!WearableListenerService.zzd(zzaKR))
                        break label0;
                }
                return;
            }
            WearableListenerService.zze(zzaKR).post(new Runnable(this, list) {

                public void run()
                {
                    zzaKT.zzaKR.onConnectedNodes(zzaKW);
                }

                final zza zzaKT;
                final List zzaKW;

            
            {
                zzaKT = zza1;
                zzaKW = list;
                super();
            }
            }
);
            obj;
            JVM INSTR monitorexit ;
            return;
            list;
            obj;
            JVM INSTR monitorexit ;
            throw list;
        }

        public void zza(AncsNotificationParcelable ancsnotificationparcelable)
        {
            zzh zzh1;
            if(Log.isLoggable("WearableLS", 3))
                Log.d("WearableLS", (new StringBuilder()).append("onNotificationReceived: ").append(ancsnotificationparcelable).toString());
            if(!zzaKQ)
                return;
            WearableListenerService.zzb(zzaKR);
            zzh1 = (zzh)zzaKR;
            synchronized(WearableListenerService.zzc(zzaKR))
            {
                if(!WearableListenerService.zzd(zzaKR))
                    break MISSING_BLOCK_LABEL_85;
            }
            return;
            ancsnotificationparcelable;
            obj;
            JVM INSTR monitorexit ;
            throw ancsnotificationparcelable;
            WearableListenerService.zze(zzaKR).post(new Runnable(this, zzh1, ancsnotificationparcelable) {

                public void run()
                {
                    zzaKY.zza(zzaKZ);
                }

                final zza zzaKT;
                final zzh zzaKY;
                final AncsNotificationParcelable zzaKZ;

            
            {
                zzaKT = zza1;
                zzaKY = zzh1;
                zzaKZ = ancsnotificationparcelable;
                super();
            }
            }
);
            obj;
            JVM INSTR monitorexit ;
        }

        public void zza(CapabilityInfoParcelable capabilityinfoparcelable)
        {
label0:
            {
                if(Log.isLoggable("WearableLS", 3))
                    Log.d("WearableLS", (new StringBuilder()).append("onConnectedCapabilityChanged: ").append(capabilityinfoparcelable).toString());
                WearableListenerService.zzb(zzaKR);
                synchronized(WearableListenerService.zzc(zzaKR))
                {
                    if(!WearableListenerService.zzd(zzaKR))
                        break label0;
                }
                return;
            }
            WearableListenerService.zze(zzaKR).post(new Runnable(this, capabilityinfoparcelable) {

                public void run()
                {
                    zzaKT.zzaKR.onCapabilityChanged(zzaKX);
                }

                final zza zzaKT;
                final CapabilityInfoParcelable zzaKX;

            
            {
                zzaKT = zza1;
                zzaKX = capabilityinfoparcelable;
                super();
            }
            }
);
            obj;
            JVM INSTR monitorexit ;
            return;
            capabilityinfoparcelable;
            obj;
            JVM INSTR monitorexit ;
            throw capabilityinfoparcelable;
        }

        public void zza(ChannelEventParcelable channeleventparcelable)
        {
label0:
            {
                if(Log.isLoggable("WearableLS", 3))
                    Log.d("WearableLS", (new StringBuilder()).append("onChannelEvent: ").append(channeleventparcelable).toString());
                WearableListenerService.zzb(zzaKR);
                synchronized(WearableListenerService.zzc(zzaKR))
                {
                    if(!WearableListenerService.zzd(zzaKR))
                        break label0;
                }
                return;
            }
            WearableListenerService.zze(zzaKR).post(new Runnable(this, channeleventparcelable) {

                public void run()
                {
                    zzaLa.zza(zzaKT.zzaKR);
                }

                final zza zzaKT;
                final ChannelEventParcelable zzaLa;

            
            {
                zzaKT = zza1;
                zzaLa = channeleventparcelable;
                super();
            }
            }
);
            obj;
            JVM INSTR monitorexit ;
            return;
            channeleventparcelable;
            obj;
            JVM INSTR monitorexit ;
            throw channeleventparcelable;
        }

        public void zza(MessageEventParcelable messageeventparcelable)
        {
label0:
            {
                if(Log.isLoggable("WearableLS", 3))
                    Log.d("WearableLS", (new StringBuilder()).append("onMessageReceived: ").append(messageeventparcelable).toString());
                WearableListenerService.zzb(zzaKR);
                synchronized(WearableListenerService.zzc(zzaKR))
                {
                    if(!WearableListenerService.zzd(zzaKR))
                        break label0;
                }
                return;
            }
            WearableListenerService.zze(zzaKR).post(new Runnable(this, messageeventparcelable) {

                public void run()
                {
                    zzaKT.zzaKR.onMessageReceived(zzaKU);
                }

                final zza zzaKT;
                final MessageEventParcelable zzaKU;

            
            {
                zzaKT = zza1;
                zzaKU = messageeventparcelable;
                super();
            }
            }
);
            obj;
            JVM INSTR monitorexit ;
            return;
            messageeventparcelable;
            obj;
            JVM INSTR monitorexit ;
            throw messageeventparcelable;
        }

        public void zza(NodeParcelable nodeparcelable)
        {
label0:
            {
                if(Log.isLoggable("WearableLS", 3))
                    Log.d("WearableLS", (new StringBuilder()).append("onPeerConnected: ").append(WearableListenerService.zza(zzaKR)).append(": ").append(nodeparcelable).toString());
                WearableListenerService.zzb(zzaKR);
                synchronized(WearableListenerService.zzc(zzaKR))
                {
                    if(!WearableListenerService.zzd(zzaKR))
                        break label0;
                }
                return;
            }
            WearableListenerService.zze(zzaKR).post(new Runnable(this, nodeparcelable) {

                public void run()
                {
                    zzaKT.zzaKR.onPeerConnected(zzaKV);
                }

                final zza zzaKT;
                final NodeParcelable zzaKV;

            
            {
                zzaKT = zza1;
                zzaKV = nodeparcelable;
                super();
            }
            }
);
            obj;
            JVM INSTR monitorexit ;
            return;
            nodeparcelable;
            obj;
            JVM INSTR monitorexit ;
            throw nodeparcelable;
        }

        public void zzac(DataHolder dataholder)
        {
label0:
            {
                if(Log.isLoggable("WearableLS", 3))
                    Log.d("WearableLS", (new StringBuilder()).append("onDataItemChanged: ").append(WearableListenerService.zza(zzaKR)).append(": ").append(dataholder).toString());
                WearableListenerService.zzb(zzaKR);
                synchronized(WearableListenerService.zzc(zzaKR))
                {
                    if(!WearableListenerService.zzd(zzaKR))
                        break label0;
                    dataholder.close();
                }
                return;
            }
            WearableListenerService.zze(zzaKR).post(new Runnable(this, dataholder) {

                public void run()
                {
                    DataEventBuffer dataeventbuffer = new DataEventBuffer(zzaKS);
                    zzaKT.zzaKR.onDataChanged(dataeventbuffer);
                    dataeventbuffer.release();
                    return;
                    Exception exception;
                    exception;
                    dataeventbuffer.release();
                    throw exception;
                }

                final DataHolder zzaKS;
                final zza zzaKT;

            
            {
                zzaKT = zza1;
                zzaKS = dataholder;
                super();
            }
            }
);
            obj;
            JVM INSTR monitorexit ;
            return;
            dataholder;
            obj;
            JVM INSTR monitorexit ;
            throw dataholder;
        }

        public void zzb(NodeParcelable nodeparcelable)
        {
label0:
            {
                if(Log.isLoggable("WearableLS", 3))
                    Log.d("WearableLS", (new StringBuilder()).append("onPeerDisconnected: ").append(WearableListenerService.zza(zzaKR)).append(": ").append(nodeparcelable).toString());
                WearableListenerService.zzb(zzaKR);
                synchronized(WearableListenerService.zzc(zzaKR))
                {
                    if(!WearableListenerService.zzd(zzaKR))
                        break label0;
                }
                return;
            }
            WearableListenerService.zze(zzaKR).post(new Runnable(this, nodeparcelable) {

                public void run()
                {
                    zzaKT.zzaKR.onPeerDisconnected(zzaKV);
                }

                final zza zzaKT;
                final NodeParcelable zzaKV;

            
            {
                zzaKT = zza1;
                zzaKV = nodeparcelable;
                super();
            }
            }
);
            obj;
            JVM INSTR monitorexit ;
            return;
            nodeparcelable;
            obj;
            JVM INSTR monitorexit ;
            throw nodeparcelable;
        }

        boolean zzaKQ;
        final WearableListenerService zzaKR;

        zza()
        {
            zzaKR = WearableListenerService.this;
            super();
            zzaKQ = false;
            zzaKQ = WearableListenerService.this instanceof zzh;
        }
    }


    public WearableListenerService()
    {
        zzSR = -1;
        zzaKP = new Object();
    }

    static String zza(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.zzJd;
    }

    static void zzb(WearableListenerService wearablelistenerservice)
        throws SecurityException
    {
        wearablelistenerservice.zzyY();
    }

    static Object zzc(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.zzaKP;
    }

    static boolean zzd(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.zzFF;
    }

    static Handler zze(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.zzaKO;
    }

    private void zzyY()
        throws SecurityException
    {
        int i = Binder.getCallingUid();
        if(i == zzSR)
            return;
        if(GooglePlayServicesUtil.zzd(this, i))
        {
            zzSR = i;
            return;
        } else
        {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
    }

    public final IBinder onBind(Intent intent)
    {
        if("com.google.android.gms.wearable.BIND_LISTENER".equals(intent.getAction()))
            return zzSU;
        else
            return null;
    }

    public void onCapabilityChanged(CapabilityInfo capabilityinfo)
    {
    }

    public void onChannelClosed(Channel channel, int i, int j)
    {
    }

    public void onChannelOpened(Channel channel)
    {
    }

    public void onConnectedNodes(List list)
    {
    }

    public void onCreate()
    {
        super.onCreate();
        if(Log.isLoggable("WearableLS", 3))
            Log.d("WearableLS", (new StringBuilder()).append("onCreate: ").append(getPackageName()).toString());
        zzJd = getPackageName();
        HandlerThread handlerthread = new HandlerThread("WearableListenerService");
        handlerthread.start();
        zzaKO = new Handler(handlerthread.getLooper());
        zzSU = new zza();
    }

    public void onDataChanged(DataEventBuffer dataeventbuffer)
    {
    }

    public void onDestroy()
    {
        Object obj = zzaKP;
        obj;
        JVM INSTR monitorenter ;
        zzFF = true;
        if(zzaKO == null)
            throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()?");
        break MISSING_BLOCK_LABEL_34;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzaKO.getLooper().quit();
        obj;
        JVM INSTR monitorexit ;
        super.onDestroy();
        return;
    }

    public void onInputClosed(Channel channel, int i, int j)
    {
    }

    public void onMessageReceived(MessageEvent messageevent)
    {
    }

    public void onOutputClosed(Channel channel, int i, int j)
    {
    }

    public void onPeerConnected(Node node)
    {
    }

    public void onPeerDisconnected(Node node)
    {
    }

    public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
    private boolean zzFF;
    private String zzJd;
    private volatile int zzSR;
    private IBinder zzSU;
    private Handler zzaKO;
    private Object zzaKP;
}
