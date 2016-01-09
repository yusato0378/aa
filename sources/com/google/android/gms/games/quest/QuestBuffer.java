// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.quest;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

// Referenced classes of package com.google.android.gms.games.quest:
//            QuestRef, Quest

public final class QuestBuffer extends zzf
{

    public QuestBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    protected Object zzh(int i, int j)
    {
        return zzq(i, j);
    }

    protected String zzlt()
    {
        return "external_quest_id";
    }

    protected Quest zzq(int i, int j)
    {
        return new QuestRef(zzPy, i, j);
    }
}
