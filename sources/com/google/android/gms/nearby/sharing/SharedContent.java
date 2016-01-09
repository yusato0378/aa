// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.nearby.sharing:
//            zzc, ViewableItem, LocalContent

public class SharedContent
    implements SafeParcelable
{

    private SharedContent()
    {
        versionCode = 2;
    }

    SharedContent(int i, String s, ViewableItem aviewableitem[], LocalContent alocalcontent[])
    {
        versionCode = i;
        zzaxX = s;
        zzaxY = aviewableitem;
        zzaxZ = alocalcontent;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(obj != this)
        {
            if(!(obj instanceof SharedContent))
                return false;
            obj = (SharedContent)obj;
            if(!zzu.equal(zzaxY, ((SharedContent) (obj)).zzaxY) || !zzu.equal(zzaxZ, ((SharedContent) (obj)).zzaxZ) || !zzu.equal(zzaxX, ((SharedContent) (obj)).zzaxX))
                return false;
        }
        return true;
    }

    public String getUri()
    {
        return zzaxX;
    }

    int getVersionCode()
    {
        return versionCode;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzaxY, zzaxZ, zzaxX
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append("SharedContent[viewableItems=").append(Arrays.toString(zzaxY)).append(", localContents=").append(Arrays.toString(zzaxZ)).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

    public ViewableItem[] zzvi()
    {
        return zzaxY;
    }

    public LocalContent[] zzvj()
    {
        return zzaxZ;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    private final int versionCode;
    private String zzaxX;
    private ViewableItem zzaxY[];
    private LocalContent zzaxZ[];

}
