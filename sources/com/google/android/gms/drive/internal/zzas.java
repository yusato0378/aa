// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.*;
import java.io.IOException;

public final class zzas extends zzns
{

    public zzas()
    {
        zznV();
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if(obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if(obj instanceof zzas)
            {
                obj = (zzas)obj;
                flag = flag1;
                if(zzYU == ((zzas) (obj)).zzYU)
                {
                    flag = flag1;
                    if(zzYR == ((zzas) (obj)).zzYR)
                        return zza(((zzns) (obj)));
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (((int)(zzYU ^ zzYU >>> 32) + 527) * 31 + (int)(zzYR ^ zzYR >>> 32)) * 31 + zzzP();
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        zznr1.zzc(1, zzYU);
        zznr1.zzc(2, zzYR);
        super.zza(zznr1);
    }

    public zzny zzb(zznq zznq1)
        throws IOException
    {
        return zzo(zznq1);
    }

    protected int zzc()
    {
        return super.zzc() + zznr.zze(1, zzYU) + zznr.zze(2, zzYR);
    }

    public zzas zznV()
    {
        zzYU = -1L;
        zzYR = -1L;
        zzaNI = null;
        zzaNT = -1;
        return this;
    }

    public zzas zzo(zznq zznq1)
        throws IOException
    {
        do
        {
            int i = zznq1.zzzy();
            switch(i)
            {
            default:
                if(zza(zznq1, i))
                    continue;
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                zzYU = zznq1.zzzE();
                break;

            case 16: // '\020'
                zzYR = zznq1.zzzE();
                break;
            }
        } while(true);
    }

    public long zzYR;
    public long zzYU;
}
