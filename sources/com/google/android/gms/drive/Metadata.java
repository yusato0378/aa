// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.internal.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.drive:
//            DriveId

public abstract class Metadata
    implements Freezable
{

    public Metadata()
    {
    }

    public String getAlternateLink()
    {
        return (String)zza(zzig.zzZI);
    }

    public int getContentAvailability()
    {
        Integer integer = (Integer)zza(zzik.zzaaA);
        if(integer == null)
            return 0;
        else
            return integer.intValue();
    }

    public Date getCreatedDate()
    {
        return (Date)zza(zzii.zzaau);
    }

    public Map getCustomProperties()
    {
        AppVisibleCustomProperties appvisiblecustomproperties = (AppVisibleCustomProperties)zza(zzig.zzZJ);
        if(appvisiblecustomproperties == null)
            return Collections.emptyMap();
        else
            return appvisiblecustomproperties.zzog();
    }

    public String getDescription()
    {
        return (String)zza(zzig.zzZK);
    }

    public DriveId getDriveId()
    {
        return (DriveId)zza(zzig.zzZH);
    }

    public String getEmbedLink()
    {
        return (String)zza(zzig.zzZL);
    }

    public String getFileExtension()
    {
        return (String)zza(zzig.zzZM);
    }

    public long getFileSize()
    {
        return ((Long)zza(zzig.zzZN)).longValue();
    }

    public Date getLastViewedByMeDate()
    {
        return (Date)zza(zzii.zzaav);
    }

    public String getMimeType()
    {
        return (String)zza(zzig.zzaac);
    }

    public Date getModifiedByMeDate()
    {
        return (Date)zza(zzii.zzaax);
    }

    public Date getModifiedDate()
    {
        return (Date)zza(zzii.zzaaw);
    }

    public String getOriginalFilename()
    {
        return (String)zza(zzig.zzaad);
    }

    public long getQuotaBytesUsed()
    {
        return ((Long)zza(zzig.zzaai)).longValue();
    }

    public Date getSharedWithMeDate()
    {
        return (Date)zza(zzii.zzaay);
    }

    public String getTitle()
    {
        return (String)zza(zzig.zzaal);
    }

    public String getWebContentLink()
    {
        return (String)zza(zzig.zzaan);
    }

    public String getWebViewLink()
    {
        return (String)zza(zzig.zzaao);
    }

    public boolean isEditable()
    {
        Boolean boolean1 = (Boolean)zza(zzig.zzZS);
        if(boolean1 == null)
            return false;
        else
            return boolean1.booleanValue();
    }

    public boolean isExplicitlyTrashed()
    {
        Boolean boolean1 = (Boolean)zza(zzig.zzZT);
        if(boolean1 == null)
            return false;
        else
            return boolean1.booleanValue();
    }

    public boolean isFolder()
    {
        return "application/vnd.google-apps.folder".equals(getMimeType());
    }

    public boolean isInAppFolder()
    {
        Boolean boolean1 = (Boolean)zza(zzig.zzZQ);
        if(boolean1 == null)
            return false;
        else
            return boolean1.booleanValue();
    }

    public boolean isPinnable()
    {
        Boolean boolean1 = (Boolean)zza(zzik.zzaaB);
        if(boolean1 == null)
            return false;
        else
            return boolean1.booleanValue();
    }

    public boolean isPinned()
    {
        Boolean boolean1 = (Boolean)zza(zzig.zzZU);
        if(boolean1 == null)
            return false;
        else
            return boolean1.booleanValue();
    }

    public boolean isRestricted()
    {
        Boolean boolean1 = (Boolean)zza(zzig.zzZW);
        if(boolean1 == null)
            return false;
        else
            return boolean1.booleanValue();
    }

    public boolean isShared()
    {
        Boolean boolean1 = (Boolean)zza(zzig.zzZX);
        if(boolean1 == null)
            return false;
        else
            return boolean1.booleanValue();
    }

    public boolean isStarred()
    {
        Boolean boolean1 = (Boolean)zza(zzig.zzaaj);
        if(boolean1 == null)
            return false;
        else
            return boolean1.booleanValue();
    }

    public boolean isTrashable()
    {
        Boolean boolean1 = (Boolean)zza(zzig.zzaaa);
        if(boolean1 == null)
            return true;
        else
            return boolean1.booleanValue();
    }

    public boolean isTrashed()
    {
        Boolean boolean1 = (Boolean)zza(zzig.zzaam);
        if(boolean1 == null)
            return false;
        else
            return boolean1.booleanValue();
    }

    public boolean isViewed()
    {
        Boolean boolean1 = (Boolean)zza(zzig.zzaab);
        if(boolean1 == null)
            return false;
        else
            return boolean1.booleanValue();
    }

    public abstract Object zza(MetadataField metadatafield);

    public static final int CONTENT_AVAILABLE_LOCALLY = 1;
    public static final int CONTENT_NOT_AVAILABLE_LOCALLY = 0;
}
