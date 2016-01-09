// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            zzi, zzb, zza

public final class SubscribeRequest
    implements SafeParcelable
{

    SubscribeRequest()
    {
        versionCode = 2;
    }

    SubscribeRequest(int i, IBinder ibinder, Strategy strategy, IBinder ibinder1, MessageFilter messagefilter, PendingIntent pendingintent)
    {
        versionCode = i;
        zzaxS = zza.zza.zzch(ibinder);
        zzaxQ = strategy;
        zzaxR = zzb.zza.zzci(ibinder1);
        zzaxT = messagefilter;
        zzaxU = pendingintent;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.zza(this, parcel, i);
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

    public static final android.os.Parcelable.Creator CREATOR = new zzi();
    final int versionCode;
    public Strategy zzaxQ;
    public zzb zzaxR;
    public zza zzaxS;
    public MessageFilter zzaxT;
    public PendingIntent zzaxU;

}
