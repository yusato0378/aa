// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.firstparty:
//            zze

public final class GetInstrumentsResponse
    implements SafeParcelable
{

    GetInstrumentsResponse()
    {
        this(1, new String[0], new byte[0][]);
    }

    GetInstrumentsResponse(int i, String as[], byte abyte0[][])
    {
        zzzH = i;
        zzaJy = as;
        zzaJz = abyte0;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zze();
    String zzaJy[];
    byte zzaJz[][];
    private final int zzzH;

}
