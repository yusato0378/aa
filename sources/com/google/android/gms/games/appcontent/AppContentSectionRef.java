// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            MultiDataBufferRef, AppContentSection, AppContentSectionEntity, AppContentUtils, 
//            AppContentCardRef

public final class AppContentSectionRef extends MultiDataBufferRef
    implements AppContentSection
{

    AppContentSectionRef(ArrayList arraylist, int i, int j)
    {
        super(arraylist, 0, i);
        zzahA = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return AppContentSectionEntity.zza(this, obj);
    }

    public Object freeze()
    {
        return zzqu();
    }

    public List getActions()
    {
        return zzqv();
    }

    public Bundle getExtras()
    {
        return AppContentUtils.zzd(zzPy, zzahx, "section_data", zzRw);
    }

    public String getId()
    {
        return getString("section_id");
    }

    public String getTitle()
    {
        return getString("section_title");
    }

    public String getType()
    {
        return getString("section_type");
    }

    public int hashCode()
    {
        return AppContentSectionEntity.zza(this);
    }

    public String toString()
    {
        return AppContentSectionEntity.zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((AppContentSectionEntity)zzqu()).writeToParcel(parcel, i);
    }

    public String zzpY()
    {
        return getString("section_content_description");
    }

    public List zzqi()
    {
        return zzqw();
    }

    public String zzqk()
    {
        return getString("section_subtitle");
    }

    public List zzqs()
    {
        return zzqx();
    }

    public String zzqt()
    {
        return getString("section_card_type");
    }

    public AppContentSection zzqu()
    {
        return new AppContentSectionEntity(this);
    }

    public ArrayList zzqv()
    {
        return AppContentUtils.zza(zzPy, zzahx, "section_actions", zzRw);
    }

    public ArrayList zzqw()
    {
        return AppContentUtils.zzb(zzPy, zzahx, "section_annotations", zzRw);
    }

    public ArrayList zzqx()
    {
        ArrayList arraylist = new ArrayList(zzahA);
        for(int i = 0; i < zzahA; i++)
            arraylist.add(new AppContentCardRef(zzahx, zzRw + i));

        return arraylist;
    }

    private final int zzahA;
}
