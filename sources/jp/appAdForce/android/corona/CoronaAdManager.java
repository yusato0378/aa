// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.appAdForce.android.corona;

import android.content.Context;
import com.ansca.corona.CoronaActivity;
import com.ansca.corona.CoronaEnvironment;
import com.naef.jnlua.LuaState;
import com.naef.jnlua.NamedJavaFunction;
import jp.appAdForce.android.AdManager;

public class CoronaAdManager
    implements NamedJavaFunction
{
    public static class SendConversionForMobage
        implements NamedJavaFunction
    {

        public String getName()
        {
            return "sendConversionForMobage";
        }

        public int invoke(LuaState luastate)
        {
            CoronaActivity coronaactivity = CoronaEnvironment.getCoronaActivity();
            for(luastate = luastate.checkString(1); coronaactivity == null || luastate == null || "".equals(luastate);)
                return 0;

            coronaactivity.runOnUiThread(new Runnable(this, coronaactivity, luastate) {

                public void run()
                {
                    CoronaAdManager.a(a).sendConversionForMobage(b);
                }

                final CoronaActivity a;
                final String b;
                final SendConversionForMobage c;

            
            {
                c = sendconversionformobage;
                a = coronaactivity;
                b = s;
                super();
            }
            }
);
            return 0;
        }

        public SendConversionForMobage()
        {
        }
    }

    public static class SendConversionForMobageAndCAReward
        implements NamedJavaFunction
    {

        public String getName()
        {
            return "sendConversionForMobageAndCAReward";
        }

        public int invoke(LuaState luastate)
        {
            CoronaActivity coronaactivity = CoronaEnvironment.getCoronaActivity();
            for(luastate = luastate.checkString(1); coronaactivity == null || luastate == null || "".equals(luastate);)
                return 0;

            coronaactivity.runOnUiThread(new Runnable(this, coronaactivity, luastate) {

                public void run()
                {
                    CoronaAdManager.a(a).sendConversionForMobageWithCAReward(b);
                }

                final CoronaActivity a;
                final String b;
                final SendConversionForMobageAndCAReward c;

            
            {
                c = sendconversionformobageandcareward;
                a = coronaactivity;
                b = s;
                super();
            }
            }
);
            return 0;
        }

        public SendConversionForMobageAndCAReward()
        {
        }
    }

    public static class SendConversionForMobageAndCARewardWithStartPageUrl
        implements NamedJavaFunction
    {

        public String getName()
        {
            return "sendConversionForMobageAndCARewardWithStartPageUrl";
        }

        public int invoke(LuaState luastate)
        {
            CoronaActivity coronaactivity = CoronaEnvironment.getCoronaActivity();
            String s = luastate.checkString(1);
            for(luastate = luastate.checkString(2); coronaactivity == null || luastate == null || "".equals(luastate);)
                return 0;

            coronaactivity.runOnUiThread(new Runnable(this, coronaactivity, s, luastate) {

                public void run()
                {
                    CoronaAdManager.a(a).sendConversionForMobageWithCAReward(b, c);
                }

                final CoronaActivity a;
                final String b;
                final String c;
                final SendConversionForMobageAndCARewardWithStartPageUrl d;

            
            {
                d = sendconversionformobageandcarewardwithstartpageurl;
                a = coronaactivity;
                b = s;
                c = s1;
                super();
            }
            }
);
            return 0;
        }

        public SendConversionForMobageAndCARewardWithStartPageUrl()
        {
        }
    }

    public static class SendConversionForMobageWithStartPageUrl
        implements NamedJavaFunction
    {

        public String getName()
        {
            return "sendConversionForMobageWithStartPageUrl";
        }

        public int invoke(LuaState luastate)
        {
            CoronaActivity coronaactivity = CoronaEnvironment.getCoronaActivity();
            String s = luastate.checkString(1);
            luastate = luastate.checkString(2);
            if(coronaactivity == null)
            {
                return 0;
            } else
            {
                coronaactivity.runOnUiThread(new Runnable(this, coronaactivity, s, luastate) {

                    public void run()
                    {
                        CoronaAdManager.a(a).sendConversionForMobage(b, c);
                    }

                    final CoronaActivity a;
                    final String b;
                    final String c;
                    final SendConversionForMobageWithStartPageUrl d;

            
            {
                d = sendconversionformobagewithstartpageurl;
                a = coronaactivity;
                b = s;
                c = s1;
                super();
            }
                }
);
                return 0;
            }
        }

        public SendConversionForMobageWithStartPageUrl()
        {
        }
    }

    public static class SendConversionViaCAReward
        implements NamedJavaFunction
    {

        public String getName()
        {
            return "sendConversionViaCAReward";
        }

        public int invoke(LuaState luastate)
        {
            CoronaActivity coronaactivity = CoronaEnvironment.getCoronaActivity();
            for(luastate = luastate.checkString(1); coronaactivity == null || luastate == null || "".equals(luastate);)
                return 0;

            coronaactivity.runOnUiThread(new Runnable(this, coronaactivity, luastate) {

                public void run()
                {
                    CoronaAdManager.a(a).sendConversionWithCAReward(b);
                }

                final CoronaActivity a;
                final String b;
                final SendConversionViaCAReward c;

            
            {
                c = sendconversionviacareward;
                a = coronaactivity;
                b = s;
                super();
            }
            }
);
            return 0;
        }

        public SendConversionViaCAReward()
        {
        }
    }

    public static class SendConversionViaCARewardWithBuid
        implements NamedJavaFunction
    {

        public String getName()
        {
            return "sendConversionViaCARewardWithBuid";
        }

        public int invoke(LuaState luastate)
        {
            CoronaActivity coronaactivity = CoronaEnvironment.getCoronaActivity();
            String s = luastate.checkString(1);
            for(luastate = luastate.checkString(2); coronaactivity == null || s == null || "".equals(s);)
                return 0;

            coronaactivity.runOnUiThread(new Runnable(this, coronaactivity, s, luastate) {

                public void run()
                {
                    CoronaAdManager.a(a).sendConversionWithCAReward(b, c);
                }

                final CoronaActivity a;
                final String b;
                final String c;
                final SendConversionViaCARewardWithBuid d;

            
            {
                d = sendconversionviacarewardwithbuid;
                a = coronaactivity;
                b = s;
                c = s1;
                super();
            }
            }
);
            return 0;
        }

        public SendConversionViaCARewardWithBuid()
        {
        }
    }

    public static class SendConversionWithBuid
        implements NamedJavaFunction
    {

        public String getName()
        {
            return "sendConversionWithBuid";
        }

        public int invoke(LuaState luastate)
        {
            CoronaActivity coronaactivity = CoronaEnvironment.getCoronaActivity();
            luastate = luastate.checkString(1);
            if(coronaactivity == null)
            {
                return 0;
            } else
            {
                coronaactivity.runOnUiThread(new Runnable(this, coronaactivity, luastate) {

                    public void run()
                    {
                        AdManager admanager = CoronaAdManager.a(a);
                        if(b != null && !"".equals(b))
                            admanager.sendConversionWithBuid(b);
                    }

                    final CoronaActivity a;
                    final String b;
                    final SendConversionWithBuid c;

            
            {
                c = sendconversionwithbuid;
                a = coronaactivity;
                b = s;
                super();
            }
                }
);
                return 0;
            }
        }

        public SendConversionWithBuid()
        {
        }
    }

    public static class SendConversionWithStartPageUrl
        implements NamedJavaFunction
    {

        public String getName()
        {
            return "sendConversionWithStartPageUrl";
        }

        public int invoke(LuaState luastate)
        {
            CoronaActivity coronaactivity = CoronaEnvironment.getCoronaActivity();
            String s = luastate.checkString(1);
            for(luastate = luastate.checkString(2); coronaactivity == null || s == null || "".equals(s);)
                return 0;

            coronaactivity.runOnUiThread(new Runnable(this, coronaactivity, luastate, s) {

                public void run()
                {
                    AdManager admanager = CoronaAdManager.a(a);
                    if(b != null && !"".equals(b))
                    {
                        admanager.sendConversion(c, b);
                        return;
                    } else
                    {
                        admanager.sendConversion(c);
                        return;
                    }
                }

                final CoronaActivity a;
                final String b;
                final String c;
                final SendConversionWithStartPageUrl d;

            
            {
                d = sendconversionwithstartpageurl;
                a = coronaactivity;
                b = s;
                c = s1;
                super();
            }
            }
);
            return 0;
        }

        public SendConversionWithStartPageUrl()
        {
        }
    }

    public static class SendConversionWithUrlScheme
        implements NamedJavaFunction
    {

        public String getName()
        {
            return "sendConversionWithUrlScheme";
        }

        public int invoke(LuaState luastate)
        {
            CoronaActivity coronaactivity = CoronaEnvironment.getCoronaActivity();
            String s = luastate.checkString(1);
            for(luastate = luastate.checkString(2); coronaactivity == null || s == null || "".equals(s);)
                return 0;

            coronaactivity.runOnUiThread(new Runnable(this, coronaactivity, luastate, s) {

                public void run()
                {
                    AdManager admanager = CoronaAdManager.a(a);
                    if(b != null && !"".equals(b))
                        admanager.sendConversion(c, b);
                    else
                        admanager.sendConversion(c);
                    admanager.setUrlScheme(a.getIntent());
                }

                final CoronaActivity a;
                final String b;
                final String c;
                final SendConversionWithUrlScheme d;

            
            {
                d = sendconversionwithurlscheme;
                a = coronaactivity;
                b = s;
                c = s1;
                super();
            }
            }
);
            return 0;
        }

        public SendConversionWithUrlScheme()
        {
        }
    }

    public static class SendUserIdForMobage
        implements NamedJavaFunction
    {

        public String getName()
        {
            return "sendUserIdForMobage";
        }

        public int invoke(LuaState luastate)
        {
            CoronaActivity coronaactivity = CoronaEnvironment.getCoronaActivity();
            for(luastate = luastate.checkString(1); coronaactivity == null || luastate == null || "".equals(luastate);)
                return 0;

            coronaactivity.runOnUiThread(new Runnable(this, coronaactivity, luastate) {

                public void run()
                {
                    CoronaAdManager.a(a).sendUserIdForMobage(b);
                }

                final CoronaActivity a;
                final String b;
                final SendUserIdForMobage c;

            
            {
                c = senduseridformobage;
                a = coronaactivity;
                b = s;
                super();
            }
            }
);
            return 0;
        }

        public SendUserIdForMobage()
        {
        }
    }

    public static class SetServerUrl
        implements NamedJavaFunction
    {

        public String getName()
        {
            return "setServerUrl";
        }

        public int invoke(LuaState luastate)
        {
            CoronaAdManager.a(luastate.checkString(1));
            if(CoronaAdManager.a() != null)
                if(!"".equals(CoronaAdManager.a()));
            return 0;
        }

        public SetServerUrl()
        {
        }
    }


    public CoronaAdManager()
    {
    }

    static String a()
    {
        return a;
    }

    static String a(String s)
    {
        a = s;
        return s;
    }

    public static AdManager a(Context context)
    {
        context = new AdManager(context);
        if(a != null && !"".equals(a))
            context.setServerUrl(a);
        return context;
    }

    public String getName()
    {
        return "sendConversion";
    }

    public int invoke(LuaState luastate)
    {
        luastate = CoronaEnvironment.getCoronaActivity();
        if(luastate == null)
        {
            return 0;
        } else
        {
            luastate.runOnUiThread(new Runnable(luastate) {

                public void run()
                {
                    CoronaAdManager.a(a).sendConversion();
                }

                final CoronaActivity a;
                final CoronaAdManager b;

            
            {
                b = CoronaAdManager.this;
                a = coronaactivity;
                super();
            }
            }
);
            return 0;
        }
    }

    private static String a;
}
