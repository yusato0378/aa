// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.signin.internal;

import android.content.Context;
import android.os.*;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.internal.zzmd;
import com.google.android.gms.internal.zzme;
import java.util.*;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.signin.internal:
//            zzf, AuthAccountResult, zze, CheckServerAuthResult

public class zzh extends zzi
    implements zzmd
{
    private static class zza extends zzd.zza
    {

        static com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks zza(zza zza1)
            throws RemoteException
        {
            return zza1.zzwh();
        }

        private com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks zzwh()
            throws RemoteException
        {
            return zzSY.zzwh();
        }

        public void zza(String s, String s1, zzf zzf1)
            throws RemoteException
        {
            zzaBN.submit(new Runnable(this, s, s1, zzf1) {

                public void run()
                {
                    try
                    {
                        boolean flag = zza.zza(zzaBR).onUploadServerAuthCode(zzaBP, zzaBS);
                        zzaBQ.zzag(flag);
                        return;
                    }
                    catch(RemoteException remoteexception)
                    {
                        Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", remoteexception);
                    }
                }

                final String zzaBP;
                final zzf zzaBQ;
                final zza zzaBR;
                final String zzaBS;

            
            {
                zzaBR = zza1;
                zzaBP = s;
                zzaBS = s1;
                zzaBQ = zzf1;
                super();
            }
            }
);
        }

        public void zza(String s, List list, zzf zzf1)
            throws RemoteException
        {
            zzaBN.submit(new Runnable(this, list, s, zzf1) {

                public void run()
                {
                    try
                    {
                        Object obj = zza.zza(zzaBR);
                        Set set = Collections.unmodifiableSet(new HashSet(zzaBO));
                        obj = ((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks) (obj)).onCheckServerAuthorization(zzaBP, set);
                        obj = new CheckServerAuthResult(((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks.CheckResult) (obj)).zzkN(), ((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks.CheckResult) (obj)).zzkO());
                        zzaBQ.zza(((CheckServerAuthResult) (obj)));
                        return;
                    }
                    catch(RemoteException remoteexception)
                    {
                        Log.e("SignInClientImpl", "RemoteException thrown when processing checkServerAuthorization callback", remoteexception);
                    }
                }

                final List zzaBO;
                final String zzaBP;
                final zzf zzaBQ;
                final zza zzaBR;

            
            {
                zzaBR = zza1;
                zzaBO = list;
                zzaBP = s;
                zzaBQ = zzf1;
                super();
            }
            }
);
        }

        private final zzme zzSY;
        private final ExecutorService zzaBN;

        public zza(zzme zzme1, ExecutorService executorservice)
        {
            zzSY = zzme1;
            zzaBN = executorservice;
        }
    }


    public zzh(Context context, Looper looper, zze zze1, zzme zzme1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, ExecutorService executorservice)
    {
        super(context, looper, 44, connectioncallbacks, onconnectionfailedlistener, zze1);
        zzQg = zze1;
        zzSY = zzme1;
        zzSZ = zze1.zzlN();
        zzaBN = executorservice;
    }

    public static Bundle zza(zzme zzme1, Integer integer, ExecutorService executorservice)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", zzme1.zzwf());
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", zzme1.zzwg());
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", zzme1.zzvx());
        if(zzme1.zzwh() != null)
            bundle.putParcelable("com.google.android.gms.signin.internal.signInCallbacks", new BinderWrapper((new zza(zzme1, executorservice)).asBinder()));
        if(integer != null)
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", integer.intValue());
        return bundle;
    }

    protected IInterface zzD(IBinder ibinder)
    {
        return zzcI(ibinder);
    }

    public void zza(zzo zzo, Set set, com.google.android.gms.signin.internal.zze zze1)
    {
        zzv.zzb(zze1, "Expecting a valid ISignInCallbacks");
        try
        {
            ((zzf)zzlX()).zza(new AuthAccountRequest(zzo, set), zze1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(zzo zzo)
        {
            Log.w("SignInClientImpl", "Remote service probably died when authAccount is called");
        }
        try
        {
            zze1.zza(new ConnectionResult(8, null), new AuthAccountResult());
            return;
        }
        // Misplaced declaration of an exception variable
        catch(zzo zzo)
        {
            Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.");
        }
    }

    public void zza(zzo zzo, boolean flag)
    {
        try
        {
            ((zzf)zzlX()).zza(zzo, zzSZ.intValue(), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(zzo zzo)
        {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public void zza(zzr zzr1)
    {
        zzv.zzb(zzr1, "Expecting a valid IResolveAccountCallbacks");
        try
        {
            android.accounts.Account account = zzQg.zzlE();
            ((zzf)zzlX()).zza(new ResolveAccountRequest(account, zzSZ.intValue()), zzr1);
            return;
        }
        catch(RemoteException remoteexception)
        {
            Log.w("SignInClientImpl", "Remote service probably died when resolveAccount is called");
        }
        try
        {
            zzr1.zzb(new ResolveAccountResponse(8));
            return;
        }
        // Misplaced declaration of an exception variable
        catch(zzr zzr1)
        {
            Log.wtf("SignInClientImpl", "IResolveAccountCallbacks#onAccountResolutionComplete should be executed from the same process, unexpected RemoteException.");
        }
    }

    protected zzf zzcI(IBinder ibinder)
    {
        return zzf.zza.zzcH(ibinder);
    }

    protected String zzeq()
    {
        return "com.google.android.gms.signin.service.START";
    }

    protected String zzer()
    {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    protected Bundle zzka()
    {
        Bundle bundle = zza(zzSY, zzQg.zzlN(), zzaBN);
        String s = zzQg.zzlJ();
        if(!getContext().getPackageName().equals(s))
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", zzQg.zzlJ());
        return bundle;
    }

    public void zzwe()
    {
        try
        {
            ((zzf)zzlX()).zzhB(zzSZ.intValue());
            return;
        }
        catch(RemoteException remoteexception)
        {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    private final zze zzQg;
    private final zzme zzSY;
    private Integer zzSZ;
    private final ExecutorService zzaBN;
}
