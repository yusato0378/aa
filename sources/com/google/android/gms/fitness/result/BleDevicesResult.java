// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.data.DataType;
import java.util.*;

// Referenced classes of package com.google.android.gms.fitness.result:
//            zza

public class BleDevicesResult
    implements Result, SafeParcelable
{

    BleDevicesResult(int i, List list, Status status)
    {
        zzzH = i;
        zzafH = Collections.unmodifiableList(list);
        zzKr = status;
    }

    public BleDevicesResult(List list, Status status)
    {
        zzzH = 3;
        zzafH = Collections.unmodifiableList(list);
        zzKr = status;
    }

    public static BleDevicesResult zzC(Status status)
    {
        return new BleDevicesResult(Collections.emptyList(), status);
    }

    private boolean zzb(BleDevicesResult bledevicesresult)
    {
        return zzKr.equals(bledevicesresult.zzKr) && zzu.equal(zzafH, bledevicesresult.zzafH);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof BleDevicesResult) && zzb((BleDevicesResult)obj);
    }

    public List getClaimedBleDevices()
    {
        return zzafH;
    }

    public List getClaimedBleDevices(DataType datatype)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = zzafH.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            BleDevice bledevice = (BleDevice)iterator.next();
            if(bledevice.getDataTypes().contains(datatype))
                arraylist.add(bledevice);
        } while(true);
        return Collections.unmodifiableList(arraylist);
    }

    public Status getStatus()
    {
        return zzKr;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzKr, zzafH
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("status", zzKr).zzg("bleDevices", zzafH).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    private final Status zzKr;
    private final List zzafH;
    private final int zzzH;

}
