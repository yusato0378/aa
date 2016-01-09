// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentAnnotationEntity

public class AppContentAnnotationEntityCreator
    implements android.os.Parcelable.Creator
{

    public AppContentAnnotationEntityCreator()
    {
    }

    static void zza(AppContentAnnotationEntity appcontentannotationentity, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zza(parcel, 1, appcontentannotationentity.getDescription(), false);
        zzb.zzc(parcel, 1000, appcontentannotationentity.getVersionCode());
        zzb.zza(parcel, 2, appcontentannotationentity.zzqd(), i, false);
        zzb.zza(parcel, 3, appcontentannotationentity.getTitle(), false);
        zzb.zza(parcel, 5, appcontentannotationentity.getId(), false);
        zzb.zza(parcel, 6, appcontentannotationentity.zzqg(), false);
        zzb.zza(parcel, 7, appcontentannotationentity.zzqb(), false);
        zzb.zzc(parcel, 8, appcontentannotationentity.zzqc());
        zzb.zzc(parcel, 9, appcontentannotationentity.zzqf());
        zzb.zza(parcel, 10, appcontentannotationentity.zzqe(), false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdg(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzeM(i);
    }

    public AppContentAnnotationEntity zzdg(Parcel parcel)
    {
        int i = 0;
        android.os.Bundle bundle = null;
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int j = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        Uri uri = null;
        String s4 = null;
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
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, Uri.CREATOR);
                    break;

                case 3: // '\003'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 5: // '\005'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 8: // '\b'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 9: // '\t'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 10: // '\n'
                    bundle = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, i1);
                    break;
                }
            } else
            if(parcel.dataPosition() != l)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            else
                return new AppContentAnnotationEntity(k, s4, uri, s3, s2, s1, s, j, i, bundle);
        while(true);
    }

    public AppContentAnnotationEntity[] zzeM(int i)
    {
        return new AppContentAnnotationEntity[i];
    }
}
