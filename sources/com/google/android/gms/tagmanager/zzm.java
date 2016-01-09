// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcw, zzba, zzl

class zzm
{
    public static interface zza
    {

        public abstract int sizeOf(Object obj, Object obj1);
    }


    public zzm()
    {
    }

    public zzl zza(int i, zza zza1)
    {
        if(i <= 0)
            throw new IllegalArgumentException("maxSize <= 0");
        if(zzwp() < 12)
            return new zzcw(i, zza1);
        else
            return new zzba(i, zza1);
    }

    int zzwp()
    {
        return android.os.Build.VERSION.SDK_INT;
    }

    final zza zzaCi = new zza() {

        public int sizeOf(Object obj, Object obj1)
        {
            return 1;
        }

        final zzm zzaCj;

            
            {
                zzaCj = zzm.this;
                super();
            }
    }
;
}
