// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.drive:
//            zzh

public class Permission
    implements SafeParcelable
{

    Permission(int i, String s, int j, String s1, String s2, int k, boolean flag)
    {
        zzzH = i;
        zzWr = s;
        zzWs = j;
        zzWt = s1;
        zzWu = s2;
        zzWv = k;
        zzWw = flag;
    }

    public static boolean zzbt(int i)
    {
        switch(i)
        {
        default:
            return false;

        case 256: 
        case 257: 
        case 258: 
            return true;
        }
    }

    public static boolean zzbu(int i)
    {
        switch(i)
        {
        default:
            return false;

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return true;
        }
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
        obj = (Permission)obj;
        if(!zzu.equal(zzWr, ((Permission) (obj)).zzWr) || zzWs != ((Permission) (obj)).zzWs || zzWv != ((Permission) (obj)).zzWv)
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzWw == ((Permission) (obj)).zzWw) goto _L4; else goto _L5
_L5:
        return false;
    }

    public int getRole()
    {
        if(!zzbu(zzWv))
            return -1;
        else
            return zzWv;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzWr, Integer.valueOf(zzWs), Integer.valueOf(zzWv), Boolean.valueOf(zzWw)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    public String zznB()
    {
        if(!zzbt(zzWs))
            return null;
        else
            return zzWr;
    }

    public int zznC()
    {
        if(!zzbt(zzWs))
            return -1;
        else
            return zzWs;
    }

    public String zznD()
    {
        return zzWt;
    }

    public String zznE()
    {
        return zzWu;
    }

    public boolean zznF()
    {
        return zzWw;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzh();
    private String zzWr;
    private int zzWs;
    private String zzWt;
    private String zzWu;
    private int zzWv;
    private boolean zzWw;
    final int zzzH;

}
