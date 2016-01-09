// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.plus.People;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.zze;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.Collection;

public final class zzlp
    implements People
{
    private static abstract class zza extends com.google.android.gms.plus.Plus.zza
    {

        public Result createFailedResult(Status status)
        {
            return zzaK(status);
        }

        public com.google.android.gms.plus.People.LoadPeopleResult zzaK(Status status)
        {
            return new com.google.android.gms.plus.People.LoadPeopleResult(this, status) {

                public String getNextPageToken()
                {
                    return null;
                }

                public PersonBuffer getPersonBuffer()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                public void release()
                {
                }

                final Status zzKj;
                final zza zzazB;

            
            {
                zzazB = zza1;
                zzKj = status;
                super();
            }
            }
;
        }

        private zza(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public zzlp()
    {
    }

    public Person getCurrentPerson(GoogleApiClient googleapiclient)
    {
        return Plus.zzf(googleapiclient, true).zzvy();
    }

    public PendingResult load(GoogleApiClient googleapiclient, Collection collection)
    {
        return googleapiclient.zza(new zza(googleapiclient, collection) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zze)zza1);
            }

            protected void zza(zze zze1)
            {
                zze1.zza(this, zzazz);
            }

            final zzlp zzazy;
            final Collection zzazz;

            
            {
                zzazy = zzlp.this;
                zzazz = collection;
                super(googleapiclient);
            }
        }
);
    }

    public transient PendingResult load(GoogleApiClient googleapiclient, String as[])
    {
        return googleapiclient.zza(new zza(googleapiclient, as) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zze)zza1);
            }

            protected void zza(zze zze1)
            {
                zze1.zzd(this, zzazA);
            }

            final String zzazA[];
            final zzlp zzazy;

            
            {
                zzazy = zzlp.this;
                zzazA = as;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult loadConnected(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zza(new zza(googleapiclient) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zze)zza1);
            }

            protected void zza(zze zze1)
            {
                zze1.zzj(this);
            }

            final zzlp zzazy;

            
            {
                zzazy = zzlp.this;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult loadVisible(GoogleApiClient googleapiclient, int i, String s)
    {
        return googleapiclient.zza(new zza(googleapiclient, i, s) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zze)zza1);
            }

            protected void zza(zze zze1)
            {
                setCancelToken(zze1.zza(this, zzazx, zzazq));
            }

            final String zzazq;
            final int zzazx;
            final zzlp zzazy;

            
            {
                zzazy = zzlp.this;
                zzazx = i;
                zzazq = s;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult loadVisible(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zza(new zza(googleapiclient, s) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zze)zza1);
            }

            protected void zza(zze zze1)
            {
                setCancelToken(zze1.zzr(this, zzazq));
            }

            final String zzazq;
            final zzlp zzazy;

            
            {
                zzazy = zzlp.this;
                zzazq = s;
                super(googleapiclient);
            }
        }
);
    }
}
