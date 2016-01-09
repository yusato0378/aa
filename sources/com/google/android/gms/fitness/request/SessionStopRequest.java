// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzjl;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzy

public class SessionStopRequest
    implements SafeParcelable
{

    SessionStopRequest(int i, String s, String s1, IBinder ibinder, String s2)
    {
        zzzH = i;
        mName = s;
        zzadG = s1;
        if(ibinder == null)
            s = null;
        else
            s = com.google.android.gms.internal.zzjl.zza.zzaR(ibinder);
        zzafC = s;
        zzJd = s2;
    }

    public SessionStopRequest(String s, String s1, zzjl zzjl1, String s2)
    {
        zzzH = 2;
        mName = s;
        zzadG = s1;
        zzafC = zzjl1;
        zzJd = s2;
    }

    private boolean zzb(SessionStopRequest sessionstoprequest)
    {
        return zzu.equal(mName, sessionstoprequest.mName) && zzu.equal(zzadG, sessionstoprequest.zzadG);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof SessionStopRequest) && zzb((SessionStopRequest)obj);
    }

    public String getIdentifier()
    {
        return zzadG;
    }

    public String getName()
    {
        return mName;
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
            mName, zzadG
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("name", mName).zzg("identifier", zzadG).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzy.zza(this, parcel, i);
    }

    public IBinder zzpf()
    {
        if(zzafC == null)
            return null;
        else
            return zzafC.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzy();
    private final String mName;
    private final String zzJd;
    private final String zzadG;
    private final zzjl zzafC;
    private final int zzzH;

}
