// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.sharing.internal;

import android.os.*;
import com.google.android.gms.nearby.sharing.SharedContent;
import java.util.List;

public interface zzb
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzb
    {

        public static zzb zzcm(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IContentProvider");
            if(iinterface != null && (iinterface instanceof zzb))
                return (zzb)iinterface;
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
                parcel1.writeString("com.google.android.gms.nearby.sharing.internal.IContentProvider");
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.nearby.sharing.internal.IContentProvider");
                parcel = zzvl();
                parcel1.writeNoException();
                parcel1.writeTypedList(parcel);
                return true;
            }
        }
    }

    private static class zza.zza
        implements zzb
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public List zzvl()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            java.util.ArrayList arraylist;
            parcel.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.IContentProvider");
            zzlW.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            arraylist = parcel1.createTypedArrayList(SharedContent.CREATOR);
            parcel1.recycle();
            parcel.recycle();
            return arraylist;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract List zzvl()
        throws RemoteException;
}
