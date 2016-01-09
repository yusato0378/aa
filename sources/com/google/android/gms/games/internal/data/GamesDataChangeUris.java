// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.data;

import android.net.Uri;

public final class GamesDataChangeUris
{

    public GamesDataChangeUris()
    {
    }

    private static final Uri zzalE;
    public static final Uri zzalF;
    public static final Uri zzalG;

    static 
    {
        zzalE = Uri.parse("content://com.google.android.gms.games/").buildUpon().appendPath("data_change").build();
        zzalF = zzalE.buildUpon().appendPath("invitations").build();
        zzalG = zzalE.buildUpon().appendEncodedPath("players").build();
    }
}
