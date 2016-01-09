// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.identity.intents;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzkc;

// Referenced classes of package com.google.android.gms.identity.intents:
//            UserAddressRequest

public final class Address
{
    public static final class AddressOptions
        implements com.google.android.gms.common.api.Api.ApiOptions.HasOptions
    {

        public final int theme;

        public AddressOptions()
        {
            theme = 0;
        }

        public AddressOptions(int i)
        {
            theme = i;
        }
    }

    private static abstract class zza extends com.google.android.gms.common.api.zza.zza
    {

        public Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        public Status zzb(Status status)
        {
            return status;
        }

        public zza(GoogleApiClient googleapiclient)
        {
            super(Address.zzKh, googleapiclient);
        }
    }


    public Address()
    {
    }

    public static void requestUserAddress(GoogleApiClient googleapiclient, UserAddressRequest useraddressrequest, int i)
    {
        googleapiclient.zza(new zza(googleapiclient, useraddressrequest, i) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzkc)zza1);
            }

            protected void zza(zzkc zzkc1)
                throws RemoteException
            {
                zzkc1.zza(zzapj, zzapk);
                setResult(Status.zzQU);
            }

            final UserAddressRequest zzapj;
            final int zzapk;

            
            {
                zzapj = useraddressrequest;
                zzapk = i;
                super(googleapiclient);
            }
        }
);
    }

    public static final Api API;
    static final com.google.android.gms.common.api.Api.zzc zzKh;
    private static final com.google.android.gms.common.api.Api.zzb zzKi;

    static 
    {
        zzKh = new com.google.android.gms.common.api.Api.zzc();
        zzKi = new com.google.android.gms.common.api.Api.zzb() {

            public int getPriority()
            {
                return 0x7fffffff;
            }

            public volatile com.google.android.gms.common.api.Api.zza zza(Context context, Looper looper, zze zze1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zza(context, looper, zze1, (AddressOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public zzkc zza(Context context, Looper looper, zze zze1, AddressOptions addressoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                zzv.zzb(context instanceof Activity, "An Activity must be used for Address APIs");
                AddressOptions addressoptions1 = addressoptions;
                if(addressoptions == null)
                    addressoptions1 = new AddressOptions();
                return new zzkc((Activity)context, looper, connectioncallbacks, onconnectionfailedlistener, zze1.getAccountName(), addressoptions1.theme);
            }

        }
;
        API = new Api("Address.API", zzKi, zzKh, new Scope[0]);
    }
}
