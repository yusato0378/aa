// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.sharing;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.nearby.sharing:
//            zza

public class AppContentReceivedResult
    implements SafeParcelable
{

    private AppContentReceivedResult()
    {
        versionCode = 1;
    }

    AppContentReceivedResult(int i, Uri uri, int j)
    {
        versionCode = i;
        zzaxV = uri;
        statusCode = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(obj != this)
        {
            if(!(obj instanceof AppContentReceivedResult))
                return false;
            obj = (AppContentReceivedResult)obj;
            if(!zzu.equal(zzaxV, ((AppContentReceivedResult) (obj)).zzaxV) || !zzu.equal(Integer.valueOf(statusCode), Integer.valueOf(((AppContentReceivedResult) (obj)).statusCode)))
                return false;
        }
        return true;
    }

    public int getStatusCode()
    {
        return statusCode;
    }

    int getVersionCode()
    {
        return versionCode;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzaxV, Integer.valueOf(statusCode)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

    public Uri zzvg()
    {
        return zzaxV;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    private int statusCode;
    private final int versionCode;
    private Uri zzaxV;

}
