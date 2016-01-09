// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            MultiDataBufferRef, AppContentCard, AppContentCardEntity, AppContentUtils

public final class AppContentCardRef extends MultiDataBufferRef
    implements AppContentCard
{

    AppContentCardRef(ArrayList arraylist, int i)
    {
        super(arraylist, 0, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return AppContentCardEntity.zza(this, obj);
    }

    public Object freeze()
    {
        return zzqm();
    }

    public List getActions()
    {
        return AppContentUtils.zza(zzPy, zzahx, "card_actions", zzRw);
    }

    public String getDescription()
    {
        return getString("card_description");
    }

    public Bundle getExtras()
    {
        return AppContentUtils.zzd(zzPy, zzahx, "card_data", zzRw);
    }

    public String getId()
    {
        return getString("card_id");
    }

    public String getTitle()
    {
        return getString("card_title");
    }

    public String getType()
    {
        return getString("card_type");
    }

    public int hashCode()
    {
        return AppContentCardEntity.zza(this);
    }

    public String toString()
    {
        return AppContentCardEntity.zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((AppContentCardEntity)zzqm()).writeToParcel(parcel, i);
    }

    public List zzpX()
    {
        return AppContentUtils.zzc(zzPy, zzahx, "card_conditions", zzRw);
    }

    public String zzpY()
    {
        return getString("card_content_description");
    }

    public List zzqi()
    {
        return AppContentUtils.zzb(zzPy, zzahx, "card_annotations", zzRw);
    }

    public int zzqj()
    {
        return getInteger("card_current_steps");
    }

    public String zzqk()
    {
        return getString("card_subtitle");
    }

    public int zzql()
    {
        return getInteger("card_total_steps");
    }

    public AppContentCard zzqm()
    {
        return new AppContentCardEntity(this);
    }
}
