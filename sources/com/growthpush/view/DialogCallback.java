// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush.view;

import android.content.DialogInterface;

public interface DialogCallback
{

    public abstract void onClickNegative(DialogInterface dialoginterface);

    public abstract void onClickPositive(DialogInterface dialoginterface);
}
