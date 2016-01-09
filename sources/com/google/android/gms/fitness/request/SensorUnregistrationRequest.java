// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.zzj;
import com.google.android.gms.internal.zzjm;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzt

public class SensorUnregistrationRequest
    implements SafeParcelable
{

    SensorUnregistrationRequest(int i, IBinder ibinder, PendingIntent pendingintent, IBinder ibinder1, String s)
    {
        zzzH = i;
        if(ibinder == null)
            ibinder = null;
        else
            ibinder = com.google.android.gms.fitness.data.zzj.zza.zzau(ibinder);
        zzafl = ibinder;
        mPendingIntent = pendingintent;
        zzaeH = com.google.android.gms.internal.zzjm.zza.zzaS(ibinder1);
        zzJd = s;
    }

    public SensorUnregistrationRequest(zzj zzj1, PendingIntent pendingintent, zzjm zzjm1, String s)
    {
        zzzH = 3;
        zzafl = zzj1;
        mPendingIntent = pendingintent;
        zzaeH = zzjm1;
        zzJd = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getPackageName()
    {
        return zzJd;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public String toString()
    {
        return String.format("SensorUnregistrationRequest{%s}", new Object[] {
            zzafl
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzt.zza(this, parcel, i);
    }

    public IBinder zzpf()
    {
        if(zzaeH == null)
            return null;
        else
            return zzaeH.asBinder();
    }

    public PendingIntent zzpr()
    {
        return mPendingIntent;
    }

    IBinder zzpw()
    {
        if(zzafl == null)
            return null;
        else
            return zzafl.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzt();
    private final PendingIntent mPendingIntent;
    private final String zzJd;
    private final zzjm zzaeH;
    private final zzj zzafl;
    private final int zzzH;

}
