// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.wearable.DataItemAsset;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzy

public class DataItemAssetParcelable
    implements SafeParcelable, DataItemAsset
{

    DataItemAssetParcelable(int i, String s, String s1)
    {
        zzzH = i;
        zzGM = s;
        zzra = s1;
    }

    public DataItemAssetParcelable(DataItemAsset dataitemasset)
    {
        zzzH = 1;
        zzGM = (String)zzv.zzr(dataitemasset.getId());
        zzra = (String)zzv.zzr(dataitemasset.getDataItemKey());
    }

    public int describeContents()
    {
        return 0;
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
        stringbuilder.append("DataItemAssetParcelable[");
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

    public void writeToParcel(Parcel parcel, int i)
    {
        zzy.zza(this, parcel, i);
    }

    public DataItemAsset zzzk()
    {
        return this;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzy();
    private final String zzGM;
    private final String zzra;
    final int zzzH;

}
