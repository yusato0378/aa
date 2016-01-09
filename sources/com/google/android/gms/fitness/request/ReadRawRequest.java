// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzji;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzq

public class ReadRawRequest
    implements SafeParcelable
{

    ReadRawRequest(int i, IBinder ibinder, String s, List list, boolean flag, boolean flag1)
    {
        zzzH = i;
        zzafi = com.google.android.gms.internal.zzji.zza.zzaO(ibinder);
        zzafj = list;
        zzJd = s;
        zzaeT = flag;
        zzaeU = flag1;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getPackageName()
    {
        return zzJd;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzq.zza(this, parcel, i);
    }

    public IBinder zzpf()
    {
        if(zzafi != null)
            return zzafi.asBinder();
        else
            return null;
    }

    public boolean zzpk()
    {
        return zzaeU;
    }

    public boolean zzpl()
    {
        return zzaeT;
    }

    public List zzpq()
    {
        return zzafj;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzq();
    private final String zzJd;
    private final boolean zzaeT;
    private final boolean zzaeU;
    private final zzji zzafi;
    private final List zzafj;
    private final int zzzH;

}
