// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            zznr

final class zzoa
{

    zzoa(int i, byte abyte0[])
    {
        tag = i;
        zzaNU = abyte0;
    }

    public boolean equals(Object obj)
    {
        if(obj != this)
        {
            if(!(obj instanceof zzoa))
                return false;
            obj = (zzoa)obj;
            if(tag != ((zzoa) (obj)).tag || !Arrays.equals(zzaNU, ((zzoa) (obj)).zzaNU))
                return false;
        }
        return true;
    }

    public int hashCode()
    {
        return (tag + 527) * 31 + Arrays.hashCode(zzaNU);
    }

    void zza(zznr zznr1)
        throws IOException
    {
        zznr1.zzjy(tag);
        zznr1.zzz(zzaNU);
    }

    int zzc()
    {
        return 0 + zznr.zzjz(tag) + zzaNU.length;
    }

    final int tag;
    final byte zzaNU[];
}
