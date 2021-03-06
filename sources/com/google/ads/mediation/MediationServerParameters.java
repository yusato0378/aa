// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.ads.mediation;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.*;

public abstract class MediationServerParameters
{
    public static final class MappingException extends Exception
    {

        public MappingException(String s)
        {
            super(s);
        }
    }

    protected static interface Parameter
        extends Annotation
    {

        public abstract String name();

        public abstract boolean required();
    }


    public MediationServerParameters()
    {
    }

    public void load(Map map)
        throws MappingException
    {
        Object obj = new HashMap();
        Field afield[] = getClass().getFields();
        int j = afield.length;
        for(int i = 0; i < j; i++)
        {
            Field field1 = afield[i];
            Parameter parameter = (Parameter)field1.getAnnotation(com/google/ads/mediation/MediationServerParameters$Parameter);
            if(parameter != null)
                ((Map) (obj)).put(parameter.name(), field1);
        }

        if(((Map) (obj)).isEmpty())
            zzb.zzan("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        for(map = map.entrySet().iterator(); map.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            Field field2 = (Field)((Map) (obj)).remove(entry.getKey());
            if(field2 != null)
                try
                {
                    field2.set(this, entry.getValue());
                }
                catch(IllegalAccessException illegalaccessexception)
                {
                    zzb.zzan((new StringBuilder()).append("Server option \"").append((String)entry.getKey()).append("\" could not be set: Illegal Access").toString());
                }
                catch(IllegalArgumentException illegalargumentexception)
                {
                    zzb.zzan((new StringBuilder()).append("Server option \"").append((String)entry.getKey()).append("\" could not be set: Bad Type").toString());
                }
            else
                zzb.zzaj((new StringBuilder()).append("Unexpected server option: ").append((String)entry.getKey()).append(" = \"").append((String)entry.getValue()).append("\"").toString());
        }

        map = new StringBuilder();
        obj = ((Map) (obj)).values().iterator();
        do
        {
            if(!((Iterator) (obj)).hasNext())
                break;
            Field field = (Field)((Iterator) (obj)).next();
            if(((Parameter)field.getAnnotation(com/google/ads/mediation/MediationServerParameters$Parameter)).required())
            {
                zzb.zzan((new StringBuilder()).append("Required server option missing: ").append(((Parameter)field.getAnnotation(com/google/ads/mediation/MediationServerParameters$Parameter)).name()).toString());
                if(map.length() > 0)
                    map.append(", ");
                map.append(((Parameter)field.getAnnotation(com/google/ads/mediation/MediationServerParameters$Parameter)).name());
            }
        } while(true);
        if(map.length() > 0)
        {
            throw new MappingException((new StringBuilder()).append("Required server option(s) missing: ").append(map.toString()).toString());
        } else
        {
            zza();
            return;
        }
    }

    protected void zza()
    {
    }
}
