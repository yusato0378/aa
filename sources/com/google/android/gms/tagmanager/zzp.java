// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.*;
import com.google.android.gms.internal.*;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcb, zzcn, zzcm, zzbe, 
//            zzs, zzbg, Container, TagManager, 
//            zzo, zzcd, ContainerHolder, zzbf

public class zzp extends AbstractPendingResult
{
    static interface zza
    {

        public abstract boolean zzb(Container container);
    }

    private class zzb
        implements zzbf
    {

        public void zza(com.google.android.gms.internal.zzmi.zza zza1)
        {
            com.google.android.gms.internal.zzc.zzj zzj1;
            if(zza1.zzaGM != null)
            {
                zzj1 = zza1.zzaGM;
            } else
            {
                com.google.android.gms.internal.zzc.zzf zzf1 = zza1.zzhh;
                zzj1 = new com.google.android.gms.internal.zzc.zzj();
                zzj1.zzhh = zzf1;
                zzj1.zzhg = null;
                zzj1.zzhi = zzf1.version;
            }
            zzp.zza(zzaCL, zzj1, zza1.zzaGL, true);
        }

        public void zza(zzbf.zza zza1)
        {
            if(!zzp.zzh(zzaCL))
                zzp.zza(zzaCL, 0L);
        }

        public void zzv(Object obj)
        {
            zza((com.google.android.gms.internal.zzmi.zza)obj);
        }

        public void zzwB()
        {
        }

        final zzp zzaCL;

        private zzb()
        {
            zzaCL = zzp.this;
            super();
        }

    }

