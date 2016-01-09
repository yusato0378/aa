// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.appstate;

import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.appstate:
//            AppState

public final class zza
    implements AppState
{

    public zza(AppState appstate)
    {
        zzKb = appstate.getKey();
        zzKc = appstate.getLocalVersion();
        zzKd = appstate.getLocalData();
        zzKe = appstate.hasConflict();
        zzKf = appstate.getConflictVersion();
        zzKg = appstate.getConflictData();
    }

    static int zza(AppState appstate)
    {
        return zzu.hashCode(new Object[] {
            Integer.valueOf(appstate.getKey()), appstate.getLocalVersion(), appstate.getLocalData(), Boolean.valueOf(appstate.hasConflict()), appstate.getConflictVersion(), appstate.getConflictData()
        });
    }

    static boolean zza(AppState appstate, Object obj)
    {
        boolean flag1 = true;
        if(obj instanceof AppState) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(appstate == obj) goto _L4; else goto _L3
_L3:
        obj = (AppState)obj;
        if(!zzu.equal(Integer.valueOf(((AppState) (obj)).getKey()), Integer.valueOf(appstate.getKey())) || !zzu.equal(((AppState) (obj)).getLocalVersion(), appstate.getLocalVersion()) || !zzu.equal(((AppState) (obj)).getLocalData(), appstate.getLocalData()) || !zzu.equal(Boolean.valueOf(((AppState) (obj)).hasConflict()), Boolean.valueOf(appstate.hasConflict())) || !zzu.equal(((AppState) (obj)).getConflictVersion(), appstate.getConflictVersion()))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(((AppState) (obj)).getConflictData(), appstate.getConflictData())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(AppState appstate)
    {
        return zzu.zzq(appstate).zzg("Key", Integer.valueOf(appstate.getKey())).zzg("LocalVersion", appstate.getLocalVersion()).zzg("LocalData", appstate.getLocalData()).zzg("HasConflict", Boolean.valueOf(appstate.hasConflict())).zzg("ConflictVersion", appstate.getConflictVersion()).zzg("ConflictData", appstate.getConflictData()).toString();
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public Object freeze()
    {
        return zzjK();
    }

    public byte[] getConflictData()
    {
        return zzKg;
    }

    public String getConflictVersion()
    {
        return zzKf;
    }

    public int getKey()
    {
        return zzKb;
    }

    public byte[] getLocalData()
    {
        return zzKd;
    }

    public String getLocalVersion()
    {
        return zzKc;
    }

    public boolean hasConflict()
    {
        return zzKe;
    }

    public int hashCode()
    {
        return zza(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return zzb(this);
    }

    public AppState zzjK()
    {
        return this;
    }

    private final int zzKb;
    private final String zzKc;
    private final byte zzKd[];
    private final boolean zzKe;
    private final String zzKf;
    private final byte zzKg[];
}
