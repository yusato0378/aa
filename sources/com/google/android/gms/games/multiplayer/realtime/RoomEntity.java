// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.zzhu;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            Room, RoomEntityCreator

public final class RoomEntity extends GamesDowngradeableSafeParcel
    implements Room
{
    static final class RoomEntityCreatorCompat extends RoomEntityCreator
    {

        public Object createFromParcel(Parcel parcel)
        {
            return zzdv(parcel);
        }

        public RoomEntity zzdv(Parcel parcel)
        {
            if(RoomEntity.zzc(RoomEntity.zzpR()) || RoomEntity.zzcs(com/google/android/gms/games/multiplayer/realtime/RoomEntity.getCanonicalName()))
                return super.zzdv(parcel);
            String s = parcel.readString();
            String s1 = parcel.readString();
            long l1 = parcel.readLong();
            int j = parcel.readInt();
            String s2 = parcel.readString();
            int k = parcel.readInt();
            Bundle bundle = parcel.readBundle();
            int l = parcel.readInt();
            ArrayList arraylist = new ArrayList(l);
            for(int i = 0; i < l; i++)
                arraylist.add(ParticipantEntity.CREATOR.createFromParcel(parcel));

            return new RoomEntity(2, s, s1, l1, j, s2, k, bundle, arraylist, -1);
        }

        RoomEntityCreatorCompat()
        {
        }
    }


    RoomEntity(int i, String s, String s1, long l, int j, String s2, 
            int k, Bundle bundle, ArrayList arraylist, int i1)
    {
        zzzH = i;
        zzaih = s;
        zzanM = s1;
        zzanq = l;
        zzanN = j;
        zzadH = s2;
        zzanu = k;
        zzanK = bundle;
        zzant = arraylist;
        zzanO = i1;
    }

    public RoomEntity(Room room)
    {
        zzzH = 2;
        zzaih = room.getRoomId();
        zzanM = room.getCreatorId();
        zzanq = room.getCreationTimestamp();
        zzanN = room.getStatus();
        zzadH = room.getDescription();
        zzanu = room.getVariant();
        zzanK = room.getAutoMatchCriteria();
        ArrayList arraylist = room.getParticipants();
        int j = arraylist.size();
        zzant = new ArrayList(j);
        for(int i = 0; i < j; i++)
            zzant.add((ParticipantEntity)((Participant)arraylist.get(i)).freeze());

        zzanO = room.getAutoMatchWaitEstimateSeconds();
    }

    static int zza(Room room)
    {
        return zzu.hashCode(new Object[] {
            room.getRoomId(), room.getCreatorId(), Long.valueOf(room.getCreationTimestamp()), Integer.valueOf(room.getStatus()), room.getDescription(), Integer.valueOf(room.getVariant()), room.getAutoMatchCriteria(), room.getParticipants(), Integer.valueOf(room.getAutoMatchWaitEstimateSeconds())
        });
    }

    static int zza(Room room, String s)
    {
        ArrayList arraylist = room.getParticipants();
        int j = arraylist.size();
        for(int i = 0; i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            if(participant.getParticipantId().equals(s))
                return participant.getStatus();
        }

        throw new IllegalStateException((new StringBuilder()).append("Participant ").append(s).append(" is not in room ").append(room.getRoomId()).toString());
    }

    static boolean zza(Room room, Object obj)
    {
        boolean flag1 = true;
        if(obj instanceof Room) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(room == obj) goto _L4; else goto _L3
_L3:
        obj = (Room)obj;
        if(!zzu.equal(((Room) (obj)).getRoomId(), room.getRoomId()) || !zzu.equal(((Room) (obj)).getCreatorId(), room.getCreatorId()) || !zzu.equal(Long.valueOf(((Room) (obj)).getCreationTimestamp()), Long.valueOf(room.getCreationTimestamp())) || !zzu.equal(Integer.valueOf(((Room) (obj)).getStatus()), Integer.valueOf(room.getStatus())) || !zzu.equal(((Room) (obj)).getDescription(), room.getDescription()) || !zzu.equal(Integer.valueOf(((Room) (obj)).getVariant()), Integer.valueOf(room.getVariant())) || !zzu.equal(((Room) (obj)).getAutoMatchCriteria(), room.getAutoMatchCriteria()) || !zzu.equal(((Room) (obj)).getParticipants(), room.getParticipants()))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(Integer.valueOf(((Room) (obj)).getAutoMatchWaitEstimateSeconds()), Integer.valueOf(room.getAutoMatchWaitEstimateSeconds()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(Room room)
    {
        return zzu.zzq(room).zzg("RoomId", room.getRoomId()).zzg("CreatorId", room.getCreatorId()).zzg("CreationTimestamp", Long.valueOf(room.getCreationTimestamp())).zzg("RoomStatus", Integer.valueOf(room.getStatus())).zzg("Description", room.getDescription()).zzg("Variant", Integer.valueOf(room.getVariant())).zzg("AutoMatchCriteria", room.getAutoMatchCriteria()).zzg("Participants", room.getParticipants()).zzg("AutoMatchWaitEstimateSeconds", Integer.valueOf(room.getAutoMatchWaitEstimateSeconds())).toString();
    }

    static String zzb(Room room, String s)
    {
        room = room.getParticipants();
        int j = room.size();
        for(int i = 0; i < j; i++)
        {
            Participant participant = (Participant)room.get(i);
            Player player = participant.getPlayer();
            if(player != null && player.getPlayerId().equals(s))
                return participant.getParticipantId();
        }

        return null;
    }

    static Participant zzc(Room room, String s)
    {
        ArrayList arraylist = room.getParticipants();
        int j = arraylist.size();
        for(int i = 0; i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            if(participant.getParticipantId().equals(s))
                return participant;
        }

        throw new IllegalStateException((new StringBuilder()).append("Participant ").append(s).append(" is not in match ").append(room.getRoomId()).toString());
    }

    static ArrayList zzc(Room room)
    {
        room = room.getParticipants();
        int j = room.size();
        ArrayList arraylist = new ArrayList(j);
        for(int i = 0; i < j; i++)
            arraylist.add(((Participant)room.get(i)).getParticipantId());

        return arraylist;
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

    public Room freeze()
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

    public int getAutoMatchWaitEstimateSeconds()
    {
        return zzanO;
    }

    public long getCreationTimestamp()
    {
        return zzanq;
    }

    public String getCreatorId()
    {
        return zzanM;
    }

    public String getDescription()
    {
        return zzadH;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        zzhu.zzb(zzadH, chararraybuffer);
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

    public String getRoomId()
    {
        return zzaih;
    }

    public int getStatus()
    {
        return zzanN;
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
            RoomEntityCreator.zza(this, parcel, i);
        } else
        {
            parcel.writeString(zzaih);
            parcel.writeString(zzanM);
            parcel.writeLong(zzanq);
            parcel.writeInt(zzanN);
            parcel.writeString(zzadH);
            parcel.writeInt(zzanu);
            parcel.writeBundle(zzanK);
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

    public static final android.os.Parcelable.Creator CREATOR = new RoomEntityCreatorCompat();
    private final String zzadH;
    private final String zzaih;
    private final Bundle zzanK;
    private final String zzanM;
    private final int zzanN;
    private final int zzanO;
    private final long zzanq;
    private final ArrayList zzant;
    private final int zzanu;
    private final int zzzH;

}
