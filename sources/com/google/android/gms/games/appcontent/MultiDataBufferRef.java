// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.appcontent;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import java.util.ArrayList;

public abstract class MultiDataBufferRef extends zzc
{

    protected MultiDataBufferRef(ArrayList arraylist, int i, int j)
    {
        super((DataHolder)arraylist.get(i), j);
        zzahx = arraylist;
    }

    protected final ArrayList zzahx;
}
