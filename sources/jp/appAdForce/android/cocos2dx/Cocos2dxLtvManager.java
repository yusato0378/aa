// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.appAdForce.android.cocos2dx;

import android.app.Activity;
import android.content.Context;
import java.util.*;
import jp.appAdForce.android.LtvManager;

// Referenced classes of package jp.appAdForce.android.cocos2dx:
//            Cocos2dxAdManager

public class Cocos2dxLtvManager
{

    public Cocos2dxLtvManager()
    {
    }

    static HashMap a()
    {
        return a;
    }

    static HashMap a(HashMap hashmap)
    {
        a = hashmap;
        return hashmap;
    }

    public static void addParam(String s, int i)
    {
        if(a == null)
            a = new HashMap();
        a.put(s, String.valueOf(i));
    }

    public static void addParam(String s, String s1)
    {
        if(a == null)
            a = new HashMap();
        a.put(s, s1);
    }

    public static void sendLtvConversion(Context context, int i)
    {
        ((Activity)context).runOnUiThread(new Runnable(context, i) {

            public void run()
            {
                LtvManager ltvmanager = new LtvManager(Cocos2dxAdManager.a(a));
                if(Cocos2dxLtvManager.a() != null && Cocos2dxLtvManager.a().size() > 0)
                {
                    java.util.Map.Entry entry;
                    for(Iterator iterator = Cocos2dxLtvManager.a().entrySet().iterator(); iterator.hasNext(); ltvmanager.addParam((String)entry.getKey(), (String)entry.getValue()))
                        entry = (java.util.Map.Entry)iterator.next();

                }
                ltvmanager.sendLtvConversion(b);
                ltvmanager.clearParam();
                Cocos2dxLtvManager.a(null);
            }

            final Context a;
            final int b;

            
            {
                a = context;
                b = i;
                super();
            }
        }
);
    }

    public static void sendLtvConversion(Context context, int i, String s)
    {
        ((Activity)context).runOnUiThread(new Runnable(context, i, s) {

            public void run()
            {
                LtvManager ltvmanager = new LtvManager(Cocos2dxAdManager.a(a));
                if(Cocos2dxLtvManager.a() != null && Cocos2dxLtvManager.a().size() > 0)
                {
                    java.util.Map.Entry entry;
                    for(Iterator iterator = Cocos2dxLtvManager.a().entrySet().iterator(); iterator.hasNext(); ltvmanager.addParam((String)entry.getKey(), (String)entry.getValue()))
                        entry = (java.util.Map.Entry)iterator.next();

                }
                ltvmanager.sendLtvConversion(b, c);
                ltvmanager.clearParam();
                Cocos2dxLtvManager.a(null);
            }

            final Context a;
            final int b;
            final String c;

            
            {
                a = context;
                b = i;
                c = s;
                super();
            }
        }
);
    }

    private static HashMap a;
}
