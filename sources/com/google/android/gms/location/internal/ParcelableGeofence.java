// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzm

public class ParcelableGeofence
    implements SafeParcelable, Geofence
{

    public ParcelableGeofence(int i, String s, int j, short word0, double d, double d1, float f, long l, int k, int i1)
    {
        zzcH(s);
        zze(f);
        zza(d, d1);
        j = zzfK(j);
        zzzH = i;
        zzapK = word0;
        zzAu = s;
        zzapL = d;
        zzapM = d1;
        zzapN = f;
        zzars = l;
        zzapI = j;
        zzapO = k;
        zzapP = i1;
    }

    public ParcelableGeofence(String s, int i, short word0, double d, double d1, 
            float f, long l, int j, int k)
    {
        this(1, s, i, word0, d, d1, f, l, j, k);
    }

    private static void zza(double d, double d1)
    {
        if(d > 90D || d < -90D)
            throw new IllegalArgumentException((new StringBuilder()).append("invalid latitude: ").append(d).toString());
        if(d1 > 180D || d1 < -180D)
            throw new IllegalArgumentException((new StringBuilder()).append("invalid longitude: ").append(d1).toString());
        else
            return;
    }

    private static void zzcH(String s)
    {
        if(s == null || s.length() > 100)
            throw new IllegalArgumentException((new StringBuilder()).append("requestId is null or too long: ").append(s).toString());
        else
            return;
    }

    private static void zze(float f)
    {
        if(f <= 0.0F)
            throw new IllegalArgumentException((new StringBuilder()).append("invalid radius: ").append(f).toString());
        else
            return;
    }

    private static int zzfK(int i)
    {
        int j = i & 7;
        if(j == 0)
            throw new IllegalArgumentException((new StringBuilder()).append("No supported transition specified: ").append(i).toString());
        else
            return j;
    }

    private static String zzfL(int i)
    {
        switch(i)
        {
        default:
            return null;

        case 1: // '\001'
            return "CIRCLE";
        }
    }

    public static ParcelableGeofence zzk(byte abyte0[])
    {
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        abyte0 = CREATOR.zzdJ(parcel);
        parcel.recycle();
        return abyte0;
    }

    public int describeContents()
    {
        zzm zzm1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this != obj)
        {
            if(obj == null)
                return false;
            if(!(obj instanceof ParcelableGeofence))
                return false;
            obj = (ParcelableGeofence)obj;
            if(zzapN != ((ParcelableGeofence) (obj)).zzapN)
                return false;
            if(zzapL != ((ParcelableGeofence) (obj)).zzapL)
                return false;
            if(zzapM != ((ParcelableGeofence) (obj)).zzapM)
                return false;
            if(zzapK != ((ParcelableGeofence) (obj)).zzapK)
                return false;
        }
        return true;
    }

    public long getExpirationTime()
    {
        return zzars;
    }

    public double getLatitude()
    {
        return zzapL;
    }

    public double getLongitude()
    {
        return zzapM;
    }

    public int getNotificationResponsiveness()
    {
        return zzapO;
    }

    public String getRequestId()
    {
        return zzAu;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        long l = Double.doubleToLongBits(zzapL);
        int i = (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(zzapM);
        return ((((i + 31) * 31 + (int)(l ^ l >>> 32)) * 31 + Float.floatToIntBits(zzapN)) * 31 + zzapK) * 31 + zzapI;
    }

    public String toString()
    {
        return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[] {
            zzfL(zzapK), zzAu, Integer.valueOf(zzapI), Double.valueOf(zzapL), Double.valueOf(zzapM), Float.valueOf(zzapN), Integer.valueOf(zzapO / 1000), Integer.valueOf(zzapP), Long.valueOf(zzars)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzm zzm1 = CREATOR;
        zzm.zza(this, parcel, i);
    }

    public short zzsM()
    {
        return zzapK;
    }

    public float zzsN()
    {
        return zzapN;
    }

    public int zzsO()
    {
        return zzapI;
    }

    public int zzsP()
    {
        return zzapP;
    }

    public static final zzm CREATOR = new zzm();
    private final String zzAu;
    private final int zzapI;
    private final short zzapK;
    private final double zzapL;
    private final double zzapM;
    private final float zzapN;
    private final int zzapO;
    private final int zzapP;
    private final long zzars;
    private final int zzzH;

}
