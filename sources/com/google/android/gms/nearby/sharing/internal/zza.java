// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.sharing.internal;

import android.os.*;
import com.google.android.gms.nearby.sharing.AppContentReceivedResult;

public interface com.google.android.gms.nearby.sharing.internal.zza
    extends IInterface
{
    public static abstract class zza extends Binder
        implements com.google.android.gms.nearby.sharing.internal.zza
    {

        public static com.google.android.gms.nearby.sharing.internal.zza zzcl(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IAppContentReceiver");
            if(iinterface != null && (iinterface instanceof com.google.android.gms.nearby.sharing.internal.zza))
                return (com.google.android.gms.nearby.sharing.internal.zza)iinterface;
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
                parcel1.writeString("com.google.android.gms.nearby.sharing.internal.IAppContentReceiver");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.nearby.sharing.internal.IAppContentReceiver");
                parcel = zzdl(parcel.readString());
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.nearby.sharing.internal.IAppContentReceiver");
                break;
            }
            if(parcel.readInt() != 0)
                parcel = (AppContentReceivedResult)AppContentReceivedResult.CREATOR.createFromParcel(parcel);
            else
                parcel = null;
            zza(parcel);
            return true;
        }
    }

    private static class zza.zza
        implements com.google.android.gms.nearby.sharing.internal.zza
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zza(AppContentReceivedResult appcontentreceivedresult)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.IAppContentReceiver");
            if(appcontentreceivedresult == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            appcontentreceivedresult.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            appcontentreceivedresult;
            parcel.recycle();
            throw appcontentreceivedresult;
        }

        public String zzdl(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.IAppContentReceiver");
            parcel.writeString(s);
            zzlW.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void zza(AppContentReceivedResult appcontentreceivedresult)
        throws RemoteException;

    public abstract String zzdl(String s)
        throws RemoteException;
}
