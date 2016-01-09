// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzb, zzbl, zzas

public class AddListenerRequest
    implements SafeParcelable
{

    AddListenerRequest(int i, IBinder ibinder, IntentFilter aintentfilter[], String s, String s1)
    {
        zzzH = i;
        if(ibinder != null)
            zzaLb = zzas.zza.zzcT(ibinder);
        else
            zzaLb = null;
        zzaLc = aintentfilter;
        zzaLd = s;
        zzaLe = s1;
    }

    public AddListenerRequest(zzbl zzbl1)
    {
        zzzH = 1;
        zzaLb = zzbl1;
        zzaLc = zzbl1.zzzo();
        zzaLd = zzbl1.zzzp();
        zzaLe = zzbl1.zzzq();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

    IBinder zzyZ()
    {
        if(zzaLb == null)
            return null;
        else
            return zzaLb.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    public final zzas zzaLb;
    public final IntentFilter zzaLc[];
    public final String zzaLd;
    public final String zzaLe;
    final int zzzH;

}
