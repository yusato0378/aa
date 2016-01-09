// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.wearable.Channel;
import java.io.*;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzl, zzf, zzbk

public class ChannelImpl
    implements SafeParcelable, Channel
{
    static final class zza
        implements com.google.android.gms.wearable.Channel.GetInputStreamResult
    {

        public InputStream getInputStream()
        {
            return zzaLI;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        public void release()
        {
            if(zzaLI == null)
                break MISSING_BLOCK_LABEL_14;
            zzaLI.close();
            return;
            IOException ioexception;
            ioexception;
        }

        private final Status zzKr;
        private final InputStream zzaLI;

        zza(Status status, InputStream inputstream)
        {
            zzKr = (Status)zzv.zzr(status);
            zzaLI = inputstream;
        }
    }

    static final class zzb
        implements com.google.android.gms.wearable.Channel.GetOutputStreamResult
    {

        public OutputStream getOutputStream()
        {
            return zzaLJ;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        public void release()
        {
            if(zzaLJ == null)
                break MISSING_BLOCK_LABEL_14;
            zzaLJ.close();
            return;
            IOException ioexception;
            ioexception;
        }

        private final Status zzKr;
        private final OutputStream zzaLJ;

        zzb(Status status, OutputStream outputstream)
        {
            zzKr = (Status)zzv.zzr(status);
            zzaLJ = outputstream;
        }
    }


    ChannelImpl(int i, String s, String s1, String s2)
    {
        zzzH = i;
        zzaLw = (String)zzv.zzr(s);
        zzaLC = (String)zzv.zzr(s1);
        zzaLD = (String)zzv.zzr(s2);
    }

    static String zza(ChannelImpl channelimpl)
    {
        return channelimpl.zzaLw;
    }

    public PendingResult addListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener)
    {
        zzv.zzb(googleapiclient, "client is null");
        zzv.zzb(channellistener, "listener is null");
        return googleapiclient.zza(new zzi.zza(googleapiclient, channellistener, zzaLw));
    }

    public PendingResult close(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzf(googleapiclient) {

            protected Result createFailedResult(Status status)
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
                zzbk1.zzu(this, ChannelImpl.zza(zzaLE));
            }

            protected Status zzb(Status status)
            {
                return status;
            }

            final ChannelImpl zzaLE;

            
            {
                zzaLE = ChannelImpl.this;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult close(GoogleApiClient googleapiclient, int i)
    {
        return googleapiclient.zzb(new zzf(googleapiclient, i) {

            protected Result createFailedResult(Status status)
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
                zzbk1.zzh(this, ChannelImpl.zza(zzaLE), zzaco);
            }

            protected Status zzb(Status status)
            {
                return status;
            }

            final ChannelImpl zzaLE;
            final int zzaco;

            
            {
                zzaLE = ChannelImpl.this;
                zzaco = i;
                super(googleapiclient);
            }
        }
);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(obj != this)
        {
            if(!(obj instanceof ChannelImpl))
                return false;
            obj = (ChannelImpl)obj;
            if(!zzaLw.equals(((ChannelImpl) (obj)).zzaLw) || !zzu.equal(((ChannelImpl) (obj)).zzaLC, zzaLC) || !zzu.equal(((ChannelImpl) (obj)).zzaLD, zzaLD) || ((ChannelImpl) (obj)).zzzH != zzzH)
                return false;
        }
        return true;
    }

    public PendingResult getInputStream(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzf(googleapiclient) {

            public Result createFailedResult(Status status)
            {
                return zzaV(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzbk)zza1);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zzv(this, ChannelImpl.zza(zzaLE));
            }

            public com.google.android.gms.wearable.Channel.GetInputStreamResult zzaV(Status status)
            {
                return new zza(status, null);
            }

            final ChannelImpl zzaLE;

            
            {
                zzaLE = ChannelImpl.this;
                super(googleapiclient);
            }
        }
);
    }

    public String getNodeId()
    {
        return zzaLC;
    }

    public PendingResult getOutputStream(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzf(googleapiclient) {

            public Result createFailedResult(Status status)
            {
                return zzaW(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzbk)zza1);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zzw(this, ChannelImpl.zza(zzaLE));
            }

            public com.google.android.gms.wearable.Channel.GetOutputStreamResult zzaW(Status status)
            {
                return new zzb(status, null);
            }

            final ChannelImpl zzaLE;

            
            {
                zzaLE = ChannelImpl.this;
                super(googleapiclient);
            }
        }
);
    }

    public String getPath()
    {
        return zzaLD;
    }

    public int hashCode()
    {
        return zzaLw.hashCode();
    }

    public PendingResult receiveFile(GoogleApiClient googleapiclient, Uri uri, boolean flag)
    {
        zzv.zzb(googleapiclient, "client is null");
        zzv.zzb(uri, "uri is null");
        return googleapiclient.zzb(new zzf(googleapiclient, uri, flag) {

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
                zzbk1.zza(this, ChannelImpl.zza(zzaLE), zzayj, zzaLF);
            }

            public Status zzb(Status status)
            {
                return status;
            }

            final ChannelImpl zzaLE;
            final boolean zzaLF;
            final Uri zzayj;

            
            {
                zzaLE = ChannelImpl.this;
                zzayj = uri;
                zzaLF = flag;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener)
    {
        zzv.zzb(googleapiclient, "client is null");
        zzv.zzb(channellistener, "listener is null");
        return googleapiclient.zza(new zzi.zzc(googleapiclient, channellistener, zzaLw));
    }

    public PendingResult sendFile(GoogleApiClient googleapiclient, Uri uri)
    {
        return sendFile(googleapiclient, uri, 0L, -1L);
    }

    public PendingResult sendFile(GoogleApiClient googleapiclient, Uri uri, long l, long l1)
    {
        zzv.zzb(googleapiclient, "client is null");
        zzv.zzb(zzaLw, "token is null");
        zzv.zzb(uri, "uri is null");
        boolean flag;
        if(l >= 0L)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "startOffset is negative: %s", new Object[] {
            Long.valueOf(l)
        });
        if(l1 >= 0L || l1 == -1L)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "invalid length: %s", new Object[] {
            Long.valueOf(l1)
        });
        return googleapiclient.zzb(new zzf(googleapiclient, uri, l, l1) {

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
                zzbk1.zza(this, ChannelImpl.zza(zzaLE), zzayj, zzaLG, zzaLH);
            }

            public Status zzb(Status status)
            {
                return status;
            }

            final ChannelImpl zzaLE;
            final long zzaLG;
            final long zzaLH;
            final Uri zzayj;

            
            {
                zzaLE = ChannelImpl.this;
                zzayj = uri;
                zzaLG = l;
                zzaLH = l1;
                super(googleapiclient);
            }
        }
);
    }

    public String toString()
    {
        return (new StringBuilder()).append("ChannelImpl{versionCode=").append(zzzH).append(", token='").append(zzaLw).append('\'').append(", nodeId='").append(zzaLC).append('\'').append(", path='").append(zzaLD).append('\'').append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzl.zza(this, parcel, i);
    }

    public String zzzh()
    {
        return zzaLw;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzl();
    private final String zzaLC;
    private final String zzaLD;
    private final String zzaLw;
    final int zzzH;

}
