// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zze

public class AncsNotificationParcelable
    implements SafeParcelable, zzb
{

    AncsNotificationParcelable(int i, int j, String s, String s1, String s2, String s3, String s4, 
            String s5, byte byte0, byte byte1, byte byte2, byte byte3)
    {
        mId = j;
        zzzH = i;
        zzawz = s;
        zzaLf = s1;
        zzaLg = s2;
        zzWn = s3;
        zzahr = s4;
        zzWF = s5;
        zzaLh = byte0;
        zzaLi = byte1;
        zzaLj = byte2;
        zzaLk = byte3;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this != obj)
        {
            if(obj == null || getClass() != obj.getClass())
                return false;
            obj = (AncsNotificationParcelable)obj;
            if(zzaLk != ((AncsNotificationParcelable) (obj)).zzaLk)
                return false;
            if(zzaLj != ((AncsNotificationParcelable) (obj)).zzaLj)
                return false;
            if(zzaLi != ((AncsNotificationParcelable) (obj)).zzaLi)
                return false;
            if(zzaLh != ((AncsNotificationParcelable) (obj)).zzaLh)
                return false;
            if(mId != ((AncsNotificationParcelable) (obj)).mId)
                return false;
            if(zzzH != ((AncsNotificationParcelable) (obj)).zzzH)
                return false;
            if(!zzawz.equals(((AncsNotificationParcelable) (obj)).zzawz))
                return false;
            if(zzaLf == null ? ((AncsNotificationParcelable) (obj)).zzaLf != null : !zzaLf.equals(((AncsNotificationParcelable) (obj)).zzaLf))
                return false;
            if(!zzWF.equals(((AncsNotificationParcelable) (obj)).zzWF))
                return false;
            if(!zzaLg.equals(((AncsNotificationParcelable) (obj)).zzaLg))
                return false;
            if(!zzahr.equals(((AncsNotificationParcelable) (obj)).zzahr))
                return false;
            if(!zzWn.equals(((AncsNotificationParcelable) (obj)).zzWn))
                return false;
        }
        return true;
    }

    public String getDisplayName()
    {
        if(zzWF == null)
            return zzawz;
        else
            return zzWF;
    }

    public int getId()
    {
        return mId;
    }

    public String getTitle()
    {
        return zzWn;
    }

    public int hashCode()
    {
        int j = zzzH;
        int k = mId;
        int l = zzawz.hashCode();
        int i;
        if(zzaLf != null)
            i = zzaLf.hashCode();
        else
            i = 0;
        return ((((((((i + ((j * 31 + k) * 31 + l) * 31) * 31 + zzaLg.hashCode()) * 31 + zzWn.hashCode()) * 31 + zzahr.hashCode()) * 31 + zzWF.hashCode()) * 31 + zzaLh) * 31 + zzaLi) * 31 + zzaLj) * 31 + zzaLk;
    }

    public String toString()
    {
        return (new StringBuilder()).append("AncsNotificationParcelable{mVersionCode=").append(zzzH).append(", mId=").append(mId).append(", mAppId='").append(zzawz).append('\'').append(", mDateTime='").append(zzaLf).append('\'').append(", mNotificationText='").append(zzaLg).append('\'').append(", mTitle='").append(zzWn).append('\'').append(", mSubtitle='").append(zzahr).append('\'').append(", mDisplayName='").append(zzWF).append('\'').append(", mEventId=").append(zzaLh).append(", mEventFlags=").append(zzaLi).append(", mCategoryId=").append(zzaLj).append(", mCategoryCount=").append(zzaLk).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i);
    }

    public String zzqT()
    {
        return zzawz;
    }

    public String zzqk()
    {
        return zzahr;
    }

    public String zzza()
    {
        return zzaLf;
    }

    public String zzzb()
    {
        return zzaLg;
    }

    public byte zzzc()
    {
        return zzaLh;
    }

    public byte zzzd()
    {
        return zzaLi;
    }

    public byte zzze()
    {
        return zzaLj;
    }

    public byte zzzf()
    {
        return zzaLk;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zze();
    private int mId;
    private String zzWF;
    private final String zzWn;
    private final String zzaLf;
    private final String zzaLg;
    private byte zzaLh;
    private byte zzaLi;
    private byte zzaLj;
    private byte zzaLk;
    private final String zzahr;
    private final String zzawz;
    final int zzzH;

}
