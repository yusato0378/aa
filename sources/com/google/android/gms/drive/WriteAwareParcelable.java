// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zzv;

public abstract class WriteAwareParcelable
    implements Parcelable
{

    public WriteAwareParcelable()
    {
        zzWJ = false;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag;
        if(!zznG())
            flag = true;
        else
            flag = false;
        zzv.zzP(flag);
        zzWJ = true;
        zzI(parcel, i);
    }

    protected abstract void zzI(Parcel parcel, int i);

    public final boolean zznG()
    {
        return zzWJ;
    }

    private volatile transient boolean zzWJ;
}
