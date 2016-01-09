// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.appAdForce.android.ane.functions;

import com.adobe.fre.*;
import jp.appAdForce.android.AdManager;
import jp.appAdForce.android.LtvManager;
import jp.appAdForce.android.ane.AppAdForceContext;

// Referenced classes of package jp.appAdForce.android.ane.functions:
//            AdManagerFunctions

public class LtvManagerFunctions
{
    public class a
        implements FREFunction
    {

        public FREObject call(FREContext frecontext, FREObject afreobject[])
        {
            LtvManagerFunctions.a(a, frecontext);
            frecontext = afreobject[0].getAsString();
            afreobject = afreobject[1].getAsString();
            LtvManagerFunctions.a.addParam(frecontext, afreobject);
_L2:
            return null;
            frecontext;
            frecontext.printStackTrace();
            if(frecontext.getCause() != null)
                frecontext.getCause().printStackTrace();
            if(true) goto _L2; else goto _L1
_L1:
        }

        final LtvManagerFunctions a;

        public a()
        {
            a = LtvManagerFunctions.this;
            super();
        }
    }

    public class b
        implements FREFunction
    {

        public FREObject call(FREContext frecontext, FREObject afreobject[])
        {
            try
            {
                int i = afreobject[0].getAsInt();
                LtvManagerFunctions.a(a, frecontext, i, null);
            }
            // Misplaced declaration of an exception variable
            catch(FREContext frecontext)
            {
                frecontext.printStackTrace();
                if(frecontext.getCause() != null)
                {
                    frecontext.getCause().printStackTrace();
                    return null;
                }
            }
            return null;
        }

        final LtvManagerFunctions a;

        public b()
        {
            a = LtvManagerFunctions.this;
            super();
        }
    }

    public class c
        implements FREFunction
    {

        public FREObject call(FREContext frecontext, FREObject afreobject[])
        {
            int i = afreobject[0].getAsInt();
            afreobject = afreobject[1].getAsString();
            LtvManagerFunctions.a(a, frecontext, i, afreobject);
_L2:
            return null;
            frecontext;
            frecontext.printStackTrace();
            if(frecontext.getCause() != null)
                frecontext.getCause().printStackTrace();
            if(true) goto _L2; else goto _L1
_L1:
        }

        final LtvManagerFunctions a;

        public c()
        {
            a = LtvManagerFunctions.this;
            super();
        }
    }


    public LtvManagerFunctions()
    {
    }

    public static void a()
    {
        AdManagerFunctions.a = null;
        a = null;
    }

    private void a(FREContext frecontext)
    {
        if(AdManagerFunctions.a == null)
            AdManagerFunctions.a = new AdManager(((AppAdForceContext)frecontext).getActivity());
        if(a == null)
            a = new LtvManager(AdManagerFunctions.a);
    }

    private void a(FREContext frecontext, int i, String s)
    {
        a(frecontext);
        if(s == null)
            a.sendLtvConversion(i);
        else
            a.sendLtvConversion(i, s);
        a.clearParam();
    }

    static void a(LtvManagerFunctions ltvmanagerfunctions, FREContext frecontext)
    {
        ltvmanagerfunctions.a(frecontext);
    }

    static void a(LtvManagerFunctions ltvmanagerfunctions, FREContext frecontext, int i, String s)
    {
        ltvmanagerfunctions.a(frecontext, i, s);
    }

    public static LtvManager a;
}
