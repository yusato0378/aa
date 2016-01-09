// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal:
//            zzgy

public interface zzgz
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzgz
    {

        public static zzgz zzM(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateService");
            if(iinterface != null && (iinterface instanceof zzgz))
                return (zzgz)iinterface;
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
                parcel1.writeString("com.google.android.gms.appstate.internal.IAppStateService");
                return true;

            case 5001: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                i = zzjN();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 5002: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                i = zzjO();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 5003: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                zza(zzgy.zza.zzL(parcel.readStrongBinder()), parcel.readInt(), parcel.createByteArray());
                parcel1.writeNoException();
                return true;

            case 5004: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                zza(zzgy.zza.zzL(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5005: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                zza(zzgy.zza.zzL(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5006: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                zza(zzgy.zza.zzL(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.createByteArray());
                parcel1.writeNoException();
                return true;

            case 5007: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                zzb(zzgy.zza.zzL(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5008: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                zzb(zzgy.zza.zzL(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5009: 
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                zzc(zzgy.zza.zzL(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }
    }

    private static class zza.zza
        implements zzgz
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zza(zzgy zzgy1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if(zzgy1 == null)
                break MISSING_BLOCK_LABEL_59;
            zzgy1 = zzgy1.asBinder();
_L1:
            parcel.writeStrongBinder(zzgy1);
            zzlW.transact(5005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzgy1 = null;
              goto _L1
            zzgy1;
            parcel1.recycle();
            parcel.recycle();
            throw zzgy1;
        }

        public void zza(zzgy zzgy1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if(zzgy1 == null)
                break MISSING_BLOCK_LABEL_68;
            zzgy1 = zzgy1.asBinder();
_L1:
            parcel.writeStrongBinder(zzgy1);
            parcel.writeInt(i);
            zzlW.transact(5004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzgy1 = null;
              goto _L1
            zzgy1;
            parcel1.recycle();
            parcel.recycle();
            throw zzgy1;
        }

        public void zza(zzgy zzgy1, int i, String s, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if(zzgy1 == null)
                break MISSING_BLOCK_LABEL_87;
            zzgy1 = zzgy1.asBinder();
_L1:
            parcel.writeStrongBinder(zzgy1);
            parcel.writeInt(i);
            parcel.writeString(s);
            parcel.writeByteArray(abyte0);
            zzlW.transact(5006, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzgy1 = null;
              goto _L1
            zzgy1;
            parcel1.recycle();
            parcel.recycle();
            throw zzgy1;
        }

        public void zza(zzgy zzgy1, int i, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if(zzgy1 == null)
                break MISSING_BLOCK_LABEL_80;
            zzgy1 = zzgy1.asBinder();
_L1:
            parcel.writeStrongBinder(zzgy1);
            parcel.writeInt(i);
            parcel.writeByteArray(abyte0);
            zzlW.transact(5003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzgy1 = null;
              goto _L1
            zzgy1;
            parcel1.recycle();
            parcel.recycle();
            throw zzgy1;
        }

        public void zzb(zzgy zzgy1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if(zzgy1 == null)
                break MISSING_BLOCK_LABEL_59;
            zzgy1 = zzgy1.asBinder();
_L1:
            parcel.writeStrongBinder(zzgy1);
            zzlW.transact(5008, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzgy1 = null;
              goto _L1
            zzgy1;
            parcel1.recycle();
            parcel.recycle();
            throw zzgy1;
        }

        public void zzb(zzgy zzgy1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if(zzgy1 == null)
                break MISSING_BLOCK_LABEL_68;
            zzgy1 = zzgy1.asBinder();
_L1:
            parcel.writeStrongBinder(zzgy1);
            parcel.writeInt(i);
            zzlW.transact(5007, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzgy1 = null;
              goto _L1
            zzgy1;
            parcel1.recycle();
            parcel.recycle();
            throw zzgy1;
        }

        public void zzc(zzgy zzgy1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if(zzgy1 == null)
                break MISSING_BLOCK_LABEL_59;
            zzgy1 = zzgy1.asBinder();
_L1:
            parcel.writeStrongBinder(zzgy1);
            zzlW.transact(5009, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzgy1 = null;
              goto _L1
            zzgy1;
            parcel1.recycle();
            parcel.recycle();
            throw zzgy1;
        }

        public int zzjN()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            zzlW.transact(5001, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public int zzjO()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            zzlW.transact(5002, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void zza(zzgy zzgy)
        throws RemoteException;

    public abstract void zza(zzgy zzgy, int i)
        throws RemoteException;

    public abstract void zza(zzgy zzgy, int i, String s, byte abyte0[])
        throws RemoteException;

    public abstract void zza(zzgy zzgy, int i, byte abyte0[])
        throws RemoteException;

    public abstract void zzb(zzgy zzgy)
        throws RemoteException;

    public abstract void zzb(zzgy zzgy, int i)
        throws RemoteException;

    public abstract void zzc(zzgy zzgy)
        throws RemoteException;

    public abstract int zzjN()
        throws RemoteException;

    public abstract int zzjO()
        throws RemoteException;
}
