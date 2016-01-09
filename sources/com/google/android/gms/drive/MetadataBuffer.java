// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive;

import android.os.Bundle;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.internal.zzn;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.metadata.internal.zze;
import com.google.android.gms.internal.zzig;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.drive:
//            Metadata

public final class MetadataBuffer extends AbstractDataBuffer
{
    private static class zza extends Metadata
    {

        static int zza(zza zza1)
        {
            return zza1.zzWj;
        }

        public Object freeze()
        {
            return zzny();
        }

        public boolean isDataValid()
        {
            return !zzPy.isClosed();
        }

        public Object zza(MetadataField metadatafield)
        {
            return metadatafield.zza(zzPy, zzWj, zzRx);
        }

        public Metadata zzny()
        {
            MetadataBundle metadatabundle = MetadataBundle.zzok();
            Iterator iterator = zze.zzoj().iterator();
            do
            {
                if(!iterator.hasNext())
                    break;
                MetadataField metadatafield = (MetadataField)iterator.next();
                if(metadatafield != zzig.zzaak)
                    metadatafield.zza(zzPy, metadatabundle, zzWj, zzRx);
            } while(true);
            return new zzn(metadatabundle);
        }

        private final DataHolder zzPy;
        private final int zzRx;
        private final int zzWj;

        public zza(DataHolder dataholder, int i)
        {
            zzPy = dataholder;
            zzWj = i;
            zzRx = dataholder.zzaD(i);
        }
    }


    public MetadataBuffer(DataHolder dataholder)
    {
        super(dataholder);
        dataholder.zzlm().setClassLoader(com/google/android/gms/drive/MetadataBuffer.getClassLoader());
    }

    public Metadata get(int i)
    {
        zza zza1;
label0:
        {
            zza zza2 = zzWi;
            if(zza2 != null)
            {
                zza1 = zza2;
                if(zza.zza(zza2) == i)
                    break label0;
            }
            zza1 = new zza(zzPy, i);
            zzWi = zza1;
        }
        return zza1;
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public String getNextPageToken()
    {
        return null;
    }

    public void release()
    {
        if(zzPy != null)
            zze.zzb(zzPy);
        super.release();
    }

    private zza zzWi;
}
