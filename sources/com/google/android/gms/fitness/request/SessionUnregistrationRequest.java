// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzjm;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzz

public class SessionUnregistrationRequest
    implements SafeParcelable
{

    SessionUnregistrationRequest(int i, PendingIntent pendingintent, IBinder ibinder, String s)
    {
        zzzH = i;
        mPendingIntent = pendingintent;
        if(ibinder == null)
            pendingintent = null;
        else
            pendingintent = com.google.android.gms.internal.zzjm.zza.zzaS(ibinder);
        zzaeH = pendingintent;
        zzJd = s;
    }

    public SessionUnregistrationRequest(PendingIntent pendingintent, zzjm zzjm1, String s)
    {
        zzzH = 4;
        mPendingIntent = pendingintent;
        zzaeH = zzjm1;
        zzJd = s;
    }

    private boolean zzb(SessionUnregistrationRequest sessionunregistrationrequest)
    {
        return zzu.equal(mPendingIntent, sessionunregistrationrequest.mPendingIntent);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof SessionUnregistrationRequest) && zzb((SessionUnregistrationRequest)obj);
    }

    public String getPackageName()
    {
        return zzJd;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            mPendingIntent
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("pendingIntent", mPendingIntent).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzz.zza(this, parcel, i);
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

    public static final android.os.Parcelable.Creator CREATOR = new zzz();
    private final PendingIntent mPendingIntent;
    private final String zzJd;
    private final zzjm zzaeH;
    private final int zzzH;

}
