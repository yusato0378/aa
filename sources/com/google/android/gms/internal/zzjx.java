// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.fitness.SessionsApi;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.*;
import com.google.android.gms.fitness.result.SessionReadResult;
import com.google.android.gms.fitness.result.SessionStopResult;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal:
//            zziv, zzjy, zzjg

public class zzjx
    implements SessionsApi
{
    private static class zza extends zzjk.zza
    {

        public void zza(SessionReadResult sessionreadresult)
            throws RemoteException
        {
            zzKq.zzj(sessionreadresult);
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        private zza(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = zzb1;
        }

    }

    private static class zzb extends zzjl.zza
    {

        public void zza(SessionStopResult sessionstopresult)
        {
            zzKq.zzj(sessionstopresult);
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        private zzb(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = zzb1;
        }

    }


    public zzjx()
    {
    }

    private PendingResult zza(final GoogleApiClient final_googleapiclient, String s, String s1)
    {
        return final_googleapiclient.zzb(new zziv.zza(s, s1) {

            protected Result createFailedResult(Status status)
            {
                return zzA(status);
            }

            protected SessionStopResult zzA(Status status)
            {
                return SessionStopResult.zzI(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zziv)zza1);
            }

            protected void zza(zziv zziv1)
                throws RemoteException
            {
                zzb zzb1 = new zzb(this);
                String s2 = zziv1.getContext().getPackageName();
                ((zzjg)zziv1.zzlX()).zza(new SessionStopRequest(name, zzaey, zzb1, s2));
            }

            final String val$name;
            final zzjx zzaex;
            final String zzaey;

            
            {
                zzaex = zzjx.this;
                name = s;
                zzaey = s1;
                super(final_googleapiclient);
            }
        }
);
    }

    public PendingResult insertSession(GoogleApiClient googleapiclient, SessionInsertRequest sessioninsertrequest)
    {
        return googleapiclient.zza(new zziv.zzc(googleapiclient, sessioninsertrequest) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zziv)zza1);
            }

            protected void zza(zziv zziv1)
                throws RemoteException
            {
                zzjy zzjy1 = new zzjy(this);
                String s = zziv1.getContext().getPackageName();
                ((zzjg)zziv1.zzlX()).zza(new SessionInsertRequest(zzaez, zzjy1, s));
            }

            final zzjx zzaex;
            final SessionInsertRequest zzaez;

            
            {
                zzaex = zzjx.this;
                zzaez = sessioninsertrequest;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult readSession(GoogleApiClient googleapiclient, SessionReadRequest sessionreadrequest)
    {
        return googleapiclient.zza(new zziv.zza(googleapiclient, sessionreadrequest) {

            protected Result createFailedResult(Status status)
            {
                return zzB(status);
            }

            protected SessionReadResult zzB(Status status)
            {
                return SessionReadResult.zzH(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zziv)zza1);
            }

            protected void zza(zziv zziv1)
                throws RemoteException
            {
                zza zza1 = new zza(this);
                String s = zziv1.getContext().getPackageName();
                ((zzjg)zziv1.zzlX()).zza(new SessionReadRequest(zzaeA, zza1, s));
            }

            final SessionReadRequest zzaeA;
            final zzjx zzaex;

            
            {
                zzaex = zzjx.this;
                zzaeA = sessionreadrequest;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult registerForSessions(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return googleapiclient.zzb(new zziv.zzc(googleapiclient, pendingintent) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zziv)zza1);
            }

            protected void zza(zziv zziv1)
                throws RemoteException
            {
                zzjy zzjy1 = new zzjy(this);
                String s = zziv1.getContext().getPackageName();
                ((zzjg)zziv1.zzlX()).zza(new SessionRegistrationRequest(zzaeq, zzjy1, s));
            }

            final PendingIntent zzaeq;
            final zzjx zzaex;

            
            {
                zzaex = zzjx.this;
                zzaeq = pendingintent;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult startSession(GoogleApiClient googleapiclient, Session session)
    {
        zzv.zzb(session, "Session cannot be null");
        boolean flag;
        if(session.getEndTime(TimeUnit.MILLISECONDS) == 0L)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "Cannot start a session which has already ended");
        return googleapiclient.zzb(new zziv.zzc(googleapiclient, session) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zziv)zza1);
            }

            protected void zza(zziv zziv1)
                throws RemoteException
            {
                zzjy zzjy1 = new zzjy(this);
                String s = zziv1.getContext().getPackageName();
                ((zzjg)zziv1.zzlX()).zza(new SessionStartRequest(zzaew, zzjy1, s));
            }

            final Session zzaew;
            final zzjx zzaex;

            
            {
                zzaex = zzjx.this;
                zzaew = session;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult stopSession(GoogleApiClient googleapiclient, String s)
    {
        return zza(googleapiclient, null, s);
    }

    public PendingResult unregisterForSessions(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return googleapiclient.zzb(new zziv.zzc(googleapiclient, pendingintent) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zziv)zza1);
            }

            protected void zza(zziv zziv1)
                throws RemoteException
            {
                zzjy zzjy1 = new zzjy(this);
                String s = zziv1.getContext().getPackageName();
                ((zzjg)zziv1.zzlX()).zza(new SessionUnregistrationRequest(zzaeq, zzjy1, s));
            }

            final PendingIntent zzaeq;
            final zzjx zzaex;

            
            {
                zzaex = zzjx.this;
                zzaeq = pendingintent;
                super(googleapiclient);
            }
        }
);
    }
}
