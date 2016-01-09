// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.query.Filter;
import java.util.*;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, zzj, FilterHolder, zzf, 
//            Operator

public class LogicalFilter extends AbstractFilter
{

    LogicalFilter(int i, Operator operator, List list)
    {
        zzzH = i;
        zzaaM = operator;
        zzaba = list;
    }

    public transient LogicalFilter(Operator operator, Filter filter, Filter afilter[])
    {
        zzzH = 1;
        zzaaM = operator;
        zzaba = new ArrayList(afilter.length + 1);
        zzaba.add(new FilterHolder(filter));
        zzaaH = new ArrayList(afilter.length + 1);
        zzaaH.add(filter);
        int j = afilter.length;
        for(int i = 0; i < j; i++)
        {
            operator = afilter[i];
            zzaba.add(new FilterHolder(operator));
            zzaaH.add(operator);
        }

    }

    public LogicalFilter(Operator operator, Iterable iterable)
    {
        zzzH = 1;
        zzaaM = operator;
        zzaaH = new ArrayList();
        zzaba = new ArrayList();
        for(operator = iterable.iterator(); operator.hasNext(); zzaba.add(new FilterHolder(iterable)))
        {
            iterable = (Filter)operator.next();
            zzaaH.add(iterable);
        }

    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzj.zza(this, parcel, i);
    }

    public Object zza(zzf zzf1)
    {
        ArrayList arraylist = new ArrayList();
        for(Iterator iterator = zzaba.iterator(); iterator.hasNext(); arraylist.add(((FilterHolder)iterator.next()).getFilter().zza(zzf1)));
        return zzf1.zzb(zzaaM, arraylist);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzj();
    private List zzaaH;
    final Operator zzaaM;
    final List zzaba;
    final int zzzH;

}
