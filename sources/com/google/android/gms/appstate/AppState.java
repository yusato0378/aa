// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.appstate;

import com.google.android.gms.common.data.Freezable;

public interface AppState
    extends Freezable
{

    public abstract byte[] getConflictData();

    public abstract String getConflictVersion();

    public abstract int getKey();

    public abstract byte[] getLocalData();

    public abstract String getLocalVersion();

    public abstract boolean hasConflict();
}
