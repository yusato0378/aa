// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;

class zzcv
{

    static void zza(Context context, String s, String s1, String s2)
    {
        context = context.getSharedPreferences(s, 0).edit();
        context.putString(s1, s2);
        zza(((android.content.SharedPreferences.Editor) (context)));
    }

    static void zza(android.content.SharedPreferences.Editor editor)
    {
        if(android.os.Build.VERSION.SDK_INT >= 9)
        {
            editor.apply();
            return;
        } else
        {
            (new Thread(new Runnable(editor) {

                public void run()
                {
                    zzaFC.commit();
                }

                final android.content.SharedPreferences.Editor zzaFC;

            
            {
                zzaFC = editor;
                super();
            }
            }
)).start();
            return;
        }
    }
}
