// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.CapabilityInfo;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzf, zzbk

public class zzg
    implements CapabilityApi
{
    private static final class zza extends com.google.android.gms.wearable.internal.zzf
    {

        public Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((zzbk)zza1);
        }

        protected void zza(zzbk zzbk1)
            throws RemoteException
        {
            zzbk1.zza(this, zzaLo, zzaLp);
            zzaLo = null;
            zzaLp = null;
        }

        public Status zzb(Status status)
        {
            zzaLo = null;
            zzaLp = null;
            return status;
        }

        private com.google.android.gms.wearable.CapabilityApi.CapabilityListener zzaLo;
        private String zzaLp;

        private zza(GoogleApiClient googleapiclient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, String s)
        {
            super(googleapiclient);
            zzaLo = capabilitylistener;
            zzaLp = s;
        }

    }

    public static class zzb
        implements com.google.android.gms.wearable.CapabilityApi.AddLocalCapabilityResult, com.google.android.gms.wearable.CapabilityApi.RemoveLocalCapabilityResult
    {

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;

        public zzb(Status status)
        {
            zzKr = status;
        }
    }

    public static class zzc
        implements CapabilityInfo
    {

        public String getName()
        {
            return mName;
        }

        public Set getNodes()
        {
            return zzaLq;
        }

        private final String mName;
        private final Set zzaLq;

        public zzc(CapabilityInfo capabilityinfo)
        {
            this(capabilityinfo.getName(), capabilityinfo.getNodes());
        }

        public zzc(String s, Set set)
        {
            mName = s;
            zzaLq = set;
        }
    }

    public static class zzd
        implements com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult
    {

        public Map getAllCapabilities()
        {
            return zzaLr;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;
        private final Map zzaLr;

        public zzd(Status status, Map map)
        {
            zzKr = status;
            zzaLr = map;
        }
    }

    public static class zze
        implements com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult
    {

        public CapabilityInfo getCapability()
        {
            return zzaLs;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;
        private final CapabilityInfo zzaLs;

        public zze(Status status, CapabilityInfo capabilityinfo)
        {
            zzKr = status;
            zzaLs = capabilityinfo;
        }
    }

    private static final class zzf extends com.google.android.gms.wearable.internal.zzf
    {

        public Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((zzbk)zza1);
        }

        protected void zza(zzbk zzbk1)
            throws RemoteException
        {
            zzbk1.zzb(this, zzaLo, zzaLp);
            zzaLo = null;
            zzaLp = null;
        }

        public Status zzb(Status status)
        {
            zzaLo = null;
            zzaLp = null;
            return status;
        }

        private com.google.android.gms.wearable.CapabilityApi.CapabilityListener zzaLo;
        private String zzaLp;

        private zzf(GoogleApiClient googleapiclient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, String s)
        {
            super(googleapiclient);
            zzaLo = capabilitylistener;
            zzaLp = s;
        }

    }


    public zzg()
    {
    }

    public PendingResult addCapabilityListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, String s)
    {
        return googleapiclient.zza(new zza(googleapiclient, capabilitylistener, s));
    }

    public PendingResult addLocalCapability(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zzb(new com.google.android.gms.wearable.internal.zzf(googleapiclient, s) {

            protected Result createFailedResult(Status status)
            {
                return zzaS(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzbk)zza1);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zzs(this, zzaLl);
            }

            protected com.google.android.gms.wearable.CapabilityApi.AddLocalCapabilityResult zzaS(Status status)
            {
                return new zzb(status);
            }

            final String zzaLl;
            final zzg zzaLn;

            
            {
                zzaLn = zzg.this;
                zzaLl = s;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult getAllCapabilities(GoogleApiClient googleapiclient, int i)
    {
        return googleapiclient.zza(new com.google.android.gms.wearable.internal.zzf(googleapiclient, i) {

            protected Result createFailedResult(Status status)
            {
                return zzaR(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzbk)zza1);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zzd(this, zzaLm);
            }

            protected com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult zzaR(Status status)
            {
                return new zzd(status, null);
            }

            final int zzaLm;
            final zzg zzaLn;

            
            {
                zzaLn = zzg.this;
                zzaLm = i;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult getCapability(GoogleApiClient googleapiclient, String s, int i)
    {
        return googleapiclient.zza(new com.google.android.gms.wearable.internal.zzf(googleapiclient, s, i) {

            protected Result createFailedResult(Status status)
            {
                return zzaQ(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzbk)zza1);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zzg(this, zzaLl, zzaLm);
            }

            protected com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult zzaQ(Status status)
            {
                return new zze(status, null);
            }

            final String zzaLl;
            final int zzaLm;
            final zzg zzaLn;

            
            {
                zzaLn = zzg.this;
                zzaLl = s;
                zzaLm = i;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult removeCapabilityListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, String s)
    {
        return googleapiclient.zza(new zzf(googleapiclient, capabilitylistener, s));
    }

    public PendingResult removeLocalCapability(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zzb(new com.google.android.gms.wearable.internal.zzf(googleapiclient, s) {

            protected Result createFailedResult(Status status)
            {
                return zzaT(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzbk)zza1);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zzt(this, zzaLl);
            }

            protected com.google.android.gms.wearable.CapabilityApi.RemoveLocalCapabilityResult zzaT(Status status)
            {
                return new zzb(status);
            }

            final String zzaLl;
            final zzg zzaLn;

            
            {
                zzaLn = zzg.this;
                zzaLl = s;
                super(googleapiclient);
            }
        }
);
    }
}
