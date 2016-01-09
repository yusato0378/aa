// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            zze

public class Feature
    implements SafeParcelable
{

    Feature(int i, int j, Bundle bundle)
    {
        zzzH = i;
        id = j;
        zzJm = bundle;
    }

    public int describeContents()
    {
        zze zze1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze zze1 = CREATOR;
        zze.zza(this, parcel, i);
    }

    public static final zze CREATOR = new zze();
    public final int id;
    final Bundle zzJm;
    final int zzzH;

}
