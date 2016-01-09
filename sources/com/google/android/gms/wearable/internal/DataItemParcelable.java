// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.*;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzab, DataItemAssetParcelable

public class DataItemParcelable
    implements SafeParcelable, DataItem
{

    DataItemParcelable(int i, Uri uri, Bundle bundle, byte abyte0[])
    {
        zzzH = i;
        mUri = uri;
        uri = new HashMap();
        bundle.setClassLoader(com/google/android/gms/wearable/internal/DataItemAssetParcelable.getClassLoader());
        String s;
        for(Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); uri.put(s, (DataItemAssetParcelable)bundle.getParcelable(s)))
            s = (String)iterator.next();

        zzaMb = uri;
        zzanX = abyte0;
    }

    public int describeContents()
    {
        return 0;
    }

    public Object freeze()
    {
        return zzzm();
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
        return zzr(abyte0);
    }

    public String toString()
    {
        return toString(Log.isLoggable("DataItem", 3));
    }

    public String toString(boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder("DataItemParcelable[");
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

    public void writeToParcel(Parcel parcel, int i)
    {
        zzab.zza(this, parcel, i);
    }

    public DataItemParcelable zzr(byte abyte0[])
    {
        zzanX = abyte0;
        return this;
    }

    public Bundle zzyX()
    {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(com/google/android/gms/wearable/internal/DataItemAssetParcelable.getClassLoader());
        java.util.Map.Entry entry;
        for(Iterator iterator = zzaMb.entrySet().iterator(); iterator.hasNext(); bundle.putParcelable((String)entry.getKey(), new DataItemAssetParcelable((DataItemAsset)entry.getValue())))
            entry = (java.util.Map.Entry)iterator.next();

        return bundle;
    }

    public DataItemParcelable zzzm()
    {
        return this;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzab();
    private final Uri mUri;
    private final Map zzaMb;
    private byte zzanX[];
    final int zzzH;

}
