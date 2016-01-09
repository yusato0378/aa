// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

public final class zzu
{

    public zzu(String s, VersionInfoParcel versioninfoparcel, String s1, JSONObject jsonobject, boolean flag)
    {
        zzoc = versioninfoparcel.zzCI;
        zzoa = jsonobject;
        zzob = s;
        zznZ = s1;
        zzod = flag;
    }

    public String zzbc()
    {
        return zznZ;
    }

    public String zzbd()
    {
        return zzoc;
    }

    public JSONObject zzbe()
    {
        return zzoa;
    }

    public String zzbf()
    {
        return zzob;
    }

    public boolean zzbg()
    {
        return zzod;
    }

    private final String zznZ;
    private final JSONObject zzoa;
    private final String zzob;
    private final String zzoc;
    private final boolean zzod;
}
