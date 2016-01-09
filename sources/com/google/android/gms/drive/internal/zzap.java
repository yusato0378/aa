// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            LoadRealtimeRequest

public class zzap
    implements android.os.Parcelable.Creator
{

    public zzap()
    {
    }

    static void zza(LoadRealtimeRequest loadrealtimerequest, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, loadrealtimerequest.zzzH);
        zzb.zza(parcel, 2, loadrealtimerequest.zzVL, i, false);
        zzb.zza(parcel, 3, loadrealtimerequest.zzYM);
        zzb.zzb(parcel, 4, loadrealtimerequest.zzYN, false);
        zzb.zza(parcel, 5, loadrealtimerequest.zzYO);
        zzb.zza(parcel, 6, loadrealtimerequest.zzYP, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzaI(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzch(i);
    }

    public LoadRealtimeRequest zzaI(Parcel parcel)
    {
        DataHolder dataholder = null;
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        java.util.ArrayList arraylist = null;
        boolean flag1 = false;
        DriveId driveid = null;
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
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    driveid = (DriveId)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, DriveId.CREATOR);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel, k);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 6: // '\006'
                    dataholder = (DataHolder)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, DataHolder.CREATOR);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new LoadRealtimeRequest(i, driveid, flag1, arraylist, flag, dataholder);
        while(true);
    }

    public LoadRealtimeRequest[] zzch(int i)
    {
        return new LoadRealtimeRequest[i];
    }
}
