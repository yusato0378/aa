// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.realtime.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            ParcelableCollaborator

public interface zzd
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzd
    {

        public static zzd zzag(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
            if(iinterface != null && (iinterface instanceof zzd))
                return (zzd)iinterface;
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
            Object obj = null;
            ParcelableCollaborator parcelablecollaborator = null;
            switch(i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
                if(parcel.readInt() != 0)
                    parcelablecollaborator = (ParcelableCollaborator)ParcelableCollaborator.CREATOR.createFromParcel(parcel);
                zza(parcelablecollaborator);
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
                parcelablecollaborator = obj;
                break;
            }
            if(parcel.readInt() != 0)
                parcelablecollaborator = (ParcelableCollaborator)ParcelableCollaborator.CREATOR.createFromParcel(parcel);
            zzb(parcelablecollaborator);
            parcel1.writeNoException();
            return true;
        }
    }

    private static class zza.zza
        implements zzd
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zza(ParcelableCollaborator parcelablecollaborator)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
            if(parcelablecollaborator == null)
                break MISSING_BLOCK_LABEL_56;
            parcel.writeInt(1);
            parcelablecollaborator.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            parcelablecollaborator;
            parcel1.recycle();
            parcel.recycle();
            throw parcelablecollaborator;
        }

        public void zzb(ParcelableCollaborator parcelablecollaborator)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
            if(parcelablecollaborator == null)
                break MISSING_BLOCK_LABEL_56;
            parcel.writeInt(1);
            parcelablecollaborator.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            parcelablecollaborator;
            parcel1.recycle();
            parcel.recycle();
            throw parcelablecollaborator;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void zza(ParcelableCollaborator parcelablecollaborator)
        throws RemoteException;

    public abstract void zzb(ParcelableCollaborator parcelablecollaborator)
        throws RemoteException;
}
