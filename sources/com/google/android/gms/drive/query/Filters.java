// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.*;
import com.google.android.gms.drive.query.internal.ComparisonFilter;
import com.google.android.gms.drive.query.internal.FieldOnlyFilter;
import com.google.android.gms.drive.query.internal.HasFilter;
import com.google.android.gms.drive.query.internal.InFilter;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.NotFilter;
import com.google.android.gms.drive.query.internal.Operator;
import com.google.android.gms.drive.query.internal.OwnedByMeFilter;

// Referenced classes of package com.google.android.gms.drive.query:
//            SearchableField, Filter

public class Filters
{

    public Filters()
    {
    }

    public static transient Filter and(Filter filter, Filter afilter[])
    {
        return new LogicalFilter(Operator.zzabh, filter, afilter);
    }

    public static Filter and(Iterable iterable)
    {
        return new LogicalFilter(Operator.zzabh, iterable);
    }

    public static Filter contains(SearchableMetadataField searchablemetadatafield, String s)
    {
        return new ComparisonFilter(Operator.zzabk, searchablemetadatafield, s);
    }

    public static Filter eq(CustomPropertyKey custompropertykey, String s)
    {
        return new HasFilter(SearchableField.zzaaJ, (new com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza()).zza(custompropertykey, s).zzoh());
    }

    public static Filter eq(SearchableMetadataField searchablemetadatafield, Object obj)
    {
        return new ComparisonFilter(Operator.zzabc, searchablemetadatafield, obj);
    }

    public static Filter greaterThan(SearchableOrderedMetadataField searchableorderedmetadatafield, Comparable comparable)
    {
        return new ComparisonFilter(Operator.zzabf, searchableorderedmetadatafield, comparable);
    }

    public static Filter greaterThanEquals(SearchableOrderedMetadataField searchableorderedmetadatafield, Comparable comparable)
    {
        return new ComparisonFilter(Operator.zzabg, searchableorderedmetadatafield, comparable);
    }

    public static Filter in(SearchableCollectionMetadataField searchablecollectionmetadatafield, Object obj)
    {
        return new InFilter(searchablecollectionmetadatafield, obj);
    }

    public static Filter lessThan(SearchableOrderedMetadataField searchableorderedmetadatafield, Comparable comparable)
    {
        return new ComparisonFilter(Operator.zzabd, searchableorderedmetadatafield, comparable);
    }

    public static Filter lessThanEquals(SearchableOrderedMetadataField searchableorderedmetadatafield, Comparable comparable)
    {
        return new ComparisonFilter(Operator.zzabe, searchableorderedmetadatafield, comparable);
    }

    public static Filter not(Filter filter)
    {
        return new NotFilter(filter);
    }

    public static Filter openedByMe()
    {
        return new FieldOnlyFilter(SearchableField.LAST_VIEWED_BY_ME);
    }

    public static transient Filter or(Filter filter, Filter afilter[])
    {
        return new LogicalFilter(Operator.zzabi, filter, afilter);
    }

    public static Filter or(Iterable iterable)
    {
        return new LogicalFilter(Operator.zzabi, iterable);
    }

    public static Filter ownedByMe()
    {
        return new OwnedByMeFilter();
    }

    public static Filter sharedWithMe()
    {
        return new FieldOnlyFilter(SearchableField.zzaaI);
    }
}
