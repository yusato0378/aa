// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.*;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.wearable.*;
import java.io.*;
import java.util.*;
import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzau, zzat, zzbl, zzbf, 
//            zzq

public class zzbk extends zzi
{

    public zzbk(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, zze zze1)
    {
        super(context, looper, 14, connectioncallbacks, onconnectionfailedlistener, zze1);
    }

    private FutureTask zza(ParcelFileDescriptor parcelfiledescriptor, byte abyte0[])
    {
        return new FutureTask(new Callable(parcelfiledescriptor, abyte0) {

            public Object call()
                throws Exception
            {
                return zzzn();
            }

            public Boolean zzzn()
            {
                android.os.ParcelFileDescriptor.AutoCloseOutputStream autocloseoutputstream;
                if(Log.isLoggable("WearableClient", 3))
                    Log.d("WearableClient", (new StringBuilder()).append("processAssets: writing data to FD : ").append(zzaMM).toString());
                autocloseoutputstream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(zzaMM);
                Object obj;
                autocloseoutputstream.write(zzKl);
                autocloseoutputstream.flush();
                if(Log.isLoggable("WearableClient", 3))
                    Log.d("WearableClient", (new StringBuilder()).append("processAssets: wrote data: ").append(zzaMM).toString());
                obj = Boolean.valueOf(true);
                IOException ioexception;
                try
                {
                    if(Log.isLoggable("WearableClient", 3))
                        Log.d("WearableClient", (new StringBuilder()).append("processAssets: closing: ").append(zzaMM).toString());
                    autocloseoutputstream.close();
                }
                catch(IOException ioexception1)
                {
                    return ((Boolean) (obj));
                }
                return ((Boolean) (obj));
                obj;
                Log.w("WearableClient", (new StringBuilder()).append("processAssets: writing data failed: ").append(zzaMM).toString());
                try
                {
                    if(Log.isLoggable("WearableClient", 3))
                        Log.d("WearableClient", (new StringBuilder()).append("processAssets: closing: ").append(zzaMM).toString());
                    autocloseoutputstream.close();
                }
                // Misplaced declaration of an exception variable
                catch(IOException ioexception) { }
                return Boolean.valueOf(false);
                obj;
                try
                {
                    if(Log.isLoggable("WearableClient", 3))
                        Log.d("WearableClient", (new StringBuilder()).append("processAssets: closing: ").append(zzaMM).toString());
                    autocloseoutputstream.close();
                }
                // Misplaced declaration of an exception variable
                catch(IOException ioexception) { }
                throw obj;
            }

            final byte zzKl[];
            final ParcelFileDescriptor zzaMM;
            final zzbk zzaMN;

            
            {
                zzaMN = zzbk.this;
                zzaMM = parcelfiledescriptor;
                zzKl = abyte0;
                super();
            }
        }
);
    }

