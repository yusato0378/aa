// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzbc, zzas

public class RemoveListenerRequest
    implements SafeParcelable
{

    RemoveListenerRequest(int i, IBinder ibinder)
    {
        zzzH = i;
        if(ibinder != null)
        {
            zzaLb = zzas.zza.zzcT(ibinder);
            return;
        } else
        {
            zzaLb = null;
            return;
        }
    }

    public RemoveListenerRequest(zzas zzas1)
    {
        zzzH = 1;
        zzaLb = zzas1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzbc.zza(this, parcel, i);
    }

    IBinder zzyZ()
    {
        if(zzaLb == null)
            return null;
        else
            return zzaLb.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzbc();
    public final zzas zzaLb;
    final int zzzH;

}
