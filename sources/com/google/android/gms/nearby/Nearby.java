// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.zzlb;
import com.google.android.gms.nearby.connection.Connections;
import com.google.android.gms.nearby.messages.internal.zzg;
import com.google.android.gms.nearby.messages.zzc;
import com.google.android.gms.nearby.sharing.internal.zzh;
import com.google.android.gms.nearby.sharing.internal.zzi;
import com.google.android.gms.nearby.sharing.zzd;
import com.google.android.gms.nearby.sharing.zze;

public final class Nearby
{

    private Nearby()
    {
    }

    public static final Api CONNECTIONS_API;
    public static final Connections Connections = new zzlb();
    public static final Api zzaxa;
    public static final zzc zzaxb = new zzg();
    public static final Api zzaxc;
    public static final zzd zzaxd = new zzh();
    public static final zze zzaxe = new zzi();

    static 
    {
        CONNECTIONS_API = new Api("Nearby.CONNECTIONS_API", zzlb.zzKi, zzlb.zzKh, new Scope[0]);
        zzaxa = new Api("Nearby.MESSAGES_API", zzg.zzKi, zzg.zzKh, new Scope[0]);
        zzaxc = new Api("Nearby.SHARING_API", zzh.zzKi, zzh.zzKh, new Scope[0]);
    }
}
