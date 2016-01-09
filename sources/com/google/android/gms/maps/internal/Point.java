// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.internal:
//            zzz

public class Point
    implements SafeParcelable
{

    public Point(int i, android.graphics.Point point)
    {
        versionCode = i;
        zzauR = point;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;
        if(!(obj instanceof Point))
        {
            return false;
        } else
        {
            obj = (Point)obj;
            return zzauR.equals(((Point) (obj)).zzauR);
        }
    }

    int getVersionCode()
    {
        return versionCode;
    }

    public int hashCode()
    {
        return zzauR.hashCode();
    }

    public String toString()
    {
        return zzauR.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzz.zza(this, parcel, i);
    }

    public android.graphics.Point zztP()
    {
        return zzauR;
    }

    public static final zzz CREATOR = new zzz();
    private final int versionCode;
    private final android.graphics.Point zzauR;

}
