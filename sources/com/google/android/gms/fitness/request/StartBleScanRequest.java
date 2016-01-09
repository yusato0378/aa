// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzhq;
import com.google.android.gms.internal.zzjm;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzaa, zzn, BleScanCallback

public class StartBleScanRequest
    implements SafeParcelable
{
    public static class Builder
    {

        static DataType[] zza(Builder builder)
        {
            return builder.zzafc;
        }

        static zzn zzb(Builder builder)
        {
            return builder.zzafD;
        }

        static int zzc(Builder builder)
        {
            return builder.zzafE;
        }

        public StartBleScanRequest build()
        {
            boolean flag;
            if(zzafD != null)
                flag = true;
            else
                flag = false;
            zzv.zza(flag, "Must set BleScanCallback");
            return new StartBleScanRequest(this);
        }

        public Builder setBleScanCallback(BleScanCallback blescancallback)
        {
            zza(com.google.android.gms.fitness.request.zza.zza.zzpd().zza(blescancallback));
            return this;
        }

        public transient Builder setDataTypes(DataType adatatype[])
        {
            zzafc = adatatype;
            return this;
        }

        public Builder setTimeoutSecs(int i)
        {
            boolean flag1 = true;
            boolean flag;
            if(i > 0)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Stop time must be greater than zero");
            if(i <= 60)
                flag = flag1;
            else
                flag = false;
            zzv.zzb(flag, "Stop time must be less than 1 minute");
            zzafE = i;
            return this;
        }

        public Builder zza(zzn zzn1)
        {
            zzafD = zzn1;
            return this;
        }

        private zzn zzafD;
        private int zzafE;
        private DataType zzafc[];

        public Builder()
        {
            zzafc = new DataType[0];
            zzafE = 10;
        }
    }


    StartBleScanRequest(int i, List list, IBinder ibinder, int j, IBinder ibinder1, String s)
    {
        zzzH = i;
        zzacO = list;
        zzafD = zzn.zza.zzaV(ibinder);
        zzafE = j;
        if(ibinder1 == null)
            list = null;
        else
            list = com.google.android.gms.internal.zzjm.zza.zzaS(ibinder1);
        zzaeH = list;
        zzJd = s;
    }

    private StartBleScanRequest(Builder builder)
    {
        this(((List) (zzhq.zzb(Builder.zza(builder)))), Builder.zzb(builder), Builder.zzc(builder), null, null);
    }


    public StartBleScanRequest(StartBleScanRequest startblescanrequest, zzjm zzjm1, String s)
    {
        this(startblescanrequest.zzacO, startblescanrequest.zzafD, startblescanrequest.zzafE, zzjm1, s);
    }

    public StartBleScanRequest(List list, zzn zzn1, int i, zzjm zzjm1, String s)
    {
        zzzH = 3;
        zzacO = list;
        zzafD = zzn1;
        zzafE = i;
        zzaeH = zzjm1;
        zzJd = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public List getDataTypes()
    {
        return Collections.unmodifiableList(zzacO);
    }

    public String getPackageName()
    {
        return zzJd;
    }

    public int getTimeoutSecs()
    {
        return zzafE;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("dataTypes", zzacO).zzg("timeoutSecs", Integer.valueOf(zzafE)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzaa.zza(this, parcel, i);
    }

    public IBinder zzpA()
    {
        return zzafD.asBinder();
    }

    public IBinder zzpf()
    {
        if(zzaeH == null)
            return null;
        else
            return zzaeH.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzaa();
    private final String zzJd;
    private final List zzacO;
    private final zzjm zzaeH;
    private final zzn zzafD;
    private final int zzafE;
    private final int zzzH;

}
