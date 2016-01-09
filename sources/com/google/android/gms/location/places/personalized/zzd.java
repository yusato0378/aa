// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places.personalized;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.location.places.personalized:
//            PlaceUserData

public final class zzd extends com.google.android.gms.common.data.zzd
    implements Result
{

    public zzd(DataHolder dataholder)
    {
        this(dataholder, new Status(dataholder.getStatusCode()));
    }

    private zzd(DataHolder dataholder, Status status)
    {
        super(dataholder, PlaceUserData.CREATOR);
        boolean flag;
        if(dataholder == null || dataholder.getStatusCode() == status.getStatusCode())
            flag = true;
        else
            flag = false;
        zzv.zzQ(flag);
        zzKr = status;
    }

    public static zzd zzaE(Status status)
    {
        return new zzd(null, status);
    }

    public Status getStatus()
    {
        return zzKr;
    }

    private final Status zzKr;
}
