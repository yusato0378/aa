// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.*;
import com.google.android.gms.fitness.request.DataReadRequest;
import java.util.*;

// Referenced classes of package com.google.android.gms.fitness.result:
//            zzc

public class DataReadResult
    implements Result, SafeParcelable
{

    DataReadResult(int i, List list, Status status, List list1, int j, List list2, List list3)
    {
        zzzH = i;
        zzKr = status;
        zzafJ = j;
        zzada = list2;
        zzafK = list3;
        zzacQ = new ArrayList(list.size());
        for(list = list.iterator(); list.hasNext(); zzacQ.add(new DataSet(status, list2)))
            status = (RawDataSet)list.next();

        zzafI = new ArrayList(list1.size());
        for(list = list1.iterator(); list.hasNext(); zzafI.add(new Bucket(status, list2)))
            status = (RawBucket)list.next();

    }

    public DataReadResult(List list, List list1, Status status)
    {
        zzzH = 5;
        zzacQ = list;
        zzKr = status;
        zzafI = list1;
        zzafJ = 1;
        zzada = new ArrayList();
        zzafK = new ArrayList();
    }

    public static DataReadResult zza(Status status, DataReadRequest datareadrequest)
    {
        ArrayList arraylist = new ArrayList();
        for(Iterator iterator = datareadrequest.getDataSources().iterator(); iterator.hasNext(); arraylist.add(DataSet.create((DataSource)iterator.next())));
        DataType datatype;
        for(datareadrequest = datareadrequest.getDataTypes().iterator(); datareadrequest.hasNext(); arraylist.add(DataSet.create((new com.google.android.gms.fitness.data.DataSource.Builder()).setDataType(datatype).setType(1).setName("Default").build())))
            datatype = (DataType)datareadrequest.next();

        return new DataReadResult(arraylist, Collections.emptyList(), status);
    }

    private void zza(Bucket bucket, List list)
    {
label0:
        {
            for(Iterator iterator = list.iterator(); iterator.hasNext();)
            {
                list = (Bucket)iterator.next();
                if(list.zzb(bucket))
                {
                    for(bucket = bucket.getDataSets().iterator(); bucket.hasNext(); zza((DataSet)bucket.next(), list.getDataSets()));
                    break label0;
                }
            }

            zzafI.add(bucket);
        }
    }

    private void zza(DataSet dataset, List list)
    {
        for(Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            DataSet dataset1 = (DataSet)iterator.next();
            if(dataset1.getDataSource().equals(dataset.getDataSource()))
            {
                dataset1.zzb(dataset.getDataPoints());
                return;
            }
        }

        list.add(dataset);
    }

    private boolean zzc(DataReadResult datareadresult)
    {
        return zzKr.equals(datareadresult.zzKr) && zzu.equal(zzacQ, datareadresult.zzacQ) && zzu.equal(zzafI, datareadresult.zzafI);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof DataReadResult) && zzc((DataReadResult)obj);
    }

    public List getBuckets()
    {
        return zzafI;
    }

    public DataSet getDataSet(DataSource datasource)
    {
        for(Iterator iterator = zzacQ.iterator(); iterator.hasNext();)
        {
            DataSet dataset = (DataSet)iterator.next();
            if(datasource.equals(dataset.getDataSource()))
                return dataset;
        }

        throw new IllegalArgumentException(String.format("Attempting to read data for %s, which was not requested", new Object[] {
            datasource.getStreamIdentifier()
        }));
    }

    public DataSet getDataSet(DataType datatype)
    {
        for(Iterator iterator = zzacQ.iterator(); iterator.hasNext();)
        {
            DataSet dataset = (DataSet)iterator.next();
            if(datatype.equals(dataset.getDataType()))
                return dataset;
        }

        throw new IllegalArgumentException(String.format("Attempting to read data for %s, which was not requested", new Object[] {
            datatype.getName()
        }));
    }

    public List getDataSets()
    {
        return zzacQ;
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
            zzKr, zzacQ, zzafI
        });
    }

    public String toString()
    {
        com.google.android.gms.common.internal.zzu.zza zza1 = zzu.zzq(this).zzg("status", zzKr);
        Object obj;
        if(zzacQ.size() > 5)
            obj = (new StringBuilder()).append(zzacQ.size()).append(" data sets").toString();
        else
            obj = zzacQ;
        zza1 = zza1.zzg("dataSets", obj);
        if(zzafI.size() > 5)
            obj = (new StringBuilder()).append(zzafI.size()).append(" buckets").toString();
        else
            obj = zzafI;
        return zza1.zzg("buckets", obj).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.fitness.result.zzc.zza(this, parcel, i);
    }

    public void zzb(DataReadResult datareadresult)
    {
        for(Iterator iterator = datareadresult.getDataSets().iterator(); iterator.hasNext(); zza((DataSet)iterator.next(), zzacQ));
        for(datareadresult = datareadresult.getBuckets().iterator(); datareadresult.hasNext(); zza((Bucket)datareadresult.next(), zzafI));
    }

    List zzoL()
    {
        return zzada;
    }

    public int zzpD()
    {
        return zzafJ;
    }

    List zzpE()
    {
        ArrayList arraylist = new ArrayList(zzafI.size());
        for(Iterator iterator = zzafI.iterator(); iterator.hasNext(); arraylist.add(new RawBucket((Bucket)iterator.next(), zzada, zzafK)));
        return arraylist;
    }

    List zzpF()
    {
        ArrayList arraylist = new ArrayList(zzacQ.size());
        for(Iterator iterator = zzacQ.iterator(); iterator.hasNext(); arraylist.add(new RawDataSet((DataSet)iterator.next(), zzada, zzafK)));
        return arraylist;
    }

    List zzpG()
    {
        return zzafK;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    private final Status zzKr;
    private final List zzacQ;
    private final List zzada;
    private final List zzafI;
    private int zzafJ;
    private final List zzafK;
    private final int zzzH;

}
