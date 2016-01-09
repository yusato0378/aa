// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentAnnotation, AppContentAnnotationEntityCreator

public final class AppContentAnnotationEntity
    implements SafeParcelable, AppContentAnnotation
{

    AppContentAnnotationEntity(int i, String s, Uri uri, String s1, String s2, String s3, String s4, 
            int j, int k, Bundle bundle)
    {
        zzzH = i;
        zzadH = s;
        zzGM = s2;
        zzahl = s4;
        zzahm = j;
        zzahj = uri;
        zzahn = k;
        zzahk = s3;
        zzaho = bundle;
        zzWn = s1;
    }

    public AppContentAnnotationEntity(AppContentAnnotation appcontentannotation)
    {
        zzzH = 4;
        zzadH = appcontentannotation.getDescription();
        zzGM = appcontentannotation.getId();
        zzahl = appcontentannotation.zzqb();
        zzahm = appcontentannotation.zzqc();
        zzahj = appcontentannotation.zzqd();
        zzahn = appcontentannotation.zzqf();
        zzahk = appcontentannotation.zzqg();
        zzaho = appcontentannotation.zzqe();
        zzWn = appcontentannotation.getTitle();
    }

    static int zza(AppContentAnnotation appcontentannotation)
    {
        return zzu.hashCode(new Object[] {
            appcontentannotation.getDescription(), appcontentannotation.getId(), appcontentannotation.zzqb(), Integer.valueOf(appcontentannotation.zzqc()), appcontentannotation.zzqd(), Integer.valueOf(appcontentannotation.zzqf()), appcontentannotation.zzqg(), appcontentannotation.zzqe(), appcontentannotation.getTitle()
        });
    }

    static boolean zza(AppContentAnnotation appcontentannotation, Object obj)
    {
        boolean flag1 = true;
        if(obj instanceof AppContentAnnotation) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(appcontentannotation == obj) goto _L4; else goto _L3
_L3:
        obj = (AppContentAnnotation)obj;
        if(!zzu.equal(((AppContentAnnotation) (obj)).getDescription(), appcontentannotation.getDescription()) || !zzu.equal(((AppContentAnnotation) (obj)).getId(), appcontentannotation.getId()) || !zzu.equal(((AppContentAnnotation) (obj)).zzqb(), appcontentannotation.zzqb()) || !zzu.equal(Integer.valueOf(((AppContentAnnotation) (obj)).zzqc()), Integer.valueOf(appcontentannotation.zzqc())) || !zzu.equal(((AppContentAnnotation) (obj)).zzqd(), appcontentannotation.zzqd()) || !zzu.equal(Integer.valueOf(((AppContentAnnotation) (obj)).zzqf()), Integer.valueOf(appcontentannotation.zzqf())) || !zzu.equal(((AppContentAnnotation) (obj)).zzqg(), appcontentannotation.zzqg()) || !zzu.equal(((AppContentAnnotation) (obj)).zzqe(), appcontentannotation.zzqe()))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(((AppContentAnnotation) (obj)).getTitle(), appcontentannotation.getTitle())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(AppContentAnnotation appcontentannotation)
    {
        return zzu.zzq(appcontentannotation).zzg("Description", appcontentannotation.getDescription()).zzg("Id", appcontentannotation.getId()).zzg("ImageDefaultId", appcontentannotation.zzqb()).zzg("ImageHeight", Integer.valueOf(appcontentannotation.zzqc())).zzg("ImageUri", appcontentannotation.zzqd()).zzg("ImageWidth", Integer.valueOf(appcontentannotation.zzqf())).zzg("LayoutSlot", appcontentannotation.zzqg()).zzg("Modifiers", appcontentannotation.zzqe()).zzg("Title", appcontentannotation.getTitle()).toString();
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
        return zzqh();
    }

    public String getDescription()
    {
        return zzadH;
    }

    public String getId()
    {
        return zzGM;
    }

    public String getTitle()
    {
        return zzWn;
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
        AppContentAnnotationEntityCreator.zza(this, parcel, i);
    }

    public String zzqb()
    {
        return zzahl;
    }

    public int zzqc()
    {
        return zzahm;
    }

    public Uri zzqd()
    {
        return zzahj;
    }

    public Bundle zzqe()
    {
        return zzaho;
    }

    public int zzqf()
    {
        return zzahn;
    }

    public String zzqg()
    {
        return zzahk;
    }

    public AppContentAnnotation zzqh()
    {
        return this;
    }

    public static final AppContentAnnotationEntityCreator CREATOR = new AppContentAnnotationEntityCreator();
    private final String zzGM;
    private final String zzWn;
    private final String zzadH;
    private final Uri zzahj;
    private final String zzahk;
    private final String zzahl;
    private final int zzahm;
    private final int zzahn;
    private final Bundle zzaho;
    private final int zzzH;

}
