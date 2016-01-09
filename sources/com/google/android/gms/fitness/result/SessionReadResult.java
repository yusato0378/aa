// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.fitness.data.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.fitness.result:
//            zzj

public class SessionReadResult
    implements Result, SafeParcelable
{

    SessionReadResult(int i, List list, List list1, Status status)
    {
        zzzH = i;
        zzaeK = list;
        zzafQ = Collections.unmodifiableList(list1);
        zzKr = status;
    }

    public SessionReadResult(List list, List list1, Status status)
    {
        zzzH = 3;
        zzaeK = list;
        zzafQ = Collections.unmodifiableList(list1);
        zzKr = status;
    }

    public static SessionReadResult zzH(Status status)
    {
        return new SessionReadResult(new ArrayList(), new ArrayList(), status);
    }

    private boolean zzb(SessionReadResult sessionreadresult)
    {
        return zzKr.equals(sessionreadresult.zzKr) && zzu.equal(zzaeK, sessionreadresult.zzaeK) && zzu.equal(zzafQ, sessionreadresult.zzafQ);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof SessionReadResult) && zzb((SessionReadResult)obj);
    }

    public List getDataSet(Session session)
    {
        zzv.zzb(zzaeK.contains(session), "Attempting to read data for session %s which was not returned", new Object[] {
            session
        });
        ArrayList arraylist = new ArrayList();
        Iterator iterator = zzafQ.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            SessionDataSet sessiondataset = (SessionDataSet)iterator.next();
            if(zzu.equal(session, sessiondataset.getSession()))
                arraylist.add(sessiondataset.zzoV());
        } while(true);
        return arraylist;
    }

    public List getDataSet(Session session, DataType datatype)
    {
        zzv.zzb(zzaeK.contains(session), "Attempting to read data for session %s which was not returned", new Object[] {
            session
        });
        ArrayList arraylist = new ArrayList();
        Iterator iterator = zzafQ.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            SessionDataSet sessiondataset = (SessionDataSet)iterator.next();
            if(zzu.equal(session, sessiondataset.getSession()) && datatype.equals(sessiondataset.zzoV().getDataType()))
                arraylist.add(sessiondataset.zzoV());
        } while(true);
        return arraylist;
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
            zzKr, zzaeK, zzafQ
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("status", zzKr).zzg("sessions", zzaeK).zzg("sessionDataSets", zzafQ).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzj.zza(this, parcel, i);
    }

    public List zzpI()
    {
        return zzafQ;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzj();
    private final Status zzKr;
    private final List zzaeK;
    private final List zzafQ;
    private final int zzzH;

}
