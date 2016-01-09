// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.messages.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            PublishRequest, SubscribeRequest, UnpublishRequest, UnsubscribeRequest

public interface zzc
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzc
    {

        public static zzc zzcj(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
            if(iinterface != null && (iinterface instanceof zzc))
                return (zzc)iinterface;
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
                parcel1.writeString("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                parcel1 = obj;
                if(parcel.readInt() != 0)
                    parcel1 = (PublishRequest)PublishRequest.CREATOR.createFromParcel(parcel);
                zza(parcel1);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                parcel1 = obj1;
                if(parcel.readInt() != 0)
                    parcel1 = (UnpublishRequest)UnpublishRequest.CREATOR.createFromParcel(parcel);
                zza(parcel1);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                parcel1 = obj2;
                if(parcel.readInt() != 0)
                    parcel1 = (SubscribeRequest)SubscribeRequest.CREATOR.createFromParcel(parcel);
                zza(parcel1);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                parcel1 = obj3;
                if(parcel.readInt() != 0)
                    parcel1 = (UnsubscribeRequest)UnsubscribeRequest.CREATOR.createFromParcel(parcel);
                zza(parcel1);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                zzvd();
                return true;
            }
        }
    }

    private static class zza.zza
        implements zzc
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zza(PublishRequest publishrequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
            if(publishrequest == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            publishrequest.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            publishrequest;
            parcel.recycle();
            throw publishrequest;
        }

        public void zza(SubscribeRequest subscriberequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
            if(subscriberequest == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            subscriberequest.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            subscriberequest;
            parcel.recycle();
            throw subscriberequest;
        }

        public void zza(UnpublishRequest unpublishrequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
            if(unpublishrequest == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            unpublishrequest.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            unpublishrequest;
            parcel.recycle();
            throw unpublishrequest;
        }

        public void zza(UnsubscribeRequest unsubscriberequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
            if(unsubscriberequest == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            unsubscriberequest.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(4, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            unsubscriberequest;
            parcel.recycle();
            throw unsubscriberequest;
        }

        public void zzvd()
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
            zzlW.transact(5, parcel, null, 1);
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


    public abstract void zza(PublishRequest publishrequest)
        throws RemoteException;

    public abstract void zza(SubscribeRequest subscriberequest)
        throws RemoteException;

    public abstract void zza(UnpublishRequest unpublishrequest)
        throws RemoteException;

    public abstract void zza(UnsubscribeRequest unsubscriberequest)
        throws RemoteException;

    public abstract void zzvd()
        throws RemoteException;
}
