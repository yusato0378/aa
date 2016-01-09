// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.analytics.AnalyticsService;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.analytics.CampaignTrackingService;
import com.google.android.gms.analytics.zza;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzgo;
import com.google.android.gms.internal.zzgp;
import com.google.android.gms.internal.zzht;
import com.google.android.gms.internal.zzkg;
import com.google.android.gms.internal.zzkk;
import com.google.android.gms.internal.zzkp;
import com.google.android.gms.internal.zzkq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zzf, zzai, zzg, 
//            zzah, zzq, zzu, zzs, 
//            zze, zzi, zzh, zzae, 
//            zzv, zzaf, zzal, zzaa, 
//            zzag, zzam, zzx

class zzk extends zzd
{

    protected zzk(zze zze1, zzf zzf1)
    {
        super(zze1);
        zzv.zzr(zzf1);
        zzGv = 0x8000000000000000L;
        zzGt = zzf1.zzk(zze1);
        zzGr = zzf1.zzm(zze1);
        zzGs = zzf1.zzn(zze1);
        zzGu = zzf1.zzo(zze1);
        zzGw = new zzs(zze1) {

            public void run()
            {
                com.google.android.gms.analytics.internal.zzk.zza(zzGB);
            }

            final zzk zzGB;

            
            {
                zzGB = zzk.this;
                super(zze1);
            }
        }
;
        zzGx = new zzs(zze1) {

            public void run()
            {
                zzk.zzb(zzGB);
            }

            final zzk zzGB;

            
            {
                zzGB = zzk.this;
                super(zze1);
            }
        }
;
    }

    private void zza(zzg zzg1, zzkq zzkq)
    {
        zzv.zzr(zzg1);
        zzv.zzr(zzkq);
        Object obj = new zza(zzgD());
        ((zza) (obj)).zzat(zzg1.zzhb());
        ((zza) (obj)).enableAdvertisingIdCollection(zzg1.zzhc());
        obj = ((zza) (obj)).zzfP();
        zzgp zzgp1 = (zzgp)((zzkg) (obj)).zze(com/google/android/gms/internal/zzgp);
        zzgp1.zzay("data");
        zzgp1.zzF(true);
        ((zzkg) (obj)).zzb(zzkq);
        zzgo zzgo1 = (zzgo)((zzkg) (obj)).zze(com/google/android/gms/internal/zzgo);
        zzkp zzkp1 = (zzkp)((zzkg) (obj)).zze(com/google/android/gms/internal/zzkp);
        for(Iterator iterator = zzg1.zzhe().entrySet().iterator(); iterator.hasNext();)
        {
            Object obj1 = (java.util.Map.Entry)iterator.next();
            String s = (String)((java.util.Map.Entry) (obj1)).getKey();
            obj1 = (String)((java.util.Map.Entry) (obj1)).getValue();
            if("an".equals(s))
                zzkp1.setAppName(((String) (obj1)));
            else
            if("av".equals(s))
                zzkp1.setAppVersion(((String) (obj1)));
            else
            if("aid".equals(s))
                zzkp1.setAppId(((String) (obj1)));
            else
            if("aiid".equals(s))
                zzkp1.setAppInstallerId(((String) (obj1)));
            else
            if("uid".equals(s))
                zzgp1.zzaz(((String) (obj1)));
            else
                zzgo1.set(s, ((String) (obj1)));
        }

        zzb("Sending installation campaign to", zzg1.zzhb(), zzkq);
        ((zzkg) (obj)).zzK(zzgL().zzjd());
        ((zzkg) (obj)).zzud();
    }

    static void zza(zzk zzk1)
    {
        zzk1.zzht();
    }

    private boolean zzaM(String s)
    {
        return getContext().checkCallingOrSelfPermission(s) == 0;
    }

    static void zzb(zzk zzk1)
    {
        zzk1.zzhu();
    }

    private boolean zzhA()
    {
        while(zzGA || zzgI().zzhP() && !zzgI().zzhQ() || zzhG() <= 0L) 
            return false;
        return true;
    }

