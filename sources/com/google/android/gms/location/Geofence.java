// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.location.internal.ParcelableGeofence;

public interface Geofence
{
    public static final class Builder
    {

        public Geofence build()
        {
            if(zzAu == null)
                throw new IllegalArgumentException("Request ID not set.");
            if(zzapI == 0)
                throw new IllegalArgumentException("Transitions types not set.");
            if((zzapI & 4) != 0 && zzapP < 0)
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
            if(zzapJ == 0x8000000000000000L)
                throw new IllegalArgumentException("Expiration not set.");
            if(zzapK == -1)
                throw new IllegalArgumentException("Geofence region not set.");
            if(zzapO < 0)
                throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
            else
                return new ParcelableGeofence(zzAu, zzapI, (short)1, zzapL, zzapM, zzapN, zzapJ, zzapO, zzapP);
        }

        public Builder setCircularRegion(double d, double d1, float f)
        {
            zzapK = 1;
            zzapL = d;
            zzapM = d1;
            zzapN = f;
            return this;
        }

        public Builder setExpirationDuration(long l)
        {
            if(l < 0L)
            {
                zzapJ = -1L;
                return this;
            } else
            {
                zzapJ = SystemClock.elapsedRealtime() + l;
                return this;
            }
        }

        public Builder setLoiteringDelay(int i)
        {
            zzapP = i;
            return this;
        }

        public Builder setNotificationResponsiveness(int i)
        {
            zzapO = i;
            return this;
        }

        public Builder setRequestId(String s)
        {
            zzAu = s;
            return this;
        }

        public Builder setTransitionTypes(int i)
        {
            zzapI = i;
            return this;
        }

        private String zzAu;
        private int zzapI;
        private long zzapJ;
        private short zzapK;
        private double zzapL;
        private double zzapM;
        private float zzapN;
        private int zzapO;
        private int zzapP;

        public Builder()
        {
            zzAu = null;
            zzapI = 0;
            zzapJ = 0x8000000000000000L;
            zzapK = -1;
            zzapO = 0;
            zzapP = -1;
        }
    }


    public abstract String getRequestId();

    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1L;
}
