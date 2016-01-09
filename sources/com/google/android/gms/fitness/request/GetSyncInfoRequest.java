// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzjn;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzm

public class GetSyncInfoRequest
    implements SafeParcelable
{

    GetSyncInfoRequest(int i, IBinder ibinder, String s)
    {
        zzzH = i;
        zzaff = com.google.android.gms.internal.zzjn.zza.zzaT(ibinder);
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
        return String.format("GetSyncInfoRequest {%d, %s, %s}", new Object[] {
            Integer.valueOf(zzzH), zzaff, zzJd
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzm.zza(this, parcel, i);
    }

    public IBinder zzpf()
    {
        return zzaff.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzm();
    private final String zzJd;
    private final zzjn zzaff;
    private final int zzzH;

}