    private class zzc
        implements zzbf
    {

        public void zza(zzbf.zza zza1)
        {
            zza1 = zzaCL;
            zza1;
            JVM INSTR monitorenter ;
            if(!zzaCL.isReady())
            {
                if(zzp.zzf(zzaCL) == null)
                    break MISSING_BLOCK_LABEL_54;
                zzaCL.setResult(zzp.zzf(zzaCL));
            }
_L2:
            zzp.zza(zzaCL, 0x36ee80L);
            return;
            zzaCL.setResult(zzaCL.zzaO(Status.zzQX));
            if(true) goto _L2; else goto _L1
_L1:
            Exception exception;
            exception;
            zza1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void zzb(com.google.android.gms.internal.zzc.zzj zzj1)
        {
label0:
            {
                synchronized(zzaCL)
                {
                    if(zzj1.zzhh != null)
                        break MISSING_BLOCK_LABEL_59;
                    if(zzp.zzi(zzaCL).zzhh != null)
                        break label0;
                    zzbg.zzak("Current resource is null; network resource is also null");
                    zzp.zza(zzaCL, 0x36ee80L);
                }
                return;
            }
            zzj1.zzhh = zzp.zzi(zzaCL).zzhh;
            zzp.zza(zzaCL, zzj1, zzp.zzg(zzaCL).currentTimeMillis(), false);
            zzbg.zzam((new StringBuilder()).append("setting refresh time to current time: ").append(zzp.zzj(zzaCL)).toString());
            if(!zzp.zzk(zzaCL))
                zzp.zza(zzaCL, zzj1);
            zzp1;
            JVM INSTR monitorexit ;
            return;
            zzj1;
            zzp1;
            JVM INSTR monitorexit ;
            throw zzj1;
        }

        public void zzv(Object obj)
        {
            zzb((com.google.android.gms.internal.zzc.zzj)obj);
        }

        public void zzwB()
        {
        }

        final zzp zzaCL;

        private zzc()
        {
            zzaCL = zzp.this;
            super();
        }

    }

    private class zzd
        implements zzo.zza
    {

        public void zzdB(String s)
        {
            zzaCL.zzdB(s);
        }

        public String zzwu()
        {
            return zzaCL.zzwu();
        }

        public void zzww()
        {
            if(zzp.zze(zzaCL).zziU())
                zzp.zza(zzaCL, 0L);
        }

        final zzp zzaCL;

        private zzd()
        {
            zzaCL = zzp.this;
            super();
        }

    }

    static interface zze
        extends Releasable
    {

        public abstract void zza(zzbf zzbf);

        public abstract void zzdE(String s);

        public abstract void zzf(long l, String s);
    }

    static interface zzf
        extends Releasable
    {

        public abstract void zza(zzbf zzbf);

        public abstract void zzb(com.google.android.gms.internal.zzmi.zza zza1);

        public abstract com.google.android.gms.internal.zzmq.zzc zzhC(int i);

        public abstract void zzwC();
    }


    zzp(Context context, TagManager tagmanager, Looper looper, String s, int i, zzf zzf1, zze zze1, 
            zzml zzml1, zzht zzht1, zzcd zzcd)
    {
        Looper looper1;
        if(looper == null)
            looper1 = Looper.getMainLooper();
        else
            looper1 = looper;
        super(looper1);
        mContext = context;
        zzaCw = tagmanager;
        context = looper;
        if(looper == null)
            context = Looper.getMainLooper();
        zzPx = context;
        zzaCk = s;
        zzaCB = i;
        zzaCC = zzf1;
        zzaCI = zze1;
        zzaCD = zzml1;
        zzaCz = new zzd();
        zzaCG = new com.google.android.gms.internal.zzc.zzj();
        zznR = zzht1;
        zzaCA = zzcd;
        if(zzwA())
            zzdB(zzcb.zzxl().zzxn());
    }

    public zzp(Context context, TagManager tagmanager, Looper looper, String s, int i, zzs zzs1)
    {
        this(context, tagmanager, looper, s, i, ((zzf) (new zzcn(context, s))), ((zze) (new zzcm(context, s, zzs1))), new zzml(context), zzhv.zznd(), ((zzcd) (new zzbe(30, 0xdbba0L, 5000L, "refreshing", zzhv.zznd()))));
        zzaCD.zzem(zzs1.zzwD());
    }

    private void zzQ(long l)
    {
        this;
        JVM INSTR monitorenter ;
        if(zzaCI != null)
            break MISSING_BLOCK_LABEL_17;
        zzbg.zzan("Refresh requested, but no network load scheduler.");
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        zzaCI.zzf(l, zzaCG.zzhi);
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    static zzo zza(zzp zzp1, zzo zzo1)
    {
        zzp1.zzaCE = zzo1;
        return zzo1;
    }

    static String zza(zzp zzp1)
    {
        return zzp1.zzaCk;
    }

    private void zza(com.google.android.gms.internal.zzc.zzj zzj1)
    {
        this;
        JVM INSTR monitorenter ;
        if(zzaCC != null)
        {
            com.google.android.gms.internal.zzmi.zza zza1 = new com.google.android.gms.internal.zzmi.zza();
            zza1.zzaGL = zzaCp;
            zza1.zzhh = new com.google.android.gms.internal.zzc.zzf();
            zza1.zzaGM = zzj1;
            zzaCC.zzb(zza1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        zzj1;
        throw zzj1;
    }

    private void zza(com.google.android.gms.internal.zzc.zzj zzj1, long l, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if(!flag) goto _L2; else goto _L1
_L1:
        flag = zzaCF;
        if(!flag) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if(isReady())
            if(zzaCE != null);
        zzaCG = zzj1;
        zzaCp = l;
        zzQ(Math.max(0L, Math.min(0x2932e00L, (zzaCp + 0x2932e00L) - zznR.currentTimeMillis())));
        zzj1 = new Container(mContext, zzaCw.getDataLayer(), zzaCk, l, zzj1);
        if(zzaCE != null)
            break; /* Loop/switch isn't completed */
        zzaCE = new zzo(zzaCw, zzPx, zzj1, zzaCz);
_L5:
        if(!isReady() && zzaCJ.zzb(zzj1))
            setResult(zzaCE);
        if(true) goto _L3; else goto _L4
        zzj1;
        throw zzj1;
_L4:
        zzaCE.zza(zzj1);
          goto _L5
    }

    static void zza(zzp zzp1, long l)
    {
        zzp1.zzQ(l);
    }

    static void zza(zzp zzp1, com.google.android.gms.internal.zzc.zzj zzj1)
    {
        zzp1.zza(zzj1);
    }

    static void zza(zzp zzp1, com.google.android.gms.internal.zzc.zzj zzj1, long l, boolean flag)
    {
        zzp1.zza(zzj1, l, flag);
    }

    private void zzah(boolean flag)
    {
        zzaCC.zza(new zzb());
        zzaCI.zza(new zzc());
        com.google.android.gms.internal.zzmq.zzc zzc1 = zzaCC.zzhC(zzaCB);
        if(zzc1 != null)
            zzaCE = new zzo(zzaCw, zzPx, new Container(mContext, zzaCw.getDataLayer(), zzaCk, 0L, zzc1), zzaCz);
        zzaCJ = new zza(flag) {

            public boolean zzb(Container container)
            {
                if(!zzaCN) goto _L2; else goto _L1
_L1:
                if(container.getLastRefreshTime() + 0x2932e00L < zzp.zzg(zzaCL).currentTimeMillis()) goto _L4; else goto _L3
_L3:
                return true;
_L4:
                return false;
_L2:
                if(container.isDefault())
                    return false;
                if(true) goto _L3; else goto _L5
_L5:
            }

            final zzp zzaCL;
            final boolean zzaCN;

            
            {
                zzaCL = zzp.this;
                zzaCN = flag;
                super();
            }
        }
;
        if(zzwA())
        {
            zzaCI.zzf(0L, "");
            return;
        } else
        {
            zzaCC.zzwC();
            return;
        }
    }

    static TagManager zzb(zzp zzp1)
    {
        return zzp1.zzaCw;
    }

    static Looper zzc(zzp zzp1)
    {
        return zzp1.zzPx;
    }

    static Context zzd(zzp zzp1)
    {
        return zzp1.mContext;
    }

    static zzcd zze(zzp zzp1)
    {
        return zzp1.zzaCA;
    }

    static zzo zzf(zzp zzp1)
    {
        return zzp1.zzaCE;
    }

    static zzht zzg(zzp zzp1)
    {
        return zzp1.zznR;
    }

    static boolean zzh(zzp zzp1)
    {
        return zzp1.zzaCF;
    }

    static com.google.android.gms.internal.zzc.zzj zzi(zzp zzp1)
    {
        return zzp1.zzaCG;
    }

    static long zzj(zzp zzp1)
    {
        return zzp1.zzaCp;
    }

    static boolean zzk(zzp zzp1)
    {
        return zzp1.zzwA();
    }

    private boolean zzwA()
    {
        zzcb zzcb1 = zzcb.zzxl();
        return (zzcb1.zzxm() == zzcb.zza.zzaEv || zzcb1.zzxm() == zzcb.zza.zzaEw) && zzaCk.equals(zzcb1.getContainerId());
    }

    protected Result createFailedResult(Status status)
    {
        return zzaO(status);
    }

    public void load(String s)
    {
        Integer integer;
        if(zzaCB != -1)
            integer = Integer.valueOf(zzaCB);
        else
            integer = null;
        zzaCD.zza(zzaCk, integer, s, new com.google.android.gms.internal.zzml.zza(s) {

            public void zza(zzmp zzmp1)
            {
                if(zzmp1.getStatus() != Status.zzQU)
                {
                    zzbg.zzak((new StringBuilder()).append("Load request failed for the container ").append(zzp.zza(zzaCL)).toString());
                    zzaCL.setResult(zzaCL.zzaO(Status.zzQW));
                    return;
                }
                com.google.android.gms.internal.zzmq.zzc zzc1 = zzmp1.zzym().zzyq();
                if(zzc1 == null)
                {
                    zzbg.zzak("Response doesn't have the requested container");
                    zzaCL.setResult(zzaCL.zzaO(new Status(8, "Response doesn't have the requested container", null)));
                    return;
                } else
                {
                    long l = zzmp1.zzym().zzyr();
                    zzp.zza(zzaCL, new zzo(zzp.zzb(zzaCL), zzp.zzc(zzaCL), new Container(zzp.zzd(zzaCL), zzp.zzb(zzaCL).getDataLayer(), zzp.zza(zzaCL), l, zzc1), new zzo.zza(this) {

                        public void zzdB(String s)
                        {
                            zzaCM.zzaCL.zzdB(s);
                        }

                        public String zzwu()
                        {
                            return zzaCM.zzaCL.zzwu();
                        }

                        public void zzww()
                        {
                            if(zzp.zze(zzaCM.zzaCL).zziU())
                                zzaCM.zzaCL.load(zzaCM.zzaCK);
                        }

                        final _cls1 zzaCM;

            
            {
                zzaCM = _pcls1;
                super();
            }
                    }
));
                    zzaCL.setResult(zzp.zzf(zzaCL));
                    return;
                }
            }

            final String zzaCK;
            final zzp zzaCL;

            
            {
                zzaCL = zzp.this;
                zzaCK = s;
                super();
            }
        }
);
    }

    protected ContainerHolder zzaO(Status status)
    {
        if(zzaCE != null)
            return zzaCE;
        if(status == Status.zzQX)
            zzbg.zzak("timer expired: setting result to failure");
        return new zzo(status);
    }

    void zzdB(String s)
    {
        this;
        JVM INSTR monitorenter ;
        zzaCH = s;
        if(zzaCI != null)
            zzaCI.zzdE(s);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    String zzwu()
    {
        this;
        JVM INSTR monitorenter ;
        String s = zzaCH;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public void zzwx()
    {
        Object obj = zzaCC.zzhC(zzaCB);
        if(obj != null)
        {
            obj = new Container(mContext, zzaCw.getDataLayer(), zzaCk, 0L, ((com.google.android.gms.internal.zzmq.zzc) (obj)));
            setResult(new zzo(zzaCw, zzPx, ((Container) (obj)), new zzo.zza() {

                public void zzdB(String s)
                {
                    zzaCL.zzdB(s);
                }

                public String zzwu()
                {
                    return zzaCL.zzwu();
                }

                public void zzww()
                {
                    zzbg.zzan("Refresh ignored: container loaded as default only.");
                }

                final zzp zzaCL;

            
            {
                zzaCL = zzp.this;
                super();
            }
            }
));
        } else
        {
            zzbg.zzak("Default was requested, but no default container was found");
            setResult(zzaO(new Status(10, "Default was requested, but no default container was found", null)));
        }
        zzaCI = null;
        zzaCC = null;
    }

    public void zzwy()
    {
        zzah(false);
    }

    public void zzwz()
    {
        zzah(true);
    }

    private final Context mContext;
    private final Looper zzPx;
    private final zzcd zzaCA;
    private final int zzaCB;
    private zzf zzaCC;
    private zzml zzaCD;
    private volatile zzo zzaCE;
    private volatile boolean zzaCF;
    private com.google.android.gms.internal.zzc.zzj zzaCG;
    private String zzaCH;
    private zze zzaCI;
    private zza zzaCJ;
    private final String zzaCk;
    private long zzaCp;
    private final TagManager zzaCw;
    private final zzd zzaCz;
    private final zzht zznR;
}
