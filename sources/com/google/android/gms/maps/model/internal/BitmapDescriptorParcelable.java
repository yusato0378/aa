// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            zza

public final class BitmapDescriptorParcelable
    implements SafeParcelable
{

    BitmapDescriptorParcelable(int i, byte byte0, Bundle bundle, Bitmap bitmap)
    {
        zzzH = i;
        zzavP = byte0;
        zzavQ = bundle;
        zzavR = bitmap;
    }

    public int describeContents()
    {
        return 0;
    }

    public Bitmap getBitmap()
    {
        return zzavR;
    }

    public byte getType()
    {
        return zzavP;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

    public Bundle zztV()
    {
        return zzavQ;
    }

    public static final zza CREATOR = new zza();
    private byte zzavP;
    private Bundle zzavQ;
    private Bitmap zzavR;
    private final int zzzH;

}
