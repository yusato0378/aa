// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.zzhu;

// Referenced classes of package com.google.android.gms.games.achievement:
//            Achievement, AchievementEntityCreator

public final class AchievementEntity
    implements SafeParcelable, Achievement
{

    AchievementEntity(int i, String s, int j, String s1, String s2, Uri uri, String s3, 
            Uri uri1, String s4, int k, String s5, PlayerEntity playerentity, int l, int i1, 
            String s6, long l1, long l2)
    {
        zzzH = i;
        zzagT = s;
        zzMG = j;
        mName = s1;
        zzadH = s2;
        zzagU = uri;
        zzagV = s3;
        zzagW = uri1;
        zzagX = s4;
        zzagY = k;
        zzagZ = s5;
        zzaha = playerentity;
        mState = l;
        zzahb = i1;
        zzahc = s6;
        zzahd = l1;
        zzahe = l2;
    }

    public AchievementEntity(Achievement achievement)
    {
        zzzH = 1;
        zzagT = achievement.getAchievementId();
        zzMG = achievement.getType();
        mName = achievement.getName();
        zzadH = achievement.getDescription();
        zzagU = achievement.getUnlockedImageUri();
        zzagV = achievement.getUnlockedImageUrl();
        zzagW = achievement.getRevealedImageUri();
        zzagX = achievement.getRevealedImageUrl();
        zzaha = (PlayerEntity)achievement.getPlayer().freeze();
        mState = achievement.getState();
        zzahd = achievement.getLastUpdatedTimestamp();
        zzahe = achievement.getXpValue();
        if(achievement.getType() == 1)
        {
            zzagY = achievement.getTotalSteps();
            zzagZ = achievement.getFormattedTotalSteps();
            zzahb = achievement.getCurrentSteps();
            zzahc = achievement.getFormattedCurrentSteps();
        } else
        {
            zzagY = 0;
            zzagZ = null;
            zzahb = 0;
            zzahc = null;
        }
        com.google.android.gms.common.internal.zzb.zzn(zzagT);
        com.google.android.gms.common.internal.zzb.zzn(zzadH);
    }

    static int zza(Achievement achievement)
    {
        int i;
        int j;
        if(achievement.getType() == 1)
        {
            j = achievement.getCurrentSteps();
            i = achievement.getTotalSteps();
        } else
        {
            i = 0;
            j = 0;
        }
        return zzu.hashCode(new Object[] {
            achievement.getAchievementId(), achievement.getName(), Integer.valueOf(achievement.getType()), achievement.getDescription(), Long.valueOf(achievement.getXpValue()), Integer.valueOf(achievement.getState()), Long.valueOf(achievement.getLastUpdatedTimestamp()), achievement.getPlayer(), Integer.valueOf(j), Integer.valueOf(i)
        });
    }

    static boolean zza(Achievement achievement, Object obj)
    {
        boolean flag2 = true;
        if(obj instanceof Achievement) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L4:
        return flag1;
_L2:
        flag1 = flag2;
        if(achievement == obj) goto _L4; else goto _L3
_L3:
        obj = (Achievement)obj;
        boolean flag;
        if(achievement.getType() == 1)
        {
            flag1 = zzu.equal(Integer.valueOf(((Achievement) (obj)).getCurrentSteps()), Integer.valueOf(achievement.getCurrentSteps()));
            flag = zzu.equal(Integer.valueOf(((Achievement) (obj)).getTotalSteps()), Integer.valueOf(achievement.getTotalSteps()));
        } else
        {
            flag = true;
            flag1 = true;
        }
        if(!zzu.equal(((Achievement) (obj)).getAchievementId(), achievement.getAchievementId()) || !zzu.equal(((Achievement) (obj)).getName(), achievement.getName()) || !zzu.equal(Integer.valueOf(((Achievement) (obj)).getType()), Integer.valueOf(achievement.getType())) || !zzu.equal(((Achievement) (obj)).getDescription(), achievement.getDescription()) || !zzu.equal(Long.valueOf(((Achievement) (obj)).getXpValue()), Long.valueOf(achievement.getXpValue())) || !zzu.equal(Integer.valueOf(((Achievement) (obj)).getState()), Integer.valueOf(achievement.getState())) || !zzu.equal(Long.valueOf(((Achievement) (obj)).getLastUpdatedTimestamp()), Long.valueOf(achievement.getLastUpdatedTimestamp())) || !zzu.equal(((Achievement) (obj)).getPlayer(), achievement.getPlayer()) || !flag1)
            break; /* Loop/switch isn't completed */
        flag1 = flag2;
        if(flag) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(Achievement achievement)
    {
        com.google.android.gms.common.internal.zzu.zza zza1 = zzu.zzq(achievement).zzg("Id", achievement.getAchievementId()).zzg("Type", Integer.valueOf(achievement.getType())).zzg("Name", achievement.getName()).zzg("Description", achievement.getDescription()).zzg("Player", achievement.getPlayer()).zzg("State", Integer.valueOf(achievement.getState()));
        if(achievement.getType() == 1)
        {
            zza1.zzg("CurrentSteps", Integer.valueOf(achievement.getCurrentSteps()));
            zza1.zzg("TotalSteps", Integer.valueOf(achievement.getTotalSteps()));
        }
        return zza1.toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public Achievement freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public String getAchievementId()
    {
        return zzagT;
    }

    public int getCurrentSteps()
    {
        return zzahb;
    }

    public String getDescription()
    {
        return zzadH;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        zzhu.zzb(zzadH, chararraybuffer);
    }

    public String getFormattedCurrentSteps()
    {
        return zzahc;
    }

    public void getFormattedCurrentSteps(CharArrayBuffer chararraybuffer)
    {
        zzhu.zzb(zzahc, chararraybuffer);
    }

    public String getFormattedTotalSteps()
    {
        return zzagZ;
    }

    public void getFormattedTotalSteps(CharArrayBuffer chararraybuffer)
    {
        zzhu.zzb(zzagZ, chararraybuffer);
    }

    public long getLastUpdatedTimestamp()
    {
        return zzahd;
    }

    public String getName()
    {
        return mName;
    }

    public void getName(CharArrayBuffer chararraybuffer)
    {
        zzhu.zzb(mName, chararraybuffer);
    }

    public Player getPlayer()
    {
        return zzaha;
    }

    public Uri getRevealedImageUri()
    {
        return zzagW;
    }

    public String getRevealedImageUrl()
    {
        return zzagX;
    }

    public int getState()
    {
        return mState;
    }

    public int getTotalSteps()
    {
        return zzagY;
    }

    public int getType()
    {
        return zzMG;
    }

    public Uri getUnlockedImageUri()
    {
        return zzagU;
    }

    public String getUnlockedImageUrl()
    {
        return zzagV;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public long getXpValue()
    {
        return zzahe;
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
        AchievementEntityCreator.zza(this, parcel, i);
    }

    public static final AchievementEntityCreator CREATOR = new AchievementEntityCreator();
    private final String mName;
    private final int mState;
    private final int zzMG;
    private final String zzadH;
    private final String zzagT;
    private final Uri zzagU;
    private final String zzagV;
    private final Uri zzagW;
    private final String zzagX;
    private final int zzagY;
    private final String zzagZ;
    private final PlayerEntity zzaha;
    private final int zzahb;
    private final String zzahc;
    private final long zzahd;
    private final long zzahe;
    private final int zzzH;

}
