// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.internal.FilterHolder;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OpenFileIntentSenderRequest

public class zzbk
    implements android.os.Parcelable.Creator
{

    public zzbk()
    {
    }

    static void zza(OpenFileIntentSenderRequest openfileintentsenderrequest, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, openfileintentsenderrequest.zzzH);
        zzb.zza(parcel, 2, openfileintentsenderrequest.zzWn, false);
        zzb.zza(parcel, 3, openfileintentsenderrequest.zzWo, false);
        zzb.zza(parcel, 4, openfileintentsenderrequest.zzWq, i, false);
        zzb.zza(parcel, 5, openfileintentsenderrequest.zzZq, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzaZ(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzcy(i);
    }

    public OpenFileIntentSenderRequest zzaZ(Parcel parcel)
    {
        FilterHolder filterholder = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        DriveId driveid = null;
        String as[] = null;
        String s = null;
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
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 3: // '\003'
                    as = com.google.android.gms.common.internal.safeparcel.zza.zzA(parcel, k);
                    break;

                case 4: // '\004'
                    driveid = (DriveId)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, DriveId.CREATOR);
                    break;

                case 5: // '\005'
                    filterholder = (FilterHolder)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, FilterHolder.CREATOR);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new OpenFileIntentSenderRequest(i, s, as, driveid, filterholder);
        while(true);
    }

    public OpenFileIntentSenderRequest[] zzcy(int i)
    {
        return new OpenFileIntentSenderRequest[i];
    }
}
