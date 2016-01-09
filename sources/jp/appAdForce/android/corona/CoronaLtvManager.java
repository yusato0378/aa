// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.appAdForce.android.corona;

import android.util.Log;
import com.ansca.corona.CoronaActivity;
import com.ansca.corona.CoronaEnvironment;
import com.naef.jnlua.LuaState;
import com.naef.jnlua.NamedJavaFunction;
import java.util.*;
import jp.appAdForce.android.AdManager;
import jp.appAdForce.android.LtvManager;

public class CoronaLtvManager
    implements NamedJavaFunction
{
    public static class AddLtvParam
        implements NamedJavaFunction
    {

        public String getName()
        {
            return "addLtvParam";
        }

        public int invoke(LuaState luastate)
        {
            String s = luastate.checkString(1);
            luastate = luastate.checkString(2);
            if(s == null || luastate == null || "".equals(s) || "".equals(luastate))
                return 0;
            if(CoronaLtvManager.a() == null)
                CoronaLtvManager.a(new HashMap());
            CoronaLtvManager.a().put(s, luastate);
            Log.d("SendLtvConversion", (new StringBuilder()).append("AddParam key : ").append(s).append(", value : ").append(luastate).toString());
            return 0;
        }

        public AddLtvParam()
        {
        }
    }

    public static class LtvOpenBrowser
        implements NamedJavaFunction
    {

        public String getName()
        {
            return "ltvOpenBrowser";
        }

        public int invoke(LuaState luastate)
        {
            CoronaActivity coronaactivity = CoronaEnvironment.getCoronaActivity();
            coronaactivity.runOnUiThread(new Runnable(this, coronaactivity, luastate.checkString(1)) {

                public void run()
                {
                    (new LtvManager(new AdManager(a))).ltvOpenBrowser(b);
                }

                final CoronaActivity a;
                final String b;
                final LtvOpenBrowser c;

            
            {
                c = ltvopenbrowser;
                a = coronaactivity;
                b = s;
                super();
            }
            }
);
            return 0;
        }

        public LtvOpenBrowser()
        {
        }
    }


    public CoronaLtvManager()
    {
    }

    static Map a()
    {
        return a;
    }

    static Map a(Map map)
    {
        a = map;
        return map;
    }

    public String getName()
    {
        return "sendLtvConversion";
    }

    public int invoke(LuaState luastate)
    {
        CoronaActivity coronaactivity = CoronaEnvironment.getCoronaActivity();
        int i = luastate.checkInteger(1);
        luastate = luastate.checkString(2);
        if(i == 0)
        {
            return 0;
        } else
        {
            coronaactivity.runOnUiThread(new Runnable(coronaactivity, luastate, i) {

                public void run()
                {
                    LtvManager ltvmanager = new LtvManager(new AdManager(a));
                    if(CoronaLtvManager.a() != null && CoronaLtvManager.a().size() > 0)
                    {
                        java.util.Map.Entry entry;
                        for(Iterator iterator = CoronaLtvManager.a().entrySet().iterator(); iterator.hasNext(); ltvmanager.addParam((String)entry.getKey(), (String)entry.getValue()))
                            entry = (java.util.Map.Entry)iterator.next();

                    }
                    if(b == null || "".equals(b))
                        ltvmanager.sendLtvConversion(c);
                    else
                        ltvmanager.sendLtvConversion(c, b);
                    ltvmanager.clearParam();
                    CoronaLtvManager.a(null);
                }

                final CoronaActivity a;
                final String b;
                final int c;
                final CoronaLtvManager d;

            
            {
                d = CoronaLtvManager.this;
                a = coronaactivity;
                b = s;
                c = i;
                super();
            }
            }
);
            return 0;
        }
    }

    private static Map a;
}
