// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.games.internal:
//            PopupLocationInfoParcelable, PopupLocationInfoParcelableCreator

public interface IGamesClient
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IGamesClient
    {

        public static IGamesClient zzaY(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesClient");
            if(iinterface != null && (iinterface instanceof IGamesClient))
                return (IGamesClient)iinterface;
            else
                return new Proxy(ibinder);
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
                parcel1.writeString("com.google.android.gms.games.internal.IGamesClient");
                return true;

            case 1001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesClient");
                parcel = zzqz();
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

        public Stub()
        {
            attachInterface(this, "com.google.android.gms.games.internal.IGamesClient");
        }
    }

    private static class Stub.Proxy
        implements IGamesClient
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public PopupLocationInfoParcelable zzqz()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesClient");
            zzlW.transact(1001, parcel, parcel1, 0);
            parcel1.readException();
            if(parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            PopupLocationInfoParcelable popuplocationinfoparcelable = PopupLocationInfoParcelable.CREATOR.zzdm(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return popuplocationinfoparcelable;
_L2:
            popuplocationinfoparcelable = null;
            if(true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        private IBinder zzlW;

        Stub.Proxy(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract PopupLocationInfoParcelable zzqz()
        throws RemoteException;
}
