// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.request;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.games.internal.constants.RequestUpdateResultOutcome;
import java.util.HashMap;
import java.util.Set;

public final class RequestUpdateOutcomes
{
    public static final class Builder
    {

        public Builder zzfk(int i)
        {
            zzOJ = i;
            return this;
        }

        public RequestUpdateOutcomes zzrY()
        {
            return new RequestUpdateOutcomes(zzOJ, zzamK);
        }

        public Builder zzw(String s, int i)
        {
            if(RequestUpdateResultOutcome.isValid(i))
                zzamK.put(s, Integer.valueOf(i));
            return this;
        }

        private int zzOJ;
        private HashMap zzamK;

        public Builder()
        {
            zzamK = new HashMap();
            zzOJ = 0;
        }
    }


    private RequestUpdateOutcomes(int i, HashMap hashmap)
    {
        zzOJ = i;
        zzamK = hashmap;
    }


    public static RequestUpdateOutcomes zzX(DataHolder dataholder)
    {
        Builder builder = new Builder();
        builder.zzfk(dataholder.getStatusCode());
        int j = dataholder.getCount();
        for(int i = 0; i < j; i++)
        {
            int k = dataholder.zzaD(i);
            builder.zzw(dataholder.zzd("requestId", i, k), dataholder.zzc("outcome", i, k));
        }

        return builder.zzrY();
    }

    public Set getRequestIds()
    {
        return zzamK.keySet();
    }

    public int getRequestOutcome(String s)
    {
        zzv.zzb(zzamK.containsKey(s), (new StringBuilder()).append("Request ").append(s).append(" was not part of the update operation!").toString());
        return ((Integer)zzamK.get(s)).intValue();
    }

    private static final String zzamJ[] = {
        "requestId", "outcome"
    };
    private final int zzOJ;
    private final HashMap zzamK;

}
