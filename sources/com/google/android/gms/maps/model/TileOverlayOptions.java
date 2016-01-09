// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model;

import android.os.*;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.internal.zzl;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzn, TileProvider, Tile

public final class TileOverlayOptions
    implements SafeParcelable
{

    public TileOverlayOptions()
    {
        zzave = true;
        zzavL = true;
        zzzH = 1;
    }

    TileOverlayOptions(int i, IBinder ibinder, boolean flag, float f, boolean flag1)
    {
        zzave = true;
        zzavL = true;
        zzzH = i;
        zzavJ = com.google.android.gms.maps.model.internal.zzl.zza.zzcd(ibinder);
        if(zzavJ == null)
            ibinder = null;
        else
            ibinder = new TileProvider() {

                public Tile getTile(int j, int k, int l)
                {
                    Tile tile;
                    try
                    {
                        tile = zzavM.getTile(j, k, l);
                    }
                    catch(RemoteException remoteexception)
                    {
                        return null;
                    }
                    return tile;
                }

                private final zzl zzavM;
                final TileOverlayOptions zzavN;

            
            {
                zzavN = TileOverlayOptions.this;
                super();
                zzavM = TileOverlayOptions.zza(zzavN);
            }
            }
;
        zzavK = ibinder;
        zzave = flag;
        zzavd = f;
        zzavL = flag1;
    }

    static zzl zza(TileOverlayOptions tileoverlayoptions)
    {
        return tileoverlayoptions.zzavJ;
    }

    public int describeContents()
    {
        return 0;
    }

    public TileOverlayOptions fadeIn(boolean flag)
    {
        zzavL = flag;
        return this;
    }

    public boolean getFadeIn()
    {
        return zzavL;
    }

    public TileProvider getTileProvider()
    {
        return zzavK;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public float getZIndex()
    {
        return zzavd;
    }

    public boolean isVisible()
    {
        return zzave;
    }

    public TileOverlayOptions tileProvider(TileProvider tileprovider)
    {
        zzavK = tileprovider;
        if(zzavK == null)
            tileprovider = null;
        else
            tileprovider = new com.google.android.gms.maps.model.internal.zzl.zza(tileprovider) {

                public Tile getTile(int i, int j, int k)
                {
                    return zzavO.getTile(i, j, k);
                }

                final TileOverlayOptions zzavN;
                final TileProvider zzavO;

            
            {
                zzavN = TileOverlayOptions.this;
                zzavO = tileprovider;
                super();
            }
            }
;
        zzavJ = tileprovider;
        return this;
    }

    public TileOverlayOptions visible(boolean flag)
    {
        zzave = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzn.zza(this, parcel, i);
    }

    public TileOverlayOptions zIndex(float f)
    {
        zzavd = f;
        return this;
    }

    IBinder zztU()
    {
        return zzavJ.asBinder();
    }

    public static final zzn CREATOR = new zzn();
    private zzl zzavJ;
    private TileProvider zzavK;
    private boolean zzavL;
    private float zzavd;
    private boolean zzave;
    private final int zzzH;

}
