// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.Parcelable;

public final class zzx
{

    private zzx()
    {
    }

    public static void zza(Bundle bundle, String s, Parcelable parcelable)
    {
        bundle.setClassLoader(com/google/android/gms/maps/internal/zzx.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        Bundle bundle1 = bundle2;
        if(bundle2 == null)
            bundle1 = new Bundle();
        bundle1.setClassLoader(com/google/android/gms/maps/internal/zzx.getClassLoader());
        bundle1.putParcelable(s, parcelable);
        bundle.putBundle("map_state", bundle1);
    }
}
