// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.*;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzf, zzbk

public final class zzu
    implements DataApi
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
            zzbk1.zza(this, zzaLW, zzaLX);
            zzaLW = null;
            zzaLX = null;
        }

        public Status zzb(Status status)
        {
            zzaLW = null;
            zzaLX = null;
            return status;
        }

        private com.google.android.gms.wearable.DataApi.DataListener zzaLW;
        private IntentFilter zzaLX[];

        private zza(GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataApi.DataListener datalistener, IntentFilter aintentfilter[])
        {
            super(googleapiclient);
            zzaLW = datalistener;
            zzaLX = aintentfilter;
        }

    }

    public static class zzb
        implements com.google.android.gms.wearable.DataApi.DataItemResult
    {

        public DataItem getDataItem()
        {
            return zzaLY;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;
        private final DataItem zzaLY;

        public zzb(Status status, DataItem dataitem)
        {
            zzKr = status;
            zzaLY = dataitem;
        }
    }

    public static class zzc
        implements com.google.android.gms.wearable.DataApi.DeleteDataItemsResult
    {

        public int getNumDeleted()
        {
            return zzaLZ;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;
        private final int zzaLZ;

        public zzc(Status status, int i)
        {
            zzKr = status;
            zzaLZ = i;
        }
    }

    public static class zzd
        implements com.google.android.gms.wearable.DataApi.GetFdForAssetResult
    {

        public ParcelFileDescriptor getFd()
        {
            if(mClosed)
                throw new IllegalStateException("Cannot access the file descriptor after release().");
            else
                return zzaMa;
        }

        public InputStream getInputStream()
        {
            if(mClosed)
                throw new IllegalStateException("Cannot access the input stream after release().");
            if(zzaMa == null)
                return null;
            if(zzaLI == null)
                zzaLI = new android.os.ParcelFileDescriptor.AutoCloseInputStream(zzaMa);
            return zzaLI;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        public void release()
        {
            if(zzaMa == null)
                return;
            if(mClosed)
                throw new IllegalStateException("releasing an already released result.");
            if(zzaLI == null)
                break MISSING_BLOCK_LABEL_55;
            zzaLI.close();
_L1:
            mClosed = true;
            zzaMa = null;
            zzaLI = null;
            return;
            try
            {
                zzaMa.close();
            }
            catch(IOException ioexception)
            {
                return;
            }
              goto _L1
        }

        private volatile boolean mClosed;
        private final Status zzKr;
        private volatile InputStream zzaLI;
        private volatile ParcelFileDescriptor zzaMa;

        public zzd(Status status, ParcelFileDescriptor parcelfiledescriptor)
        {
            mClosed = false;
            zzKr = status;
            zzaMa = parcelfiledescriptor;
        }
    }


    public zzu()
    {
    }

    private PendingResult zza(GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataApi.DataListener datalistener, IntentFilter aintentfilter[])
    {
        return googleapiclient.zza(new zza(googleapiclient, datalistener, aintentfilter));
    }

    private void zza(Asset asset)
    {
        if(asset == null)
            throw new IllegalArgumentException("asset is null");
        if(asset.getDigest() == null)
            throw new IllegalArgumentException("invalid asset");
        if(asset.getData() != null)
            throw new IllegalArgumentException("invalid asset");
        else
            return;
    }

    public PendingResult addListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataApi.DataListener datalistener)
    {
        return zza(googleapiclient, datalistener, null);
    }

    public PendingResult deleteDataItems(GoogleApiClient googleapiclient, Uri uri)
    {
        return deleteDataItems(googleapiclient, uri, 0);
    }

    public PendingResult deleteDataItems(GoogleApiClient googleapiclient, Uri uri, int i)
    {
        return googleapiclient.zza(new zzf(googleapiclient, uri, i) {

            protected Result createFailedResult(Status status)
            {
                return zzaZ(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzbk)zza1);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zzb(this, zzayj, zzaLS);
            }

            protected com.google.android.gms.wearable.DataApi.DeleteDataItemsResult zzaZ(Status status)
            {
                return new zzc(status, 0);
            }

            final zzu zzaLR;
            final int zzaLS;
            final Uri zzayj;

            
            {
                zzaLR = zzu.this;
                zzayj = uri;
                zzaLS = i;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult getDataItem(GoogleApiClient googleapiclient, Uri uri)
    {
        return googleapiclient.zza(new zzf(googleapiclient, uri) {

            protected Result createFailedResult(Status status)
            {
                return zzaX(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzbk)zza1);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zza(this, zzayj);
            }

            protected com.google.android.gms.wearable.DataApi.DataItemResult zzaX(Status status)
            {
                return new zzb(status, null);
            }

            final zzu zzaLR;
            final Uri zzayj;

            
            {
                zzaLR = zzu.this;
                zzayj = uri;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult getDataItems(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zza(new zzf(googleapiclient) {

            protected Result createFailedResult(Status status)
            {
                return zzaY(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzbk)zza1);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zzl(this);
            }

            protected DataItemBuffer zzaY(Status status)
            {
                return new DataItemBuffer(DataHolder.zzaE(status.getStatusCode()));
            }

            final zzu zzaLR;

            
            {
                zzaLR = zzu.this;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult getDataItems(GoogleApiClient googleapiclient, Uri uri)
    {
        return getDataItems(googleapiclient, uri, 0);
    }

    public PendingResult getDataItems(GoogleApiClient googleapiclient, Uri uri, int i)
    {
        return googleapiclient.zza(new zzf(googleapiclient, uri, i) {

            protected Result createFailedResult(Status status)
            {
                return zzaY(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzbk)zza1);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zza(this, zzayj, zzaLS);
            }

            protected DataItemBuffer zzaY(Status status)
            {
                return new DataItemBuffer(DataHolder.zzaE(status.getStatusCode()));
            }

            final zzu zzaLR;
            final int zzaLS;
            final Uri zzayj;

            
            {
                zzaLR = zzu.this;
                zzayj = uri;
                zzaLS = i;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult getFdForAsset(GoogleApiClient googleapiclient, Asset asset)
    {
        zza(asset);
        return googleapiclient.zza(new zzf(googleapiclient, asset) {

            protected Result createFailedResult(Status status)
            {
                return zzba(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzbk)zza1);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zza(this, zzaLT);
            }

            protected com.google.android.gms.wearable.DataApi.GetFdForAssetResult zzba(Status status)
            {
                return new zzd(status, null);
            }

            final zzu zzaLR;
            final Asset zzaLT;

            
            {
                zzaLR = zzu.this;
                zzaLT = asset;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult getFdForAsset(GoogleApiClient googleapiclient, DataItemAsset dataitemasset)
    {
        return googleapiclient.zza(new zzf(googleapiclient, dataitemasset) {

            protected Result createFailedResult(Status status)
            {
                return zzba(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzbk)zza1);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zza(this, zzaLU);
            }

            protected com.google.android.gms.wearable.DataApi.GetFdForAssetResult zzba(Status status)
            {
                return new zzd(status, null);
            }

            final zzu zzaLR;
            final DataItemAsset zzaLU;

            
            {
                zzaLR = zzu.this;
                zzaLU = dataitemasset;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult putDataItem(GoogleApiClient googleapiclient, PutDataRequest putdatarequest)
    {
        return googleapiclient.zza(new zzf(googleapiclient, putdatarequest) {

            public Result createFailedResult(Status status)
            {
                return zzaX(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzbk)zza1);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zza(this, zzaLQ);
            }

            public com.google.android.gms.wearable.DataApi.DataItemResult zzaX(Status status)
            {
                return new zzb(status, null);
            }

            final PutDataRequest zzaLQ;
            final zzu zzaLR;

            
            {
                zzaLR = zzu.this;
                zzaLQ = putdatarequest;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataApi.DataListener datalistener)
    {
        return googleapiclient.zza(new zzf(googleapiclient, datalistener) {

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
                zzbk1.zza(this, zzaLV);
            }

            public Status zzb(Status status)
            {
                return status;
            }

            final zzu zzaLR;
            final com.google.android.gms.wearable.DataApi.DataListener zzaLV;

            
            {
                zzaLR = zzu.this;
                zzaLV = datalistener;
                super(googleapiclient);
            }
        }
);
    }
}
