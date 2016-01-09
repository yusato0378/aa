// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import android.os.*;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ContainerHolder, TagManager, Container, zzbg

class zzo
    implements ContainerHolder
{
    public static interface zza
    {

        public abstract void zzdB(String s);

        public abstract String zzwu();

        public abstract void zzww();
    }

    private class zzb extends Handler
    {

        public void handleMessage(Message message)
        {
            switch(message.what)
            {
            default:
                zzbg.zzak("Don't know how to handle this message.");
                return;

            case 1: // '\001'
                zzdD((String)message.obj);
                break;
            }
        }

        public void zzdC(String s)
        {
            sendMessage(obtainMessage(1, s));
        }

        protected void zzdD(String s)
        {
            zzaCx.onContainerAvailable(zzaCy, s);
        }

        private final ContainerHolder.ContainerAvailableListener zzaCx;
        final zzo zzaCy;

        public zzb(ContainerHolder.ContainerAvailableListener containeravailablelistener, Looper looper)
        {
            zzaCy = zzo.this;
            super(looper);
            zzaCx = containeravailablelistener;
        }
    }


    public zzo(Status status)
    {
        zzKr = status;
        zzPx = null;
    }

    public zzo(TagManager tagmanager, Looper looper, Container container, zza zza1)
    {
        zzaCw = tagmanager;
        if(looper == null)
            looper = Looper.getMainLooper();
        zzPx = looper;
        zzaCs = container;
        zzaCv = zza1;
        zzKr = Status.zzQU;
        tagmanager.zza(this);
    }

    private void zzwv()
    {
        if(zzaCu != null)
            zzaCu.zzdC(zzaCt.zzws());
    }

    public Container getContainer()
    {
        Container container = null;
        this;
        JVM INSTR monitorenter ;
        if(!zzWX)
            break MISSING_BLOCK_LABEL_20;
        zzbg.zzak("ContainerHolder is released.");
_L1:
        this;
        JVM INSTR monitorexit ;
        return container;
        if(zzaCt != null)
        {
            zzaCs = zzaCt;
            zzaCt = null;
        }
        container = zzaCs;
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    String getContainerId()
    {
        if(zzWX)
        {
            zzbg.zzak("getContainerId called on a released ContainerHolder.");
            return "";
        } else
        {
            return zzaCs.getContainerId();
        }
    }

    public Status getStatus()
    {
        return zzKr;
    }

    public void refresh()
    {
        this;
        JVM INSTR monitorenter ;
        if(!zzWX)
            break MISSING_BLOCK_LABEL_17;
        zzbg.zzak("Refreshing a released ContainerHolder.");
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        zzaCv.zzww();
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    public void release()
    {
        this;
        JVM INSTR monitorenter ;
        if(!zzWX)
            break MISSING_BLOCK_LABEL_17;
        zzbg.zzak("Releasing a released ContainerHolder.");
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        zzWX = true;
        zzaCw.zzb(this);
        zzaCs.release();
        zzaCs = null;
        zzaCt = null;
        zzaCv = null;
        zzaCu = null;
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    public void setContainerAvailableListener(ContainerHolder.ContainerAvailableListener containeravailablelistener)
    {
        this;
        JVM INSTR monitorenter ;
        if(!zzWX) goto _L2; else goto _L1
_L1:
        zzbg.zzak("ContainerHolder is released.");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if(containeravailablelistener != null)
            break MISSING_BLOCK_LABEL_34;
        zzaCu = null;
          goto _L3
        containeravailablelistener;
        throw containeravailablelistener;
        zzaCu = new zzb(containeravailablelistener, zzPx);
        if(zzaCt != null)
            zzwv();
          goto _L3
    }

    public void zza(Container container)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = zzWX;
        if(!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if(container != null)
            break MISSING_BLOCK_LABEL_31;
        zzbg.zzak("Unexpected null container.");
          goto _L1
        container;
        throw container;
        zzaCt = container;
        zzwv();
          goto _L1
    }

    void zzdB(String s)
    {
        if(zzWX)
        {
            zzbg.zzak("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return;
        } else
        {
            zzaCv.zzdB(s);
            return;
        }
    }

    public void zzdz(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = zzWX;
        if(!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzaCs.zzdz(s);
        if(true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    String zzwu()
    {
        if(zzWX)
        {
            zzbg.zzak("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return "";
        } else
        {
            return zzaCv.zzwu();
        }
    }

    private Status zzKr;
    private final Looper zzPx;
    private boolean zzWX;
    private Container zzaCs;
    private Container zzaCt;
    private zzb zzaCu;
    private zza zzaCv;
    private TagManager zzaCw;
}
