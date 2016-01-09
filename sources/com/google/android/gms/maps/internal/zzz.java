// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.internal;

import android.graphics.Point;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.internal:
//            Point

public class zzz
    implements android.os.Parcelable.Creator
{

    public zzz()
    {
    }

    static void zza(com.google.android.gms.maps.internal.Point point, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, point.getVersionCode());
        zzb.zza(parcel, 2, point.zztP(), i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzed(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzgi(i);
    }

    public com.google.android.gms.maps.internal.Point zzed(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        Point point = null;
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
                    point = (Point)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, Point.CREATOR);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new com.google.android.gms.maps.internal.Point(i, point);
        while(true);
    }

    public com.google.android.gms.maps.internal.Point[] zzgi(int i)
    {
        return new com.google.android.gms.maps.internal.Point[i];
    }
}
