// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataItemAsset;

public class zzx
    implements DataItemAsset
{

    public zzx(DataItemAsset dataitemasset)
    {
        zzGM = dataitemasset.getId();
        zzra = dataitemasset.getDataItemKey();
    }

    public Object freeze()
    {
        return zzzk();
    }

    public String getDataItemKey()
    {
        return zzra;
    }

    public String getId()
    {
        return zzGM;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DataItemAssetEntity[");
        stringbuilder.append("@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        if(zzGM == null)
        {
            stringbuilder.append(",noid");
        } else
        {
            stringbuilder.append(",");
            stringbuilder.append(zzGM);
        }
        stringbuilder.append(", key=");
        stringbuilder.append(zzra);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public DataItemAsset zzzk()
    {
        return this;
    }

    private final String zzGM;
    private final String zzra;
}
