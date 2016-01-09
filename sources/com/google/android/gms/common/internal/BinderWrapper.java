// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common.internal;

import android.os.*;

public final class BinderWrapper
    implements Parcelable
{

    public BinderWrapper()
    {
        zzSU = null;
    }

    public BinderWrapper(IBinder ibinder)
    {
        zzSU = null;
        zzSU = ibinder;
    }

    private BinderWrapper(Parcel parcel)
    {
        zzSU = null;
        zzSU = parcel.readStrongBinder();
    }


    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeStrongBinder(zzSU);
    }

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Object createFromParcel(Parcel parcel)
        {
            return zzF(parcel);
        }

        public Object[] newArray(int i)
        {
            return zzaM(i);
        }

        public BinderWrapper zzF(Parcel parcel)
        {
            return new BinderWrapper(parcel);
        }

        public BinderWrapper[] zzaM(int i)
        {
            return new BinderWrapper[i];
        }

    }
;
    private IBinder zzSU;

}
