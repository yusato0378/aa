// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentCondition, AppContentConditionEntityCreator

public final class AppContentConditionEntity
    implements SafeParcelable, AppContentCondition
{

    AppContentConditionEntity(int i, String s, String s1, String s2, Bundle bundle)
    {
        zzzH = i;
        zzaht = s;
        zzahu = s1;
        zzahv = s2;
        zzahw = bundle;
    }

    public AppContentConditionEntity(AppContentCondition appcontentcondition)
    {
        zzzH = 1;
        zzaht = appcontentcondition.zzqn();
        zzahu = appcontentcondition.zzqo();
        zzahv = appcontentcondition.zzqp();
        zzahw = appcontentcondition.zzqq();
    }

    static int zza(AppContentCondition appcontentcondition)
    {
        return zzu.hashCode(new Object[] {
            appcontentcondition.zzqn(), appcontentcondition.zzqo(), appcontentcondition.zzqp(), appcontentcondition.zzqq()
        });
    }

    static boolean zza(AppContentCondition appcontentcondition, Object obj)
    {
        boolean flag1 = true;
        if(obj instanceof AppContentCondition) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(appcontentcondition == obj) goto _L4; else goto _L3
_L3:
        obj = (AppContentCondition)obj;
        if(!zzu.equal(((AppContentCondition) (obj)).zzqn(), appcontentcondition.zzqn()) || !zzu.equal(((AppContentCondition) (obj)).zzqo(), appcontentcondition.zzqo()) || !zzu.equal(((AppContentCondition) (obj)).zzqp(), appcontentcondition.zzqp()))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(((AppContentCondition) (obj)).zzqq(), appcontentcondition.zzqq())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(AppContentCondition appcontentcondition)
    {
        return zzu.zzq(appcontentcondition).zzg("DefaultValue", appcontentcondition.zzqn()).zzg("ExpectedValue", appcontentcondition.zzqo()).zzg("Predicate", appcontentcondition.zzqp()).zzg("PredicateParameters", appcontentcondition.zzqq()).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public Object freeze()
    {
        return zzqr();
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zza(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AppContentConditionEntityCreator.zza(this, parcel, i);
    }

    public String zzqn()
    {
        return zzaht;
    }

    public String zzqo()
    {
        return zzahu;
    }

    public String zzqp()
    {
        return zzahv;
    }

    public Bundle zzqq()
    {
        return zzahw;
    }

    public AppContentCondition zzqr()
    {
        return this;
    }

    public static final AppContentConditionEntityCreator CREATOR = new AppContentConditionEntityCreator();
    private final String zzaht;
    private final String zzahu;
    private final String zzahv;
    private final Bundle zzahw;
    private final int zzzH;

}
