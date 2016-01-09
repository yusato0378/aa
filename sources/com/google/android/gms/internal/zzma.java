// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.*;
import com.google.android.gms.search.*;

// Referenced classes of package com.google.android.gms.internal:
//            zzlz, zzly

public class zzma
    implements SearchAuthApi
{
    static abstract class zza extends zzlx.zza
    {

        public void zza(Status status, GoogleNowAuthState googlenowauthstate)
        {
            throw new UnsupportedOperationException();
        }

        zza()
        {
        }
    }

    static class zzb extends com.google.android.gms.common.api.zza.zza
    {

        static boolean zza(zzb zzb1)
        {
            return zzb1.zzaBx;
        }

        protected Result createFailedResult(Status status)
        {
            return zzaM(status);
        }

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((zzlz)zza1);
        }

        protected void zza(zzlz zzlz1)
            throws RemoteException
        {
            if(zzaBx)
                Log.d("SearchAuth", "GetGoogleNowAuthImpl started");
            String s = zzaBv.getContext().getPackageName();
            zza zza1 = new zza(this) {

                public void zza(Status status, GoogleNowAuthState googlenowauthstate)
                {
                    if(zzb.zza(zzaBy))
                        Log.d("SearchAuth", "GetGoogleNowAuthImpl success");
                    zzaBy.setResult(new zzc(status, googlenowauthstate));
                }

                final zzb zzaBy;

            
            {
                zzaBy = zzb1;
                super();
            }
            }
;
            ((zzly)zzlz1.zzlX()).zza(zza1, s, zzaBw);
        }

        protected com.google.android.gms.search.SearchAuthApi.GoogleNowAuthResult zzaM(Status status)
        {
            if(zzaBx)
                Log.d("SearchAuth", (new StringBuilder()).append("GetGoogleNowAuthImpl received failure: ").append(status.getStatusMessage()).toString());
            return new zzc(status, null);
        }

        private final GoogleApiClient zzaBv;
        private final String zzaBw;
        private final boolean zzaBx = Log.isLoggable("SearchAuth", 3);

        protected zzb(GoogleApiClient googleapiclient, String s)
        {
            super(SearchAuth.zzKh, googleapiclient);
            zzaBv = googleapiclient;
            zzaBw = s;
        }
    }

    static class zzc
        implements com.google.android.gms.search.SearchAuthApi.GoogleNowAuthResult
    {

        public GoogleNowAuthState getGoogleNowAuthState()
        {
            return zzaBz;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;
        private final GoogleNowAuthState zzaBz;

        zzc(Status status, GoogleNowAuthState googlenowauthstate)
        {
            zzKr = status;
            zzaBz = googlenowauthstate;
        }
    }


    public zzma()
    {
    }

    public PendingResult getGoogleNowAuth(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zza(new zzb(googleapiclient, s));
    }
}
