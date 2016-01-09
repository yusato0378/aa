// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public interface MostRecentGameInfo
    extends Parcelable, Freezable
{

    public abstract String zzrP();

    public abstract String zzrQ();

    public abstract long zzrR();

    public abstract Uri zzrS();

    public abstract Uri zzrT();

    public abstract Uri zzrU();
}
