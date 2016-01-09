// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import java.util.*;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            zza, CustomProperty

public final class AppVisibleCustomProperties
    implements SafeParcelable, Iterable
{
    public static class zza
    {

        public zza zza(CustomPropertyKey custompropertykey, String s)
        {
            zzv.zzb(custompropertykey, "key");
            zzZC.put(custompropertykey, new CustomProperty(custompropertykey, s));
            return this;
        }

        public AppVisibleCustomProperties zzoh()
        {
            return new AppVisibleCustomProperties(zzZC.values());
        }

        private final Map zzZC = new HashMap();

        public zza()
        {
        }
    }


    AppVisibleCustomProperties(int i, Collection collection)
    {
        zzzH = i;
        zzv.zzr(collection);
        zzZB = new ArrayList(collection);
    }

    private AppVisibleCustomProperties(Collection collection)
    {
        this(1, collection);
    }


    public int describeContents()
    {
        return 0;
    }

    public Iterator iterator()
    {
        return zzZB.iterator();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.metadata.internal.zza.zza(this, parcel, i);
    }

    public Map zzog()
    {
        HashMap hashmap = new HashMap(zzZB.size());
        CustomProperty customproperty;
        for(Iterator iterator1 = zzZB.iterator(); iterator1.hasNext(); hashmap.put(customproperty.zzoi(), customproperty.getValue()))
            customproperty = (CustomProperty)iterator1.next();

        return Collections.unmodifiableMap(hashmap);
    }

    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.drive.metadata.internal.zza();
    public static final AppVisibleCustomProperties zzZA = (new zza()).zzoh();
    final List zzZB;
    final int zzzH;

}
