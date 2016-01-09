// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import java.util.*;

// Referenced classes of package com.google.android.gms.location.places:
//            zzg

public final class UserDataType
    implements SafeParcelable
{

    UserDataType(int i, String s, int j)
    {
        zzv.zzbS(s);
        zzzH = i;
        zzAV = s;
        zzasi = j;
    }

    private static UserDataType zzx(String s, int i)
    {
        return new UserDataType(0, s, i);
    }

    public int describeContents()
    {
        zzg zzg1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this != obj)
        {
            if(!(obj instanceof UserDataType))
                return false;
            obj = (UserDataType)obj;
            if(!zzAV.equals(((UserDataType) (obj)).zzAV) || zzasi != ((UserDataType) (obj)).zzasi)
                return false;
        }
        return true;
    }

    public int hashCode()
    {
        return zzAV.hashCode();
    }

    public String toString()
    {
        return zzAV;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzg zzg1 = CREATOR;
        zzg.zza(this, parcel, i);
    }

    public static final zzg CREATOR = new zzg();
    public static final UserDataType zzase;
    public static final UserDataType zzasf;
    public static final UserDataType zzasg;
    public static final Set zzash;
    final String zzAV;
    final int zzasi;
    final int zzzH;

    static 
    {
        zzase = zzx("test_type", 1);
        zzasf = zzx("labeled_place", 6);
        zzasg = zzx("here_content", 7);
        zzash = Collections.unmodifiableSet(new HashSet(Arrays.asList(new UserDataType[] {
            zzase, zzasf, zzasg
        })));
    }
}
