// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzl

public class MapValue
    implements SafeParcelable
{

    public MapValue(int i, float f)
    {
        this(1, i, f);
    }

    MapValue(int i, int j, float f)
    {
        zzzH = i;
        zzadw = j;
        zzadA = f;
    }

    private boolean zza(MapValue mapvalue)
    {
        if(zzadw != mapvalue.zzadw) goto _L2; else goto _L1
_L1:
        zzadw;
        JVM INSTR tableswitch 2 2: default 32
    //                   2 46;
           goto _L3 _L4
_L3:
        if(zzadA != mapvalue.zzadA) goto _L6; else goto _L5
_L5:
        return true;
_L4:
        if(asFloat() != mapvalue.asFloat())
            return false;
        if(true) goto _L5; else goto _L6
_L6:
        return false;
_L2:
        return false;
    }

    public static MapValue zzc(float f)
    {
        return new MapValue(2, f);
    }

    public float asFloat()
    {
        boolean flag;
        if(zzadw == 2)
            flag = true;
        else
            flag = false;
        zzv.zza(flag, "Value is not in float format");
        return zzadA;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof MapValue) && zza((MapValue)obj);
    }

    int getFormat()
    {
        return zzadw;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return (int)zzadA;
    }

    public String toString()
    {
        switch(zzadw)
        {
        default:
            return "unknown";

        case 2: // '\002'
            return Float.toString(asFloat());
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzl.zza(this, parcel, i);
    }

    float zzoT()
    {
        return zzadA;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzl();
    private final float zzadA;
    private final int zzadw;
    private final int zzzH;

}
