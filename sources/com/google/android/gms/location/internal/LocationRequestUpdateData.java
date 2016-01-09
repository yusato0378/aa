// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzc;
import com.google.android.gms.location.zzd;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzl, LocationRequestInternal

public class LocationRequestUpdateData
    implements SafeParcelable
{

    LocationRequestUpdateData(int i, int j, LocationRequestInternal locationrequestinternal, IBinder ibinder, PendingIntent pendingintent, IBinder ibinder1)
    {
        Object obj = null;
        super();
        zzzH = i;
        zzaro = j;
        zzarp = locationrequestinternal;
        if(ibinder == null)
            locationrequestinternal = null;
        else
            locationrequestinternal = com.google.android.gms.location.zzd.zza.zzbe(ibinder);
        zzarq = locationrequestinternal;
        mPendingIntent = pendingintent;
        if(ibinder1 == null)
            locationrequestinternal = obj;
        else
            locationrequestinternal = com.google.android.gms.location.zzc.zza.zzbd(ibinder1);
        zzarr = locationrequestinternal;
    }

    public static LocationRequestUpdateData zza(LocationRequestInternal locationrequestinternal, zzc zzc1)
    {
        return new LocationRequestUpdateData(1, 1, locationrequestinternal, null, null, zzc1.asBinder());
    }

    public static LocationRequestUpdateData zza(zzc zzc1)
    {
        return new LocationRequestUpdateData(1, 2, null, null, null, zzc1.asBinder());
    }

    public static LocationRequestUpdateData zzb(LocationRequestInternal locationrequestinternal, PendingIntent pendingintent)
    {
        return new LocationRequestUpdateData(1, 1, locationrequestinternal, null, pendingintent, null);
    }

    public static LocationRequestUpdateData zzb(LocationRequestInternal locationrequestinternal, zzd zzd1)
    {
        return new LocationRequestUpdateData(1, 1, locationrequestinternal, zzd1.asBinder(), null, null);
    }

    public static LocationRequestUpdateData zzb(zzd zzd1)
    {
        return new LocationRequestUpdateData(1, 2, null, zzd1.asBinder(), null, null);
    }

    public static LocationRequestUpdateData zze(PendingIntent pendingintent)
    {
        return new LocationRequestUpdateData(1, 2, null, null, pendingintent, null);
    }

    public int describeContents()
    {
        return 0;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzl.zza(this, parcel, i);
    }

    IBinder zzsK()
    {
        if(zzarq == null)
            return null;
        else
            return zzarq.asBinder();
    }

    IBinder zzsL()
    {
        if(zzarr == null)
            return null;
        else
            return zzarr.asBinder();
    }

    public static final zzl CREATOR = new zzl();
    PendingIntent mPendingIntent;
    int zzaro;
    LocationRequestInternal zzarp;
    zzd zzarq;
    zzc zzarr;
    private final int zzzH;

}
