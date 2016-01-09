// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.*;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zze;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            AncsNotificationParcelable, CapabilityInfoParcelable, ChannelEventParcelable, MessageEventParcelable, 
//            NodeParcelable

public interface zzas
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzas
    {

        public static zzas zzcT(IBinder ibinder)
        {
            if(ibinder == null)
                return null;
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            if(iinterface != null && (iinterface instanceof zzas))
                return (zzas)iinterface;
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
            Object obj1 = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj = null;
            switch(i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.wearable.internal.IWearableListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj;
                if(parcel.readInt() != 0)
                    parcel1 = DataHolder.CREATOR.zzC(parcel);
                zzac(parcel1);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj1;
                if(parcel.readInt() != 0)
                    parcel1 = (MessageEventParcelable)MessageEventParcelable.CREATOR.createFromParcel(parcel);
                zza(parcel1);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj2;
                if(parcel.readInt() != 0)
                    parcel1 = (NodeParcelable)NodeParcelable.CREATOR.createFromParcel(parcel);
                zza(parcel1);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj3;
                if(parcel.readInt() != 0)
                    parcel1 = (NodeParcelable)NodeParcelable.CREATOR.createFromParcel(parcel);
                zzb(parcel1);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                onConnectedNodes(parcel.createTypedArrayList(NodeParcelable.CREATOR));
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj4;
                if(parcel.readInt() != 0)
                    parcel1 = (AncsNotificationParcelable)AncsNotificationParcelable.CREATOR.createFromParcel(parcel);
                zza(parcel1);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj5;
                if(parcel.readInt() != 0)
                    parcel1 = (ChannelEventParcelable)ChannelEventParcelable.CREATOR.createFromParcel(parcel);
                zza(parcel1);
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj6;
                break;
            }
            if(parcel.readInt() != 0)
                parcel1 = (CapabilityInfoParcelable)CapabilityInfoParcelable.CREATOR.createFromParcel(parcel);
            zza(parcel1);
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.wearable.internal.IWearableListener");
        }
    }

    private static class zza.zza
        implements zzas
    {

        public IBinder asBinder()
        {
            return zzlW;
        }

        public void onConnectedNodes(List list)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            parcel.writeTypedList(list);
            zzlW.transact(5, parcel, null, 1);
            parcel.recycle();
            return;
            list;
            parcel.recycle();
            throw list;
        }

        public void zza(AncsNotificationParcelable ancsnotificationparcelable)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if(ancsnotificationparcelable == null)
                break MISSING_BLOCK_LABEL_45;
            parcel.writeInt(1);
            ancsnotificationparcelable.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(6, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            ancsnotificationparcelable;
            parcel.recycle();
            throw ancsnotificationparcelable;
        }

        public void zza(CapabilityInfoParcelable capabilityinfoparcelable)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if(capabilityinfoparcelable == null)
                break MISSING_BLOCK_LABEL_45;
            parcel.writeInt(1);
            capabilityinfoparcelable.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(8, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            capabilityinfoparcelable;
            parcel.recycle();
            throw capabilityinfoparcelable;
        }

        public void zza(ChannelEventParcelable channeleventparcelable)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if(channeleventparcelable == null)
                break MISSING_BLOCK_LABEL_45;
            parcel.writeInt(1);
            channeleventparcelable.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(7, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            channeleventparcelable;
            parcel.recycle();
            throw channeleventparcelable;
        }

        public void zza(MessageEventParcelable messageeventparcelable)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if(messageeventparcelable == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            messageeventparcelable.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            messageeventparcelable;
            parcel.recycle();
            throw messageeventparcelable;
        }

        public void zza(NodeParcelable nodeparcelable)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if(nodeparcelable == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            nodeparcelable.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            nodeparcelable;
            parcel.recycle();
            throw nodeparcelable;
        }

        public void zzac(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if(dataholder == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel.recycle();
            throw dataholder;
        }

        public void zzb(NodeParcelable nodeparcelable)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if(nodeparcelable == null)
                break MISSING_BLOCK_LABEL_44;
            parcel.writeInt(1);
            nodeparcelable.writeToParcel(parcel, 0);
_L1:
            zzlW.transact(4, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            nodeparcelable;
            parcel.recycle();
            throw nodeparcelable;
        }

        private IBinder zzlW;

        zza.zza(IBinder ibinder)
        {
            zzlW = ibinder;
        }
    }


    public abstract void onConnectedNodes(List list)
        throws RemoteException;

    public abstract void zza(AncsNotificationParcelable ancsnotificationparcelable)
        throws RemoteException;

    public abstract void zza(CapabilityInfoParcelable capabilityinfoparcelable)
        throws RemoteException;

    public abstract void zza(ChannelEventParcelable channeleventparcelable)
        throws RemoteException;

    public abstract void zza(MessageEventParcelable messageeventparcelable)
        throws RemoteException;

    public abstract void zza(NodeParcelable nodeparcelable)
        throws RemoteException;

    public abstract void zzac(DataHolder dataholder)
        throws RemoteException;

    public abstract void zzb(NodeParcelable nodeparcelable)
        throws RemoteException;
}
