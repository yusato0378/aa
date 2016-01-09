// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.adteck;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import jp.co.cyberagent.adteck.lib.Preference;

// Referenced classes of package jp.co.cyberagent.adteck:
//            Sync, Idfa

public class SDK extends Sync
{
    public static interface Listener
    {

        public abstract void onSDKReady();
    }


    public SDK()
    {
    }

    protected static boolean done(Handler handler, Runnable runnable)
    {
        boolean flag = true;
        if(handler == null)
            flag = false;
        else
        if(runnable != null)
        {
            handler.post(runnable);
            return true;
        }
        return flag;
    }

    protected static boolean done(Handler handler, final Listener listener)
    {
        while(handler == null || listener == null) 
            return false;
        return done(handler, new Runnable() {

            public void run()
            {
                listener.onSDKReady();
            }

            private final Listener val$listener;

            
            {
                listener = listener1;
                super();
            }
        }
);
    }

    public static String getId(Context context)
    {
        return Preference.get(context, "dpid", null);
    }

    public static boolean initialize(Context context)
    {
        return initialize(context, ((Listener) (null)));
    }

    public static boolean initialize(final Context context, final Runnable runnable)
    {
        while(Looper.myLooper() != Looper.getMainLooper() || context == null) 
            return false;
        (new Thread(new Runnable() {

            public void run()
            {
                SDK.process(context);
                if(runnable == null)
                {
                    return;
                } else
                {
                    SDK.done(handler, runnable);
                    return;
                }
            }

            private final Context val$context;
            private final Handler val$handler;
            private final Runnable val$runnable;

            
            {
                context = context1;
                runnable = runnable1;
                handler = handler1;
                super();
            }
        }
)).start();
        return true;
    }

    public static boolean initialize(final Context context, final Listener listener)
    {
        while(Looper.myLooper() != Looper.getMainLooper() || context == null) 
            return false;
        (new Thread(new Runnable() {

            public void run()
            {
                SDK.process(context);
                if(listener == null)
                {
                    return;
                } else
                {
                    SDK.done(handler, listener);
                    return;
                }
            }

            private final Context val$context;
            private final Handler val$handler;
            private final Listener val$listener;

            
            {
                context = context1;
                listener = listener1;
                handler = handler1;
                super();
            }
        }
)).start();
        return true;
    }

    public static boolean isEnabled(Context context)
    {
        return Preference.get(context, "idfa-enabled", false);
    }

    public static boolean isLimitAdTrackingEnabled(Context context)
    {
        return Preference.get(context, "output", false);
    }

    protected static boolean process(Context context)
    {
        boolean flag;
        if(!Idfa.isEnabled(context))
            break MISSING_BLOCK_LABEL_19;
        flag = Idfa.execute(context);
        return flag;
        context;
        context.printStackTrace();
        return false;
    }
}
