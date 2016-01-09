// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.mcraft.cocos2dx;

import android.content.Context;

// Referenced classes of package com.mcraft.cocos2dx:
//            PlatformAndroid, FileSystemAdapterAndroid, WebViewHelperAndroid, WebViewAndroid

public class McAndroid
{

    public McAndroid()
    {
    }

    public static void initialize(Context context)
    {
        PlatformAndroid.initialize();
        FileSystemAdapterAndroid.initialize();
        WebViewHelperAndroid.initialize(context);
        WebViewAndroid.initialize();
    }
}
