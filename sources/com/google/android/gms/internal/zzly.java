// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal:
//            zzlx

public interface zzly
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzly
    {

        public static zzly zzcE(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.search.internal.ISearchAuthService");
            if(iinterface != null && (iinterface instanceof zzly))
                return (zzly)iinterface;
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
                parcel1.writeString("com.google.android.gms.search.internal.ISearchAuthService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.search.internal.ISearchAuthService");
                zza(zzlx.zza.zzcD(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;
            }
        }
    }

    private static class zza.zza
        implements zzly
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zza(zzlx zzlx1, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.search.internal.ISearchAuthService");
            if(zzlx1 == null)
                break MISSING_BLOCK_LABEL_78;
            zzlx1 = zzlx1.asBinder();
_L1:
            parcel.writeStrongBinder(zzlx1);
            parcel.writeString(s);
            parcel.writeString(s1);
            zzlW.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzlx1 = null;
              goto _L1
            zzlx1;
            parcel1.recycle();
            parcel.recycle();
            throw zzlx1;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void zza(zzlx zzlx, String s, String s1)
        throws RemoteException;
}
