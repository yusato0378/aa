// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public class PermissionUtils
{

    public PermissionUtils()
    {
    }

    public static boolean permitted(Context context, String s)
    {
        int i;
        int j;
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            return false;
        }
        context = ((PackageInfo) (context)).requestedPermissions;
        j = context.length;
        i = 0;
        do
        {
            if(i >= j)
                return false;
            if(context[i].equals(s))
                return true;
            i++;
        } while(true);
    }
}
