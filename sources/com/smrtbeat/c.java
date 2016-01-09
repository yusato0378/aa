// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.smrtbeat;

import android.content.Context;
import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package com.smrtbeat:
//            d, a

final class c
{

    c()
    {
    }

    static Context a()
    {
        return (Context)ab.get();
    }

    static void a(Context context)
    {
        ab = new WeakReference(context);
    }

    static boolean A = false;
    static List B = new ArrayList();
    static int C = 0;
    static String D = "";
    static Bitmap E = null;
    static Bitmap F = null;
    static long G = 0L;
    static d H;
    static boolean I = false;
    static String J;
    static String K;
    static String L;
    static boolean M = false;
    static boolean N = false;
    static boolean O = false;
    static boolean P = false;
    static Thread Q = null;
    private static String R = "https://api.smbeat.jp/api/errors";
    private static String S = "https://images.smbeat.jp/api/upload";
    private static String T = "https://minidumps.smbeat.jp/api/errors/multi";
    private static String U = "https://control.smbeat.jp/api/remote";
    private static long V = 0x1499700L;
    private static int W = 32;
    private static int X = 16;
    private static long Y = 5000L;
    private static String Z = "1.8.1";
    static String a = "";
    private static boolean aa;
    private static WeakReference ab = null;
    static String b = "";
    static String c = "";
    static String d = "";
    static String e = "";
    static String f = "";
    static String g = "";
    static String h = "";
    static boolean i = false;
    static int j = 0;
    static int k = 0;
    static int l = 0;
    static long m = System.currentTimeMillis();
    static String n = "";
    static String o = "";
    static boolean p = false;
    static int q = 0;
    static List r = new ArrayList(16);
    static HashMap s = null;
    static String t = "";
    static boolean u = false;
    static String v = "";
    static String w = "";
    static a x = null;
    static Thread y = null;
    static boolean z = false;

    static 
    {
        A = true;
        C = 5;
        G = 0L;
        H = d.a;
        I = false;
        M = false;
        N = false;
        O = false;
        P = false;
    }
}
