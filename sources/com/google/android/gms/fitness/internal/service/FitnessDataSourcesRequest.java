// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.internal.service;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.internal.service:
//            zza

public class FitnessDataSourcesRequest
    implements SafeParcelable
{

    FitnessDataSourcesRequest(int i, List list)
    {
        zzzH = i;
        zzacO = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public List getDataTypes()
    {
        return Collections.unmodifiableList(zzacO);
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("dataTypes", zzacO).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    private final List zzacO;
    private final int zzzH;

}
