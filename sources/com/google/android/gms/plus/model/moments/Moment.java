// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.plus.internal.model.moments.ItemScopeEntity;
import com.google.android.gms.plus.internal.model.moments.MomentEntity;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.model.moments:
//            ItemScope

public interface Moment
    extends Freezable
{
    public static class Builder
    {

        public Moment build()
        {
            return new MomentEntity(zzazD, zzGM, zzaAy, zzaAq, zzaAz, zzAV);
        }

        public Builder setId(String s)
        {
            zzGM = s;
            zzazD.add(Integer.valueOf(2));
            return this;
        }

        public Builder setResult(ItemScope itemscope)
        {
            zzaAy = (ItemScopeEntity)itemscope;
            zzazD.add(Integer.valueOf(4));
            return this;
        }

        public Builder setStartDate(String s)
        {
            zzaAq = s;
            zzazD.add(Integer.valueOf(5));
            return this;
        }

        public Builder setTarget(ItemScope itemscope)
        {
            zzaAz = (ItemScopeEntity)itemscope;
            zzazD.add(Integer.valueOf(6));
            return this;
        }

        public Builder setType(String s)
        {
            zzAV = s;
            zzazD.add(Integer.valueOf(7));
            return this;
        }

        private String zzAV;
        private String zzGM;
        private String zzaAq;
        private ItemScopeEntity zzaAy;
        private ItemScopeEntity zzaAz;
        private final Set zzazD = new HashSet();

        public Builder()
        {
        }
    }


    public abstract String getId();

    public abstract ItemScope getResult();

    public abstract String getStartDate();

    public abstract ItemScope getTarget();

    public abstract String getType();

    public abstract boolean hasId();

    public abstract boolean hasResult();

    public abstract boolean hasStartDate();

    public abstract boolean hasTarget();

    public abstract boolean hasType();
}
