// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, zzh, zze, zzf

public class HasFilter extends AbstractFilter
{

    HasFilter(int i, MetadataBundle metadatabundle)
    {
        zzzH = i;
        zzaaN = metadatabundle;
        zzaaO = zze.zzb(metadatabundle);
    }

    public HasFilter(SearchableMetadataField searchablemetadatafield, Object obj)
    {
        this(1, MetadataBundle.zza(searchablemetadatafield, obj));
    }

    public int describeContents()
    {
        return 0;
    }

    public Object getValue()
    {
        return zzaaN.zza(zzaaO);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    public Object zza(zzf zzf1)
    {
        return zzf1.zzd(zzaaO, getValue());
    }

    public static final zzh CREATOR = new zzh();
    final MetadataBundle zzaaN;
    final MetadataField zzaaO;
    final int zzzH;

}
