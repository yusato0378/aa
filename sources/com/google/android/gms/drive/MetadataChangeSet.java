// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive;

import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzii;
import java.util.*;

public final class MetadataChangeSet
{
    public static class Builder
    {

        private int zzcb(String s)
        {
            if(s == null)
                return 0;
            else
                return s.getBytes().length;
        }

        private String zzj(String s, int i, int j)
        {
            return String.format("%s must be no more than %d bytes, but is %d bytes.", new Object[] {
                s, Integer.valueOf(i), Integer.valueOf(j)
            });
        }

        private void zzk(String s, int i, int j)
        {
            boolean flag;
            if(j <= i)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, zzj(s, i, j));
        }

        private com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza zznA()
        {
            if(zzWm == null)
                zzWm = new com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza();
            return zzWm;
        }

        public MetadataChangeSet build()
        {
            if(zzWm != null)
                zzWl.zzb(zzig.zzZJ, zzWm.zzoh());
            return new MetadataChangeSet(zzWl);
        }

        public Builder deleteCustomProperty(CustomPropertyKey custompropertykey)
        {
            zzv.zzb(custompropertykey, "key");
            zznA().zza(custompropertykey, null);
            return this;
        }

        public Builder setCustomProperty(CustomPropertyKey custompropertykey, String s)
        {
            zzv.zzb(custompropertykey, "key");
            zzv.zzb(s, "value");
            zzk("The total size of key string and value string of a custom property", 124, zzcb(custompropertykey.getKey()) + zzcb(s));
            zznA().zza(custompropertykey, s);
            return this;
        }

        public Builder setDescription(String s)
        {
            zzWl.zzb(zzig.zzZK, s);
            return this;
        }

        public Builder setIndexableText(String s)
        {
            zzk("Indexable text size", 0x20000, zzcb(s));
            zzWl.zzb(zzig.zzZP, s);
            return this;
        }

        public Builder setLastViewedByMeDate(Date date)
        {
            zzWl.zzb(zzii.zzaav, date);
            return this;
        }

        public Builder setMimeType(String s)
        {
            zzWl.zzb(zzig.zzaac, s);
            return this;
        }

        public Builder setPinned(boolean flag)
        {
            zzWl.zzb(zzig.zzZU, Boolean.valueOf(flag));
            return this;
        }

        public Builder setStarred(boolean flag)
        {
            zzWl.zzb(zzig.zzaaj, Boolean.valueOf(flag));
            return this;
        }

        public Builder setTitle(String s)
        {
            zzWl.zzb(zzig.zzaal, s);
            return this;
        }

        public Builder setViewed(boolean flag)
        {
            zzWl.zzb(zzig.zzaab, Boolean.valueOf(flag));
            return this;
        }

        private final MetadataBundle zzWl = MetadataBundle.zzok();
        private com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza zzWm;

        public Builder()
        {
        }
    }


    public MetadataChangeSet(MetadataBundle metadatabundle)
    {
        zzWl = MetadataBundle.zza(metadatabundle);
    }

    public Map getCustomPropertyChangeMap()
    {
        AppVisibleCustomProperties appvisiblecustomproperties = (AppVisibleCustomProperties)zzWl.zza(zzig.zzZJ);
        if(appvisiblecustomproperties == null)
            return Collections.emptyMap();
        else
            return appvisiblecustomproperties.zzog();
    }

    public String getDescription()
    {
        return (String)zzWl.zza(zzig.zzZK);
    }

    public String getIndexableText()
    {
        return (String)zzWl.zza(zzig.zzZP);
    }

    public Date getLastViewedByMeDate()
    {
        return (Date)zzWl.zza(zzii.zzaav);
    }

    public String getMimeType()
    {
        return (String)zzWl.zza(zzig.zzaac);
    }

    public String getTitle()
    {
        return (String)zzWl.zza(zzig.zzaal);
    }

    public Boolean isPinned()
    {
        return (Boolean)zzWl.zza(zzig.zzZU);
    }

    public Boolean isStarred()
    {
        return (Boolean)zzWl.zza(zzig.zzaaj);
    }

    public Boolean isViewed()
    {
        return (Boolean)zzWl.zza(zzig.zzaab);
    }

    public MetadataBundle zznz()
    {
        return zzWl;
    }

    public static final int CUSTOM_PROPERTY_SIZE_LIMIT_BYTES = 124;
    public static final int INDEXABLE_TEXT_SIZE_LIMIT_BYTES = 0x20000;
    public static final int MAX_PRIVATE_PROPERTIES_PER_RESOURCE_PER_APP = 30;
    public static final int MAX_PUBLIC_PROPERTIES_PER_RESOURCE = 30;
    public static final int MAX_TOTAL_PROPERTIES_PER_RESOURCE = 100;
    public static final MetadataChangeSet zzWk = new MetadataChangeSet(MetadataBundle.zzok());
    private final MetadataBundle zzWl;

}
