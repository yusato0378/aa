// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.metadata;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public interface MetadataField
{

    public abstract String getName();

    public abstract Object zza(DataHolder dataholder, int i, int j);

    public abstract void zza(DataHolder dataholder, MetadataBundle metadatabundle, int i, int j);

    public abstract void zza(Object obj, Bundle bundle);

    public abstract Object zzi(Bundle bundle);
}
