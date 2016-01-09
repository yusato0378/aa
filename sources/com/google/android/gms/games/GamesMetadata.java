// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games;

import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.games:
//            Game, GameBuffer

public interface GamesMetadata
{
    public static interface LoadExtendedGamesResult
        extends Releasable, Result
    {
    }

    public static interface LoadGameInstancesResult
        extends Releasable, Result
    {
    }

    public static interface LoadGameSearchSuggestionsResult
        extends Releasable, Result
    {
    }

    public static interface LoadGamesResult
        extends Releasable, Result
    {

        public abstract GameBuffer getGames();
    }


    public abstract Game getCurrentGame(GoogleApiClient googleapiclient);

    public abstract PendingResult loadGame(GoogleApiClient googleapiclient);
}
