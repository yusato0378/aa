// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.lib;

import android.content.Context;
import android.graphics.Typeface;
import java.util.HashMap;

public class Cocos2dxTypefaces
{

    public Cocos2dxTypefaces()
    {
    }

    public static Typeface get(Context context, String s)
    {
        org/cocos2dx/lib/Cocos2dxTypefaces;
        JVM INSTR monitorenter ;
        if(sTypefaceCache.containsKey(s)) goto _L2; else goto _L1
_L1:
        if(!s.startsWith("/"))
            break MISSING_BLOCK_LABEL_52;
        context = Typeface.createFromFile(s);
_L3:
        sTypefaceCache.put(s, context);
_L2:
        context = (Typeface)sTypefaceCache.get(s);
        org/cocos2dx/lib/Cocos2dxTypefaces;
        JVM INSTR monitorexit ;
        return context;
        context = Typeface.createFromAsset(context.getAssets(), s);
          goto _L3
        context;
        throw context;
    }

    private static final HashMap sTypefaceCache = new HashMap();

}
