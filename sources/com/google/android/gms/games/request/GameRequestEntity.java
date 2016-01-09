// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.request;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.games.request:
//            GameRequest, GameRequestEntityCreator

public final class GameRequestEntity
    implements SafeParcelable, GameRequest
{

    GameRequestEntity(int i, GameEntity gameentity, PlayerEntity playerentity, byte abyte0[], String s, ArrayList arraylist, int j, 
            long l, long l1, Bundle bundle, int k)
    {
        zzzH = i;
        zzalP = gameentity;
        zzaor = playerentity;
        zzanX = abyte0;
        zzAu = s;
        zzaos = arraylist;
        zzMG = j;
        zzanq = l;
        zzaot = l1;
        zzaou = bundle;
        zzue = k;
    }

    public GameRequestEntity(GameRequest gamerequest)
    {
        zzzH = 2;
        zzalP = new GameEntity(gamerequest.getGame());
        zzaor = new PlayerEntity(gamerequest.getSender());
        zzAu = gamerequest.getRequestId();
        zzMG = gamerequest.getType();
        zzanq = gamerequest.getCreationTimestamp();
        zzaot = gamerequest.getExpirationTimestamp();
        zzue = gamerequest.getStatus();
        Object obj = gamerequest.getData();
        int j;
        if(obj == null)
        {
            zzanX = null;
        } else
        {
            zzanX = new byte[obj.length];
            System.arraycopy(obj, 0, zzanX, 0, obj.length);
        }
        obj = gamerequest.getRecipients();
        j = ((List) (obj)).size();
        zzaos = new ArrayList(j);
        zzaou = new Bundle();
        for(int i = 0; i < j; i++)
        {
            Player player = (Player)((Player)((List) (obj)).get(i)).freeze();
            String s = player.getPlayerId();
            zzaos.add((PlayerEntity)player);
            zzaou.putInt(s, gamerequest.getRecipientStatus(s));
        }

    }

    static int zza(GameRequest gamerequest)
    {
        return zzu.hashCode(new Object[] {
            gamerequest.getGame(), gamerequest.getRecipients(), gamerequest.getRequestId(), gamerequest.getSender(), zzb(gamerequest), Integer.valueOf(gamerequest.getType()), Long.valueOf(gamerequest.getCreationTimestamp()), Long.valueOf(gamerequest.getExpirationTimestamp())
        });
    }

    static boolean zza(GameRequest gamerequest, Object obj)
    {
        boolean flag1 = true;
        if(obj instanceof GameRequest) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(gamerequest == obj) goto _L4; else goto _L3
_L3:
        obj = (GameRequest)obj;
        if(!zzu.equal(((GameRequest) (obj)).getGame(), gamerequest.getGame()) || !zzu.equal(((GameRequest) (obj)).getRecipients(), gamerequest.getRecipients()) || !zzu.equal(((GameRequest) (obj)).getRequestId(), gamerequest.getRequestId()) || !zzu.equal(((GameRequest) (obj)).getSender(), gamerequest.getSender()) || !Arrays.equals(zzb(((GameRequest) (obj))), zzb(gamerequest)) || !zzu.equal(Integer.valueOf(((GameRequest) (obj)).getType()), Integer.valueOf(gamerequest.getType())) || !zzu.equal(Long.valueOf(((GameRequest) (obj)).getCreationTimestamp()), Long.valueOf(gamerequest.getCreationTimestamp())))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(Long.valueOf(((GameRequest) (obj)).getExpirationTimestamp()), Long.valueOf(gamerequest.getExpirationTimestamp()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    private static int[] zzb(GameRequest gamerequest)
    {
        List list = gamerequest.getRecipients();
        int j = list.size();
        int ai[] = new int[j];
        for(int i = 0; i < j; i++)
            ai[i] = gamerequest.getRecipientStatus(((Player)list.get(i)).getPlayerId());

        return ai;
    }

    static String zzc(GameRequest gamerequest)
    {
        return zzu.zzq(gamerequest).zzg("Game", gamerequest.getGame()).zzg("Sender", gamerequest.getSender()).zzg("Recipients", gamerequest.getRecipients()).zzg("Data", gamerequest.getData()).zzg("RequestId", gamerequest.getRequestId()).zzg("Type", Integer.valueOf(gamerequest.getType())).zzg("CreationTimestamp", Long.valueOf(gamerequest.getCreationTimestamp())).zzg("ExpirationTimestamp", Long.valueOf(gamerequest.getExpirationTimestamp())).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public GameRequest freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public long getCreationTimestamp()
    {
        return zzanq;
    }

    public byte[] getData()
    {
        return zzanX;
    }

    public long getExpirationTimestamp()
    {
        return zzaot;
    }

    public Game getGame()
    {
        return zzalP;
    }

    public int getRecipientStatus(String s)
    {
        return zzaou.getInt(s, 0);
    }

    public List getRecipients()
    {
        return new ArrayList(zzaos);
    }

    public String getRequestId()
    {
        return zzAu;
    }

    public Player getSender()
    {
        return zzaor;
    }

    public int getStatus()
    {
        return zzue;
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

    public boolean isConsumed(String s)
    {
        return getRecipientStatus(s) == 1;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return zzc(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GameRequestEntityCreator.zza(this, parcel, i);
    }

    public Bundle zzsl()
    {
        return zzaou;
    }

    public static final GameRequestEntityCreator CREATOR = new GameRequestEntityCreator();
    private final String zzAu;
    private final int zzMG;
    private final GameEntity zzalP;
    private final byte zzanX[];
    private final long zzanq;
    private final PlayerEntity zzaor;
    private final ArrayList zzaos;
    private final long zzaot;
    private final Bundle zzaou;
    private final int zzue;
    private final int zzzH;

}
