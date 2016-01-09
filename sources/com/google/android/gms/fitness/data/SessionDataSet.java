// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzq, Session, DataSet

public class SessionDataSet
    implements SafeParcelable
{

    SessionDataSet(int i, Session session, DataSet dataset)
    {
        zzzH = i;
        zzacG = session;
        zzadJ = dataset;
    }

    private boolean zza(SessionDataSet sessiondataset)
    {
        return zzu.equal(zzacG, sessiondataset.zzacG) && zzu.equal(zzadJ, sessiondataset.zzadJ);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof SessionDataSet) && zza((SessionDataSet)obj);
    }

    public Session getSession()
    {
        return zzacG;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzacG, zzadJ
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("session", zzacG).zzg("dataSet", zzadJ).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzq.zza(this, parcel, i);
    }

    public DataSet zzoV()
    {
        return zzadJ;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzq();
    private final Session zzacG;
    private final DataSet zzadJ;
    final int zzzH;

}
