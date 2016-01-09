// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.identity.intents.model;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.identity.intents.model:
//            zzb

public final class UserAddress
    implements SafeParcelable
{

    UserAddress()
    {
        zzzH = 1;
    }

    UserAddress(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, String s9, String s10, String s11, boolean flag, 
            String s12, String s13)
    {
        zzzH = i;
        name = s;
        zzapo = s1;
        zzapp = s2;
        zzapq = s3;
        zzapr = s4;
        zzaps = s5;
        zzapt = s6;
        zzapu = s7;
        zzBc = s8;
        zzapv = s9;
        zzapw = s10;
        zzapx = s11;
        zzapy = flag;
        zzapz = s12;
        zzapA = s13;
    }

    public static UserAddress fromIntent(Intent intent)
    {
        if(intent == null || !intent.hasExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS"))
            return null;
        else
            return (UserAddress)intent.getParcelableExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS");
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAddress1()
    {
        return zzapo;
    }

    public String getAddress2()
    {
        return zzapp;
    }

    public String getAddress3()
    {
        return zzapq;
    }

    public String getAddress4()
    {
        return zzapr;
    }

    public String getAddress5()
    {
        return zzaps;
    }

    public String getAdministrativeArea()
    {
        return zzapt;
    }

    public String getCompanyName()
    {
        return zzapz;
    }

    public String getCountryCode()
    {
        return zzBc;
    }

    public String getEmailAddress()
    {
        return zzapA;
    }

    public String getLocality()
    {
        return zzapu;
    }

    public String getName()
    {
        return name;
    }

    public String getPhoneNumber()
    {
        return zzapx;
    }

    public String getPostalCode()
    {
        return zzapv;
    }

    public String getSortingCode()
    {
        return zzapw;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public boolean isPostBox()
    {
        return zzapy;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    String name;
    String zzBc;
    String zzapA;
    String zzapo;
    String zzapp;
    String zzapq;
    String zzapr;
    String zzaps;
    String zzapt;
    String zzapu;
    String zzapv;
    String zzapw;
    String zzapx;
    boolean zzapy;
    String zzapz;
    private final int zzzH;

}
