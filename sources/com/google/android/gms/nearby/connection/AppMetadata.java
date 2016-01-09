// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import java.util.List;

// Referenced classes of package com.google.android.gms.nearby.connection:
//            AppMetadataCreator

public final class AppMetadata
    implements SafeParcelable
{

    AppMetadata(int i, List list)
    {
        zzzH = i;
        zzaxf = (List)zzv.zzb(list, "Must specify application identifiers");
        zzv.zza(list.size(), "Application identifiers cannot be empty");
    }

    public AppMetadata(List list)
    {
        this(1, list);
    }

    public int describeContents()
    {
        AppMetadataCreator appmetadatacreator = CREATOR;
        return 0;
    }

    public List getAppIdentifiers()
    {
        return zzaxf;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AppMetadataCreator appmetadatacreator = CREATOR;
        AppMetadataCreator.zza(this, parcel, i);
    }

    public static final AppMetadataCreator CREATOR = new AppMetadataCreator();
    private final List zzaxf;
    private final int zzzH;

}
