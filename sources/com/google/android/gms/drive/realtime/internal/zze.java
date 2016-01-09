// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.realtime.internal;

import android.os.*;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.StatusCreator;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            ParcelableCollaborator

public interface zze
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zze
    {

        public static zze zzah(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorsCallback");
            if(iinterface != null && (iinterface instanceof zze))
                return (zze)iinterface;
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
                parcel1.writeString("com.google.android.gms.drive.realtime.internal.ICollaboratorsCallback");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorsCallback");
                zza((ParcelableCollaborator[])parcel.createTypedArray(ParcelableCollaborator.CREATOR));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorsCallback");
                break;
            }
            if(parcel.readInt() != 0)
                parcel = Status.CREATOR.createFromParcel(parcel);
            else
                parcel = null;
            zzm(parcel);
            parcel1.writeNoException();
            return true;
        }
    }

    private static class zza.zza
        implements zze
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zza(ParcelableCollaborator aparcelablecollaborator[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.ICollaboratorsCallback");
            parcel.writeTypedArray(aparcelablecollaborator, 0);
            zzlW.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            aparcelablecollaborator;
            parcel1.recycle();
            parcel.recycle();
            throw aparcelablecollaborator;
        }

        public void zzm(Status status)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.ICollaboratorsCallback");
            if(status == null)
                break MISSING_BLOCK_LABEL_56;
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            status;
            parcel1.recycle();
            parcel.recycle();
            throw status;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void zza(ParcelableCollaborator aparcelablecollaborator[])
        throws RemoteException;

    public abstract void zzm(Status status)
        throws RemoteException;
}
