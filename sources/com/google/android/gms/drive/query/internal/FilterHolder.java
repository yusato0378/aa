// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.drive.query.Filter;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            zzd, ComparisonFilter, FieldOnlyFilter, LogicalFilter, 
//            NotFilter, InFilter, MatchAllFilter, HasFilter, 
//            FullTextSearchFilter, OwnedByMeFilter

public class FilterHolder
    implements SafeParcelable
{

    FilterHolder(int i, ComparisonFilter comparisonfilter, FieldOnlyFilter fieldonlyfilter, LogicalFilter logicalfilter, NotFilter notfilter, InFilter infilter, MatchAllFilter matchallfilter, 
            HasFilter hasfilter, FullTextSearchFilter fulltextsearchfilter, OwnedByMeFilter ownedbymefilter)
    {
        zzzH = i;
        zzaaQ = comparisonfilter;
        zzaaR = fieldonlyfilter;
        zzaaS = logicalfilter;
        zzaaT = notfilter;
        zzaaU = infilter;
        zzaaV = matchallfilter;
        zzaaW = hasfilter;
        zzaaX = fulltextsearchfilter;
        zzaaY = ownedbymefilter;
        if(zzaaQ != null)
        {
            zzWp = zzaaQ;
            return;
        }
        if(zzaaR != null)
        {
            zzWp = zzaaR;
            return;
        }
        if(zzaaS != null)
        {
            zzWp = zzaaS;
            return;
        }
        if(zzaaT != null)
        {
            zzWp = zzaaT;
            return;
        }
        if(zzaaU != null)
        {
            zzWp = zzaaU;
            return;
        }
        if(zzaaV != null)
        {
            zzWp = zzaaV;
            return;
        }
        if(zzaaW != null)
        {
            zzWp = zzaaW;
            return;
        }
        if(zzaaX != null)
        {
            zzWp = zzaaX;
            return;
        }
        if(zzaaY != null)
        {
            zzWp = zzaaY;
            return;
        } else
        {
            throw new IllegalArgumentException("At least one filter must be set.");
        }
    }

    public FilterHolder(Filter filter)
    {
        zzv.zzb(filter, "Null filter.");
        zzzH = 2;
        Object obj;
        if(filter instanceof ComparisonFilter)
            obj = (ComparisonFilter)filter;
        else
            obj = null;
        zzaaQ = ((ComparisonFilter) (obj));
        if(filter instanceof FieldOnlyFilter)
            obj = (FieldOnlyFilter)filter;
        else
            obj = null;
        zzaaR = ((FieldOnlyFilter) (obj));
        if(filter instanceof LogicalFilter)
            obj = (LogicalFilter)filter;
        else
            obj = null;
        zzaaS = ((LogicalFilter) (obj));
        if(filter instanceof NotFilter)
            obj = (NotFilter)filter;
        else
            obj = null;
        zzaaT = ((NotFilter) (obj));
        if(filter instanceof InFilter)
            obj = (InFilter)filter;
        else
            obj = null;
        zzaaU = ((InFilter) (obj));
        if(filter instanceof MatchAllFilter)
            obj = (MatchAllFilter)filter;
        else
            obj = null;
        zzaaV = ((MatchAllFilter) (obj));
        if(filter instanceof HasFilter)
            obj = (HasFilter)filter;
        else
            obj = null;
        zzaaW = ((HasFilter) (obj));
        if(filter instanceof FullTextSearchFilter)
            obj = (FullTextSearchFilter)filter;
        else
            obj = null;
        zzaaX = ((FullTextSearchFilter) (obj));
        if(filter instanceof OwnedByMeFilter)
            obj = (OwnedByMeFilter)filter;
        else
            obj = null;
        zzaaY = ((OwnedByMeFilter) (obj));
        if(zzaaQ == null && zzaaR == null && zzaaS == null && zzaaT == null && zzaaU == null && zzaaV == null && zzaaW == null && zzaaX == null && zzaaY == null)
        {
            throw new IllegalArgumentException("Invalid filter type.");
        } else
        {
            zzWp = filter;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public Filter getFilter()
    {
        return zzWp;
    }

    public String toString()
    {
        return String.format("FilterHolder[%s]", new Object[] {
            zzWp
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzd();
    private final Filter zzWp;
    final ComparisonFilter zzaaQ;
    final FieldOnlyFilter zzaaR;
    final LogicalFilter zzaaS;
    final NotFilter zzaaT;
    final InFilter zzaaU;
    final MatchAllFilter zzaaV;
    final HasFilter zzaaW;
    final FullTextSearchFilter zzaaX;
    final OwnedByMeFilter zzaaY;
    final int zzzH;

}
