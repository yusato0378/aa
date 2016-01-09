// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzjm;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzk

public class DeleteAllUserDataRequest
    implements SafeParcelable
{

    DeleteAllUserDataRequest(int i, IBinder ibinder, String s)
    {
        zzzH = i;
        zzaeH = com.google.android.gms.internal.zzjm.zza.zzaS(ibinder);
        zzJd = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getPackageName()
    {
        return zzJd;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public String toString()
    {
        return String.format("DisableFitRequest", new Object[0]);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

    public IBinder zzpf()
    {
        return zzaeH.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzk();
    private final String zzJd;
    private final zzjm zzaeH;
    private final int zzzH;

}
