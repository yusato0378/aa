// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.zzv;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBuffer

public class zzb
    implements Iterator
{

    public zzb(DataBuffer databuffer)
    {
        zzRt = (DataBuffer)zzv.zzr(databuffer);
        zzRu = -1;
    }

    public boolean hasNext()
    {
        return zzRu < zzRt.getCount() - 1;
    }

    public Object next()
    {
        if(!hasNext())
        {
            throw new NoSuchElementException((new StringBuilder()).append("Cannot advance the iterator beyond ").append(zzRu).toString());
        } else
        {
            DataBuffer databuffer = zzRt;
            int i = zzRu + 1;
            zzRu = i;
            return databuffer.get(i);
        }
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }

    protected final DataBuffer zzRt;
    protected int zzRu;
}
