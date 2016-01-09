// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.realtime.internal;

import android.os.*;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.StatusCreator;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            ParcelableIndexReference

public interface zzk
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzk
    {

        public static zzk zzan(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
            if(iinterface != null && (iinterface instanceof zzk))
                return (zzk)iinterface;
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
            Object obj = null;
            switch(i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
                if(parcel.readInt() != 0)
                    obj = (ParcelableIndexReference)ParcelableIndexReference.CREATOR.createFromParcel(parcel);
                zza(((ParcelableIndexReference) (obj)));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
                obj = obj1;
                break;
            }
            if(parcel.readInt() != 0)
                obj = Status.CREATOR.createFromParcel(parcel);
            zzm(((Status) (obj)));
            parcel1.writeNoException();
            return true;
        }
    }

    private static class zza.zza
        implements zzk
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zza(ParcelableIndexReference parcelableindexreference)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
            if(parcelableindexreference == null)
                break MISSING_BLOCK_LABEL_56;
            parcel.writeInt(1);
            parcelableindexreference.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            parcelableindexreference;
            parcel1.recycle();
            parcel.recycle();
            throw parcelableindexreference;
        }

        public void zzm(Status status)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
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


    public abstract void zza(ParcelableIndexReference parcelableindexreference)
        throws RemoteException;

    public abstract void zzm(Status status)
        throws RemoteException;
}
