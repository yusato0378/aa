// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.result:
//            zzk

public class SessionStopResult
    implements Result, SafeParcelable
{

    SessionStopResult(int i, Status status, List list)
    {
        zzzH = i;
        zzKr = status;
        zzaeK = Collections.unmodifiableList(list);
    }

    public SessionStopResult(Status status, List list)
    {
        zzzH = 3;
        zzKr = status;
        zzaeK = Collections.unmodifiableList(list);
    }

    public static SessionStopResult zzI(Status status)
    {
        return new SessionStopResult(status, Collections.emptyList());
    }

    private boolean zzb(SessionStopResult sessionstopresult)
    {
        return zzKr.equals(sessionstopresult.zzKr) && zzu.equal(zzaeK, sessionstopresult.zzaeK);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof SessionStopResult) && zzb((SessionStopResult)obj);
    }

    public List getSessions()
    {
        return zzaeK;
    }

    public Status getStatus()
    {
        return zzKr;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzKr, zzaeK
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("status", zzKr).zzg("sessions", zzaeK).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzk();
    private final Status zzKr;
    private final List zzaeK;
    private final int zzzH;

}
