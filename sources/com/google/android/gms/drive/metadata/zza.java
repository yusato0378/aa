// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.metadata;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.*;

// Referenced classes of package com.google.android.gms.drive.metadata:
//            MetadataField

public abstract class zza
    implements MetadataField
{

    protected zza(String s, int i)
    {
        zzZv = (String)zzv.zzb(s, "fieldName");
        zzZw = Collections.singleton(s);
        zzZx = Collections.emptySet();
        zzZy = i;
    }

    protected zza(String s, Collection collection, Collection collection1, int i)
    {
        zzZv = (String)zzv.zzb(s, "fieldName");
        zzZw = Collections.unmodifiableSet(new HashSet(collection));
        zzZx = Collections.unmodifiableSet(new HashSet(collection1));
        zzZy = i;
    }

    public final String getName()
    {
        return zzZv;
    }

    public String toString()
    {
        return zzZv;
    }

    public final Object zza(DataHolder dataholder, int i, int j)
    {
        if(zzb(dataholder, i, j))
            return zzc(dataholder, i, j);
        else
            return null;
    }

    protected abstract void zza(Bundle bundle, Object obj);

    public final void zza(DataHolder dataholder, MetadataBundle metadatabundle, int i, int j)
    {
        zzv.zzb(dataholder, "dataHolder");
        zzv.zzb(metadatabundle, "bundle");
        if(zzb(dataholder, i, j))
            metadatabundle.zzb(this, zzc(dataholder, i, j));
    }

    public final void zza(Object obj, Bundle bundle)
    {
        zzv.zzb(bundle, "bundle");
        if(obj == null)
        {
            bundle.putString(getName(), null);
            return;
        } else
        {
            zza(bundle, obj);
            return;
        }
    }

    protected boolean zzb(DataHolder dataholder, int i, int j)
    {
        for(Iterator iterator = zzZw.iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            if(!dataholder.zzbF(s) || dataholder.zzi(s, i, j))
                return false;
        }

        return true;
    }

    protected abstract Object zzc(DataHolder dataholder, int i, int j);

    public final Object zzi(Bundle bundle)
    {
        zzv.zzb(bundle, "bundle");
        if(bundle.get(getName()) != null)
            return zzj(bundle);
        else
            return null;
    }

    protected abstract Object zzj(Bundle bundle);

    private final String zzZv;
    private final Set zzZw;
    private final Set zzZx;
    private final int zzZy;
}
