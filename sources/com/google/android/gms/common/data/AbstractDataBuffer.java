// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common.data;

import android.os.Bundle;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBuffer, DataHolder, zzb, zzg

public abstract class AbstractDataBuffer
    implements DataBuffer
{

    protected AbstractDataBuffer(DataHolder dataholder)
    {
        zzPy = dataholder;
        if(zzPy != null)
            zzPy.zzm(this);
    }

    public final void close()
    {
        release();
    }

    public abstract Object get(int i);

    public int getCount()
    {
        if(zzPy == null)
            return 0;
        else
            return zzPy.getCount();
    }

    public boolean isClosed()
    {
        return zzPy == null || zzPy.isClosed();
    }

    public Iterator iterator()
    {
        return new zzb(this);
    }

    public void release()
    {
        if(zzPy != null)
            zzPy.close();
    }

    public Iterator singleRefIterator()
    {
        return new zzg(this);
    }

    public Bundle zzlm()
    {
        return zzPy.zzlm();
    }

    protected final DataHolder zzPy;
}
