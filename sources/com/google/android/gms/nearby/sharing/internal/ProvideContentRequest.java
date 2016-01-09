// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.nearby.sharing.internal:
//            zzf, zzc, zzb

public final class ProvideContentRequest
    implements SafeParcelable
{

    ProvideContentRequest()
    {
        versionCode = 1;
    }

    ProvideContentRequest(int i, IBinder ibinder, IBinder ibinder1, List list, long l, IBinder ibinder2)
    {
        versionCode = i;
        zzayb = ibinder;
        zzayc = zzb.zza.zzcm(ibinder1);
        zzayd = list;
        zzaye = l;
        zzayf = zzc.zza.zzcn(ibinder2);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf.zza(this, parcel, i);
    }

    IBinder zzve()
    {
        return zzayf.asBinder();
    }

    IBinder zzvm()
    {
        if(zzayc == null)
            return null;
        else
            return zzayc.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzf();
    final int versionCode;
    public IBinder zzayb;
    public zzb zzayc;
    public List zzayd;
    public long zzaye;
    public zzc zzayf;

}
