// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            zzk, zzb, zza

public final class UnsubscribeRequest
    implements SafeParcelable
{

    UnsubscribeRequest()
    {
        versionCode = 1;
    }

    UnsubscribeRequest(int i, IBinder ibinder, IBinder ibinder1, PendingIntent pendingintent)
    {
        versionCode = i;
        zzaxS = zza.zza.zzch(ibinder);
        zzaxR = zzb.zza.zzci(ibinder1);
        zzaxU = pendingintent;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

    IBinder zzve()
    {
        return zzaxR.asBinder();
    }

    IBinder zzvf()
    {
        if(zzaxS == null)
            return null;
        else
            return zzaxS.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzk();
    final int versionCode;
    public zzb zzaxR;
    public zza zzaxS;
    public PendingIntent zzaxU;

}
