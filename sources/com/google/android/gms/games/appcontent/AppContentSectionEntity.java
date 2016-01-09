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
//            AppContentSection, AppContentSectionEntityCreator, AppContentAction, AppContentActionEntity, 
//            AppContentCard, AppContentCardEntity, AppContentAnnotation, AppContentAnnotationEntity

public final class AppContentSectionEntity
    implements SafeParcelable, AppContentSection
{

    AppContentSectionEntity(int i, ArrayList arraylist, ArrayList arraylist1, String s, Bundle bundle, String s1, String s2, 
            String s3, String s4, String s5, ArrayList arraylist2)
    {
        zzzH = i;
        mActions = arraylist;
        zzahp = arraylist2;
        zzahy = arraylist1;
        zzahz = s5;
        zzahg = s;
        mExtras = bundle;
        zzGM = s4;
        zzahr = s1;
        zzWn = s2;
        zzAV = s3;
    }

    public AppContentSectionEntity(AppContentSection appcontentsection)
    {
        boolean flag = false;
        super();
        zzzH = 5;
        zzahz = appcontentsection.zzqt();
        zzahg = appcontentsection.zzpY();
        mExtras = appcontentsection.getExtras();
        zzGM = appcontentsection.getId();
        zzahr = appcontentsection.zzqk();
        zzWn = appcontentsection.getTitle();
        zzAV = appcontentsection.getType();
        List list = appcontentsection.getActions();
        int l = list.size();
        mActions = new ArrayList(l);
        for(int i = 0; i < l; i++)
            mActions.add((AppContentActionEntity)(AppContentActionEntity)((AppContentAction)list.get(i)).freeze());

        list = appcontentsection.zzqs();
        l = list.size();
        zzahy = new ArrayList(l);
        for(int j = 0; j < l; j++)
            zzahy.add((AppContentCardEntity)(AppContentCardEntity)((AppContentCard)list.get(j)).freeze());

        appcontentsection = appcontentsection.zzqi();
        l = appcontentsection.size();
        zzahp = new ArrayList(l);
        for(int k = ((flag) ? 1 : 0); k < l; k++)
            zzahp.add((AppContentAnnotationEntity)(AppContentAnnotationEntity)((AppContentAnnotation)appcontentsection.get(k)).freeze());

    }

    static int zza(AppContentSection appcontentsection)
    {
        return zzu.hashCode(new Object[] {
            appcontentsection.getActions(), appcontentsection.zzqi(), appcontentsection.zzqs(), appcontentsection.zzqt(), appcontentsection.zzpY(), appcontentsection.getExtras(), appcontentsection.getId(), appcontentsection.zzqk(), appcontentsection.getTitle(), appcontentsection.getType()
        });
    }

    static boolean zza(AppContentSection appcontentsection, Object obj)
    {
        boolean flag1 = true;
        if(obj instanceof AppContentSection) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(appcontentsection == obj) goto _L4; else goto _L3
_L3:
        obj = (AppContentSection)obj;
        if(!zzu.equal(((AppContentSection) (obj)).getActions(), appcontentsection.getActions()) || !zzu.equal(((AppContentSection) (obj)).zzqi(), appcontentsection.zzqi()) || !zzu.equal(((AppContentSection) (obj)).zzqs(), appcontentsection.zzqs()) || !zzu.equal(((AppContentSection) (obj)).zzqt(), appcontentsection.zzqt()) || !zzu.equal(((AppContentSection) (obj)).zzpY(), appcontentsection.zzpY()) || !zzu.equal(((AppContentSection) (obj)).getExtras(), appcontentsection.getExtras()) || !zzu.equal(((AppContentSection) (obj)).getId(), appcontentsection.getId()) || !zzu.equal(((AppContentSection) (obj)).zzqk(), appcontentsection.zzqk()) || !zzu.equal(((AppContentSection) (obj)).getTitle(), appcontentsection.getTitle()))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(((AppContentSection) (obj)).getType(), appcontentsection.getType())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(AppContentSection appcontentsection)
    {
        return zzu.zzq(appcontentsection).zzg("Actions", appcontentsection.getActions()).zzg("Annotations", appcontentsection.zzqi()).zzg("Cards", appcontentsection.zzqs()).zzg("CardType", appcontentsection.zzqt()).zzg("ContentDescription", appcontentsection.zzpY()).zzg("Extras", appcontentsection.getExtras()).zzg("Id", appcontentsection.getId()).zzg("Subtitle", appcontentsection.zzqk()).zzg("Title", appcontentsection.getTitle()).zzg("Type", appcontentsection.getType()).toString();
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
        return zzqu();
    }

    public List getActions()
    {
        return new ArrayList(mActions);
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
        AppContentSectionEntityCreator.zza(this, parcel, i);
    }

    public String zzpY()
    {
        return zzahg;
    }

    public List zzqi()
    {
        return new ArrayList(zzahp);
    }

    public String zzqk()
    {
        return zzahr;
    }

    public List zzqs()
    {
        return new ArrayList(zzahy);
    }

    public String zzqt()
    {
        return zzahz;
    }

    public AppContentSection zzqu()
    {
        return this;
    }

    public static final AppContentSectionEntityCreator CREATOR = new AppContentSectionEntityCreator();
    private final ArrayList mActions;
    private final Bundle mExtras;
    private final String zzAV;
    private final String zzGM;
    private final String zzWn;
    private final String zzahg;
    private final ArrayList zzahp;
    private final String zzahr;
    private final ArrayList zzahy;
    private final String zzahz;
    private final int zzzH;

}
