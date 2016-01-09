// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.zzjm;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzx

public class SessionStartRequest
    implements SafeParcelable
{

    SessionStartRequest(int i, Session session, IBinder ibinder, String s)
    {
        zzzH = i;
        zzacG = session;
        if(ibinder == null)
            session = null;
        else
            session = com.google.android.gms.internal.zzjm.zza.zzaS(ibinder);
        zzaeH = session;
        zzJd = s;
    }

    public SessionStartRequest(Session session, zzjm zzjm1, String s)
    {
        zzv.zzb(session.isOngoing(), "Cannot start a session which has already ended");
        zzzH = 2;
        zzacG = session;
        zzaeH = zzjm1;
        zzJd = s;
    }

    private boolean zzb(SessionStartRequest sessionstartrequest)
    {
        return zzu.equal(zzacG, sessionstartrequest.zzacG);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof SessionStartRequest) && zzb((SessionStartRequest)obj);
    }

    public String getPackageName()
    {
        return zzJd;
    }

    public Session getSession()
    {
        return zzacG;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzacG
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("session", zzacG).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzx.zza(this, parcel, i);
    }

    public IBinder zzpf()
    {
        if(zzaeH == null)
            return null;
        else
            return zzaeH.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzx();
    private final String zzJd;
    private final Session zzacG;
    private final zzjm zzaeH;
    private final int zzzH;

}
