// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.*;

public interface zzan
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzan
    {

        public static zzan zzae(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.drive.internal.IEventReleaseCallback");
            if(iinterface != null && (iinterface instanceof zzan))
                return (zzan)iinterface;
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
                parcel1.writeString("com.google.android.gms.drive.internal.IEventReleaseCallback");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IEventReleaseCallback");
                break;
            }
            boolean flag;
            if(parcel.readInt() != 0)
                flag = true;
            else
                flag = false;
            zzR(flag);
            return true;
        }
    }

    private static class zza.zza
        implements zzan
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zzR(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            int i;
            i = 1;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IEventReleaseCallback");
            if(!flag)
                i = 0;
            parcel.writeInt(i);
            zzlW.transact(1, parcel, null, 1);
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


    public abstract void zzR(boolean flag)
        throws RemoteException;
}
