// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.fitness.request.*;

public interface zzja
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzja
    {

        public static zzja zzaG(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
            if(iinterface != null && (iinterface instanceof zzja))
                return (zzja)iinterface;
            else
                return new zza(ibinder);
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
                parcel1.writeString("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                parcel1 = obj;
                if(parcel.readInt() != 0)
                    parcel1 = (StartBleScanRequest)StartBleScanRequest.CREATOR.createFromParcel(parcel);
                zza(parcel1);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                parcel1 = obj1;
                if(parcel.readInt() != 0)
                    parcel1 = (StopBleScanRequest)StopBleScanRequest.CREATOR.createFromParcel(parcel);
                zza(parcel1);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                parcel1 = obj2;
                if(parcel.readInt() != 0)
                    parcel1 = (ClaimBleDeviceRequest)ClaimBleDeviceRequest.CREATOR.createFromParcel(parcel);
                zza(parcel1);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                parcel1 = obj3;
                if(parcel.readInt() != 0)
                    parcel1 = (UnclaimBleDeviceRequest)UnclaimBleDeviceRequest.CREATOR.createFromParcel(parcel);
                zza(parcel1);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                parcel1 = obj4;
                break;
            }
            if(parcel.readInt() != 0)
                parcel1 = (ListClaimedBleDevicesRequest)ListClaimedBleDevicesRequest.CREATOR.createFromParcel(parcel);
            zza(parcel1);
            return true;
        }
    }

    private static class zza.zza
        implements zzja
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zza(ClaimBleDeviceRequest claimbledevicerequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
            if(claimbledevicerequest == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            claimbledevicerequest.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            claimbledevicerequest;
            parcel.recycle();
            throw claimbledevicerequest;
        }

        public void zza(ListClaimedBleDevicesRequest listclaimedbledevicesrequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
            if(listclaimedbledevicesrequest == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            listclaimedbledevicesrequest.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(5, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            listclaimedbledevicesrequest;
            parcel.recycle();
            throw listclaimedbledevicesrequest;
        }

        public void zza(StartBleScanRequest startblescanrequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
            if(startblescanrequest == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            startblescanrequest.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            startblescanrequest;
            parcel.recycle();
            throw startblescanrequest;
        }

        public void zza(StopBleScanRequest stopblescanrequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
            if(stopblescanrequest == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            stopblescanrequest.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            stopblescanrequest;
            parcel.recycle();
            throw stopblescanrequest;
        }

        public void zza(UnclaimBleDeviceRequest unclaimbledevicerequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
            if(unclaimbledevicerequest == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            unclaimbledevicerequest.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(4, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            unclaimbledevicerequest;
            parcel.recycle();
            throw unclaimbledevicerequest;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void zza(ClaimBleDeviceRequest claimbledevicerequest)
        throws RemoteException;

    public abstract void zza(ListClaimedBleDevicesRequest listclaimedbledevicesrequest)
        throws RemoteException;

    public abstract void zza(StartBleScanRequest startblescanrequest)
        throws RemoteException;

    public abstract void zza(StopBleScanRequest stopblescanrequest)
        throws RemoteException;

    public abstract void zza(UnclaimBleDeviceRequest unclaimbledevicerequest)
        throws RemoteException;
}
