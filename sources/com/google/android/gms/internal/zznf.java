// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.*;

public interface zznf
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zznf
    {

        public static zznf zzcN(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletInternalServiceCallbacks");
            if(iinterface != null && (iinterface instanceof zznf))
                return (zznf)iinterface;
            else
                return new zza(ibinder);
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            switch(i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.wallet.internal.IWalletInternalServiceCallbacks");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletInternalServiceCallbacks");
                i = parcel.readInt();
                j = parcel.readInt();
                break;
            }
            if(parcel.readInt() != 0)
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            else
                parcel = null;
            zzb(i, j, parcel);
            parcel1.writeNoException();
            return true;
        }
    }

    private static class zza.zza
        implements zznf
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zzb(int i, int j, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletInternalServiceCallbacks");
            parcel.writeInt(i);
            parcel.writeInt(j);
            if(bundle == null)
                break MISSING_BLOCK_LABEL_78;
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bundle;
            parcel1.recycle();
            parcel.recycle();
            throw bundle;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void zzb(int i, int j, Bundle bundle)
        throws RemoteException;
}
