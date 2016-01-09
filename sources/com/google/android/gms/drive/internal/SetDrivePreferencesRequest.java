// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DrivePreferences;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzbo

public class SetDrivePreferencesRequest
    implements SafeParcelable
{

    SetDrivePreferencesRequest(int i, DrivePreferences drivepreferences)
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
        zzbo.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzbo();
    final DrivePreferences zzZe;
    final int zzzH;

}
