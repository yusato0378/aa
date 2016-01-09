// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzil;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzb

public class BleDevice
    implements SafeParcelable
{

    BleDevice(int i, String s, String s1, List list, List list1)
    {
        zzzH = i;
        zzacM = s;
        mName = s1;
        zzacN = Collections.unmodifiableList(list);
        zzacO = Collections.unmodifiableList(list1);
    }

    private boolean zza(BleDevice bledevice)
    {
        return mName.equals(bledevice.mName) && zzacM.equals(bledevice.zzacM) && zzil.zza(bledevice.zzacN, zzacN) && zzil.zza(zzacO, bledevice.zzacO);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof BleDevice) && zza((BleDevice)obj);
    }

    public String getAddress()
    {
        return zzacM;
    }

    public List getDataTypes()
    {
        return zzacO;
    }

    public String getName()
    {
        return mName;
    }

    public List getSupportedProfiles()
    {
        return zzacN;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            mName, zzacM, zzacN, zzacO
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("name", mName).zzg("address", zzacM).zzg("dataTypes", zzacO).zzg("supportedProfiles", zzacN).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    private final String mName;
    private final String zzacM;
    private final List zzacN;
    private final List zzacO;
    private final int zzzH;

}
