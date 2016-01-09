// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.Node;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzay

public class NodeParcelable
    implements SafeParcelable, Node
{

    NodeParcelable(int i, String s, String s1, int j, boolean flag)
    {
        zzzH = i;
        zzGM = s;
        zzWF = s1;
        zzaMy = j;
        zzaMz = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(!(obj instanceof NodeParcelable))
            return false;
        else
            return ((NodeParcelable)obj).zzGM.equals(zzGM);
    }

    public String getDisplayName()
    {
        return zzWF;
    }

    public int getHopCount()
    {
        return zzaMy;
    }

    public String getId()
    {
        return zzGM;
    }

    public int hashCode()
    {
        return zzGM.hashCode();
    }

    public boolean isNearby()
    {
        return zzaMz;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Node{").append(zzWF).append(", id=").append(zzGM).append(", hops=").append(zzaMy).append(", isNearby=").append(zzaMz).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzay.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzay();
    private final String zzGM;
    private final String zzWF;
    private final int zzaMy;
    private final boolean zzaMz;
    final int zzzH;

}
