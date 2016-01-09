// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.drive.internal.zzaq;
import com.google.android.gms.internal.zzny;

// Referenced classes of package com.google.android.gms.drive:
//            zza

public class ChangeSequenceNumber
    implements SafeParcelable
{

    ChangeSequenceNumber(int i, long l, long l1, long l2)
    {
        boolean flag1 = true;
        super();
        zzVI = null;
        boolean flag;
        if(l != -1L)
            flag = true;
        else
            flag = false;
        zzv.zzQ(flag);
        if(l1 != -1L)
            flag = true;
        else
            flag = false;
        zzv.zzQ(flag);
        if(l2 != -1L)
            flag = flag1;
        else
            flag = false;
        zzv.zzQ(flag);
        zzzH = i;
        zzVF = l;
        zzVG = l1;
        zzVH = l2;
    }

    public int describeContents()
    {
        return 0;
    }

    public final String encodeToString()
    {
        if(zzVI == null)
        {
            String s = Base64.encodeToString(zzno(), 10);
            zzVI = (new StringBuilder()).append("ChangeSequenceNumber:").append(s).toString();
        }
        return zzVI;
    }

    public boolean equals(Object obj)
    {
        if(obj instanceof ChangeSequenceNumber)
            if(((ChangeSequenceNumber) (obj = (ChangeSequenceNumber)obj)).zzVG == zzVG && ((ChangeSequenceNumber) (obj)).zzVH == zzVH && ((ChangeSequenceNumber) (obj)).zzVF == zzVF)
                return true;
        return false;
    }

    public int hashCode()
    {
        return (new StringBuilder()).append(String.valueOf(zzVF)).append(String.valueOf(zzVG)).append(String.valueOf(zzVH)).toString().hashCode();
    }

    public String toString()
    {
        return encodeToString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

    final byte[] zzno()
    {
        zzaq zzaq1 = new zzaq();
        zzaq1.versionCode = zzzH;
        zzaq1.zzYQ = zzVF;
        zzaq1.zzYR = zzVG;
        zzaq1.zzYS = zzVH;
        return zzny.zzf(zzaq1);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    final long zzVF;
    final long zzVG;
    final long zzVH;
    private volatile String zzVI;
    final int zzzH;

}
