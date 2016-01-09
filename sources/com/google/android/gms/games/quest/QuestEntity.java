// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.quest;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.zzhu;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.quest:
//            Quest, QuestEntityCreator, Milestone, MilestoneEntity

public final class QuestEntity
    implements SafeParcelable, Quest
{

    QuestEntity(int i, GameEntity gameentity, String s, long l, Uri uri, String s1, 
            String s2, long l1, long l2, Uri uri1, String s3, 
            String s4, long l3, long l4, int j, int k, 
            ArrayList arraylist)
    {
        zzzH = i;
        zzalP = gameentity;
        zzaoh = s;
        zzaoi = l;
        zzaoj = uri;
        zzaok = s1;
        zzadH = s2;
        zzaol = l1;
        zzahd = l2;
        zzaom = uri1;
        zzaon = s3;
        mName = s4;
        zzaoo = l3;
        zzaop = l4;
        mState = j;
        zzMG = k;
        zzaoq = arraylist;
    }

    public QuestEntity(Quest quest)
    {
        zzzH = 2;
        zzalP = new GameEntity(quest.getGame());
        zzaoh = quest.getQuestId();
        zzaoi = quest.getAcceptedTimestamp();
        zzadH = quest.getDescription();
        zzaoj = quest.getBannerImageUri();
        zzaok = quest.getBannerImageUrl();
        zzaol = quest.getEndTimestamp();
        zzaom = quest.getIconImageUri();
        zzaon = quest.getIconImageUrl();
        zzahd = quest.getLastUpdatedTimestamp();
        mName = quest.getName();
        zzaoo = quest.zzsk();
        zzaop = quest.getStartTimestamp();
        mState = quest.getState();
        zzMG = quest.getType();
        quest = quest.zzsj();
        int j = quest.size();
        zzaoq = new ArrayList(j);
        for(int i = 0; i < j; i++)
            zzaoq.add((MilestoneEntity)(MilestoneEntity)((Milestone)quest.get(i)).freeze());

    }

    static int zza(Quest quest)
    {
        return zzu.hashCode(new Object[] {
            quest.getGame(), quest.getQuestId(), Long.valueOf(quest.getAcceptedTimestamp()), quest.getBannerImageUri(), quest.getDescription(), Long.valueOf(quest.getEndTimestamp()), quest.getIconImageUri(), Long.valueOf(quest.getLastUpdatedTimestamp()), quest.zzsj(), quest.getName(), 
            Long.valueOf(quest.zzsk()), Long.valueOf(quest.getStartTimestamp()), Integer.valueOf(quest.getState())
        });
    }

    static boolean zza(Quest quest, Object obj)
    {
        boolean flag1 = true;
        if(obj instanceof Quest) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(quest == obj) goto _L4; else goto _L3
_L3:
        obj = (Quest)obj;
        if(!zzu.equal(((Quest) (obj)).getGame(), quest.getGame()) || !zzu.equal(((Quest) (obj)).getQuestId(), quest.getQuestId()) || !zzu.equal(Long.valueOf(((Quest) (obj)).getAcceptedTimestamp()), Long.valueOf(quest.getAcceptedTimestamp())) || !zzu.equal(((Quest) (obj)).getBannerImageUri(), quest.getBannerImageUri()) || !zzu.equal(((Quest) (obj)).getDescription(), quest.getDescription()) || !zzu.equal(Long.valueOf(((Quest) (obj)).getEndTimestamp()), Long.valueOf(quest.getEndTimestamp())) || !zzu.equal(((Quest) (obj)).getIconImageUri(), quest.getIconImageUri()) || !zzu.equal(Long.valueOf(((Quest) (obj)).getLastUpdatedTimestamp()), Long.valueOf(quest.getLastUpdatedTimestamp())) || !zzu.equal(((Quest) (obj)).zzsj(), quest.zzsj()) || !zzu.equal(((Quest) (obj)).getName(), quest.getName()) || !zzu.equal(Long.valueOf(((Quest) (obj)).zzsk()), Long.valueOf(quest.zzsk())) || !zzu.equal(Long.valueOf(((Quest) (obj)).getStartTimestamp()), Long.valueOf(quest.getStartTimestamp())))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(Integer.valueOf(((Quest) (obj)).getState()), Integer.valueOf(quest.getState()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(Quest quest)
    {
        return zzu.zzq(quest).zzg("Game", quest.getGame()).zzg("QuestId", quest.getQuestId()).zzg("AcceptedTimestamp", Long.valueOf(quest.getAcceptedTimestamp())).zzg("BannerImageUri", quest.getBannerImageUri()).zzg("BannerImageUrl", quest.getBannerImageUrl()).zzg("Description", quest.getDescription()).zzg("EndTimestamp", Long.valueOf(quest.getEndTimestamp())).zzg("IconImageUri", quest.getIconImageUri()).zzg("IconImageUrl", quest.getIconImageUrl()).zzg("LastUpdatedTimestamp", Long.valueOf(quest.getLastUpdatedTimestamp())).zzg("Milestones", quest.zzsj()).zzg("Name", quest.getName()).zzg("NotifyTimestamp", Long.valueOf(quest.zzsk())).zzg("StartTimestamp", Long.valueOf(quest.getStartTimestamp())).zzg("State", Integer.valueOf(quest.getState())).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public Quest freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public long getAcceptedTimestamp()
    {
        return zzaoi;
    }

    public Uri getBannerImageUri()
    {
        return zzaoj;
    }

    public String getBannerImageUrl()
    {
        return zzaok;
    }

    public Milestone getCurrentMilestone()
    {
        return (Milestone)zzsj().get(0);
    }

    public String getDescription()
    {
        return zzadH;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        zzhu.zzb(zzadH, chararraybuffer);
    }

    public long getEndTimestamp()
    {
        return zzaol;
    }

    public Game getGame()
    {
        return zzalP;
    }

    public Uri getIconImageUri()
    {
        return zzaom;
    }

    public String getIconImageUrl()
    {
        return zzaon;
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

    public String getQuestId()
    {
        return zzaoh;
    }

    public long getStartTimestamp()
    {
        return zzaop;
    }

    public int getState()
    {
        return mState;
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

    public boolean isEndingSoon()
    {
        return zzaoo <= System.currentTimeMillis() + 0x1b7740L;
    }

    public String toString()
    {
        return zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        QuestEntityCreator.zza(this, parcel, i);
    }

    public List zzsj()
    {
        return new ArrayList(zzaoq);
    }

    public long zzsk()
    {
        return zzaoo;
    }

    public static final QuestEntityCreator CREATOR = new QuestEntityCreator();
    private final String mName;
    private final int mState;
    private final int zzMG;
    private final String zzadH;
    private final long zzahd;
    private final GameEntity zzalP;
    private final String zzaoh;
    private final long zzaoi;
    private final Uri zzaoj;
    private final String zzaok;
    private final long zzaol;
    private final Uri zzaom;
    private final String zzaon;
    private final long zzaoo;
    private final long zzaop;
    private final ArrayList zzaoq;
    private final int zzzH;

}
