// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.zznm;
import com.google.android.gms.internal.zzny;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable:
//            DataMap, PutDataRequest, DataMapItem, Asset

public class PutDataMapRequest
{

    private PutDataMapRequest(PutDataRequest putdatarequest, DataMap datamap)
    {
        zzaKH = putdatarequest;
        if(datamap != null)
            zzaKG.putAll(datamap);
    }

    public static PutDataMapRequest create(String s)
    {
        return new PutDataMapRequest(PutDataRequest.create(s), null);
    }

    public static PutDataMapRequest createFromDataMapItem(DataMapItem datamapitem)
    {
        return new PutDataMapRequest(PutDataRequest.zzn(datamapitem.getUri()), datamapitem.getDataMap());
    }

    public static PutDataMapRequest createWithAutoAppendedId(String s)
    {
        return new PutDataMapRequest(PutDataRequest.createWithAutoAppendedId(s), null);
    }

    public PutDataRequest asPutDataRequest()
    {
        com.google.android.gms.internal.zznm.zza zza = zznm.zza(zzaKG);
        zzaKH.setData(zzny.zzf(zza.zzaMX));
        int j = zza.zzaMY.size();
        for(int i = 0; i < j; i++)
        {
            String s = Integer.toString(i);
            Asset asset = (Asset)zza.zzaMY.get(i);
            if(s == null)
                throw new IllegalStateException((new StringBuilder()).append("asset key cannot be null: ").append(asset).toString());
            if(asset == null)
                throw new IllegalStateException((new StringBuilder()).append("asset cannot be null: key=").append(s).toString());
            if(Log.isLoggable("DataMap", 3))
                Log.d("DataMap", (new StringBuilder()).append("asPutDataRequest: adding asset: ").append(s).append(" ").append(asset).toString());
            zzaKH.putAsset(s, asset);
        }

        return zzaKH;
    }

    public DataMap getDataMap()
    {
        return zzaKG;
    }

    public Uri getUri()
    {
        return zzaKH.getUri();
    }

    private final DataMap zzaKG = new DataMap();
    private final PutDataRequest zzaKH;
}
