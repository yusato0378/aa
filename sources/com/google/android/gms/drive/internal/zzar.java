// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.*;
import java.io.IOException;

public final class zzar extends zzns
{

    public zzar()
    {
        zznU();
    }

    public static zzar zzj(byte abyte0[])
        throws zznx
    {
        return (zzar)zzny.zza(new zzar(), abyte0);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if(obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(!(obj instanceof zzar))
            continue; /* Loop/switch isn't completed */
        obj = (zzar)obj;
        flag = flag1;
        if(versionCode != ((zzar) (obj)).versionCode)
            continue; /* Loop/switch isn't completed */
        if(zzYT != null)
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(((zzar) (obj)).zzYT != null)
            continue; /* Loop/switch isn't completed */
_L5:
        flag = flag1;
        if(zzYU == ((zzar) (obj)).zzYU)
        {
            flag = flag1;
            if(zzYR == ((zzar) (obj)).zzYR)
            {
                flag = flag1;
                if(zzYV == ((zzar) (obj)).zzYV)
                    return zza(((zzns) (obj)));
            }
        }
        if(true) goto _L4; else goto _L3
_L3:
        if(!zzYT.equals(((zzar) (obj)).zzYT))
            return false;
          goto _L5
        if(true) goto _L4; else goto _L6
_L6:
    }

    public int hashCode()
    {
        int j = versionCode;
        int i;
        if(zzYT == null)
            i = 0;
        else
            i = zzYT.hashCode();
        return ((((i + (j + 527) * 31) * 31 + (int)(zzYU ^ zzYU >>> 32)) * 31 + (int)(zzYR ^ zzYR >>> 32)) * 31 + zzYV) * 31 + zzzP();
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        zznr1.zzx(1, versionCode);
        zznr1.zzb(2, zzYT);
        zznr1.zzc(3, zzYU);
        zznr1.zzc(4, zzYR);
        if(zzYV != -1)
            zznr1.zzx(5, zzYV);
        super.zza(zznr1);
    }

    public zzny zzb(zznq zznq1)
        throws IOException
    {
        return zzn(zznq1);
    }

    protected int zzc()
    {
        int j = super.zzc() + zznr.zzz(1, versionCode) + zznr.zzj(2, zzYT) + zznr.zze(3, zzYU) + zznr.zze(4, zzYR);
        int i = j;
        if(zzYV != -1)
            i = j + zznr.zzz(5, zzYV);
        return i;
    }

    public zzar zzn(zznq zznq1)
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

            case 18: // '\022'
                zzYT = zznq1.readString();
                break;

            case 24: // '\030'
                zzYU = zznq1.zzzE();
                break;

            case 32: // ' '
                zzYR = zznq1.zzzE();
                break;

            case 40: // '('
                zzYV = zznq1.zzzB();
                break;
            }
        } while(true);
    }

    public zzar zznU()
    {
        versionCode = 1;
        zzYT = "";
        zzYU = -1L;
        zzYR = -1L;
        zzYV = -1;
        zzaNI = null;
        zzaNT = -1;
        return this;
    }

    public int versionCode;
    public long zzYR;
    public String zzYT;
    public long zzYU;
    public int zzYV;
}
