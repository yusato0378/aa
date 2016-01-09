// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.nearby.sharing:
//            zzf

public class ViewableItem
    implements SafeParcelable
{

    private ViewableItem()
    {
        versionCode = 1;
    }

    ViewableItem(int i, String as[])
    {
        versionCode = i;
        zzaya = as;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(obj == this)
            return true;
        if(!(obj instanceof ViewableItem))
        {
            return false;
        } else
        {
            obj = (ViewableItem)obj;
            return zzu.equal(zzaya, ((ViewableItem) (obj)).zzaya);
        }
    }

    int getVersionCode()
    {
        return versionCode;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzaya
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append("ViewableItem[uris=").append(Arrays.toString(zzaya)).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf.zza(this, parcel, i);
    }

    public String[] zzvk()
    {
        return zzaya;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzf();
    private final int versionCode;
    private String zzaya[];

}
