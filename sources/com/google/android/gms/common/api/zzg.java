// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common.api;

import android.content.*;
import android.net.Uri;
import android.os.*;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.internal.zzhi;
import com.google.android.gms.internal.zzhj;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.*;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient, zzf, Api, PendingResult, 
//            zzh, zzk, zzd, zze, 
//            zzl, zzm, Status, zzi, 
//            Scope, ResultCallback, Result

final class zzg
    implements GoogleApiClient
{
    final class zza extends Handler
    {

        public void handleMessage(Message message)
        {
            switch(message.what)
            {
            default:
                Log.w("GoogleApiClientImpl", (new StringBuilder()).append("Unknown message id: ").append(message.what).toString());
                return;

            case 1: // '\001'
                zzg.zzg(zzQJ);
                return;

            case 2: // '\002'
                zzg.zzf(zzQJ);
                break;
            }
        }

        final zzg zzQJ;

        zza(Looper looper)
        {
            zzQJ = zzg.this;
            super(looper);
        }
    }

    private static class zzb extends BroadcastReceiver
    {

        public void onReceive(Context context, Intent intent)
        {
            intent = intent.getData();
            context = null;
            if(intent != null)
                context = intent.getSchemeSpecificPart();
            if(context != null && context.equals("com.google.android.gms"))
                if((context = (zzg)zzQP.get()) != null)
                {
                    zzg.zzf(context);
                    return;
                }
        }

        private WeakReference zzQP;

        zzb(zzg zzg1)
        {
            zzQP = new WeakReference(zzg1);
        }
    }

    static interface zzc
    {

        public abstract void zzc(zze zze1);
    }

    public abstract class zzd
        implements GoogleApiClient.ConnectionCallbacks
    {

        public void onConnectionSuspended(int i)
        {
            zzg.zzb(zzQJ).lock();
            boolean flag = zzg.zza(zzQJ) instanceof zzf;
            if(flag)
            {
                zzg.zzb(zzQJ).unlock();
                return;
            }
            i;
            JVM INSTR tableswitch 1 2: default 64
        //                       1 110
        //                       2 77;
               goto _L1 _L2 _L3
_L1:
            zzg.zzb(zzQJ).unlock();
            return;
_L3:
            zzg.zza(zzQJ, i);
            zzQJ.connect();
              goto _L1
            Exception exception;
            exception;
            zzg.zzb(zzQJ).unlock();
            throw exception;
_L2:
            flag = zzQJ.zzlb();
            if(flag)
            {
                zzg.zzb(zzQJ).unlock();
                return;
            }
            zzg.zza(zzQJ, true);
            if(zzQJ.zzQy == null)
            {
                zzQJ.zzQy = new zzb(zzQJ);
                IntentFilter intentfilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                intentfilter.addDataScheme("package");
                zzg.zzc(zzQJ).getApplicationContext().registerReceiver(zzQJ.zzQy, intentfilter);
            }
            zzQJ.zzQx.sendMessageDelayed(zzQJ.zzQx.obtainMessage(1), zzg.zzd(zzQJ));
            zzQJ.zzQx.sendMessageDelayed(zzQJ.zzQx.obtainMessage(2), com.google.android.gms.common.api.zzg.zze(zzQJ));
            zzg.zza(zzQJ, i);
              goto _L1
        }

        final zzg zzQJ;

        public zzd()
        {
            zzQJ = zzg.this;
            super();
        }
    }

    static interface zze
    {

        public abstract void cancel();

        public abstract void forceFailureUnlessReady(Status status);

        public abstract void zza(zzc zzc1);

        public abstract void zzb(Api.zza zza1)
            throws DeadObjectException;

        public abstract void zzk(Status status);

        public abstract Api.zzc zzkF();

        public abstract int zzkI();
    }


    public zzg(Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, Api.zzb zzb1, Map map, Set set, Set set1, 
            int i, int j)
    {
        zzQv = 0x1d4c0L;
        zzQw = 5000L;
        zzQB = new HashSet();
        zzQD = null;
        mContext = context;
        zzQs = new zzj(looper, zzQI);
        zzPx = looper;
        zzQx = new zza(looper);
        zzPH = i;
        zzPI = j;
        zzQr = zzPR.newCondition();
        zzQC = new zzf(this);
        GoogleApiClient.ConnectionCallbacks connectioncallbacks;
        for(set = set.iterator(); set.hasNext(); zzQs.registerConnectionCallbacks(connectioncallbacks))
            connectioncallbacks = (GoogleApiClient.ConnectionCallbacks)set.next();

        for(set = set1.iterator(); set.hasNext(); zzQs.registerConnectionFailedListener(set1))
            set1 = (GoogleApiClient.OnConnectionFailedListener)set.next();

        set1 = zze1.zzlI();
        Iterator iterator = map.keySet().iterator();
        while(iterator.hasNext()) 
        {
            Api api = (Api)iterator.next();
            set = ((Set) (map.get(api)));
            if(set1.get(api) != null)
            {
                if(((com.google.android.gms.common.internal.zze.zza)set1.get(api)).zzTa)
                    i = 1;
                else
                    i = 2;
            } else
            {
                i = 0;
            }
            zzQh.put(api, Integer.valueOf(i));
            if(api.zzkG())
                set = zza(api.zzkD(), set, context, looper, zze1, zzQH, zza(api, i));
            else
                set = zza(api.zzkC(), set, context, looper, zze1, zzQH, zza(api, i));
            zzQz.put(api.zzkF(), set);
        }
        zzQg = zze1;
        zzPK = zzb1;
    }

    private void resume()
    {
        zzPR.lock();
        if(zzlb())
            connect();
        zzPR.unlock();
        return;
        Exception exception;
        exception;
        zzPR.unlock();
        throw exception;
    }

    private static Api.zza zza(Api.zzb zzb1, Object obj, Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, GoogleApiClient.ConnectionCallbacks connectioncallbacks, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return zzb1.zza(context, looper, zze1, obj, connectioncallbacks, onconnectionfailedlistener);
    }

    private final GoogleApiClient.OnConnectionFailedListener zza(Api api, int i)
    {
        return new GoogleApiClient.OnConnectionFailedListener(api, i) {

            public void onConnectionFailed(ConnectionResult connectionresult)
            {
                zzg.zza(zzQJ).zza(connectionresult, zzQK, zzQL);
            }

            final zzg zzQJ;
            final Api zzQK;
            final int zzQL;

            
            {
                zzQJ = zzg.this;
                zzQK = api;
                zzQL = i;
                super();
            }
        }
;
    }

    static zzh zza(zzg zzg1)
    {
        return zzg1.zzQC;
    }

    private static zzaa zza(Api.zze zze1, Object obj, Context context, Looper looper, com.google.android.gms.common.internal.zze zze2, GoogleApiClient.ConnectionCallbacks connectioncallbacks, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return new zzaa(context, looper, zze1.zzkH(), connectioncallbacks, onconnectionfailedlistener, zze2, zze1.zzi(obj));
    }

    private void zza(GoogleApiClient googleapiclient, zzk zzk1, boolean flag)
    {
        zzhi.zzUh.zzc(googleapiclient).setResultCallback(new ResultCallback(zzk1, flag, googleapiclient) {

            public void onResult(Result result)
            {
                zzi((Status)result);
            }

            public void zzi(Status status)
            {
                if(status.isSuccess() && zzQJ.isConnected())
                    zzQJ.reconnect();
                zzQN.setResult(status);
                if(zzQO)
                    zzMO.disconnect();
            }

            final GoogleApiClient zzMO;
            final zzg zzQJ;
            final zzk zzQN;
            final boolean zzQO;

            
            {
                zzQJ = zzg.this;
                zzQN = zzk1;
                zzQO = flag;
                zzMO = googleapiclient;
                super();
            }
        }
);
    }

    static void zza(zzg zzg1, int i)
    {
        zzg1.zzav(i);
    }

    static void zza(zzg zzg1, GoogleApiClient googleapiclient, zzk zzk1, boolean flag)
    {
        zzg1.zza(googleapiclient, zzk1, flag);
    }

    static boolean zza(zzg zzg1, boolean flag)
    {
        zzg1.zzQu = flag;
        return flag;
    }

    private void zzav(int i)
    {
        zzPR.lock();
        zzQC.zzas(i);
        zzPR.unlock();
        return;
        Exception exception;
        exception;
        zzPR.unlock();
        throw exception;
    }

    static Lock zzb(zzg zzg1)
    {
        return zzg1.zzPR;
    }

    static Context zzc(zzg zzg1)
    {
        return zzg1.mContext;
    }

    static long zzd(zzg zzg1)
    {
        return zzg1.zzQv;
    }

    static long zze(zzg zzg1)
    {
        return zzg1.zzQw;
    }

    static void zzf(zzg zzg1)
    {
        zzg1.resume();
    }

    static void zzg(zzg zzg1)
    {
        zzg1.zzlc();
    }

    private void zzlc()
    {
        zzPR.lock();
        if(zzld())
            connect();
        zzPR.unlock();
        return;
        Exception exception;
        exception;
        zzPR.unlock();
        throw exception;
    }

    public ConnectionResult blockingConnect()
    {
        InterruptedException interruptedexception;
        ConnectionResult connectionresult;
        boolean flag;
        if(Looper.myLooper() != Looper.getMainLooper())
            flag = true;
        else
            flag = false;
        zzv.zza(flag, "blockingConnect must not be called on the UI thread");
        zzPR.lock();
        connect();
_L1:
        flag = isConnecting();
        if(!flag)
            break MISSING_BLOCK_LABEL_86;
        zzQr.await();
          goto _L1
        interruptedexception;
        Thread.currentThread().interrupt();
        connectionresult = new ConnectionResult(15, null);
        zzPR.unlock();
        return connectionresult;
        ConnectionResult connectionresult1;
        if(!isConnected())
            break MISSING_BLOCK_LABEL_108;
        connectionresult1 = ConnectionResult.zzOI;
        zzPR.unlock();
        return connectionresult1;
        if(zzQD == null)
            break MISSING_BLOCK_LABEL_131;
        connectionresult1 = zzQD;
        zzPR.unlock();
        return connectionresult1;
        connectionresult1 = new ConnectionResult(13, null);
        zzPR.unlock();
        return connectionresult1;
        Exception exception;
        exception;
        zzPR.unlock();
        throw exception;
    }

    public ConnectionResult blockingConnect(long l, TimeUnit timeunit)
    {
        long l1;
        boolean flag;
        if(Looper.myLooper() != Looper.getMainLooper())
            flag = true;
        else
            flag = false;
        zzv.zza(flag, "blockingConnect must not be called on the UI thread");
        zzPR.lock();
        connect();
        l = timeunit.toNanos(l);
_L2:
        flag = isConnecting();
        if(!flag)
            break MISSING_BLOCK_LABEL_129;
        l1 = zzQr.awaitNanos(l);
        l = l1;
        if(l1 > 0L) goto _L2; else goto _L1
_L1:
        timeunit = new ConnectionResult(14, null);
        zzPR.unlock();
        return timeunit;
        timeunit;
        Thread.currentThread().interrupt();
        timeunit = new ConnectionResult(15, null);
        zzPR.unlock();
        return timeunit;
        if(!isConnected())
            break MISSING_BLOCK_LABEL_151;
        timeunit = ConnectionResult.zzOI;
        zzPR.unlock();
        return timeunit;
        if(zzQD == null)
            break MISSING_BLOCK_LABEL_174;
        timeunit = zzQD;
        zzPR.unlock();
        return timeunit;
        timeunit = new ConnectionResult(13, null);
        zzPR.unlock();
        return timeunit;
        timeunit;
        zzPR.unlock();
        throw timeunit;
    }

    public PendingResult clearDefaultAccountAndReconnect()
    {
        zzv.zza(isConnected(), "GoogleApiClient is not connected yet.");
        zzk zzk1 = new zzk(zzPx);
        if(zzQz.containsKey(zzhi.zzKh))
        {
            zza(this, zzk1, false);
            return zzk1;
        } else
        {
            AtomicReference atomicreference = new AtomicReference();
            Object obj = new GoogleApiClient.ConnectionCallbacks(atomicreference, zzk1) {

                public void onConnected(Bundle bundle)
                {
                    zzg.zza(zzQJ, (GoogleApiClient)zzQM.get(), zzQN, true);
                }

                public void onConnectionSuspended(int i)
                {
                }

                final zzg zzQJ;
                final AtomicReference zzQM;
                final zzk zzQN;

            
            {
                zzQJ = zzg.this;
                zzQM = atomicreference;
                zzQN = zzk1;
                super();
            }
            }
;
            GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener = new GoogleApiClient.OnConnectionFailedListener(zzk1) {

                public void onConnectionFailed(ConnectionResult connectionresult)
                {
                    zzQN.setResult(new Status(8));
                }

                final zzg zzQJ;
                final zzk zzQN;

            
            {
                zzQJ = zzg.this;
                zzQN = zzk1;
                super();
            }
            }
;
            obj = (new GoogleApiClient.Builder(mContext)).addApi(zzhi.API).addConnectionCallbacks(((GoogleApiClient.ConnectionCallbacks) (obj))).addOnConnectionFailedListener(onconnectionfailedlistener).setHandler(zzQx).build();
            atomicreference.set(obj);
            ((GoogleApiClient) (obj)).connect();
            return zzk1;
        }
    }

    public void connect()
    {
        zzPR.lock();
        zzQC.connect();
        zzPR.unlock();
        return;
        Exception exception;
        exception;
        zzPR.unlock();
        throw exception;
    }

    public void disconnect()
    {
        zzld();
        zzav(-1);
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.append(s).println("GoogleApiClient:");
        s = (new StringBuilder()).append(s).append("  ").toString();
        printwriter.append(s).append("mState=").append(zzQC.getName());
        printwriter.append(" mResuming=").print(zzQu);
        printwriter.append(" mWorkQueue.size()=").print(zzQt.size());
        printwriter.append(" mUnconsumedRunners.size()=").println(zzQF.size());
        for(Iterator iterator = zzQz.values().iterator(); iterator.hasNext(); ((Api.zza)iterator.next()).dump(s, filedescriptor, printwriter, as));
    }

    public ConnectionResult getConnectionResult(Api api)
    {
        Api.zzc zzc1;
        zzc1 = api.zzkF();
        zzPR.lock();
        if(!isConnected() && !zzlb())
            throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
        break MISSING_BLOCK_LABEL_51;
        api;
        zzPR.unlock();
        throw api;
        if(!zzQz.containsKey(zzc1))
            break MISSING_BLOCK_LABEL_196;
        if(!((Api.zza)zzQz.get(zzc1)).isConnected())
            break MISSING_BLOCK_LABEL_100;
        api = ConnectionResult.zzOI;
        zzPR.unlock();
        return api;
        if(!zzQA.containsKey(zzc1))
            break MISSING_BLOCK_LABEL_138;
        api = (ConnectionResult)zzQA.get(zzc1);
        zzPR.unlock();
        return api;
        Log.wtf("GoogleApiClientImpl", (new StringBuilder()).append(api.getName()).append(" requested in getConnectionResult").append(" is not connected but is not present in the failed connections map").toString());
        api = new ConnectionResult(8, null);
        zzPR.unlock();
        return api;
        zzPR.unlock();
        throw new IllegalArgumentException((new StringBuilder()).append(api.getName()).append(" was never registered with GoogleApiClient").toString());
    }

    public Context getContext()
    {
        return mContext;
    }

    public Looper getLooper()
    {
        return zzPx;
    }

    public int getSessionId()
    {
        return System.identityHashCode(this);
    }

    public boolean hasConnectedApi(Api api)
    {
        api = (Api.zza)zzQz.get(api.zzkF());
        if(api == null)
            return false;
        else
            return api.isConnected();
    }

    public boolean isConnected()
    {
        return zzQC instanceof com.google.android.gms.common.api.zzd;
    }

    public boolean isConnecting()
    {
        return zzQC instanceof com.google.android.gms.common.api.zze;
    }

    public boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        return zzQs.isConnectionCallbacksRegistered(connectioncallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return zzQs.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    public void reconnect()
    {
        disconnect();
        connect();
    }

    public void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        zzQs.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzQs.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void stopAutoManage(FragmentActivity fragmentactivity)
    {
        if(zzPH >= 0)
        {
            com.google.android.gms.common.api.zzl.zza(fragmentactivity).zzax(zzPH);
            return;
        }
        if(zzPI >= 0)
        {
            zzm.zzb(fragmentactivity).zzax(zzPI);
            return;
        } else
        {
            throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
        }
    }

    public void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        zzQs.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzQs.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }

    public Api.zza zza(Api.zzc zzc1)
    {
        zzc1 = (Api.zza)zzQz.get(zzc1);
        zzv.zzb(zzc1, "Appropriate Api was not requested.");
        return zzc1;
    }

    public zza.zza zza(zza.zza zza1)
    {
        boolean flag;
        if(zza1.zzkF() != null)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "This task can not be enqueued (it's probably a Batch or malformed)");
        zzv.zzb(zzQz.containsKey(zza1.zzkF()), "GoogleApiClient is not configured to use the API required for this call.");
        zzPR.lock();
        zza1 = zzQC.zza(zza1);
        zzPR.unlock();
        return zza1;
        zza1;
        zzPR.unlock();
        throw zza1;
    }

    public boolean zza(Api api)
    {
        return zzQz.containsKey(api.zzkF());
    }

    public boolean zza(Scope scope)
    {
        zzPR.lock();
        if(!isConnected()) goto _L2; else goto _L1
_L1:
        boolean flag = zzQB.contains(scope);
        if(!flag) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        zzPR.unlock();
        return flag;
_L2:
        flag = false;
        if(true) goto _L5; else goto _L4
_L4:
        scope;
        zzPR.unlock();
        throw scope;
    }

    public zza.zza zzb(zza.zza zza1)
    {
        zze zze1;
        boolean flag;
        if(zza1.zzkF() != null)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "This task can not be executed (it's probably a Batch or malformed)");
        zzPR.lock();
        if(!zzlb())
            break MISSING_BLOCK_LABEL_113;
        zzQt.add(zza1);
        for(; !zzQt.isEmpty(); zze1.zzk(Status.zzQW))
        {
            zze1 = (zze)zzQt.remove();
            zzb(zze1);
        }

        break MISSING_BLOCK_LABEL_102;
        zza1;
        zzPR.unlock();
        throw zza1;
        zzPR.unlock();
        return zza1;
        zza1 = zzQC.zzb(zza1);
        zzPR.unlock();
        return zza1;
    }

    void zzb(zze zze1)
    {
        zzQF.add(zze1);
        zze1.zza(zzQG);
    }

    void zzg(ConnectionResult connectionresult)
    {
        zzPR.lock();
        zzQD = connectionresult;
        zzQC = new zzf(this);
        zzQC.begin();
        zzQr.signalAll();
        zzPR.unlock();
        return;
        connectionresult;
        zzPR.unlock();
        throw connectionresult;
    }

    void zzkX()
    {
        zze zze1;
        for(Iterator iterator = zzQF.iterator(); iterator.hasNext(); zze1.cancel())
        {
            zze1 = (zze)iterator.next();
            zze1.zza(null);
        }

        zzQF.clear();
        for(Iterator iterator1 = zzQE.iterator(); iterator1.hasNext(); ((zzi)iterator1.next()).clear());
        zzQE.clear();
        zzQB.clear();
    }

    void zzkY()
    {
        for(Iterator iterator = zzQz.values().iterator(); iterator.hasNext(); ((Api.zza)iterator.next()).disconnect());
    }

    void zzkZ()
    {
        zzPR.lock();
        zzQC = new com.google.android.gms.common.api.zze(this, zzQg, zzQh, zzPK, zzPR, mContext);
        zzQC.begin();
        zzQr.signalAll();
        zzPR.unlock();
        return;
        Exception exception;
        exception;
        zzPR.unlock();
        throw exception;
    }

    public zzi zzl(Object obj)
    {
        zzv.zzb(obj, "Listener must not be null");
        zzPR.lock();
        obj = new zzi(zzPx, obj);
        zzQE.add(obj);
        zzPR.unlock();
        return ((zzi) (obj));
        obj;
        zzPR.unlock();
        throw obj;
    }

    void zzla()
    {
        zzPR.lock();
        zzld();
        zzQC = new com.google.android.gms.common.api.zzd(this);
        zzQC.begin();
        zzQr.signalAll();
        zzPR.unlock();
        return;
        Exception exception;
        exception;
        zzPR.unlock();
        throw exception;
    }

    boolean zzlb()
    {
        return zzQu;
    }

    boolean zzld()
    {
        zzPR.lock();
        boolean flag = zzlb();
        if(!flag)
        {
            zzPR.unlock();
            return false;
        }
        zzQu = false;
        zzQx.removeMessages(2);
        zzQx.removeMessages(1);
        if(zzQy != null)
        {
            mContext.getApplicationContext().unregisterReceiver(zzQy);
            zzQy = null;
        }
        zzPR.unlock();
        return true;
        Exception exception;
        exception;
        zzPR.unlock();
        throw exception;
    }

    private final Context mContext;
    private final int zzPH;
    private final int zzPI;
    final Api.zzb zzPK;
    private final Lock zzPR = new ReentrantLock();
    private final Looper zzPx;
    final Map zzQA = new HashMap();
    Set zzQB;
    private volatile zzh zzQC;
    private ConnectionResult zzQD;
    private final Set zzQE = Collections.newSetFromMap(new WeakHashMap());
    final Set zzQF = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75F, 2));
    private final zzc zzQG = new zzc() {

        public void zzc(zze zze2)
        {
            zzQJ.zzQF.remove(zze2);
        }

        final zzg zzQJ;

            
            {
                zzQJ = zzg.this;
                super();
            }
    }
;
    private final GoogleApiClient.ConnectionCallbacks zzQH = new zzd() {

        public void onConnected(Bundle bundle)
        {
            zzg.zza(zzQJ).onConnected(bundle);
        }

        final zzg zzQJ;

            
            {
                zzQJ = zzg.this;
                super();
            }
    }
;
    private final com.google.android.gms.common.internal.zzj.zza zzQI = new com.google.android.gms.common.internal.zzj.zza() {

        public boolean isConnected()
        {
            return zzQJ.isConnected();
        }

        public Bundle zzjZ()
        {
            return null;
        }

        final zzg zzQJ;

            
            {
                zzQJ = zzg.this;
                super();
            }
    }
;
    final com.google.android.gms.common.internal.zze zzQg;
    final Map zzQh = new HashMap();
    private final Condition zzQr;
    final zzj zzQs;
    final Queue zzQt = new LinkedList();
    private volatile boolean zzQu;
    private long zzQv;
    private long zzQw;
    final zza zzQx;
    BroadcastReceiver zzQy;
    final Map zzQz = new HashMap();
}
