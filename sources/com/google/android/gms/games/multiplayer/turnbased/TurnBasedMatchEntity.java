// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.multiplayer.turnbased;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.*;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.zzhu;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatch, TurnBasedMatchEntityCreator

public final class TurnBasedMatchEntity
    implements SafeParcelable, TurnBasedMatch
{

    TurnBasedMatchEntity(int i, GameEntity gameentity, String s, String s1, long l, String s2, 
            long l1, String s3, int j, int k, int i1, byte abyte0[], 
            ArrayList arraylist, String s4, byte abyte1[], int j1, Bundle bundle, int k1, boolean flag, 
            String s5, String s6)
    {
        zzzH = i;
        zzalP = gameentity;
        zzaiA = s;
        zzanM = s1;
        zzanq = l;
        zzanU = s2;
        zzahd = l1;
        zzanV = s3;
        zzanW = j;
        zzaob = k1;
        zzanu = k;
        zzKu = i1;
        zzanX = abyte0;
        zzant = arraylist;
        zzanY = s4;
        zzanZ = abyte1;
        zzaoa = j1;
        zzanK = bundle;
        zzaoc = flag;
        zzadH = s5;
        zzaod = s6;
    }

    public TurnBasedMatchEntity(TurnBasedMatch turnbasedmatch)
    {
        zzzH = 2;
        zzalP = new GameEntity(turnbasedmatch.getGame());
        zzaiA = turnbasedmatch.getMatchId();
        zzanM = turnbasedmatch.getCreatorId();
        zzanq = turnbasedmatch.getCreationTimestamp();
        zzanU = turnbasedmatch.getLastUpdaterId();
        zzahd = turnbasedmatch.getLastUpdatedTimestamp();
        zzanV = turnbasedmatch.getPendingParticipantId();
        zzanW = turnbasedmatch.getStatus();
        zzaob = turnbasedmatch.getTurnStatus();
        zzanu = turnbasedmatch.getVariant();
        zzKu = turnbasedmatch.getVersion();
        zzanY = turnbasedmatch.getRematchId();
        zzaoa = turnbasedmatch.getMatchNumber();
        zzanK = turnbasedmatch.getAutoMatchCriteria();
        zzaoc = turnbasedmatch.isLocallyModified();
        zzadH = turnbasedmatch.getDescription();
        zzaod = turnbasedmatch.getDescriptionParticipantId();
        byte abyte0[] = turnbasedmatch.getData();
        int j;
        if(abyte0 == null)
        {
            zzanX = null;
        } else
        {
            zzanX = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, zzanX, 0, abyte0.length);
        }
        abyte0 = turnbasedmatch.getPreviousMatchData();
        if(abyte0 == null)
        {
            zzanZ = null;
        } else
        {
            zzanZ = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, zzanZ, 0, abyte0.length);
        }
        turnbasedmatch = turnbasedmatch.getParticipants();
        j = turnbasedmatch.size();
        zzant = new ArrayList(j);
        for(int i = 0; i < j; i++)
            zzant.add((ParticipantEntity)(ParticipantEntity)((Participant)turnbasedmatch.get(i)).freeze());

    }

    static int zza(TurnBasedMatch turnbasedmatch)
    {
        return zzu.hashCode(new Object[] {
            turnbasedmatch.getGame(), turnbasedmatch.getMatchId(), turnbasedmatch.getCreatorId(), Long.valueOf(turnbasedmatch.getCreationTimestamp()), turnbasedmatch.getLastUpdaterId(), Long.valueOf(turnbasedmatch.getLastUpdatedTimestamp()), turnbasedmatch.getPendingParticipantId(), Integer.valueOf(turnbasedmatch.getStatus()), Integer.valueOf(turnbasedmatch.getTurnStatus()), turnbasedmatch.getDescription(), 
            Integer.valueOf(turnbasedmatch.getVariant()), Integer.valueOf(turnbasedmatch.getVersion()), turnbasedmatch.getParticipants(), turnbasedmatch.getRematchId(), Integer.valueOf(turnbasedmatch.getMatchNumber()), turnbasedmatch.getAutoMatchCriteria(), Integer.valueOf(turnbasedmatch.getAvailableAutoMatchSlots()), Boolean.valueOf(turnbasedmatch.isLocallyModified())
        });
    }

    static int zza(TurnBasedMatch turnbasedmatch, String s)
    {
        ArrayList arraylist = turnbasedmatch.getParticipants();
        int j = arraylist.size();
        for(int i = 0; i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            if(participant.getParticipantId().equals(s))
                return participant.getStatus();
        }

        throw new IllegalStateException((new StringBuilder()).append("Participant ").append(s).append(" is not in match ").append(turnbasedmatch.getMatchId()).toString());
    }

    static boolean zza(TurnBasedMatch turnbasedmatch, Object obj)
    {
        boolean flag1 = true;
        if(obj instanceof TurnBasedMatch) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(turnbasedmatch == obj) goto _L4; else goto _L3
_L3:
        obj = (TurnBasedMatch)obj;
        if(!zzu.equal(((TurnBasedMatch) (obj)).getGame(), turnbasedmatch.getGame()) || !zzu.equal(((TurnBasedMatch) (obj)).getMatchId(), turnbasedmatch.getMatchId()) || !zzu.equal(((TurnBasedMatch) (obj)).getCreatorId(), turnbasedmatch.getCreatorId()) || !zzu.equal(Long.valueOf(((TurnBasedMatch) (obj)).getCreationTimestamp()), Long.valueOf(turnbasedmatch.getCreationTimestamp())) || !zzu.equal(((TurnBasedMatch) (obj)).getLastUpdaterId(), turnbasedmatch.getLastUpdaterId()) || !zzu.equal(Long.valueOf(((TurnBasedMatch) (obj)).getLastUpdatedTimestamp()), Long.valueOf(turnbasedmatch.getLastUpdatedTimestamp())) || !zzu.equal(((TurnBasedMatch) (obj)).getPendingParticipantId(), turnbasedmatch.getPendingParticipantId()) || !zzu.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getStatus()), Integer.valueOf(turnbasedmatch.getStatus())) || !zzu.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getTurnStatus()), Integer.valueOf(turnbasedmatch.getTurnStatus())) || !zzu.equal(((TurnBasedMatch) (obj)).getDescription(), turnbasedmatch.getDescription()) || !zzu.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getVariant()), Integer.valueOf(turnbasedmatch.getVariant())) || !zzu.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getVersion()), Integer.valueOf(turnbasedmatch.getVersion())) || !zzu.equal(((TurnBasedMatch) (obj)).getParticipants(), turnbasedmatch.getParticipants()) || !zzu.equal(((TurnBasedMatch) (obj)).getRematchId(), turnbasedmatch.getRematchId()) || !zzu.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getMatchNumber()), Integer.valueOf(turnbasedmatch.getMatchNumber())) || !zzu.equal(((TurnBasedMatch) (obj)).getAutoMatchCriteria(), turnbasedmatch.getAutoMatchCriteria()) || !zzu.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getAvailableAutoMatchSlots()), Integer.valueOf(turnbasedmatch.getAvailableAutoMatchSlots())))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(Boolean.valueOf(((TurnBasedMatch) (obj)).isLocallyModified()), Boolean.valueOf(turnbasedmatch.isLocallyModified()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(TurnBasedMatch turnbasedmatch)
    {
        return zzu.zzq(turnbasedmatch).zzg("Game", turnbasedmatch.getGame()).zzg("MatchId", turnbasedmatch.getMatchId()).zzg("CreatorId", turnbasedmatch.getCreatorId()).zzg("CreationTimestamp", Long.valueOf(turnbasedmatch.getCreationTimestamp())).zzg("LastUpdaterId", turnbasedmatch.getLastUpdaterId()).zzg("LastUpdatedTimestamp", Long.valueOf(turnbasedmatch.getLastUpdatedTimestamp())).zzg("PendingParticipantId", turnbasedmatch.getPendingParticipantId()).zzg("MatchStatus", Integer.valueOf(turnbasedmatch.getStatus())).zzg("TurnStatus", Integer.valueOf(turnbasedmatch.getTurnStatus())).zzg("Description", turnbasedmatch.getDescription()).zzg("Variant", Integer.valueOf(turnbasedmatch.getVariant())).zzg("Data", turnbasedmatch.getData()).zzg("Version", Integer.valueOf(turnbasedmatch.getVersion())).zzg("Participants", turnbasedmatch.getParticipants()).zzg("RematchId", turnbasedmatch.getRematchId()).zzg("PreviousData", turnbasedmatch.getPreviousMatchData()).zzg("MatchNumber", Integer.valueOf(turnbasedmatch.getMatchNumber())).zzg("AutoMatchCriteria", turnbasedmatch.getAutoMatchCriteria()).zzg("AvailableAutoMatchSlots", Integer.valueOf(turnbasedmatch.getAvailableAutoMatchSlots())).zzg("LocallyModified", Boolean.valueOf(turnbasedmatch.isLocallyModified())).zzg("DescriptionParticipantId", turnbasedmatch.getDescriptionParticipantId()).toString();
    }

    static String zzb(TurnBasedMatch turnbasedmatch, String s)
    {
        turnbasedmatch = turnbasedmatch.getParticipants();
        int j = turnbasedmatch.size();
        for(int i = 0; i < j; i++)
        {
            Participant participant = (Participant)turnbasedmatch.get(i);
            Player player = participant.getPlayer();
            if(player != null && player.getPlayerId().equals(s))
                return participant.getParticipantId();
        }

        return null;
    }

    static Participant zzc(TurnBasedMatch turnbasedmatch, String s)
    {
        ArrayList arraylist = turnbasedmatch.getParticipants();
        int j = arraylist.size();
        for(int i = 0; i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            if(participant.getParticipantId().equals(s))
                return participant;
        }

        throw new IllegalStateException((new StringBuilder()).append("Participant ").append(s).append(" is not in match ").append(turnbasedmatch.getMatchId()).toString());
    }

    static ArrayList zzc(TurnBasedMatch turnbasedmatch)
    {
        turnbasedmatch = turnbasedmatch.getParticipants();
        int j = turnbasedmatch.size();
        ArrayList arraylist = new ArrayList(j);
        for(int i = 0; i < j; i++)
            arraylist.add(((Participant)turnbasedmatch.get(i)).getParticipantId());

        return arraylist;
    }

    public boolean canRematch()
    {
        return zzanW == 2 && zzanY == null;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public TurnBasedMatch freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public Bundle getAutoMatchCriteria()
    {
        return zzanK;
    }

    public int getAvailableAutoMatchSlots()
    {
        if(zzanK == null)
            return 0;
        else
            return zzanK.getInt("max_automatch_players");
    }

    public long getCreationTimestamp()
    {
        return zzanq;
    }

    public String getCreatorId()
    {
        return zzanM;
    }

    public byte[] getData()
    {
        return zzanX;
    }

    public String getDescription()
    {
        return zzadH;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        zzhu.zzb(zzadH, chararraybuffer);
    }

    public Participant getDescriptionParticipant()
    {
        String s = getDescriptionParticipantId();
        if(s == null)
            return null;
        else
            return getParticipant(s);
    }

    public String getDescriptionParticipantId()
    {
        return zzaod;
    }

    public Game getGame()
    {
        return zzalP;
    }

    public long getLastUpdatedTimestamp()
    {
        return zzahd;
    }

    public String getLastUpdaterId()
    {
        return zzanU;
    }

    public String getMatchId()
    {
        return zzaiA;
    }

    public int getMatchNumber()
    {
        return zzaoa;
    }

    public Participant getParticipant(String s)
    {
        return zzc(this, s);
    }

    public String getParticipantId(String s)
    {
        return zzb(this, s);
    }

    public ArrayList getParticipantIds()
    {
        return zzc(this);
    }

    public int getParticipantStatus(String s)
    {
        return zza(this, s);
    }

    public ArrayList getParticipants()
    {
        return new ArrayList(zzant);
    }

    public String getPendingParticipantId()
    {
        return zzanV;
    }

    public byte[] getPreviousMatchData()
    {
        return zzanZ;
    }

    public String getRematchId()
    {
        return zzanY;
    }

    public int getStatus()
    {
        return zzanW;
    }

    public int getTurnStatus()
    {
        return zzaob;
    }

    public int getVariant()
    {
        return zzanu;
    }

    public int getVersion()
    {
        return zzKu;
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

    public boolean isLocallyModified()
    {
        return zzaoc;
    }

    public String toString()
    {
        return zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        TurnBasedMatchEntityCreator.zza(this, parcel, i);
    }

    public static final TurnBasedMatchEntityCreator CREATOR = new TurnBasedMatchEntityCreator();
    private final int zzKu;
    private final String zzadH;
    private final long zzahd;
    private final String zzaiA;
    private final GameEntity zzalP;
    private final Bundle zzanK;
    private final String zzanM;
    private final String zzanU;
    private final String zzanV;
    private final int zzanW;
    private final byte zzanX[];
    private final String zzanY;
    private final byte zzanZ[];
    private final long zzanq;
    private final ArrayList zzant;
    private final int zzanu;
    private final int zzaoa;
    private final int zzaob;
    private final boolean zzaoc;
    private final String zzaod;
    private final int zzzH;

}
