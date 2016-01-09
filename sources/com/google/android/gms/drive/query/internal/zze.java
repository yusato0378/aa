// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Iterator;
import java.util.Set;

class zze
{

    static MetadataField zzb(MetadataBundle metadatabundle)
    {
        metadatabundle = metadatabundle.zzol();
        if(metadatabundle.size() != 1)
            throw new IllegalArgumentException("bundle should have exactly 1 populated field");
        else
            return (MetadataField)metadatabundle.iterator().next();
    }
}
