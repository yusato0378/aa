// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.*;

// Referenced classes of package com.google.android.gms.dynamic:
//            zzd

public interface zzc
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzc
    {

        public static zzc zzas(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            if(iinterface != null && (iinterface instanceof zzc))
                return (zzc)iinterface;
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
            zzd zzd3 = null;
            Object obj1 = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj = null;
            boolean flag1 = false;
            boolean flag2 = false;
            boolean flag3 = false;
            boolean flag4 = false;
            boolean flag5 = false;
            boolean flag6 = false;
            boolean flag7 = false;
            boolean flag8 = false;
            boolean flag12 = false;
            boolean flag13 = false;
            boolean flag14 = false;
            boolean flag = false;
            switch(i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.dynamic.IFragmentWrapper");
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                zzd3 = zzov();
                parcel1.writeNoException();
                parcel = obj;
                if(zzd3 != null)
                    parcel = zzd3.asBinder();
                parcel1.writeStrongBinder(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                parcel = getArguments();
                parcel1.writeNoException();
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

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                i = getId();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                zzc zzc1 = zzow();
                parcel1.writeNoException();
                parcel = zzd3;
                if(zzc1 != null)
                    parcel = zzc1.asBinder();
                parcel1.writeStrongBinder(parcel);
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                zzd zzd1 = zzox();
                parcel1.writeNoException();
                parcel = obj1;
                if(zzd1 != null)
                    parcel = zzd1.asBinder();
                parcel1.writeStrongBinder(parcel);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                flag8 = getRetainInstance();
                parcel1.writeNoException();
                if(flag8)
                    i = 1;
                else
                    i = 0;
                parcel1.writeInt(i);
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                parcel = getTag();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                zzc zzc2 = zzoy();
                parcel1.writeNoException();
                parcel = obj2;
                if(zzc2 != null)
                    parcel = zzc2.asBinder();
                parcel1.writeStrongBinder(parcel);
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                i = getTargetRequestCode();
                parcel1.writeNoException();
                parcel1.writeInt(i);
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                flag8 = getUserVisibleHint();
                parcel1.writeNoException();
                i = ((flag) ? 1 : 0);
                if(flag8)
                    i = 1;
                parcel1.writeInt(i);
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                zzd zzd2 = getView();
                parcel1.writeNoException();
                parcel = obj3;
                if(zzd2 != null)
                    parcel = zzd2.asBinder();
                parcel1.writeStrongBinder(parcel);
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                flag8 = isAdded();
                parcel1.writeNoException();
                i = ((flag1) ? 1 : 0);
                if(flag8)
                    i = 1;
                parcel1.writeInt(i);
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                flag8 = isDetached();
                parcel1.writeNoException();
                i = ((flag2) ? 1 : 0);
                if(flag8)
                    i = 1;
                parcel1.writeInt(i);
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                flag8 = isHidden();
                parcel1.writeNoException();
                i = ((flag3) ? 1 : 0);
                if(flag8)
                    i = 1;
                parcel1.writeInt(i);
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                flag8 = isInLayout();
                parcel1.writeNoException();
                i = ((flag4) ? 1 : 0);
                if(flag8)
                    i = 1;
                parcel1.writeInt(i);
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                flag8 = isRemoving();
                parcel1.writeNoException();
                i = ((flag5) ? 1 : 0);
                if(flag8)
                    i = 1;
                parcel1.writeInt(i);
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                flag8 = isResumed();
                parcel1.writeNoException();
                i = ((flag6) ? 1 : 0);
                if(flag8)
                    i = 1;
                parcel1.writeInt(i);
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                flag8 = isVisible();
                parcel1.writeNoException();
                i = ((flag7) ? 1 : 0);
                if(flag8)
                    i = 1;
                parcel1.writeInt(i);
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                zze(zzd.zza.zzat(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 21: // '\025'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                if(parcel.readInt() != 0)
                    flag8 = true;
                setHasOptionsMenu(flag8);
                parcel1.writeNoException();
                return true;

            case 22: // '\026'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                boolean flag9 = flag12;
                if(parcel.readInt() != 0)
                    flag9 = true;
                setMenuVisibility(flag9);
                parcel1.writeNoException();
                return true;

            case 23: // '\027'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                boolean flag10 = flag13;
                if(parcel.readInt() != 0)
                    flag10 = true;
                setRetainInstance(flag10);
                parcel1.writeNoException();
                return true;

            case 24: // '\030'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                boolean flag11 = flag14;
                if(parcel.readInt() != 0)
                    flag11 = true;
                setUserVisibleHint(flag11);
                parcel1.writeNoException();
                return true;

            case 25: // '\031'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                Intent intent = obj4;
                if(parcel.readInt() != 0)
                    intent = (Intent)Intent.CREATOR.createFromParcel(parcel);
                startActivity(intent);
                parcel1.writeNoException();
                return true;

            case 26: // '\032'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                Intent intent1 = obj5;
                if(parcel.readInt() != 0)
                    intent1 = (Intent)Intent.CREATOR.createFromParcel(parcel);
                startActivityForResult(intent1, parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 27: // '\033'
                parcel.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                zzf(zzd.zza.zzat(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.dynamic.IFragmentWrapper");
        }
    }

    private static class zza.zza
        implements zzc
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public Bundle getArguments()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            zzlW.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            if(parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Bundle bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return bundle;
_L2:
            bundle = null;
            if(true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public int getId()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            zzlW.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public boolean getRetainInstance()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            zzlW.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if(i != 0)
                flag = true;
            parcel1.recycle();
            parcel.recycle();
            return flag;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public String getTag()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            zzlW.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public int getTargetRequestCode()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            zzlW.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public boolean getUserVisibleHint()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            zzlW.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if(i != 0)
                flag = true;
            parcel1.recycle();
            parcel.recycle();
            return flag;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public zzd getView()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            zzd zzd1;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            zzlW.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            zzd1 = zzd.zza.zzat(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzd1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public boolean isAdded()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            zzlW.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if(i != 0)
                flag = true;
            parcel1.recycle();
            parcel.recycle();
            return flag;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public boolean isDetached()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            zzlW.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if(i != 0)
                flag = true;
            parcel1.recycle();
            parcel.recycle();
            return flag;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public boolean isHidden()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            zzlW.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if(i != 0)
                flag = true;
            parcel1.recycle();
            parcel.recycle();
            return flag;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public boolean isInLayout()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            zzlW.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if(i != 0)
                flag = true;
            parcel1.recycle();
            parcel.recycle();
            return flag;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public boolean isRemoving()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            zzlW.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if(i != 0)
                flag = true;
            parcel1.recycle();
            parcel.recycle();
            return flag;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public boolean isResumed()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            zzlW.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if(i != 0)
                flag = true;
            parcel1.recycle();
            parcel.recycle();
            return flag;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public boolean isVisible()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            zzlW.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if(i != 0)
                flag = true;
            parcel1.recycle();
            parcel.recycle();
            return flag;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void setHasOptionsMenu(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            if(flag)
                i = 1;
            parcel.writeInt(i);
            zzlW.transact(21, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void setMenuVisibility(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            if(flag)
                i = 1;
            parcel.writeInt(i);
            zzlW.transact(22, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void setRetainInstance(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            if(flag)
                i = 1;
            parcel.writeInt(i);
            zzlW.transact(23, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void setUserVisibleHint(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            if(flag)
                i = 1;
            parcel.writeInt(i);
            zzlW.transact(24, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void startActivity(Intent intent)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            if(intent == null)
                break MISSING_BLOCK_LABEL_57;
            parcel.writeInt(1);
            intent.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(25, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            intent;
            parcel1.recycle();
            parcel.recycle();
            throw intent;
        }

        public void startActivityForResult(Intent intent, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            if(intent == null)
                break MISSING_BLOCK_LABEL_66;
            parcel.writeInt(1);
            intent.writeToParcel(parcel, 0);
_L1:
            parcel.writeInt(i);
            zzlW.transact(26, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            intent;
            parcel1.recycle();
            parcel.recycle();
            throw intent;
        }

        public void zze(zzd zzd1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            if(zzd1 == null)
                break MISSING_BLOCK_LABEL_58;
            zzd1 = zzd1.asBinder();
_L1:
            parcel.writeStrongBinder(zzd1);
            zzlW.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzd1 = null;
              goto _L1
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
        }

        public void zzf(zzd zzd1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            if(zzd1 == null)
                break MISSING_BLOCK_LABEL_58;
            zzd1 = zzd1.asBinder();
_L1:
            parcel.writeStrongBinder(zzd1);
            zzlW.transact(27, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzd1 = null;
              goto _L1
            zzd1;
            parcel1.recycle();
            parcel.recycle();
            throw zzd1;
        }

        public zzd zzov()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            zzd zzd1;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            zzlW.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            zzd1 = zzd.zza.zzat(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzd1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public zzc zzow()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            zzc zzc1;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            zzlW.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            zzc1 = zza.zzas(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzc1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public zzd zzox()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            zzd zzd1;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            zzlW.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            zzd1 = zzd.zza.zzat(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzd1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public zzc zzoy()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            zzc zzc1;
            parcel.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
            zzlW.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            zzc1 = zza.zzas(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzc1;
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


    public abstract Bundle getArguments()
        throws RemoteException;

    public abstract int getId()
        throws RemoteException;

    public abstract boolean getRetainInstance()
        throws RemoteException;

    public abstract String getTag()
        throws RemoteException;

    public abstract int getTargetRequestCode()
        throws RemoteException;

    public abstract boolean getUserVisibleHint()
        throws RemoteException;

    public abstract zzd getView()
        throws RemoteException;

    public abstract boolean isAdded()
        throws RemoteException;

    public abstract boolean isDetached()
        throws RemoteException;

    public abstract boolean isHidden()
        throws RemoteException;

    public abstract boolean isInLayout()
        throws RemoteException;

    public abstract boolean isRemoving()
        throws RemoteException;

    public abstract boolean isResumed()
        throws RemoteException;

    public abstract boolean isVisible()
        throws RemoteException;

    public abstract void setHasOptionsMenu(boolean flag)
        throws RemoteException;

    public abstract void setMenuVisibility(boolean flag)
        throws RemoteException;

    public abstract void setRetainInstance(boolean flag)
        throws RemoteException;

    public abstract void setUserVisibleHint(boolean flag)
        throws RemoteException;

    public abstract void startActivity(Intent intent)
        throws RemoteException;

    public abstract void startActivityForResult(Intent intent, int i)
        throws RemoteException;

    public abstract void zze(zzd zzd)
        throws RemoteException;

    public abstract void zzf(zzd zzd)
        throws RemoteException;

    public abstract zzd zzov()
        throws RemoteException;

    public abstract zzc zzow()
        throws RemoteException;

    public abstract zzd zzox()
        throws RemoteException;

    public abstract zzc zzoy()
        throws RemoteException;
}
