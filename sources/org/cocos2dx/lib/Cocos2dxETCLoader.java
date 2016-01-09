// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.lib;

import android.content.Context;
import android.content.res.AssetManager;
import android.opengl.ETC1Util;
import android.util.Log;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Cocos2dxETCLoader
{

    public Cocos2dxETCLoader()
    {
    }

    public static boolean loadTexture(String s)
    {
_L2:
        return false;
        if(!ETC1Util.isETC1Supported() || s.length() == 0) goto _L2; else goto _L1
_L1:
        Object obj1 = s;
        if(s.charAt(0) != '/') goto _L4; else goto _L3
_L3:
        obj1 = s;
        Object obj2 = new FileInputStream(s);
_L5:
        obj1 = s;
        Object obj = ETC1Util.createTexture(((InputStream) (obj2)));
        obj1 = s;
        ((InputStream) (obj2)).close();
        s = ((String) (obj));
_L6:
        if(s != null)
        {
            try
            {
                int i = s.getWidth();
                int j = s.getHeight();
                int k = s.getData().remaining();
                byte abyte0[] = new byte[k];
                obj1 = ByteBuffer.wrap(abyte0);
                ((ByteBuffer) (obj1)).order(ByteOrder.nativeOrder());
                ((ByteBuffer) (obj1)).put(s.getData());
                nativeSetTextureInfo(i, j, abyte0, k);
            }
            // Misplaced declaration of an exception variable
            catch(String s)
            {
                Log.d("invoke native function error", s.toString());
                return false;
            }
            return true;
        }
          goto _L2
_L4:
        abyte0 = s;
        obj1 = s;
        if(!s.startsWith("assets/"))
            break MISSING_BLOCK_LABEL_155;
        obj1 = s;
        abyte0 = s.substring("assets/".length());
        obj1 = abyte0;
        obj2 = context.getAssets().open(abyte0);
        s = abyte0;
          goto _L5
        s;
        Log.d("Cocos2dx", (new StringBuilder()).append("Unable to create texture for ").append(((String) (obj1))).toString());
        s = null;
          goto _L6
    }

    private static native void nativeSetTextureInfo(int i, int j, byte abyte0[], int k);

    public static void setContext(Context context1)
    {
        context = context1;
    }

    private static final String ASSETS_PATH = "assets/";
    private static Context context;
}
