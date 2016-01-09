// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.*;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.identity.intents.UserAddressRequest;

// Referenced classes of package com.google.android.gms.internal:
//            zzke

public class zzkc extends zzi
{
    public static final class zza extends zzkd.zza
    {

        private void setActivity(Activity activity)
        {
            zzpf = activity;
        }

        static void zza(zza zza1, Activity activity)
        {
            zza1.setActivity(activity);
        }

        public void zzi(int i, Bundle bundle)
        {
            if(i != 1) goto _L2; else goto _L1
_L1:
            Intent intent = new Intent();
            intent.putExtras(bundle);
            bundle = zzpf.createPendingResult(zzTc, intent, 0x40000000);
            if(bundle != null) goto _L4; else goto _L3
_L3:
            return;
_L4:
            try
            {
                bundle.send(1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(Bundle bundle)
            {
                Log.w("AddressClientImpl", "Exception settng pending result", bundle);
            }
            return;
_L2:
            PendingIntent pendingintent = null;
            if(bundle != null)
                pendingintent = (PendingIntent)bundle.getParcelable("com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT");
            bundle = new ConnectionResult(i, pendingintent);
            if(bundle.hasResolution())
            {
                try
                {
                    bundle.startResolutionForResult(zzpf, zzTc);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch(Bundle bundle)
                {
                    Log.w("AddressClientImpl", "Exception starting pending intent", bundle);
                }
                return;
            }
            bundle = zzpf.createPendingResult(zzTc, new Intent(), 0x40000000);
            if(bundle != null)
            {
                try
                {
                    bundle.send(1);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch(Bundle bundle)
                {
                    Log.w("AddressClientImpl", "Exception setting pending result", bundle);
                }
                return;
            }
            if(true) goto _L3; else goto _L5
_L5:
        }

        private final int zzTc;
        private Activity zzpf;

        public zza(int i, Activity activity)
        {
            zzTc = i;
            zzpf = activity;
        }
    }


    public zzkc(Activity activity, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, int i)
    {
        super(activity, looper, 12, connectioncallbacks, onconnectionfailedlistener);
        zzKw = s;
        zzpf = activity;
        mTheme = i;
    }

    public void disconnect()
    {
        super.disconnect();
        if(zzapn != null)
        {
            zza.zza(zzapn, null);
            zzapn = null;
        }
    }

    protected IInterface zzD(IBinder ibinder)
    {
        return zzba(ibinder);
    }

    public void zza(UserAddressRequest useraddressrequest, int i)
    {
        zzsx();
        zzapn = new zza(i, zzpf);
        try
        {
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.gms.identity.intents.EXTRA_CALLING_PACKAGE_NAME", getContext().getPackageName());
            if(!TextUtils.isEmpty(zzKw))
                bundle.putParcelable("com.google.android.gms.identity.intents.EXTRA_ACCOUNT", new Account(zzKw, "com.google"));
            bundle.putInt("com.google.android.gms.identity.intents.EXTRA_THEME", mTheme);
            zzsw().zza(zzapn, useraddressrequest, bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(UserAddressRequest useraddressrequest)
        {
            Log.e("AddressClientImpl", "Exception requesting user address", useraddressrequest);
        }
        useraddressrequest = new Bundle();
        useraddressrequest.putInt("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", 555);
        zzapn.zzi(1, useraddressrequest);
    }

    protected zzke zzba(IBinder ibinder)
    {
        return zzke.zza.zzbc(ibinder);
    }

    protected String zzeq()
    {
        return "com.google.android.gms.identity.service.BIND";
    }

    protected String zzer()
    {
        return "com.google.android.gms.identity.intents.internal.IAddressService";
    }

    protected zzke zzsw()
        throws DeadObjectException
    {
        return (zzke)super.zzlX();
    }

    protected void zzsx()
    {
        super.zzlW();
    }

    private final int mTheme;
    private final String zzKw;
    private zza zzapn;
    private Activity zzpf;
}
