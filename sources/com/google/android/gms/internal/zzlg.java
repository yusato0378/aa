// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.panorama.Panorama;
import com.google.android.gms.panorama.PanoramaApi;

// Referenced classes of package com.google.android.gms.internal:
//            zzlf, zzle, zzli, zzlh

public class zzlg
    implements PanoramaApi
{
    private static abstract class zza extends zzc
    {

        protected Result createFailedResult(Status status)
        {
            return zzaH(status);
        }

        protected com.google.android.gms.panorama.PanoramaApi.PanoramaResult zzaH(Status status)
        {
            return new zzli(status, null);
        }

        public zza(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    private static final class zzb extends zzle.zza
    {

        public void zza(int i, Bundle bundle, int j, Intent intent)
        {
            if(bundle != null)
                bundle = (PendingIntent)bundle.getParcelable("pendingIntent");
            else
                bundle = null;
            bundle = new Status(i, null, bundle);
            zzKq.zzj(new zzli(bundle, intent));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        public zzb(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = zzb1;
        }
    }

    private static abstract class zzc extends com.google.android.gms.common.api.zza.zza
    {

        protected abstract void zza(Context context, zzlf zzlf1)
            throws RemoteException;

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((zzlh)zza1);
        }

        protected final void zza(zzlh zzlh1)
            throws RemoteException
        {
            zza(zzlh1.getContext(), (zzlf)zzlh1.zzlX());
        }

        protected zzc(GoogleApiClient googleapiclient)
        {
            super(Panorama.zzKh, googleapiclient);
        }
    }


    public zzlg()
    {
    }

    private static void zza(Context context, Uri uri)
    {
        context.revokeUriPermission(uri, 1);
    }

    private static void zza(Context context, zzlf zzlf1, zzle zzle, Uri uri, Bundle bundle)
        throws RemoteException
    {
        context.grantUriPermission("com.google.android.gms", uri, 1);
        zzle = new zzle.zza(context, uri, zzle) {

            public void zza(int i, Bundle bundle1, int j, Intent intent)
                throws RemoteException
            {
                zzlg.zzb(zzoH, zzayj);
                zzayl.zza(i, bundle1, j, intent);
            }

            final Uri zzayj;
            final zzle zzayl;
            final Context zzoH;

            
            {
                zzoH = context;
                zzayj = uri;
                zzayl = zzle1;
                super();
            }
        }
;
        try
        {
            zzlf1.zza(zzle, uri, bundle, true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(zzlf zzlf1)
        {
            zza(context, uri);
            throw zzlf1;
        }
        // Misplaced declaration of an exception variable
        catch(zzlf zzlf1)
        {
            zza(context, uri);
        }
        throw zzlf1;
    }

    static void zzb(Context context, Uri uri)
    {
        zza(context, uri);
    }

    static void zzb(Context context, zzlf zzlf1, zzle zzle, Uri uri, Bundle bundle)
        throws RemoteException
    {
        zza(context, zzlf1, zzle, uri, bundle);
    }

    public PendingResult loadPanoramaInfo(GoogleApiClient googleapiclient, Uri uri)
    {
        return googleapiclient.zza(new zza(googleapiclient, uri) {

            protected void zza(Context context, zzlf zzlf1)
                throws RemoteException
            {
                zzlf1.zza(new zzb(this), zzayj, null, false);
            }

            final Uri zzayj;
            final zzlg zzayk;

            
            {
                zzayk = zzlg.this;
                zzayj = uri;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult loadPanoramaInfoAndGrantAccess(GoogleApiClient googleapiclient, Uri uri)
    {
        return googleapiclient.zza(new zza(googleapiclient, uri) {

            protected void zza(Context context, zzlf zzlf1)
                throws RemoteException
            {
                zzlg.zzb(context, zzlf1, new zzb(this), zzayj, null);
            }

            final Uri zzayj;
            final zzlg zzayk;

            
            {
                zzayk = zzlg.this;
                zzayj = uri;
                super(googleapiclient);
            }
        }
);
    }
}
