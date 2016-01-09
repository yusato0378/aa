// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.internal.service;

import android.os.*;
import com.google.android.gms.fitness.service.FitnessSensorServiceRequest;
import com.google.android.gms.internal.zziy;
import com.google.android.gms.internal.zzjm;

// Referenced classes of package com.google.android.gms.fitness.internal.service:
//            FitnessDataSourcesRequest, FitnessUnregistrationRequest

public interface zzc
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzc
    {

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            Object obj1 = null;
            Object obj2 = null;
            Object obj = null;
            switch(i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
                parcel1 = obj;
                if(parcel.readInt() != 0)
                    parcel1 = (FitnessDataSourcesRequest)FitnessDataSourcesRequest.CREATOR.createFromParcel(parcel);
                zza(parcel1, com.google.android.gms.internal.zziy.zza.zzaE(parcel.readStrongBinder()));
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
                parcel1 = obj1;
                if(parcel.readInt() != 0)
                    parcel1 = (FitnessSensorServiceRequest)FitnessSensorServiceRequest.CREATOR.createFromParcel(parcel);
                zza(parcel1, com.google.android.gms.internal.zzjm.zza.zzaS(parcel.readStrongBinder()));
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
                parcel1 = obj2;
                break;
            }
            if(parcel.readInt() != 0)
                parcel1 = (FitnessUnregistrationRequest)FitnessUnregistrationRequest.CREATOR.createFromParcel(parcel);
            zza(parcel1, com.google.android.gms.internal.zzjm.zza.zzaS(parcel.readStrongBinder()));
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.fitness.internal.service.IFitnessSensorService");
        }
    }


    public abstract void zza(FitnessDataSourcesRequest fitnessdatasourcesrequest, zziy zziy)
        throws RemoteException;

    public abstract void zza(FitnessUnregistrationRequest fitnessunregistrationrequest, zzjm zzjm)
        throws RemoteException;

    public abstract void zza(FitnessSensorServiceRequest fitnesssensorservicerequest, zzjm zzjm)
        throws RemoteException;
}
