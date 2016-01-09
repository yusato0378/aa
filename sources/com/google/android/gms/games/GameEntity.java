// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.zzhu;

// Referenced classes of package com.google.android.gms.games:
//            Game, GameEntityCreator

public final class GameEntity extends GamesDowngradeableSafeParcel
    implements Game
{
    static final class GameEntityCreatorCompat extends GameEntityCreator
    {

        public Object createFromParcel(Parcel parcel)
        {
            return zzdd(parcel);
        }

        public GameEntity zzdd(Parcel parcel)
        {
            if(GameEntity.zzc(GameEntity.zzpR()) || GameEntity.zzcs(com/google/android/gms/games/GameEntity.getCanonicalName()))
                return super.zzdd(parcel);
            String s = parcel.readString();
            String s1 = parcel.readString();
            String s2 = parcel.readString();
            String s3 = parcel.readString();
            String s4 = parcel.readString();
            String s5 = parcel.readString();
            Object obj = parcel.readString();
            Object obj1;
            Object obj2;
            boolean flag;
            boolean flag1;
            if(obj == null)
                obj = null;
            else
                obj = Uri.parse(((String) (obj)));
            obj1 = parcel.readString();
            if(obj1 == null)
                obj1 = null;
            else
                obj1 = Uri.parse(((String) (obj1)));
            obj2 = parcel.readString();
            if(obj2 == null)
                obj2 = null;
            else
                obj2 = Uri.parse(((String) (obj2)));
            if(parcel.readInt() > 0)
                flag = true;
            else
                flag = false;
            if(parcel.readInt() > 0)
                flag1 = true;
            else
                flag1 = false;
            return new GameEntity(6, s, s1, s2, s3, s4, s5, ((Uri) (obj)), ((Uri) (obj1)), ((Uri) (obj2)), flag, flag1, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), false, false, null, null, null, false, false, false, null, false);
        }

        GameEntityCreatorCompat()
        {
        }
    }


    GameEntity(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            Uri uri, Uri uri1, Uri uri2, boolean flag, boolean flag1, String s6, int j, 
            int k, int l, boolean flag2, boolean flag3, String s7, String s8, String s9, 
            boolean flag4, boolean flag5, boolean flag6, String s10, boolean flag7)
    {
        zzzH = i;
        zzLD = s;
        zzWF = s1;
        zzafV = s2;
        zzafW = s3;
        zzadH = s4;
        zzafX = s5;
        zzafY = uri;
        zzagj = s7;
        zzafZ = uri1;
        zzagk = s8;
        zzaga = uri2;
        zzagl = s9;
        zzagb = flag;
        zzagc = flag1;
        zzagd = s6;
        zzage = j;
        zzagf = k;
        zzagg = l;
        zzagh = flag2;
        zzagi = flag3;
        zzwP = flag4;
        zzagm = flag5;
        zzagn = flag6;
        zzago = s10;
        zzagp = flag7;
    }

    public GameEntity(Game game)
    {
        zzzH = 6;
        zzLD = game.getApplicationId();
        zzafV = game.getPrimaryCategory();
        zzafW = game.getSecondaryCategory();
        zzadH = game.getDescription();
        zzafX = game.getDeveloperName();
        zzWF = game.getDisplayName();
        zzafY = game.getIconImageUri();
        zzagj = game.getIconImageUrl();
        zzafZ = game.getHiResImageUri();
        zzagk = game.getHiResImageUrl();
        zzaga = game.getFeaturedImageUri();
        zzagl = game.getFeaturedImageUrl();
        zzagb = game.zzpM();
        zzagc = game.zzpO();
        zzagd = game.zzpP();
        zzage = game.zzpQ();
        zzagf = game.getAchievementTotalCount();
        zzagg = game.getLeaderboardCount();
        zzagh = game.isRealTimeMultiplayerEnabled();
        zzagi = game.isTurnBasedMultiplayerEnabled();
        zzwP = game.isMuted();
        zzagm = game.zzpN();
        zzagn = game.areSnapshotsEnabled();
        zzago = game.getThemeColor();
        zzagp = game.hasGamepadSupport();
    }

    static int zza(Game game)
    {
        return zzu.hashCode(new Object[] {
            game.getApplicationId(), game.getDisplayName(), game.getPrimaryCategory(), game.getSecondaryCategory(), game.getDescription(), game.getDeveloperName(), game.getIconImageUri(), game.getHiResImageUri(), game.getFeaturedImageUri(), Boolean.valueOf(game.zzpM()), 
            Boolean.valueOf(game.zzpO()), game.zzpP(), Integer.valueOf(game.zzpQ()), Integer.valueOf(game.getAchievementTotalCount()), Integer.valueOf(game.getLeaderboardCount()), Boolean.valueOf(game.isRealTimeMultiplayerEnabled()), Boolean.valueOf(game.isTurnBasedMultiplayerEnabled()), Boolean.valueOf(game.isMuted()), Boolean.valueOf(game.zzpN()), Boolean.valueOf(game.areSnapshotsEnabled()), 
            game.getThemeColor(), Boolean.valueOf(game.hasGamepadSupport())
        });
    }

    static boolean zza(Game game, Object obj)
    {
        boolean flag1 = true;
        if(obj instanceof Game) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(game == obj) goto _L4; else goto _L3
_L3:
        obj = (Game)obj;
        if(!zzu.equal(((Game) (obj)).getApplicationId(), game.getApplicationId()) || !zzu.equal(((Game) (obj)).getDisplayName(), game.getDisplayName()) || !zzu.equal(((Game) (obj)).getPrimaryCategory(), game.getPrimaryCategory()) || !zzu.equal(((Game) (obj)).getSecondaryCategory(), game.getSecondaryCategory()) || !zzu.equal(((Game) (obj)).getDescription(), game.getDescription()) || !zzu.equal(((Game) (obj)).getDeveloperName(), game.getDeveloperName()) || !zzu.equal(((Game) (obj)).getIconImageUri(), game.getIconImageUri()) || !zzu.equal(((Game) (obj)).getHiResImageUri(), game.getHiResImageUri()) || !zzu.equal(((Game) (obj)).getFeaturedImageUri(), game.getFeaturedImageUri()) || !zzu.equal(Boolean.valueOf(((Game) (obj)).zzpM()), Boolean.valueOf(game.zzpM())) || !zzu.equal(Boolean.valueOf(((Game) (obj)).zzpO()), Boolean.valueOf(game.zzpO())) || !zzu.equal(((Game) (obj)).zzpP(), game.zzpP()) || !zzu.equal(Integer.valueOf(((Game) (obj)).zzpQ()), Integer.valueOf(game.zzpQ())) || !zzu.equal(Integer.valueOf(((Game) (obj)).getAchievementTotalCount()), Integer.valueOf(game.getAchievementTotalCount())) || !zzu.equal(Integer.valueOf(((Game) (obj)).getLeaderboardCount()), Integer.valueOf(game.getLeaderboardCount())) || !zzu.equal(Boolean.valueOf(((Game) (obj)).isRealTimeMultiplayerEnabled()), Boolean.valueOf(game.isRealTimeMultiplayerEnabled())))
            break; /* Loop/switch isn't completed */
        boolean flag2 = ((Game) (obj)).isTurnBasedMultiplayerEnabled();
        if(game.isTurnBasedMultiplayerEnabled() && zzu.equal(Boolean.valueOf(((Game) (obj)).isMuted()), Boolean.valueOf(game.isMuted())) && zzu.equal(Boolean.valueOf(((Game) (obj)).zzpN()), Boolean.valueOf(game.zzpN())))
            flag = true;
        else
            flag = false;
        if(!zzu.equal(Boolean.valueOf(flag2), Boolean.valueOf(flag)) || !zzu.equal(Boolean.valueOf(((Game) (obj)).areSnapshotsEnabled()), Boolean.valueOf(game.areSnapshotsEnabled())) || !zzu.equal(((Game) (obj)).getThemeColor(), game.getThemeColor()))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(Boolean.valueOf(((Game) (obj)).hasGamepadSupport()), Boolean.valueOf(game.hasGamepadSupport()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(Game game)
    {
        return zzu.zzq(game).zzg("ApplicationId", game.getApplicationId()).zzg("DisplayName", game.getDisplayName()).zzg("PrimaryCategory", game.getPrimaryCategory()).zzg("SecondaryCategory", game.getSecondaryCategory()).zzg("Description", game.getDescription()).zzg("DeveloperName", game.getDeveloperName()).zzg("IconImageUri", game.getIconImageUri()).zzg("IconImageUrl", game.getIconImageUrl()).zzg("HiResImageUri", game.getHiResImageUri()).zzg("HiResImageUrl", game.getHiResImageUrl()).zzg("FeaturedImageUri", game.getFeaturedImageUri()).zzg("FeaturedImageUrl", game.getFeaturedImageUrl()).zzg("PlayEnabledGame", Boolean.valueOf(game.zzpM())).zzg("InstanceInstalled", Boolean.valueOf(game.zzpO())).zzg("InstancePackageName", game.zzpP()).zzg("AchievementTotalCount", Integer.valueOf(game.getAchievementTotalCount())).zzg("LeaderboardCount", Integer.valueOf(game.getLeaderboardCount())).zzg("RealTimeMultiplayerEnabled", Boolean.valueOf(game.isRealTimeMultiplayerEnabled())).zzg("TurnBasedMultiplayerEnabled", Boolean.valueOf(game.isTurnBasedMultiplayerEnabled())).zzg("AreSnapshotsEnabled", Boolean.valueOf(game.areSnapshotsEnabled())).zzg("ThemeColor", game.getThemeColor()).zzg("HasGamepadSupport", Boolean.valueOf(game.hasGamepadSupport())).toString();
    }

    static boolean zzc(Integer integer)
    {
        return zzd(integer);
    }

    static boolean zzcs(String s)
    {
        return zzbK(s);
    }

    static Integer zzpR()
    {
        return zzlP();
    }

    public boolean areSnapshotsEnabled()
    {
        return zzagn;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public Game freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public int getAchievementTotalCount()
    {
        return zzagf;
    }

    public String getApplicationId()
    {
        return zzLD;
    }

    public String getDescription()
    {
        return zzadH;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        zzhu.zzb(zzadH, chararraybuffer);
    }

    public String getDeveloperName()
    {
        return zzafX;
    }

    public void getDeveloperName(CharArrayBuffer chararraybuffer)
    {
        zzhu.zzb(zzafX, chararraybuffer);
    }

    public String getDisplayName()
    {
        return zzWF;
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        zzhu.zzb(zzWF, chararraybuffer);
    }

    public Uri getFeaturedImageUri()
    {
        return zzaga;
    }

    public String getFeaturedImageUrl()
    {
        return zzagl;
    }

    public Uri getHiResImageUri()
    {
        return zzafZ;
    }

    public String getHiResImageUrl()
    {
        return zzagk;
    }

    public Uri getIconImageUri()
    {
        return zzafY;
    }

    public String getIconImageUrl()
    {
        return zzagj;
    }

    public int getLeaderboardCount()
    {
        return zzagg;
    }

    public String getPrimaryCategory()
    {
        return zzafV;
    }

    public String getSecondaryCategory()
    {
        return zzafW;
    }

    public String getThemeColor()
    {
        return zzago;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public boolean hasGamepadSupport()
    {
        return zzagp;
    }

    public int hashCode()
    {
        return zza(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public boolean isMuted()
    {
        return zzwP;
    }

    public boolean isRealTimeMultiplayerEnabled()
    {
        return zzagh;
    }

    public boolean isTurnBasedMultiplayerEnabled()
    {
        return zzagi;
    }

    public String toString()
    {
        return zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        Object obj = null;
        if(!zzlQ())
        {
            GameEntityCreator.zza(this, parcel, i);
            return;
        }
        parcel.writeString(zzLD);
        parcel.writeString(zzWF);
        parcel.writeString(zzafV);
        parcel.writeString(zzafW);
        parcel.writeString(zzadH);
        parcel.writeString(zzafX);
        String s;
        if(zzafY == null)
            s = null;
        else
            s = zzafY.toString();
        parcel.writeString(s);
        if(zzafZ == null)
            s = null;
        else
            s = zzafZ.toString();
        parcel.writeString(s);
        if(zzaga == null)
            s = obj;
        else
            s = zzaga.toString();
        parcel.writeString(s);
        if(zzagb)
            i = 1;
        else
            i = 0;
        parcel.writeInt(i);
        if(zzagc)
            i = ((flag) ? 1 : 0);
        else
            i = 0;
        parcel.writeInt(i);
        parcel.writeString(zzagd);
        parcel.writeInt(zzage);
        parcel.writeInt(zzagf);
        parcel.writeInt(zzagg);
    }

    public boolean zzpM()
    {
        return zzagb;
    }

    public boolean zzpN()
    {
        return zzagm;
    }

    public boolean zzpO()
    {
        return zzagc;
    }

    public String zzpP()
    {
        return zzagd;
    }

    public int zzpQ()
    {
        return zzage;
    }

    public static final android.os.Parcelable.Creator CREATOR = new GameEntityCreatorCompat();
    private final String zzLD;
    private final String zzWF;
    private final String zzadH;
    private final String zzafV;
    private final String zzafW;
    private final String zzafX;
    private final Uri zzafY;
    private final Uri zzafZ;
    private final Uri zzaga;
    private final boolean zzagb;
    private final boolean zzagc;
    private final String zzagd;
    private final int zzage;
    private final int zzagf;
    private final int zzagg;
    private final boolean zzagh;
    private final boolean zzagi;
    private final String zzagj;
    private final String zzagk;
    private final String zzagl;
    private final boolean zzagm;
    private final boolean zzagn;
    private final String zzago;
    private final boolean zzagp;
    private final boolean zzwP;
    private final int zzzH;

}
