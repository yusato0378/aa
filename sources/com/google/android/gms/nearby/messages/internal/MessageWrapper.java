// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.nearby.messages.Message;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            zze

public class MessageWrapper
    implements SafeParcelable
{

    MessageWrapper(int i, Message message)
    {
        versionCode = i;
        zzaxM = (Message)zzv.zzr(message);
    }

    public int describeContents()
    {
        zze zze1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze zze1 = CREATOR;
        zze.zza(this, parcel, i);
    }

    public static final zze CREATOR = new zze();
    final int versionCode;
    public final Message zzaxM;

}
