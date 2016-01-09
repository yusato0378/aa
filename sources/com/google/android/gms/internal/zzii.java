// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import com.google.android.gms.drive.metadata.SearchableOrderedMetadataField;
import com.google.android.gms.drive.metadata.SortableMetadataField;

public class zzii
{
    public static class zza extends com.google.android.gms.drive.metadata.internal.zzd
        implements SortableMetadataField
    {

        public zza(String s, int i)
        {
            super(s, i);
        }
    }

    public static class zzb extends com.google.android.gms.drive.metadata.internal.zzd
        implements SearchableOrderedMetadataField, SortableMetadataField
    {

        public zzb(String s, int i)
        {
            super(s, i);
        }
    }

    public static class zzc extends com.google.android.gms.drive.metadata.internal.zzd
        implements SortableMetadataField
    {

        public zzc(String s, int i)
        {
            super(s, i);
        }
    }

    public static class zzd extends com.google.android.gms.drive.metadata.internal.zzd
        implements SearchableOrderedMetadataField, SortableMetadataField
    {

        public zzd(String s, int i)
        {
            super(s, i);
        }
    }

    public static class zze extends com.google.android.gms.drive.metadata.internal.zzd
        implements SearchableOrderedMetadataField, SortableMetadataField
    {

        public zze(String s, int i)
        {
            super(s, i);
        }
    }


    public static final zza zzaau = new zza("created", 0x3e8fa0);
    public static final zzb zzaav = new zzb("lastOpenedTime", 0x419ce0);
    public static final zzd zzaaw = new zzd("modified", 0x3e8fa0);
    public static final zzc zzaax = new zzc("modifiedByMe", 0x3e8fa0);
    public static final zze zzaay = new zze("sharedWithMe", 0x3e8fa0);

}
