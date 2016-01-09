// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.appAdForce.android.corona;

import com.ansca.corona.CoronaActivity;
import com.ansca.corona.CoronaEnvironment;
import com.naef.jnlua.LuaState;
import com.naef.jnlua.NamedJavaFunction;
import jp.appAdForce.android.AnalyticsManager;

public class CoronaAnalyticsManager
    implements NamedJavaFunction
{
    public static class SendEndSession
        implements NamedJavaFunction
    {

        public String getName()
        {
            return "sendEndSession";
        }

        public int invoke(LuaState luastate)
        {
            luastate = CoronaEnvironment.getCoronaActivity();
            luastate.runOnUiThread(new Runnable(this, luastate) {

                public void run()
                {
                    AnalyticsManager.sendEndSession(a);
                }

                final CoronaActivity a;
                final SendEndSession b;

            
            {
                b = sendendsession;
                a = coronaactivity;
                super();
            }
            }
);
            return 0;
        }

        public SendEndSession()
        {
        }
    }

    public static class SendEvent
        implements NamedJavaFunction
    {

        public String getName()
        {
            return "sendEvent";
        }

        public int invoke(LuaState luastate)
        {
            CoronaActivity coronaactivity = CoronaEnvironment.getCoronaActivity();
            coronaactivity.runOnUiThread(new Runnable(this, coronaactivity, luastate.checkString(1), luastate.checkString(2), luastate.checkString(3), luastate.checkInteger(4)) {

                public void run()
                {
                    AnalyticsManager.sendEvent(a, b, c, d, e);
                }

                final CoronaActivity a;
                final String b;
                final String c;
                final String d;
                final int e;
                final SendEvent f;

            
            {
                f = sendevent;
                a = coronaactivity;
                b = s;
                c = s1;
                d = s2;
                e = i;
                super();
            }
            }
);
            return 0;
        }

        public SendEvent()
        {
        }
    }

    public static class SendPurchaseEvent
        implements NamedJavaFunction
    {

        public String getName()
        {
            return "sendPurchaseEvent";
        }

        public int invoke(LuaState luastate)
        {
            CoronaActivity coronaactivity = CoronaEnvironment.getCoronaActivity();
            coronaactivity.runOnUiThread(new Runnable(this, coronaactivity, luastate.checkString(1), luastate.checkString(2), luastate.checkString(3), luastate.checkString(4), luastate.checkString(5), luastate.checkString(6), luastate.checkNumber(7), luastate.checkInteger(8), luastate.checkString(9)) {

                public void run()
                {
                    AnalyticsManager.sendEvent(a, b, c, d, e, f, g, h, i, j);
                }

                final CoronaActivity a;
                final String b;
                final String c;
                final String d;
                final String e;
                final String f;
                final String g;
                final double h;
                final int i;
                final String j;
                final SendPurchaseEvent k;

            
            {
                k = sendpurchaseevent;
                a = coronaactivity;
                b = s;
                c = s1;
                d = s2;
                e = s3;
                f = s4;
                g = s5;
                h = d1;
                i = l;
                j = s6;
                super();
            }
            }
);
            return 0;
        }

        public SendPurchaseEvent()
        {
        }
    }

    public static class SendUserInfo
        implements NamedJavaFunction
    {

        public String getName()
        {
            return "sendUserInfo";
        }

        public int invoke(LuaState luastate)
        {
            CoronaActivity coronaactivity = CoronaEnvironment.getCoronaActivity();
            coronaactivity.runOnUiThread(new Runnable(this, coronaactivity, luastate.checkString(1), luastate.checkString(2), luastate.checkString(3), luastate.checkString(4), luastate.checkString(5), luastate.checkString(6)) {

                public void run()
                {
                    AnalyticsManager.sendUserInfo(a, b, c, d, e, f, g);
                }

                final CoronaActivity a;
                final String b;
                final String c;
                final String d;
                final String e;
                final String f;
                final String g;
                final SendUserInfo h;

            
            {
                h = senduserinfo;
                a = coronaactivity;
                b = s;
                c = s1;
                d = s2;
                e = s3;
                f = s4;
                g = s5;
                super();
            }
            }
);
            return 0;
        }

        public SendUserInfo()
        {
        }
    }


    public CoronaAnalyticsManager()
    {
    }

    public String getName()
    {
        return "sendStartSession";
    }

    public int invoke(LuaState luastate)
    {
        luastate = CoronaEnvironment.getCoronaActivity();
        luastate.runOnUiThread(new Runnable((new Throwable()).getStackTrace()[1].getClassName(), luastate) {

            public void run()
            {
                AnalyticsManager.a(a, b);
            }

            final String a;
            final CoronaActivity b;
            final CoronaAnalyticsManager c;

            
            {
                c = CoronaAnalyticsManager.this;
                a = s;
                b = coronaactivity;
                super();
            }
        }
);
        return 0;
    }
}
