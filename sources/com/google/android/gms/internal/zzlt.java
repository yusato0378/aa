// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal:
//            zzls

public interface zzlt
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzlt
    {

        public static zzlt zzcB(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
            if(iinterface != null && (iinterface instanceof zzlt))
                return (zzlt)iinterface;
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
                parcel1.writeString("com.google.android.gms.safetynet.internal.ISafetyNetService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
                zza(zzls.zza.zzcA(parcel.readStrongBinder()), parcel.createByteArray());
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
                zza(zzls.zza.zzcA(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }
    }

    private static class zza.zza
        implements zzlt
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zza(zzls zzls1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
            if(zzls1 == null)
                break MISSING_BLOCK_LABEL_57;
            zzls1 = zzls1.asBinder();
_L1:
            parcel.writeStrongBinder(zzls1);
            zzlW.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzls1 = null;
              goto _L1
            zzls1;
            parcel1.recycle();
            parcel.recycle();
            throw zzls1;
        }

        public void zza(zzls zzls1, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
            if(zzls1 == null)
                break MISSING_BLOCK_LABEL_66;
            zzls1 = zzls1.asBinder();
_L1:
            parcel.writeStrongBinder(zzls1);
            parcel.writeByteArray(abyte0);
            zzlW.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzls1 = null;
              goto _L1
            zzls1;
            parcel1.recycle();
            parcel.recycle();
            throw zzls1;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void zza(zzls zzls)
        throws RemoteException;

    public abstract void zza(zzls zzls, byte abyte0[])
        throws RemoteException;
}
