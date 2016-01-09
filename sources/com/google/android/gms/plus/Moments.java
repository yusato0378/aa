// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.plus;

import android.net.Uri;
import com.google.android.gms.common.api.*;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.moments.MomentBuffer;

public interface Moments
{
    public static interface LoadMomentsResult
        extends Releasable, Result
    {

        public abstract MomentBuffer getMomentBuffer();

        public abstract String getNextPageToken();

        public abstract String getUpdated();
    }


    public abstract PendingResult load(GoogleApiClient googleapiclient);

    public abstract PendingResult load(GoogleApiClient googleapiclient, int i, String s, Uri uri, String s1, String s2);

    public abstract PendingResult remove(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult write(GoogleApiClient googleapiclient, Moment moment);
}
