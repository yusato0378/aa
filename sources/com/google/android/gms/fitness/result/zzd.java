// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;

// Referenced classes of package com.google.android.gms.fitness.result:
//            DataSourceStatsResult

public class zzd
    implements android.os.Parcelable.Creator
{

    public zzd()
    {
    }

    static void zza(DataSourceStatsResult datasourcestatsresult, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zza(parcel, 1, datasourcestatsresult.zzacD, i, false);
        zzb.zzc(parcel, 1000, datasourcestatsresult.zzzH);
        zzb.zza(parcel, 2, datasourcestatsresult.zzKv);
        zzb.zza(parcel, 3, datasourcestatsresult.zzafL);
        zzb.zza(parcel, 4, datasourcestatsresult.zzafM);
        zzb.zza(parcel, 5, datasourcestatsresult.zzafN);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzcT(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzey(i);
    }

    public DataSourceStatsResult zzcT(Parcel parcel)
    {
        boolean flag = false;
        long l = 0L;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        DataSource datasource = null;
        long l1 = 0L;
        long l2 = 0L;
        int i = 0;
        do
            if(parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
                switch(com.google.android.gms.common.internal.safeparcel.zza.zzaV(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
                    break;

                case 1: // '\001'
                    datasource = (DataSource)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, DataSource.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k);
                    break;

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 4: // '\004'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k);
                    break;

                case 5: // '\005'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new DataSourceStatsResult(i, datasource, l2, flag, l1, l);
        while(true);
    }

    public DataSourceStatsResult[] zzey(int i)
    {
        return new DataSourceStatsResult[i];
    }
}
