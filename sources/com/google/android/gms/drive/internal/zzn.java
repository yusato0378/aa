// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import com.google.android.gms.drive.Metadata;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public final class zzn extends Metadata
{

    public zzn(MetadataBundle metadatabundle)
    {
        zzXB = metadatabundle;
    }

    public Object freeze()
    {
        return zzny();
    }

    public boolean isDataValid()
    {
        return zzXB != null;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Metadata [mImpl=").append(zzXB).append("]").toString();
    }

    public Object zza(MetadataField metadatafield)
    {
        return zzXB.zza(metadatafield);
    }

    public Metadata zzny()
    {
        return new zzn(MetadataBundle.zza(zzXB));
    }

    private final MetadataBundle zzXB;
}
