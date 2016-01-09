// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Invitation, Participant, ParticipantEntity, InvitationEntityCreator

public final class InvitationEntity extends GamesDowngradeableSafeParcel
    implements Invitation
{
    static final class InvitationEntityCreatorCompat extends InvitationEntityCreator
    {

        public Object createFromParcel(Parcel parcel)
        {
            return zzds(parcel);
        }

        public InvitationEntity zzds(Parcel parcel)
        {
            if(InvitationEntity.zzc(InvitationEntity.zzpR()) || InvitationEntity.zzcs(com/google/android/gms/games/multiplayer/InvitationEntity.getCanonicalName()))
                return super.zzds(parcel);
            GameEntity gameentity = (GameEntity)GameEntity.CREATOR.createFromParcel(parcel);
            String s = parcel.readString();
            long l = parcel.readLong();
            int j = parcel.readInt();
            ParticipantEntity participantentity = (ParticipantEntity)ParticipantEntity.CREATOR.createFromParcel(parcel);
            int k = parcel.readInt();
            ArrayList arraylist = new ArrayList(k);
            for(int i = 0; i < k; i++)
                arraylist.add(ParticipantEntity.CREATOR.createFromParcel(parcel));

            return new InvitationEntity(2, gameentity, s, l, j, participantentity, arraylist, -1, 0);
        }

        InvitationEntityCreatorCompat()
        {
        }
    }


    InvitationEntity(int i, GameEntity gameentity, String s, long l, int j, ParticipantEntity participantentity, 
            ArrayList arraylist, int k, int i1)
    {
        zzzH = i;
        zzalP = gameentity;
        zzaif = s;
        zzanq = l;
        zzanr = j;
        zzans = participantentity;
        zzant = arraylist;
        zzanu = k;
        zzanv = i1;
    }

    InvitationEntity(Invitation invitation)
    {
        zzzH = 2;
        zzalP = new GameEntity(invitation.getGame());
        zzaif = invitation.getInvitationId();
        zzanq = invitation.getCreationTimestamp();
        zzanr = invitation.getInvitationType();
        zzanu = invitation.getVariant();
        zzanv = invitation.getAvailableAutoMatchSlots();
        String s = invitation.getInviter().getParticipantId();
        Object obj = null;
        ArrayList arraylist = invitation.getParticipants();
        int j = arraylist.size();
        zzant = new ArrayList(j);
        int i = 0;
        invitation = obj;
        for(; i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            if(participant.getParticipantId().equals(s))
                invitation = participant;
            zzant.add((ParticipantEntity)participant.freeze());
        }

        zzv.zzb(invitation, "Must have a valid inviter!");
        zzans = (ParticipantEntity)invitation.freeze();
    }

    static int zza(Invitation invitation)
    {
        return zzu.hashCode(new Object[] {
            invitation.getGame(), invitation.getInvitationId(), Long.valueOf(invitation.getCreationTimestamp()), Integer.valueOf(invitation.getInvitationType()), invitation.getInviter(), invitation.getParticipants(), Integer.valueOf(invitation.getVariant()), Integer.valueOf(invitation.getAvailableAutoMatchSlots())
        });
    }

    static boolean zza(Invitation invitation, Object obj)
    {
        boolean flag1 = true;
        if(obj instanceof Invitation) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(invitation == obj) goto _L4; else goto _L3
_L3:
        obj = (Invitation)obj;
        if(!zzu.equal(((Invitation) (obj)).getGame(), invitation.getGame()) || !zzu.equal(((Invitation) (obj)).getInvitationId(), invitation.getInvitationId()) || !zzu.equal(Long.valueOf(((Invitation) (obj)).getCreationTimestamp()), Long.valueOf(invitation.getCreationTimestamp())) || !zzu.equal(Integer.valueOf(((Invitation) (obj)).getInvitationType()), Integer.valueOf(invitation.getInvitationType())) || !zzu.equal(((Invitation) (obj)).getInviter(), invitation.getInviter()) || !zzu.equal(((Invitation) (obj)).getParticipants(), invitation.getParticipants()) || !zzu.equal(Integer.valueOf(((Invitation) (obj)).getVariant()), Integer.valueOf(invitation.getVariant())))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(Integer.valueOf(((Invitation) (obj)).getAvailableAutoMatchSlots()), Integer.valueOf(invitation.getAvailableAutoMatchSlots()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(Invitation invitation)
    {
        return zzu.zzq(invitation).zzg("Game", invitation.getGame()).zzg("InvitationId", invitation.getInvitationId()).zzg("CreationTimestamp", Long.valueOf(invitation.getCreationTimestamp())).zzg("InvitationType", Integer.valueOf(invitation.getInvitationType())).zzg("Inviter", invitation.getInviter()).zzg("Participants", invitation.getParticipants()).zzg("Variant", Integer.valueOf(invitation.getVariant())).zzg("AvailableAutoMatchSlots", Integer.valueOf(invitation.getAvailableAutoMatchSlots())).toString();
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

    public Invitation freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public int getAvailableAutoMatchSlots()
    {
        return zzanv;
    }

    public long getCreationTimestamp()
    {
        return zzanq;
    }

    public Game getGame()
    {
        return zzalP;
    }

    public String getInvitationId()
    {
        return zzaif;
    }

    public int getInvitationType()
    {
        return zzanr;
    }

    public Participant getInviter()
    {
        return zzans;
    }

    public ArrayList getParticipants()
    {
        return new ArrayList(zzant);
    }

    public int getVariant()
    {
        return zzanu;
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
            InvitationEntityCreator.zza(this, parcel, i);
        } else
        {
            zzalP.writeToParcel(parcel, i);
            parcel.writeString(zzaif);
            parcel.writeLong(zzanq);
            parcel.writeInt(zzanr);
            zzans.writeToParcel(parcel, i);
            int k = zzant.size();
            parcel.writeInt(k);
            int j = 0;
            while(j < k) 
            {
                ((ParticipantEntity)zzant.get(j)).writeToParcel(parcel, i);
                j++;
            }
        }
    }

    public static final android.os.Parcelable.Creator CREATOR = new InvitationEntityCreatorCompat();
    private final String zzaif;
    private final GameEntity zzalP;
    private final long zzanq;
    private final int zzanr;
    private final ParticipantEntity zzans;
    private final ArrayList zzant;
    private final int zzanu;
    private final int zzanv;
    private final int zzzH;

}
