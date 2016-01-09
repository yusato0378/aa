// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.fitness.request.DeleteAllUserDataRequest;

public interface zzjd
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzjd
    {

        public static zzjd zzaJ(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitInternalApi");
            if(iinterface != null && (iinterface instanceof zzjd))
                return (zzjd)iinterface;
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
                parcel1.writeString("com.google.android.gms.fitness.internal.IGoogleFitInternalApi");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitInternalApi");
                break;
            }
            if(parcel.readInt() != 0)
                parcel = (DeleteAllUserDataRequest)DeleteAllUserDataRequest.CREATOR.createFromParcel(parcel);
            else
                parcel = null;
            zza(parcel);
            return true;
        }
    }

    private static class zza.zza
        implements zzjd
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zza(DeleteAllUserDataRequest deletealluserdatarequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitInternalApi");
            if(deletealluserdatarequest == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            deletealluserdatarequest.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            deletealluserdatarequest;
            parcel.recycle();
            throw deletealluserdatarequest;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void zza(DeleteAllUserDataRequest deletealluserdatarequest)
        throws RemoteException;
}
