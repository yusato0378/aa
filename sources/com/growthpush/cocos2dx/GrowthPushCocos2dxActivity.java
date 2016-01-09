// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush.cocos2dx;

import android.os.Bundle;
import org.cocos2dx.lib.Cocos2dxActivity;

// Referenced classes of package com.growthpush.cocos2dx:
//            GrowthPushJNI

public class GrowthPushCocos2dxActivity extends Cocos2dxActivity
{

    public GrowthPushCocos2dxActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        GrowthPushJNI.setContext(getApplicationContext());
    }
}
