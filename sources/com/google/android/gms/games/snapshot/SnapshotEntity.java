// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            Snapshot, SnapshotEntityCreator, SnapshotMetadataEntity, SnapshotContentsEntity, 
//            SnapshotMetadata, SnapshotContents

public final class SnapshotEntity
    implements SafeParcelable, Snapshot
{

    SnapshotEntity(int i, SnapshotMetadata snapshotmetadata, SnapshotContentsEntity snapshotcontentsentity)
    {
        zzzH = i;
        zzaow = new SnapshotMetadataEntity(snapshotmetadata);
        zzaox = snapshotcontentsentity;
    }

    public SnapshotEntity(SnapshotMetadata snapshotmetadata, SnapshotContentsEntity snapshotcontentsentity)
    {
        this(2, snapshotmetadata, snapshotcontentsentity);
    }

    private boolean isClosed()
    {
        return zzaox.isClosed();
    }

    static boolean zza(Snapshot snapshot, Object obj)
    {
        boolean flag1 = true;
        if(obj instanceof Snapshot) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(snapshot == obj) goto _L4; else goto _L3
_L3:
        obj = (Snapshot)obj;
        if(!zzu.equal(((Snapshot) (obj)).getMetadata(), snapshot.getMetadata()))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(((Snapshot) (obj)).getSnapshotContents(), snapshot.getSnapshotContents())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static int zzb(Snapshot snapshot)
    {
        return zzu.hashCode(new Object[] {
            snapshot.getMetadata(), snapshot.getSnapshotContents()
        });
    }

    static String zzc(Snapshot snapshot)
    {
        com.google.android.gms.common.internal.zzu.zza zza1 = zzu.zzq(snapshot).zzg("Metadata", snapshot.getMetadata());
        boolean flag;
        if(snapshot.getSnapshotContents() != null)
            flag = true;
        else
            flag = false;
        return zza1.zzg("HasContents", Boolean.valueOf(flag)).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public Snapshot freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public SnapshotMetadata getMetadata()
    {
        return zzaow;
    }

    public SnapshotContents getSnapshotContents()
    {
        if(isClosed())
            return null;
        else
            return zzaox;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzb(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return zzc(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        SnapshotEntityCreator.zza(this, parcel, i);
    }

    public static final SnapshotEntityCreator CREATOR = new SnapshotEntityCreator();
    private final SnapshotMetadataEntity zzaow;
    private final SnapshotContentsEntity zzaox;
    private final int zzzH;

}
