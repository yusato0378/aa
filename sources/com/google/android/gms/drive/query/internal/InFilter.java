// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.metadata.zzb;
import java.util.*;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, zzi, zze, zzf

public class InFilter extends AbstractFilter
{

    InFilter(int i, MetadataBundle metadatabundle)
    {
        zzzH = i;
        zzaaN = metadatabundle;
        zzaaZ = (zzb)com.google.android.gms.drive.query.internal.zze.zzb(metadatabundle);
    }

    public InFilter(SearchableCollectionMetadataField searchablecollectionmetadatafield, Object obj)
    {
        this(1, MetadataBundle.zza(searchablecollectionmetadatafield, Collections.singleton(obj)));
    }

    public int describeContents()
    {
        return 0;
    }

    public Object getValue()
    {
        return ((Collection)zzaaN.zza(zzaaZ)).iterator().next();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.zza(this, parcel, i);
    }

    public Object zza(zzf zzf1)
    {
        return zzf1.zzb(zzaaZ, getValue());
    }

    public static final zzi CREATOR = new zzi();
    final MetadataBundle zzaaN;
    private final zzb zzaaZ;
    final int zzzH;

}
