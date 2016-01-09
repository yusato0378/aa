// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model;


// Referenced classes of package com.google.android.gms.maps.model:
//            Tile

public interface TileProvider
{

    public abstract Tile getTile(int i, int j, int k);

    public static final Tile NO_TILE = new Tile(-1, -1, null);

}
