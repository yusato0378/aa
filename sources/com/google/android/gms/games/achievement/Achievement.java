// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Player;

public interface Achievement
    extends Parcelable, Freezable
{

    public abstract String getAchievementId();

    public abstract int getCurrentSteps();

    public abstract String getDescription();

    public abstract void getDescription(CharArrayBuffer chararraybuffer);

    public abstract String getFormattedCurrentSteps();

    public abstract void getFormattedCurrentSteps(CharArrayBuffer chararraybuffer);

    public abstract String getFormattedTotalSteps();

    public abstract void getFormattedTotalSteps(CharArrayBuffer chararraybuffer);

    public abstract long getLastUpdatedTimestamp();

    public abstract String getName();

    public abstract void getName(CharArrayBuffer chararraybuffer);

    public abstract Player getPlayer();

    public abstract Uri getRevealedImageUri();

    public abstract String getRevealedImageUrl();

    public abstract int getState();

    public abstract int getTotalSteps();

    public abstract int getType();

    public abstract Uri getUnlockedImageUri();

    public abstract String getUnlockedImageUrl();

    public abstract long getXpValue();

    public static final int STATE_HIDDEN = 2;
    public static final int STATE_REVEALED = 1;
    public static final int STATE_UNLOCKED = 0;
    public static final int TYPE_INCREMENTAL = 1;
    public static final int TYPE_STANDARD = 0;
}
