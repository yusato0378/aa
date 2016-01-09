// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.experience;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.GameRef;

// Referenced classes of package com.google.android.gms.games.internal.experience:
//            ExperienceEvent

public final class ExperienceEventRef extends zzc
    implements ExperienceEvent
{

    public ExperienceEventRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
        if(zzbH("external_game_id"))
        {
            zzalO = null;
            return;
        } else
        {
            zzalO = new GameRef(zzPy, zzRw);
            return;
        }
    }

    public String getIconImageUrl()
    {
        return getString("icon_url");
    }

    private final GameRef zzalO;
}
