// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.location:
//            LocationRequestCreator

public final class LocationRequest
    implements SafeParcelable
{

    public LocationRequest()
    {
        zzzH = 1;
        mPriority = 102;
        zzaqe = 0x36ee80L;
        zzaqf = 0x927c0L;
        zzafv = false;
        zzapJ = 0x7fffffffffffffffL;
        zzaqg = 0x7fffffff;
        zzaqh = 0.0F;
        zzaqi = 0L;
    }

    LocationRequest(int i, int j, long l, long l1, boolean flag, 
            long l2, int k, float f, long l3)
    {
        zzzH = i;
        mPriority = j;
        zzaqe = l;
        zzaqf = l1;
        zzafv = flag;
        zzapJ = l2;
        zzaqg = k;
        zzaqh = f;
        zzaqi = l3;
    }

    public static LocationRequest create()
    {
        return new LocationRequest();
    }

    private static void zzJ(long l)
    {
        if(l < 0L)
            throw new IllegalArgumentException((new StringBuilder()).append("invalid interval: ").append(l).toString());
        else
            return;
    }

    private static void zzd(float f)
    {
        if(f < 0.0F)
            throw new IllegalArgumentException((new StringBuilder()).append("invalid displacement: ").append(f).toString());
        else
            return;
    }

    private static void zzfA(int i)
    {
        switch(i)
        {
        case 101: // 'e'
        case 103: // 'g'
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("invalid quality: ").append(i).toString());

        case 100: // 'd'
        case 102: // 'f'
        case 104: // 'h'
        case 105: // 'i'
            return;
        }
    }

    public static String zzfB(int i)
    {
        switch(i)
        {
        case 101: // 'e'
        case 103: // 'g'
        default:
            return "???";

        case 100: // 'd'
            return "PRIORITY_HIGH_ACCURACY";

        case 102: // 'f'
            return "PRIORITY_BALANCED_POWER_ACCURACY";

        case 104: // 'h'
            return "PRIORITY_LOW_POWER";

        case 105: // 'i'
            return "PRIORITY_NO_POWER";
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this != obj)
        {
            if(!(obj instanceof LocationRequest))
                return false;
            obj = (LocationRequest)obj;
            if(mPriority != ((LocationRequest) (obj)).mPriority || zzaqe != ((LocationRequest) (obj)).zzaqe || zzaqf != ((LocationRequest) (obj)).zzaqf || zzafv != ((LocationRequest) (obj)).zzafv || zzapJ != ((LocationRequest) (obj)).zzapJ || zzaqg != ((LocationRequest) (obj)).zzaqg || zzaqh != ((LocationRequest) (obj)).zzaqh)
                return false;
        }
        return true;
    }

    public long getExpirationTime()
    {
        return zzapJ;
    }

    public long getFastestInterval()
    {
        return zzaqf;
    }

    public long getInterval()
    {
        return zzaqe;
    }

    public long getMaxWaitTime()
    {
        long l1 = zzaqi;
        long l = l1;
        if(l1 < zzaqe)
            l = zzaqe;
        return l;
    }

    public int getNumUpdates()
    {
        return zzaqg;
    }

    public int getPriority()
    {
        return mPriority;
    }

    public float getSmallestDisplacement()
    {
        return zzaqh;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            Integer.valueOf(mPriority), Long.valueOf(zzaqe), Long.valueOf(zzaqf), Boolean.valueOf(zzafv), Long.valueOf(zzapJ), Integer.valueOf(zzaqg), Float.valueOf(zzaqh)
        });
    }

    public LocationRequest setExpirationDuration(long l)
    {
        long l1 = SystemClock.elapsedRealtime();
        if(l > 0x7fffffffffffffffL - l1)
            zzapJ = 0x7fffffffffffffffL;
        else
            zzapJ = l1 + l;
        if(zzapJ < 0L)
            zzapJ = 0L;
        return this;
    }

    public LocationRequest setExpirationTime(long l)
    {
        zzapJ = l;
        if(zzapJ < 0L)
            zzapJ = 0L;
        return this;
    }

    public LocationRequest setFastestInterval(long l)
    {
        zzJ(l);
        zzafv = true;
        zzaqf = l;
        return this;
    }

    public LocationRequest setInterval(long l)
    {
        zzJ(l);
        zzaqe = l;
        if(!zzafv)
            zzaqf = (long)((double)zzaqe / 6D);
        return this;
    }

    public LocationRequest setMaxWaitTime(long l)
    {
        zzJ(l);
        zzaqi = l;
        return this;
    }

    public LocationRequest setNumUpdates(int i)
    {
        if(i <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid numUpdates: ").append(i).toString());
        } else
        {
            zzaqg = i;
            return this;
        }
    }

    public LocationRequest setPriority(int i)
    {
        zzfA(i);
        mPriority = i;
        return this;
    }

    public LocationRequest setSmallestDisplacement(float f)
    {
        zzd(f);
        zzaqh = f;
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Request[").append(zzfB(mPriority));
        if(mPriority != 105)
        {
            stringbuilder.append(" requested=");
            stringbuilder.append((new StringBuilder()).append(zzaqe).append("ms").toString());
        }
        stringbuilder.append(" fastest=");
        stringbuilder.append((new StringBuilder()).append(zzaqf).append("ms").toString());
        if(zzaqi > zzaqe)
        {
            stringbuilder.append(" maxWait=");
            stringbuilder.append((new StringBuilder()).append(zzaqi).append("ms").toString());
        }
        if(zzapJ != 0x7fffffffffffffffL)
        {
            long l = zzapJ;
            long l1 = SystemClock.elapsedRealtime();
            stringbuilder.append(" expireIn=");
            stringbuilder.append((new StringBuilder()).append(l - l1).append("ms").toString());
        }
        if(zzaqg != 0x7fffffff)
            stringbuilder.append(" num=").append(zzaqg);
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        LocationRequestCreator.zza(this, parcel, i);
    }

    public static final LocationRequestCreator CREATOR = new LocationRequestCreator();
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;
    int mPriority;
    boolean zzafv;
    long zzapJ;
    long zzaqe;
    long zzaqf;
    int zzaqg;
    float zzaqh;
    long zzaqi;
    private final int zzzH;

}
