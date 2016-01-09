// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            MultiDataBufferRef, AppContentAction, AppContentActionEntity, AppContentUtils, 
//            AppContentAnnotation

public final class AppContentActionRef extends MultiDataBufferRef
    implements AppContentAction
{

    AppContentActionRef(ArrayList arraylist, int i)
    {
        super(arraylist, 1, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return AppContentActionEntity.zza(this, obj);
    }

    public Object freeze()
    {
        return zzqa();
    }

    public Bundle getExtras()
    {
        return AppContentUtils.zzd(zzPy, zzahx, "action_data", zzRw);
    }

    public String getId()
    {
        return getString("action_id");
    }

    public String getType()
    {
        return getString("action_type");
    }

    public int hashCode()
    {
        return AppContentActionEntity.zza(this);
    }

    public String toString()
    {
        return AppContentActionEntity.zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((AppContentActionEntity)zzqa()).writeToParcel(parcel, i);
    }

    public AppContentAnnotation zzpW()
    {
        ArrayList arraylist = AppContentUtils.zzb(zzPy, zzahx, "action_annotation", zzRw);
        if(arraylist.size() == 1)
            return (AppContentAnnotation)arraylist.get(0);
        else
            return null;
    }

    public List zzpX()
    {
        return AppContentUtils.zzc(zzPy, zzahx, "action_conditions", zzRw);
    }

    public String zzpY()
    {
        return getString("action_content_description");
    }

    public String zzpZ()
    {
        return getString("overflow_text");
    }

    public AppContentAction zzqa()
    {
        return new AppContentActionEntity(this);
    }
}
