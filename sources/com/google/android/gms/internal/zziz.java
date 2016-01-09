// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.fitness.result.DataTypeResult;

public interface zziz
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zziz
    {

        public static zziz zzaF(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataTypeCallback");
            if(iinterface != null && (iinterface instanceof zziz))
                return (zziz)iinterface;
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
                parcel1.writeString("com.google.android.gms.fitness.internal.IDataTypeCallback");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IDataTypeCallback");
                break;
            }
            if(parcel.readInt() != 0)
                parcel = (DataTypeResult)DataTypeResult.CREATOR.createFromParcel(parcel);
            else
                parcel = null;
            zza(parcel);
            parcel1.writeNoException();
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.fitness.internal.IDataTypeCallback");
        }
    }

    private static class zza.zza
        implements zziz
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zza(DataTypeResult datatyperesult)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IDataTypeCallback");
            if(datatyperesult == null)
                break MISSING_BLOCK_LABEL_56;
            parcel.writeInt(1);
            datatyperesult.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            datatyperesult;
            parcel1.recycle();
            parcel.recycle();
            throw datatyperesult;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void zza(DataTypeResult datatyperesult)
        throws RemoteException;
}
