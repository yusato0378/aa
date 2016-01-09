// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.zzj;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            zzig

public class zzij extends zzj
{

    private zzij()
    {
        super("driveId", Arrays.asList(new String[] {
            "sqlId", "resourceId", "mimeType"
        }), Arrays.asList(new String[] {
            "dbInstanceId"
        }), 0x3e8fa0);
    }

    protected Object zzc(DataHolder dataholder, int i, int j)
    {
        return zzm(dataholder, i, j);
    }

    protected DriveId zzm(DataHolder dataholder, int i, int j)
    {
        long l = dataholder.zzlm().getLong("dbInstanceId");
        int k;
        if("application/vnd.google-apps.folder".equals(dataholder.zzd(zzig.zzaac.getName(), i, j)))
            k = 1;
        else
            k = 0;
        return new DriveId(dataholder.zzd("resourceId", i, j), Long.valueOf(dataholder.zzb("sqlId", i, j)).longValue(), l, k);
    }

    public static final zzij zzaaz = new zzij();

}