    private FutureTask zzb(com.google.android.gms.common.api.zza.zzb zzb1, String s, Uri uri, long l, long l1)
    {
        com.google.android.gms.common.internal.zzv.zzr(zzb1);
        com.google.android.gms.common.internal.zzv.zzr(s);
        com.google.android.gms.common.internal.zzv.zzr(uri);
        boolean flag;
        if(l >= 0L)
            flag = true;
        else
            flag = false;
        com.google.android.gms.common.internal.zzv.zzb(flag, "startOffset is negative: %s", new Object[] {
            Long.valueOf(l)
        });
        if(l1 >= -1L)
            flag = true;
        else
            flag = false;
        com.google.android.gms.common.internal.zzv.zzb(flag, "invalid length: %s", new Object[] {
            Long.valueOf(l1)
        });
        return new FutureTask(new Runnable(uri, zzb1, s, l, l1) {

            public void run()
            {
                Object obj;
                if(Log.isLoggable("WearableClient", 2))
                    Log.v("WearableClient", "Executing sendFileToChannelTask");
                if(!"file".equals(zzayj.getScheme()))
                {
                    Log.w("WearableClient", "Channel.sendFile used with non-file URI");
                    zzaxh.zzk(new Status(10, "Channel.sendFile used with non-file URI"));
                    return;
                }
                File file = new File(zzayj.getPath());
                try
                {
                    obj = ParcelFileDescriptor.open(file, 0x10000000);
                }
                // Misplaced declaration of an exception variable
                catch(Object obj)
                {
                    Log.w("WearableClient", (new StringBuilder()).append("File couldn't be opened for Channel.sendFile: ").append(file).toString());
                    zzaxh.zzk(new Status(13));
                    return;
                }
                ((zzat)zzaMN.zzlX()).zza(new zzbj.zzr(zzaxh), zzaMO, ((ParcelFileDescriptor) (obj)), zzaLG, zzaLH);
                try
                {
                    ((ParcelFileDescriptor) (obj)).close();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch(Object obj)
                {
                    Log.w("WearableClient", "Failed to close sourceFd", ((Throwable) (obj)));
                }
                return;
                Object obj1;
                obj1;
                Log.w("WearableClient", "Channel.sendFile failed.", ((Throwable) (obj1)));
                zzaxh.zzk(new Status(8));
                try
                {
                    ((ParcelFileDescriptor) (obj)).close();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch(Object obj)
                {
                    Log.w("WearableClient", "Failed to close sourceFd", ((Throwable) (obj)));
                }
                return;
                obj1;
                try
                {
                    ((ParcelFileDescriptor) (obj)).close();
                }
                catch(IOException ioexception)
                {
                    Log.w("WearableClient", "Failed to close sourceFd", ioexception);
                }
                throw obj1;
            }

            final long zzaLG;
            final long zzaLH;
            final zzbk zzaMN;
            final String zzaMO;
            final com.google.android.gms.common.api.zza.zzb zzaxh;
            final Uri zzayj;

            
            {
                zzaMN = zzbk.this;
                zzayj = uri;
                zzaxh = zzb1;
                zzaMO = s;
                zzaLG = l;
                zzaLH = l1;
                super();
            }
        }
, null);
    }

    private FutureTask zzb(com.google.android.gms.common.api.zza.zzb zzb1, String s, Uri uri, boolean flag)
    {
        com.google.android.gms.common.internal.zzv.zzr(zzb1);
        com.google.android.gms.common.internal.zzv.zzr(s);
        com.google.android.gms.common.internal.zzv.zzr(uri);
        return new FutureTask(new Runnable(uri, zzb1, flag, s) {

            public void run()
            {
                Object obj;
                if(Log.isLoggable("WearableClient", 2))
                    Log.v("WearableClient", "Executing receiveFileFromChannelTask");
                if(!"file".equals(zzayj.getScheme()))
                {
                    Log.w("WearableClient", "Channel.receiveFile used with non-file URI");
                    zzaxh.zzk(new Status(10, "Channel.receiveFile used with non-file URI"));
                    return;
                }
                File file = new File(zzayj.getPath());
                int i;
                if(zzaLF)
                    i = 0x2000000;
                else
                    i = 0;
                try
                {
                    obj = ParcelFileDescriptor.open(file, i | 0x20000000);
                }
                // Misplaced declaration of an exception variable
                catch(Object obj)
                {
                    Log.w("WearableClient", (new StringBuilder()).append("File couldn't be opened for Channel.receiveFile: ").append(file).toString());
                    zzaxh.zzk(new Status(13));
                    return;
                }
                ((zzat)zzaMN.zzlX()).zza(new zzbj.zzu(zzaxh), zzaMO, ((ParcelFileDescriptor) (obj)));
                try
                {
                    ((ParcelFileDescriptor) (obj)).close();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch(Object obj)
                {
                    Log.w("WearableClient", "Failed to close targetFd", ((Throwable) (obj)));
                }
                return;
                Object obj1;
                obj1;
                Log.w("WearableClient", "Channel.receiveFile failed.", ((Throwable) (obj1)));
                zzaxh.zzk(new Status(8));
                try
                {
                    ((ParcelFileDescriptor) (obj)).close();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch(Object obj)
                {
                    Log.w("WearableClient", "Failed to close targetFd", ((Throwable) (obj)));
                }
                return;
                obj1;
                try
                {
                    ((ParcelFileDescriptor) (obj)).close();
                }
                catch(IOException ioexception)
                {
                    Log.w("WearableClient", "Failed to close targetFd", ioexception);
                }
                throw obj1;
            }

            final boolean zzaLF;
            final zzbk zzaMN;
            final String zzaMO;
            final com.google.android.gms.common.api.zza.zzb zzaxh;
            final Uri zzayj;

            
            {
                zzaMN = zzbk.this;
                zzayj = uri;
                zzaxh = zzb1;
                zzaLF = flag;
                zzaMO = s;
                super();
            }
        }
, null);
    }

    private zzau zzez(String s)
    {
        zzau zzau2 = (zzau)zzaML.get(s);
        zzau zzau1 = zzau2;
        if(zzau2 == null)
        {
            zzau1 = new zzau();
            zzaML.put(s, zzau1);
        }
        return zzau1;
    }

    public void disconnect()
    {
        zzaMF.zzb(this);
        zzaMH.zzb(this);
        zzaMI.zzb(this);
        zzaMJ.zzb(this);
        zzaMK.zzb(this);
        Map map = zzaML;
        map;
        JVM INSTR monitorenter ;
        for(Iterator iterator = zzaML.values().iterator(); iterator.hasNext(); ((zzau)iterator.next()).zzb(this));
        break MISSING_BLOCK_LABEL_92;
        Exception exception;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        map;
        JVM INSTR monitorexit ;
        super.disconnect();
        return;
    }

    protected IInterface zzD(IBinder ibinder)
    {
        return zzcW(ibinder);
    }

    protected void zza(int i, IBinder ibinder, Bundle bundle)
    {
        if(Log.isLoggable("WearableClient", 2))
            Log.d("WearableClient", (new StringBuilder()).append("onPostInitHandler: statusCode ").append(i).toString());
        if(i != 0) goto _L2; else goto _L1
_L1:
        zzaMF.zzcV(ibinder);
        zzaMH.zzcV(ibinder);
        zzaMI.zzcV(ibinder);
        zzaMJ.zzcV(ibinder);
        zzaMK.zzcV(ibinder);
        Map map = zzaML;
        map;
        JVM INSTR monitorenter ;
        for(Iterator iterator = zzaML.values().iterator(); iterator.hasNext(); ((zzau)iterator.next()).zzcV(ibinder));
        break MISSING_BLOCK_LABEL_136;
        ibinder;
        map;
        JVM INSTR monitorexit ;
        throw ibinder;
        map;
        JVM INSTR monitorexit ;
_L2:
        super.zza(i, ibinder, bundle);
        return;
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, Uri uri)
        throws RemoteException
    {
        ((zzat)zzlX()).zza(new zzbj.zzk(zzb1), uri);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, Uri uri, int i)
        throws RemoteException
    {
        ((zzat)zzlX()).zza(new zzbj.zzl(zzb1), uri, i);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, Asset asset)
        throws RemoteException
    {
        ((zzat)zzlX()).zza(new zzbj.zzm(zzb1), asset);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, String s)
        throws RemoteException
    {
        synchronized(zzaML)
        {
            zzez(s).zza(this, zzb1, capabilitylistener, zzbl.zza(capabilitylistener, s));
        }
        return;
        zzb1;
        map;
        JVM INSTR monitorexit ;
        throw zzb1;
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener, String s)
        throws RemoteException
    {
        if(s == null)
        {
            zzaMG.zza(this, zzb1, channellistener, zzbl.zzb(channellistener));
            return;
        } else
        {
            channellistener = new zzbf(s, channellistener);
            zzaMG.zza(this, zzb1, channellistener, zzbl.zza(channellistener, s));
            return;
        }
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.wearable.DataApi.DataListener datalistener)
        throws RemoteException
    {
        zzaMH.zza(this, zzb1, datalistener);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.wearable.DataApi.DataListener datalistener, IntentFilter aintentfilter[])
        throws RemoteException
    {
        zzaMH.zza(this, zzb1, datalistener, zzbl.zza(datalistener, aintentfilter));
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, DataItemAsset dataitemasset)
        throws RemoteException
    {
        zza(zzb1, Asset.createFromRef(dataitemasset.getId()));
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener)
        throws RemoteException
    {
        zzaMI.zza(this, zzb1, messagelistener);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, IntentFilter aintentfilter[])
        throws RemoteException
    {
        zzaMI.zza(this, zzb1, messagelistener, zzbl.zza(messagelistener, aintentfilter));
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
        throws RemoteException
    {
        zzaMJ.zza(this, zzb1, nodelistener, zzbl.zza(nodelistener));
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, PutDataRequest putdatarequest)
        throws RemoteException
    {
        for(Iterator iterator = putdatarequest.getAssets().entrySet().iterator(); iterator.hasNext();)
        {
            Asset asset = (Asset)((java.util.Map.Entry)iterator.next()).getValue();
            if(asset.getData() == null && asset.getDigest() == null && asset.getFd() == null && asset.getUri() == null)
                throw new IllegalArgumentException((new StringBuilder()).append("Put for ").append(putdatarequest.getUri()).append(" contains invalid asset: ").append(asset).toString());
        }

        PutDataRequest putdatarequest1 = PutDataRequest.zzn(putdatarequest.getUri());
        putdatarequest1.setData(putdatarequest.getData());
        ArrayList arraylist = new ArrayList();
        for(Iterator iterator1 = putdatarequest.getAssets().entrySet().iterator(); iterator1.hasNext();)
        {
            Object obj = (java.util.Map.Entry)iterator1.next();
            Asset asset1 = (Asset)((java.util.Map.Entry) (obj)).getValue();
            if(asset1.getData() == null)
            {
                putdatarequest1.putAsset((String)((java.util.Map.Entry) (obj)).getKey(), (Asset)((java.util.Map.Entry) (obj)).getValue());
            } else
            {
                ParcelFileDescriptor aparcelfiledescriptor[];
                try
                {
                    aparcelfiledescriptor = ParcelFileDescriptor.createPipe();
                }
                // Misplaced declaration of an exception variable
                catch(com.google.android.gms.common.api.zza.zzb zzb1)
                {
                    throw new IllegalStateException((new StringBuilder()).append("Unable to create ParcelFileDescriptor for asset in request: ").append(putdatarequest).toString(), zzb1);
                }
                if(Log.isLoggable("WearableClient", 3))
                    Log.d("WearableClient", (new StringBuilder()).append("processAssets: replacing data with FD in asset: ").append(asset1).append(" read:").append(aparcelfiledescriptor[0]).append(" write:").append(aparcelfiledescriptor[1]).toString());
                putdatarequest1.putAsset((String)((java.util.Map.Entry) (obj)).getKey(), Asset.createFromFd(aparcelfiledescriptor[0]));
                obj = zza(aparcelfiledescriptor[1], asset1.getData());
                arraylist.add(obj);
                zzaEN.submit(((Runnable) (obj)));
            }
        }

        ((zzat)zzlX()).zza(new zzbj.zzq(zzb1, arraylist), putdatarequest1);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, Uri uri, long l, long l1)
    {
        try
        {
            s = zzb(zzb1, s, uri, l, l1);
            zzaEN.submit(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            zzb1.zzk(new Status(8));
        }
        throw s;
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, Uri uri, boolean flag)
    {
        try
        {
            s = zzb(zzb1, s, uri, flag);
            zzaEN.submit(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            zzb1.zzk(new Status(8));
        }
        throw s;
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, byte abyte0[])
        throws RemoteException
    {
        ((zzat)zzlX()).zza(new zzbj.zzt(zzb1), s, s1, abyte0);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, Uri uri, int i)
        throws RemoteException
    {
        ((zzat)zzlX()).zzb(new zzbj.zze(zzb1), uri, i);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, String s)
        throws RemoteException
    {
        synchronized(zzaML)
        {
            zzau zzau1 = zzez(s);
            zzau1.zza(this, zzb1, capabilitylistener);
            if(zzau1.isEmpty())
                zzaML.remove(s);
        }
        return;
        zzb1;
        map;
        JVM INSTR monitorexit ;
        throw zzb1;
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener, String s)
        throws RemoteException
    {
        if(s == null)
        {
            zzaMG.zza(this, zzb1, channellistener);
            return;
        } else
        {
            channellistener = new zzbf(s, channellistener);
            zzaMG.zza(this, zzb1, channellistener);
            return;
        }
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
        throws RemoteException
    {
        zzaMJ.zza(this, zzb1, nodelistener);
    }

    protected zzat zzcW(IBinder ibinder)
    {
        return zzat.zza.zzcU(ibinder);
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zzb1, int i)
        throws RemoteException
    {
        ((zzat)zzlX()).zza(new zzbj.zzf(zzb1), i);
    }

    public void zze(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1)
        throws RemoteException
    {
        ((zzat)zzlX()).zza(new zzbj.zzp(zzb1), s, s1);
    }

    protected String zzeq()
    {
        return "com.google.android.gms.wearable.BIND";
    }

    protected String zzer()
    {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    public void zzg(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i)
        throws RemoteException
    {
        ((zzat)zzlX()).zza(new zzbj.zzg(zzb1), s, i);
    }

    public void zzh(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i)
        throws RemoteException
    {
        ((zzat)zzlX()).zzb(new zzbj.zzd(zzb1), s, i);
    }

    public void zzl(com.google.android.gms.common.api.zza.zzb zzb1)
        throws RemoteException
    {
        ((zzat)zzlX()).zzb(new zzbj.zzl(zzb1));
    }

    public void zzm(com.google.android.gms.common.api.zza.zzb zzb1)
        throws RemoteException
    {
        ((zzat)zzlX()).zzc(new zzbj.zzn(zzb1));
    }

    public void zzn(com.google.android.gms.common.api.zza.zzb zzb1)
        throws RemoteException
    {
        ((zzat)zzlX()).zzd(new zzbj.zzj(zzb1));
    }

    public void zzs(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((zzat)zzlX()).zzd(new zzbj.zza(zzb1), s);
    }

    public void zzt(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((zzat)zzlX()).zze(new zzbj.zzs(zzb1), s);
    }

    public void zzu(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((zzat)zzlX()).zzf(new zzbj.zzc(zzb1), s);
    }

    public void zzv(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        zzq zzq1 = new zzq();
        ((zzat)zzlX()).zza(new zzbj.zzh(zzb1, zzq1), zzq1, s);
    }

    public void zzw(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        zzq zzq1 = new zzq();
        ((zzat)zzlX()).zzb(new zzbj.zzi(zzb1, zzq1), zzq1, s);
    }

    private final ExecutorService zzaEN = Executors.newCachedThreadPool();
    private final zzau zzaMF = new zzau();
    private final zzau zzaMG = new zzau();
    private final zzau zzaMH = new zzau();
    private final zzau zzaMI = new zzau();
    private final zzau zzaMJ = new zzau();
    private final zzau zzaMK = new zzau();
    private final Map zzaML = new HashMap();
}
