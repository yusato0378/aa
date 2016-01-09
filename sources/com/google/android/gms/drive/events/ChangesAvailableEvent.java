// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.drive.events:
//            DriveEvent, zzb, ChangesAvailableOptions

public final class ChangesAvailableEvent
    implements SafeParcelable, DriveEvent
{

    ChangesAvailableEvent(int i, String s, ChangesAvailableOptions changesavailableoptions)
    {
        zzzH = i;
        zzKw = s;
        zzWL = changesavailableoptions;
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
        obj = (ChangesAvailableEvent)obj;
        if(!zzu.equal(zzWL, ((ChangesAvailableEvent) (obj)).zzWL))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(zzKw, ((ChangesAvailableEvent) (obj)).zzKw)) goto _L4; else goto _L5
_L5:
        return false;
    }

    public int getType()
    {
        return 4;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzWL, zzKw
        });
    }

    public String toString()
    {
        return String.format(Locale.US, "ChangesAvailableEvent [changesAvailableOptions=%s]", new Object[] {
            zzWL
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    final String zzKw;
    final ChangesAvailableOptions zzWL;
    final int zzzH;

}
