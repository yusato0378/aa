// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.*;

public class GeofencingEvent
{

    private GeofencingEvent(int i, int j, List list, Location location)
    {
        zzyl = i;
        zzapQ = j;
        zzapR = list;
        zzapS = location;
    }

    public static GeofencingEvent fromIntent(Intent intent)
    {
        if(intent == null)
            return null;
        else
            return new GeofencingEvent(intent.getIntExtra("gms_error_code", -1), zzl(intent), zzm(intent), (Location)intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location"));
    }

    private static int zzl(Intent intent)
    {
        int i;
        for(i = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1); i == -1 || i != 1 && i != 2 && i != 4;)
            return -1;

        return i;
    }

    private static List zzm(Intent intent)
    {
        Object obj = (ArrayList)intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if(obj == null)
            return null;
        intent = new ArrayList(((ArrayList) (obj)).size());
        for(obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); intent.add(ParcelableGeofence.zzk((byte[])((Iterator) (obj)).next())));
        return intent;
    }

    public int getErrorCode()
    {
        return zzyl;
    }

    public int getGeofenceTransition()
    {
        return zzapQ;
    }

    public List getTriggeringGeofences()
    {
        return zzapR;
    }

    public Location getTriggeringLocation()
    {
        return zzapS;
    }

    public boolean hasError()
    {
        return zzyl != -1;
    }

    private final int zzapQ;
    private final List zzapR;
    private final Location zzapS;
    private final int zzyl;
}
