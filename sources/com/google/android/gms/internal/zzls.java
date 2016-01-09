// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.StatusCreator;
import com.google.android.gms.safetynet.AttestationData;

public interface zzls
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzls
    {

        public static zzls zzcA(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
            if(iinterface != null && (iinterface instanceof zzls))
                return (zzls)iinterface;
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
                parcel1.writeString("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                if(parcel.readInt() != 0)
                    parcel1 = Status.CREATOR.createFromParcel(parcel);
                else
                    parcel1 = null;
                if(parcel.readInt() != 0)
                    parcel = (AttestationData)AttestationData.CREATOR.createFromParcel(parcel);
                else
                    parcel = null;
                zza(parcel1, parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                zzdr(parcel.readString());
                return true;
            }
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
        }
    }

    private static class zza.zza
        implements zzls
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zza(Status status, AttestationData attestationdata)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
            if(status == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L3:
            if(attestationdata == null)
                break MISSING_BLOCK_LABEL_74;
            parcel.writeInt(1);
            attestationdata.writeToParcel(parcel, 0);
_L4:
            zzlW.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            status;
            parcel.recycle();
            throw status;
            parcel.writeInt(0);
              goto _L4
        }

        public void zzdr(String s)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
            parcel.writeString(s);
            zzlW.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void zza(Status status, AttestationData attestationdata)
        throws RemoteException;

    public abstract void zzdr(String s)
        throws RemoteException;
}
