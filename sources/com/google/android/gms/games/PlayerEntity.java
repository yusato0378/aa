// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import com.google.android.gms.internal.zzhu;

// Referenced classes of package com.google.android.gms.games:
//            Player, PlayerEntityCreator, PlayerLevelInfo

public final class PlayerEntity extends GamesDowngradeableSafeParcel
    implements Player
{
    static final class PlayerEntityCreatorCompat extends PlayerEntityCreator
    {

        public Object createFromParcel(Parcel parcel)
        {
            return zzde(parcel);
        }

        public PlayerEntity zzde(Parcel parcel)
        {
            if(PlayerEntity.zzc(PlayerEntity.zzpR()) || PlayerEntity.zzcs(com/google/android/gms/games/PlayerEntity.getCanonicalName()))
                return super.zzde(parcel);
            String s = parcel.readString();
            String s1 = parcel.readString();
            Object obj = parcel.readString();
            Object obj1 = parcel.readString();
            if(obj == null)
                obj = null;
            else
                obj = Uri.parse(((String) (obj)));
            if(obj1 == null)
                obj1 = null;
            else
                obj1 = Uri.parse(((String) (obj1)));
            return new PlayerEntity(12, s, s1, ((Uri) (obj)), ((Uri) (obj1)), parcel.readLong(), -1, -1L, null, null, null, null, null, true, false);
        }

        PlayerEntityCreatorCompat()
        {
        }
    }


    PlayerEntity(int i, String s, String s1, Uri uri, Uri uri1, long l, 
            int j, long l1, String s2, String s3, String s4, MostRecentGameInfoEntity mostrecentgameinfoentity, 
            PlayerLevelInfo playerlevelinfo, boolean flag, boolean flag1)
    {
        zzzH = i;
        zzagC = s;
        zzWF = s1;
        zzafY = uri;
        zzagj = s2;
        zzafZ = uri1;
        zzagk = s3;
        zzagD = l;
        zzagE = j;
        zzagF = l1;
        zzWn = s4;
        zzagI = flag;
        zzagG = mostrecentgameinfoentity;
        zzagH = playerlevelinfo;
        zzagJ = flag1;
    }

    public PlayerEntity(Player player)
    {
        this(player, true);
    }

    public PlayerEntity(Player player, boolean flag)
    {
        Object obj1 = null;
        super();
        zzzH = 12;
        Object obj;
        if(flag)
            obj = player.getPlayerId();
        else
            obj = null;
        zzagC = ((String) (obj));
        zzWF = player.getDisplayName();
        zzafY = player.getIconImageUri();
        zzagj = player.getIconImageUrl();
        zzafZ = player.getHiResImageUri();
        zzagk = player.getHiResImageUrl();
        zzagD = player.getRetrievedTimestamp();
        zzagE = player.zzpT();
        zzagF = player.getLastPlayedWithTimestamp();
        zzWn = player.getTitle();
        zzagI = player.isProfileVisible();
        obj = player.zzpU();
        if(obj == null)
            obj = obj1;
        else
            obj = new MostRecentGameInfoEntity(((MostRecentGameInfo) (obj)));
        zzagG = ((MostRecentGameInfoEntity) (obj));
        zzagH = player.getLevelInfo();
        zzagJ = player.zzpS();
        if(flag)
            com.google.android.gms.common.internal.zzb.zzn(zzagC);
        com.google.android.gms.common.internal.zzb.zzn(zzWF);
        if(zzagD > 0L)
            flag = true;
        else
            flag = false;
        com.google.android.gms.common.internal.zzb.zzP(flag);
    }

    static boolean zza(Player player, Object obj)
    {
        boolean flag1 = true;
        if(obj instanceof Player) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(player == obj) goto _L4; else goto _L3
_L3:
        obj = (Player)obj;
        if(!zzu.equal(((Player) (obj)).getPlayerId(), player.getPlayerId()) || !zzu.equal(((Player) (obj)).getDisplayName(), player.getDisplayName()) || !zzu.equal(Boolean.valueOf(((Player) (obj)).zzpS()), Boolean.valueOf(player.zzpS())) || !zzu.equal(((Player) (obj)).getIconImageUri(), player.getIconImageUri()) || !zzu.equal(((Player) (obj)).getHiResImageUri(), player.getHiResImageUri()) || !zzu.equal(Long.valueOf(((Player) (obj)).getRetrievedTimestamp()), Long.valueOf(player.getRetrievedTimestamp())) || !zzu.equal(((Player) (obj)).getTitle(), player.getTitle()))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(((Player) (obj)).getLevelInfo(), player.getLevelInfo())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static int zzb(Player player)
    {
        return zzu.hashCode(new Object[] {
            player.getPlayerId(), player.getDisplayName(), Boolean.valueOf(player.zzpS()), player.getIconImageUri(), player.getHiResImageUri(), Long.valueOf(player.getRetrievedTimestamp()), player.getTitle(), player.getLevelInfo()
        });
    }

    static String zzc(Player player)
    {
        return zzu.zzq(player).zzg("PlayerId", player.getPlayerId()).zzg("DisplayName", player.getDisplayName()).zzg("HasDebugAccess", Boolean.valueOf(player.zzpS())).zzg("IconImageUri", player.getIconImageUri()).zzg("IconImageUrl", player.getIconImageUrl()).zzg("HiResImageUri", player.getHiResImageUri()).zzg("HiResImageUrl", player.getHiResImageUrl()).zzg("RetrievedTimestamp", Long.valueOf(player.getRetrievedTimestamp())).zzg("Title", player.getTitle()).zzg("LevelInfo", player.getLevelInfo()).toString();
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

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public Player freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public String getDisplayName()
    {
        return zzWF;
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        zzhu.zzb(zzWF, chararraybuffer);
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

    public long getLastPlayedWithTimestamp()
    {
        return zzagF;
    }

    public PlayerLevelInfo getLevelInfo()
    {
        return zzagH;
    }

    public String getPlayerId()
    {
        return zzagC;
    }

    public long getRetrievedTimestamp()
    {
        return zzagD;
    }

    public String getTitle()
    {
        return zzWn;
    }

    public void getTitle(CharArrayBuffer chararraybuffer)
    {
        zzhu.zzb(zzWn, chararraybuffer);
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public boolean hasHiResImage()
    {
        return getHiResImageUri() != null;
    }

    public boolean hasIconImage()
    {
        return getIconImageUri() != null;
    }

    public int hashCode()
    {
        return zzb(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public boolean isProfileVisible()
    {
        return zzagI;
    }

    public String toString()
    {
        return zzc(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Object obj = null;
        if(!zzlQ())
        {
            PlayerEntityCreator.zza(this, parcel, i);
            return;
        }
        parcel.writeString(zzagC);
        parcel.writeString(zzWF);
        String s;
        if(zzafY == null)
            s = null;
        else
            s = zzafY.toString();
        parcel.writeString(s);
        if(zzafZ == null)
            s = obj;
        else
            s = zzafZ.toString();
        parcel.writeString(s);
        parcel.writeLong(zzagD);
    }

    public boolean zzpS()
    {
        return zzagJ;
    }

    public int zzpT()
    {
        return zzagE;
    }

    public MostRecentGameInfo zzpU()
    {
        return zzagG;
    }

    public static final android.os.Parcelable.Creator CREATOR = new PlayerEntityCreatorCompat();
    private final String zzWF;
    private final String zzWn;
    private final Uri zzafY;
    private final Uri zzafZ;
    private final String zzagC;
    private final long zzagD;
    private final int zzagE;
    private final long zzagF;
    private final MostRecentGameInfoEntity zzagG;
    private final PlayerLevelInfo zzagH;
    private final boolean zzagI;
    private final boolean zzagJ;
    private final String zzagj;
    private final String zzagk;
    private final int zzzH;

}
