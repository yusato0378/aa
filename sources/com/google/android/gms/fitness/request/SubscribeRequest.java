// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.internal.zzjm;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzac

public class SubscribeRequest
    implements SafeParcelable
{

    SubscribeRequest(int i, Subscription subscription, boolean flag, IBinder ibinder, String s)
    {
        zzzH = i;
        zzafF = subscription;
        zzafG = flag;
        if(ibinder == null)
            subscription = null;
        else
            subscription = com.google.android.gms.internal.zzjm.zza.zzaS(ibinder);
        zzaeH = subscription;
        zzJd = s;
    }

    public SubscribeRequest(Subscription subscription, boolean flag, zzjm zzjm1, String s)
    {
        zzzH = 2;
        zzafF = subscription;
        zzafG = flag;
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
        return zzu.zzq(this).zzg("subscription", zzafF).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzac.zza(this, parcel, i);
    }

    public Subscription zzpB()
    {
        return zzafF;
    }

    public boolean zzpC()
    {
        return zzafG;
    }

    public IBinder zzpf()
    {
        if(zzaeH == null)
            return null;
        else
            return zzaeH.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzac();
    private final String zzJd;
    private final zzjm zzaeH;
    private final Subscription zzafF;
    private final boolean zzafG;
    private final int zzzH;

}
