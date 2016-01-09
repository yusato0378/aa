// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common.internal;

import android.os.*;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzab, zzo

public class ValidateAccountRequest
    implements SafeParcelable
{

    ValidateAccountRequest(int i, int j, IBinder ibinder, Scope ascope[], Bundle bundle, String s)
    {
        zzzH = i;
        zzUe = j;
        zzSS = ibinder;
        zzST = ascope;
        zzUf = bundle;
        zzUg = s;
    }

    public ValidateAccountRequest(zzo zzo1, Scope ascope[], String s, Bundle bundle)
    {
        if(zzo1 == null)
            zzo1 = null;
        else
            zzo1 = zzo1.asBinder();
        this(1, 0x6fcd18, ((IBinder) (zzo1)), ascope, bundle, s);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCallingPackage()
    {
        return zzUg;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzab.zza(this, parcel, i);
    }

    public int zzmq()
    {
        return zzUe;
    }

    public Scope[] zzmr()
    {
        return zzST;
    }

    public Bundle zzms()
    {
        return zzUf;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzab();
    final IBinder zzSS;
    private final Scope zzST[];
    private final int zzUe;
    private final Bundle zzUf;
    private final String zzUg;
    final int zzzH;

}
