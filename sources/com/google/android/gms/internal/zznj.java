// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.*;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

// Referenced classes of package com.google.android.gms.internal:
//            zzne, zznc, zznb

public class zznj extends zzg
{

    protected zznj()
    {
        super("com.google.android.gms.wallet.dynamite.WalletDynamiteCreatorImpl");
    }

    public static zznb zza(Activity activity, zzc zzc, WalletFragmentOptions walletfragmentoptions, zznc zznc)
        throws GooglePlayServicesNotAvailableException
    {
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(activity);
        if(i != 0)
            throw new GooglePlayServicesNotAvailableException(i);
        try
        {
            activity = ((zzne)zzyS().zzX(activity)).zza(zze.zzt(activity), zzc, walletfragmentoptions, zznc);
        }
        // Misplaced declaration of an exception variable
        catch(Activity activity)
        {
            throw new RuntimeException(activity);
        }
        // Misplaced declaration of an exception variable
        catch(Activity activity)
        {
            throw new RuntimeException(activity);
        }
        return activity;
    }

    private static zznj zzyS()
    {
        if(zzaKh == null)
            zzaKh = new zznj();
        return zzaKh;
    }

    protected zzne zzcQ(IBinder ibinder)
    {
        return zzne.zza.zzcM(ibinder);
    }

    protected Object zzd(IBinder ibinder)
    {
        return zzcQ(ibinder);
    }

    private static zznj zzaKh;
}
