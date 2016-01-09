// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.identity.intents;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.*;

// Referenced classes of package com.google.android.gms.identity.intents:
//            zza

public final class UserAddressRequest
    implements SafeParcelable
{
    public final class Builder
    {

        public Builder addAllowedCountrySpecification(CountrySpecification countryspecification)
        {
            if(zzapm.zzapl == null)
                zzapm.zzapl = new ArrayList();
            zzapm.zzapl.add(countryspecification);
            return this;
        }

        public Builder addAllowedCountrySpecifications(Collection collection)
        {
            if(zzapm.zzapl == null)
                zzapm.zzapl = new ArrayList();
            zzapm.zzapl.addAll(collection);
            return this;
        }

        public UserAddressRequest build()
        {
            if(zzapm.zzapl != null)
                zzapm.zzapl = Collections.unmodifiableList(zzapm.zzapl);
            return zzapm;
        }

        final UserAddressRequest zzapm;

        private Builder()
        {
            zzapm = UserAddressRequest.this;
            super();
        }

    }


    UserAddressRequest()
    {
        zzzH = 1;
    }

    UserAddressRequest(int i, List list)
    {
        zzzH = i;
        zzapl = list;
    }

    public static Builder newBuilder()
    {
        UserAddressRequest useraddressrequest = new UserAddressRequest();
        useraddressrequest.getClass();
        return useraddressrequest. new Builder();
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
        zza.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    List zzapl;
    private final int zzzH;

}
