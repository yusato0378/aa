// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.CapabilityInfo;
import java.util.*;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzh

public class CapabilityInfoParcelable
    implements SafeParcelable, CapabilityInfo
{

    CapabilityInfoParcelable(int i, String s, List list)
    {
        zzzH = i;
        mName = s;
        zzaLt = list;
        zzaLq = null;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this != obj)
        {
            if(obj == null || getClass() != obj.getClass())
                return false;
            obj = (CapabilityInfoParcelable)obj;
            if(zzzH != ((CapabilityInfoParcelable) (obj)).zzzH)
                return false;
            if(mName == null ? ((CapabilityInfoParcelable) (obj)).mName != null : !mName.equals(((CapabilityInfoParcelable) (obj)).mName))
                return false;
            if(zzaLt == null ? ((CapabilityInfoParcelable) (obj)).zzaLt != null : !zzaLt.equals(((CapabilityInfoParcelable) (obj)).zzaLt))
                return false;
        }
        return true;
    }

    public String getName()
    {
        return mName;
    }

    public Set getNodes()
    {
        Set set;
        synchronized(zzoe)
        {
            if(zzaLq == null)
                zzaLq = new HashSet(zzaLt);
            set = zzaLq;
        }
        return set;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int hashCode()
    {
        int j = 0;
        int k = zzzH;
        int i;
        if(mName != null)
            i = mName.hashCode();
        else
            i = 0;
        if(zzaLt != null)
            j = zzaLt.hashCode();
        return (i + k * 31) * 31 + j;
    }

    public String toString()
    {
        return (new StringBuilder()).append("CapabilityInfo{").append(mName).append(", ").append(zzaLt).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    public List zzzg()
    {
        return zzaLt;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzh();
    private final String mName;
    private Set zzaLq;
    private final List zzaLt;
    private final Object zzoe = new Object();
    final int zzzH;

}
