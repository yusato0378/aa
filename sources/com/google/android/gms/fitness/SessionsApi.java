// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness;

import android.app.PendingIntent;
import android.content.*;
import android.content.pm.*;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;

public interface SessionsApi
{
    public static class ViewIntentBuilder
    {

        private Intent zzi(Intent intent)
        {
            if(zzacF != null)
            {
                Intent intent1 = (new Intent(intent)).setPackage(zzacF);
                ResolveInfo resolveinfo = mContext.getPackageManager().resolveActivity(intent1, 0);
                if(resolveinfo != null)
                {
                    intent = resolveinfo.activityInfo.name;
                    intent1.setComponent(new ComponentName(zzacF, intent));
                    return intent1;
                }
            }
            return intent;
        }

        public Intent build()
        {
            Intent intent;
            boolean flag;
            if(zzacG != null)
                flag = true;
            else
                flag = false;
            zzv.zza(flag, "Session must be set");
            intent = new Intent("vnd.google.fitness.VIEW");
            intent.setType(Session.getMimeType(zzacG.getActivity()));
            zzc.zza(zzacG, intent, "vnd.google.fitness.session");
            if(!zzacH)
                zzacF = zzacG.getAppPackageName();
            return zzi(intent);
        }

        public ViewIntentBuilder setPreferredApplication(String s)
        {
            zzacF = s;
            zzacH = true;
            return this;
        }

        public ViewIntentBuilder setSession(Session session)
        {
            zzacG = session;
            return this;
        }

        private final Context mContext;
        private String zzacF;
        private Session zzacG;
        private boolean zzacH;

        public ViewIntentBuilder(Context context)
        {
            zzacH = false;
            mContext = context;
        }
    }


    public abstract PendingResult insertSession(GoogleApiClient googleapiclient, SessionInsertRequest sessioninsertrequest);

    public abstract PendingResult readSession(GoogleApiClient googleapiclient, SessionReadRequest sessionreadrequest);

    public abstract PendingResult registerForSessions(GoogleApiClient googleapiclient, PendingIntent pendingintent);

    public abstract PendingResult startSession(GoogleApiClient googleapiclient, Session session);

    public abstract PendingResult stopSession(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult unregisterForSessions(GoogleApiClient googleapiclient, PendingIntent pendingintent);
}
