// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.identity.intents.UserAddressRequest;

// Referenced classes of package com.google.android.gms.internal:
//            zzkd

public interface zzke
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzke
    {

        public static zzke zzbc(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.identity.intents.internal.IAddressService");
            if(iinterface != null && (iinterface instanceof zzke))
                return (zzke)iinterface;
            else
                return new zza(ibinder);
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            zzkd zzkd;
            switch(i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.identity.intents.internal.IAddressService");
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.identity.intents.internal.IAddressService");
                zzkd = com.google.android.gms.internal.zzkd.zza.zzbb(parcel.readStrongBinder());
                break;
            }
            UserAddressRequest useraddressrequest;
            if(parcel.readInt() != 0)
                useraddressrequest = (UserAddressRequest)UserAddressRequest.CREATOR.createFromParcel(parcel);
            else
                useraddressrequest = null;
            if(parcel.readInt() != 0)
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            else
                parcel = null;
            zza(zzkd, useraddressrequest, parcel);
            parcel1.writeNoException();
            return true;
        }
    }

    private static class zza.zza
        implements zzke
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zza(zzkd zzkd1, UserAddressRequest useraddressrequest, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.identity.intents.internal.IAddressService");
            if(zzkd1 == null) goto _L2; else goto _L1
_L1:
            zzkd1 = zzkd1.asBinder();
_L5:
            parcel.writeStrongBinder(zzkd1);
            if(useraddressrequest == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            useraddressrequest.writeToParcel(parcel, 0);
_L6:
            if(bundle == null)
                break MISSING_BLOCK_LABEL_127;
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L7:
            zzlW.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            zzkd1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            zzkd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzkd1;
            parcel.writeInt(0);
              goto _L7
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void zza(zzkd zzkd, UserAddressRequest useraddressrequest, Bundle bundle)
        throws RemoteException;
}
