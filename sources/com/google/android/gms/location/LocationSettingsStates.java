// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.location:
//            zzg

public final class LocationSettingsStates
    implements SafeParcelable
{

    LocationSettingsStates(int i, boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4, boolean flag5, 
            boolean flag6)
    {
        zzzH = i;
        zzaqq = flag;
        zzaqr = flag1;
        zzaqs = flag2;
        zzaqt = flag3;
        zzaqu = flag4;
        zzaqv = flag5;
        zzaqw = flag6;
    }

    public static LocationSettingsStates fromIntent(Intent intent)
    {
        return (LocationSettingsStates)zzc.zza(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public boolean isBlePresent()
    {
        return zzaqv;
    }

    public boolean isBleUsable()
    {
        return zzaqs;
    }

    public boolean isGpsPresent()
    {
        return zzaqt;
    }

    public boolean isGpsUsable()
    {
        return zzaqq;
    }

    public boolean isLocationPresent()
    {
        return zzaqt || zzaqu;
    }

    public boolean isLocationUsable()
    {
        return zzaqq || zzaqr;
    }

    public boolean isNetworkLocationPresent()
    {
        return zzaqu;
    }

    public boolean isNetworkLocationUsable()
    {
        return zzaqr;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzg.zza(this, parcel, i);
    }

    public boolean zzsE()
    {
        return zzaqw;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzg();
    private final boolean zzaqq;
    private final boolean zzaqr;
    private final boolean zzaqs;
    private final boolean zzaqt;
    private final boolean zzaqu;
    private final boolean zzaqv;
    private final boolean zzaqw;
    private final int zzzH;

}
