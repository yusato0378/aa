// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.*;

public class zzaa
    implements DataItem
{

    public zzaa(DataItem dataitem)
    {
        mUri = dataitem.getUri();
        zzanX = dataitem.getData();
        HashMap hashmap = new HashMap();
        dataitem = dataitem.getAssets().entrySet().iterator();
        do
        {
            if(!dataitem.hasNext())
                break;
            java.util.Map.Entry entry = (java.util.Map.Entry)dataitem.next();
            if(entry.getKey() != null)
                hashmap.put(entry.getKey(), ((DataItemAsset)entry.getValue()).freeze());
        } while(true);
        zzaMb = Collections.unmodifiableMap(hashmap);
    }

    public Object freeze()
    {
        return zzzl();
    }

    public Map getAssets()
    {
        return zzaMb;
    }

    public byte[] getData()
    {
        return zzanX;
    }

    public Uri getUri()
    {
        return mUri;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public DataItem setData(byte abyte0[])
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        return toString(Log.isLoggable("DataItem", 3));
    }

    public String toString(boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder("DataItemEntity[");
        stringbuilder.append("@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        StringBuilder stringbuilder1 = (new StringBuilder()).append(",dataSz=");
        Object obj;
        if(zzanX == null)
            obj = "null";
        else
            obj = Integer.valueOf(zzanX.length);
        stringbuilder.append(stringbuilder1.append(obj).toString());
        stringbuilder.append((new StringBuilder()).append(", numAssets=").append(zzaMb.size()).toString());
        stringbuilder.append((new StringBuilder()).append(", uri=").append(mUri).toString());
        if(!flag)
        {
            stringbuilder.append("]");
            return stringbuilder.toString();
        }
        stringbuilder.append("]\n  assets: ");
        String s;
        for(Iterator iterator = zzaMb.keySet().iterator(); iterator.hasNext(); stringbuilder.append((new StringBuilder()).append("\n    ").append(s).append(": ").append(zzaMb.get(s)).toString()))
            s = (String)iterator.next();

        stringbuilder.append("\n  ]");
        return stringbuilder.toString();
    }

    public DataItem zzzl()
    {
        return this;
    }

    private Uri mUri;
    private Map zzaMb;
    private byte zzanX[];
}
