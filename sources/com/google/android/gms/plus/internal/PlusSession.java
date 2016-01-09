// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.plus.internal:
//            zzh, PlusCommonExtras

public class PlusSession
    implements SafeParcelable
{

    PlusSession(int i, String s, String as[], String as1[], String as2[], String s1, String s2, 
            String s3, String s4, PlusCommonExtras pluscommonextras)
    {
        zzzH = i;
        zzKw = s;
        zzazg = as;
        zzazh = as1;
        zzazi = as2;
        zzazj = s1;
        zzazk = s2;
        zzazl = s3;
        zzazm = s4;
        zzazn = pluscommonextras;
    }

    public PlusSession(String s, String as[], String as1[], String as2[], String s1, String s2, String s3, 
            PlusCommonExtras pluscommonextras)
    {
        zzzH = 1;
        zzKw = s;
        zzazg = as;
        zzazh = as1;
        zzazi = as2;
        zzazj = s1;
        zzazk = s2;
        zzazl = s3;
        zzazm = null;
        zzazn = pluscommonextras;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(obj instanceof PlusSession)
            if(zzzH == ((PlusSession) (obj = (PlusSession)obj)).zzzH && zzu.equal(zzKw, ((PlusSession) (obj)).zzKw) && Arrays.equals(zzazg, ((PlusSession) (obj)).zzazg) && Arrays.equals(zzazh, ((PlusSession) (obj)).zzazh) && Arrays.equals(zzazi, ((PlusSession) (obj)).zzazi) && zzu.equal(zzazj, ((PlusSession) (obj)).zzazj) && zzu.equal(zzazk, ((PlusSession) (obj)).zzazk) && zzu.equal(zzazl, ((PlusSession) (obj)).zzazl) && zzu.equal(zzazm, ((PlusSession) (obj)).zzazm) && zzu.equal(zzazn, ((PlusSession) (obj)).zzazn))
                return true;
        return false;
    }

    public String getAccountName()
    {
        return zzKw;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            Integer.valueOf(zzzH), zzKw, zzazg, zzazh, zzazi, zzazj, zzazk, zzazl, zzazm, zzazn
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("versionCode", Integer.valueOf(zzzH)).zzg("accountName", zzKw).zzg("requestedScopes", zzazg).zzg("visibleActivities", zzazh).zzg("requiredFeatures", zzazi).zzg("packageNameForAuth", zzazj).zzg("callingPackageName", zzazk).zzg("applicationName", zzazl).zzg("extra", zzazn.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    public String[] zzvC()
    {
        return zzazg;
    }

    public String[] zzvD()
    {
        return zzazh;
    }

    public String[] zzvE()
    {
        return zzazi;
    }

    public String zzvF()
    {
        return zzazj;
    }

    public String zzvG()
    {
        return zzazk;
    }

    public String zzvH()
    {
        return zzazl;
    }

    public String zzvI()
    {
        return zzazm;
    }

    public PlusCommonExtras zzvJ()
    {
        return zzazn;
    }

    public Bundle zzvK()
    {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(com/google/android/gms/plus/internal/PlusCommonExtras.getClassLoader());
        zzazn.zzt(bundle);
        return bundle;
    }

    public static final zzh CREATOR = new zzh();
    private final String zzKw;
    private final String zzazg[];
    private final String zzazh[];
    private final String zzazi[];
    private final String zzazj;
    private final String zzazk;
    private final String zzazl;
    private final String zzazm;
    private final PlusCommonExtras zzazn;
    private final int zzzH;

}
