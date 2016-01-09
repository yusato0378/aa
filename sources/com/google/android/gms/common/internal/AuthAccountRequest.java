// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzc, zzo

public class AuthAccountRequest
    implements SafeParcelable
{

    AuthAccountRequest(int i, IBinder ibinder, Scope ascope[])
    {
        zzzH = i;
        zzSS = ibinder;
        zzST = ascope;
    }

    public AuthAccountRequest(zzo zzo1, Set set)
    {
        this(1, zzo1.asBinder(), (Scope[])set.toArray(new Scope[set.size()]));
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    final IBinder zzSS;
    final Scope zzST[];
    final int zzzH;

}
