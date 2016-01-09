// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceReportCreator;
import com.google.android.gms.location.places.PlaceRequest;
import com.google.android.gms.location.places.zzc;
import com.google.android.gms.location.places.zzd;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlacesParams, zzg, zzp

public interface zze
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zze
    {

        public static zze zzbk(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
            if(iinterface != null && (iinterface instanceof zze))
                return (zze)iinterface;
            else
                return new zza(ibinder);
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            PendingIntent pendingintent = null;
            Object obj = null;
            switch(i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                PlaceRequest placerequest;
                if(parcel.readInt() != 0)
                    placerequest = PlaceRequest.CREATOR.zzdO(parcel);
                else
                    placerequest = null;
                if(parcel.readInt() != 0)
                    obj = PlacesParams.CREATOR.zzdU(parcel);
                else
                    obj = null;
                if(parcel.readInt() != 0)
                    pendingintent = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                else
                    pendingintent = null;
                zza(placerequest, ((PlacesParams) (obj)), pendingintent, zzg.zza.zzbm(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                PlacesParams placesparams;
                if(parcel.readInt() != 0)
                    placesparams = PlacesParams.CREATOR.zzdU(parcel);
                else
                    placesparams = null;
                if(parcel.readInt() != 0)
                    obj = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                else
                    obj = null;
                zza(placesparams, ((PendingIntent) (obj)), zzg.zza.zzbm(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                NearbyAlertRequest nearbyalertrequest;
                if(parcel.readInt() != 0)
                    nearbyalertrequest = NearbyAlertRequest.CREATOR.zzdM(parcel);
                else
                    nearbyalertrequest = null;
                if(parcel.readInt() != 0)
                    obj = PlacesParams.CREATOR.zzdU(parcel);
                else
                    obj = null;
                if(parcel.readInt() != 0)
                    pendingintent = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                else
                    pendingintent = null;
                zza(nearbyalertrequest, ((PlacesParams) (obj)), pendingintent, zzg.zza.zzbm(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                PlacesParams placesparams1;
                if(parcel.readInt() != 0)
                    placesparams1 = PlacesParams.CREATOR.zzdU(parcel);
                else
                    placesparams1 = null;
                if(parcel.readInt() != 0)
                    obj = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
                else
                    obj = null;
                zzb(placesparams1, ((PendingIntent) (obj)), zzg.zza.zzbm(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                PlaceFilter placefilter;
                if(parcel.readInt() != 0)
                    placefilter = PlaceFilter.CREATOR.zzdN(parcel);
                else
                    placefilter = null;
                if(parcel.readInt() != 0)
                    obj = PlacesParams.CREATOR.zzdU(parcel);
                zza(placefilter, ((PlacesParams) (obj)), zzg.zza.zzbm(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                break;
            }
            PlaceReport placereport;
            if(parcel.readInt() != 0)
                placereport = PlaceReport.CREATOR.createFromParcel(parcel);
            else
                placereport = null;
            obj = pendingintent;
            if(parcel.readInt() != 0)
                obj = PlacesParams.CREATOR.zzdU(parcel);
            zza(placereport, ((PlacesParams) (obj)), zzg.zza.zzbm(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }

    private static class zza.zza
        implements zze
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void zza(NearbyAlertRequest nearbyalertrequest, PlacesParams placesparams, PendingIntent pendingintent, zzg zzg1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
            if(nearbyalertrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            nearbyalertrequest.writeToParcel(parcel, 0);
_L7:
            if(placesparams == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            placesparams.writeToParcel(parcel, 0);
_L8:
            if(pendingintent == null) goto _L6; else goto _L5
_L5:
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L9:
            if(zzg1 == null)
                break MISSING_BLOCK_LABEL_159;
            nearbyalertrequest = zzg1.asBinder();
_L10:
            parcel.writeStrongBinder(nearbyalertrequest);
            zzlW.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L7
            nearbyalertrequest;
            parcel1.recycle();
            parcel.recycle();
            throw nearbyalertrequest;
_L4:
            parcel.writeInt(0);
              goto _L8
_L6:
            parcel.writeInt(0);
              goto _L9
            nearbyalertrequest = null;
              goto _L10
        }

        public void zza(PlaceFilter placefilter, PlacesParams placesparams, zzg zzg1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
            if(placefilter == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            placefilter.writeToParcel(parcel, 0);
_L5:
            if(placesparams == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            placesparams.writeToParcel(parcel, 0);
_L6:
            if(zzg1 == null)
                break MISSING_BLOCK_LABEL_132;
            placefilter = zzg1.asBinder();
_L7:
            parcel.writeStrongBinder(placefilter);
            zzlW.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L5
            placefilter;
            parcel1.recycle();
            parcel.recycle();
            throw placefilter;
_L4:
            parcel.writeInt(0);
              goto _L6
            placefilter = null;
              goto _L7
        }

        public void zza(PlaceReport placereport, PlacesParams placesparams, zzg zzg1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
            if(placereport == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            placereport.writeToParcel(parcel, 0);
_L5:
            if(placesparams == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            placesparams.writeToParcel(parcel, 0);
_L6:
            if(zzg1 == null)
                break MISSING_BLOCK_LABEL_132;
            placereport = zzg1.asBinder();
_L7:
            parcel.writeStrongBinder(placereport);
            zzlW.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L5
            placereport;
            parcel1.recycle();
            parcel.recycle();
            throw placereport;
_L4:
            parcel.writeInt(0);
              goto _L6
            placereport = null;
              goto _L7
        }

        public void zza(PlaceRequest placerequest, PlacesParams placesparams, PendingIntent pendingintent, zzg zzg1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
            if(placerequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            placerequest.writeToParcel(parcel, 0);
_L7:
            if(placesparams == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            placesparams.writeToParcel(parcel, 0);
_L8:
            if(pendingintent == null) goto _L6; else goto _L5
_L5:
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L9:
            if(zzg1 == null)
                break MISSING_BLOCK_LABEL_159;
            placerequest = zzg1.asBinder();
_L10:
            parcel.writeStrongBinder(placerequest);
            zzlW.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L7
            placerequest;
            parcel1.recycle();
            parcel.recycle();
            throw placerequest;
_L4:
            parcel.writeInt(0);
              goto _L8
_L6:
            parcel.writeInt(0);
              goto _L9
            placerequest = null;
              goto _L10
        }

        public void zza(PlacesParams placesparams, PendingIntent pendingintent, zzg zzg1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
            if(placesparams == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            placesparams.writeToParcel(parcel, 0);
_L5:
            if(pendingintent == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L6:
            if(zzg1 == null)
                break MISSING_BLOCK_LABEL_131;
            placesparams = zzg1.asBinder();
_L7:
            parcel.writeStrongBinder(placesparams);
            zzlW.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L5
            placesparams;
            parcel1.recycle();
            parcel.recycle();
            throw placesparams;
_L4:
            parcel.writeInt(0);
              goto _L6
            placesparams = null;
              goto _L7
        }

        public void zzb(PlacesParams placesparams, PendingIntent pendingintent, zzg zzg1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
            if(placesparams == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            placesparams.writeToParcel(parcel, 0);
_L5:
            if(pendingintent == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            pendingintent.writeToParcel(parcel, 0);
_L6:
            if(zzg1 == null)
                break MISSING_BLOCK_LABEL_131;
            placesparams = zzg1.asBinder();
_L7:
            parcel.writeStrongBinder(placesparams);
            zzlW.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L5
            placesparams;
            parcel1.recycle();
            parcel.recycle();
            throw placesparams;
_L4:
            parcel.writeInt(0);
              goto _L6
            placesparams = null;
              goto _L7
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void zza(NearbyAlertRequest nearbyalertrequest, PlacesParams placesparams, PendingIntent pendingintent, zzg zzg)
        throws RemoteException;

    public abstract void zza(PlaceFilter placefilter, PlacesParams placesparams, zzg zzg)
        throws RemoteException;

    public abstract void zza(PlaceReport placereport, PlacesParams placesparams, zzg zzg)
        throws RemoteException;

    public abstract void zza(PlaceRequest placerequest, PlacesParams placesparams, PendingIntent pendingintent, zzg zzg)
        throws RemoteException;

    public abstract void zza(PlacesParams placesparams, PendingIntent pendingintent, zzg zzg)
        throws RemoteException;

    public abstract void zzb(PlacesParams placesparams, PendingIntent pendingintent, zzg zzg)
        throws RemoteException;
}
