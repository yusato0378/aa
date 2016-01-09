// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.FitnessActivities;
import java.util.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzc, RawBucket, DataSet, RawDataSet, 
//            DataType, Session

public class Bucket
    implements SafeParcelable
{

    Bucket(int i, long l, long l1, Session session, int j, 
            List list, int k, boolean flag)
    {
        zzacS = false;
        zzzH = i;
        zzGX = l;
        zzacE = l1;
        zzacG = session;
        zzacP = j;
        zzacQ = list;
        zzacR = k;
        zzacS = flag;
    }

    public Bucket(RawBucket rawbucket, List list)
    {
        this(2, rawbucket.zzGX, rawbucket.zzacE, rawbucket.zzacG, rawbucket.zzadB, zza(rawbucket.zzacQ, list), rawbucket.zzacR, rawbucket.zzacS);
    }

    private static List zza(Collection collection, List list)
    {
        ArrayList arraylist = new ArrayList(collection.size());
        for(collection = collection.iterator(); collection.hasNext(); arraylist.add(new DataSet((RawDataSet)collection.next(), list)));
        return arraylist;
    }

    private boolean zza(Bucket bucket)
    {
        return zzGX == bucket.zzGX && zzacE == bucket.zzacE && zzacP == bucket.zzacP && zzu.equal(zzacQ, bucket.zzacQ) && zzacR == bucket.zzacR && zzacS == bucket.zzacS;
    }

    public static String zzdx(int i)
    {
        switch(i)
        {
        default:
            return "bug";

        case 1: // '\001'
            return "time";

        case 3: // '\003'
            return "type";

        case 4: // '\004'
            return "segment";

        case 2: // '\002'
            return "session";

        case 0: // '\0'
            return "unknown";
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof Bucket) && zza((Bucket)obj);
    }

    public String getActivity()
    {
        return FitnessActivities.getName(zzacP);
    }

    public int getBucketType()
    {
        return zzacR;
    }

    public DataSet getDataSet(DataType datatype)
    {
        for(Iterator iterator = zzacQ.iterator(); iterator.hasNext();)
        {
            DataSet dataset = (DataSet)iterator.next();
            if(dataset.getDataType().equals(datatype))
                return dataset;
        }

        return null;
    }

    public List getDataSets()
    {
        return zzacQ;
    }

    public long getEndTime(TimeUnit timeunit)
    {
        return timeunit.convert(zzacE, TimeUnit.MILLISECONDS);
    }

    public Session getSession()
    {
        return zzacG;
    }

    public long getStartTime(TimeUnit timeunit)
    {
        return timeunit.convert(zzGX, TimeUnit.MILLISECONDS);
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            Long.valueOf(zzGX), Long.valueOf(zzacE), Integer.valueOf(zzacP), Integer.valueOf(zzacR)
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("startTime", Long.valueOf(zzGX)).zzg("endTime", Long.valueOf(zzacE)).zzg("activity", Integer.valueOf(zzacP)).zzg("dataSets", zzacQ).zzg("bucketType", zzdx(zzacR)).zzg("serverHasMoreData", Boolean.valueOf(zzacS)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

    public boolean zzb(Bucket bucket)
    {
        return zzGX == bucket.zzGX && zzacE == bucket.zzacE && zzacP == bucket.zzacP && zzacR == bucket.zzacR;
    }

    public long zzjm()
    {
        return zzGX;
    }

    public int zzoB()
    {
        return zzacP;
    }

    public boolean zzoC()
    {
        if(zzacS)
            return true;
        for(Iterator iterator = zzacQ.iterator(); iterator.hasNext();)
            if(((DataSet)iterator.next()).zzoC())
                return true;

        return false;
    }

    public long zzoD()
    {
        return zzacE;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    public static final int TYPE_ACTIVITY_SEGMENT = 4;
    public static final int TYPE_ACTIVITY_TYPE = 3;
    public static final int TYPE_SESSION = 2;
    public static final int TYPE_TIME = 1;
    private final long zzGX;
    private final long zzacE;
    private final Session zzacG;
    private final int zzacP;
    private final List zzacQ;
    private final int zzacR;
    private boolean zzacS;
    private final int zzzH;

}
