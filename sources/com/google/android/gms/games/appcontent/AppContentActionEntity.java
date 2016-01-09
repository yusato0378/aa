// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentAction, AppContentActionEntityCreator, AppContentAnnotation, AppContentAnnotationEntity, 
//            AppContentCondition, AppContentConditionEntity

public final class AppContentActionEntity
    implements SafeParcelable, AppContentAction
{

    AppContentActionEntity(int i, ArrayList arraylist, String s, Bundle bundle, String s1, String s2, AppContentAnnotationEntity appcontentannotationentity, 
            String s3)
    {
        zzzH = i;
        zzahh = appcontentannotationentity;
        zzahf = arraylist;
        zzahg = s;
        mExtras = bundle;
        zzGM = s2;
        zzahi = s3;
        zzAV = s1;
    }

    public AppContentActionEntity(AppContentAction appcontentaction)
    {
        zzzH = 5;
        zzahh = (AppContentAnnotationEntity)appcontentaction.zzpW().freeze();
        zzahg = appcontentaction.zzpY();
        mExtras = appcontentaction.getExtras();
        zzGM = appcontentaction.getId();
        zzahi = appcontentaction.zzpZ();
        zzAV = appcontentaction.getType();
        appcontentaction = appcontentaction.zzpX();
        int j = appcontentaction.size();
        zzahf = new ArrayList(j);
        for(int i = 0; i < j; i++)
            zzahf.add((AppContentConditionEntity)(AppContentConditionEntity)((AppContentCondition)appcontentaction.get(i)).freeze());

    }

    static int zza(AppContentAction appcontentaction)
    {
        return zzu.hashCode(new Object[] {
            appcontentaction.zzpW(), appcontentaction.zzpX(), appcontentaction.zzpY(), appcontentaction.getExtras(), appcontentaction.getId(), appcontentaction.zzpZ(), appcontentaction.getType()
        });
    }

    static boolean zza(AppContentAction appcontentaction, Object obj)
    {
        boolean flag1 = true;
        if(obj instanceof AppContentAction) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(appcontentaction == obj) goto _L4; else goto _L3
_L3:
        obj = (AppContentAction)obj;
        if(!zzu.equal(((AppContentAction) (obj)).zzpW(), appcontentaction.zzpW()) || !zzu.equal(((AppContentAction) (obj)).zzpX(), appcontentaction.zzpX()) || !zzu.equal(((AppContentAction) (obj)).zzpY(), appcontentaction.zzpY()) || !zzu.equal(((AppContentAction) (obj)).getExtras(), appcontentaction.getExtras()) || !zzu.equal(((AppContentAction) (obj)).getId(), appcontentaction.getId()) || !zzu.equal(((AppContentAction) (obj)).zzpZ(), appcontentaction.zzpZ()))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(((AppContentAction) (obj)).getType(), appcontentaction.getType())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(AppContentAction appcontentaction)
    {
        return zzu.zzq(appcontentaction).zzg("Annotation", appcontentaction.zzpW()).zzg("Conditions", appcontentaction.zzpX()).zzg("ContentDescription", appcontentaction.zzpY()).zzg("Extras", appcontentaction.getExtras()).zzg("Id", appcontentaction.getId()).zzg("OverflowText", appcontentaction.zzpZ()).zzg("Type", appcontentaction.getType()).toString();
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
        return zzqa();
    }

    public Bundle getExtras()
    {
        return mExtras;
    }

    public String getId()
    {
        return zzGM;
    }

    public String getType()
    {
        return zzAV;
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
        AppContentActionEntityCreator.zza(this, parcel, i);
    }

    public AppContentAnnotation zzpW()
    {
        return zzahh;
    }

    public List zzpX()
    {
        return new ArrayList(zzahf);
    }

    public String zzpY()
    {
        return zzahg;
    }

    public String zzpZ()
    {
        return zzahi;
    }

    public AppContentAction zzqa()
    {
        return this;
    }

    public static final AppContentActionEntityCreator CREATOR = new AppContentActionEntityCreator();
    private final Bundle mExtras;
    private final String zzAV;
    private final String zzGM;
    private final ArrayList zzahf;
    private final String zzahg;
    private final AppContentAnnotationEntity zzahh;
    private final String zzahi;
    private final int zzzH;

}
