// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            AncsNotificationParcelable

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void zza(AncsNotificationParcelable ancsnotificationparcelable, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, ancsnotificationparcelable.zzzH);
        zzb.zzc(parcel, 2, ancsnotificationparcelable.getId());
        zzb.zza(parcel, 3, ancsnotificationparcelable.zzqT(), false);
        zzb.zza(parcel, 4, ancsnotificationparcelable.zzza(), false);
        zzb.zza(parcel, 5, ancsnotificationparcelable.zzzb(), false);
        zzb.zza(parcel, 6, ancsnotificationparcelable.getTitle(), false);
        zzb.zza(parcel, 7, ancsnotificationparcelable.zzqk(), false);
        zzb.zza(parcel, 8, ancsnotificationparcelable.getDisplayName(), false);
        zzb.zza(parcel, 9, ancsnotificationparcelable.zzzc());
        zzb.zza(parcel, 10, ancsnotificationparcelable.zzzd());
        zzb.zza(parcel, 11, ancsnotificationparcelable.zzze());
        zzb.zza(parcel, 12, ancsnotificationparcelable.zzzf());
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfU(parcel);
    }

    public Object[] newArray(int i)
    {
        return zziC(i);
    }

    public AncsNotificationParcelable zzfU(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int j = 0;
        int i = 0;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        String s1 = null;
        String s = null;
        byte byte3 = 0;
        byte byte2 = 0;
        byte byte1 = 0;
        byte byte0 = 0;
        do
            if(parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
                switch(com.google.android.gms.common.internal.safeparcel.zza.zzaV(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 3: // '\003'
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 4: // '\004'
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 5: // '\005'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 6: // '\006'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 7: // '\007'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 9: // '\t'
                    byte3 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;

                case 10: // '\n'
                    byte2 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;

                case 11: // '\013'
                    byte1 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;

                case 12: // '\f'
                    byte0 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, l);
                    break;
                }
            } else
            if(parcel.dataPosition() != k)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            else
                return new AncsNotificationParcelable(j, i, s5, s4, s3, s2, s1, s, byte3, byte2, byte1, byte0);
        while(true);
    }

    public AncsNotificationParcelable[] zziC(int i)
    {
        return new AncsNotificationParcelable[i];
    }
}
