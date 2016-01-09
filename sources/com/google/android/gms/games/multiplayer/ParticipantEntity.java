// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.zzhu;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Participant, ParticipantEntityCreator, ParticipantResult

public final class ParticipantEntity extends GamesDowngradeableSafeParcel
    implements Participant
{
    static final class ParticipantEntityCreatorCompat extends ParticipantEntityCreator
    {

        public Object createFromParcel(Parcel parcel)
        {
            return zzdt(parcel);
        }

        public ParticipantEntity zzdt(Parcel parcel)
        {
            boolean flag = true;
            if(ParticipantEntity.zzc(ParticipantEntity.zzpR()) || ParticipantEntity.zzcs(com/google/android/gms/games/multiplayer/ParticipantEntity.getCanonicalName()))
                return super.zzdt(parcel);
            String s = parcel.readString();
            String s1 = parcel.readString();
            Object obj = parcel.readString();
            Object obj1;
            String s2;
            int i;
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
            i = parcel.readInt();
            s2 = parcel.readString();
            if(parcel.readInt() > 0)
                flag1 = true;
            else
                flag1 = false;
            if(parcel.readInt() <= 0)
                flag = false;
            if(flag)
                parcel = (PlayerEntity)PlayerEntity.CREATOR.createFromParcel(parcel);
            else
                parcel = null;
            return new ParticipantEntity(3, s, s1, ((Uri) (obj)), ((Uri) (obj1)), i, s2, flag1, parcel, 7, null, null, null);
        }

        ParticipantEntityCreatorCompat()
        {
        }
    }


    ParticipantEntity(int i, String s, String s1, Uri uri, Uri uri1, int j, String s2, 
            boolean flag, PlayerEntity playerentity, int k, ParticipantResult participantresult, String s3, String s4)
    {
        zzzH = i;
        zzaiJ = s;
        zzWF = s1;
        zzafY = uri;
        zzafZ = uri1;
        zzue = j;
        zzahI = s2;
        zzanx = flag;
        zzaha = playerentity;
        zzMd = k;
        zzany = participantresult;
        zzagj = s3;
        zzagk = s4;
    }

    public ParticipantEntity(Participant participant)
    {
        zzzH = 3;
        zzaiJ = participant.getParticipantId();
        zzWF = participant.getDisplayName();
        zzafY = participant.getIconImageUri();
        zzafZ = participant.getHiResImageUri();
        zzue = participant.getStatus();
        zzahI = participant.zzqA();
        zzanx = participant.isConnectedToRoom();
        Object obj = participant.getPlayer();
        if(obj == null)
            obj = null;
        else
            obj = new PlayerEntity(((Player) (obj)));
        zzaha = ((PlayerEntity) (obj));
        zzMd = participant.getCapabilities();
        zzany = participant.getResult();
        zzagj = participant.getIconImageUrl();
        zzagk = participant.getHiResImageUrl();
    }

    static int zza(Participant participant)
    {
        return zzu.hashCode(new Object[] {
            participant.getPlayer(), Integer.valueOf(participant.getStatus()), participant.zzqA(), Boolean.valueOf(participant.isConnectedToRoom()), participant.getDisplayName(), participant.getIconImageUri(), participant.getHiResImageUri(), Integer.valueOf(participant.getCapabilities()), participant.getResult(), participant.getParticipantId()
        });
    }

    static boolean zza(Participant participant, Object obj)
    {
        boolean flag1 = true;
        if(obj instanceof Participant) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(participant == obj) goto _L4; else goto _L3
_L3:
        obj = (Participant)obj;
        if(!zzu.equal(((Participant) (obj)).getPlayer(), participant.getPlayer()) || !zzu.equal(Integer.valueOf(((Participant) (obj)).getStatus()), Integer.valueOf(participant.getStatus())) || !zzu.equal(((Participant) (obj)).zzqA(), participant.zzqA()) || !zzu.equal(Boolean.valueOf(((Participant) (obj)).isConnectedToRoom()), Boolean.valueOf(participant.isConnectedToRoom())) || !zzu.equal(((Participant) (obj)).getDisplayName(), participant.getDisplayName()) || !zzu.equal(((Participant) (obj)).getIconImageUri(), participant.getIconImageUri()) || !zzu.equal(((Participant) (obj)).getHiResImageUri(), participant.getHiResImageUri()) || !zzu.equal(Integer.valueOf(((Participant) (obj)).getCapabilities()), Integer.valueOf(participant.getCapabilities())) || !zzu.equal(((Participant) (obj)).getResult(), participant.getResult()))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(((Participant) (obj)).getParticipantId(), participant.getParticipantId())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(Participant participant)
    {
        return zzu.zzq(participant).zzg("ParticipantId", participant.getParticipantId()).zzg("Player", participant.getPlayer()).zzg("Status", Integer.valueOf(participant.getStatus())).zzg("ClientAddress", participant.zzqA()).zzg("ConnectedToRoom", Boolean.valueOf(participant.isConnectedToRoom())).zzg("DisplayName", participant.getDisplayName()).zzg("IconImage", participant.getIconImageUri()).zzg("IconImageUrl", participant.getIconImageUrl()).zzg("HiResImage", participant.getHiResImageUri()).zzg("HiResImageUrl", participant.getHiResImageUrl()).zzg("Capabilities", Integer.valueOf(participant.getCapabilities())).zzg("Result", participant.getResult()).toString();
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

    public Participant freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public int getCapabilities()
    {
        return zzMd;
    }

    public String getDisplayName()
    {
        if(zzaha == null)
            return zzWF;
        else
            return zzaha.getDisplayName();
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        if(zzaha == null)
        {
            zzhu.zzb(zzWF, chararraybuffer);
            return;
        } else
        {
            zzaha.getDisplayName(chararraybuffer);
            return;
        }
    }

    public Uri getHiResImageUri()
    {
        if(zzaha == null)
            return zzafZ;
        else
            return zzaha.getHiResImageUri();
    }

    public String getHiResImageUrl()
    {
        if(zzaha == null)
            return zzagk;
        else
            return zzaha.getHiResImageUrl();
    }

    public Uri getIconImageUri()
    {
        if(zzaha == null)
            return zzafY;
        else
            return zzaha.getIconImageUri();
    }

    public String getIconImageUrl()
    {
        if(zzaha == null)
            return zzagj;
        else
            return zzaha.getIconImageUrl();
    }

    public String getParticipantId()
    {
        return zzaiJ;
    }

    public Player getPlayer()
    {
        return zzaha;
    }

    public ParticipantResult getResult()
    {
        return zzany;
    }

    public int getStatus()
    {
        return zzue;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zza(this);
    }

    public boolean isConnectedToRoom()
    {
        return zzanx;
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
        Object obj = null;
        boolean flag = false;
        if(!zzlQ())
        {
            ParticipantEntityCreator.zza(this, parcel, i);
        } else
        {
            parcel.writeString(zzaiJ);
            parcel.writeString(zzWF);
            String s;
            int j;
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
            parcel.writeInt(zzue);
            parcel.writeString(zzahI);
            if(zzanx)
                j = 1;
            else
                j = 0;
            parcel.writeInt(j);
            if(zzaha == null)
                j = ((flag) ? 1 : 0);
            else
                j = 1;
            parcel.writeInt(j);
            if(zzaha != null)
            {
                zzaha.writeToParcel(parcel, i);
                return;
            }
        }
    }

    public String zzqA()
    {
        return zzahI;
    }

    public static final android.os.Parcelable.Creator CREATOR = new ParticipantEntityCreatorCompat();
    private final int zzMd;
    private final String zzWF;
    private final Uri zzafY;
    private final Uri zzafZ;
    private final String zzagj;
    private final String zzagk;
    private final String zzahI;
    private final PlayerEntity zzaha;
    private final String zzaiJ;
    private final boolean zzanx;
    private final ParticipantResult zzany;
    private final int zzue;
    private final int zzzH;

}
