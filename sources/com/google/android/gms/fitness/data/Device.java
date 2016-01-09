// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.data;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzjq;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzh

public final class Device
    implements SafeParcelable
{

    Device(int i, String s, String s1, String s2, String s3, int j, int k)
    {
        zzzH = i;
        zzado = (String)zzv.zzr(s);
        zzadp = (String)zzv.zzr(s1);
        zzacK = "";
        zzadq = (String)zzv.zzr(s3);
        zzMG = j;
        zzadr = k;
    }

    public Device(String s, String s1, String s2, int i)
    {
        this(s, s1, "", s2, i, 0);
    }

    public Device(String s, String s1, String s2, String s3, int i, int j)
    {
        this(1, s, s1, "", s3, i, j);
    }

    public static Device getLocalDevice(Context context)
    {
        int i = zzin.zzac(context);
        context = zzY(context);
        return new Device(Build.MANUFACTURER, Build.MODEL, android.os.Build.VERSION.RELEASE, context, i, 2);
    }

    private static String zzY(Context context)
    {
        return android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    private boolean zza(Device device)
    {
        return zzu.equal(zzado, device.zzado) && zzu.equal(zzadp, device.zzadp) && zzu.equal(zzacK, device.zzacK) && zzu.equal(zzadq, device.zzadq) && zzMG == device.zzMG && zzadr == device.zzadr;
    }

    private boolean zzoQ()
    {
        return zzoP() == 1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof Device) && zza((Device)obj);
    }

    public String getManufacturer()
    {
        return zzado;
    }

    public String getModel()
    {
        return zzadp;
    }

    String getStreamIdentifier()
    {
        return String.format("%s:%s:%s", new Object[] {
            zzado, zzadp, zzadq
        });
    }

    public int getType()
    {
        return zzMG;
    }

    public String getUid()
    {
        return zzadq;
    }

    public String getVersion()
    {
        return zzacK;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzado, zzadp, zzacK, zzadq, Integer.valueOf(zzMG)
        });
    }

    public String toString()
    {
        return String.format("Device{%s:%s:%s:%s}", new Object[] {
            getStreamIdentifier(), zzacK, Integer.valueOf(zzMG), Integer.valueOf(zzadr)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    public int zzoP()
    {
        return zzadr;
    }

    public String zzoR()
    {
        if(zzoQ())
            return zzadq;
        else
            return zzjq.zzcr(zzadq);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzh();
    public static final int TYPE_CHEST_STRAP = 4;
    public static final int TYPE_PHONE = 1;
    public static final int TYPE_SCALE = 5;
    public static final int TYPE_TABLET = 2;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_WATCH = 3;
    private final int zzMG;
    private final String zzacK;
    private final String zzado;
    private final String zzadp;
    private final String zzadq;
    private final int zzadr;
    private final int zzzH;

}