    private void zzhB()
    {
        zzu zzu1;
        zzu1 = zzgK();
        break MISSING_BLOCK_LABEL_5;
        if(zzu1.zziz() && !zzu1.zzaK())
        {
            long l = zzhm();
            if(l != 0L && Math.abs(zzgG().currentTimeMillis() - l) <= zzgI().zzhZ())
            {
                zza("Dispatch alarm scheduled (ms)", Long.valueOf(zzgI().zzhY()));
                zzu1.zziA();
                return;
            }
        }
        return;
    }

    private void zzhC()
    {
        zzhB();
        long l1 = zzhG();
        long l = zzgL().zzjf();
        if(l != 0L)
        {
            l = l1 - Math.abs(zzgG().currentTimeMillis() - l);
            if(l <= 0L)
                l = Math.min(zzgI().zzhW(), l1);
        } else
        {
            l = Math.min(zzgI().zzhW(), l1);
        }
        zza("Dispatch scheduled (ms)", Long.valueOf(l));
        if(zzGw.zzaK())
        {
            l = Math.max(1L, l + zzGw.zziw());
            zzGw.zzs(l);
            return;
        } else
        {
            zzGw.zzr(l);
            return;
        }
    }

    private void zzhD()
    {
        zzhE();
        zzhF();
    }

    private void zzhE()
    {
        if(zzGw.zzaK())
            zzaF("All hits dispatched or no network/service. Going to power save mode");
        zzGw.cancel();
    }

    private void zzhF()
    {
        zzu zzu1 = zzgK();
        if(zzu1.zzaK())
            zzu1.cancel();
    }

