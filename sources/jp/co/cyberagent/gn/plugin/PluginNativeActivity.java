// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.gn.plugin;

import android.content.Intent;
import android.os.Bundle;
import org.cocos2dx.lib.Cocos2dxActivity;

// Referenced classes of package jp.co.cyberagent.gn.plugin:
//            PluginManager

public class PluginNativeActivity extends Cocos2dxActivity
{

    public PluginNativeActivity()
    {
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        PluginManager.logDebug((new StringBuilder("PluginNativeActivity.onActivityResult : requestCode = ")).append(i).append(", resultCode = ").append(j).toString());
        if(!PluginManager.handleActivityResult(i, j, intent))
            super.onActivityResult(i, j, intent);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        PluginManager.setCurrentActivity(this);
    }
}
