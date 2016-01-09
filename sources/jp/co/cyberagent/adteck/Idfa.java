// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.adteck;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import jp.co.cyberagent.adteck.lib.Preference;

public class Idfa
{

    public Idfa()
    {
    }

    public static boolean execute(Context context)
        throws IllegalStateException, GooglePlayServicesRepairableException, IOException, GooglePlayServicesNotAvailableException
    {
        Preference.set(context, "idfa-enabled", isEnabled(context));
        if(!isEnabled(context))
        {
            Preference.remove(context, "dpid");
            Preference.remove(context, "output");
            return false;
        }
        String s = getId(context);
        if(s == null)
            Preference.remove(context, "dpid");
        else
            Preference.set(context, "dpid", s);
        Preference.set(context, "output", isLimitAdTrackingEnabled(context));
        return true;
    }

    protected static String getAdvertisingId(Context context)
        throws IllegalStateException, GooglePlayServicesRepairableException, IOException, GooglePlayServicesNotAvailableException
    {
        if(isEnabled(context))
            if((context = AdvertisingIdClient.getAdvertisingIdInfo(context)) != null)
                return context.getId();
        return null;
    }

    public static String getId(Context context)
        throws IllegalStateException, GooglePlayServicesRepairableException, IOException, GooglePlayServicesNotAvailableException
    {
        if(!isEnabled(context))
            return null;
        else
            return getAdvertisingId(context);
    }

    public static boolean isEnabled(Context context)
        throws IllegalStateException, GooglePlayServicesRepairableException, IOException, GooglePlayServicesNotAvailableException
    {
        for(context = AdvertisingIdClient.getAdvertisingIdInfo(context); context == null || context.getId() == null;)
            return false;

        return true;
    }

    public static boolean isLimitAdTrackingEnabled(Context context)
        throws IllegalStateException, GooglePlayServicesRepairableException, IOException, GooglePlayServicesNotAvailableException
    {
        if(isEnabled(context))
            if((context = AdvertisingIdClient.getAdvertisingIdInfo(context)) != null)
                return context.isLimitAdTrackingEnabled();
        return false;
    }
}
