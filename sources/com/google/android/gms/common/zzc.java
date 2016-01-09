// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common;

import android.content.pm.*;
import android.util.Base64;
import android.util.Log;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common:
//            zzb, GooglePlayServicesUtil

public class zzc
{

    private zzc()
    {
    }

    private boolean zza(PackageInfo packageinfo, boolean flag)
    {
        if(packageinfo.signatures.length != 1)
        {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return false;
        }
        zzb.zzb zzb1 = new zzb.zzb(packageinfo.signatures[0].toByteArray());
        if(flag)
            packageinfo = com.google.android.gms.common.zzb.zzkw();
        else
            packageinfo = com.google.android.gms.common.zzb.zzkx();
        if(packageinfo.contains(zzb1))
            return true;
        if(Log.isLoggable("GoogleSignatureVerifier", 2))
            Log.v("GoogleSignatureVerifier", (new StringBuilder()).append("Signature not valid.  Found: \n").append(Base64.encodeToString(zzb1.getBytes(), 0)).toString());
        return false;
    }

    public static zzc zzkA()
    {
        return zzPa;
    }

    transient zzb.zza zza(PackageInfo packageinfo, zzb.zza azza[])
    {
        if(packageinfo.signatures.length != 1)
        {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        packageinfo = new zzb.zzb(packageinfo.signatures[0].toByteArray());
        for(int i = 0; i < azza.length; i++)
            if(azza[i].equals(packageinfo))
                return azza[i];

        if(Log.isLoggable("GoogleSignatureVerifier", 2))
            Log.v("GoogleSignatureVerifier", (new StringBuilder()).append("Signature not valid.  Found: \n").append(Base64.encodeToString(packageinfo.getBytes(), 0)).toString());
        return null;
    }

    public boolean zza(PackageManager packagemanager, PackageInfo packageinfo)
    {
        boolean flag = false;
        if(packageinfo != null)
        {
            if(GooglePlayServicesUtil.zzc(packagemanager))
                return zza(packageinfo, true);
            boolean flag1 = zza(packageinfo, false);
            flag = flag1;
            if(!flag1)
            {
                flag = flag1;
                if(zza(packageinfo, true))
                {
                    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                    return flag1;
                }
            }
        }
        return flag;
    }

    public boolean zzb(PackageManager packagemanager, String s)
    {
        PackageInfo packageinfo;
        try
        {
            packageinfo = packagemanager.getPackageInfo(s, 64);
        }
        // Misplaced declaration of an exception variable
        catch(PackageManager packagemanager)
        {
            if(Log.isLoggable("GoogleSignatureVerifier", 3))
                Log.d("GoogleSignatureVerifier", (new StringBuilder()).append("Package manager can't find package ").append(s).append(", defaulting to false").toString());
            return false;
        }
        return zza(packagemanager, packageinfo);
    }

    private static final zzc zzPa = new zzc();

}
