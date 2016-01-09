// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.data;

import android.os.*;
import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.fitness.FitnessActivities;
import java.util.*;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzt, MapValue

public final class Value
    implements SafeParcelable
{

    public Value(int i)
    {
        this(2, i, false, 0.0F, null, null);
    }

    Value(int i, int j, boolean flag, float f, String s, Bundle bundle)
    {
        zzzH = i;
        zzadw = j;
        zzadM = flag;
        zzadA = f;
        zzadN = s;
        zzadO = zzr(bundle);
    }

    private boolean zza(Value value)
    {
        if(zzadw != value.zzadw || zzadM != value.zzadM) goto _L2; else goto _L1
_L1:
        zzadw;
        JVM INSTR tableswitch 1 4: default 56
    //                   1 70
    //                   2 83
    //                   3 97
    //                   4 109;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        if(zzadA != value.zzadA) goto _L9; else goto _L8
_L8:
        return true;
_L4:
        if(asInt() == value.asInt()) goto _L8; else goto _L10
_L10:
        return false;
_L5:
        if(asFloat() == value.asFloat()) goto _L8; else goto _L11
_L11:
        return false;
_L6:
        return asString().equals(value.asString());
_L7:
        return zzog().equals(value.zzog());
_L9:
        return false;
_L2:
        return false;
    }

    private static Map zzr(Bundle bundle)
    {
        if(bundle == null)
            return null;
        bundle.setClassLoader(com/google/android/gms/fitness/data/MapValue.getClassLoader());
        ArrayMap arraymap = new ArrayMap(bundle.size());
        String s;
        for(Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); arraymap.put(s, bundle.getParcelable(s)))
            s = (String)iterator.next();

        return arraymap;
    }

    public String asActivity()
    {
        return FitnessActivities.getName(asInt());
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

    public int asInt()
    {
        boolean flag = true;
        if(zzadw != 1)
            flag = false;
        zzv.zza(flag, "Value is not in int format");
        return Float.floatToRawIntBits(zzadA);
    }

    public String asString()
    {
        boolean flag;
        if(zzadw == 3)
            flag = true;
        else
            flag = false;
        zzv.zza(flag, "Value is not in string format");
        return zzadN;
    }

    public void clearKey(String s)
    {
        boolean flag;
        if(zzadw == 4)
            flag = true;
        else
            flag = false;
        zzv.zza(flag, "Attempting to set a key's value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
        if(zzadO != null)
            zzadO.remove(s);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof Value) && zza((Value)obj);
    }

    public int getFormat()
    {
        return zzadw;
    }

    public Float getKeyValue(String s)
    {
        boolean flag;
        if(zzadw == 4)
            flag = true;
        else
            flag = false;
        zzv.zza(flag, "Value is not in float map format");
        if(zzadO != null && zzadO.containsKey(s))
            return Float.valueOf(((MapValue)zzadO.get(s)).asFloat());
        else
            return null;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            Float.valueOf(zzadA), zzadN, zzadO
        });
    }

    public boolean isSet()
    {
        return zzadM;
    }

    public void setActivity(String s)
    {
        setInt(FitnessActivities.zzcl(s));
    }

    public void setFloat(float f)
    {
        boolean flag;
        if(zzadw == 2)
            flag = true;
        else
            flag = false;
        zzv.zza(flag, "Attempting to set an float value to a field that is not in FLOAT format.  Please check the data type definition and use the right format.");
        zzadM = true;
        zzadA = f;
    }

    public void setInt(int i)
    {
        boolean flag;
        if(zzadw == 1)
            flag = true;
        else
            flag = false;
        zzv.zza(flag, "Attempting to set an int value to a field that is not in INT32 format.  Please check the data type definition and use the right format.");
        zzadM = true;
        zzadA = Float.intBitsToFloat(i);
    }

    public void setKeyValue(String s, float f)
    {
        boolean flag;
        if(zzadw == 4)
            flag = true;
        else
            flag = false;
        zzv.zza(flag, "Attempting to set a key's value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
        zzadM = true;
        if(zzadO == null)
            zzadO = new HashMap();
        zzadO.put(s, MapValue.zzc(f));
    }

    public void setString(String s)
    {
        boolean flag;
        if(zzadw == 3)
            flag = true;
        else
            flag = false;
        zzv.zza(flag, "Attempting to set a string value to a field that is not in STRING format.  Please check the data type definition and use the right format.");
        zzadM = true;
        zzadN = s;
    }

    public String toString()
    {
        if(!zzadM)
            return "unset";
        switch(zzadw)
        {
        default:
            return "unknown";

        case 1: // '\001'
            return Integer.toString(asInt());

        case 2: // '\002'
            return Float.toString(asFloat());

        case 3: // '\003'
            return zzadN;

        case 4: // '\004'
            return (new TreeMap(zzadO)).toString();
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzt.zza(this, parcel, i);
    }

    float zzoT()
    {
        return zzadA;
    }

    String zzoZ()
    {
        return zzadN;
    }

    public Map zzog()
    {
        boolean flag;
        if(zzadw == 4)
            flag = true;
        else
            flag = false;
        zzv.zza(flag, "Value is not in float map format");
        if(zzadO == null)
            return Collections.emptyMap();
        else
            return zzadO;
    }

    Bundle zzpa()
    {
        if(zzadO == null)
            return null;
        Bundle bundle = new Bundle(zzadO.size());
        java.util.Map.Entry entry;
        for(Iterator iterator = zzadO.entrySet().iterator(); iterator.hasNext(); bundle.putParcelable((String)entry.getKey(), (Parcelable)entry.getValue()))
            entry = (java.util.Map.Entry)iterator.next();

        return bundle;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzt();
    private float zzadA;
    private boolean zzadM;
    private String zzadN;
    private Map zzadO;
    private final int zzadw;
    private final int zzzH;

}
