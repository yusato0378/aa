// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import java.util.*;

// Referenced classes of package com.google.android.gms.drive.query:
//            zzb

public class SortOrder
    implements SafeParcelable
{
    public static class Builder
    {

        public Builder addSortAscending(SortableMetadataField sortablemetadatafield)
        {
            zzaaK.add(new FieldWithSortOrder(sortablemetadatafield.getName(), true));
            return this;
        }

        public Builder addSortDescending(SortableMetadataField sortablemetadatafield)
        {
            zzaaK.add(new FieldWithSortOrder(sortablemetadatafield.getName(), false));
            return this;
        }

        public SortOrder build()
        {
            return new SortOrder(zzaaK, zzaaL);
        }

        private final List zzaaK = new ArrayList();
        private boolean zzaaL;

        public Builder()
        {
            zzaaL = false;
        }
    }


    SortOrder(int i, List list, boolean flag)
    {
        zzzH = i;
        zzaaK = list;
        zzaaL = flag;
    }

    private SortOrder(List list, boolean flag)
    {
        this(1, list, flag);
    }


    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return String.format(Locale.US, "SortOrder[%s, %s]", new Object[] {
            TextUtils.join(",", zzaaK), Boolean.valueOf(zzaaL)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    final List zzaaK;
    final boolean zzaaL;
    final int zzzH;

}
