// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.zzb;
import com.google.android.gms.drive.query.internal.Operator;
import com.google.android.gms.drive.query.internal.zzf;
import java.util.Iterator;
import java.util.List;

public class zzc
    implements zzf
{

    public zzc()
    {
    }

    public String zza(zzb zzb1, Object obj)
    {
        return String.format("contains(%s,%s)", new Object[] {
            zzb1.getName(), obj
        });
    }

    public String zza(Operator operator, MetadataField metadatafield, Object obj)
    {
        return String.format("cmp(%s,%s,%s)", new Object[] {
            operator.getTag(), metadatafield.getName(), obj
        });
    }

    public String zza(Operator operator, List list)
    {
        StringBuilder stringbuilder = new StringBuilder((new StringBuilder()).append(operator.getTag()).append("(").toString());
        list = list.iterator();
        for(operator = ""; list.hasNext(); operator = ",")
        {
            String s = (String)list.next();
            stringbuilder.append(operator);
            stringbuilder.append(s);
        }

        return stringbuilder.append(")").toString();
    }

    public Object zzb(zzb zzb1, Object obj)
    {
        return zza(zzb1, obj);
    }

    public Object zzb(Operator operator, MetadataField metadatafield, Object obj)
    {
        return zza(operator, metadatafield, obj);
    }

    public Object zzb(Operator operator, List list)
    {
        return zza(operator, list);
    }

    public String zzc(MetadataField metadatafield, Object obj)
    {
        return String.format("has(%s,%s)", new Object[] {
            metadatafield.getName(), obj
        });
    }

    public String zzch(String s)
    {
        return String.format("not(%s)", new Object[] {
            s
        });
    }

    public String zzci(String s)
    {
        return String.format("fullTextSearch(%s)", new Object[] {
            s
        });
    }

    public Object zzcj(String s)
    {
        return zzci(s);
    }

    public Object zzd(MetadataField metadatafield, Object obj)
    {
        return zzc(metadatafield, obj);
    }

    public String zzd(MetadataField metadatafield)
    {
        return String.format("fieldOnly(%s)", new Object[] {
            metadatafield.getName()
        });
    }

    public Object zze(MetadataField metadatafield)
    {
        return zzd(metadatafield);
    }

    public String zzop()
    {
        return "all()";
    }

    public String zzoq()
    {
        return "ownedByMe()";
    }

    public Object zzor()
    {
        return zzoq();
    }

    public Object zzos()
    {
        return zzop();
    }

    public Object zzs(Object obj)
    {
        return zzch((String)obj);
    }
}
