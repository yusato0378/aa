// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.security.SecureRandom;
import java.util.*;

// Referenced classes of package com.google.android.gms.wearable:
//            zzf, DataItem, DataItemAsset, Asset

public class PutDataRequest
    implements SafeParcelable
{

    private PutDataRequest(int i, Uri uri)
    {
        this(i, uri, new Bundle(), null);
    }

    PutDataRequest(int i, Uri uri, Bundle bundle, byte abyte0[])
    {
        zzzH = i;
        mUri = uri;
        zzaKJ = bundle;
        zzaKJ.setClassLoader(com/google/android/gms/wearable/internal/DataItemAssetParcelable.getClassLoader());
        zzanX = abyte0;
    }

    public static PutDataRequest create(String s)
    {
        return zzn(zzey(s));
    }

    public static PutDataRequest createFromDataItem(DataItem dataitem)
    {
        PutDataRequest putdatarequest = zzn(dataitem.getUri());
        java.util.Map.Entry entry;
        for(Iterator iterator = dataitem.getAssets().entrySet().iterator(); iterator.hasNext(); putdatarequest.putAsset((String)entry.getKey(), Asset.createFromRef(((DataItemAsset)entry.getValue()).getId())))
        {
            entry = (java.util.Map.Entry)iterator.next();
            if(((DataItemAsset)entry.getValue()).getId() == null)
                throw new IllegalStateException((new StringBuilder()).append("Cannot create an asset for a put request without a digest: ").append((String)entry.getKey()).toString());
        }

        putdatarequest.setData(dataitem.getData());
        return putdatarequest;
    }

    public static PutDataRequest createWithAutoAppendedId(String s)
    {
        StringBuilder stringbuilder = new StringBuilder(s);
        if(!s.endsWith("/"))
            stringbuilder.append("/");
        stringbuilder.append("PN").append(zzaKI.nextLong());
        return new PutDataRequest(1, zzey(stringbuilder.toString()));
    }

    private static Uri zzey(String s)
    {
        if(TextUtils.isEmpty(s))
            throw new IllegalArgumentException("An empty path was supplied.");
        if(!s.startsWith("/"))
            throw new IllegalArgumentException("A path must start with a single / .");
        if(s.startsWith("//"))
            throw new IllegalArgumentException("A path must start with a single / .");
        else
            return (new android.net.Uri.Builder()).scheme("wear").path(s).build();
    }

    public static PutDataRequest zzn(Uri uri)
    {
        return new PutDataRequest(1, uri);
    }

    public int describeContents()
    {
        return 0;
    }

    public Asset getAsset(String s)
    {
        return (Asset)zzaKJ.getParcelable(s);
    }

    public Map getAssets()
    {
        HashMap hashmap = new HashMap();
        String s;
        for(Iterator iterator = zzaKJ.keySet().iterator(); iterator.hasNext(); hashmap.put(s, (Asset)zzaKJ.getParcelable(s)))
            s = (String)iterator.next();

        return Collections.unmodifiableMap(hashmap);
    }

    public byte[] getData()
    {
        return zzanX;
    }

    public Uri getUri()
    {
        return mUri;
    }

    public boolean hasAsset(String s)
    {
        return zzaKJ.containsKey(s);
    }

    public PutDataRequest putAsset(String s, Asset asset)
    {
        zzv.zzr(s);
        zzv.zzr(asset);
        zzaKJ.putParcelable(s, asset);
        return this;
    }

    public PutDataRequest removeAsset(String s)
    {
        zzaKJ.remove(s);
        return this;
    }

    public PutDataRequest setData(byte abyte0[])
    {
        zzanX = abyte0;
        return this;
    }

    public String toString()
    {
        return toString(Log.isLoggable("DataMap", 3));
    }

    public String toString(boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder("PutDataRequest[");
        StringBuilder stringbuilder1 = (new StringBuilder()).append("dataSz=");
        Object obj;
        if(zzanX == null)
            obj = "null";
        else
            obj = Integer.valueOf(zzanX.length);
        stringbuilder.append(stringbuilder1.append(obj).toString());
        stringbuilder.append((new StringBuilder()).append(", numAssets=").append(zzaKJ.size()).toString());
        stringbuilder.append((new StringBuilder()).append(", uri=").append(mUri).toString());
        if(!flag)
        {
            stringbuilder.append("]");
            return stringbuilder.toString();
        }
        stringbuilder.append("]\n  assets: ");
        String s;
        for(Iterator iterator = zzaKJ.keySet().iterator(); iterator.hasNext(); stringbuilder.append((new StringBuilder()).append("\n    ").append(s).append(": ").append(zzaKJ.getParcelable(s)).toString()))
            s = (String)iterator.next();

        stringbuilder.append("\n  ]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf.zza(this, parcel, i);
    }

    public Bundle zzyX()
    {
        return zzaKJ;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzf();
    public static final String WEAR_URI_SCHEME = "wear";
    private static final Random zzaKI = new SecureRandom();
    private final Uri mUri;
    private final Bundle zzaKJ;
    private byte zzanX[];
    final int zzzH;

}
