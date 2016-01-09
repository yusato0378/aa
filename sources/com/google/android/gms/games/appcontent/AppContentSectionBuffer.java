// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.appcontent;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentSectionRef, AppContentSection

public final class AppContentSectionBuffer extends zzf
{

    public void release()
    {
        super.release();
        int j = zzahx.size();
        for(int i = 1; i < j; i++)
        {
            DataHolder dataholder = (DataHolder)zzahx.get(i);
            if(dataholder != null)
                dataholder.close();
        }

    }

    protected Object zzh(int i, int j)
    {
        return zzk(i, j);
    }

    protected AppContentSection zzk(int i, int j)
    {
        return new AppContentSectionRef(zzahx, i, j);
    }

    protected String zzlt()
    {
        return "section_id";
    }

    protected String zzlv()
    {
        return "card_id";
    }

    private final ArrayList zzahx;
}
