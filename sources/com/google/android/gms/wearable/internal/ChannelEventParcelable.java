// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzk, ChannelImpl

public final class ChannelEventParcelable
    implements SafeParcelable
{

    ChannelEventParcelable(int i, ChannelImpl channelimpl, int j, int k, int l)
    {
        zzzH = i;
        zzaLB = channelimpl;
        type = j;
        zzaLz = k;
        zzaLA = l;
    }

    private static String zziE(int i)
    {
        switch(i)
        {
        default:
            return Integer.toString(i);

        case 1: // '\001'
            return "CHANNEL_OPENED";

        case 2: // '\002'
            return "CHANNEL_CLOSED";

        case 4: // '\004'
            return "OUTPUT_CLOSED";

        case 3: // '\003'
            return "INPUT_CLOSED";
        }
    }

    private static String zziF(int i)
    {
        switch(i)
        {
        default:
            return Integer.toString(i);

        case 1: // '\001'
            return "CLOSE_REASON_DISCONNECTED";

        case 2: // '\002'
            return "CLOSE_REASON_REMOTE_CLOSE";

        case 3: // '\003'
            return "CLOSE_REASON_LOCAL_CLOSE";

        case 0: // '\0'
            return "CLOSE_REASON_NORMAL";
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ChannelEventParcelable[versionCode=").append(zzzH).append(", channel=").append(zzaLB).append(", type=").append(zziE(type)).append(", closeReason=").append(zziF(zzaLz)).append(", appErrorCode=").append(zzaLA).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

    public void zza(com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener)
    {
        switch(type)
        {
        default:
            Log.w("ChannelEventParcelable", (new StringBuilder()).append("Unknown type: ").append(type).toString());
            return;

        case 1: // '\001'
            channellistener.onChannelOpened(zzaLB);
            return;

        case 2: // '\002'
            channellistener.onChannelClosed(zzaLB, zzaLz, zzaLA);
            return;

        case 3: // '\003'
            channellistener.onInputClosed(zzaLB, zzaLz, zzaLA);
            return;

        case 4: // '\004'
            channellistener.onOutputClosed(zzaLB, zzaLz, zzaLA);
            break;
        }
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzk();
    final int type;
    final int zzaLA;
    final ChannelImpl zzaLB;
    final int zzaLz;
    final int zzzH;

}
