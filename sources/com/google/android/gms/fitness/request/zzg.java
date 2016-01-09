// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;

// Referenced classes of package com.google.android.gms.fitness.request:
//            DataSourceQueryParams

public class zzg
    implements android.os.Parcelable.Creator
{

    public zzg()
    {
    }

    static void zza(DataSourceQueryParams datasourcequeryparams, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zza(parcel, 1, datasourcequeryparams.zzacD, i, false);
        zzb.zzc(parcel, 1000, datasourcequeryparams.zzzH);
        zzb.zza(parcel, 2, datasourcequeryparams.zzKv);
        zzb.zza(parcel, 3, datasourcequeryparams.zzacU);
        zzb.zza(parcel, 4, datasourcequeryparams.zzaeX);
        zzb.zzc(parcel, 5, datasourcequeryparams.zzaeS);
        zzb.zzc(parcel, 6, datasourcequeryparams.zzaeY);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzcs(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzdW(i);
    }

    public DataSourceQueryParams zzcs(Parcel parcel)
    {
        long l1 = 0L;
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        DataSource datasource = null;
        int j = 0;
        long l2 = 0L;
        long l3 = 0L;
        int k = 0;
        do
            if(parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
                switch(com.google.android.gms.common.internal.safeparcel.zza.zzaV(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, i1);
                    break;

                case 1: // '\001'
                    datasource = (DataSource)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, DataSource.CREATOR);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    l3 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 3: // '\003'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 4: // '\004'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 5: // '\005'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;
                }
            } else
            if(parcel.dataPosition() != l)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            else
                return new DataSourceQueryParams(k, datasource, l3, l2, l1, j, i);
        while(true);
    }

    public DataSourceQueryParams[] zzdW(int i)
    {
        return new DataSourceQueryParams[i];
    }
}
