// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.achievement;

import android.content.Intent;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.games.achievement:
//            AchievementBuffer

public interface Achievements
{
    public static interface LoadAchievementsResult
        extends Releasable, Result
    {

        public abstract AchievementBuffer getAchievements();
    }

    public static interface UpdateAchievementResult
        extends Result
    {

        public abstract String getAchievementId();
    }


    public abstract Intent getAchievementsIntent(GoogleApiClient googleapiclient);

    public abstract void increment(GoogleApiClient googleapiclient, String s, int i);

    public abstract PendingResult incrementImmediate(GoogleApiClient googleapiclient, String s, int i);

    public abstract PendingResult load(GoogleApiClient googleapiclient, boolean flag);

    public abstract void reveal(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult revealImmediate(GoogleApiClient googleapiclient, String s);

    public abstract void setSteps(GoogleApiClient googleapiclient, String s, int i);

    public abstract PendingResult setStepsImmediate(GoogleApiClient googleapiclient, String s, int i);

    public abstract void unlock(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult unlockImmediate(GoogleApiClient googleapiclient, String s);
}
