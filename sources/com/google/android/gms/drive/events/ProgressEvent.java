// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.events:
//            DriveEvent, zzh

public final class ProgressEvent
    implements DriveEvent
{

    ProgressEvent(int i, DriveId driveid, int j, long l, long l1)
    {
        zzzH = i;
        zzVL = driveid;
        zzue = j;
        zzXd = l;
        zzXe = l1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = true;
        if(obj != null && obj.getClass() == getClass()) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(obj == this) goto _L4; else goto _L3
_L3:
        obj = (ProgressEvent)obj;
        if(!zzu.equal(zzVL, ((ProgressEvent) (obj)).zzVL) || zzue != ((ProgressEvent) (obj)).zzue || zzXd != ((ProgressEvent) (obj)).zzXd)
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzXe == ((ProgressEvent) (obj)).zzXe) goto _L4; else goto _L5
_L5:
        return false;
    }

    public int getType()
    {
        return 5;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzVL, Integer.valueOf(zzue), Long.valueOf(zzXd), Long.valueOf(zzXe)
        });
    }

    public String toString()
    {
        return String.format("ProgressEvent[DriveId: %s, status: %d, bytes transferred: %d, total bytes: %d]", new Object[] {
            zzVL, Integer.valueOf(zzue), Long.valueOf(zzXd), Long.valueOf(zzXe)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzh();
    final DriveId zzVL;
    final long zzXd;
    final long zzXe;
    final int zzue;
    final int zzzH;

}
