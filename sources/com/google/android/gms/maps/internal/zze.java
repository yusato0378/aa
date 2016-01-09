// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.internal;

import android.graphics.Bitmap;
import android.os.*;
import com.google.android.gms.maps.model.internal.zzi;

public interface zze
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zze
    {

        public static zze zzbt(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowRenderer");
            if(iinterface != null && (iinterface instanceof zze))
                return (zze)iinterface;
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
                parcel1.writeString("com.google.android.gms.maps.internal.IInfoWindowRenderer");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowRenderer");
                parcel = zza(com.google.android.gms.maps.model.internal.zzi.zza.zzbZ(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                break;
            }
            if(parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }
        }
    }

    private static class zza.zza
        implements zze
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public Bitmap zza(zzi zzi1, int i, int j)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowRenderer");
            if(zzi1 == null)
                break MISSING_BLOCK_LABEL_107;
            zzi1 = zzi1.asBinder();
_L1:
            parcel.writeStrongBinder(zzi1);
            parcel.writeInt(i);
            parcel.writeInt(j);
            zzlW.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            zzi1 = obj;
            if(parcel1.readInt() != 0)
                zzi1 = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel1);
            parcel1.recycle();
            parcel.recycle();
            return zzi1;
            zzi1 = null;
              goto _L1
            zzi1;
            parcel1.recycle();
            parcel.recycle();
            throw zzi1;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract Bitmap zza(zzi zzi, int i, int j)
        throws RemoteException;
}
