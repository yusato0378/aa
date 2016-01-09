// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

public interface zzjh
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzjh
    {

        public static zzjh zzaN(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
            if(iinterface != null && (iinterface instanceof zzjh))
                return (zzjh)iinterface;
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
                parcel1.writeString("com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
                break;
            }
            if(parcel.readInt() != 0)
                parcel = (ListSubscriptionsResult)ListSubscriptionsResult.CREATOR.createFromParcel(parcel);
            else
                parcel = null;
            zza(parcel);
            parcel1.writeNoException();
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
        }
    }

    private static class zza.zza
        implements zzjh
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zza(ListSubscriptionsResult listsubscriptionsresult)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
            if(listsubscriptionsresult == null)
                break MISSING_BLOCK_LABEL_56;
            parcel.writeInt(1);
            listsubscriptionsresult.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            listsubscriptionsresult;
            parcel1.recycle();
            parcel.recycle();
            throw listsubscriptionsresult;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void zza(ListSubscriptionsResult listsubscriptionsresult)
        throws RemoteException;
}
