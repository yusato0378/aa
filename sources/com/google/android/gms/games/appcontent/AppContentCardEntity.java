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
//            AppContentCard, AppContentCardEntityCreator, AppContentAction, AppContentActionEntity, 
//            AppContentAnnotation, AppContentAnnotationEntity, AppContentCondition, AppContentConditionEntity

public final class AppContentCardEntity
    implements SafeParcelable, AppContentCard
{

    AppContentCardEntity(int i, ArrayList arraylist, ArrayList arraylist1, ArrayList arraylist2, String s, int j, String s1, 
            Bundle bundle, String s2, String s3, int k, String s4, String s5)
    {
        zzzH = i;
        mActions = arraylist;
        zzahp = arraylist1;
        zzahf = arraylist2;
        zzahg = s;
        zzahq = j;
        zzadH = s1;
        mExtras = bundle;
        zzGM = s5;
        zzahr = s2;
        zzWn = s3;
        zzahs = k;
        zzAV = s4;
    }

    public AppContentCardEntity(AppContentCard appcontentcard)
    {
        boolean flag = false;
        super();
        zzzH = 4;
        zzahg = appcontentcard.zzpY();
        zzahq = appcontentcard.zzqj();
        zzadH = appcontentcard.getDescription();
        mExtras = appcontentcard.getExtras();
        zzGM = appcontentcard.getId();
        zzWn = appcontentcard.getTitle();
        zzahr = appcontentcard.zzqk();
        zzahs = appcontentcard.zzql();
        zzAV = appcontentcard.getType();
        List list = appcontentcard.getActions();
        int l = list.size();
        mActions = new ArrayList(l);
        for(int i = 0; i < l; i++)
            mActions.add((AppContentActionEntity)(AppContentActionEntity)((AppContentAction)list.get(i)).freeze());

        list = appcontentcard.zzqi();
        l = list.size();
        zzahp = new ArrayList(l);
        for(int j = 0; j < l; j++)
            zzahp.add((AppContentAnnotationEntity)(AppContentAnnotationEntity)((AppContentAnnotation)list.get(j)).freeze());

        appcontentcard = appcontentcard.zzpX();
        l = appcontentcard.size();
        zzahf = new ArrayList(l);
        for(int k = ((flag) ? 1 : 0); k < l; k++)
            zzahf.add((AppContentConditionEntity)(AppContentConditionEntity)((AppContentCondition)appcontentcard.get(k)).freeze());

    }

    static int zza(AppContentCard appcontentcard)
    {
        return zzu.hashCode(new Object[] {
            appcontentcard.getActions(), appcontentcard.zzqi(), appcontentcard.zzpX(), appcontentcard.zzpY(), Integer.valueOf(appcontentcard.zzqj()), appcontentcard.getDescription(), appcontentcard.getExtras(), appcontentcard.getId(), appcontentcard.zzqk(), appcontentcard.getTitle(), 
            Integer.valueOf(appcontentcard.zzql()), appcontentcard.getType()
        });
    }

    static boolean zza(AppContentCard appcontentcard, Object obj)
    {
        boolean flag1 = true;
        if(obj instanceof AppContentCard) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(appcontentcard == obj) goto _L4; else goto _L3
_L3:
        obj = (AppContentCard)obj;
        if(!zzu.equal(((AppContentCard) (obj)).getActions(), appcontentcard.getActions()) || !zzu.equal(((AppContentCard) (obj)).zzqi(), appcontentcard.zzqi()) || !zzu.equal(((AppContentCard) (obj)).zzpX(), appcontentcard.zzpX()) || !zzu.equal(((AppContentCard) (obj)).zzpY(), appcontentcard.zzpY()) || !zzu.equal(Integer.valueOf(((AppContentCard) (obj)).zzqj()), Integer.valueOf(appcontentcard.zzqj())) || !zzu.equal(((AppContentCard) (obj)).getDescription(), appcontentcard.getDescription()) || !zzu.equal(((AppContentCard) (obj)).getExtras(), appcontentcard.getExtras()) || !zzu.equal(((AppContentCard) (obj)).getId(), appcontentcard.getId()) || !zzu.equal(((AppContentCard) (obj)).zzqk(), appcontentcard.zzqk()) || !zzu.equal(((AppContentCard) (obj)).getTitle(), appcontentcard.getTitle()) || !zzu.equal(Integer.valueOf(((AppContentCard) (obj)).zzql()), Integer.valueOf(appcontentcard.zzql())))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(((AppContentCard) (obj)).getType(), appcontentcard.getType())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(AppContentCard appcontentcard)
    {
        return zzu.zzq(appcontentcard).zzg("Actions", appcontentcard.getActions()).zzg("Annotations", appcontentcard.zzqi()).zzg("Conditions", appcontentcard.zzpX()).zzg("ContentDescription", appcontentcard.zzpY()).zzg("CurrentSteps", Integer.valueOf(appcontentcard.zzqj())).zzg("Description", appcontentcard.getDescription()).zzg("Extras", appcontentcard.getExtras()).zzg("Id", appcontentcard.getId()).zzg("Subtitle", appcontentcard.zzqk()).zzg("Title", appcontentcard.getTitle()).zzg("TotalSteps", Integer.valueOf(appcontentcard.zzql())).zzg("Type", appcontentcard.getType()).toString();
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
        return zzqm();
    }

    public List getActions()
    {
        return new ArrayList(mActions);
    }

    public String getDescription()
    {
        return zzadH;
    }

    public Bundle getExtras()
    {
        return mExtras;
    }

    public String getId()
    {
        return zzGM;
    }

    public String getTitle()
    {
        return zzWn;
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
        AppContentCardEntityCreator.zza(this, parcel, i);
    }

    public List zzpX()
    {
        return new ArrayList(zzahf);
    }

    public String zzpY()
    {
        return zzahg;
    }

    public List zzqi()
    {
        return new ArrayList(zzahp);
    }

    public int zzqj()
    {
        return zzahq;
    }

    public String zzqk()
    {
        return zzahr;
    }

    public int zzql()
    {
        return zzahs;
    }

    public AppContentCard zzqm()
    {
        return this;
    }

    public static final AppContentCardEntityCreator CREATOR = new AppContentCardEntityCreator();
    private final ArrayList mActions;
    private final Bundle mExtras;
    private final String zzAV;
    private final String zzGM;
    private final String zzWn;
    private final String zzadH;
    private final ArrayList zzahf;
    private final String zzahg;
    private final ArrayList zzahp;
    private final int zzahq;
    private final String zzahr;
    private final int zzahs;
    private final int zzzH;

}
