// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.*;

// Referenced classes of package com.google.android.gms.drive.events:
//            zzd

public final class ChangesAvailableOptions
    implements SafeParcelable
{

    ChangesAvailableOptions(int i, int j, boolean flag, List list)
    {
        Object obj;
        if(list == null)
            obj = null;
        else
            obj = new HashSet(list);
        this(i, j, flag, list, ((Set) (obj)));
    }

    private ChangesAvailableOptions(int i, int j, boolean flag, List list, Set set)
    {
        zzzH = i;
        zzWM = j;
        zzWN = flag;
        zzWO = list;
        zzWP = set;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = true;
        if(obj != null && obj.getClass() == getClass()) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(obj == this) goto _L4; else goto _L3
_L3:
        obj = (ChangesAvailableOptions)obj;
        if(!zzu.equal(zzWP, ((ChangesAvailableOptions) (obj)).zzWP) || zzWM != ((ChangesAvailableOptions) (obj)).zzWM)
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzWN == ((ChangesAvailableOptions) (obj)).zzWN) goto _L4; else goto _L5
_L5:
        return false;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzWP, Integer.valueOf(zzWM), Boolean.valueOf(zzWN)
        });
    }

    public String toString()
    {
        return String.format(Locale.US, "ChangesAvailableOptions[ChangesSizeLimit=%d, Repeats=%s, Spaces=%s]", new Object[] {
            Integer.valueOf(zzWM), Boolean.valueOf(zzWN), zzWO
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzd();
    final int zzWM;
    final boolean zzWN;
    final List zzWO;
    private final Set zzWP;
    final int zzzH;

}
