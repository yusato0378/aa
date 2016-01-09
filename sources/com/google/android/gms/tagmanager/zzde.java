// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;


class zzde extends Number
    implements Comparable
{

    private zzde(double d)
    {
        zzaGc = d;
        zzaGe = false;
    }

    private zzde(long l)
    {
        zzaGd = l;
        zzaGe = true;
    }

    public static zzde zzS(long l)
    {
        return new zzde(l);
    }

    public static zzde zza(Double double1)
    {
        return new zzde(double1.doubleValue());
    }

    public static zzde zzea(String s)
        throws NumberFormatException
    {
        zzde zzde1;
        try
        {
            zzde1 = new zzde(Long.parseLong(s));
        }
        catch(NumberFormatException numberformatexception)
        {
            zzde zzde2;
            try
            {
                zzde2 = new zzde(Double.parseDouble(s));
            }
            catch(NumberFormatException numberformatexception1)
            {
                throw new NumberFormatException((new StringBuilder()).append(s).append(" is not a valid TypedNumber").toString());
            }
            return zzde2;
        }
        return zzde1;
    }

    public byte byteValue()
    {
        return (byte)(int)longValue();
    }

    public int compareTo(Object obj)
    {
        return zza((zzde)obj);
    }

    public double doubleValue()
    {
        if(zzxM())
            return (double)zzaGd;
        else
            return zzaGc;
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof zzde) && zza((zzde)obj) == 0;
    }

    public float floatValue()
    {
        return (float)doubleValue();
    }

    public int hashCode()
    {
        return (new Long(longValue())).hashCode();
    }

    public int intValue()
    {
        return zzxO();
    }

    public long longValue()
    {
        return zzxN();
    }

    public short shortValue()
    {
        return zzxP();
    }

    public String toString()
    {
        if(zzxM())
            return Long.toString(zzaGd);
        else
            return Double.toString(zzaGc);
    }

    public int zza(zzde zzde1)
    {
        if(zzxM() && zzde1.zzxM())
            return (new Long(zzaGd)).compareTo(Long.valueOf(zzde1.zzaGd));
        else
            return Double.compare(doubleValue(), zzde1.doubleValue());
    }

    public boolean zzxL()
    {
        return !zzxM();
    }

    public boolean zzxM()
    {
        return zzaGe;
    }

    public long zzxN()
    {
        if(zzxM())
            return zzaGd;
        else
            return (long)zzaGc;
    }

    public int zzxO()
    {
        return (int)longValue();
    }

    public short zzxP()
    {
        return (short)(int)longValue();
    }

    private double zzaGc;
    private long zzaGd;
    private boolean zzaGe;
}
