// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.drive.DrivePreferencesApi;
import com.google.android.gms.drive.FileUploadPreferences;

// Referenced classes of package com.google.android.gms.drive.internal:
//            FileUploadPreferencesImpl, zzd, OnDeviceUsagePreferenceResponse, zzs, 
//            zzak, zzr, SetFileUploadPreferencesRequest, zzbr

public class zzy
    implements DrivePreferencesApi
{
    private class zza extends zzd
    {

        public void zza(OnDeviceUsagePreferenceResponse ondeviceusagepreferenceresponse)
            throws RemoteException
        {
            zzKq.zzj(zzYq. new zzb(Status.zzQU, ondeviceusagepreferenceresponse.zznY()));
        }

        public void zzm(Status status)
            throws RemoteException
        {
            zzKq.zzj(zzYq. new zzb(status, null));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;
        final zzy zzYq;

        private zza(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzYq = zzy.this;
            super();
            zzKq = zzb1;
        }

    }

    private class zzb
        implements com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult
    {

        public FileUploadPreferences getFileUploadPreferences()
        {
            return zzYs;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;
        final zzy zzYq;
        private final FileUploadPreferences zzYs;

        private zzb(Status status, FileUploadPreferences fileuploadpreferences)
        {
            zzYq = zzy.this;
            super();
            zzKr = status;
            zzYs = fileuploadpreferences;
        }

    }

    private abstract class zzc extends zzr
    {

        protected Result createFailedResult(Status status)
        {
            return zzs(status);
        }

        protected com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult zzs(Status status)
        {
            return zzYq. new zzb(status, null);
        }

        final zzy zzYq;

        public zzc(GoogleApiClient googleapiclient)
        {
            zzYq = zzy.this;
            super(googleapiclient);
        }
    }


    public zzy()
    {
    }

    public PendingResult getFileUploadPreferences(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zza(new zzc(googleapiclient) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzs)zza1);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzs1.zznO().zzh(zzYq. new zza(this));
            }

            final zzy zzYq;

            
            {
                zzYq = zzy.this;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult setFileUploadPreferences(GoogleApiClient googleapiclient, FileUploadPreferences fileuploadpreferences)
    {
        if(!(fileuploadpreferences instanceof FileUploadPreferencesImpl))
            throw new IllegalArgumentException("Invalid preference value");
        else
            return googleapiclient.zzb(new zzr.zza(googleapiclient, (FileUploadPreferencesImpl)fileuploadpreferences) {

                protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                    throws RemoteException
                {
                    zza((zzs)zza1);
                }

                protected void zza(zzs zzs1)
                    throws RemoteException
                {
                    zzs1.zznO().zza(new SetFileUploadPreferencesRequest(zzYr), new zzbr(this));
                }

                final zzy zzYq;
                final FileUploadPreferencesImpl zzYr;

            
            {
                zzYq = zzy.this;
                zzYr = fileuploadpreferencesimpl;
                super(googleapiclient);
            }
            }
);
    }
}
