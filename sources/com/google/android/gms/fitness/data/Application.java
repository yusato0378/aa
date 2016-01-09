// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zza

public final class Application
    implements SafeParcelable
{

    Application(int i, String s, String s1, String s2)
    {
        zzzH = i;
        zzJd = (String)zzv.zzr(s);
        zzacK = "";
        zzacL = s2;
    }

    public Application(String s, String s1, String s2)
    {
        this(1, s, "", s2);
    }

    private boolean zza(Application application)
    {
        return zzJd.equals(application.zzJd) && zzu.equal(zzacK, application.zzacK) && zzu.equal(zzacL, application.zzacL);
    }

    public static Application zzcm(String s)
    {
        return zze(s, null, null);
    }

    public static Application zze(String s, String s1, String s2)
    {
        if("com.google.android.gms".equals(s))
            return zzacJ;
        else
            return new Application(s, s1, s2);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof Application) && zza((Application)obj);
    }

    public String getPackageName()
    {
        return zzJd;
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
            zzJd, zzacK, zzacL
        });
    }

    public String toString()
    {
        return String.format("Application{%s:%s:%s}", new Object[] {
            zzJd, zzacK, zzacL
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.fitness.data.zza.zza(this, parcel, i);
    }

    public String zzoA()
    {
        return zzacL;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    public static final Application zzacJ = new Application("com.google.android.gms", String.valueOf(0x6fcd18), null);
    private final String zzJd;
    private final String zzacK;
    private final String zzacL;
    private final int zzzH;

}
