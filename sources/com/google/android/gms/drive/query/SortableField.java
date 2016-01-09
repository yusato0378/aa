// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzii;

public class SortableField
{

    public SortableField()
    {
    }

    public static final SortableMetadataField CREATED_DATE;
    public static final SortableMetadataField LAST_VIEWED_BY_ME;
    public static final SortableMetadataField MODIFIED_BY_ME_DATE;
    public static final SortableMetadataField MODIFIED_DATE;
    public static final SortableMetadataField QUOTA_USED;
    public static final SortableMetadataField SHARED_WITH_ME_DATE;
    public static final SortableMetadataField TITLE;

    static 
    {
        TITLE = zzig.zzaal;
        CREATED_DATE = zzii.zzaau;
        MODIFIED_DATE = zzii.zzaaw;
        MODIFIED_BY_ME_DATE = zzii.zzaax;
        LAST_VIEWED_BY_ME = zzii.zzaav;
        SHARED_WITH_ME_DATE = zzii.zzaay;
        QUOTA_USED = zzig.zzaai;
    }
}
