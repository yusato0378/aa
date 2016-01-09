// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;

// Referenced classes of package com.google.android.gms.plus.internal.model.moments:
//            MomentEntity, zzb

public final class zzc extends com.google.android.gms.common.data.zzc
    implements Moment
{

    public zzc(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    private MomentEntity zzvO()
    {
        this;
        JVM INSTR monitorenter ;
        if(zzaAA == null)
        {
            byte abyte0[] = getByteArray("momentImpl");
            Parcel parcel = Parcel.obtain();
            parcel.unmarshall(abyte0, 0, abyte0.length);
            parcel.setDataPosition(0);
            zzaAA = MomentEntity.CREATOR.zzeT(parcel);
            parcel.recycle();
        }
        this;
        JVM INSTR monitorexit ;
        return zzaAA;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object freeze()
    {
        return zzvN();
    }

    public String getId()
    {
        return zzvO().getId();
    }

    public ItemScope getResult()
    {
        return zzvO().getResult();
    }

    public String getStartDate()
    {
        return zzvO().getStartDate();
    }

    public ItemScope getTarget()
    {
        return zzvO().getTarget();
    }

    public String getType()
    {
        return zzvO().getType();
    }

    public boolean hasId()
    {
        return zzvO().hasId();
    }

    public boolean hasResult()
    {
        return zzvO().hasResult();
    }

    public boolean hasStartDate()
    {
        return zzvO().hasStartDate();
    }

    public boolean hasTarget()
    {
        return zzvO().hasTarget();
    }

    public boolean hasType()
    {
        return zzvO().hasType();
    }

    public MomentEntity zzvN()
    {
        return zzvO();
    }

    private MomentEntity zzaAA;
}