    private void zzhr()
    {
        Context context = zzgD().getContext();
        if(AnalyticsReceiver.zzH(context)) goto _L2; else goto _L1
_L1:
        zzaI("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
_L8:
        if(CampaignTrackingReceiver.zzH(context)) goto _L4; else goto _L3
_L3:
        zzaI("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
_L6:
        return;
_L2:
        if(!AnalyticsService.zzI(context))
            zzaJ("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        continue; /* Loop/switch isn't completed */
_L4:
        if(CampaignTrackingService.zzI(context)) goto _L6; else goto _L5
_L5:
        zzaI("CampaignTrackingService is not registered or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        return;
        if(true) goto _L8; else goto _L7
_L7:
    }

    private void zzht()
    {
        zzb(new com.google.android.gms.analytics.internal.zzv() {

            public void zzc(Throwable throwable)
            {
                zzGB.zzhz();
            }

            final zzk zzGB;

            
            {
                zzGB = zzk.this;
                super();
            }
        }
);
    }

    private void zzhu()
    {
        try
        {
            zzGr.zzhl();
            zzhz();
        }
        catch(SQLiteException sqliteexception)
        {
            zzd("Failed to delete stale hits", sqliteexception);
        }
        zzGx.zzr(zzgI().zzir());
    }

    protected void onServiceConnected()
    {
        zzgF();
        if(!zzgI().zzhP())
            zzhw();
    }

    void start()
    {
        zzgR();
        boolean flag;
        if(!mStarted)
            flag = true;
        else
            flag = false;
        zzv.zza(flag, "Analytics backend already started");
        mStarted = true;
        if(!zzgI().zzhP())
            zzhr();
        zzgJ().zze(new Runnable() {

            public void run()
            {
                zzGB.zzhs();
            }

            final zzk zzGB;

            
            {
                zzGB = zzk.this;
                super();
            }
        }
);
    }

    public void zzG(boolean flag)
    {
        zzhz();
    }

    public long zza(zzg zzg1, boolean flag)
    {
        zzv.zzr(zzg1);
        zzgR();
        zzgF();
        long l;
        zzGr.beginTransaction();
        zzGr.zza(zzg1.zzha(), zzg1.getClientId());
        l = zzGr.zza(zzg1.zzha(), zzg1.getClientId(), zzg1.zzhb());
        if(flag)
            break MISSING_BLOCK_LABEL_91;
        zzg1.zzl(l);
_L1:
        zzGr.zzb(zzg1);
        zzGr.setTransactionSuccessful();
        try
        {
            zzGr.endTransaction();
        }
        // Misplaced declaration of an exception variable
        catch(zzg zzg1)
        {
            zze("Failed to end transaction", zzg1);
            return l;
        }
        return l;
        zzg1.zzl(1L + l);
          goto _L1
        zzg1;
        zze("Failed to update Analytics property", zzg1);
        try
        {
            zzGr.endTransaction();
        }
        // Misplaced declaration of an exception variable
        catch(zzg zzg1)
        {
            zze("Failed to end transaction", zzg1);
            return -1L;
        }
        return -1L;
        zzg1;
        try
        {
            zzGr.endTransaction();
        }
        catch(SQLiteException sqliteexception)
        {
            zze("Failed to end transaction", sqliteexception);
        }
        throw zzg1;
    }

    public void zza(zzaa zzaa1)
    {
        zzv.zzr(zzaa1);
        zzkk.zzgF();
        zzgR();
        if(zzGA)
            zzaG("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
        else
            zza("Delivering hit", zzaa1);
        zzaa1 = zzf(zzaa1);
        zzhv();
        if(zzGu.zzb(zzaa1))
        {
            zzaG("Hit sent to the device AnalyticsService for delivery");
            return;
        }
        if(zzgI().zzhP())
        {
            zzgH().zza(zzaa1, "Service unavailable on package side");
            return;
        }
        try
        {
            zzGr.zzc(zzaa1);
            zzhz();
            return;
        }
        catch(SQLiteException sqliteexception)
        {
            zze("Delivery failed to save hit to a database", sqliteexception);
        }
        zzgH().zza(zzaa1, "deliver: failed to insert hit to database");
    }

    public void zza(com.google.android.gms.analytics.internal.zzv zzv1, long l)
    {
        zzkk.zzgF();
        zzgR();
        long l1 = -1L;
        long l2 = zzgL().zzjf();
        if(l2 != 0L)
            l1 = Math.abs(zzgG().currentTimeMillis() - l2);
        zzb("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(l1));
        if(!zzgI().zzhP())
            zzhv();
        if(zzhx())
        {
            zzgJ().zze(new Runnable(zzv1, l) {

                public void run()
                {
                    zzGB.zza(zzFC, zzGC);
                }

                final com.google.android.gms.analytics.internal.zzv zzFC;
                final zzk zzGB;
                final long zzGC;

            
            {
                zzGB = zzk.this;
                zzFC = zzv1;
                zzGC = l;
                super();
            }
            }
);
            return;
        }
        zzgL().zzjg();
        zzhz();
        if(zzv1 == null)
            break MISSING_BLOCK_LABEL_118;
        zzv1.zzc(null);
        if(zzGz != l)
        {
            zzGt.zziY();
            return;
        }
        break MISSING_BLOCK_LABEL_169;
        Throwable throwable;
        throwable;
        zze("Local dispatch failed", throwable);
        zzgL().zzjg();
        zzhz();
        if(zzv1 != null)
            zzv1.zzc(throwable);
    }

    public void zzaN(String s)
    {
        zzv.zzbS(s);
        zzgF();
        zzgE();
        zzkq zzkq = com.google.android.gms.analytics.internal.zzal.zza(zzgH(), s);
        if(zzkq == null)
        {
            zzd("Parsing failed. Ignoring invalid campaign data", s);
        } else
        {
            String s1 = zzgL().zzjh();
            if(s.equals(s1))
            {
                zzaI("Ignoring duplicate install campaign");
                return;
            }
            if(!TextUtils.isEmpty(s1))
            {
                zzd("Ignoring multiple install campaigns. original, new", s1, s);
                return;
            }
            zzgL().zzaR(s);
            if(zzgL().zzje().zzt(zzgI().zziu()))
            {
                zzd("Campaign received too late, ignoring", zzkq);
                return;
            }
            zzb("Received installation campaign", zzkq);
            s = zzGr.zzp(0L).iterator();
            while(s.hasNext()) 
                zza((zzg)s.next(), zzkq);
        }
    }

    public void zzb(com.google.android.gms.analytics.internal.zzv zzv1)
    {
        zza(zzv1, zzGz);
    }

    protected void zzc(zzg zzg1)
    {
        zzgF();
        zzb("Sending first hit to property", zzg1.zzhb());
        Object obj;
        if(!zzgL().zzje().zzt(zzgI().zziu()))
            if(!TextUtils.isEmpty(((CharSequence) (obj = zzgL().zzjh()))))
            {
                obj = com.google.android.gms.analytics.internal.zzal.zza(zzgH(), ((String) (obj)));
                zzb("Found relevant installation campaign", obj);
                zza(zzg1, ((zzkq) (obj)));
                return;
            }
    }

    zzaa zzf(zzaa zzaa1)
    {
        Object obj1;
        if(TextUtils.isEmpty(zzaa1.zziT()))
            if((obj1 = zzgL().zzji().zzjl()) != null)
            {
                Object obj = (Long)((Pair) (obj1)).second;
                obj1 = (String)((Pair) (obj1)).first;
                obj = (new StringBuilder()).append(obj).append(":").append(((String) (obj1))).toString();
                obj1 = new HashMap(zzaa1.zzhe());
                ((Map) (obj1)).put("_m", obj);
                return com.google.android.gms.analytics.internal.zzaa.zza(this, zzaa1, ((Map) (obj1)));
            }
        return zzaa1;
    }

    void zzgB()
    {
        zzgF();
        zzGz = zzgG().currentTimeMillis();
    }

    protected void zzgb()
    {
        zzGr.zzfV();
        zzGs.zzfV();
        zzGu.zzfV();
    }

    public void zzgv()
    {
        zzkk.zzgF();
        zzgR();
        if(!zzgI().zzhP())
        {
            zzaF("Delete all hits from local store");
            try
            {
                zzGr.zzhj();
                zzGr.zzhk();
                zzhz();
            }
            catch(SQLiteException sqliteexception)
            {
                zzd("Failed to delete hits from store", sqliteexception);
            }
        }
        zzhv();
        if(zzGu.zzhf())
            zzaF("Device service unavailable. Can't clear hits stored on the device service.");
    }

    public void zzgz()
    {
        zzkk.zzgF();
        zzgR();
        zzaF("Service disconnected");
    }

    public long zzhG()
    {
        long l;
        if(zzGv != 0x8000000000000000L)
        {
            l = zzGv;
        } else
        {
            l = zzgI().zzhX();
            if(zzga().zziJ())
                return (long)zzga().zzjB() * 1000L;
        }
        return l;
    }

    public void zzhH()
    {
        zzgR();
        zzgF();
        zzGA = true;
        zzGu.disconnect();
        zzhz();
    }

    public long zzhm()
    {
        zzkk.zzgF();
        zzgR();
        long l;
        try
        {
            l = zzGr.zzhm();
        }
        catch(SQLiteException sqliteexception)
        {
            zze("Failed to get min/max hit times from local store", sqliteexception);
            return 0L;
        }
        return l;
    }

    protected void zzhs()
    {
        zzgR();
        zzgL().zzjd();
        if(!zzaM("android.permission.ACCESS_NETWORK_STATE"))
        {
            zzaJ("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzhH();
        }
        if(!zzaM("android.permission.INTERNET"))
        {
            zzaJ("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzhH();
        }
        if(AnalyticsService.zzI(getContext()))
            zzaF("AnalyticsService registered in the app manifest and enabled");
        else
        if(zzgI().zzhP())
            zzaJ("Device AnalyticsService not registered! Hits will not be delivered reliably.");
        else
            zzaI("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        if(!zzGA && !zzgI().zzhP() && !zzGr.isEmpty())
            zzhv();
        zzhz();
    }

    protected void zzhv()
    {
        if(!zzGA && zzgI().zzhR() && !zzGu.isConnected())
        {
            long l = zzgI().zzim();
            if(zzGy.zzt(l))
            {
                zzGy.start();
                zzaF("Connecting to service");
                if(zzGu.connect())
                {
                    zzaF("Connected to service");
                    zzGy.clear();
                    onServiceConnected();
                    return;
                }
            }
        }
    }

    public void zzhw()
    {
        zzkk.zzgF();
        zzgR();
        zzgE();
        if(!zzgI().zzhR())
            zzaI("Service client disabled. Can't dispatch local hits to device AnalyticsService");
        if(zzGu.isConnected()) goto _L2; else goto _L1
_L1:
        zzaF("Service not connected");
_L4:
        return;
_L2:
        if(zzGr.isEmpty()) goto _L4; else goto _L3
_L3:
        zzaF("Dispatching local hits to device AnalyticsService");
_L6:
        Object obj;
        try
        {
            obj = zzGr.zzn(zzgI().zzia());
            if(((List) (obj)).isEmpty())
            {
                zzhz();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            zze("Failed to read hits from store", obj);
            zzhD();
            return;
        }
        continue;
        while(!((List) (obj)).isEmpty()) 
        {
            zzaa1 = (zzaa)((List) (obj)).get(0);
            if(!zzGu.zzb(zzaa1))
            {
                zzhz();
                return;
            }
            ((List) (obj)).remove(zzaa1);
            try
            {
                zzGr.zzo(zzaa1.zziO());
            }
            catch(SQLiteException sqliteexception)
            {
                zze("Failed to remove hit that was send for delivery", sqliteexception);
                zzhD();
                return;
            }
        }
        if(true) goto _L6; else goto _L5
_L5:
    }

    protected boolean zzhx()
    {
        Object obj;
        long l;
        long l2;
        boolean flag1 = true;
        zzkk.zzgF();
        zzgR();
        zzaF("Dispatching a batch of local hits");
        boolean flag;
        if(!zzGu.isConnected() && !zzgI().zzhP())
            flag = true;
        else
            flag = false;
        if(zzGs.zziZ())
            flag1 = false;
        if(flag && flag1)
        {
            zzaF("No network or service available. Will retry later");
            return false;
        }
        l2 = Math.max(zzgI().zzia(), zzgI().zzib());
        obj = new ArrayList();
        l = 0L;
_L7:
        zzGr.beginTransaction();
        ((List) (obj)).clear();
        List list;
        list = zzGr.zzn(l2);
        if(!list.isEmpty())
            break MISSING_BLOCK_LABEL_186;
        zzaF("Store is empty, nothing to dispatch");
        zzhD();
        try
        {
            zzGr.setTransactionSuccessful();
            zzGr.endTransaction();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            zze("Failed to commit local dispatch transaction", obj);
            zzhD();
            return false;
        }
        return false;
        zza("Hits loaded from store. count", Integer.valueOf(list.size()));
        Iterator iterator = list.iterator();
        do
            if(!iterator.hasNext())
                break MISSING_BLOCK_LABEL_336;
        while(((zzaa)iterator.next()).zziO() != l);
        zzd("Database contains successfully uploaded hit", Long.valueOf(l), Integer.valueOf(list.size()));
        zzhD();
        try
        {
            zzGr.setTransactionSuccessful();
            zzGr.endTransaction();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            zze("Failed to commit local dispatch transaction", obj);
            zzhD();
            return false;
        }
        return false;
        obj;
        zzd("Failed to read hits from persisted store", obj);
        zzhD();
        try
        {
            zzGr.setTransactionSuccessful();
            zzGr.endTransaction();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            zze("Failed to commit local dispatch transaction", obj);
            zzhD();
            return false;
        }
        return false;
        long l1 = l;
        if(!zzGu.isConnected())
            break MISSING_BLOCK_LABEL_753;
        l1 = l;
        if(zzgI().zzhP())
            break MISSING_BLOCK_LABEL_753;
        zzaF("Service connected, sending hits to the service");
_L6:
        l1 = l;
        Object obj2;
        if(list.isEmpty())
            break MISSING_BLOCK_LABEL_753;
        obj2 = (zzaa)list.get(0);
        if(zzGu.zzb(((zzaa) (obj2)))) goto _L2; else goto _L1
_L1:
        l1 = l;
        if(!zzGs.zziZ()) goto _L4; else goto _L3
_L3:
        obj2 = zzGs.zzg(list);
        for(Iterator iterator1 = ((List) (obj2)).iterator(); iterator1.hasNext();)
            l = Math.max(l, ((Long)iterator1.next()).longValue());

          goto _L5
_L2:
        l = Math.max(l, ((zzaa) (obj2)).zziO());
        list.remove(obj2);
        zzb("Hit sent do device AnalyticsService for delivery", obj2);
        zzGr.zzo(((zzaa) (obj2)).zziO());
        ((List) (obj)).add(Long.valueOf(((zzaa) (obj2)).zziO()));
          goto _L6
        obj;
        zze("Failed to remove hit that was send for delivery", obj);
        zzhD();
        try
        {
            zzGr.setTransactionSuccessful();
            zzGr.endTransaction();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            zze("Failed to commit local dispatch transaction", obj);
            zzhD();
            return false;
        }
        return false;
_L5:
        list.removeAll(((java.util.Collection) (obj2)));
        zzGr.zze(((List) (obj2)));
        ((List) (obj)).addAll(((java.util.Collection) (obj2)));
        l1 = l;
_L4:
        boolean flag2 = ((List) (obj)).isEmpty();
        if(flag2)
        {
            try
            {
                zzGr.setTransactionSuccessful();
                zzGr.endTransaction();
            }
            catch(SQLiteException sqliteexception)
            {
                zze("Failed to commit local dispatch transaction", sqliteexception);
                zzhD();
                return false;
            }
            return false;
        }
        break MISSING_BLOCK_LABEL_685;
        Object obj1;
        obj1;
        zze("Failed to remove successfully uploaded hits", obj1);
        zzhD();
        try
        {
            zzGr.setTransactionSuccessful();
            zzGr.endTransaction();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj1)
        {
            zze("Failed to commit local dispatch transaction", obj1);
            zzhD();
            return false;
        }
        return false;
        try
        {
            zzGr.setTransactionSuccessful();
            zzGr.endTransaction();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj1)
        {
            zze("Failed to commit local dispatch transaction", obj1);
            zzhD();
            return false;
        }
        l = l1;
          goto _L7
        obj1;
        try
        {
            zzGr.setTransactionSuccessful();
            zzGr.endTransaction();
        }
        catch(SQLiteException sqliteexception1)
        {
            zze("Failed to commit local dispatch transaction", sqliteexception1);
            zzhD();
            return false;
        }
        throw obj1;
        l = l1;
          goto _L1
    }

    public void zzhy()
    {
        zzkk.zzgF();
        zzgR();
        zzaG("Sync dispatching local hits");
        long l = zzGz;
        if(!zzgI().zzhP())
            zzhv();
        try
        {
            while(zzhx()) ;
            zzgL().zzjg();
            zzhz();
            if(zzGz != l)
                zzGt.zziY();
            return;
        }
        catch(Throwable throwable)
        {
            zze("Sync local dispatch failed", throwable);
        }
        zzhz();
    }

    public void zzhz()
    {
        zzgD().zzgF();
        zzgR();
        if(!zzhA())
        {
            zzGt.unregister();
            zzhD();
            return;
        }
        if(zzGr.isEmpty())
        {
            zzGt.unregister();
            zzhD();
            return;
        }
        boolean flag;
        if(!((Boolean)zzx.zzHM.get()).booleanValue())
        {
            zzGt.zziW();
            flag = zzGt.isConnected();
        } else
        {
            flag = true;
        }
        if(flag)
        {
            zzhC();
            return;
        } else
        {
            zzhD();
            zzhB();
            return;
        }
    }

    public void zzq(long l)
    {
        zzkk.zzgF();
        zzgR();
        long l1 = l;
        if(l < 0L)
            l1 = 0L;
        zzGv = l1;
        zzhz();
    }

    private boolean mStarted;
    private boolean zzGA;
    private final zzi zzGr;
    private final zzag zzGs;
    private final zzaf zzGt;
    private final zzh zzGu;
    private long zzGv;
    private final zzs zzGw;
    private final zzs zzGx;
    private final zzai zzGy = new zzai(zzgG());
    private long zzGz;
}
