// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, zza, zze, zzf, 
//            Operator

public class ComparisonFilter extends AbstractFilter
{

    ComparisonFilter(int i, Operator operator, MetadataBundle metadatabundle)
    {
        zzzH = i;
        zzaaM = operator;
        zzaaN = metadatabundle;
        zzaaO = zze.zzb(metadatabundle);
    }

    public ComparisonFilter(Operator operator, SearchableMetadataField searchablemetadatafield, Object obj)
    {
        this(1, operator, MetadataBundle.zza(searchablemetadatafield, obj));
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
        com.google.android.gms.drive.query.internal.zza.zza(this, parcel, i);
    }

    public Object zza(zzf zzf1)
    {
        return zzf1.zzb(zzaaM, zzaaO, getValue());
    }

    public static final zza CREATOR = new zza();
    final Operator zzaaM;
    final MetadataBundle zzaaN;
    final MetadataField zzaaO;
    final int zzzH;

}
