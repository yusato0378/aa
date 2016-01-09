// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameBadge, GameBadgeEntityCreator

public final class GameBadgeEntity extends GamesDowngradeableSafeParcel
    implements GameBadge
{
    static final class GameBadgeEntityCreatorCompat extends GameBadgeEntityCreator
    {

        public Object createFromParcel(Parcel parcel)
        {
            return zzdo(parcel);
        }

        public GameBadgeEntity zzdo(Parcel parcel)
        {
            if(GameBadgeEntity.zzc(GameBadgeEntity.zzpR()) || GameBadgeEntity.zzcs(com/google/android/gms/games/internal/game/GameBadgeEntity.getCanonicalName()))
                return super.zzdo(parcel);
            int i = parcel.readInt();
            String s = parcel.readString();
            String s1 = parcel.readString();
            parcel = parcel.readString();
            if(parcel == null)
                parcel = null;
            else
                parcel = Uri.parse(parcel);
            return new GameBadgeEntity(1, i, s, s1, parcel);
        }

        GameBadgeEntityCreatorCompat()
        {
        }
    }


    GameBadgeEntity(int i, int j, String s, String s1, Uri uri)
    {
        zzzH = i;
        zzMG = j;
        zzWn = s;
        zzadH = s1;
        zzafY = uri;
    }

    public GameBadgeEntity(GameBadge gamebadge)
    {
        zzzH = 1;
        zzMG = gamebadge.getType();
        zzWn = gamebadge.getTitle();
        zzadH = gamebadge.getDescription();
        zzafY = gamebadge.getIconImageUri();
    }

    static int zza(GameBadge gamebadge)
    {
        return zzu.hashCode(new Object[] {
            Integer.valueOf(gamebadge.getType()), gamebadge.getTitle(), gamebadge.getDescription(), gamebadge.getIconImageUri()
        });
    }

    static boolean zza(GameBadge gamebadge, Object obj)
    {
        boolean flag1 = true;
        if(obj instanceof GameBadge) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(gamebadge == obj) goto _L4; else goto _L3
_L3:
        obj = (GameBadge)obj;
        if(!zzu.equal(Integer.valueOf(((GameBadge) (obj)).getType()), gamebadge.getTitle()))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(((GameBadge) (obj)).getDescription(), gamebadge.getIconImageUri())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(GameBadge gamebadge)
    {
        return zzu.zzq(gamebadge).zzg("Type", Integer.valueOf(gamebadge.getType())).zzg("Title", gamebadge.getTitle()).zzg("Description", gamebadge.getDescription()).zzg("IconImageUri", gamebadge.getIconImageUri()).toString();
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
        return zzrD();
    }

    public String getDescription()
    {
        return zzadH;
    }

    public Uri getIconImageUri()
    {
        return zzafY;
    }

    public String getTitle()
    {
        return zzWn;
    }

    public int getType()
    {
        return zzMG;
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
        if(!zzlQ())
        {
            GameBadgeEntityCreator.zza(this, parcel, i);
            return;
        }
        parcel.writeInt(zzMG);
        parcel.writeString(zzWn);
        parcel.writeString(zzadH);
        String s;
        if(zzafY == null)
            s = null;
        else
            s = zzafY.toString();
        parcel.writeString(s);
    }

    public GameBadge zzrD()
    {
        return this;
    }

    public static final GameBadgeEntityCreator CREATOR = new GameBadgeEntityCreatorCompat();
    private int zzMG;
    private String zzWn;
    private String zzadH;
    private Uri zzafY;
    private final int zzzH;

}
