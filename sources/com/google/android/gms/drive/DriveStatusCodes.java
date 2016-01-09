// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive;

import com.google.android.gms.common.api.CommonStatusCodes;

public final class DriveStatusCodes extends CommonStatusCodes
{

    private DriveStatusCodes()
    {
    }

    public static String getStatusCodeString(int i)
    {
        switch(i)
        {
        default:
            return CommonStatusCodes.getStatusCodeString(i);

        case 1500: 
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";

        case 1502: 
            return "DRIVE_RESOURCE_NOT_AVAILABLE";

        case 1507: 
            return "DRIVE_RATE_LIMIT_EXCEEDED";
        }
    }

    public static final int DRIVE_CONTENTS_TOO_LARGE = 1508;
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
    public static final int DRIVE_RATE_LIMIT_EXCEEDED = 1507;
    public static final int DRIVE_RESOURCE_NOT_AVAILABLE = 1502;
}
