// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.wearable.DataItemAsset;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzx

public class zzz extends zzc
    implements DataItemAsset
{

    public zzz(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public Object freeze()
    {
        return zzzk();
    }

    public String getDataItemKey()
    {
        return getString("asset_key");
    }

    public String getId()
    {
        return getString("asset_id");
    }

    public DataItemAsset zzzk()
    {
        return new zzx(this);
    }
}
