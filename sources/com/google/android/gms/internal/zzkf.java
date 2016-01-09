// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//            zzkm, zzkg, zzki

public final class zzkf
    implements zzkm
{

    public zzkf()
    {
    }

    public void zzb(zzkg zzkg1)
    {
        Object obj = new ArrayList(zzkg1.zzua());
        Collections.sort(((List) (obj)), new Comparator() {

            public int compare(Object obj1, Object obj2)
            {
                return zza((zzki)obj1, (zzki)obj2);
            }

            public int zza(zzki zzki1, zzki zzki2)
            {
                return zzki1.getClass().getCanonicalName().compareTo(zzki2.getClass().getCanonicalName());
            }

            final zzkf zzavW;

            
            {
                zzavW = zzkf.this;
                super();
            }
        }
);
        zzkg1 = new StringBuilder();
        obj = ((List) (obj)).iterator();
        do
        {
            if(!((Iterator) (obj)).hasNext())
                break;
            String s = ((zzki)((Iterator) (obj)).next()).toString();
            if(!TextUtils.isEmpty(s))
            {
                if(zzkg1.length() != 0)
                    zzkg1.append(", ");
                zzkg1.append(s);
            }
        } while(true);
        zzavV.println(zzkg1.toString());
    }

    public Uri zzfR()
    {
        return zzavU;
    }

    private static final Uri zzavU;
    private final LogPrinter zzavV = new LogPrinter(4, "GA/LogCatTransport");

    static 
    {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        zzavU = builder.build();
    }
}
