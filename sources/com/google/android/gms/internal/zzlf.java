// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.*;

// Referenced classes of package com.google.android.gms.internal:
//            zzle

public interface zzlf
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzlf
    {

        public static zzlf zzcr(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.panorama.internal.IPanoramaService");
            if(iinterface != null && (iinterface instanceof zzlf))
                return (zzlf)iinterface;
            else
                return new zza(ibinder);
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            zzle zzle;
            switch(i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.panorama.internal.IPanoramaService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.panorama.internal.IPanoramaService");
                zzle = com.google.android.gms.internal.zzle.zza.zzcq(parcel.readStrongBinder());
                break;
            }
            Bundle bundle;
            boolean flag;
            if(parcel.readInt() != 0)
                parcel1 = (Uri)Uri.CREATOR.createFromParcel(parcel);
            else
                parcel1 = null;
            if(parcel.readInt() != 0)
                bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            else
                bundle = null;
            if(parcel.readInt() != 0)
                flag = true;
            else
                flag = false;
            zza(zzle, parcel1, bundle, flag);
            return true;
        }
    }

    private static class zza.zza
        implements zzlf
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zza(zzle zzle1, Uri uri, Bundle bundle, boolean flag)
            throws RemoteException
        {
            IBinder ibinder;
            Parcel parcel;
            int i;
            ibinder = null;
            i = 1;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.panorama.internal.IPanoramaService");
            if(zzle1 == null)
                break MISSING_BLOCK_LABEL_30;
            ibinder = zzle1.asBinder();
            parcel.writeStrongBinder(ibinder);
            if(uri == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L5:
            if(bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
            break MISSING_BLOCK_LABEL_128;
_L6:
            parcel.writeInt(i);
            zzlW.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L5
            zzle1;
            parcel.recycle();
            throw zzle1;
_L4:
            parcel.writeInt(0);
            while(!flag) 
            {
                i = 0;
                break;
            }
              goto _L6
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void zza(zzle zzle, Uri uri, Bundle bundle, boolean flag)
        throws RemoteException;
}
