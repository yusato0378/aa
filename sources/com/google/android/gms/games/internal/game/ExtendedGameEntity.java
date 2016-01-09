// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.game;

import android.os.Parcel;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            ExtendedGame, GameBadge, GameBadgeEntity, ExtendedGameEntityCreator, 
//            GameBadgeEntityCreator

public final class ExtendedGameEntity extends GamesDowngradeableSafeParcel
    implements ExtendedGame
{
    static final class ExtendedGameEntityCreatorCompat extends ExtendedGameEntityCreator
    {

        public Object createFromParcel(Parcel parcel)
        {
            return zzdn(parcel);
        }

        public ExtendedGameEntity zzdn(Parcel parcel)
        {
            if(ExtendedGameEntity.zzc(ExtendedGameEntity.zzpR()) || ExtendedGameEntity.zzcs(com/google/android/gms/games/internal/game/ExtendedGameEntity.getCanonicalName()))
                return super.zzdn(parcel);
            GameEntity gameentity = (GameEntity)GameEntity.CREATOR.createFromParcel(parcel);
            int j = parcel.readInt();
            String s;
            String s1;
            ArrayList arraylist;
            int k;
            int l;
            long l1;
            long l2;
            long l3;
            boolean flag;
            if(parcel.readInt() == 1)
                flag = true;
            else
                flag = false;
            k = parcel.readInt();
            l1 = parcel.readLong();
            l2 = parcel.readLong();
            s = parcel.readString();
            l3 = parcel.readLong();
            s1 = parcel.readString();
            l = parcel.readInt();
            arraylist = new ArrayList(l);
            for(int i = 0; i < l; i++)
                arraylist.add(GameBadgeEntity.CREATOR.zzdo(parcel));

            return new ExtendedGameEntity(2, gameentity, j, flag, k, l1, l2, s, l3, s1, arraylist, null);
        }

        ExtendedGameEntityCreatorCompat()
        {
        }
    }


    ExtendedGameEntity(int i, GameEntity gameentity, int j, boolean flag, int k, long l, 
            long l1, String s, long l2, String s1, ArrayList arraylist, 
            SnapshotMetadataEntity snapshotmetadataentity)
    {
        zzzH = i;
        zzalP = gameentity;
        zzalQ = j;
        zzalR = flag;
        zzalS = k;
        zzalT = l;
        zzalU = l1;
        zzalV = s;
        zzalW = l2;
        zzalX = s1;
        zzalY = arraylist;
        zzalZ = snapshotmetadataentity;
    }

    public ExtendedGameEntity(ExtendedGame extendedgame)
    {
        Object obj1 = null;
        super();
        zzzH = 2;
        Object obj = extendedgame.getGame();
        int j;
        if(obj == null)
            obj = null;
        else
            obj = new GameEntity(((Game) (obj)));
        zzalP = ((GameEntity) (obj));
        zzalQ = extendedgame.zzrs();
        zzalR = extendedgame.zzrt();
        zzalS = extendedgame.zzru();
        zzalT = extendedgame.zzrv();
        zzalU = extendedgame.zzrw();
        zzalV = extendedgame.zzrx();
        zzalW = extendedgame.zzry();
        zzalX = extendedgame.zzrz();
        obj = extendedgame.zzrA();
        if(obj == null)
            obj = obj1;
        else
            obj = new SnapshotMetadataEntity(((SnapshotMetadata) (obj)));
        zzalZ = ((SnapshotMetadataEntity) (obj));
        extendedgame = extendedgame.zzrr();
        j = extendedgame.size();
        zzalY = new ArrayList(j);
        for(int i = 0; i < j; i++)
            zzalY.add((GameBadgeEntity)((GameBadge)extendedgame.get(i)).freeze());

    }

    static int zza(ExtendedGame extendedgame)
    {
        return zzu.hashCode(new Object[] {
            extendedgame.getGame(), Integer.valueOf(extendedgame.zzrs()), Boolean.valueOf(extendedgame.zzrt()), Integer.valueOf(extendedgame.zzru()), Long.valueOf(extendedgame.zzrv()), Long.valueOf(extendedgame.zzrw()), extendedgame.zzrx(), Long.valueOf(extendedgame.zzry()), extendedgame.zzrz()
        });
    }

    static boolean zza(ExtendedGame extendedgame, Object obj)
    {
        boolean flag1 = true;
        if(obj instanceof ExtendedGame) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(extendedgame == obj) goto _L4; else goto _L3
_L3:
        obj = (ExtendedGame)obj;
        if(!zzu.equal(((ExtendedGame) (obj)).getGame(), extendedgame.getGame()) || !zzu.equal(Integer.valueOf(((ExtendedGame) (obj)).zzrs()), Integer.valueOf(extendedgame.zzrs())) || !zzu.equal(Boolean.valueOf(((ExtendedGame) (obj)).zzrt()), Boolean.valueOf(extendedgame.zzrt())) || !zzu.equal(Integer.valueOf(((ExtendedGame) (obj)).zzru()), Integer.valueOf(extendedgame.zzru())) || !zzu.equal(Long.valueOf(((ExtendedGame) (obj)).zzrv()), Long.valueOf(extendedgame.zzrv())) || !zzu.equal(Long.valueOf(((ExtendedGame) (obj)).zzrw()), Long.valueOf(extendedgame.zzrw())) || !zzu.equal(((ExtendedGame) (obj)).zzrx(), extendedgame.zzrx()) || !zzu.equal(Long.valueOf(((ExtendedGame) (obj)).zzry()), Long.valueOf(extendedgame.zzry())))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(((ExtendedGame) (obj)).zzrz(), extendedgame.zzrz())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(ExtendedGame extendedgame)
    {
        return zzu.zzq(extendedgame).zzg("Game", extendedgame.getGame()).zzg("Availability", Integer.valueOf(extendedgame.zzrs())).zzg("Owned", Boolean.valueOf(extendedgame.zzrt())).zzg("AchievementUnlockedCount", Integer.valueOf(extendedgame.zzru())).zzg("LastPlayedServerTimestamp", Long.valueOf(extendedgame.zzrv())).zzg("PriceMicros", Long.valueOf(extendedgame.zzrw())).zzg("FormattedPrice", extendedgame.zzrx()).zzg("FullPriceMicros", Long.valueOf(extendedgame.zzry())).zzg("FormattedFullPrice", extendedgame.zzrz()).zzg("Snapshot", extendedgame.zzrA()).toString();
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

    public Object freeze()
    {
        return zzrC();
    }

    public Game getGame()
    {
        return zzrB();
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zza(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = false;
        if(!zzlQ())
        {
            ExtendedGameEntityCreator.zza(this, parcel, i);
        } else
        {
            zzalP.writeToParcel(parcel, i);
            parcel.writeInt(zzalQ);
            int j;
            int k;
            if(zzalR)
                j = 1;
            else
                j = 0;
            parcel.writeInt(j);
            parcel.writeInt(zzalS);
            parcel.writeLong(zzalT);
            parcel.writeLong(zzalU);
            parcel.writeString(zzalV);
            parcel.writeLong(zzalW);
            parcel.writeString(zzalX);
            k = zzalY.size();
            parcel.writeInt(k);
            j = ((flag) ? 1 : 0);
            while(j < k) 
            {
                ((GameBadgeEntity)zzalY.get(j)).writeToParcel(parcel, i);
                j++;
            }
        }
    }

    public SnapshotMetadata zzrA()
    {
        return zzalZ;
    }

    public GameEntity zzrB()
    {
        return zzalP;
    }

    public ExtendedGame zzrC()
    {
        return this;
    }

    public ArrayList zzrr()
    {
        return new ArrayList(zzalY);
    }

    public int zzrs()
    {
        return zzalQ;
    }

    public boolean zzrt()
    {
        return zzalR;
    }

    public int zzru()
    {
        return zzalS;
    }

    public long zzrv()
    {
        return zzalT;
    }

    public long zzrw()
    {
        return zzalU;
    }

    public String zzrx()
    {
        return zzalV;
    }

    public long zzry()
    {
        return zzalW;
    }

    public String zzrz()
    {
        return zzalX;
    }

    public static final ExtendedGameEntityCreator CREATOR = new ExtendedGameEntityCreatorCompat();
    private final GameEntity zzalP;
    private final int zzalQ;
    private final boolean zzalR;
    private final int zzalS;
    private final long zzalT;
    private final long zzalU;
    private final String zzalV;
    private final long zzalW;
    private final String zzalX;
    private final ArrayList zzalY;
    private final SnapshotMetadataEntity zzalZ;
    private final int zzzH;

}
