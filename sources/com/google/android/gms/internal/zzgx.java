// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.appstate.AppState;
import com.google.android.gms.appstate.AppStateBuffer;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzv;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzgz, zzgw

public final class zzgx extends zzi
{
    private static final class zza extends zzgw
    {

        public void zzg(int i, int j)
        {
            Status status = new Status(i);
            zzKq.zzj(new zzb(status, j));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        public zza(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Result holder must not be null");
        }
    }

    private static final class zzb
        implements com.google.android.gms.appstate.AppStateManager.StateDeletedResult
    {

        public int getStateKey()
        {
            return zzKs;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;
        private final int zzKs;

        public zzb(Status status, int i)
        {
            zzKr = status;
            zzKs = i;
        }
    }

    private static final class zzc extends zzgw
    {

        public void zza(DataHolder dataholder)
        {
            zzKq.zzj(new zzd(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        public zzc(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Result holder must not be null");
        }
    }

    private static final class zzd extends com.google.android.gms.common.api.zzc
        implements com.google.android.gms.appstate.AppStateManager.StateListResult
    {

        public AppStateBuffer getStateBuffer()
        {
            return zzKt;
        }

        private final AppStateBuffer zzKt;

        public zzd(DataHolder dataholder)
        {
            super(dataholder);
            zzKt = new AppStateBuffer(dataholder);
        }
    }

    private static final class zze extends zzgw
    {

        public void zza(int i, DataHolder dataholder)
        {
            zzKq.zzj(new zzf(i, dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        public zze(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Result holder must not be null");
        }
    }

    private static final class zzf extends com.google.android.gms.common.api.zzc
        implements com.google.android.gms.appstate.AppStateManager.StateConflictResult, com.google.android.gms.appstate.AppStateManager.StateLoadedResult, com.google.android.gms.appstate.AppStateManager.StateResult
    {

        private boolean zzjP()
        {
            return zzKr.getStatusCode() == 2000;
        }

        public com.google.android.gms.appstate.AppStateManager.StateConflictResult getConflictResult()
        {
            if(zzjP())
                return this;
            else
                return null;
        }

        public com.google.android.gms.appstate.AppStateManager.StateLoadedResult getLoadedResult()
        {
            zzf zzf1 = this;
            if(zzjP())
                zzf1 = null;
            return zzf1;
        }

        public byte[] getLocalData()
        {
            if(zzKt.getCount() == 0)
                return null;
            else
                return zzKt.get(0).getLocalData();
        }

        public String getResolvedVersion()
        {
            if(zzKt.getCount() == 0)
                return null;
            else
                return zzKt.get(0).getConflictVersion();
        }

        public byte[] getServerData()
        {
            if(zzKt.getCount() == 0)
                return null;
            else
                return zzKt.get(0).getConflictData();
        }

        public int getStateKey()
        {
            return zzKs;
        }

        public void release()
        {
            zzKt.release();
        }

        private final int zzKs;
        private final AppStateBuffer zzKt;

        public zzf(int i, DataHolder dataholder)
        {
            super(dataholder);
            zzKs = i;
            zzKt = new AppStateBuffer(dataholder);
        }
    }

    private static final class zzg extends zzgw
    {

        public void zzjL()
        {
            Status status = new Status(0);
            zzKq.zzj(status);
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        public zzg(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }


    public zzgx(Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 7, connectioncallbacks, onconnectionfailedlistener, zze1);
    }

    protected IInterface zzD(IBinder ibinder)
    {
        return zzK(ibinder);
    }

    protected zzgz zzK(IBinder ibinder)
    {
        return zzgz.zza.zzM(ibinder);
    }

    protected Set zza(Set set)
    {
        zzv.zza(set.contains(new Scope("https://www.googleapis.com/auth/appstate")), String.format("App State APIs requires %s to function.", new Object[] {
            "https://www.googleapis.com/auth/appstate"
        }));
        return set;
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1)
        throws RemoteException
    {
        ((zzgz)zzlX()).zza(new zzc(zzb1));
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, int i)
        throws RemoteException
    {
        ((zzgz)zzlX()).zzb(new zza(zzb1), i);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, int i, String s, byte abyte0[])
        throws RemoteException
    {
        ((zzgz)zzlX()).zza(new zze(zzb1), i, s, abyte0);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, int i, byte abyte0[])
        throws RemoteException
    {
        if(zzb1 == null)
            zzb1 = null;
        else
            zzb1 = new zze(zzb1);
        ((zzgz)zzlX()).zza(zzb1, i, abyte0);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1)
        throws RemoteException
    {
        ((zzgz)zzlX()).zzb(new zzg(zzb1));
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, int i)
        throws RemoteException
    {
        ((zzgz)zzlX()).zza(new zze(zzb1), i);
    }

    protected String zzeq()
    {
        return "com.google.android.gms.appstate.service.START";
    }

    protected String zzer()
    {
        return "com.google.android.gms.appstate.internal.IAppStateService";
    }

    public boolean zzjM()
    {
        return true;
    }

    public int zzjN()
    {
        int i;
        try
        {
            i = ((zzgz)zzlX()).zzjN();
        }
        catch(RemoteException remoteexception)
        {
            Log.w("AppStateClient", "service died");
            return 2;
        }
        return i;
    }

    public int zzjO()
    {
        int i;
        try
        {
            i = ((zzgz)zzlX()).zzjO();
        }
        catch(RemoteException remoteexception)
        {
            Log.w("AppStateClient", "service died");
            return 2;
        }
        return i;
    }
}
