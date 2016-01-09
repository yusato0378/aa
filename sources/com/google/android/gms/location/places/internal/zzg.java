// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places.internal;

import android.os.*;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.StatusCreator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zze;

public interface zzg
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzg
    {

        public static zzg zzbm(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
            if(iinterface != null && (iinterface instanceof zzg))
                return (zzg)iinterface;
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
            Object obj1 = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj = null;
            switch(i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                parcel1 = obj;
                if(parcel.readInt() != 0)
                    parcel1 = DataHolder.CREATOR.zzC(parcel);
                zzY(parcel1);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                parcel1 = obj1;
                if(parcel.readInt() != 0)
                    parcel1 = DataHolder.CREATOR.zzC(parcel);
                zzZ(parcel1);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                parcel1 = obj2;
                if(parcel.readInt() != 0)
                    parcel1 = DataHolder.CREATOR.zzC(parcel);
                zzaa(parcel1);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                parcel1 = obj3;
                if(parcel.readInt() != 0)
                    parcel1 = Status.CREATOR.createFromParcel(parcel);
                zzaz(parcel1);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                parcel1 = obj4;
                break;
            }
            if(parcel.readInt() != 0)
                parcel1 = DataHolder.CREATOR.zzC(parcel);
            zzab(parcel1);
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.location.places.internal.IPlacesCallbacks");
        }
    }

    private static class zza.zza
        implements zzg
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zzY(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
            if(dataholder == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel.recycle();
            throw dataholder;
        }

        public void zzZ(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
            if(dataholder == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel.recycle();
            throw dataholder;
        }

        public void zzaa(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
            if(dataholder == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel.recycle();
            throw dataholder;
        }

        public void zzab(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
            if(dataholder == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(5, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel.recycle();
            throw dataholder;
        }

        public void zzaz(Status status)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
            if(status == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(4, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            status;
            parcel.recycle();
            throw status;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void zzY(DataHolder dataholder)
        throws RemoteException;

    public abstract void zzZ(DataHolder dataholder)
        throws RemoteException;

    public abstract void zzaa(DataHolder dataholder)
        throws RemoteException;

    public abstract void zzab(DataHolder dataholder)
        throws RemoteException;

    public abstract void zzaz(Status status)
        throws RemoteException;
}
