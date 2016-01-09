// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places.personalized.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.places.personalized.zzf;

// Referenced classes of package com.google.android.gms.location.places.personalized.internal:
//            zza

public class TestDataImpl extends zzf
    implements SafeParcelable
{

    TestDataImpl(int i, String s)
    {
        zzzH = i;
        zzatp = s;
    }

    public int describeContents()
    {
        zza zza1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;
        if(!(obj instanceof TestDataImpl))
        {
            return false;
        } else
        {
            obj = (TestDataImpl)obj;
            return zzatp.equals(((TestDataImpl) (obj)).zzatp);
        }
    }

    public int hashCode()
    {
        return zzatp.hashCode();
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("testName", zzatp).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza zza1 = CREATOR;
        zza.zza(this, parcel, i);
    }

    public String zzto()
    {
        return zzatp;
    }

    public static final zza CREATOR = new zza();
    private final String zzatp;
    final int zzzH;

}
