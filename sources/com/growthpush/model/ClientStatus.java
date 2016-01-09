// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush.model;


public final class ClientStatus extends Enum
{

    private ClientStatus(String s, int i)
    {
        super(s, i);
    }

    public static ClientStatus valueOf(String s)
    {
        return (ClientStatus)Enum.valueOf(com/growthpush/model/ClientStatus, s);
    }

    public static ClientStatus[] values()
    {
        ClientStatus aclientstatus[] = ENUM$VALUES;
        int i = aclientstatus.length;
        ClientStatus aclientstatus1[] = new ClientStatus[i];
        System.arraycopy(aclientstatus, 0, aclientstatus1, 0, i);
        return aclientstatus1;
    }

    private static final ClientStatus ENUM$VALUES[];
    public static final ClientStatus active;
    public static final ClientStatus inactive;
    public static final ClientStatus invalid;
    public static final ClientStatus unknown;
    public static final ClientStatus validating;

    static 
    {
        unknown = new ClientStatus("unknown", 0);
        validating = new ClientStatus("validating", 1);
        active = new ClientStatus("active", 2);
        inactive = new ClientStatus("inactive", 3);
        invalid = new ClientStatus("invalid", 4);
        ENUM$VALUES = (new ClientStatus[] {
            unknown, validating, active, inactive, invalid
        });
    }
}
