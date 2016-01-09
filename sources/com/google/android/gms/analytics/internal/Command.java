// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;

public class Command
    implements Parcelable
{

    public Command()
    {
    }

    Command(Parcel parcel)
    {
        readFromParcel(parcel);
    }

    private void readFromParcel(Parcel parcel)
    {
        zzGM = parcel.readString();
        zzGN = parcel.readString();
        mValue = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getId()
    {
        return zzGM;
    }

    public String getValue()
    {
        return mValue;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(zzGM);
        parcel.writeString(zzGN);
        parcel.writeString(mValue);
    }

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Object createFromParcel(Parcel parcel)
        {
            return zzm(parcel);
        }

        public Object[] newArray(int i)
        {
            return zzR(i);
        }

        public Command[] zzR(int i)
        {
            return new Command[i];
        }

        public Command zzm(Parcel parcel)
        {
            return new Command(parcel);
        }

    }
;
    private String mValue;
    private String zzGM;
    private String zzGN;

}
