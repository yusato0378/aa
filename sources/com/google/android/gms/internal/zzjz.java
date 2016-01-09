// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.*;
import com.google.android.gms.fitness.BleApi;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.BleScanCallback;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.result.BleDevicesResult;

// Referenced classes of package com.google.android.gms.internal:
//            zzjo

public class zzjz
    implements BleApi
{

    public zzjz()
    {
    }

    public PendingResult claimBleDevice(GoogleApiClient googleapiclient, BleDevice bledevice)
    {
        return new zzjo(zzaeB);
    }

    public PendingResult claimBleDevice(GoogleApiClient googleapiclient, String s)
    {
        return new zzjo(zzaeB);
    }

    public PendingResult listClaimedBleDevices(GoogleApiClient googleapiclient)
    {
        return new zzjo(BleDevicesResult.zzC(zzaeB));
    }

    public PendingResult startBleScan(GoogleApiClient googleapiclient, StartBleScanRequest startblescanrequest)
    {
        return new zzjo(zzaeB);
    }

    public PendingResult stopBleScan(GoogleApiClient googleapiclient, BleScanCallback blescancallback)
    {
        return new zzjo(zzaeB);
    }

    public PendingResult unclaimBleDevice(GoogleApiClient googleapiclient, BleDevice bledevice)
    {
        return new zzjo(zzaeB);
    }

    public PendingResult unclaimBleDevice(GoogleApiClient googleapiclient, String s)
    {
        return new zzjo(zzaeB);
    }

    private static final Status zzaeB = new Status(5007);

}
