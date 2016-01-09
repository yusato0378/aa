// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.events:
//            CompletionEvent

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void zza(CompletionEvent completionevent, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, completionevent.zzzH);
        zzb.zza(parcel, 2, completionevent.zzVL, i, false);
        zzb.zza(parcel, 3, completionevent.zzKw, false);
        zzb.zza(parcel, 4, completionevent.zzWQ, i, false);
        zzb.zza(parcel, 5, completionevent.zzWR, i, false);
        zzb.zza(parcel, 6, completionevent.zzWS, i, false);
        zzb.zzb(parcel, 7, completionevent.zzWT, false);
        zzb.zzc(parcel, 8, completionevent.zzue);
        zzb.zza(parcel, 9, completionevent.zzWU, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzaj(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzbC(i);
    }

    public CompletionEvent zzaj(Parcel parcel)
    {
        int i = 0;
        android.os.IBinder ibinder = null;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        java.util.ArrayList arraylist = null;
        MetadataBundle metadatabundle = null;
        ParcelFileDescriptor parcelfiledescriptor = null;
        ParcelFileDescriptor parcelfiledescriptor1 = null;
        String s = null;
        DriveId driveid = null;
        int j = 0;
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
                    driveid = (DriveId)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, DriveId.CREATOR);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 4: // '\004'
                    parcelfiledescriptor1 = (ParcelFileDescriptor)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, ParcelFileDescriptor.CREATOR);
                    break;

                case 5: // '\005'
                    parcelfiledescriptor = (ParcelFileDescriptor)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, ParcelFileDescriptor.CREATOR);
                    break;

                case 6: // '\006'
                    metadatabundle = (MetadataBundle)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, MetadataBundle.CREATOR);
                    break;

                case 7: // '\007'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel, l);
                    break;

                case 8: // '\b'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 9: // '\t'
                    ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, l);
                    break;
                }
            } else
            if(parcel.dataPosition() != k)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            else
                return new CompletionEvent(j, driveid, s, parcelfiledescriptor1, parcelfiledescriptor, metadatabundle, arraylist, i, ibinder);
        while(true);
    }

    public CompletionEvent[] zzbC(int i)
    {
        return new CompletionEvent[i];
    }
}
