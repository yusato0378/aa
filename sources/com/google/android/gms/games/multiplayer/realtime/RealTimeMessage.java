// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zzv;

public final class RealTimeMessage
    implements Parcelable
{

    private RealTimeMessage(Parcel parcel)
    {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }


    public RealTimeMessage(String s, byte abyte0[], int i)
    {
        zzanC = (String)zzv.zzr(s);
        zzanD = (byte[])((byte[])zzv.zzr(abyte0)).clone();
        zzanE = i;
    }

    public int describeContents()
    {
        return 0;
    }

    public byte[] getMessageData()
    {
        return zzanD;
    }

    public String getSenderParticipantId()
    {
        return zzanC;
    }

    public boolean isReliable()
    {
        return zzanE == 1;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(zzanC);
        parcel.writeByteArray(zzanD);
        parcel.writeInt(zzanE);
    }

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Object createFromParcel(Parcel parcel)
        {
            return zzdu(parcel);
        }

        public Object[] newArray(int i)
        {
            return zzfn(i);
        }

        public RealTimeMessage zzdu(Parcel parcel)
        {
            return new RealTimeMessage(parcel);
        }

        public RealTimeMessage[] zzfn(int i)
        {
            return new RealTimeMessage[i];
        }

    }
;
    public static final int RELIABLE = 1;
    public static final int UNRELIABLE = 0;
    private final String zzanC;
    private final byte zzanD[];
    private final int zzanE;

}
