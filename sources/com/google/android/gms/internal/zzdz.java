// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.purchase.InAppPurchase;

// Referenced classes of package com.google.android.gms.internal:
//            zzdq

public class zzdz
    implements InAppPurchase
{

    public zzdz(zzdq zzdq1)
    {
        zzxC = zzdq1;
    }

    public String getProductId()
    {
        String s;
        try
        {
            s = zzxC.getProductId();
        }
        catch(RemoteException remoteexception)
        {
            zzb.zzd("Could not forward getProductId to InAppPurchase", remoteexception);
            return null;
        }
        return s;
    }

    public void recordPlayBillingResolution(int i)
    {
        try
        {
            zzxC.recordPlayBillingResolution(i);
            return;
        }
        catch(RemoteException remoteexception)
        {
            zzb.zzd("Could not forward recordPlayBillingResolution to InAppPurchase", remoteexception);
        }
    }

    public void recordResolution(int i)
    {
        try
        {
            zzxC.recordResolution(i);
            return;
        }
        catch(RemoteException remoteexception)
        {
            zzb.zzd("Could not forward recordResolution to InAppPurchase", remoteexception);
        }
    }

    private final zzdq zzxC;
}
