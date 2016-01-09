// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestEntity;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.internal.request:
//            GameRequestClusterCreator

public final class GameRequestCluster
    implements SafeParcelable, GameRequest
{

    GameRequestCluster(int i, ArrayList arraylist)
    {
        zzzH = i;
        zzamI = arraylist;
        zzrI();
    }

    private void zzrI()
    {
        GameRequest gamerequest;
        int i;
        int j;
        boolean flag;
        if(!zzamI.isEmpty())
            flag = true;
        else
            flag = false;
        zzb.zzP(flag);
        gamerequest = (GameRequest)zzamI.get(0);
        j = zzamI.size();
        i = 1;
        while(i < j) 
        {
            GameRequest gamerequest1 = (GameRequest)zzamI.get(i);
            if(gamerequest.getType() == gamerequest1.getType())
                flag = true;
            else
                flag = false;
            zzb.zza(flag, "All the requests must be of the same type");
            zzb.zza(gamerequest.getSender().equals(gamerequest1.getSender()), "All the requests must be from the same sender");
            i++;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(!(obj instanceof GameRequestCluster))
            return false;
        if(this == obj)
            return true;
        obj = (GameRequestCluster)obj;
        if(((GameRequestCluster) (obj)).zzamI.size() != zzamI.size())
            return false;
        int j = zzamI.size();
        for(int i = 0; i < j; i++)
            if(!((GameRequest)zzamI.get(i)).equals((GameRequest)((GameRequestCluster) (obj)).zzamI.get(i)))
                return false;

        return true;
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
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public byte[] getData()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public long getExpirationTimestamp()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public Game getGame()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int getRecipientStatus(String s)
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public List getRecipients()
    {
        return zzrX();
    }

    public String getRequestId()
    {
        return ((GameRequestEntity)zzamI.get(0)).getRequestId();
    }

    public Player getSender()
    {
        return ((GameRequestEntity)zzamI.get(0)).getSender();
    }

    public int getStatus()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int getType()
    {
        return ((GameRequestEntity)zzamI.get(0)).getType();
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(zzamI.toArray());
    }

    public boolean isConsumed(String s)
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public boolean isDataValid()
    {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GameRequestClusterCreator.zza(this, parcel, i);
    }

    public ArrayList zzrW()
    {
        return new ArrayList(zzamI);
    }

    public ArrayList zzrX()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public static final GameRequestClusterCreator CREATOR = new GameRequestClusterCreator();
    private final ArrayList zzamI;
    private final int zzzH;

}
