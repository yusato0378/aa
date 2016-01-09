// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location;

import android.location.Location;
import android.os.*;

public interface zzd
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzd
    {

        public static zzd zzbe(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if(iinterface != null && (iinterface instanceof zzd))
                return (zzd)iinterface;
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
                parcel1.writeString("com.google.android.gms.location.ILocationListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.location.ILocationListener");
                break;
            }
            if(parcel.readInt() != 0)
                parcel = (Location)Location.CREATOR.createFromParcel(parcel);
            else
                parcel = null;
            onLocationChanged(parcel);
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.location.ILocationListener");
        }
    }

    private static class zza.zza
        implements zzd
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void onLocationChanged(Location location)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.ILocationListener");
            if(location == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            location.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            location;
            parcel.recycle();
            throw location;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void onLocationChanged(Location location)
        throws RemoteException;
}
