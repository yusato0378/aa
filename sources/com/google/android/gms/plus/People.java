// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.plus;

import com.google.android.gms.common.api.*;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.Collection;

public interface People
{
    public static interface LoadPeopleResult
        extends Releasable, Result
    {

        public abstract String getNextPageToken();

        public abstract PersonBuffer getPersonBuffer();
    }

    public static interface OrderBy
    {

        public static final int ALPHABETICAL = 0;
        public static final int BEST = 1;
    }


    public abstract Person getCurrentPerson(GoogleApiClient googleapiclient);

    public abstract PendingResult load(GoogleApiClient googleapiclient, Collection collection);

    public transient abstract PendingResult load(GoogleApiClient googleapiclient, String as[]);

    public abstract PendingResult loadConnected(GoogleApiClient googleapiclient);

    public abstract PendingResult loadVisible(GoogleApiClient googleapiclient, int i, String s);

    public abstract PendingResult loadVisible(GoogleApiClient googleapiclient, String s);
}
