// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.appAdForce.android.ane.functions;

import android.util.Log;
import com.adobe.fre.*;
import jp.appAdForce.android.AdManager;
import jp.appAdForce.android.ane.AppAdForceContext;
import jp.co.dimage.android.e;

public class AdManagerFunctions
    implements jp.co.dimage.android.e
{
    public class a
        implements FREFunction
    {

        public FREObject call(FREContext frecontext, FREObject afreobject[])
        {
            AdManagerFunctions.a(a, frecontext);
            AdManagerFunctions.a.sendConversion();
_L2:
            return null;
            frecontext;
            frecontext.printStackTrace();
            if(frecontext.getCause() != null)
                frecontext.getCause().printStackTrace();
            if(true) goto _L2; else goto _L1
_L1:
        }

        final AdManagerFunctions a;

        public a()
        {
            a = AdManagerFunctions.this;
            super();
        }
    }

    public class b
        implements FREFunction
    {

        public FREObject call(FREContext frecontext, FREObject afreobject[])
        {
            AdManagerFunctions.a(a, frecontext);
            afreobject.length;
            JVM INSTR tableswitch 1 2: default 125
        //                       1 61
        //                       2 100;
               goto _L1 _L2 _L3
_L1:
            Log.e("F.O.X", (new StringBuilder()).append("Method not found sendConversionForMobage args[]:").append(afreobject.length).toString());
            break; /* Loop/switch isn't completed */
_L2:
            try
            {
                frecontext = afreobject[0].getAsString();
                AdManagerFunctions.a.sendConversionForMobage(frecontext);
                break; /* Loop/switch isn't completed */
            }
            // Misplaced declaration of an exception variable
            catch(FREContext frecontext)
            {
                frecontext.printStackTrace();
            }
            if(frecontext.getCause() != null)
                frecontext.getCause().printStackTrace();
            break; /* Loop/switch isn't completed */
_L3:
            frecontext = afreobject[0].getAsString();
            afreobject = afreobject[1].getAsString();
            AdManagerFunctions.a.sendConversionForMobage(frecontext, afreobject);
            return null;
        }

        final AdManagerFunctions a;

        public b()
        {
            a = AdManagerFunctions.this;
            super();
        }
    }

    public class c
        implements FREFunction
    {

        public FREObject call(FREContext frecontext, FREObject afreobject[])
        {
            AdManagerFunctions.a(a, frecontext);
            afreobject.length;
            JVM INSTR tableswitch 1 2: default 125
        //                       1 61
        //                       2 100;
               goto _L1 _L2 _L3
_L1:
            Log.e("F.O.X", (new StringBuilder()).append("Method not found sendConversionForMobageWithCAReward args[]:").append(afreobject.length).toString());
            break; /* Loop/switch isn't completed */
_L2:
            try
            {
                frecontext = afreobject[0].getAsString();
                AdManagerFunctions.a.sendConversionForMobageWithCAReward(frecontext);
                break; /* Loop/switch isn't completed */
            }
            // Misplaced declaration of an exception variable
            catch(FREContext frecontext)
            {
                frecontext.printStackTrace();
            }
            if(frecontext.getCause() != null)
                frecontext.getCause().printStackTrace();
            break; /* Loop/switch isn't completed */
_L3:
            frecontext = afreobject[0].getAsString();
            afreobject = afreobject[1].getAsString();
            AdManagerFunctions.a.sendConversionForMobageWithCAReward(frecontext, afreobject);
            return null;
        }

        final AdManagerFunctions a;

        public c()
        {
            a = AdManagerFunctions.this;
            super();
        }
    }

    public class d
        implements FREFunction
    {

        public FREObject call(FREContext frecontext, FREObject afreobject[])
        {
label0:
            {
                AdManagerFunctions.a(a, frecontext);
                if(afreobject.length == 1)
                {
                    frecontext = afreobject[0].getAsString();
                    AdManagerFunctions.a.sendConversionWithBuid(frecontext);
                    break label0;
                }
                try
                {
                    Log.e("F.O.X", (new StringBuilder()).append("Method not found sendConversionWithBuid args[]:").append(afreobject.length).toString());
                }
                // Misplaced declaration of an exception variable
                catch(FREContext frecontext)
                {
                    frecontext.printStackTrace();
                    if(frecontext.getCause() != null)
                        frecontext.getCause().printStackTrace();
                }
            }
            return null;
        }

        final AdManagerFunctions a;

        public d()
        {
            a = AdManagerFunctions.this;
            super();
        }
    }

    public class e
        implements FREFunction
    {

        public FREObject call(FREContext frecontext, FREObject afreobject[])
        {
            AdManagerFunctions.a(a, frecontext);
            afreobject.length;
            JVM INSTR tableswitch 1 2: default 125
        //                       1 61
        //                       2 100;
               goto _L1 _L2 _L3
_L1:
            Log.e("F.O.X", (new StringBuilder()).append("Method not found sendConversionWithCAReward args[]:").append(afreobject.length).toString());
            break; /* Loop/switch isn't completed */
_L2:
            try
            {
                frecontext = afreobject[0].getAsString();
                AdManagerFunctions.a.sendConversionWithCAReward(frecontext);
                break; /* Loop/switch isn't completed */
            }
            // Misplaced declaration of an exception variable
            catch(FREContext frecontext)
            {
                frecontext.printStackTrace();
            }
            if(frecontext.getCause() != null)
                frecontext.getCause().printStackTrace();
            break; /* Loop/switch isn't completed */
_L3:
            frecontext = afreobject[0].getAsString();
            afreobject = afreobject[1].getAsString();
            AdManagerFunctions.a.sendConversionWithCAReward(frecontext, afreobject);
            return null;
        }

        final AdManagerFunctions a;

        public e()
        {
            a = AdManagerFunctions.this;
            super();
        }
    }

    public class f
        implements FREFunction
    {

        public FREObject call(FREContext frecontext, FREObject afreobject[])
        {
            AdManagerFunctions.a(a, frecontext);
            afreobject.length;
            JVM INSTR tableswitch 1 2: default 125
        //                       1 61
        //                       2 100;
               goto _L1 _L2 _L3
_L1:
            Log.e("F.O.X", (new StringBuilder()).append("Method not found sendConversionWithStartPage args[]:").append(afreobject.length).toString());
            break; /* Loop/switch isn't completed */
_L2:
            try
            {
                frecontext = afreobject[0].getAsString();
                AdManagerFunctions.a.sendConversion(frecontext);
                break; /* Loop/switch isn't completed */
            }
            // Misplaced declaration of an exception variable
            catch(FREContext frecontext)
            {
                frecontext.printStackTrace();
            }
            if(frecontext.getCause() != null)
                frecontext.getCause().printStackTrace();
            break; /* Loop/switch isn't completed */
_L3:
            frecontext = afreobject[0].getAsString();
            afreobject = afreobject[1].getAsString();
            AdManagerFunctions.a.sendConversion(frecontext, afreobject);
            return null;
        }

        final AdManagerFunctions a;

        public f()
        {
            a = AdManagerFunctions.this;
            super();
        }
    }

    public class g
        implements FREFunction
    {

        public FREObject call(FREContext frecontext, FREObject afreobject[])
        {
            AdManagerFunctions.a(a, frecontext);
            frecontext = afreobject[0].getAsString();
            AdManagerFunctions.a.sendReengagementConversion(frecontext);
_L2:
            return null;
            frecontext;
            frecontext.printStackTrace();
            if(frecontext.getCause() != null)
                frecontext.getCause().printStackTrace();
            if(true) goto _L2; else goto _L1
_L1:
        }

        final AdManagerFunctions a;

        public g()
        {
            a = AdManagerFunctions.this;
            super();
        }
    }

    public class h
        implements FREFunction
    {

        public FREObject call(FREContext frecontext, FREObject afreobject[])
        {
            AdManagerFunctions.a(a, frecontext);
            frecontext = afreobject[0].getAsString();
            AdManagerFunctions.a.sendUserIdForMobage(frecontext);
_L2:
            return null;
            frecontext;
            frecontext.printStackTrace();
            if(frecontext.getCause() != null)
                frecontext.getCause().printStackTrace();
            if(true) goto _L2; else goto _L1
_L1:
        }

        final AdManagerFunctions a;

        public h()
        {
            a = AdManagerFunctions.this;
            super();
        }
    }

    public class i
        implements FREFunction
    {

        public FREObject call(FREContext frecontext, FREObject afreobject[])
        {
            return null;
        }

        final AdManagerFunctions a;

        public i()
        {
            a = AdManagerFunctions.this;
            super();
        }
    }

    public class j
        implements FREFunction
    {

        public FREObject call(FREContext frecontext, FREObject afreobject[])
        {
            return null;
        }

        final AdManagerFunctions a;

        public j()
        {
            a = AdManagerFunctions.this;
            super();
        }
    }

    public class k
        implements FREFunction
    {

        public FREObject call(FREContext frecontext, FREObject afreobject[])
        {
            AdManagerFunctions.a(a, frecontext);
            boolean flag = afreobject[0].getAsBool();
            AdManagerFunctions.a.setOptout(flag);
_L2:
            return null;
            frecontext;
            frecontext.printStackTrace();
            if(frecontext.getCause() != null)
                frecontext.getCause().printStackTrace();
            if(true) goto _L2; else goto _L1
_L1:
        }

        final AdManagerFunctions a;

        public k()
        {
            a = AdManagerFunctions.this;
            super();
        }
    }

    public class l
        implements FREFunction
    {

        public FREObject call(FREContext frecontext, FREObject afreobject[])
        {
            AdManagerFunctions.a(a, frecontext);
            frecontext = afreobject[0].getAsString();
            AdManagerFunctions.a.setServerUrl(frecontext);
_L2:
            return null;
            frecontext;
            frecontext.printStackTrace();
            if(frecontext.getCause() != null)
                frecontext.getCause().printStackTrace();
            if(true) goto _L2; else goto _L1
_L1:
        }

        final AdManagerFunctions a;

        public l()
        {
            a = AdManagerFunctions.this;
            super();
        }
    }

    public class m
        implements FREFunction
    {

        public FREObject call(FREContext frecontext, FREObject afreobject[])
        {
            AdManager.updateFrom2_10_4g();
_L2:
            return null;
            frecontext;
            frecontext.printStackTrace();
            if(frecontext.getCause() != null)
                frecontext.getCause().printStackTrace();
            if(true) goto _L2; else goto _L1
_L1:
        }

        final AdManagerFunctions a;

        public m()
        {
            a = AdManagerFunctions.this;
            super();
        }
    }


    public AdManagerFunctions()
    {
    }

    public static void a()
    {
        a = null;
    }

    private void a(FREContext frecontext)
    {
        if(a == null)
            a = new AdManager(((AppAdForceContext)frecontext).getActivity());
    }

    static void a(AdManagerFunctions admanagerfunctions, FREContext frecontext)
    {
        admanagerfunctions.a(frecontext);
    }

    public static AdManager a;
}
