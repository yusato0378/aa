// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.games.internal.player:
//            MostRecentGameInfo, MostRecentGameInfoEntityCreator

public final class MostRecentGameInfoEntity
    implements SafeParcelable, MostRecentGameInfo
{

    MostRecentGameInfoEntity(int i, String s, String s1, long l, Uri uri, Uri uri1, 
            Uri uri2)
    {
        zzzH = i;
        zzamc = s;
        zzamd = s1;
        zzame = l;
        zzamf = uri;
        zzamg = uri1;
        zzamh = uri2;
    }

    public MostRecentGameInfoEntity(MostRecentGameInfo mostrecentgameinfo)
    {
        zzzH = 2;
        zzamc = mostrecentgameinfo.zzrP();
        zzamd = mostrecentgameinfo.zzrQ();
        zzame = mostrecentgameinfo.zzrR();
        zzamf = mostrecentgameinfo.zzrS();
        zzamg = mostrecentgameinfo.zzrT();
        zzamh = mostrecentgameinfo.zzrU();
    }

    static int zza(MostRecentGameInfo mostrecentgameinfo)
    {
        return zzu.hashCode(new Object[] {
            mostrecentgameinfo.zzrP(), mostrecentgameinfo.zzrQ(), Long.valueOf(mostrecentgameinfo.zzrR()), mostrecentgameinfo.zzrS(), mostrecentgameinfo.zzrT(), mostrecentgameinfo.zzrU()
        });
    }

    static boolean zza(MostRecentGameInfo mostrecentgameinfo, Object obj)
    {
        boolean flag1 = true;
        if(obj instanceof MostRecentGameInfo) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(mostrecentgameinfo == obj) goto _L4; else goto _L3
_L3:
        obj = (MostRecentGameInfo)obj;
        if(!zzu.equal(((MostRecentGameInfo) (obj)).zzrP(), mostrecentgameinfo.zzrP()) || !zzu.equal(((MostRecentGameInfo) (obj)).zzrQ(), mostrecentgameinfo.zzrQ()) || !zzu.equal(Long.valueOf(((MostRecentGameInfo) (obj)).zzrR()), Long.valueOf(mostrecentgameinfo.zzrR())) || !zzu.equal(((MostRecentGameInfo) (obj)).zzrS(), mostrecentgameinfo.zzrS()) || !zzu.equal(((MostRecentGameInfo) (obj)).zzrT(), mostrecentgameinfo.zzrT()))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(((MostRecentGameInfo) (obj)).zzrU(), mostrecentgameinfo.zzrU())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(MostRecentGameInfo mostrecentgameinfo)
    {
        return zzu.zzq(mostrecentgameinfo).zzg("GameId", mostrecentgameinfo.zzrP()).zzg("GameName", mostrecentgameinfo.zzrQ()).zzg("ActivityTimestampMillis", Long.valueOf(mostrecentgameinfo.zzrR())).zzg("GameIconUri", mostrecentgameinfo.zzrS()).zzg("GameHiResUri", mostrecentgameinfo.zzrT()).zzg("GameFeaturedUri", mostrecentgameinfo.zzrU()).toString();
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
        return zzrV();
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
        MostRecentGameInfoEntityCreator.zza(this, parcel, i);
    }

    public String zzrP()
    {
        return zzamc;
    }

    public String zzrQ()
    {
        return zzamd;
    }

    public long zzrR()
    {
        return zzame;
    }

    public Uri zzrS()
    {
        return zzamf;
    }

    public Uri zzrT()
    {
        return zzamg;
    }

    public Uri zzrU()
    {
        return zzamh;
    }

    public MostRecentGameInfo zzrV()
    {
        return this;
    }

    public static final MostRecentGameInfoEntityCreator CREATOR = new MostRecentGameInfoEntityCreator();
    private final String zzamc;
    private final String zzamd;
    private final long zzame;
    private final Uri zzamf;
    private final Uri zzamg;
    private final Uri zzamh;
    private final int zzzH;

}
