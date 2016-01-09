// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal:
//            zzcs

public interface zzcr
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzcr
    {

        public static zzcr zzo(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
            if(iinterface != null && (iinterface instanceof zzcr))
                return (zzcr)iinterface;
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
            boolean flag;
            switch(i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                parcel = zzK(parcel.readString());
                parcel1.writeNoException();
                if(parcel != null)
                    parcel = parcel.asBinder();
                else
                    parcel = null;
                parcel1.writeStrongBinder(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                flag = zzL(parcel.readString());
                parcel1.writeNoException();
                break;
            }
            if(flag)
                i = 1;
            else
                i = 0;
            parcel1.writeInt(i);
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        }
    }

    private static class zza.zza
        implements zzcr
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public zzcs zzK(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
            parcel.writeString(s);
            zzlW.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            s = zzcs.zza.zzp(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return s;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public boolean zzL(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
            parcel.writeString(s);
            zzlW.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if(i != 0)
                flag = true;
            parcel1.recycle();
            parcel.recycle();
            return flag;
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


    public abstract zzcs zzK(String s)
        throws RemoteException;

    public abstract boolean zzL(String s)
        throws RemoteException;
}
