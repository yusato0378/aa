// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.fitness.request.*;

public interface zzjg
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzjg
    {

        public static zzjg zzaM(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
            if(iinterface != null && (iinterface instanceof zzjg))
                return (zzjg)iinterface;
            else
                return new zza(ibinder);
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            Object obj1 = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj = null;
            switch(i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                parcel1 = obj;
                if(parcel.readInt() != 0)
                    parcel1 = (SessionStartRequest)SessionStartRequest.CREATOR.createFromParcel(parcel);
                zza(parcel1);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                parcel1 = obj1;
                if(parcel.readInt() != 0)
                    parcel1 = (SessionStopRequest)SessionStopRequest.CREATOR.createFromParcel(parcel);
                zza(parcel1);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                parcel1 = obj2;
                if(parcel.readInt() != 0)
                    parcel1 = (SessionInsertRequest)SessionInsertRequest.CREATOR.createFromParcel(parcel);
                zza(parcel1);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                parcel1 = obj3;
                if(parcel.readInt() != 0)
                    parcel1 = (SessionReadRequest)SessionReadRequest.CREATOR.createFromParcel(parcel);
                zza(parcel1);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                parcel1 = obj4;
                if(parcel.readInt() != 0)
                    parcel1 = (SessionRegistrationRequest)SessionRegistrationRequest.CREATOR.createFromParcel(parcel);
                zza(parcel1);
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                parcel1 = obj5;
                break;
            }
            if(parcel.readInt() != 0)
                parcel1 = (SessionUnregistrationRequest)SessionUnregistrationRequest.CREATOR.createFromParcel(parcel);
            zza(parcel1);
            return true;
        }
    }

    private static class zza.zza
        implements zzjg
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zza(SessionInsertRequest sessioninsertrequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
            if(sessioninsertrequest == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            sessioninsertrequest.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            sessioninsertrequest;
            parcel.recycle();
            throw sessioninsertrequest;
        }

        public void zza(SessionReadRequest sessionreadrequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
            if(sessionreadrequest == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            sessionreadrequest.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(4, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            sessionreadrequest;
            parcel.recycle();
            throw sessionreadrequest;
        }

        public void zza(SessionRegistrationRequest sessionregistrationrequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
            if(sessionregistrationrequest == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            sessionregistrationrequest.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(5, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            sessionregistrationrequest;
            parcel.recycle();
            throw sessionregistrationrequest;
        }

        public void zza(SessionStartRequest sessionstartrequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
            if(sessionstartrequest == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            sessionstartrequest.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            sessionstartrequest;
            parcel.recycle();
            throw sessionstartrequest;
        }

        public void zza(SessionStopRequest sessionstoprequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
            if(sessionstoprequest == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            sessionstoprequest.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            sessionstoprequest;
            parcel.recycle();
            throw sessionstoprequest;
        }

        public void zza(SessionUnregistrationRequest sessionunregistrationrequest)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
            if(sessionunregistrationrequest == null)
                break MISSING_BLOCK_LABEL_45;
            parcel.writeInt(1);
            sessionunregistrationrequest.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(6, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            sessionunregistrationrequest;
            parcel.recycle();
            throw sessionunregistrationrequest;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void zza(SessionInsertRequest sessioninsertrequest)
        throws RemoteException;

    public abstract void zza(SessionReadRequest sessionreadrequest)
        throws RemoteException;

    public abstract void zza(SessionRegistrationRequest sessionregistrationrequest)
        throws RemoteException;

    public abstract void zza(SessionStartRequest sessionstartrequest)
        throws RemoteException;

    public abstract void zza(SessionStopRequest sessionstoprequest)
        throws RemoteException;

    public abstract void zza(SessionUnregistrationRequest sessionunregistrationrequest)
        throws RemoteException;
}
