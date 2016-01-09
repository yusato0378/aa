// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.sharing.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.nearby.sharing.internal:
//            ProvideContentRequest, ReceiveContentRequest, StopProvidingContentRequest, TrustedDevicesRequest

public interface zzd
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzd
    {

        public static zzd zzco(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
            if(iinterface != null && (iinterface instanceof zzd))
                return (zzd)iinterface;
            else
                return new zza(ibinder);
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            Object obj1 = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj = null;
            switch(i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
                parcel1 = obj;
                if(parcel.readInt() != 0)
                    parcel1 = (ProvideContentRequest)ProvideContentRequest.CREATOR.createFromParcel(parcel);
                zza(parcel1);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
                parcel1 = obj1;
                if(parcel.readInt() != 0)
                    parcel1 = (StopProvidingContentRequest)StopProvidingContentRequest.CREATOR.createFromParcel(parcel);
                zza(parcel1);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
                parcel1 = obj2;
                if(parcel.readInt() != 0)
                    parcel1 = (TrustedDevicesRequest)TrustedDevicesRequest.CREATOR.createFromParcel(parcel);
                zza(parcel1);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
                parcel1 = obj3;
                break;
            }
            if(parcel.readInt() != 0)
                parcel1 = (ReceiveContentRequest)ReceiveContentRequest.CREATOR.createFromParcel(parcel);
            zza(parcel1);
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

        public void zza(ProvideContentRequest providecontentrequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
            if(providecontentrequest == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            providecontentrequest.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            providecontentrequest;
            parcel.recycle();
            throw providecontentrequest;
        }

        public void zza(ReceiveContentRequest receivecontentrequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
            if(receivecontentrequest == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            receivecontentrequest.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(4, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            receivecontentrequest;
            parcel.recycle();
            throw receivecontentrequest;
        }

        public void zza(StopProvidingContentRequest stopprovidingcontentrequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
            if(stopprovidingcontentrequest == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            stopprovidingcontentrequest.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            stopprovidingcontentrequest;
            parcel.recycle();
            throw stopprovidingcontentrequest;
        }

        public void zza(TrustedDevicesRequest trusteddevicesrequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
            if(trusteddevicesrequest == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            trusteddevicesrequest.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            trusteddevicesrequest;
            parcel.recycle();
            throw trusteddevicesrequest;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void zza(ProvideContentRequest providecontentrequest)
        throws RemoteException;

    public abstract void zza(ReceiveContentRequest receivecontentrequest)
        throws RemoteException;

    public abstract void zza(StopProvidingContentRequest stopprovidingcontentrequest)
        throws RemoteException;

    public abstract void zza(TrustedDevicesRequest trusteddevicesrequest)
        throws RemoteException;
}
