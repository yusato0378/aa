// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, zzb, zze, zzf

public class FieldOnlyFilter extends AbstractFilter
{

    FieldOnlyFilter(int i, MetadataBundle metadatabundle)
    {
        zzzH = i;
        zzaaN = metadatabundle;
        zzaaO = zze.zzb(metadatabundle);
    }

    public FieldOnlyFilter(SearchableMetadataField searchablemetadatafield)
    {
        this(1, MetadataBundle.zza(searchablemetadatafield, null));
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

    public Object zza(zzf zzf1)
    {
        return zzf1.zze(zzaaO);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    final MetadataBundle zzaaN;
    private final MetadataField zzaaO;
    final int zzzH;

}
