// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.zzj;
import java.util.Arrays;

public class zzih extends zzj
{

    public zzih(int i)
    {
        super("customProperties", Arrays.asList(new String[] {
            "customProperties", "sqlId"
        }), Arrays.asList(new String[] {
            "customPropertiesExtra"
        }), i);
    }

    protected Object zzc(DataHolder dataholder, int i, int j)
    {
        return zzl(dataholder, i, j);
    }

    protected AppVisibleCustomProperties zzl(DataHolder dataholder, int i, int j)
    {
        return (AppVisibleCustomProperties)dataholder.zzlm().getSparseParcelableArray("customPropertiesExtra").get(i, AppVisibleCustomProperties.zzZA);
    }
}
