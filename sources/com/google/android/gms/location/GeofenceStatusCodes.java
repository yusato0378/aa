// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location;

import com.google.android.gms.common.api.CommonStatusCodes;

public final class GeofenceStatusCodes extends CommonStatusCodes
{

    private GeofenceStatusCodes()
    {
    }

    public static String getStatusCodeString(int i)
    {
        switch(i)
        {
        default:
            return CommonStatusCodes.getStatusCodeString(i);

        case 1000: 
            return "GEOFENCE_NOT_AVAILABLE";

        case 1001: 
            return "GEOFENCE_TOO_MANY_GEOFENCES";

        case 1002: 
            return "GEOFENCE_TOO_MANY_PENDING_INTENTS";
        }
    }

    public static final int GEOFENCE_NOT_AVAILABLE = 1000;
    public static final int GEOFENCE_TOO_MANY_GEOFENCES = 1001;
    public static final int GEOFENCE_TOO_MANY_PENDING_INTENTS = 1002;
}
