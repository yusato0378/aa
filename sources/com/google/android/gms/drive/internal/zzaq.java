// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.*;
import java.io.IOException;

public final class zzaq extends zzns
{

    public zzaq()
    {
        zznT();
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
            if(obj instanceof zzaq)
            {
                obj = (zzaq)obj;
                flag = flag1;
                if(versionCode == ((zzaq) (obj)).versionCode)
                {
                    flag = flag1;
                    if(zzYQ == ((zzaq) (obj)).zzYQ)
                    {
                        flag = flag1;
                        if(zzYR == ((zzaq) (obj)).zzYR)
                        {
                            flag = flag1;
                            if(zzYS == ((zzaq) (obj)).zzYS)
                                return zza(((zzns) (obj)));
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return ((((versionCode + 527) * 31 + (int)(zzYQ ^ zzYQ >>> 32)) * 31 + (int)(zzYR ^ zzYR >>> 32)) * 31 + (int)(zzYS ^ zzYS >>> 32)) * 31 + zzzP();
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        zznr1.zzx(1, versionCode);
        zznr1.zzc(2, zzYQ);
        zznr1.zzc(3, zzYR);
        zznr1.zzc(4, zzYS);
        super.zza(zznr1);
    }

    public zzny zzb(zznq zznq1)
        throws IOException
    {
        return zzm(zznq1);
    }

    protected int zzc()
    {
        return super.zzc() + zznr.zzz(1, versionCode) + zznr.zze(2, zzYQ) + zznr.zze(3, zzYR) + zznr.zze(4, zzYS);
    }

    public zzaq zzm(zznq zznq1)
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
                versionCode = zznq1.zzzB();
                break;

            case 16: // '\020'
                zzYQ = zznq1.zzzE();
                break;

            case 24: // '\030'
                zzYR = zznq1.zzzE();
                break;

            case 32: // ' '
                zzYS = zznq1.zzzE();
                break;
            }
        } while(true);
    }

    public zzaq zznT()
    {
        versionCode = 1;
        zzYQ = -1L;
        zzYR = -1L;
        zzYS = -1L;
        zzaNI = null;
        zzaNT = -1;
        return this;
    }

    public int versionCode;
    public long zzYQ;
    public long zzYR;
    public long zzYS;
}
