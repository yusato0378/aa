// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.dynamic.zzc;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

// Referenced classes of package com.google.android.gms.internal:
//            zznc, zznb

public interface zzne
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzne
    {

        public static zzne zzcM(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
            if(iinterface != null && (iinterface instanceof zzne))
                return (zzne)iinterface;
            else
                return new zza(ibinder);
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            Object obj1 = null;
            zzd zzd;
            zzc zzc;
            switch(i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
                zzd = com.google.android.gms.dynamic.zzd.zza.zzat(parcel.readStrongBinder());
                zzc = com.google.android.gms.dynamic.zzc.zza.zzas(parcel.readStrongBinder());
                break;
            }
            Object obj;
            if(parcel.readInt() != 0)
                obj = (WalletFragmentOptions)WalletFragmentOptions.CREATOR.createFromParcel(parcel);
            else
                obj = null;
            obj = zza(zzd, zzc, ((WalletFragmentOptions) (obj)), zznc.zza.zzcK(parcel.readStrongBinder()));
            parcel1.writeNoException();
            parcel = obj1;
            if(obj != null)
                parcel = ((zznb) (obj)).asBinder();
            parcel1.writeStrongBinder(parcel);
            return true;
        }
    }

    private static class zza.zza
        implements zzne
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public zznb zza(zzd zzd1, zzc zzc1, WalletFragmentOptions walletfragmentoptions, zznc zznc1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
            if(zzd1 == null) goto _L2; else goto _L1
_L1:
            zzd1 = zzd1.asBinder();
_L7:
            parcel.writeStrongBinder(zzd1);
            if(zzc1 == null) goto _L4; else goto _L3
_L3:
            zzd1 = zzc1.asBinder();
_L8:
            parcel.writeStrongBinder(zzd1);
            if(walletfragmentoptions == null) goto _L6; else goto _L5
_L5:
            parcel.writeInt(1);
            walletfragmentoptions.writeToParcel(parcel, 0);
_L9:
            zzd1 = obj;
            if(zznc1 == null)
                break MISSING_BLOCK_LABEL_87;
            zzd1 = zznc1.asBinder();
            parcel.writeStrongBinder(zzd1);
            zzlW.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            zzd1 = zznb.zza.zzcJ(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzd1;
_L2:
            zzd1 = null;
              goto _L7
_L4:
            zzd1 = null;
              goto _L8
_L6:
            parcel.writeInt(0);
              goto _L9
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
              goto _L7
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract zznb zza(zzd zzd, zzc zzc, WalletFragmentOptions walletfragmentoptions, zznc zznc)
        throws RemoteException;
}
