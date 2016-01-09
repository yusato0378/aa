// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.nearby.messages:
//            zzd

public class Strategy
    implements SafeParcelable
{
    public static class zza
    {

        static Strategy zza(zza zza1)
        {
            return zza1.zzvc();
        }

        private Strategy zzvc()
        {
            return new Strategy(2, zzaxI, zzaxJ, zzaxK, true);
        }

        public Strategy zzvb()
        {
            return new Strategy(2, zzaxI, zzaxJ, zzaxK, false);
        }

        private int zzaxI;
        private int zzaxJ;
        private int zzaxK;

        public zza()
        {
            zzaxI = 1;
            zzaxJ = 300;
            zzaxK = 0;
        }
    }


    Strategy(int i, int j, int k, int l, boolean flag)
    {
        versionCode = i;
        zzaxI = j;
        zzaxJ = k;
        zzaxK = l;
        zzaxL = flag;
    }

    public int describeContents()
    {
        zzd zzd1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this != obj)
        {
            if(!(obj instanceof Strategy))
                return false;
            obj = (Strategy)obj;
            if(versionCode != ((Strategy) (obj)).versionCode || zzaxI != ((Strategy) (obj)).zzaxI || zzaxJ != ((Strategy) (obj)).zzaxJ || zzaxK != ((Strategy) (obj)).zzaxK || zzaxL != ((Strategy) (obj)).zzaxL)
                return false;
        }
        return true;
    }

    public int hashCode()
    {
        int j = versionCode;
        int k = zzaxI;
        int l = zzaxJ;
        int i1 = zzaxK;
        int i;
        if(zzaxL)
            i = 1;
        else
            i = 0;
        return i + (((j * 31 + k) * 31 + l) * 31 + i1) * 31;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd zzd1 = CREATOR;
        zzd.zza(this, parcel, i);
    }

    public static final zzd CREATOR = new zzd();
    public static final Strategy zzaxH = zza.zza(new zza());
    final int versionCode;
    final int zzaxI;
    final int zzaxJ;
    final int zzaxK;
    final boolean zzaxL;

}
