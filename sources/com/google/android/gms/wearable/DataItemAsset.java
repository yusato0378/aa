// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable;

import com.google.android.gms.common.data.Freezable;

public interface DataItemAsset
    extends Freezable
{

    public abstract String getDataItemKey();

    public abstract String getId();
}
