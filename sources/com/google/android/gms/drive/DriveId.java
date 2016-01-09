// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.drive.internal.zzar;
import com.google.android.gms.drive.internal.zzas;
import com.google.android.gms.drive.internal.zzx;
import com.google.android.gms.internal.zznx;
import com.google.android.gms.internal.zzny;

// Referenced classes of package com.google.android.gms.drive:
//            zzd

public class DriveId
    implements SafeParcelable
{

    DriveId(int i, String s, long l, long l1, int j)
    {
label0:
        {
            boolean flag1 = false;
            super();
            zzVI = null;
            zzVY = null;
            zzzH = i;
            zzVV = s;
            boolean flag;
            if(!"".equals(s))
                flag = true;
            else
                flag = false;
            zzv.zzQ(flag);
            if(s == null)
            {
                flag = flag1;
                if(l == -1L)
                    break label0;
            }
            flag = true;
        }
        zzv.zzQ(flag);
        zzVW = l;
        zzVG = l1;
        zzVX = j;
    }

    public DriveId(String s, long l, long l1, int i)
    {
        if(s != null && s.startsWith("generated-android-"))
            s = null;
        this(1, s, l, l1, i);
    }

    public static DriveId decodeFromString(String s)
    {
        zzv.zzb(s.startsWith("DriveId:"), (new StringBuilder()).append("Invalid DriveId: ").append(s).toString());
        return zzi(Base64.decode(s.substring("DriveId:".length()), 10));
    }

    public static DriveId zzbZ(String s)
    {
        zzv.zzr(s);
        return new DriveId(s, -1L, -1L, -1);
    }

    static DriveId zzi(byte abyte0[])
    {
        zzar zzar1;
        try
        {
            zzar1 = zzar.zzj(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch(byte abyte0[])
        {
            throw new IllegalArgumentException();
        }
        if("".equals(zzar1.zzYT))
            abyte0 = null;
        else
            abyte0 = zzar1.zzYT;
        return new DriveId(zzar1.versionCode, abyte0, zzar1.zzYU, zzar1.zzYR, zzar1.zzYV);
    }

    private byte[] zznu()
    {
        zzas zzas1 = new zzas();
        zzas1.zzYU = zzVW;
        zzas1.zzYR = zzVG;
        return zzny.zzf(zzas1);
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
            zzVI = (new StringBuilder()).append("DriveId:").append(s).toString();
        }
        return zzVI;
    }

    public boolean equals(Object obj)
    {
        boolean flag = true;
        if(obj instanceof DriveId)
        {
            obj = (DriveId)obj;
            if(((DriveId) (obj)).zzVG != zzVG)
            {
                zzx.zzt("DriveId", "Attempt to compare invalid DriveId detected. Has local storage been cleared?");
                return false;
            }
            if(((DriveId) (obj)).zzVW == -1L && zzVW == -1L)
                return ((DriveId) (obj)).zzVV.equals(zzVV);
            if(zzVV == null || ((DriveId) (obj)).zzVV == null)
            {
                if(((DriveId) (obj)).zzVW != zzVW)
                    flag = false;
                return flag;
            }
            if(((DriveId) (obj)).zzVW == zzVW)
                if(((DriveId) (obj)).zzVV.equals(zzVV))
                {
                    return true;
                } else
                {
                    zzx.zzt("DriveId", "Unexpected unequal resourceId for same DriveId object.");
                    return false;
                }
        }
        return false;
    }

    public String getResourceId()
    {
        return zzVV;
    }

    public int getResourceType()
    {
        return zzVX;
    }

    public int hashCode()
    {
        if(zzVW == -1L)
            return zzVV.hashCode();
        else
            return (new StringBuilder()).append(String.valueOf(zzVG)).append(String.valueOf(zzVW)).toString().hashCode();
    }

    public final String toInvariantString()
    {
        if(zzVY == null)
            zzVY = Base64.encodeToString(zznu(), 10);
        return zzVY;
    }

    public String toString()
    {
        return encodeToString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd.zza(this, parcel, i);
    }

    final byte[] zzno()
    {
        zzar zzar1 = new zzar();
        zzar1.versionCode = zzzH;
        String s;
        if(zzVV == null)
            s = "";
        else
            s = zzVV;
        zzar1.zzYT = s;
        zzar1.zzYU = zzVW;
        zzar1.zzYR = zzVG;
        zzar1.zzYV = zzVX;
        return zzny.zzf(zzar1);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzd();
    public static final int RESOURCE_TYPE_FILE = 0;
    public static final int RESOURCE_TYPE_FOLDER = 1;
    public static final int RESOURCE_TYPE_UNKNOWN = -1;
    final long zzVG;
    private volatile String zzVI;
    final String zzVV;
    final long zzVW;
    final int zzVX;
    private volatile String zzVY;
    final int zzzH;

}
