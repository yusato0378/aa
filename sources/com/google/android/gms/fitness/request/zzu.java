// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.*;

// Referenced classes of package com.google.android.gms.fitness.request:
//            SessionInsertRequest

public class zzu
    implements android.os.Parcelable.Creator
{

    public zzu()
    {
    }

    static void zza(SessionInsertRequest sessioninsertrequest, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zza(parcel, 1, sessioninsertrequest.getSession(), i, false);
        zzb.zzc(parcel, 1000, sessioninsertrequest.getVersionCode());
        zzb.zzc(parcel, 2, sessioninsertrequest.getDataSets(), false);
        zzb.zzc(parcel, 3, sessioninsertrequest.getAggregateDataPoints(), false);
        zzb.zza(parcel, 4, sessioninsertrequest.zzpf(), false);
        zzb.zza(parcel, 5, sessioninsertrequest.getPackageName(), false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzcF(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzek(i);
    }

    public SessionInsertRequest zzcF(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        android.os.IBinder ibinder = null;
        java.util.ArrayList arraylist = null;
        java.util.ArrayList arraylist1 = null;
        Session session = null;
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
                    session = (Session)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, Session.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k, DataSet.CREATOR);
                    break;

                case 3: // '\003'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k, DataPoint.CREATOR);
                    break;

                case 4: // '\004'
                    ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new SessionInsertRequest(i, session, arraylist1, arraylist, ibinder, s);
        while(true);
    }

    public SessionInsertRequest[] zzek(int i)
    {
        return new SessionInsertRequest[i];
    }
}
