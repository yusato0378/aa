// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzm;
import com.google.android.gms.cast.internal.zzn;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            MediaInfo, MediaStatus, CastDevice, TextTrackStyle, 
//            Cast

public class RemoteMediaPlayer
    implements Cast.MessageReceivedCallback
{
    public static interface MediaChannelResult
        extends Result
    {

        public abstract JSONObject getCustomData();
    }

    public static interface OnMetadataUpdatedListener
    {

        public abstract void onMetadataUpdated();
    }

    public static interface OnStatusUpdatedListener
    {

        public abstract void onStatusUpdated();
    }

    private class zza
        implements zzn
    {

        public void zza(String s, String s1, long l, String s2)
            throws IOException
        {
            if(zzNa == null)
            {
                throw new IOException("No GoogleApiClient available");
            } else
            {
                Cast.CastApi.sendMessage(zzNa, s, s1).setResultCallback(new zza(this, l));
                return;
            }
        }

        public void zzb(GoogleApiClient googleapiclient)
        {
            zzNa = googleapiclient;
        }

        public long zzjU()
        {
            long l = zzNb + 1L;
            zzNb = l;
            return l;
        }

        final RemoteMediaPlayer zzMN;
        private GoogleApiClient zzNa;
        private long zzNb;

        public zza()
        {
            zzMN = RemoteMediaPlayer.this;
            super();
            zzNb = 0L;
        }
    }

    private final class zza.zza
        implements ResultCallback
    {

        public void onResult(Result result)
        {
            zzi((Status)result);
        }

        public void zzi(Status status)
        {
            if(!status.isSuccess())
                com.google.android.gms.cast.RemoteMediaPlayer.zze(zzNd.zzMN).zzb(zzNc, status.getStatusCode());
        }

        private final long zzNc;
        final zza zzNd;

        zza.zza(zza zza1, long l)
        {
            zzNd = zza1;
            super();
            zzNc = l;
        }
    }

    private static abstract class zzb extends com.google.android.gms.cast.internal.zzb
    {

        public Result createFailedResult(Status status)
        {
            return zzj(status);
        }

        public MediaChannelResult zzj(Status status)
        {
            return new MediaChannelResult(this, status) {

                public JSONObject getCustomData()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                final Status zzKj;
                final zzb zzNf;

            
            {
                zzNf = zzb1;
                zzKj = status;
                super();
            }
            }
;
        }

        zzo zzNe;

        zzb(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
            zzNe = new _cls1(this);
        }
    }

    private static final class zzc
        implements MediaChannelResult
    {

        public JSONObject getCustomData()
        {
            return zzMo;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;
        private final JSONObject zzMo;

        zzc(Status status, JSONObject jsonobject)
        {
            zzKr = status;
            zzMo = jsonobject;
        }
    }


    public RemoteMediaPlayer()
    {
        zzMJ.zza(zzMK);
    }

    private void onMetadataUpdated()
    {
        if(zzML != null)
            zzML.onMetadataUpdated();
    }

    private void onStatusUpdated()
    {
        if(zzMM != null)
            zzMM.onStatusUpdated();
    }

    static void zza(RemoteMediaPlayer remotemediaplayer)
    {
        remotemediaplayer.onStatusUpdated();
    }

    static void zzb(RemoteMediaPlayer remotemediaplayer)
    {
        remotemediaplayer.onMetadataUpdated();
    }

    static Object zzc(RemoteMediaPlayer remotemediaplayer)
    {
        return remotemediaplayer.zzoe;
    }

    static zza zzd(RemoteMediaPlayer remotemediaplayer)
    {
        return remotemediaplayer.zzMK;
    }

    static zzm zze(RemoteMediaPlayer remotemediaplayer)
    {
        return remotemediaplayer.zzMJ;
    }

    public long getApproximateStreamPosition()
    {
        long l;
        synchronized(zzoe)
        {
            l = zzMJ.getApproximateStreamPosition();
        }
        return l;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public MediaInfo getMediaInfo()
    {
        MediaInfo mediainfo;
        synchronized(zzoe)
        {
            mediainfo = zzMJ.getMediaInfo();
        }
        return mediainfo;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public MediaStatus getMediaStatus()
    {
        MediaStatus mediastatus;
        synchronized(zzoe)
        {
            mediastatus = zzMJ.getMediaStatus();
        }
        return mediastatus;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getNamespace()
    {
        return zzMJ.getNamespace();
    }

    public long getStreamDuration()
    {
        long l;
        synchronized(zzoe)
        {
            l = zzMJ.getStreamDuration();
        }
        return l;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public PendingResult load(GoogleApiClient googleapiclient, MediaInfo mediainfo)
    {
        return load(googleapiclient, mediainfo, true, 0L, null, null);
    }

    public PendingResult load(GoogleApiClient googleapiclient, MediaInfo mediainfo, boolean flag)
    {
        return load(googleapiclient, mediainfo, flag, 0L, null, null);
    }

    public PendingResult load(GoogleApiClient googleapiclient, MediaInfo mediainfo, boolean flag, long l)
    {
        return load(googleapiclient, mediainfo, flag, l, null, null);
    }

    public PendingResult load(GoogleApiClient googleapiclient, MediaInfo mediainfo, boolean flag, long l, JSONObject jsonobject)
    {
        return load(googleapiclient, mediainfo, flag, l, null, jsonobject);
    }

    public PendingResult load(GoogleApiClient googleapiclient, MediaInfo mediainfo, boolean flag, long l, long al[], JSONObject jsonobject)
    {
        return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient, mediainfo, flag, l, al, jsonobject) {

            protected void zza(zze zze1)
            {
                zze1 = ((zze) (RemoteMediaPlayer.zzc(zzMN)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzd(zzMN).zzb(zzMO);
                com.google.android.gms.cast.RemoteMediaPlayer.zze(zzMN).zza(zzNe, zzMR, zzMS, zzMT, zzMU, zzMV);
                RemoteMediaPlayer.zzd(zzMN).zzb(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                setResult(zzj(new Status(2100)));
                RemoteMediaPlayer.zzd(zzMN).zzb(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzd(zzMN).zzb(null);
                throw obj;
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zze)zza1);
            }

            final RemoteMediaPlayer zzMN;
            final GoogleApiClient zzMO;
            final MediaInfo zzMR;
            final boolean zzMS;
            final long zzMT;
            final long zzMU[];
            final JSONObject zzMV;

            
            {
                zzMN = RemoteMediaPlayer.this;
                zzMO = googleapiclient1;
                zzMR = mediainfo;
                zzMS = flag;
                zzMT = l;
                zzMU = al;
                zzMV = jsonobject;
                super(googleapiclient);
            }
        }
);
    }

    public void onMessageReceived(CastDevice castdevice, String s, String s1)
    {
        zzMJ.zzbm(s1);
    }

    public PendingResult pause(GoogleApiClient googleapiclient)
    {
        return pause(googleapiclient, null);
    }

    public PendingResult pause(GoogleApiClient googleapiclient, JSONObject jsonobject)
    {
        return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient, jsonobject) {

            protected void zza(zze zze1)
            {
                zze1 = ((zze) (RemoteMediaPlayer.zzc(zzMN)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzd(zzMN).zzb(zzMO);
                com.google.android.gms.cast.RemoteMediaPlayer.zze(zzMN).zza(zzNe, zzMV);
                RemoteMediaPlayer.zzd(zzMN).zzb(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                setResult(zzj(new Status(2100)));
                RemoteMediaPlayer.zzd(zzMN).zzb(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzd(zzMN).zzb(null);
                throw obj;
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zze)zza1);
            }

            final RemoteMediaPlayer zzMN;
            final GoogleApiClient zzMO;
            final JSONObject zzMV;

            
            {
                zzMN = RemoteMediaPlayer.this;
                zzMO = googleapiclient1;
                zzMV = jsonobject;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult play(GoogleApiClient googleapiclient)
    {
        return play(googleapiclient, null);
    }

    public PendingResult play(GoogleApiClient googleapiclient, JSONObject jsonobject)
    {
        return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient, jsonobject) {

            protected void zza(zze zze1)
            {
                zze1 = ((zze) (RemoteMediaPlayer.zzc(zzMN)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzd(zzMN).zzb(zzMO);
                com.google.android.gms.cast.RemoteMediaPlayer.zze(zzMN).zzc(zzNe, zzMV);
                RemoteMediaPlayer.zzd(zzMN).zzb(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                setResult(zzj(new Status(2100)));
                RemoteMediaPlayer.zzd(zzMN).zzb(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzd(zzMN).zzb(null);
                throw obj;
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zze)zza1);
            }

            final RemoteMediaPlayer zzMN;
            final GoogleApiClient zzMO;
            final JSONObject zzMV;

            
            {
                zzMN = RemoteMediaPlayer.this;
                zzMO = googleapiclient1;
                zzMV = jsonobject;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult requestStatus(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient) {

            protected void zza(zze zze1)
            {
                zze1 = ((zze) (RemoteMediaPlayer.zzc(zzMN)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzd(zzMN).zzb(zzMO);
                com.google.android.gms.cast.RemoteMediaPlayer.zze(zzMN).zza(zzNe);
                RemoteMediaPlayer.zzd(zzMN).zzb(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                setResult(zzj(new Status(2100)));
                RemoteMediaPlayer.zzd(zzMN).zzb(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzd(zzMN).zzb(null);
                throw obj;
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zze)zza1);
            }

            final RemoteMediaPlayer zzMN;
            final GoogleApiClient zzMO;

            
            {
                zzMN = RemoteMediaPlayer.this;
                zzMO = googleapiclient1;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult seek(GoogleApiClient googleapiclient, long l)
    {
        return seek(googleapiclient, l, 0, null);
    }

    public PendingResult seek(GoogleApiClient googleapiclient, long l, int i)
    {
        return seek(googleapiclient, l, i, null);
    }

    public PendingResult seek(GoogleApiClient googleapiclient, long l, int i, JSONObject jsonobject)
    {
        return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient, l, i, jsonobject) {

            protected void zza(zze zze1)
            {
                zze1 = ((zze) (RemoteMediaPlayer.zzc(zzMN)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzd(zzMN).zzb(zzMO);
                com.google.android.gms.cast.RemoteMediaPlayer.zze(zzMN).zza(zzNe, zzMW, zzMX, zzMV);
                RemoteMediaPlayer.zzd(zzMN).zzb(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                setResult(zzj(new Status(2100)));
                RemoteMediaPlayer.zzd(zzMN).zzb(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzd(zzMN).zzb(null);
                throw obj;
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zze)zza1);
            }

            final RemoteMediaPlayer zzMN;
            final GoogleApiClient zzMO;
            final JSONObject zzMV;
            final long zzMW;
            final int zzMX;

            
            {
                zzMN = RemoteMediaPlayer.this;
                zzMO = googleapiclient1;
                zzMW = l;
                zzMX = i;
                zzMV = jsonobject;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult setActiveMediaTracks(GoogleApiClient googleapiclient, long al[])
    {
        if(al == null)
            throw new IllegalArgumentException("trackIds cannot be null");
        else
            return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient, al) {

                protected void zza(zze zze1)
                {
                    zze1 = ((zze) (RemoteMediaPlayer.zzc(zzMN)));
                    zze1;
                    JVM INSTR monitorenter ;
                    RemoteMediaPlayer.zzd(zzMN).zzb(zzMO);
                    com.google.android.gms.cast.RemoteMediaPlayer.zze(zzMN).zza(zzNe, zzMP);
                    RemoteMediaPlayer.zzd(zzMN).zzb(null);
_L1:
                    zze1;
                    JVM INSTR monitorexit ;
                    return;
                    Object obj;
                    obj;
                    setResult(zzj(new Status(2100)));
                    RemoteMediaPlayer.zzd(zzMN).zzb(null);
                      goto _L1
                    obj;
                    zze1;
                    JVM INSTR monitorexit ;
                    throw obj;
                    obj;
                    RemoteMediaPlayer.zzd(zzMN).zzb(null);
                    throw obj;
                }

                protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                    throws RemoteException
                {
                    zza((zze)zza1);
                }

                final RemoteMediaPlayer zzMN;
                final GoogleApiClient zzMO;
                final long zzMP[];

            
            {
                zzMN = RemoteMediaPlayer.this;
                zzMO = googleapiclient1;
                zzMP = al;
                super(googleapiclient);
            }
            }
);
    }

    public void setOnMetadataUpdatedListener(OnMetadataUpdatedListener onmetadataupdatedlistener)
    {
        zzML = onmetadataupdatedlistener;
    }

    public void setOnStatusUpdatedListener(OnStatusUpdatedListener onstatusupdatedlistener)
    {
        zzMM = onstatusupdatedlistener;
    }

    public PendingResult setStreamMute(GoogleApiClient googleapiclient, boolean flag)
    {
        return setStreamMute(googleapiclient, flag, null);
    }

    public PendingResult setStreamMute(GoogleApiClient googleapiclient, boolean flag, JSONObject jsonobject)
    {
        return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient, flag, jsonobject) {

            protected void zza(zze zze1)
            {
                zze1 = ((zze) (RemoteMediaPlayer.zzc(zzMN)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzd(zzMN).zzb(zzMO);
                com.google.android.gms.cast.RemoteMediaPlayer.zze(zzMN).zza(zzNe, zzMZ, zzMV);
                RemoteMediaPlayer.zzd(zzMN).zzb(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
_L2:
                setResult(zzj(new Status(2100)));
                RemoteMediaPlayer.zzd(zzMN).zzb(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzd(zzMN).zzb(null);
                throw obj;
                obj;
                  goto _L2
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zze)zza1);
            }

            final RemoteMediaPlayer zzMN;
            final GoogleApiClient zzMO;
            final JSONObject zzMV;
            final boolean zzMZ;

            
            {
                zzMN = RemoteMediaPlayer.this;
                zzMO = googleapiclient1;
                zzMZ = flag;
                zzMV = jsonobject;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult setStreamVolume(GoogleApiClient googleapiclient, double d)
        throws IllegalArgumentException
    {
        return setStreamVolume(googleapiclient, d, null);
    }

    public PendingResult setStreamVolume(GoogleApiClient googleapiclient, double d, JSONObject jsonobject)
        throws IllegalArgumentException
    {
        if(Double.isInfinite(d) || Double.isNaN(d))
            throw new IllegalArgumentException((new StringBuilder()).append("Volume cannot be ").append(d).toString());
        else
            return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient, d, jsonobject) {

                protected void zza(zze zze1)
                {
                    zze1 = ((zze) (RemoteMediaPlayer.zzc(zzMN)));
                    zze1;
                    JVM INSTR monitorenter ;
                    RemoteMediaPlayer.zzd(zzMN).zzb(zzMO);
                    com.google.android.gms.cast.RemoteMediaPlayer.zze(zzMN).zza(zzNe, zzMY, zzMV);
                    RemoteMediaPlayer.zzd(zzMN).zzb(null);
_L1:
                    zze1;
                    JVM INSTR monitorexit ;
                    return;
                    Object obj;
                    obj;
_L2:
                    setResult(zzj(new Status(2100)));
                    RemoteMediaPlayer.zzd(zzMN).zzb(null);
                      goto _L1
                    obj;
                    zze1;
                    JVM INSTR monitorexit ;
                    throw obj;
                    obj;
                    RemoteMediaPlayer.zzd(zzMN).zzb(null);
                    throw obj;
                    obj;
                      goto _L2
                    obj;
                      goto _L2
                }

                protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                    throws RemoteException
                {
                    zza((zze)zza1);
                }

                final RemoteMediaPlayer zzMN;
                final GoogleApiClient zzMO;
                final JSONObject zzMV;
                final double zzMY;

            
            {
                zzMN = RemoteMediaPlayer.this;
                zzMO = googleapiclient1;
                zzMY = d;
                zzMV = jsonobject;
                super(googleapiclient);
            }
            }
);
    }

    public PendingResult setTextTrackStyle(GoogleApiClient googleapiclient, TextTrackStyle texttrackstyle)
    {
        if(texttrackstyle == null)
            throw new IllegalArgumentException("trackStyle cannot be null");
        else
            return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient, texttrackstyle) {

                protected void zza(zze zze1)
                {
                    zze1 = ((zze) (RemoteMediaPlayer.zzc(zzMN)));
                    zze1;
                    JVM INSTR monitorenter ;
                    RemoteMediaPlayer.zzd(zzMN).zzb(zzMO);
                    com.google.android.gms.cast.RemoteMediaPlayer.zze(zzMN).zza(zzNe, zzMQ);
                    RemoteMediaPlayer.zzd(zzMN).zzb(null);
_L1:
                    zze1;
                    JVM INSTR monitorexit ;
                    return;
                    Object obj;
                    obj;
                    setResult(zzj(new Status(2100)));
                    RemoteMediaPlayer.zzd(zzMN).zzb(null);
                      goto _L1
                    obj;
                    zze1;
                    JVM INSTR monitorexit ;
                    throw obj;
                    obj;
                    RemoteMediaPlayer.zzd(zzMN).zzb(null);
                    throw obj;
                }

                protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                    throws RemoteException
                {
                    zza((zze)zza1);
                }

                final RemoteMediaPlayer zzMN;
                final GoogleApiClient zzMO;
                final TextTrackStyle zzMQ;

            
            {
                zzMN = RemoteMediaPlayer.this;
                zzMO = googleapiclient1;
                zzMQ = texttrackstyle;
                super(googleapiclient);
            }
            }
);
    }

    public PendingResult stop(GoogleApiClient googleapiclient)
    {
        return stop(googleapiclient, null);
    }

    public PendingResult stop(GoogleApiClient googleapiclient, JSONObject jsonobject)
    {
        return googleapiclient.zzb(new zzb(googleapiclient, googleapiclient, jsonobject) {

            protected void zza(zze zze1)
            {
                zze1 = ((zze) (RemoteMediaPlayer.zzc(zzMN)));
                zze1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.zzd(zzMN).zzb(zzMO);
                com.google.android.gms.cast.RemoteMediaPlayer.zze(zzMN).zzb(zzNe, zzMV);
                RemoteMediaPlayer.zzd(zzMN).zzb(null);
_L1:
                zze1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                setResult(zzj(new Status(2100)));
                RemoteMediaPlayer.zzd(zzMN).zzb(null);
                  goto _L1
                obj;
                zze1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.zzd(zzMN).zzb(null);
                throw obj;
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zze)zza1);
            }

            final RemoteMediaPlayer zzMN;
            final GoogleApiClient zzMO;
            final JSONObject zzMV;

            
            {
                zzMN = RemoteMediaPlayer.this;
                zzMO = googleapiclient1;
                zzMV = jsonobject;
                super(googleapiclient);
            }
        }
);
    }

    public static final int RESUME_STATE_PAUSE = 2;
    public static final int RESUME_STATE_PLAY = 1;
    public static final int RESUME_STATE_UNCHANGED = 0;
    public static final int STATUS_CANCELED = 2101;
    public static final int STATUS_FAILED = 2100;
    public static final int STATUS_REPLACED = 2103;
    public static final int STATUS_SUCCEEDED = 0;
    public static final int STATUS_TIMED_OUT = 2102;
    private final zzm zzMJ = new zzm(null) {

        protected void onMetadataUpdated()
        {
            RemoteMediaPlayer.zzb(zzMN);
        }

        protected void onStatusUpdated()
        {
            RemoteMediaPlayer.zza(zzMN);
        }

        final RemoteMediaPlayer zzMN;

            
            {
                zzMN = RemoteMediaPlayer.this;
                super(s);
            }
    }
;
    private final zza zzMK = new zza();
    private OnMetadataUpdatedListener zzML;
    private OnStatusUpdatedListener zzMM;
    private final Object zzoe = new Object();

    // Unreferenced inner class com/google/android/gms/cast/RemoteMediaPlayer$zzb$1

/* anonymous class */
    class zzb._cls1
        implements zzo
    {

        public void zza(long l, int i, Object obj)
        {
            if(obj instanceof JSONObject)
                obj = (JSONObject)obj;
            else
                obj = null;
            zzNf.setResult(new zzc(new Status(i), ((JSONObject) (obj))));
        }

        public void zzw(long l)
        {
            zzNf.setResult(zzNf.zzj(new Status(2103)));
        }

        final zzb zzNf;

            
            {
                zzNf = zzb1;
                super();
            }
    }

}
