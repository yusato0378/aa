// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.*;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            zzk, PartialDriveId

public class ParentDriveIdSet
    implements SafeParcelable
{

    public ParentDriveIdSet()
    {
        this(1, ((List) (new ArrayList())));
    }

    ParentDriveIdSet(int i, List list)
    {
        zzzH = i;
        zzZG = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

    public Set zzB(long l)
    {
        HashSet hashset = new HashSet();
        for(Iterator iterator = zzZG.iterator(); iterator.hasNext(); hashset.add(((PartialDriveId)iterator.next()).zzC(l)));
        return hashset;
    }

    public void zza(PartialDriveId partialdriveid)
    {
        zzZG.add(partialdriveid);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzk();
    final List zzZG;
    final int zzzH;

}
