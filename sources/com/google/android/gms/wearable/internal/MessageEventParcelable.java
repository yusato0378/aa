// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.MessageEvent;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzaw

public class MessageEventParcelable
    implements SafeParcelable, MessageEvent
{

    MessageEventParcelable(int i, int j, String s, byte abyte0[], String s1)
    {
        zzzH = i;
        zzVJ = j;
        zzaLD = s;
        zzanX = abyte0;
        zzarQ = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public byte[] getData()
    {
        return zzanX;
    }

    public String getPath()
    {
        return zzaLD;
    }

    public int getRequestId()
    {
        return zzVJ;
    }

    public String getSourceNodeId()
    {
        return zzarQ;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("MessageEventParcelable[").append(zzVJ).append(",").append(zzaLD).append(", size=");
        Object obj;
        if(zzanX == null)
            obj = "null";
        else
            obj = Integer.valueOf(zzanX.length);
        return stringbuilder.append(obj).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzaw.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzaw();
    private final int zzVJ;
    private final String zzaLD;
    private final byte zzanX[];
    private final String zzarQ;
    final int zzzH;

}
