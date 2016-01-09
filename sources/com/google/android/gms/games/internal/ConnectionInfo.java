// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.games.internal:
//            ConnectionInfoCreator

public class ConnectionInfo
    implements SafeParcelable
{

    public ConnectionInfo(int i, String s, int j)
    {
        zzzH = i;
        zzahI = s;
        zzahJ = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ConnectionInfoCreator.zza(this, parcel, i);
    }

    public String zzqA()
    {
        return zzahI;
    }

    public int zzqB()
    {
        return zzahJ;
    }

    public static final ConnectionInfoCreator CREATOR = new ConnectionInfoCreator();
    private final String zzahI;
    private final int zzahJ;
    private final int zzzH;

}
