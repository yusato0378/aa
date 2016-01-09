// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.database.CharArrayBuffer;

public final class zzhu
{

    public static void zzb(String s, CharArrayBuffer chararraybuffer)
    {
        if(chararraybuffer.data == null || chararraybuffer.data.length < s.length())
            chararraybuffer.data = s.toCharArray();
        else
            s.getChars(0, s.length(), chararraybuffer.data, 0);
        chararraybuffer.sizeCopied = s.length();
    }
}
