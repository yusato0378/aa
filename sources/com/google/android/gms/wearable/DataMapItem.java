// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable;

import android.net.Uri;
import com.google.android.gms.internal.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.wearable:
//            DataItem, DataMap, DataItemAsset, Asset

public class DataMapItem
{

    private DataMapItem(DataItem dataitem)
    {
        mUri = dataitem.getUri();
        zzaKG = zza((DataItem)dataitem.freeze());
    }

    public static DataMapItem fromDataItem(DataItem dataitem)
    {
        if(dataitem == null)
            throw new IllegalStateException("provided dataItem is null");
        else
            return new DataMapItem(dataitem);
    }

    private DataMap zza(DataItem dataitem)
    {
        Object obj;
        DataItemAsset dataitemasset;
        int i;
        if(dataitem.getData() == null && dataitem.getAssets().size() > 0)
            throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        if(dataitem.getData() == null)
            return new DataMap();
        int j;
        try
        {
            obj = new ArrayList();
            j = dataitem.getAssets().size();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unable to parse. Not a DataItem. Its uri: ").append(dataitem.getUri()).toString());
        }
        i = 0;
_L2:
        if(i >= j)
            break; /* Loop/switch isn't completed */
        dataitemasset = (DataItemAsset)dataitem.getAssets().get(Integer.toString(i));
        if(dataitemasset != null)
            break MISSING_BLOCK_LABEL_175;
        throw new IllegalStateException((new StringBuilder()).append("Cannot find DataItemAsset referenced in data at ").append(i).append(" for ").append(dataitem).toString());
        ((List) (obj)).add(Asset.createFromRef(dataitemasset.getId()));
        i++;
        if(true) goto _L2; else goto _L1
_L1:
        obj = zznm.zza(new com.google.android.gms.internal.zznm.zza(zznn.zzs(dataitem.getData()), ((List) (obj))));
        return ((DataMap) (obj));
    }

    public DataMap getDataMap()
    {
        return zzaKG;
    }

    public Uri getUri()
    {
        return mUri;
    }

    private final Uri mUri;
    private final DataMap zzaKG;
}
