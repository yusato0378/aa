// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.quest;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.games.quest:
//            Milestone, MilestoneEntityCreator

public final class MilestoneEntity
    implements SafeParcelable, Milestone
{

    MilestoneEntity(int i, String s, long l, long l1, byte abyte0[], 
            int j, String s1)
    {
        zzzH = i;
        zzaiM = s;
        zzaoe = l;
        zzaof = l1;
        zzaog = abyte0;
        mState = j;
        zzahE = s1;
    }

    public MilestoneEntity(Milestone milestone)
    {
        zzzH = 4;
        zzaiM = milestone.getMilestoneId();
        zzaoe = milestone.getCurrentProgress();
        zzaof = milestone.getTargetProgress();
        mState = milestone.getState();
        zzahE = milestone.getEventId();
        milestone = milestone.getCompletionRewardData();
        if(milestone == null)
        {
            zzaog = null;
            return;
        } else
        {
            zzaog = new byte[milestone.length];
            System.arraycopy(milestone, 0, zzaog, 0, milestone.length);
            return;
        }
    }

    static int zza(Milestone milestone)
    {
        return zzu.hashCode(new Object[] {
            milestone.getMilestoneId(), Long.valueOf(milestone.getCurrentProgress()), Long.valueOf(milestone.getTargetProgress()), Integer.valueOf(milestone.getState()), milestone.getEventId()
        });
    }

    static boolean zza(Milestone milestone, Object obj)
    {
        boolean flag1 = true;
        if(obj instanceof Milestone) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(milestone == obj) goto _L4; else goto _L3
_L3:
        obj = (Milestone)obj;
        if(!zzu.equal(((Milestone) (obj)).getMilestoneId(), milestone.getMilestoneId()) || !zzu.equal(Long.valueOf(((Milestone) (obj)).getCurrentProgress()), Long.valueOf(milestone.getCurrentProgress())) || !zzu.equal(Long.valueOf(((Milestone) (obj)).getTargetProgress()), Long.valueOf(milestone.getTargetProgress())) || !zzu.equal(Integer.valueOf(((Milestone) (obj)).getState()), Integer.valueOf(milestone.getState())))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(((Milestone) (obj)).getEventId(), milestone.getEventId())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(Milestone milestone)
    {
        return zzu.zzq(milestone).zzg("MilestoneId", milestone.getMilestoneId()).zzg("CurrentProgress", Long.valueOf(milestone.getCurrentProgress())).zzg("TargetProgress", Long.valueOf(milestone.getTargetProgress())).zzg("State", Integer.valueOf(milestone.getState())).zzg("CompletionRewardData", milestone.getCompletionRewardData()).zzg("EventId", milestone.getEventId()).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public Milestone freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public byte[] getCompletionRewardData()
    {
        return zzaog;
    }

    public long getCurrentProgress()
    {
        return zzaoe;
    }

    public String getEventId()
    {
        return zzahE;
    }

    public String getMilestoneId()
    {
        return zzaiM;
    }

    public int getState()
    {
        return mState;
    }

    public long getTargetProgress()
    {
        return zzaof;
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
        MilestoneEntityCreator.zza(this, parcel, i);
    }

    public static final MilestoneEntityCreator CREATOR = new MilestoneEntityCreator();
    private final int mState;
    private final String zzahE;
    private final String zzaiM;
    private final long zzaoe;
    private final long zzaof;
    private final byte zzaog[];
    private final int zzzH;

}
