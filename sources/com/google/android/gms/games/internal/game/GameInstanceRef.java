// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.internal.constants.PlatformType;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameInstance

public final class GameInstanceRef extends zzc
    implements GameInstance
{

    GameInstanceRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public String getApplicationId()
    {
        return getString("external_game_id");
    }

    public String getDisplayName()
    {
        return getString("instance_display_name");
    }

    public String getPackageName()
    {
        return getString("package_name");
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("ApplicationId", getApplicationId()).zzg("DisplayName", getDisplayName()).zzg("SupportsRealTime", Boolean.valueOf(zzrE())).zzg("SupportsTurnBased", Boolean.valueOf(zzrF())).zzg("PlatformType", PlatformType.zzeZ(zzoP())).zzg("PackageName", getPackageName()).zzg("PiracyCheckEnabled", Boolean.valueOf(zzrG())).zzg("Installed", Boolean.valueOf(zzrH())).toString();
    }

    public int zzoP()
    {
        return getInteger("platform_type");
    }

    public boolean zzrE()
    {
        return getInteger("real_time_support") > 0;
    }

    public boolean zzrF()
    {
        return getInteger("turn_based_support") > 0;
    }

    public boolean zzrG()
    {
        return getInteger("piracy_check") > 0;
    }

    public boolean zzrH()
    {
        return getInteger("installed") > 0;
    }
}
