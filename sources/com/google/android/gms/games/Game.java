// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public interface Game
    extends Parcelable, Freezable
{

    public abstract boolean areSnapshotsEnabled();

    public abstract int getAchievementTotalCount();

    public abstract String getApplicationId();

    public abstract String getDescription();

    public abstract void getDescription(CharArrayBuffer chararraybuffer);

    public abstract String getDeveloperName();

    public abstract void getDeveloperName(CharArrayBuffer chararraybuffer);

    public abstract String getDisplayName();

    public abstract void getDisplayName(CharArrayBuffer chararraybuffer);

    public abstract Uri getFeaturedImageUri();

    public abstract String getFeaturedImageUrl();

    public abstract Uri getHiResImageUri();

    public abstract String getHiResImageUrl();

    public abstract Uri getIconImageUri();

    public abstract String getIconImageUrl();

    public abstract int getLeaderboardCount();

    public abstract String getPrimaryCategory();

    public abstract String getSecondaryCategory();

    public abstract String getThemeColor();

    public abstract boolean hasGamepadSupport();

    public abstract boolean isMuted();

    public abstract boolean isRealTimeMultiplayerEnabled();

    public abstract boolean isTurnBasedMultiplayerEnabled();

    public abstract boolean zzpM();

    public abstract boolean zzpN();

    public abstract boolean zzpO();

    public abstract String zzpP();

    public abstract int zzpQ();
}
