// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzny, zznt, zzob, zznu, 
//            zznv, zznq, zzoa, zznw, 
//            zznr

public abstract class zzns extends zzny
{

    public zzns()
    {
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return zzzQ();
    }

    public final Object zza(zznt zznt1)
    {
        zznv zznv1;
        if(zzaNI != null)
            if((zznv1 = zzaNI.zzjC(zzob.zzjG(zznt1.tag))) != null)
                return zznv1.zzb(zznt1);
        return null;
    }

    public void zza(zznr zznr)
        throws IOException
    {
        if(zzaNI != null)
        {
            int i = 0;
            while(i < zzaNI.size()) 
            {
                zzaNI.zzjD(i).zza(zznr);
                i++;
            }
        }
    }

    protected final boolean zza(zznq zznq1, int i)
        throws IOException
    {
        int j = zznq1.getPosition();
        if(!zznq1.zzjl(i))
            return false;
        int k = zzob.zzjG(i);
        zzoa zzoa1 = new zzoa(i, zznq1.zzw(j, zznq1.getPosition() - j));
        zznq1 = null;
        Object obj;
        if(zzaNI == null)
            zzaNI = new zznu();
        else
            zznq1 = zzaNI.zzjC(k);
        obj = zznq1;
        if(zznq1 == null)
        {
            obj = new zznv();
            zzaNI.zza(k, ((zznv) (obj)));
        }
        ((zznv) (obj)).zza(zzoa1);
        return true;
    }

    protected final boolean zza(zzns zzns1)
    {
        if(zzaNI == null || zzaNI.isEmpty())
            return zzns1.zzaNI == null || zzns1.zzaNI.isEmpty();
        else
            return zzaNI.equals(zzns1.zzaNI);
    }

    protected int zzc()
    {
        int j = 0;
        int k;
        if(zzaNI != null)
        {
            int i = 0;
            do
            {
                k = i;
                if(j >= zzaNI.size())
                    break;
                i += zzaNI.zzjD(j).zzc();
                j++;
            } while(true);
        } else
        {
            k = 0;
        }
        return k;
    }

    protected final int zzzP()
    {
        if(zzaNI == null || zzaNI.isEmpty())
            return 0;
        else
            return zzaNI.hashCode();
    }

    public zzns zzzQ()
        throws CloneNotSupportedException
    {
        zzns zzns1 = (zzns)super.zzzR();
        zznw.zza(this, zzns1);
        return zzns1;
    }

    public zzny zzzR()
        throws CloneNotSupportedException
    {
        return zzzQ();
    }

    protected zznu zzaNI;
}
