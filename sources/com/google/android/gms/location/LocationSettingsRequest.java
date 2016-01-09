// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.*;

// Referenced classes of package com.google.android.gms.location:
//            zzf, LocationRequest

public final class LocationSettingsRequest
    implements SafeParcelable
{
    public static final class Builder
    {

        public Builder addAllLocationRequests(Collection collection)
        {
            zzaqo.addAll(collection);
            return this;
        }

        public Builder addLocationRequest(LocationRequest locationrequest)
        {
            zzaqo.add(locationrequest);
            return this;
        }

        public LocationSettingsRequest build()
        {
            return new LocationSettingsRequest(zzaqo, zzaql, zzaqm, zzaqn);
        }

        public Builder setAlwaysShow(boolean flag)
        {
            zzaql = flag;
            return this;
        }

        public Builder setNeedBle(boolean flag)
        {
            zzaqm = flag;
            return this;
        }

        private boolean zzaql;
        private boolean zzaqm;
        private boolean zzaqn;
        private final ArrayList zzaqo = new ArrayList();

        public Builder()
        {
            zzaql = false;
            zzaqm = false;
            zzaqn = false;
        }
    }


    LocationSettingsRequest(int i, List list, boolean flag, boolean flag1, boolean flag2)
    {
        zzzH = i;
        zzafq = list;
        zzaql = flag;
        zzaqm = flag1;
        zzaqn = flag2;
    }

    private LocationSettingsRequest(List list, boolean flag, boolean flag1, boolean flag2)
    {
        this(2, list, flag, flag1, flag2);
    }


    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf.zza(this, parcel, i);
    }

    public List zzpu()
    {
        return Collections.unmodifiableList(zzafq);
    }

    public boolean zzsB()
    {
        return zzaql;
    }

    public boolean zzsC()
    {
        return zzaqm;
    }

    public boolean zzsD()
    {
        return zzaqn;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzf();
    private final List zzafq;
    private final boolean zzaql;
    private final boolean zzaqm;
    private final boolean zzaqn;
    private final int zzzH;

}
