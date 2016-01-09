// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush;


// Referenced classes of package com.growthpush:
//            GrowthPush, Logger

public class Thread extends Thread
{

    public Thread()
    {
        initializeUncaughtExceptionHandler();
    }

    public Thread(Runnable runnable)
    {
        super(runnable);
        initializeUncaughtExceptionHandler();
    }

    public Thread(Runnable runnable, String s)
    {
        super(runnable, s);
        initializeUncaughtExceptionHandler();
    }

    private void initializeUncaughtExceptionHandler()
    {
        setUncaughtExceptionHandler(new UncaughtExceptionHandler() {

            public void uncaughtException(Thread thread, Throwable throwable)
            {
                String s = (new StringBuilder("Uncaught Exception: ")).append(throwable.getClass().getName()).toString();
                thread = s;
                if(throwable.getMessage() != null)
                    thread = (new StringBuilder(String.valueOf(s))).append("; ").append(throwable.getMessage()).toString();
                GrowthPush.getInstance().getLogger().warning(thread);
            }

            final Thread this$0;

            
            {
                this$0 = Thread.this;
                super();
            }
        }
);
    }
}
