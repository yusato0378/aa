// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.safetynet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.safetynet:
//            zza

public class AttestationData
    implements SafeParcelable
{

    AttestationData(int i, String s)
    {
        zzzH = i;
        zzaBk = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getJwsResult()
    {
        return zzaBk;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    private String zzaBk;
    public final int zzzH;

}
