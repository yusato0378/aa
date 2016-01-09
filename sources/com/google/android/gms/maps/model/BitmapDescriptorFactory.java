// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.maps.model.internal.zzd;

// Referenced classes of package com.google.android.gms.maps.model:
//            BitmapDescriptor, RuntimeRemoteException

public final class BitmapDescriptorFactory
{

    private BitmapDescriptorFactory()
    {
    }

    public static BitmapDescriptor defaultMarker()
    {
        BitmapDescriptor bitmapdescriptor;
        try
        {
            bitmapdescriptor = new BitmapDescriptor(zztQ().zztX());
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return bitmapdescriptor;
    }

    public static BitmapDescriptor defaultMarker(float f)
    {
        BitmapDescriptor bitmapdescriptor;
        try
        {
            bitmapdescriptor = new BitmapDescriptor(zztQ().zzh(f));
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return bitmapdescriptor;
    }

    public static BitmapDescriptor fromAsset(String s)
    {
        try
        {
            s = new BitmapDescriptor(zztQ().zzcO(s));
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            throw new RuntimeRemoteException(s);
        }
        return s;
    }

    public static BitmapDescriptor fromBitmap(Bitmap bitmap)
    {
        try
        {
            bitmap = new BitmapDescriptor(zztQ().zzb(bitmap));
        }
        // Misplaced declaration of an exception variable
        catch(Bitmap bitmap)
        {
            throw new RuntimeRemoteException(bitmap);
        }
        return bitmap;
    }

    public static BitmapDescriptor fromFile(String s)
    {
        try
        {
            s = new BitmapDescriptor(zztQ().zzcP(s));
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            throw new RuntimeRemoteException(s);
        }
        return s;
    }

    public static BitmapDescriptor fromPath(String s)
    {
        try
        {
            s = new BitmapDescriptor(zztQ().zzcQ(s));
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            throw new RuntimeRemoteException(s);
        }
        return s;
    }

    public static BitmapDescriptor fromResource(int i)
    {
        BitmapDescriptor bitmapdescriptor;
        try
        {
            bitmapdescriptor = new BitmapDescriptor(zztQ().zzgB(i));
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return bitmapdescriptor;
    }

    public static void zza(zzd zzd1)
    {
        if(zzauS != null)
        {
            return;
        } else
        {
            zzauS = (zzd)zzv.zzr(zzd1);
            return;
        }
    }

    private static zzd zztQ()
    {
        return (zzd)zzv.zzb(zzauS, "IBitmapDescriptorFactory is not initialized");
    }

    public static final float HUE_AZURE = 210F;
    public static final float HUE_BLUE = 240F;
    public static final float HUE_CYAN = 180F;
    public static final float HUE_GREEN = 120F;
    public static final float HUE_MAGENTA = 300F;
    public static final float HUE_ORANGE = 30F;
    public static final float HUE_RED = 0F;
    public static final float HUE_ROSE = 330F;
    public static final float HUE_VIOLET = 270F;
    public static final float HUE_YELLOW = 60F;
    private static zzd zzauS;
}
