// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.adteck;

import android.content.Context;
import jp.co.cyberagent.adteck.lib.HashtableEX;
import jp.co.cyberagent.adteck.lib.NetUtil;
import jp.co.cyberagent.adteck.lib.Preference;

// Referenced classes of package jp.co.cyberagent.adteck:
//            SDK

public class Sync
{

    public Sync()
    {
    }

    public static String addParam(Context context, String s)
    {
        String s1 = SDK.getId(context);
        if(SDK.isLimitAdTrackingEnabled(context))
            context = "1";
        else
            context = "0";
        return String.format("%s&%s=%s&%s=%s", new Object[] {
            s, "dpid", s1, "output", context
        });
    }

    public static boolean setSdkId(Context context, String s)
    {
        return Preference.set(context, "sdkid", s);
    }

    public static boolean setUid(Context context, String s)
    {
        return Preference.set(context, "uid", s);
    }

    public static boolean sync(Context context, String s)
    {
        int i = 0;
        if(context == null)
            return false;
        HashtableEX hashtableex = new HashtableEX();
        if(SDK.isEnabled(context))
        {
            hashtableex.set("dpid", SDK.getId(context));
            if(SDK.isLimitAdTrackingEnabled(context))
                i = 1;
            hashtableex.set("output", i);
        } else
        {
            hashtableex.set("dpid", "");
            hashtableex.set("output", "");
        }
        hashtableex.set("uid", Preference.get(context, "uid", ""));
        hashtableex.set("appid", context.getPackageName());
        hashtableex.set("platform", 2);
        return sync(context, s, hashtableex);
    }

    protected static boolean sync(Context context, final String url, final HashtableEX params)
    {
        (new Thread(new Runnable() {

            public void run()
            {
                NetUtil netutil = new NetUtil();
                netutil.setParams(params);
                netutil.get(url);
            }

            private final HashtableEX val$params;
            private final String val$url;

            
            {
                params = hashtableex;
                url = s;
                super();
            }
        }
)).start();
        return true;
    }
}
