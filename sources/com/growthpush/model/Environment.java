// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush.model;


public final class Environment extends Enum
{

    private Environment(String s, int i)
    {
        super(s, i);
    }

    public static Environment valueOf(String s)
    {
        return (Environment)Enum.valueOf(com/growthpush/model/Environment, s);
    }

    public static Environment[] values()
    {
        Environment aenvironment[] = ENUM$VALUES;
        int i = aenvironment.length;
        Environment aenvironment1[] = new Environment[i];
        System.arraycopy(aenvironment, 0, aenvironment1, 0, i);
        return aenvironment1;
    }

    private static final Environment ENUM$VALUES[];
    public static final Environment development;
    public static final Environment production;

    static 
    {
        production = new Environment("production", 0);
        development = new Environment("development", 1);
        ENUM$VALUES = (new Environment[] {
            production, development
        });
    }
}
