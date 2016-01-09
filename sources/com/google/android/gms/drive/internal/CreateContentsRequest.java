// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzi

public class CreateContentsRequest
    implements SafeParcelable
{

    public CreateContentsRequest(int i)
    {
        this(1, i);
    }

    CreateContentsRequest(int i, int j)
    {
        zzzH = i;
        boolean flag;
        if(j == 0x20000000 || j == 0x30000000)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "Cannot create a new read-only contents!");
        zzVK = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzi();
    final int zzVK;
    final int zzzH;

}
