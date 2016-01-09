// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.smrtbeat;


final class d extends Enum
{

    private d(String s, int i)
    {
        super(s, i);
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/smrtbeat/d, s);
    }

    public static d[] values()
    {
        d ad[] = d;
        int i = ad.length;
        d ad1[] = new d[i];
        System.arraycopy(ad, 0, ad1, 0, i);
        return ad1;
    }

    public static final d a;
    public static final d b;
    public static final d c;
    private static final d d[];

    static 
    {
        a = new d("ENone", 0);
        b = new d("ENative", 1);
        c = new d("EGles", 2);
        d = (new d[] {
            a, b, c
        });
    }
}
