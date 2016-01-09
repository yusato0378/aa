// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DrivePreferences;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzay

public class OnDrivePreferencesResponse
    implements SafeParcelable
{

    OnDrivePreferencesResponse(int i, DrivePreferences drivepreferences)
    {
        zzzH = i;
        zzZe = drivepreferences;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzay.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzay();
    DrivePreferences zzZe;
    final int zzzH;

}
