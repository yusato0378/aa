// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangesAvailableOptions;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zza

public class AddEventListenerRequest
    implements SafeParcelable
{

    AddEventListenerRequest(int i, DriveId driveid, int j, ChangesAvailableOptions changesavailableoptions)
    {
        zzzH = i;
        zzVL = driveid;
        zzXh = j;
        zzWL = changesavailableoptions;
    }

    public AddEventListenerRequest(DriveId driveid, int i, ChangesAvailableOptions changesavailableoptions)
    {
        this(1, driveid, i, changesavailableoptions);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    final DriveId zzVL;
    final ChangesAvailableOptions zzWL;
    final int zzXh;
    final int zzzH;

}
