// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            zzp

public class ParcelableCollaborator
    implements SafeParcelable
{

    ParcelableCollaborator(int i, boolean flag, boolean flag1, String s, String s1, String s2, String s3, 
            String s4)
    {
        zzzH = i;
        zzabn = flag;
        zzabo = flag1;
        zzBL = s;
        zzFh = s1;
        zzWF = s2;
        zzabp = s3;
        zzabq = s4;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;
        if(!(obj instanceof ParcelableCollaborator))
        {
            return false;
        } else
        {
            obj = (ParcelableCollaborator)obj;
            return zzBL.equals(((ParcelableCollaborator) (obj)).zzBL);
        }
    }

    public int hashCode()
    {
        return zzBL.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("Collaborator [isMe=").append(zzabn).append(", isAnonymous=").append(zzabo).append(", sessionId=").append(zzBL).append(", userId=").append(zzFh).append(", displayName=").append(zzWF).append(", color=").append(zzabp).append(", photoUrl=").append(zzabq).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzp.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzp();
    final String zzBL;
    final String zzFh;
    final String zzWF;
    final boolean zzabn;
    final boolean zzabo;
    final String zzabp;
    final String zzabq;
    final int zzzH;

}
