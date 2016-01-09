// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.*;

// Referenced classes of package com.google.android.gms.fitness.result:
//            zze

public class DataSourcesResult
    implements Result, SafeParcelable
{

    DataSourcesResult(int i, List list, Status status)
    {
        zzzH = i;
        zzaeJ = Collections.unmodifiableList(list);
        zzKr = status;
    }

    public DataSourcesResult(List list, Status status)
    {
        zzzH = 3;
        zzaeJ = Collections.unmodifiableList(list);
        zzKr = status;
    }

    public static DataSourcesResult zzE(Status status)
    {
        return new DataSourcesResult(Collections.emptyList(), status);
    }

    private boolean zzb(DataSourcesResult datasourcesresult)
    {
        return zzKr.equals(datasourcesresult.zzKr) && zzu.equal(zzaeJ, datasourcesresult.zzaeJ);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof DataSourcesResult) && zzb((DataSourcesResult)obj);
    }

    public List getDataSources()
    {
        return zzaeJ;
    }

    public List getDataSources(DataType datatype)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = zzaeJ.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            DataSource datasource = (DataSource)iterator.next();
            if(datasource.getDataType().equals(datatype))
                arraylist.add(datasource);
        } while(true);
        return Collections.unmodifiableList(arraylist);
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
            zzKr, zzaeJ
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("status", zzKr).zzg("dataSets", zzaeJ).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zze();
    private final Status zzKr;
    private final List zzaeJ;
    private final int zzzH;

}
