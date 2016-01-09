// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.FileUploadPreferences;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzae

public final class FileUploadPreferencesImpl
    implements SafeParcelable, FileUploadPreferences
{

    FileUploadPreferencesImpl(int i, int j, int k, boolean flag)
    {
        zzzH = i;
        zzYC = j;
        zzYD = k;
        zzYE = flag;
    }

    public static boolean zzbY(int i)
    {
        switch(i)
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
            return true;
        }
    }

    public static boolean zzbZ(int i)
    {
        switch(i)
        {
        default:
            return false;

        case 256: 
        case 257: 
            return true;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public int getBatteryUsagePreference()
    {
        if(!zzbZ(zzYD))
            return 0;
        else
            return zzYD;
    }

    public int getNetworkTypePreference()
    {
        if(!zzbY(zzYC))
            return 0;
        else
            return zzYC;
    }

    public boolean isRoamingAllowed()
    {
        return zzYE;
    }

    public void setBatteryUsagePreference(int i)
    {
        if(!zzbZ(i))
        {
            throw new IllegalArgumentException("Invalid battery usage preference value.");
        } else
        {
            zzYD = i;
            return;
        }
    }

    public void setNetworkTypePreference(int i)
    {
        if(!zzbY(i))
        {
            throw new IllegalArgumentException("Invalid data connection preference value.");
        } else
        {
            zzYC = i;
            return;
        }
    }

    public void setRoamingAllowed(boolean flag)
    {
        zzYE = flag;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzae.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzae();
    int zzYC;
    int zzYD;
    boolean zzYE;
    final int zzzH;

}
