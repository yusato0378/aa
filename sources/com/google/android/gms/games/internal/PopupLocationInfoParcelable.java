// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal;

import android.os.*;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.games.internal:
//            PopupLocationInfoParcelableCreator

public final class PopupLocationInfoParcelable
    implements SafeParcelable
{

    PopupLocationInfoParcelable(int i, Bundle bundle, IBinder ibinder)
    {
        zzzH = i;
        zzajm = bundle;
        zzajn = ibinder;
    }

    public PopupLocationInfoParcelable(PopupManager.PopupLocationInfo popuplocationinfo)
    {
        zzzH = 1;
        zzajm = popuplocationinfo.zzrl();
        zzajn = popuplocationinfo.zzajq;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public IBinder getWindowToken()
    {
        return zzajn;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PopupLocationInfoParcelableCreator.zza(this, parcel, i);
    }

    public Bundle zzrl()
    {
        return zzajm;
    }

    public static final PopupLocationInfoParcelableCreator CREATOR = new PopupLocationInfoParcelableCreator();
    private final Bundle zzajm;
    private final IBinder zzajn;
    private final int zzzH;

}
