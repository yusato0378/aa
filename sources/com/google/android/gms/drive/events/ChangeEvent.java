// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.drive.events:
//            ResourceEvent, zza

public final class ChangeEvent
    implements SafeParcelable, ResourceEvent
{

    ChangeEvent(int i, DriveId driveid, int j)
    {
        zzzH = i;
        zzVL = driveid;
        zzWK = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public DriveId getDriveId()
    {
        return zzVL;
    }

    public int getType()
    {
        return 1;
    }

    public boolean hasBeenDeleted()
    {
        return (zzWK & 4) != 0;
    }

    public boolean hasContentChanged()
    {
        return (zzWK & 2) != 0;
    }

    public boolean hasMetadataChanged()
    {
        return (zzWK & 1) != 0;
    }

    public String toString()
    {
        return String.format(Locale.US, "ChangeEvent [id=%s,changeFlags=%x]", new Object[] {
            zzVL, Integer.valueOf(zzWK)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    final DriveId zzVL;
    final int zzWK;
    final int zzzH;

}
