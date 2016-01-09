// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.wearable:
//            zze

public class ConnectionConfiguration
    implements SafeParcelable
{

    ConnectionConfiguration(int i, String s, String s1, int j, int k, boolean flag, boolean flag1, 
            String s2, boolean flag2)
    {
        zzzH = i;
        mName = s;
        zzacM = s1;
        zzMG = j;
        zzWv = k;
        zzaKC = flag;
        zzIu = flag1;
        zzaKD = s2;
        zzaKE = flag2;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(obj instanceof ConnectionConfiguration)
            if(zzu.equal(Integer.valueOf(zzzH), Integer.valueOf(((ConnectionConfiguration) (obj = (ConnectionConfiguration)obj)).zzzH)) && zzu.equal(mName, ((ConnectionConfiguration) (obj)).mName) && zzu.equal(zzacM, ((ConnectionConfiguration) (obj)).zzacM) && zzu.equal(Integer.valueOf(zzMG), Integer.valueOf(((ConnectionConfiguration) (obj)).zzMG)) && zzu.equal(Integer.valueOf(zzWv), Integer.valueOf(((ConnectionConfiguration) (obj)).zzWv)) && zzu.equal(Boolean.valueOf(zzaKC), Boolean.valueOf(((ConnectionConfiguration) (obj)).zzaKC)) && zzu.equal(Boolean.valueOf(zzaKE), Boolean.valueOf(((ConnectionConfiguration) (obj)).zzaKE)))
                return true;
        return false;
    }

    public String getAddress()
    {
        return zzacM;
    }

    public String getName()
    {
        return mName;
    }

    public int getRole()
    {
        return zzWv;
    }

    public int getType()
    {
        return zzMG;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            Integer.valueOf(zzzH), mName, zzacM, Integer.valueOf(zzMG), Integer.valueOf(zzWv), Boolean.valueOf(zzaKC), Boolean.valueOf(zzaKE)
        });
    }

    public boolean isConnected()
    {
        return zzIu;
    }

    public boolean isEnabled()
    {
        return zzaKC;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("ConnectionConfiguration[ ");
        stringbuilder.append((new StringBuilder()).append("mName=").append(mName).toString());
        stringbuilder.append((new StringBuilder()).append(", mAddress=").append(zzacM).toString());
        stringbuilder.append((new StringBuilder()).append(", mType=").append(zzMG).toString());
        stringbuilder.append((new StringBuilder()).append(", mRole=").append(zzWv).toString());
        stringbuilder.append((new StringBuilder()).append(", mEnabled=").append(zzaKC).toString());
        stringbuilder.append((new StringBuilder()).append(", mIsConnected=").append(zzIu).toString());
        stringbuilder.append((new StringBuilder()).append(", mPeerNodeId=").append(zzaKD).toString());
        stringbuilder.append((new StringBuilder()).append(", mBtlePriority=").append(zzaKE).toString());
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i);
    }

    public String zzyV()
    {
        return zzaKD;
    }

    public boolean zzyW()
    {
        return zzaKE;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zze();
    private final String mName;
    private boolean zzIu;
    private final int zzMG;
    private final int zzWv;
    private final boolean zzaKC;
    private String zzaKD;
    private boolean zzaKE;
    private final String zzacM;
    final int zzzH;

}
