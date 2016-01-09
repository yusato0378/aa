// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.tagmanager.zzbg;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//            zzms, zzhv, zzmo, zzmj, 
//            zzmn, zzht, zzna, zzmy, 
//            zzmp, zzmm, zzmr

public class zzml
{
    public static interface zza
    {

        public abstract void zza(zzmp zzmp);
    }

    class zzb extends zzmy
    {

        protected zzmy.zzb zza(zzmj zzmj1)
        {
            return null;
        }

        protected void zza(zzmp zzmp1)
        {
            zzmp.zza zza1 = zzmp1.zzym();
            zzaGV.zza(zza1);
            if(zza1.getStatus() == Status.zzQU && zza1.zzyn() == zzmp.zza.zza.zzaHg && zza1.zzyo() != null && zza1.zzyo().length > 0)
            {
                zzml.zza(zzaGV).zze(zza1.zzyp().zzyh(), zza1.zzyo());
                zzbg.zzam("Resource successfully load from Network.");
                zzaGW.zza(zzmp1);
                return;
            }
            StringBuilder stringbuilder = (new StringBuilder()).append("Response status: ");
            if(zza1.getStatus().isSuccess())
                zzmp1 = "SUCCESS";
            else
                zzmp1 = "FAILURE";
            zzbg.zzam(stringbuilder.append(zzmp1).toString());
            if(zza1.getStatus().isSuccess())
            {
                zzbg.zzam((new StringBuilder()).append("Response source: ").append(zza1.zzyn().toString()).toString());
                zzbg.zzam((new StringBuilder()).append("Response size: ").append(zza1.zzyo().length).toString());
            }
            zzaGV.zza(zza1.zzyp(), zzaGW);
        }

        final zzml zzaGV;
        private final zza zzaGW;

        zzb(zzmo zzmo1, zzmm zzmm, zza zza1)
        {
            zzaGV = zzml.this;
            super(zzmo1, zzmm);
            zzaGW = zza1;
        }
    }

    static class zzc
    {

        public void zzK(Object obj)
        {
            mData = obj;
        }

        public void zzT(long l)
        {
            zzaGX = l;
        }

        public void zzaP(Status status)
        {
            zzKr = status;
        }

        public long zzyk()
        {
            return zzaGX;
        }

        private Object mData;
        private Status zzKr;
        private long zzaGX;

        public zzc(Status status, Object obj, long l)
        {
            zzKr = status;
            mData = obj;
            zzaGX = l;
        }
    }


    public zzml(Context context)
    {
        this(context, ((Map) (new HashMap())), new zzms(context), zzhv.zznd());
    }

    zzml(Context context, Map map, zzms zzms1, zzht zzht1)
    {
        zzaCO = null;
        zzaGR = new HashMap();
        mContext = context;
        zznR = zzht1;
        zzaGQ = zzms1;
        zzaGS = map;
    }

    static zzms zza(zzml zzml1)
    {
        return zzml1.zzaGQ;
    }

    private void zza(zzmo zzmo1, zza zza1)
    {
        boolean flag = true;
        zzmo1 = zzmo1.zzyl();
        if(zzmo1.size() != 1)
            flag = false;
        zzv.zzQ(flag);
        zza((zzmj)zzmo1.get(0), zza1);
    }

    void zza(zzmj zzmj1, zza zza1)
    {
        zzaGQ.zza(zzmj1.zzyh(), zzmj1.zzyf(), zzmn.zzaGY, new zzmr(zzmj1, zza1) {

            public void zza(Status status, Object obj, Integer integer, long l)
            {
                if(status.isSuccess())
                {
                    if(integer == zzms.zzaHy)
                        status = zzmp.zza.zza.zzaHi;
                    else
                        status = zzmp.zza.zza.zzaHh;
                    status = new zzmp.zza(Status.zzQU, zzaGT, null, (zzmq.zzc)obj, status, l);
                } else
                {
                    status = new zzmp.zza(new Status(16, (new StringBuilder()).append("There is no valid resource for the container: ").append(zzaGT.getContainerId()).toString()), null, zzmp.zza.zza.zzaHh);
                }
                zzaGU.zza(new zzmp(status));
            }

            final zzmj zzaGT;
            final zza zzaGU;
            final zzml zzaGV;

            
            {
                zzaGV = zzml.this;
                zzaGT = zzmj1;
                zzaGU = zza1;
                super();
            }
        }
);
    }

    void zza(zzmo zzmo1, zza zza1, zzmy zzmy)
    {
        Iterator iterator = zzmo1.zzyl().iterator();
        boolean flag = false;
        do
        {
            if(!iterator.hasNext())
                break;
            zzmj zzmj1 = (zzmj)iterator.next();
            zzc zzc1 = (zzc)zzaGR.get(zzmj1.getContainerId());
            long l;
            if(zzc1 != null)
                l = zzc1.zzyk();
            else
                l = zzaGQ.zzes(zzmj1.getContainerId());
            if(l + 0xdbba0L < zznR.currentTimeMillis())
                flag = true;
        } while(true);
        if(flag)
        {
            zza1 = (zzna)zzaGS.get(zzmo1.getId());
            if(zza1 == null)
            {
                if(zzaCO == null)
                    zza1 = new zzna();
                else
                    zza1 = new zzna(zzaCO);
                zzaGS.put(zzmo1.getId(), zza1);
            }
            zza1.zza(mContext, zzmo1, 0L, zzmy);
            return;
        } else
        {
            zza(zzmo1, zza1);
            return;
        }
    }

    void zza(zzmp.zza zza1)
    {
        Object obj = zza1.zzyp().getContainerId();
        Status status = zza1.getStatus();
        zza1 = zza1.zzyq();
        if(zzaGR.containsKey(obj))
        {
            obj = (zzc)zzaGR.get(obj);
            ((zzc) (obj)).zzT(zznR.currentTimeMillis());
            if(status == Status.zzQU)
            {
                ((zzc) (obj)).zzaP(status);
                ((zzc) (obj)).zzK(zza1);
            }
            return;
        } else
        {
            zzaGR.put(obj, new zzc(status, zza1, zznR.currentTimeMillis()));
            return;
        }
    }

    public void zza(String s, Integer integer, String s1, zza zza1)
    {
        s = (new zzmo()).zzb(new zzmj(s, integer, s1, false));
        zza(((zzmo) (s)), zza1, ((zzmy) (new zzb(s, zzmn.zzaGY, zza1))));
    }

    public void zzem(String s)
    {
        zzaCO = s;
    }

    private final Context mContext;
    private String zzaCO;
    private final zzms zzaGQ;
    Map zzaGR;
    private final Map zzaGS;
    private final zzht zznR;
}
