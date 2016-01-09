// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.ChangeSequenceNumber;
import java.util.*;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzaf

public class GetChangesRequest
    implements SafeParcelable
{

    GetChangesRequest(int i, ChangeSequenceNumber changesequencenumber, int j, List list)
    {
        Object obj;
        if(list == null)
            obj = null;
        else
            obj = new HashSet(list);
        this(i, changesequencenumber, j, list, ((Set) (obj)));
    }

    private GetChangesRequest(int i, ChangeSequenceNumber changesequencenumber, int j, List list, Set set)
    {
        zzzH = i;
        zzYF = changesequencenumber;
        zzYG = j;
        zzWO = list;
        zzWP = set;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzaf.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzaf();
    final List zzWO;
    private final Set zzWP;
    final ChangeSequenceNumber zzYF;
    final int zzYG;
    final int zzzH;

}
