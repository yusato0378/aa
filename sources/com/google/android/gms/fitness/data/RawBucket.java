// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzm, Bucket, DataSet, RawDataSet, 
//            Session

public final class RawBucket
    implements SafeParcelable
{

    public RawBucket(int i, long l, long l1, Session session, int j, 
            List list, int k, boolean flag)
    {
        zzzH = i;
        zzGX = l;
        zzacE = l1;
        zzacG = session;
        zzadB = j;
        zzacQ = list;
        zzacR = k;
        zzacS = flag;
    }

    public RawBucket(Bucket bucket, List list, List list1)
    {
        zzzH = 2;
        zzGX = bucket.getStartTime(TimeUnit.MILLISECONDS);
        zzacE = bucket.getEndTime(TimeUnit.MILLISECONDS);
        zzacG = bucket.getSession();
        zzadB = bucket.zzoB();
        zzacR = bucket.getBucketType();
        zzacS = bucket.zzoC();
        bucket = bucket.getDataSets();
        zzacQ = new ArrayList(bucket.size());
        DataSet dataset;
        for(bucket = bucket.iterator(); bucket.hasNext(); zzacQ.add(new RawDataSet(dataset, list, list1)))
            dataset = (DataSet)bucket.next();

    }

    private boolean zza(RawBucket rawbucket)
    {
        return zzGX == rawbucket.zzGX && zzacE == rawbucket.zzacE && zzadB == rawbucket.zzadB && zzu.equal(zzacQ, rawbucket.zzacQ) && zzacR == rawbucket.zzacR && zzacS == rawbucket.zzacS;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof RawBucket) && zza((RawBucket)obj);
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            Long.valueOf(zzGX), Long.valueOf(zzacE), Integer.valueOf(zzacR)
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("startTime", Long.valueOf(zzGX)).zzg("endTime", Long.valueOf(zzacE)).zzg("activity", Integer.valueOf(zzadB)).zzg("dataSets", zzacQ).zzg("bucketType", Integer.valueOf(zzacR)).zzg("serverHasMoreData", Boolean.valueOf(zzacS)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzm.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzm();
    public final long zzGX;
    public final long zzacE;
    public final Session zzacG;
    public final List zzacQ;
    public final int zzacR;
    public final boolean zzacS;
    public final int zzadB;
    final int zzzH;

}
