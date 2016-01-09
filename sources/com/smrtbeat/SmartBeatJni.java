// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.smrtbeat;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.*;
import java.nio.ByteBuffer;

// Referenced classes of package com.smrtbeat:
//            L, P, N, K, 
//            c

class SmartBeatJni
{

    SmartBeatJni()
    {
    }

    private static void a(Context context, File file)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj2 = null;
        obj1 = null;
        obj = file.getParentFile().listFiles(new L());
        if(obj == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = obj.length;
        i = 0;
_L6:
        if(i < j) goto _L3; else goto _L2
_L2:
        N.a(P.d, "Install NDK Library from assets");
        obj = context.getAssets();
        try
        {
            context = ((AssetManager) (obj)).open((new StringBuilder("com.smrtbeat/")).append(Build.CPU_ABI).append("/libSmartBeatNdk.so.bin").toString());
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            try
            {
                context = ((AssetManager) (obj)).open((new StringBuilder("com.smrtbeat/")).append(Build.CPU_ABI2).append("/libSmartBeatNdk.so.bin").toString());
            }
            // Misplaced declaration of an exception variable
            catch(Context context)
            {
                N.a(P.b, String.format("Failed to install NDK Library ABI1:%s, ABI2:%s", new Object[] {
                    Build.CPU_ABI, Build.CPU_ABI2
                }));
                context = null;
            }
        }
        if(context != null) goto _L5; else goto _L4
_L4:
        return;
_L3:
        obj[i].delete();
        i++;
          goto _L6
_L5:
        obj = obj2;
        file.getParentFile().mkdirs();
        obj = obj2;
        file.createNewFile();
        obj = obj2;
        file = new FileOutputStream(file);
        obj = file;
        obj1 = new byte[8192];
_L8:
        obj = file;
        i = context.read(((byte []) (obj1)));
        if(-1 == i)
        {
            if(context != null)
                try
                {
                    context.close();
                }
                // Misplaced declaration of an exception variable
                catch(Context context) { }
            try
            {
                file.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch(Context context)
            {
                return;
            }
        }
        obj = file;
        file.write(((byte []) (obj1)), 0, i);
        if(true) goto _L8; else goto _L7
_L7:
        obj1;
_L13:
        obj = file;
        N.a(P.b, String.format("Failed to install NDK Library err:%s", new Object[] {
            ((FileNotFoundException) (obj1)).toString()
        }));
        if(context != null)
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch(Context context) { }
        if(file != null)
            try
            {
                file.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch(Context context)
            {
                return;
            }
          goto _L4
        obj;
        file = ((File) (obj1));
        obj1 = obj;
_L12:
        obj = file;
        N.a(P.b, String.format("Failed to install NDK Library err:%s", new Object[] {
            ((IOException) (obj1)).toString()
        }));
        if(context != null)
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch(Context context) { }
        if(file == null) goto _L4; else goto _L9
_L9:
        try
        {
            file.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            return;
        }
        file;
_L11:
        if(context != null)
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch(Context context) { }
        if(obj != null)
            try
            {
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch(Context context) { }
        throw file;
        file;
        if(true) goto _L11; else goto _L10
_L10:
        obj1;
          goto _L12
        obj1;
        file = null;
          goto _L13
    }

    static void a(String s)
    {
        s = new File(s);
        if(!N.e())
        {
            s.delete();
            return;
        }
        s = new Thread((new K()).a(s));
        s.start();
        try
        {
            s.join();
            return;
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            return;
        }
    }

    private static boolean a()
    {
        System.loadLibrary("SmartBeatNdk");
        if(getVersion() == 3)
            break MISSING_BLOCK_LABEL_22;
        N.a(P.b, "Loaded ndk from libs folder but incompatible version. version must be 3");
        return false;
        try
        {
            N.a(P.d, "Success to load NDK Lib (libs)");
        }
        catch(UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            return false;
        }
        return true;
    }

    static boolean a(Context context)
    {
        boolean flag1 = a();
        boolean flag = flag1;
        if(!flag1)
        {
            File file = new File((new StringBuilder()).append(context.getFilesDir()).append("/com.smrtbeat").append("/libSmartBeatNdk.so.bin").append(".").append(String.valueOf(3)).toString());
            boolean flag2 = a(file);
            flag = flag2;
            if(!flag2)
            {
                a(context, file);
                flag = a(file);
            }
        }
        if(flag)
        {
            context = new File((new StringBuilder(String.valueOf(c.n))).append("/dump_tmp").toString());
            context.mkdirs();
            initNdk(context.getAbsolutePath());
            N.a(P.d, "NDK is initialized");
        }
        return flag;
    }

    private static boolean a(File file)
    {
        if(file == null || !file.exists())
            return false;
        int i;
        try
        {
            System.load(file.getAbsolutePath());
            i = getVersion();
        }
        // Misplaced declaration of an exception variable
        catch(File file)
        {
            N.a(P.b, "NDK Libarry(file) Link Error");
            return false;
        }
        if(i == 3)
            break MISSING_BLOCK_LABEL_71;
        N.a(P.b, String.format("Library might be old. The file shall be updated. Installed:%d, Current:%d", new Object[] {
            Integer.valueOf(i), Integer.valueOf(3)
        }));
        return false;
        N.a(P.d, (new StringBuilder("Success to load NDK Lib (file) ver = ")).append(String.valueOf(3)).toString());
        return true;
    }

    static native boolean copyTextureBuffer(ByteBuffer bytebuffer);

    static native int getTextureLongerSideLength();

    private static native int getVersion();

    private static native void initNdk(String s);

    static native int newImageTargetTexture(int i, int j, int k, int l);

    private static final String a = "SmartBeatNdk";
    private static final String b = "libSmartBeatNdk.so.bin";
    private static final String c = "com.smrtbeat";
    private static final int d = 8192;
}
