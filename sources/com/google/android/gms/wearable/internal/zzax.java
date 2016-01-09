// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzf, zzbk

public final class zzax
    implements NodeApi
{
    private static final class zza extends zzf
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
            zzbk1.zza(this, zzaMv);
            zzaMv = null;
        }

        public Status zzb(Status status)
        {
            zzaMv = null;
            return status;
        }

        private com.google.android.gms.wearable.NodeApi.NodeListener zzaMv;

        private zza(GoogleApiClient googleapiclient, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
        {
            super(googleapiclient);
            zzaMv = nodelistener;
        }

    }

    public static class zzb
        implements com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult
    {

        public List getNodes()
        {
            return zzaMw;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;
        private final List zzaMw;

        public zzb(Status status, List list)
        {
            zzKr = status;
            zzaMw = list;
        }
    }

    public static class zzc
        implements com.google.android.gms.wearable.NodeApi.GetLocalNodeResult
    {

        public Node getNode()
        {
            return zzaMx;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;
        private final Node zzaMx;

        public zzc(Status status, Node node)
        {
            zzKr = status;
            zzaMx = node;
        }
    }


    public zzax()
    {
    }

    public PendingResult addListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
    {
        return googleapiclient.zza(new zza(googleapiclient, nodelistener));
    }

    public PendingResult getConnectedNodes(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zza(new zzf(googleapiclient) {

            protected Result createFailedResult(Status status)
            {
                return zzbd(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzbk)zza1);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zzn(this);
            }

            protected com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult zzbd(Status status)
            {
                return new zzb(status, new ArrayList());
            }

            final zzax zzaMt;

            
            {
                zzaMt = zzax.this;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult getLocalNode(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zza(new zzf(googleapiclient) {

            protected Result createFailedResult(Status status)
            {
                return zzbc(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzbk)zza1);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zzm(this);
            }

            protected com.google.android.gms.wearable.NodeApi.GetLocalNodeResult zzbc(Status status)
            {
                return new zzc(status, null);
            }

            final zzax zzaMt;

            
            {
                zzaMt = zzax.this;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
    {
        return googleapiclient.zza(new zzf(googleapiclient, nodelistener) {

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
                zzbk1.zzb(this, zzaMu);
            }

            public Status zzb(Status status)
            {
                return status;
            }

            final zzax zzaMt;
            final com.google.android.gms.wearable.NodeApi.NodeListener zzaMu;

            
            {
                zzaMt = zzax.this;
                zzaMu = nodelistener;
                super(googleapiclient);
            }
        }
);
    }
}
