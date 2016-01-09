// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.search;

import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.search:
//            GoogleNowAuthState

public interface SearchAuthApi
{
    public static interface GoogleNowAuthResult
        extends Result
    {

        public abstract GoogleNowAuthState getGoogleNowAuthState();
    }


    public abstract PendingResult getGoogleNowAuth(GoogleApiClient googleapiclient, String s);
}
