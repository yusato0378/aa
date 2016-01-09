// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzau

public class OnContentsResponse
    implements SafeParcelable
{

    OnContentsResponse(int i, Contents contents, boolean flag)
    {
        zzzH = i;
        zzXW = contents;
        zzZa = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzau.zza(this, parcel, i);
    }

    public Contents zznW()
    {
        return zzXW;
    }

    public boolean zznX()
    {
        return zzZa;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzau();
    final Contents zzXW;
    final boolean zzZa;
    final int zzzH;

}
