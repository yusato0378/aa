// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadataChange, SnapshotMetadataChangeCreator

public final class SnapshotMetadataChangeEntity extends SnapshotMetadataChange
    implements SafeParcelable
{

    SnapshotMetadataChangeEntity()
    {
        this(5, null, null, null, null, null);
    }

    SnapshotMetadataChangeEntity(int i, String s, Long long1, BitmapTeleporter bitmapteleporter, Uri uri, Long long2)
    {
        boolean flag2 = true;
        boolean flag = true;
        super();
        zzzH = i;
        zzadH = s;
        zzaoC = long1;
        zzaoD = bitmapteleporter;
        zzaoB = uri;
        zzaoz = long2;
        if(zzaoD != null)
        {
            if(zzaoB != null)
                flag = false;
            zzv.zza(flag, "Cannot set both a URI and an image");
        } else
        if(zzaoB != null)
        {
            boolean flag1;
            if(zzaoD == null)
                flag1 = flag2;
            else
                flag1 = false;
            zzv.zza(flag1, "Cannot set both a URI and an image");
            return;
        }
    }

    SnapshotMetadataChangeEntity(String s, Long long1, BitmapTeleporter bitmapteleporter, Uri uri, Long long2)
    {
        this(5, s, long1, bitmapteleporter, uri, long2);
    }

    public int describeContents()
    {
        return 0;
    }

    public Bitmap getCoverImage()
    {
        if(zzaoD == null)
            return null;
        else
            return zzaoD.zzln();
    }

    public Uri getCoverImageUri()
    {
        return zzaoB;
    }

    public String getDescription()
    {
        return zzadH;
    }

    public Long getPlayedTimeMillis()
    {
        return zzaoC;
    }

    public Long getProgressValue()
    {
        return zzaoz;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        SnapshotMetadataChangeCreator.zza(this, parcel, i);
    }

    public BitmapTeleporter zzsm()
    {
        return zzaoD;
    }

    public static final SnapshotMetadataChangeCreator CREATOR = new SnapshotMetadataChangeCreator();
    private final String zzadH;
    private final Uri zzaoB;
    private final Long zzaoC;
    private BitmapTeleporter zzaoD;
    private final Long zzaoz;
    private final int zzzH;

}
