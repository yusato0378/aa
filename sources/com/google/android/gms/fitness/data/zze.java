// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.fitness.data:
//            DataSet, DataSource, DataType

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void zza(DataSet dataset, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zza(parcel, 1, dataset.getDataSource(), i, false);
        zzb.zzc(parcel, 1000, dataset.getVersionCode());
        zzb.zza(parcel, 2, dataset.getDataType(), i, false);
        zzb.zzd(parcel, 3, dataset.zzoK(), false);
        zzb.zzc(parcel, 4, dataset.zzoL(), false);
        zzb.zza(parcel, 5, dataset.zzoC());
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzbY(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzdB(i);
    }

    public DataSet zzbY(Parcel parcel)
    {
        boolean flag = false;
        ArrayList arraylist = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        ArrayList arraylist1 = new ArrayList();
        DataType datatype = null;
        DataSource datasource = null;
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
                    datatype = (DataType)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, DataType.CREATOR);
                    break;

                case 3: // '\003'
                    com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, arraylist1, getClass().getClassLoader());
                    break;

                case 4: // '\004'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k, DataSource.CREATOR);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new DataSet(i, datasource, datatype, arraylist1, arraylist, flag);
        while(true);
    }

    public DataSet[] zzdB(int i)
    {
        return new DataSet[i];
    }
}
