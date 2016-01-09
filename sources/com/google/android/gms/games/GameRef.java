// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;

// Referenced classes of package com.google.android.gms.games:
//            Game, GameEntity

public final class GameRef extends zzc
    implements Game
{

    public GameRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public boolean areSnapshotsEnabled()
    {
        return getInteger("snapshots_enabled") > 0;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return GameEntity.zza(this, obj);
    }

    public Game freeze()
    {
        return new GameEntity(this);
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public int getAchievementTotalCount()
    {
        return getInteger("achievement_total_count");
    }

    public String getApplicationId()
    {
        return getString("external_game_id");
    }

    public String getDescription()
    {
        return getString("game_description");
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        zza("game_description", chararraybuffer);
    }

    public String getDeveloperName()
    {
        return getString("developer_name");
    }

    public void getDeveloperName(CharArrayBuffer chararraybuffer)
    {
        zza("developer_name", chararraybuffer);
    }

    public String getDisplayName()
    {
        return getString("display_name");
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        zza("display_name", chararraybuffer);
    }

    public Uri getFeaturedImageUri()
    {
        return zzbG("featured_image_uri");
    }

    public String getFeaturedImageUrl()
    {
        return getString("featured_image_url");
    }

    public Uri getHiResImageUri()
    {
        return zzbG("game_hi_res_image_uri");
    }

    public String getHiResImageUrl()
    {
        return getString("game_hi_res_image_url");
    }

    public Uri getIconImageUri()
    {
        return zzbG("game_icon_image_uri");
    }

    public String getIconImageUrl()
    {
        return getString("game_icon_image_url");
    }

    public int getLeaderboardCount()
    {
        return getInteger("leaderboard_count");
    }

    public String getPrimaryCategory()
    {
        return getString("primary_category");
    }

    public String getSecondaryCategory()
    {
        return getString("secondary_category");
    }

    public String getThemeColor()
    {
        return getString("theme_color");
    }

    public boolean hasGamepadSupport()
    {
        return getInteger("gamepad_support") > 0;
    }

    public int hashCode()
    {
        return GameEntity.zza(this);
    }

    public boolean isMuted()
    {
        return getBoolean("muted");
    }

    public boolean isRealTimeMultiplayerEnabled()
    {
        return getInteger("real_time_support") > 0;
    }

    public boolean isTurnBasedMultiplayerEnabled()
    {
        return getInteger("turn_based_support") > 0;
    }

    public String toString()
    {
        return GameEntity.zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((GameEntity)freeze()).writeToParcel(parcel, i);
    }

    public boolean zzpM()
    {
        return getBoolean("play_enabled_game");
    }

    public boolean zzpN()
    {
        return getBoolean("identity_sharing_confirmed");
    }

    public boolean zzpO()
    {
        return getInteger("installed") > 0;
    }

    public String zzpP()
    {
        return getString("package_name");
    }

    public int zzpQ()
    {
        return getInteger("gameplay_acl_status");
    }
}
