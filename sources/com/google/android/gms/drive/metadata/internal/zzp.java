// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.UserMetadata;
import java.util.*;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            zzj

public class zzp extends zzj
{

    public zzp(String s, int i)
    {
        super(s, zzcg(s), Collections.emptyList(), i);
    }

    private String zzcf(String s)
    {
        return zzv(getName(), s);
    }

    private static Collection zzcg(String s)
    {
        return Arrays.asList(new String[] {
            zzv(s, "permissionId"), zzv(s, "displayName"), zzv(s, "picture"), zzv(s, "isAuthenticatedUser"), zzv(s, "emailAddress")
        });
    }

    private static String zzv(String s, String s1)
    {
        return (new StringBuilder()).append(s).append(".").append(s1).toString();
    }

    protected boolean zzb(DataHolder dataholder, int i, int j)
    {
        return dataholder.zzbF(zzcf("permissionId")) && !dataholder.zzi(zzcf("permissionId"), i, j);
    }

    protected Object zzc(DataHolder dataholder, int i, int j)
    {
        return zzj(dataholder, i, j);
    }

    protected UserMetadata zzj(DataHolder dataholder, int i, int j)
    {
        String s = dataholder.zzd(zzcf("permissionId"), i, j);
        if(s != null)
        {
            String s1 = dataholder.zzd(zzcf("displayName"), i, j);
            String s2 = dataholder.zzd(zzcf("picture"), i, j);
            boolean flag = dataholder.zze(zzcf("isAuthenticatedUser"), i, j);
            dataholder = dataholder.zzd(zzcf("emailAddress"), i, j);
            return new UserMetadata(s, s1, s2, Boolean.valueOf(flag).booleanValue(), dataholder);
        } else
        {
            return null;
        }
    }
}
