// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.model.moments.MomentEntity;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.moments.MomentBuffer;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal:
//            PlusSession, zzd, zza

public class com.google.android.gms.plus.internal.zze extends zzi
{
    static final class zza
        implements com.google.android.gms.plus.Moments.LoadMomentsResult
    {

        public MomentBuffer getMomentBuffer()
        {
            return zzazb;
        }

        public String getNextPageToken()
        {
            return zzayZ;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        public String getUpdated()
        {
            return zzaza;
        }

        public void release()
        {
            if(zzazb != null)
                zzazb.release();
        }

        private final Status zzKr;
        private final String zzayZ;
        private final String zzaza;
        private final MomentBuffer zzazb;

        public zza(Status status, DataHolder dataholder, String s, String s1)
        {
            zzKr = status;
            zzayZ = s;
            zzaza = s1;
            if(dataholder != null)
                status = new MomentBuffer(dataholder);
            else
                status = null;
            zzazb = status;
        }
    }

    static final class zzb
        implements com.google.android.gms.plus.People.LoadPeopleResult
    {

        public String getNextPageToken()
        {
            return zzayZ;
        }

        public PersonBuffer getPersonBuffer()
        {
            return zzazc;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        public void release()
        {
            if(zzazc != null)
                zzazc.release();
        }

        private final Status zzKr;
        private final String zzayZ;
        private final PersonBuffer zzazc;

        public zzb(Status status, DataHolder dataholder, String s)
        {
            zzKr = status;
            zzayZ = s;
            if(dataholder != null)
                status = new PersonBuffer(dataholder);
            else
                status = null;
            zzazc = status;
        }
    }

    static final class zzc extends com.google.android.gms.plus.internal.zza
    {

        public void zzaI(Status status)
        {
            zzari.zzj(status);
        }

        private final com.google.android.gms.common.api.zza.zzb zzari;

        public zzc(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzari = zzb1;
        }
    }

    static final class zzd extends com.google.android.gms.plus.internal.zza
    {

        public void zza(DataHolder dataholder, String s, String s1)
        {
            Object obj;
            Status status;
            if(dataholder.zzlm() != null)
                obj = (PendingIntent)dataholder.zzlm().getParcelable("pendingIntent");
            else
                obj = null;
            status = new Status(dataholder.getStatusCode(), null, ((PendingIntent) (obj)));
            obj = dataholder;
            if(!status.isSuccess())
            {
                obj = dataholder;
                if(dataholder != null)
                {
                    if(!dataholder.isClosed())
                        dataholder.close();
                    obj = null;
                }
            }
            zzari.zzj(new zza(status, ((DataHolder) (obj)), s, s1));
        }

        private final com.google.android.gms.common.api.zza.zzb zzari;

        public zzd(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzari = zzb1;
        }
    }

    static final class zze extends com.google.android.gms.plus.internal.zza
    {

        public void zza(DataHolder dataholder, String s)
        {
            Object obj;
            Status status;
            if(dataholder.zzlm() != null)
                obj = (PendingIntent)dataholder.zzlm().getParcelable("pendingIntent");
            else
                obj = null;
            status = new Status(dataholder.getStatusCode(), null, ((PendingIntent) (obj)));
            obj = dataholder;
            if(!status.isSuccess())
            {
                obj = dataholder;
                if(dataholder != null)
                {
                    if(!dataholder.isClosed())
                        dataholder.close();
                    obj = null;
                }
            }
            zzari.zzj(new zzb(status, ((DataHolder) (obj)), s));
        }

        private final com.google.android.gms.common.api.zza.zzb zzari;

        public zze(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzari = zzb1;
        }
    }

    static final class zzf extends com.google.android.gms.plus.internal.zza
    {

        public void zzj(int i, Bundle bundle)
        {
            if(bundle != null)
                bundle = (PendingIntent)bundle.getParcelable("pendingIntent");
            else
                bundle = null;
            bundle = new Status(i, null, bundle);
            zzari.zzj(bundle);
        }

        private final com.google.android.gms.common.api.zza.zzb zzari;

        public zzf(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzari = zzb1;
        }
    }


    public com.google.android.gms.plus.internal.zze(Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, PlusSession plussession, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 2, connectioncallbacks, onconnectionfailedlistener, zze1);
        zzayY = plussession;
    }

    public static boolean zze(Set set)
    {
        while(set == null || set.isEmpty() || set.size() == 1 && set.contains(new Scope("plus_one_placeholder_scope"))) 
            return false;
        return true;
    }

    private Bundle zzvz()
    {
        Bundle bundle = zzayY.zzvK();
        bundle.putStringArray("request_visible_actions", zzayY.zzvD());
        bundle.putString("auth_package", zzayY.zzvF());
        return bundle;
    }

    public String getAccountName()
    {
        zzlW();
        String s;
        try
        {
            s = ((com.google.android.gms.plus.internal.zzd)zzlX()).getAccountName();
        }
        catch(RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return s;
    }

    protected IInterface zzD(IBinder ibinder)
    {
        return zzcy(ibinder);
    }

    public ICancelToken zza(com.google.android.gms.common.api.zza.zzb zzb1, int i, String s)
    {
        zzlW();
        zzb1 = new zze(zzb1);
        try
        {
            s = ((com.google.android.gms.plus.internal.zzd)zzlX()).zza(zzb1, 1, i, -1, s);
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            zzb1.zza(DataHolder.zzaE(8), null);
            return null;
        }
        return s;
    }

    protected void zza(int i, IBinder ibinder, Bundle bundle)
    {
        if(i == 0 && bundle != null && bundle.containsKey("loaded_person"))
            zzayX = PersonEntity.zzl(bundle.getByteArray("loaded_person"));
        super.zza(i, ibinder, bundle);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, int i, String s, Uri uri, String s1, String s2)
    {
        zzlW();
        if(zzb1 != null)
            zzb1 = new zzd(zzb1);
        else
            zzb1 = null;
        try
        {
            ((com.google.android.gms.plus.internal.zzd)zzlX()).zza(zzb1, i, s, uri, s1, s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            zzb1.zza(DataHolder.zzaE(8), null, null);
        }
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, Moment moment)
    {
        zzlW();
        if(zzb1 != null)
            zzb1 = new zzc(zzb1);
        else
            zzb1 = null;
        try
        {
            moment = SafeParcelResponse.zza((MomentEntity)moment);
            ((com.google.android.gms.plus.internal.zzd)zzlX()).zza(zzb1, moment);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(Moment moment) { }
        if(zzb1 == null)
        {
            throw new IllegalStateException(moment);
        } else
        {
            zzb1.zzaI(new Status(8, null, null));
            return;
        }
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, Collection collection)
    {
        zzlW();
        zzb1 = new zze(zzb1);
        try
        {
            ((com.google.android.gms.plus.internal.zzd)zzlX()).zza(zzb1, new ArrayList(collection));
            return;
        }
        // Misplaced declaration of an exception variable
        catch(Collection collection)
        {
            zzb1.zza(DataHolder.zzaE(8), null);
        }
    }

    protected com.google.android.gms.plus.internal.zzd zzcy(IBinder ibinder)
    {
        return com.google.android.gms.plus.internal.zzd.zza.zzcx(ibinder);
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zzb1, String as[])
    {
        zza(zzb1, Arrays.asList(as));
    }

    public void zzdp(String s)
    {
        zzlW();
        try
        {
            ((com.google.android.gms.plus.internal.zzd)zzlX()).zzdp(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            throw new IllegalStateException(s);
        }
    }

    protected String zzeq()
    {
        return "com.google.android.gms.plus.service.START";
    }

    protected String zzer()
    {
        return "com.google.android.gms.plus.internal.IPlusService";
    }

    public void zzi(com.google.android.gms.common.api.zza.zzb zzb1)
    {
        zza(zzb1, 20, null, null, null, "me");
    }

    public void zzj(com.google.android.gms.common.api.zza.zzb zzb1)
    {
        zzlW();
        zzb1 = new zze(zzb1);
        try
        {
            ((com.google.android.gms.plus.internal.zzd)zzlX()).zza(zzb1, 2, 1, -1, null);
            return;
        }
        catch(RemoteException remoteexception)
        {
            zzb1.zza(DataHolder.zzaE(8), null);
        }
    }

    public boolean zzjM()
    {
        return zze(zzlU().zzb(Plus.API));
    }

    public void zzk(com.google.android.gms.common.api.zza.zzb zzb1)
    {
        zzlW();
        zzvv();
        zzb1 = new zzf(zzb1);
        try
        {
            ((com.google.android.gms.plus.internal.zzd)zzlX()).zzb(zzb1);
            return;
        }
        catch(RemoteException remoteexception)
        {
            zzb1.zzj(8, null);
        }
    }

    protected Bundle zzka()
    {
        return zzvz();
    }

    protected Bundle zzlY()
    {
        return zzvz();
    }

    public ICancelToken zzr(com.google.android.gms.common.api.zza.zzb zzb1, String s)
    {
        return zza(zzb1, 0, s);
    }

    public void zzvv()
    {
        zzlW();
        try
        {
            zzayX = null;
            ((com.google.android.gms.plus.internal.zzd)zzlX()).zzvv();
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
    }

    public Person zzvy()
    {
        zzlW();
        return zzayX;
    }

    private Person zzayX;
    private final PlusSession zzayY;
}
