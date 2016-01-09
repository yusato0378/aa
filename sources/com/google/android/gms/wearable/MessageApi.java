// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable;

import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.wearable:
//            MessageEvent

public interface MessageApi
{
    public static interface MessageListener
    {

        public abstract void onMessageReceived(MessageEvent messageevent);
    }

    public static interface SendMessageResult
        extends Result
    {

        public abstract int getRequestId();
    }


    public abstract PendingResult addListener(GoogleApiClient googleapiclient, MessageListener messagelistener);

    public abstract PendingResult removeListener(GoogleApiClient googleapiclient, MessageListener messagelistener);

    public abstract PendingResult sendMessage(GoogleApiClient googleapiclient, String s, String s1, byte abyte0[]);

    public static final int UNKNOWN_REQUEST_ID = -1;
}
