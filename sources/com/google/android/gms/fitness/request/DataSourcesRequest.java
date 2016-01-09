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
import com.google.android.gms.internal.zziy;
import java.util.*;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzh

public class DataSourcesRequest
    implements SafeParcelable
{
    public static class Builder
    {

        static DataType[] zza(Builder builder)
        {
            return builder.zzafc;
        }

        static int[] zzb(Builder builder)
        {
            return builder.zzafd;
        }

        static boolean zzc(Builder builder)
        {
            return builder.zzafa;
        }

        public DataSourcesRequest build()
        {
            boolean flag1 = true;
            boolean flag;
            if(zzafc.length > 0)
                flag = true;
            else
                flag = false;
            zzv.zza(flag, "Must add at least one data type");
            if(zzafd.length > 0)
                flag = flag1;
            else
                flag = false;
            zzv.zza(flag, "Must add at least one data source type");
            return new DataSourcesRequest(this);
        }

        public transient Builder setDataSourceTypes(int ai[])
        {
            zzafd = ai;
            return this;
        }

        public transient Builder setDataTypes(DataType adatatype[])
        {
            zzafc = adatatype;
            return this;
        }

        private boolean zzafa;
        private DataType zzafc[];
        private int zzafd[] = {
            0, 1
        };

        public Builder()
        {
            zzafc = new DataType[0];
            zzafa = false;
        }
    }


    DataSourcesRequest(int i, List list, List list1, boolean flag, IBinder ibinder, String s)
    {
        zzzH = i;
        zzacO = list;
        zzaeZ = list1;
        zzafa = flag;
        if(ibinder == null)
            list = null;
        else
            list = com.google.android.gms.internal.zziy.zza.zzaE(ibinder);
        zzafb = list;
        zzJd = s;
    }

    private DataSourcesRequest(Builder builder)
    {
        this(((List) (zzhq.zzb(Builder.zza(builder)))), Arrays.asList(zzhq.zza(Builder.zzb(builder))), Builder.zzc(builder), null, null);
    }


    public DataSourcesRequest(DataSourcesRequest datasourcesrequest, zziy zziy1, String s)
    {
        this(datasourcesrequest.zzacO, datasourcesrequest.zzaeZ, datasourcesrequest.zzafa, zziy1, s);
    }

    public DataSourcesRequest(List list, List list1, boolean flag, zziy zziy1, String s)
    {
        zzzH = 3;
        zzacO = list;
        zzaeZ = list1;
        zzafa = flag;
        zzafb = zziy1;
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

    int getVersionCode()
    {
        return zzzH;
    }

    public String toString()
    {
        com.google.android.gms.common.internal.zzu.zza zza = zzu.zzq(this).zzg("dataTypes", zzacO).zzg("sourceTypes", zzaeZ);
        if(zzafa)
            zza.zzg("includeDbOnlySources", "true");
        return zza.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    public IBinder zzpf()
    {
        if(zzafb == null)
            return null;
        else
            return zzafb.asBinder();
    }

    public List zzpo()
    {
        return zzaeZ;
    }

    public boolean zzpp()
    {
        return zzafa;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzh();
    private final String zzJd;
    private final List zzacO;
    private final List zzaeZ;
    private final boolean zzafa;
    private final zziy zzafb;
    private final int zzzH;

}
