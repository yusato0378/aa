// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.player;

import android.text.TextUtils;

public final class PlayerColumnNames
{

    public PlayerColumnNames(String s)
    {
        if(TextUtils.isEmpty(s))
        {
            zzami = "external_player_id";
            zzamj = "profile_name";
            zzamk = "profile_icon_image_uri";
            zzaml = "profile_icon_image_url";
            zzamm = "profile_hi_res_image_uri";
            zzamn = "profile_hi_res_image_url";
            zzamo = "last_updated";
            zzamp = "is_in_circles";
            zzamq = "played_with_timestamp";
            zzamr = "current_xp_total";
            zzams = "current_level";
            zzamt = "current_level_min_xp";
            zzamu = "current_level_max_xp";
            zzamv = "next_level";
            zzamw = "next_level_max_xp";
            zzamx = "last_level_up_timestamp";
            zzamy = "player_title";
            zzamz = "has_all_public_acls";
            zzamA = "is_profile_visible";
            zzamB = "most_recent_external_game_id";
            zzamC = "most_recent_game_name";
            zzamD = "most_recent_activity_timestamp";
            zzamE = "most_recent_game_icon_uri";
            zzamF = "most_recent_game_hi_res_uri";
            zzamG = "most_recent_game_featured_uri";
            zzamH = "has_debug_access";
            return;
        } else
        {
            zzami = (new StringBuilder()).append(s).append("external_player_id").toString();
            zzamj = (new StringBuilder()).append(s).append("profile_name").toString();
            zzamk = (new StringBuilder()).append(s).append("profile_icon_image_uri").toString();
            zzaml = (new StringBuilder()).append(s).append("profile_icon_image_url").toString();
            zzamm = (new StringBuilder()).append(s).append("profile_hi_res_image_uri").toString();
            zzamn = (new StringBuilder()).append(s).append("profile_hi_res_image_url").toString();
            zzamo = (new StringBuilder()).append(s).append("last_updated").toString();
            zzamp = (new StringBuilder()).append(s).append("is_in_circles").toString();
            zzamq = (new StringBuilder()).append(s).append("played_with_timestamp").toString();
            zzamr = (new StringBuilder()).append(s).append("current_xp_total").toString();
            zzams = (new StringBuilder()).append(s).append("current_level").toString();
            zzamt = (new StringBuilder()).append(s).append("current_level_min_xp").toString();
            zzamu = (new StringBuilder()).append(s).append("current_level_max_xp").toString();
            zzamv = (new StringBuilder()).append(s).append("next_level").toString();
            zzamw = (new StringBuilder()).append(s).append("next_level_max_xp").toString();
            zzamx = (new StringBuilder()).append(s).append("last_level_up_timestamp").toString();
            zzamy = (new StringBuilder()).append(s).append("player_title").toString();
            zzamz = (new StringBuilder()).append(s).append("has_all_public_acls").toString();
            zzamA = (new StringBuilder()).append(s).append("is_profile_visible").toString();
            zzamB = (new StringBuilder()).append(s).append("most_recent_external_game_id").toString();
            zzamC = (new StringBuilder()).append(s).append("most_recent_game_name").toString();
            zzamD = (new StringBuilder()).append(s).append("most_recent_activity_timestamp").toString();
            zzamE = (new StringBuilder()).append(s).append("most_recent_game_icon_uri").toString();
            zzamF = (new StringBuilder()).append(s).append("most_recent_game_hi_res_uri").toString();
            zzamG = (new StringBuilder()).append(s).append("most_recent_game_featured_uri").toString();
            zzamH = (new StringBuilder()).append(s).append("has_debug_access").toString();
            return;
        }
    }

    public final String zzamA;
    public final String zzamB;
    public final String zzamC;
    public final String zzamD;
    public final String zzamE;
    public final String zzamF;
    public final String zzamG;
    public final String zzamH;
    public final String zzami;
    public final String zzamj;
    public final String zzamk;
    public final String zzaml;
    public final String zzamm;
    public final String zzamn;
    public final String zzamo;
    public final String zzamp;
    public final String zzamq;
    public final String zzamr;
    public final String zzams;
    public final String zzamt;
    public final String zzamu;
    public final String zzamv;
    public final String zzamw;
    public final String zzamx;
    public final String zzamy;
    public final String zzamz;
}
