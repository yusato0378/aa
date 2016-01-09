// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.*;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzii;

public class SearchableField
{

    public SearchableField()
    {
    }

    public static final SearchableMetadataField IS_PINNED;
    public static final SearchableOrderedMetadataField LAST_VIEWED_BY_ME;
    public static final SearchableMetadataField MIME_TYPE;
    public static final SearchableOrderedMetadataField MODIFIED_DATE;
    public static final SearchableCollectionMetadataField PARENTS;
    public static final SearchableMetadataField STARRED;
    public static final SearchableMetadataField TITLE;
    public static final SearchableMetadataField TRASHED;
    public static final SearchableOrderedMetadataField zzaaI;
    public static final SearchableMetadataField zzaaJ;

    static 
    {
        TITLE = zzig.zzaal;
        MIME_TYPE = zzig.zzaac;
        TRASHED = zzig.zzaam;
        PARENTS = zzig.zzaah;
        zzaaI = zzii.zzaay;
        STARRED = zzig.zzaaj;
        MODIFIED_DATE = zzii.zzaaw;
        LAST_VIEWED_BY_ME = zzii.zzaav;
        IS_PINNED = zzig.zzZU;
        zzaaJ = zzig.zzZJ;
    }
}
