// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;
import java.util.*;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zze, DataSource, RawDataPoint, DataPoint, 
//            RawDataSet, DataType

public final class DataSet
    implements SafeParcelable
{

    DataSet(int i, DataSource datasource, DataType datatype, List list, List list1, boolean flag)
    {
        zzacS = false;
        zzzH = i;
        zzacD = datasource;
        zzacC = datasource.getDataType();
        zzacS = flag;
        zzacZ = new ArrayList(list.size());
        if(i < 2)
            list1 = Collections.singletonList(datasource);
        zzada = list1;
        for(datasource = list.iterator(); datasource.hasNext(); zzacZ.add(new DataPoint(zzada, datatype)))
            datatype = (RawDataPoint)datasource.next();

    }

    public DataSet(DataSource datasource)
    {
        zzacS = false;
        zzzH = 3;
        zzacD = (DataSource)zzv.zzr(datasource);
        zzacC = datasource.getDataType();
        zzacZ = new ArrayList();
        zzada = new ArrayList();
        zzada.add(zzacD);
    }

    public DataSet(RawDataSet rawdataset, List list)
    {
        zzacS = false;
        zzzH = 3;
        zzacD = (DataSource)zzb(list, rawdataset.zzadC);
        zzacC = zzacD.getDataType();
        zzada = list;
        zzacS = rawdataset.zzacS;
        rawdataset = rawdataset.zzadF;
        zzacZ = new ArrayList(rawdataset.size());
        for(rawdataset = rawdataset.iterator(); rawdataset.hasNext(); zzacZ.add(new DataPoint(zzada, list)))
            list = (RawDataPoint)rawdataset.next();

    }

    public static DataSet create(DataSource datasource)
    {
        zzv.zzb(datasource, "DataSource should be specified");
        return new DataSet(datasource);
    }

    private boolean zza(DataSet dataset)
    {
        return zzu.equal(getDataType(), dataset.getDataType()) && zzu.equal(zzacD, dataset.zzacD) && zzu.equal(zzacZ, dataset.zzacZ) && zzacS == dataset.zzacS;
    }

    private static Object zzb(List list, int i)
    {
        if(i >= 0 && i < list.size())
            return list.get(i);
        else
            return null;
    }

    public void add(DataPoint datapoint)
    {
        DataSource datasource = datapoint.getDataSource();
        zzv.zzb(datasource.getStreamIdentifier().equals(zzacD.getStreamIdentifier()), "Conflicting data sources found %s vs %s", new Object[] {
            datasource, zzacD
        });
        datapoint.zzoI();
        zzb(datapoint);
    }

    public void addAll(Iterable iterable)
    {
        for(iterable = iterable.iterator(); iterable.hasNext(); add((DataPoint)iterable.next()));
    }

    public DataPoint createDataPoint()
    {
        return DataPoint.create(zzacD);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof DataSet) && zza((DataSet)obj);
    }

    public List getDataPoints()
    {
        return Collections.unmodifiableList(zzacZ);
    }

    public DataSource getDataSource()
    {
        return zzacD;
    }

    public DataType getDataType()
    {
        return zzacD.getDataType();
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzacD
        });
    }

    public boolean isEmpty()
    {
        return zzacZ.isEmpty();
    }

    public String toString()
    {
        Object obj = zzoK();
        String s = zzacD.toDebugString();
        if(zzacZ.size() >= 10)
            obj = String.format("%d data points, first 5: %s", new Object[] {
                Integer.valueOf(zzacZ.size()), ((List) (obj)).subList(0, 5)
            });
        return String.format("DataSet{%s %s}", new Object[] {
            s, obj
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i);
    }

    public void zzb(DataPoint datapoint)
    {
        zzacZ.add(datapoint);
        datapoint = datapoint.getOriginalDataSource();
        if(datapoint != null && !zzada.contains(datapoint))
            zzada.add(datapoint);
    }

    public void zzb(Iterable iterable)
    {
        for(iterable = iterable.iterator(); iterable.hasNext(); zzb((DataPoint)iterable.next()));
    }

    List zzl(List list)
    {
        ArrayList arraylist = new ArrayList(zzacZ.size());
        for(Iterator iterator = zzacZ.iterator(); iterator.hasNext(); arraylist.add(new RawDataPoint((DataPoint)iterator.next(), list)));
        return arraylist;
    }

    public boolean zzoC()
    {
        return zzacS;
    }

    List zzoK()
    {
        return zzl(zzada);
    }

    List zzoL()
    {
        return zzada;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zze();
    private final DataType zzacC;
    private final DataSource zzacD;
    private boolean zzacS;
    private final List zzacZ;
    private final List zzada;
    private final int zzzH;

}
