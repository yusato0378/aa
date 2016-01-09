// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.game;

import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import java.util.ArrayList;

public interface ExtendedGame
    extends Parcelable, Freezable
{

    public abstract Game getGame();

    public abstract SnapshotMetadata zzrA();

    public abstract ArrayList zzrr();

    public abstract int zzrs();

    public abstract boolean zzrt();

    public abstract int zzru();

    public abstract long zzrv();

    public abstract long zzrw();

    public abstract String zzrx();

    public abstract long zzry();

    public abstract String zzrz();
}
