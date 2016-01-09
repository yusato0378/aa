// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import android.util.LruCache;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzl

class zzba
    implements zzl
{

    zzba(int i, zzm.zza zza)
    {
        zzaDQ = new LruCache(i, zza) {

            protected int sizeOf(Object obj, Object obj1)
            {
                return zzaDR.sizeOf(obj, obj1);
            }

            final zzm.zza zzaDR;
            final zzba zzaDS;

            
            {
                zzaDS = zzba.this;
                zzaDR = zza;
                super(i);
            }
        }
;
    }

    public Object get(Object obj)
    {
        return zzaDQ.get(obj);
    }

    public void zze(Object obj, Object obj1)
    {
        zzaDQ.put(obj, obj1);
    }

    private LruCache zzaDQ;
}
