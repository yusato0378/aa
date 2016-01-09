// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.snapshot;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadataRef, SnapshotMetadata

public final class SnapshotMetadataBuffer extends AbstractDataBuffer
{

    public SnapshotMetadataBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    public SnapshotMetadata get(int i)
    {
        return new SnapshotMetadataRef(zzPy, i);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }
}
