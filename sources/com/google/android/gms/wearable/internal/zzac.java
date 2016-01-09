// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.wearable.DataItem;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzz, zzaa

public final class zzac extends zzc
    implements DataItem
{

    public zzac(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        zzahA = j;
    }

    public Object freeze()
    {
        return zzzl();
    }

    public Map getAssets()
    {
        HashMap hashmap = new HashMap(zzahA);
        int i = 0;
        while(i < zzahA) 
        {
            zzz zzz1 = new zzz(zzPy, zzRw + i);
            if(zzz1.getDataItemKey() != null)
                hashmap.put(zzz1.getDataItemKey(), zzz1);
            i++;
        }
        return hashmap;
    }

    public byte[] getData()
    {
        return getByteArray("data");
    }

    public Uri getUri()
    {
        return Uri.parse(getString("path"));
    }

    public DataItem setData(byte abyte0[])
    {
        throw new UnsupportedOperationException();
    }

    public DataItem zzzl()
    {
        return new zzaa(this);
    }

    private final int zzahA;
}
