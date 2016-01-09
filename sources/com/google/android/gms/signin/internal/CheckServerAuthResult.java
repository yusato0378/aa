// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.*;

// Referenced classes of package com.google.android.gms.signin.internal:
//            zzc

public class CheckServerAuthResult
    implements SafeParcelable
{

    CheckServerAuthResult(int i, boolean flag, List list)
    {
        zzzH = i;
        zzaBL = flag;
        zzaBM = list;
    }

    public CheckServerAuthResult(boolean flag, Set set)
    {
        this(1, flag, zzf(set));
    }

    private static List zzf(Set set)
    {
        if(set == null)
            return Collections.emptyList();
        else
            return Collections.unmodifiableList(new ArrayList(set));
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    final boolean zzaBL;
    final List zzaBM;
    final int zzzH;

}
