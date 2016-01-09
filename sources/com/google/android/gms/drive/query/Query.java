// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.query;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.MatchAllFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.*;

// Referenced classes of package com.google.android.gms.drive.query:
//            zza, SortOrder, Filter

public class Query
    implements SafeParcelable
{
    public static class Builder
    {

        public Builder addFilter(Filter filter)
        {
            if(!(filter instanceof MatchAllFilter))
                zzaaH.add(filter);
            return this;
        }

        public Query build()
        {
            return new Query(new LogicalFilter(Operator.zzabh, zzaaH), zzaaD, zzaaE, zzaaF, zzaaG, zzWP);
        }

        public Builder setPageToken(String s)
        {
            zzaaD = s;
            return this;
        }

        public Builder setSortOrder(SortOrder sortorder)
        {
            zzaaE = sortorder;
            return this;
        }

        private Set zzWP;
        private String zzaaD;
        private SortOrder zzaaE;
        private List zzaaF;
        private boolean zzaaG;
        private final List zzaaH;

        public Builder()
        {
            zzaaH = new ArrayList();
        }

        public Builder(Query query)
        {
            zzaaH = new ArrayList();
            zzaaH.add(query.getFilter());
            zzaaD = query.getPageToken();
            zzaaE = query.getSortOrder();
            zzaaF = query.zzom();
            zzaaG = query.zzon();
            zzWP = query.zzoo();
        }
    }


    Query(int i, LogicalFilter logicalfilter, String s, SortOrder sortorder, List list, boolean flag, List list1)
    {
        Object obj;
        if(list1 == null)
            obj = null;
        else
            obj = new HashSet(list1);
        this(i, logicalfilter, s, sortorder, list, flag, list1, ((Set) (obj)));
    }

    private Query(int i, LogicalFilter logicalfilter, String s, SortOrder sortorder, List list, boolean flag, List list1, 
            Set set)
    {
        zzzH = i;
        zzaaC = logicalfilter;
        zzaaD = s;
        zzaaE = sortorder;
        zzaaF = list;
        zzaaG = flag;
        zzWO = list1;
        zzWP = set;
    }

    private Query(LogicalFilter logicalfilter, String s, SortOrder sortorder, List list, boolean flag, Set set)
    {
        Object obj;
        if(set == null)
            obj = null;
        else
            obj = new ArrayList(set);
        this(1, logicalfilter, s, sortorder, list, flag, ((List) (obj)), set);
    }


    public int describeContents()
    {
        return 0;
    }

    public Filter getFilter()
    {
        return zzaaC;
    }

    public String getPageToken()
    {
        return zzaaD;
    }

    public SortOrder getSortOrder()
    {
        return zzaaE;
    }

    public String toString()
    {
        return String.format(Locale.US, "Query[%s,%s,PageToken=%s,Spaces=%s]", new Object[] {
            zzaaC, zzaaE, zzaaD, zzWO
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

    public List zzom()
    {
        return zzaaF;
    }

    public boolean zzon()
    {
        return zzaaG;
    }

    public Set zzoo()
    {
        return zzWP;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    final List zzWO;
    private final Set zzWP;
    final LogicalFilter zzaaC;
    final String zzaaD;
    final SortOrder zzaaE;
    final List zzaaF;
    final boolean zzaaG;
    final int zzzH;

}
