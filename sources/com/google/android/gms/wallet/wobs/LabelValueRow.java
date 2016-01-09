// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzhq;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            zzc

public final class LabelValueRow
    implements SafeParcelable
{

    LabelValueRow()
    {
        zzzH = 1;
        zzaKl = zzhq.zznc();
    }

    LabelValueRow(int i, String s, String s1, ArrayList arraylist)
    {
        zzzH = i;
        zzaKj = s;
        zzaKk = s1;
        zzaKl = arraylist;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    String zzaKj;
    String zzaKk;
    ArrayList zzaKl;
    private final int zzzH;

}
