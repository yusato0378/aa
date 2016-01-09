// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.*;
import com.google.android.gms.fitness.data.BleDevice;

public interface zzn
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzn
    {

        public static zzn zzaV(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.fitness.request.IBleScanCallback");
            if(iinterface != null && (iinterface instanceof zzn))
                return (zzn)iinterface;
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
                parcel1.writeString("com.google.android.gms.fitness.request.IBleScanCallback");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.fitness.request.IBleScanCallback");
                if(parcel.readInt() != 0)
                    parcel = (BleDevice)BleDevice.CREATOR.createFromParcel(parcel);
                else
                    parcel = null;
                onDeviceFound(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.fitness.request.IBleScanCallback");
                onScanStopped();
                return true;
            }
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.fitness.request.IBleScanCallback");
        }
    }

    private static class zza.zza
        implements zzn
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void onDeviceFound(BleDevice bledevice)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.request.IBleScanCallback");
            if(bledevice == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            bledevice.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bledevice;
            parcel.recycle();
            throw bledevice;
        }

        public void onScanStopped()
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.request.IBleScanCallback");
            zzlW.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void onDeviceFound(BleDevice bledevice)
        throws RemoteException;

    public abstract void onScanStopped()
        throws RemoteException;
}
