// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.appAdForce.android.ane.functions;

import android.app.Activity;
import com.adobe.fre.*;
import jp.appAdForce.android.AnalyticsManager;
import jp.appAdForce.android.ane.AppAdForceContext;

public class AnalyticsManagerFunctions
{
    public class a
        implements FREFunction
    {

        public FREObject call(FREContext frecontext, FREObject afreobject[])
        {
            AnalyticsManager.sendEndSession(((AppAdForceContext)frecontext).getActivity());
_L2:
            return null;
            frecontext;
            frecontext.printStackTrace();
            if(frecontext.getCause() != null)
                frecontext.getCause().printStackTrace();
            if(true) goto _L2; else goto _L1
_L1:
        }

        final AnalyticsManagerFunctions a;

        public a()
        {
            a = AnalyticsManagerFunctions.this;
            super();
        }
    }

    public class b
        implements FREFunction
    {

        public FREObject call(FREContext frecontext, FREObject afreobject[])
        {
            String s = afreobject[0].getAsString();
            String s1 = afreobject[1].getAsString();
            String s2 = afreobject[2].getAsString();
            int i = afreobject[3].getAsInt();
            AnalyticsManager.sendEvent(((AppAdForceContext)frecontext).getActivity(), s, s1, s2, i);
_L2:
            return null;
            frecontext;
            frecontext.printStackTrace();
            if(frecontext.getCause() != null)
                frecontext.getCause().printStackTrace();
            if(true) goto _L2; else goto _L1
_L1:
        }

        final AnalyticsManagerFunctions a;

        public b()
        {
            a = AnalyticsManagerFunctions.this;
            super();
        }
    }

    public class c
        implements FREFunction
    {

        public FREObject call(FREContext frecontext, FREObject afreobject[])
        {
            String s = afreobject[0].getAsString();
            String s1 = afreobject[1].getAsString();
            String s2 = afreobject[2].getAsString();
            String s3 = afreobject[3].getAsString();
            String s4 = afreobject[4].getAsString();
            String s5 = afreobject[5].getAsString();
            double d1 = afreobject[6].getAsDouble();
            int i = afreobject[7].getAsInt();
            afreobject = afreobject[8].getAsString();
            AnalyticsManager.sendEvent(((AppAdForceContext)frecontext).getActivity(), s, s1, s2, s3, s4, s5, d1, i, afreobject);
_L2:
            return null;
            frecontext;
            frecontext.printStackTrace();
            if(frecontext.getCause() != null)
                frecontext.getCause().printStackTrace();
            if(true) goto _L2; else goto _L1
_L1:
        }

        final AnalyticsManagerFunctions a;

        public c()
        {
            a = AnalyticsManagerFunctions.this;
            super();
        }
    }

    public class d
        implements FREFunction
    {

        public FREObject call(FREContext frecontext, FREObject afreobject[])
        {
            AnalyticsManager.a(frecontext.getActivity().getPackageName(), ((AppAdForceContext)frecontext).getActivity());
_L2:
            return null;
            frecontext;
            frecontext.printStackTrace();
            if(frecontext.getCause() != null)
                frecontext.getCause().printStackTrace();
            if(true) goto _L2; else goto _L1
_L1:
        }

        final AnalyticsManagerFunctions a;

        public d()
        {
            a = AnalyticsManagerFunctions.this;
            super();
        }
    }

    public class e
        implements FREFunction
    {

        public FREObject call(FREContext frecontext, FREObject afreobject[])
        {
            String s = afreobject[0].getAsString();
            String s1 = afreobject[1].getAsString();
            String s2 = afreobject[2].getAsString();
            String s3 = afreobject[3].getAsString();
            String s4 = afreobject[4].getAsString();
            afreobject = afreobject[5].getAsString();
            AnalyticsManager.sendUserInfo(((AppAdForceContext)frecontext).getActivity(), s, s1, s2, s3, s4, afreobject);
_L2:
            return null;
            frecontext;
            frecontext.printStackTrace();
            if(frecontext.getCause() != null)
                frecontext.getCause().printStackTrace();
            if(true) goto _L2; else goto _L1
_L1:
        }

        final AnalyticsManagerFunctions a;

        public e()
        {
            a = AnalyticsManagerFunctions.this;
            super();
        }
    }


    public AnalyticsManagerFunctions()
    {
    }
}
