// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            MultiDataBufferRef, AppContentAnnotation, AppContentAnnotationEntity, AppContentUtils

public final class AppContentAnnotationRef extends MultiDataBufferRef
    implements AppContentAnnotation
{

    AppContentAnnotationRef(ArrayList arraylist, int i)
    {
        super(arraylist, 2, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return AppContentAnnotationEntity.zza(this, obj);
    }

    public Object freeze()
    {
        return zzqh();
    }

    public String getDescription()
    {
        return getString("annotation_description");
    }

    public String getId()
    {
        return getString("annotation_id");
    }

    public String getTitle()
    {
        return getString("annotation_title");
    }

    public int hashCode()
    {
        return AppContentAnnotationEntity.zza(this);
    }

    public String toString()
    {
        return AppContentAnnotationEntity.zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((AppContentAnnotationEntity)zzqh()).writeToParcel(parcel, i);
    }

    public String zzqb()
    {
        return getString("annotation_image_default_id");
    }

    public int zzqc()
    {
        return getInteger("annotation_image_height");
    }

    public Uri zzqd()
    {
        return zzbG("annotation_image_uri");
    }

    public Bundle zzqe()
    {
        return AppContentUtils.zzd(zzPy, zzahx, "annotation_modifiers", zzRw);
    }

    public int zzqf()
    {
        return getInteger("annotation_image_width");
    }

    public String zzqg()
    {
        return getString("annotation_layout_slot");
    }

    public AppContentAnnotation zzqh()
    {
        return new AppContentAnnotationEntity(this);
    }
}
