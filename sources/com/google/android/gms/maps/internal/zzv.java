// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.maps.internal:
//            IStreetViewPanoramaDelegate

public interface zzv
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzv
    {

        public static zzv zzbN(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
            if(iinterface != null && (iinterface instanceof zzv))
                return (zzv)iinterface;
            else
                return new zza(ibinder);
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            switch(i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
                zza(IStreetViewPanoramaDelegate.zza.zzbQ(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
        }
    }

    private static class zza.zza
        implements zzv
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zza(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
            if(istreetviewpanoramadelegate == null)
                break MISSING_BLOCK_LABEL_57;
            istreetviewpanoramadelegate = istreetviewpanoramadelegate.asBinder();
_L1:
            parcel.writeStrongBinder(istreetviewpanoramadelegate);
            zzlW.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            istreetviewpanoramadelegate = null;
              goto _L1
            istreetviewpanoramadelegate;
            parcel1.recycle();
            parcel.recycle();
            throw istreetviewpanoramadelegate;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void zza(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
        throws RemoteException;
}
