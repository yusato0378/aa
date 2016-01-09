// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.appAdForce.android.ane;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;

// Referenced classes of package jp.appAdForce.android.ane:
//            AppAdForceContext

public class AppAdForceExtension
    implements FREExtension
{

    public AppAdForceExtension()
    {
    }

    public FREContext createContext(String s)
    {
        return new AppAdForceContext();
    }

    public void dispose()
    {
    }

    public void initialize()
    {
    }
}
