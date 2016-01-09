// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.Binder;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//            zzap, zzhc, zzam

public class zzaq
{

    public zzaq()
    {
    }

    public void zza(zzam zzam)
    {
        zzrc.add(zzam);
    }

    public void zza(zzap zzap1)
    {
        zzrd.add(zzap1);
    }

    public List zzcf()
    {
        Object obj;
        long l;
        obj = new ArrayList();
        l = Binder.clearCallingIdentity();
        Iterator iterator = zzre.iterator();
_L2:
        String s;
        do
        {
            if(!iterator.hasNext())
                break MISSING_BLOCK_LABEL_74;
            s = (String)((zzap)iterator.next()).zzce().get();
        } while(s == null);
        ((List) (obj)).add(s);
        if(true) goto _L2; else goto _L1
_L1:
        obj;
        Binder.restoreCallingIdentity(l);
        throw obj;
        Binder.restoreCallingIdentity(l);
        return ((List) (obj));
    }

    public List zzcg()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = zzrd.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            String s = (String)((zzap)iterator.next()).get();
            if(s != null)
                arraylist.add(s);
        } while(true);
        return arraylist;
    }

    private final Collection zzrc = new ArrayList();
    private final Collection zzrd = new ArrayList();
    private final Collection zzre = new ArrayList();
}
