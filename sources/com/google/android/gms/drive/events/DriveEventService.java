// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.events;

import android.app.Service;
import android.content.Intent;
import android.os.*;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.drive.internal.OnEventResponse;
import com.google.android.gms.drive.internal.zzx;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.drive.events:
//            ChangeListener, CompletionListener, zzc, DriveEvent, 
//            ChangeEvent, CompletionEvent, ChangesAvailableEvent

public abstract class DriveEventService extends Service
    implements ChangeListener, CompletionListener, zzc
{
    final class zza extends Handler
    {

        static Message zza(zza zza1)
        {
            return zza1.zznJ();
        }

        static Message zza(zza zza1, OnEventResponse oneventresponse)
        {
            return zza1.zzb(oneventresponse);
        }

        private Message zzb(OnEventResponse oneventresponse)
        {
            return obtainMessage(1, oneventresponse);
        }

        private Message zznJ()
        {
            return obtainMessage(2);
        }

        public void handleMessage(Message message)
        {
            zzx.zzs("DriveEventService", (new StringBuilder()).append("handleMessage message type:").append(message.what).toString());
            switch(message.what)
            {
            default:
                zzx.zzt("DriveEventService", (new StringBuilder()).append("Unexpected message type:").append(message.what).toString());
                return;

            case 1: // '\001'
                DriveEventService.zza(zzXc, (OnEventResponse)message.obj);
                return;

            case 2: // '\002'
                getLooper().quit();
                break;
            }
        }

        final DriveEventService zzXc;

        zza()
        {
            zzXc = DriveEventService.this;
            super();
        }
    }

    final class zzb extends com.google.android.gms.drive.internal.zzam.zza
    {

        public void zzc(OnEventResponse oneventresponse)
            throws RemoteException
        {
            DriveEventService driveeventservice = zzXc;
            driveeventservice;
            JVM INSTR monitorenter ;
            zzx.zzs("DriveEventService", (new StringBuilder()).append("onEvent: ").append(oneventresponse).toString());
            DriveEventService.zza(zzXc);
            if(zzXc.zzWZ == null)
                break MISSING_BLOCK_LABEL_75;
            oneventresponse = zza.zza(zzXc.zzWZ, oneventresponse);
            zzXc.zzWZ.sendMessage(oneventresponse);
_L2:
            return;
            zzx.zzu("DriveEventService", "Receiving event before initialize is completed.");
            if(true) goto _L2; else goto _L1
_L1:
            oneventresponse;
            driveeventservice;
            JVM INSTR monitorexit ;
            throw oneventresponse;
        }

        final DriveEventService zzXc;

        zzb()
        {
            zzXc = DriveEventService.this;
            super();
        }
    }


    protected DriveEventService()
    {
        this("DriveEventService");
    }

    protected DriveEventService(String s)
    {
        zzXa = false;
        zzSR = -1;
        mName = s;
    }

    static void zza(DriveEventService driveeventservice)
        throws SecurityException
    {
        driveeventservice.zznI();
    }

    static void zza(DriveEventService driveeventservice, OnEventResponse oneventresponse)
    {
        driveeventservice.zza(oneventresponse);
    }

    private void zza(OnEventResponse oneventresponse)
    {
        oneventresponse = oneventresponse.zzob();
        zzx.zzs("DriveEventService", (new StringBuilder()).append("handleEventMessage: ").append(oneventresponse).toString());
        oneventresponse.getType();
        JVM INSTR tableswitch 1 4: default 147
    //                   1 91
    //                   2 129
    //                   3 64
    //                   4 138;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        zzx.zzt(mName, (new StringBuilder()).append("Unhandled event: ").append(oneventresponse).toString());
        return;
_L2:
        try
        {
            onChange((ChangeEvent)oneventresponse);
            return;
        }
        catch(Exception exception)
        {
            zzx.zza(mName, exception, (new StringBuilder()).append("Error handling event: ").append(oneventresponse).toString());
        }
        return;
_L3:
        onCompletion((CompletionEvent)oneventresponse);
        return;
_L4:
        zza((ChangesAvailableEvent)oneventresponse);
        return;
    }

    static CountDownLatch zzb(DriveEventService driveeventservice)
    {
        return driveeventservice.zzWY;
    }

    private void zznI()
        throws SecurityException
    {
        int i = getCallingUid();
        if(i == zzSR)
            return;
        if(GooglePlayServicesUtil.zzd(this, i))
        {
            zzSR = i;
            return;
        } else
        {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
    }

    protected int getCallingUid()
    {
        return Binder.getCallingUid();
    }

    public final IBinder onBind(Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        if(!"com.google.android.gms.drive.events.HANDLE_EVENT".equals(intent.getAction()))
            break MISSING_BLOCK_LABEL_119;
        if(zzWZ != null || zzXa)
            break MISSING_BLOCK_LABEL_86;
        zzXa = true;
        intent = new CountDownLatch(1);
        zzWY = new CountDownLatch(1);
        (new Thread(intent) {

            public void run()
            {
                Looper.prepare();
                zzXc.zzWZ = zzXc. new zza();
                zzXc.zzXa = false;
                zzXb.countDown();
                zzx.zzs("DriveEventService", "Bound and starting loop");
                Looper.loop();
                zzx.zzs("DriveEventService", "Finished loop");
                if(DriveEventService.zzb(zzXc) != null)
                    DriveEventService.zzb(zzXc).countDown();
                return;
                Exception exception;
                exception;
                if(DriveEventService.zzb(zzXc) != null)
                    DriveEventService.zzb(zzXc).countDown();
                throw exception;
            }

            final CountDownLatch zzXb;
            final DriveEventService zzXc;

            
            {
                zzXc = DriveEventService.this;
                zzXb = countdownlatch;
                super();
            }
        }
).start();
        if(!intent.await(5000L, TimeUnit.MILLISECONDS))
            zzx.zzu("DriveEventService", "Failed to synchronously initialize event handler.");
        intent = (new zzb()).asBinder();
_L1:
        this;
        JVM INSTR monitorexit ;
        return intent;
        intent;
        throw new RuntimeException("Unable to start event handler", intent);
        intent;
        this;
        JVM INSTR monitorexit ;
        throw intent;
        intent = null;
          goto _L1
    }

    public void onChange(ChangeEvent changeevent)
    {
        zzx.zzt(mName, (new StringBuilder()).append("Unhandled change event: ").append(changeevent).toString());
    }

    public void onCompletion(CompletionEvent completionevent)
    {
        zzx.zzt(mName, (new StringBuilder()).append("Unhandled completion event: ").append(completionevent).toString());
    }

    public void onDestroy()
    {
        this;
        JVM INSTR monitorenter ;
        zzx.zzs("DriveEventService", "onDestroy");
        if(zzWZ == null)
            break MISSING_BLOCK_LABEL_66;
        Message message = zza.zza(zzWZ);
        zzWZ.sendMessage(message);
        zzWZ = null;
        Exception exception;
        try
        {
            if(!zzWY.await(5000L, TimeUnit.MILLISECONDS))
                zzx.zzt("DriveEventService", "Failed to synchronously quit event handler. Will quit itself");
        }
        catch(InterruptedException interruptedexception) { }
        zzWY = null;
        super.onDestroy();
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        throw exception;
    }

    public boolean onUnbind(Intent intent)
    {
        return true;
    }

    public void zza(ChangesAvailableEvent changesavailableevent)
    {
        zzx.zzt(mName, (new StringBuilder()).append("Unhandled changes available event: ").append(changesavailableevent).toString());
    }

    public static final String ACTION_HANDLE_EVENT = "com.google.android.gms.drive.events.HANDLE_EVENT";
    private final String mName;
    int zzSR;
    private CountDownLatch zzWY;
    zza zzWZ;
    boolean zzXa;
}
