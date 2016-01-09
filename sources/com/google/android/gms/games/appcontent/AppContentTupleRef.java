// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentTuple, AppContentTupleEntity

public final class AppContentTupleRef extends zzc
    implements AppContentTuple
{

    AppContentTupleRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return AppContentTupleEntity.zza(this, obj);
    }

    public Object freeze()
    {
        return zzqy();
    }

    public String getName()
    {
        return getString("tuple_name");
    }

    public String getValue()
    {
        return getString("tuple_value");
    }

    public int hashCode()
    {
        return AppContentTupleEntity.zza(this);
    }

    public String toString()
    {
        return AppContentTupleEntity.zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((AppContentTupleEntity)zzqy()).writeToParcel(parcel, i);
    }

    public AppContentTuple zzqy()
    {
        return new AppContentTupleEntity(this);
    }
}
