// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.appstate;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;

// Referenced classes of package com.google.android.gms.appstate:
//            AppState, zza

public final class zzb extends zzc
    implements AppState
{

    zzb(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public boolean equals(Object obj)
    {
        return zza.zza(this, obj);
    }

    public Object freeze()
    {
        return zzjK();
    }

    public byte[] getConflictData()
    {
        return getByteArray("conflict_data");
    }

    public String getConflictVersion()
    {
        return getString("conflict_version");
    }

    public int getKey()
    {
        return getInteger("key");
    }

    public byte[] getLocalData()
    {
        return getByteArray("local_data");
    }

    public String getLocalVersion()
    {
        return getString("local_version");
    }

    public boolean hasConflict()
    {
        return !zzbH("conflict_version");
    }

    public int hashCode()
    {
        return zza.zza(this);
    }

    public String toString()
    {
        return zza.zzb(this);
    }

    public AppState zzjK()
    {
        return new zza(this);
    }
}
