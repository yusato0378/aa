// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.*;
import android.os.*;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzak, DisconnectRequest, zzac, AddEventListenerRequest, 
//            zzbr, RemoveEventListenerRequest, CancelPendingActionsRequest

public class zzs extends zzi
{

    public zzs(Context context, Looper looper, zze zze1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, Bundle bundle)
    {
        super(context, looper, 11, connectioncallbacks, onconnectionfailedlistener, zze1);
        zzPC = zze1.zzlJ();
        zzXM = connectioncallbacks;
        zzXI = bundle;
        looper = new Intent("com.google.android.gms.drive.events.HANDLE_EVENT");
        looper.setPackage(context.getPackageName());
        context = context.getPackageManager().queryIntentServices(looper, 0);
        switch(context.size())
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("AndroidManifest.xml can only define one service that handles the ").append(looper.getAction()).append(" action").toString());

        case 0: // '\0'
            zzXJ = false;
            return;

        case 1: // '\001'
            context = ((ResolveInfo)context.get(0)).serviceInfo;
            break;
        }
        if(!((ServiceInfo) (context)).exported)
        {
            throw new IllegalStateException((new StringBuilder()).append("Drive event service ").append(((ServiceInfo) (context)).name).append(" must be exported in AndroidManifest.xml").toString());
        } else
        {
            zzXJ = true;
            return;
        }
    }

    private PendingResult zza(GoogleApiClient googleapiclient, int i, DriveId driveid)
    {
        zzv.zzb(zzg.zza(i, driveid), "id");
        zzv.zza(isConnected(), "Client must be connected");
        return googleapiclient.zzb(new zzr.zza(googleapiclient, driveid, i) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzs)zza1);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzs1.zznO().zza(new RemoveEventListenerRequest(zzXQ, zzXR), null, null, new zzbr(this));
            }

            final DriveId zzXQ;
            final int zzXR;
            final zzs zzXU;

            
            {
                zzXU = zzs.this;
                zzXQ = driveid;
                zzXR = i;
                super(googleapiclient);
            }
        }
);
    }

    private PendingResult zza(GoogleApiClient googleapiclient, int i, DriveId driveid, ChangesAvailableOptions changesavailableoptions)
    {
        zzv.zzb(zzg.zza(i, driveid), "id");
        zzv.zza(isConnected(), "Client must be connected");
        if(!zzXJ)
            throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to add event subscriptions");
        else
            return googleapiclient.zzb(new zzr.zza(googleapiclient, driveid, i, changesavailableoptions) {

                protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                    throws RemoteException
                {
                    zza((zzs)zza1);
                }

                protected void zza(zzs zzs1)
                    throws RemoteException
                {
                    zzs1.zznO().zza(new AddEventListenerRequest(zzXQ, zzXR, zzXS), null, null, new zzbr(this));
                }

                final DriveId zzXQ;
                final int zzXR;
                final ChangesAvailableOptions zzXS;
                final zzs zzXU;

            
            {
                zzXU = zzs.this;
                zzXQ = driveid;
                zzXR = i;
                zzXS = changesavailableoptions;
                super(googleapiclient);
            }
            }
);
    }

    private PendingResult zza(GoogleApiClient googleapiclient, int i, DriveId driveid, zzac zzac1)
    {
        return googleapiclient.zzb(new zzr.zza(googleapiclient, driveid, i, zzac1) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzs)zza1);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzs1.zznO().zza(new RemoveEventListenerRequest(zzXQ, zzXR), zzXT, null, new zzbr(this));
            }

            final DriveId zzXQ;
            final int zzXR;
            final zzac zzXT;
            final zzs zzXU;

            
            {
                zzXU = zzs.this;
                zzXQ = driveid;
                zzXR = i;
                zzXT = zzac1;
                super(googleapiclient);
            }
        }
);
    }

    private PendingResult zza(GoogleApiClient googleapiclient, int i, DriveId driveid, zzac zzac1, ChangesAvailableOptions changesavailableoptions)
    {
        return googleapiclient.zzb(new zzr.zza(googleapiclient, driveid, i, changesavailableoptions, zzac1) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzs)zza1);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzs1.zznO().zza(new AddEventListenerRequest(zzXQ, zzXR, zzXS), zzXT, null, new zzbr(this));
            }

            final DriveId zzXQ;
            final int zzXR;
            final ChangesAvailableOptions zzXS;
            final zzac zzXT;
            final zzs zzXU;

            
            {
                zzXU = zzs.this;
                zzXQ = driveid;
                zzXR = i;
                zzXS = changesavailableoptions;
                zzXT = zzac1;
                super(googleapiclient);
            }
        }
);
    }

    PendingResult cancelPendingActions(GoogleApiClient googleapiclient, List list)
    {
        boolean flag1 = true;
        boolean flag;
        if(list != null)
            flag = true;
        else
            flag = false;
        zzv.zzQ(flag);
        if(!list.isEmpty())
            flag = flag1;
        else
            flag = false;
        zzv.zzQ(flag);
        zzv.zza(isConnected(), "Client must be connected");
        return googleapiclient.zzb(new zzr.zza(googleapiclient, list) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzs)zza1);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzs1.zznO().zza(new CancelPendingActionsRequest(zzXV), new zzbr(this));
            }

            final zzs zzXU;
            final List zzXV;

            
            {
                zzXU = zzs.this;
                zzXV = list;
                super(googleapiclient);
            }
        }
);
    }

    public void disconnect()
    {
        if(isConnected())
            try
            {
                ((zzak)zzlX()).zza(new DisconnectRequest());
            }
            catch(RemoteException remoteexception) { }
        super.disconnect();
        synchronized(zzXN)
        {
            zzXN.clear();
        }
        synchronized(zzXO)
        {
            zzXO.clear();
        }
        synchronized(zzXP)
        {
            zzXP.clear();
        }
        return;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        map;
        JVM INSTR monitorexit ;
        throw exception1;
        exception2;
        map;
        JVM INSTR monitorexit ;
        throw exception2;
    }

    protected IInterface zzD(IBinder ibinder)
    {
        return zzaa(ibinder);
    }

    PendingResult zza(GoogleApiClient googleapiclient, DriveId driveid)
    {
        return zza(googleapiclient, 1, driveid, ((ChangesAvailableOptions) (null)));
    }

    PendingResult zza(GoogleApiClient googleapiclient, DriveId driveid, ChangeListener changelistener)
    {
        zzv.zzb(zzg.zza(1, driveid), "id");
        zzv.zzb(changelistener, "listener");
        zzv.zza(isConnected(), "Client must be connected");
        Map map = zzXN;
        map;
        JVM INSTR monitorenter ;
        Object obj = (Map)zzXN.get(driveid);
        if(obj != null)
            break MISSING_BLOCK_LABEL_77;
        obj = new HashMap();
        zzXN.put(driveid, obj);
        zzac zzac1 = (zzac)((Map) (obj)).get(changelistener);
        if(zzac1 != null) goto _L2; else goto _L1
_L1:
        zzac1 = new zzac(getLooper(), getContext(), 1, changelistener);
        ((Map) (obj)).put(changelistener, zzac1);
        changelistener = zzac1;
_L4:
        changelistener.zzbV(1);
        googleapiclient = zza(googleapiclient, 1, driveid, ((zzac) (changelistener)), null);
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
_L2:
        if(!zzac1.zzbW(1))
            break MISSING_BLOCK_LABEL_180;
        googleapiclient = new zzq.zzj(googleapiclient, Status.zzQU);
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
        googleapiclient;
        map;
        JVM INSTR monitorexit ;
        throw googleapiclient;
        changelistener = zzac1;
        if(true) goto _L4; else goto _L3
_L3:
    }

    protected void zza(int i, IBinder ibinder, Bundle bundle)
    {
        if(bundle != null)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            zzXK = (DriveId)bundle.getParcelable("com.google.android.gms.drive.root_id");
            zzXL = (DriveId)bundle.getParcelable("com.google.android.gms.drive.appdata_id");
        }
        super.zza(i, ibinder, bundle);
    }

    protected zzak zzaa(IBinder ibinder)
    {
        return zzak.zza.zzab(ibinder);
    }

    PendingResult zzb(GoogleApiClient googleapiclient, DriveId driveid)
    {
        return zza(googleapiclient, 1, driveid);
    }

    PendingResult zzb(GoogleApiClient googleapiclient, DriveId driveid, ChangeListener changelistener)
    {
        zzv.zzb(zzg.zza(1, driveid), "id");
        zzv.zza(isConnected(), "Client must be connected");
        zzv.zzb(changelistener, "listener");
        Map map = zzXN;
        map;
        JVM INSTR monitorenter ;
        Map map1 = (Map)zzXN.get(driveid);
        if(map1 != null)
            break MISSING_BLOCK_LABEL_72;
        googleapiclient = new zzq.zzj(googleapiclient, Status.zzQU);
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
        changelistener = (zzac)map1.remove(changelistener);
        if(changelistener != null)
            break MISSING_BLOCK_LABEL_111;
        googleapiclient = new zzq.zzj(googleapiclient, Status.zzQU);
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
        googleapiclient;
        map;
        JVM INSTR monitorexit ;
        throw googleapiclient;
        if(map1.isEmpty())
            zzXN.remove(driveid);
        googleapiclient = zza(googleapiclient, 1, driveid, changelistener);
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
    }

    protected String zzeq()
    {
        return "com.google.android.gms.drive.ApiService.START";
    }

    protected String zzer()
    {
        return "com.google.android.gms.drive.internal.IDriveService";
    }

    public boolean zzjM()
    {
        return true;
    }

    protected Bundle zzka()
    {
        String s = getContext().getPackageName();
        zzv.zzr(s);
        Bundle bundle;
        boolean flag;
        if(!zzlU().zzlH().isEmpty())
            flag = true;
        else
            flag = false;
        zzv.zzP(flag);
        bundle = new Bundle();
        if(!s.equals(zzPC))
            bundle.putString("proxy_package_name", zzPC);
        bundle.putAll(zzXI);
        return bundle;
    }

    public zzak zznO()
        throws DeadObjectException
    {
        return (zzak)zzlX();
    }

    public DriveId zznP()
    {
        return zzXK;
    }

    public DriveId zznQ()
    {
        return zzXL;
    }

    public boolean zznR()
    {
        return zzXJ;
    }

    private final String zzPC;
    private final Bundle zzXI;
    private final boolean zzXJ;
    private DriveId zzXK;
    private DriveId zzXL;
    final com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks zzXM;
    final Map zzXN = new HashMap();
    final Map zzXO = new HashMap();
    final Map zzXP = new HashMap();
}
