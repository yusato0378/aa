// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.internal.FilterHolder;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzbk

public class OpenFileIntentSenderRequest
    implements SafeParcelable
{

    OpenFileIntentSenderRequest(int i, String s, String as[], DriveId driveid, FilterHolder filterholder)
    {
        zzzH = i;
        zzWn = s;
        zzWo = as;
        zzWq = driveid;
        zzZq = filterholder;
    }

    public OpenFileIntentSenderRequest(String s, String as[], DriveId driveid, FilterHolder filterholder)
    {
        this(1, s, as, driveid, filterholder);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzbk.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzbk();
    final String zzWn;
    final String zzWo[];
    final DriveId zzWq;
    final FilterHolder zzZq;
    final int zzzH;

}
