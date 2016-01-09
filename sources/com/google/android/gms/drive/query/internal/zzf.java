// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.zzb;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            Operator

public interface zzf
{

    public abstract Object zzb(zzb zzb1, Object obj);

    public abstract Object zzb(Operator operator, MetadataField metadatafield, Object obj);

    public abstract Object zzb(Operator operator, List list);

    public abstract Object zzcj(String s);

    public abstract Object zzd(MetadataField metadatafield, Object obj);

    public abstract Object zze(MetadataField metadatafield);

    public abstract Object zzor();

    public abstract Object zzos();

    public abstract Object zzs(Object obj);
}
