// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps.internal:
//            zzc

public class zzy
{

    public zzy()
    {
    }

    private static Context getRemoteContext(Context context)
    {
        if(zzauP == null)
            if(zztN())
                zzauP = context.getApplicationContext();
            else
                zzauP = GooglePlayServicesUtil.getRemoteContext(context);
        return zzauP;
    }

    private static Object zza(ClassLoader classloader, String s)
    {
        try
        {
            classloader = ((ClassLoader) (zzc(((ClassLoader)zzv.zzr(classloader)).loadClass(s))));
        }
        // Misplaced declaration of an exception variable
        catch(ClassLoader classloader)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unable to find dynamic class ").append(s).toString());
        }
        return classloader;
    }

    public static zzc zzah(Context context)
        throws GooglePlayServicesNotAvailableException
    {
        zzv.zzr(context);
        if(zzauQ != null)
            return zzauQ;
        zzai(context);
        zzauQ = zzaj(context);
        try
        {
            zzauQ.zzb(zze.zzt(getRemoteContext(context).getResources()), 0x6fcd18);
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            throw new RuntimeRemoteException(context);
        }
        return zzauQ;
    }

    private static void zzai(Context context)
        throws GooglePlayServicesNotAvailableException
    {
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        switch(i)
        {
        default:
            throw new GooglePlayServicesNotAvailableException(i);

        case 0: // '\0'
            return;
        }
    }

    private static zzc zzaj(Context context)
    {
        if(zztN())
        {
            Log.i(com/google/android/gms/maps/internal/zzy.getSimpleName(), "Making Creator statically");
            return (zzc)zzc(zztO());
        } else
        {
            Log.i(com/google/android/gms/maps/internal/zzy.getSimpleName(), "Making Creator dynamically");
            return com.google.android.gms.maps.internal.zzc.zza.zzbq((IBinder)zza(getRemoteContext(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
        }
    }

    private static Object zzc(Class class1)
    {
        Object obj;
        try
        {
            obj = class1.newInstance();
        }
        catch(InstantiationException instantiationexception)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unable to instantiate the dynamic class ").append(class1.getName()).toString());
        }
        catch(IllegalAccessException illegalaccessexception)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unable to call the default constructor of ").append(class1.getName()).toString());
        }
        return obj;
    }

    public static boolean zztN()
    {
        return false;
    }

    private static Class zztO()
    {
        Class class1;
        try
        {
            if(android.os.Build.VERSION.SDK_INT < 15)
                return Class.forName("com.google.android.gms.maps.internal.CreatorImplGmm6");
            class1 = Class.forName("com.google.android.gms.maps.internal.CreatorImpl");
        }
        catch(ClassNotFoundException classnotfoundexception)
        {
            throw new RuntimeException(classnotfoundexception);
        }
        return class1;
    }

    private static Context zzauP;
    private static zzc zzauQ;
}
