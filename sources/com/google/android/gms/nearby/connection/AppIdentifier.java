// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.nearby.connection:
//            AppIdentifierCreator

public final class AppIdentifier
    implements SafeParcelable
{

    AppIdentifier(int i, String s)
    {
        zzzH = i;
        zzadG = zzv.zzh(s, "Missing application identifier value");
    }

    public AppIdentifier(String s)
    {
        this(1, s);
    }

    public int describeContents()
    {
        AppIdentifierCreator appidentifiercreator = CREATOR;
        return 0;
    }

    public String getIdentifier()
    {
        return zzadG;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AppIdentifierCreator appidentifiercreator = CREATOR;
        AppIdentifierCreator.zza(this, parcel, i);
    }

    public static final AppIdentifierCreator CREATOR = new AppIdentifierCreator();
    private final String zzadG;
    private final int zzzH;

}
