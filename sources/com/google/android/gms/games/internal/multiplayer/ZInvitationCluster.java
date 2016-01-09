// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.*;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.internal.multiplayer:
//            InvitationClusterCreator

public final class ZInvitationCluster
    implements SafeParcelable, Invitation
{

    ZInvitationCluster(int i, ArrayList arraylist)
    {
        zzzH = i;
        zzamb = arraylist;
        zzrI();
    }

    private void zzrI()
    {
        Invitation invitation;
        int j;
        boolean flag;
        if(!zzamb.isEmpty())
            flag = true;
        else
            flag = false;
        zzb.zzP(flag);
        invitation = (Invitation)zzamb.get(0);
        j = zzamb.size();
        for(int i = 1; i < j; i++)
        {
            Invitation invitation1 = (Invitation)zzamb.get(i);
            zzb.zza(invitation.getInviter().equals(invitation1.getInviter()), "All the invitations must be from the same inviter");
        }

    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(!(obj instanceof ZInvitationCluster))
            return false;
        if(this == obj)
            return true;
        obj = (ZInvitationCluster)obj;
        if(((ZInvitationCluster) (obj)).zzamb.size() != zzamb.size())
            return false;
        int j = zzamb.size();
        for(int i = 0; i < j; i++)
            if(!((Invitation)zzamb.get(i)).equals((Invitation)((ZInvitationCluster) (obj)).zzamb.get(i)))
                return false;

        return true;
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
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public long getCreationTimestamp()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public Game getGame()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public String getInvitationId()
    {
        return ((InvitationEntity)zzamb.get(0)).getInvitationId();
    }

    public int getInvitationType()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public Participant getInviter()
    {
        return ((InvitationEntity)zzamb.get(0)).getInviter();
    }

    public ArrayList getParticipants()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int getVariant()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(zzamb.toArray());
    }

    public boolean isDataValid()
    {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        InvitationClusterCreator.zza(this, parcel, i);
    }

    public ArrayList zzrJ()
    {
        return new ArrayList(zzamb);
    }

    public static final InvitationClusterCreator CREATOR = new InvitationClusterCreator();
    private final ArrayList zzamb;
    private final int zzzH;

}
