// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.appAdForce.android.ane;

import com.adobe.fre.FREContext;
import java.util.HashMap;
import java.util.Map;
import jp.appAdForce.android.ane.functions.AdManagerFunctions;
import jp.appAdForce.android.ane.functions.AnalyticsManagerFunctions;
import jp.appAdForce.android.ane.functions.LtvManagerFunctions;

public class AppAdForceContext extends FREContext
{

    public AppAdForceContext()
    {
    }

    public void dispose()
    {
        AdManagerFunctions.a();
        LtvManagerFunctions.a();
    }

    public Map getFunctions()
    {
        HashMap hashmap = new HashMap();
        Object obj = new AdManagerFunctions();
        obj.getClass();
        hashmap.put("sendConversion", new jp.appAdForce.android.ane.functions.AdManagerFunctions.a(((AdManagerFunctions) (obj))));
        obj = new AdManagerFunctions();
        obj.getClass();
        hashmap.put("sendConversionWithStartPage", new jp.appAdForce.android.ane.functions.AdManagerFunctions.f(((AdManagerFunctions) (obj))));
        obj = new AdManagerFunctions();
        obj.getClass();
        hashmap.put("sendConversionOnconsent", new jp.appAdForce.android.ane.functions.AdManagerFunctions.f(((AdManagerFunctions) (obj))));
        obj = new AdManagerFunctions();
        obj.getClass();
        hashmap.put("SendConversionWithBuid", new jp.appAdForce.android.ane.functions.AdManagerFunctions.d(((AdManagerFunctions) (obj))));
        obj = new AdManagerFunctions();
        obj.getClass();
        hashmap.put("sendConversionForMobage", new jp.appAdForce.android.ane.functions.AdManagerFunctions.b(((AdManagerFunctions) (obj))));
        obj = new AdManagerFunctions();
        obj.getClass();
        hashmap.put("sendUserIdForMobage", new jp.appAdForce.android.ane.functions.AdManagerFunctions.h(((AdManagerFunctions) (obj))));
        obj = new AdManagerFunctions();
        obj.getClass();
        hashmap.put("sendConversionWithCAReward", new jp.appAdForce.android.ane.functions.AdManagerFunctions.e(((AdManagerFunctions) (obj))));
        obj = new AdManagerFunctions();
        obj.getClass();
        hashmap.put("sendConversionForMobageWithCAReward", new jp.appAdForce.android.ane.functions.AdManagerFunctions.c(((AdManagerFunctions) (obj))));
        obj = new AdManagerFunctions();
        obj.getClass();
        hashmap.put("sendReengagementConversion", new jp.appAdForce.android.ane.functions.AdManagerFunctions.g(((AdManagerFunctions) (obj))));
        obj = new AdManagerFunctions();
        obj.getClass();
        hashmap.put("setServerUrl", new jp.appAdForce.android.ane.functions.AdManagerFunctions.l(((AdManagerFunctions) (obj))));
        obj = new AdManagerFunctions();
        obj.getClass();
        hashmap.put("setMode", new jp.appAdForce.android.ane.functions.AdManagerFunctions.j(((AdManagerFunctions) (obj))));
        obj = new AdManagerFunctions();
        obj.getClass();
        hashmap.put("setMessage", new jp.appAdForce.android.ane.functions.AdManagerFunctions.i(((AdManagerFunctions) (obj))));
        obj = new AdManagerFunctions();
        obj.getClass();
        hashmap.put("setOptout", new jp.appAdForce.android.ane.functions.AdManagerFunctions.k(((AdManagerFunctions) (obj))));
        obj = new AdManagerFunctions();
        obj.getClass();
        hashmap.put("updateFrom2_10_4g", new jp.appAdForce.android.ane.functions.AdManagerFunctions.m(((AdManagerFunctions) (obj))));
        obj = new AnalyticsManagerFunctions();
        obj.getClass();
        hashmap.put("sendStartSession", new jp.appAdForce.android.ane.functions.AnalyticsManagerFunctions.d(((AnalyticsManagerFunctions) (obj))));
        obj = new AnalyticsManagerFunctions();
        obj.getClass();
        hashmap.put("sendEndSession", new jp.appAdForce.android.ane.functions.AnalyticsManagerFunctions.a(((AnalyticsManagerFunctions) (obj))));
        obj = new AnalyticsManagerFunctions();
        obj.getClass();
        hashmap.put("sendEvent", new jp.appAdForce.android.ane.functions.AnalyticsManagerFunctions.b(((AnalyticsManagerFunctions) (obj))));
        obj = new AnalyticsManagerFunctions();
        obj.getClass();
        hashmap.put("sendEventPurchase", new jp.appAdForce.android.ane.functions.AnalyticsManagerFunctions.c(((AnalyticsManagerFunctions) (obj))));
        obj = new AnalyticsManagerFunctions();
        obj.getClass();
        hashmap.put("sendUserInfo", new jp.appAdForce.android.ane.functions.AnalyticsManagerFunctions.e(((AnalyticsManagerFunctions) (obj))));
        obj = new LtvManagerFunctions();
        obj.getClass();
        hashmap.put("sendLtv", new jp.appAdForce.android.ane.functions.LtvManagerFunctions.b(((LtvManagerFunctions) (obj))));
        obj = new LtvManagerFunctions();
        obj.getClass();
        hashmap.put("sendLtvWithAdid", new jp.appAdForce.android.ane.functions.LtvManagerFunctions.c(((LtvManagerFunctions) (obj))));
        obj = new LtvManagerFunctions();
        obj.getClass();
        hashmap.put("addParameter", new jp.appAdForce.android.ane.functions.LtvManagerFunctions.a(((LtvManagerFunctions) (obj))));
        return hashmap;
    }
}
