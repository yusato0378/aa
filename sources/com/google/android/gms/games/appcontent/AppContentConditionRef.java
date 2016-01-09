// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            MultiDataBufferRef, AppContentCondition, AppContentConditionEntity, AppContentUtils

public final class AppContentConditionRef extends MultiDataBufferRef
    implements AppContentCondition
{

    AppContentConditionRef(ArrayList arraylist, int i)
    {
        super(arraylist, 4, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return AppContentConditionEntity.zza(this, obj);
    }

    public Object freeze()
    {
        return zzqr();
    }

    public int hashCode()
    {
        return AppContentConditionEntity.zza(this);
    }

    public String toString()
    {
        return AppContentConditionEntity.zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((AppContentConditionEntity)zzqr()).writeToParcel(parcel, i);
    }

    public String zzqn()
    {
        return getString("condition_default_value");
    }

    public String zzqo()
    {
        return getString("condition_expected_value");
    }

    public String zzqp()
    {
        return getString("condition_predicate");
    }

    public Bundle zzqq()
    {
        return AppContentUtils.zzd(zzPy, zzahx, "condition_predicate_parameters", zzRw);
    }

    public AppContentCondition zzqr()
    {
        return new AppContentConditionEntity(this);
    }
}
