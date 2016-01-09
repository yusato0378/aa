// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

public interface Acls
{
    public static interface LoadAclResult
        extends Releasable, Result
    {
    }

    public static interface LoadFAclResult
        extends Releasable, Result
    {
    }

    public static interface OnGameplayAclLoadedCallback
    {
    }

    public static interface OnGameplayAclUpdatedCallback
    {
    }

    public static interface OnNotifyAclLoadedCallback
    {
    }

    public static interface OnNotifyAclUpdatedCallback
    {
    }

}
