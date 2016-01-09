// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.internal.*;
import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzaz, zzbg, zzbf, zzcb

class zzcn
    implements zzp.zzf
{

    zzcn(Context context, String s)
    {
        mContext = context;
        zzaCk = s;
    }

    private com.google.android.gms.internal.zzmq.zzc zza(ByteArrayOutputStream bytearrayoutputstream)
    {
        try
        {
            bytearrayoutputstream = zzaz.zzdQ(bytearrayoutputstream.toString("UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch(ByteArrayOutputStream bytearrayoutputstream)
        {
            zzbg.zzaj("Failed to convert binary resource to string for JSON parsing; the file format is not UTF-8 format.");
            return null;
        }
        // Misplaced declaration of an exception variable
        catch(ByteArrayOutputStream bytearrayoutputstream)
        {
            zzbg.zzan("Failed to extract the container from the resource file. Resource is a UTF-8 encoded string but doesn't contain a JSON container");
            return null;
        }
        return bytearrayoutputstream;
    }

    private void zzd(com.google.android.gms.internal.zzmi.zza zza1)
        throws IllegalArgumentException
    {
        if(zza1.zzhh == null && zza1.zzaGM == null)
            throw new IllegalArgumentException("Resource and SupplementedResource are NULL.");
        else
            return;
    }

    private com.google.android.gms.internal.zzmq.zzc zzn(byte abyte0[])
    {
        try
        {
            abyte0 = zzmq.zzb(com.google.android.gms.internal.zzc.zzf.zza(abyte0));
        }
        // Misplaced declaration of an exception variable
        catch(byte abyte0[])
        {
            zzbg.zzak("The resource file is corrupted. The container cannot be extracted from the binary file");
            return null;
        }
        // Misplaced declaration of an exception variable
        catch(byte abyte0[])
        {
            zzbg.zzan("The resource file is invalid. The container from the binary file is invalid");
            return null;
        }
        if(abyte0 == null)
            break MISSING_BLOCK_LABEL_17;
        zzbg.zzam("The container was successfully loaded from the resource (using binary file)");
        return abyte0;
    }

    public void release()
    {
        this;
        JVM INSTR monitorenter ;
        zzaEN.shutdown();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void zza(zzbf zzbf1)
    {
        zzaEG = zzbf1;
    }

    public void zzb(com.google.android.gms.internal.zzmi.zza zza1)
    {
        zzaEN.execute(new Runnable(zza1) {

            public void run()
            {
                zzaEO.zzc(zzaEP);
            }

            final zzcn zzaEO;
            final com.google.android.gms.internal.zzmi.zza zzaEP;

            
            {
                zzaEO = zzcn.this;
                zzaEP = zza1;
                super();
            }
        }
);
    }

    boolean zzc(com.google.android.gms.internal.zzmi.zza zza1)
    {
        FileOutputStream fileoutputstream;
        File file;
        file = zzxu();
        try
        {
            fileoutputstream = new FileOutputStream(file);
        }
        // Misplaced declaration of an exception variable
        catch(com.google.android.gms.internal.zzmi.zza zza1)
        {
            zzbg.zzak("Error opening resource file for writing");
            return false;
        }
        fileoutputstream.write(zzny.zzf(zza1));
        try
        {
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch(com.google.android.gms.internal.zzmi.zza zza1)
        {
            zzbg.zzan("error closing stream for writing resource to disk");
            return true;
        }
        return true;
        zza1;
        zzbg.zzan("Error writing resource to disk. Removing resource from disk.");
        file.delete();
        try
        {
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch(com.google.android.gms.internal.zzmi.zza zza1)
        {
            zzbg.zzan("error closing stream for writing resource to disk");
            return false;
        }
        return false;
        zza1;
        try
        {
            fileoutputstream.close();
        }
        catch(IOException ioexception)
        {
            zzbg.zzan("error closing stream for writing resource to disk");
        }
        throw zza1;
    }

    public com.google.android.gms.internal.zzmq.zzc zzhC(int i)
    {
        Object obj;
        Object obj1;
        try
        {
            obj1 = mContext.getResources().openRawResource(i);
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            zzbg.zzan((new StringBuilder()).append("Failed to load the container. No default container resource found with the resource ID ").append(i).toString());
            return null;
        }
        zzbg.zzam((new StringBuilder()).append("Attempting to load a container from the resource ID ").append(i).append(" (").append(mContext.getResources().getResourceName(i)).append(")").toString());
        try
        {
            obj = new ByteArrayOutputStream();
            zzmq.zzc(((java.io.InputStream) (obj1)), ((java.io.OutputStream) (obj)));
            obj1 = zza(((ByteArrayOutputStream) (obj)));
        }
        catch(IOException ioexception)
        {
            zzbg.zzan((new StringBuilder()).append("Error reading the default container with resource ID ").append(i).append(" (").append(mContext.getResources().getResourceName(i)).append(")").toString());
            return null;
        }
        if(obj1 == null)
            break MISSING_BLOCK_LABEL_113;
        zzbg.zzam("The container was successfully loaded from the resource (using JSON file format)");
        return ((com.google.android.gms.internal.zzmq.zzc) (obj1));
        obj = zzn(((ByteArrayOutputStream) (obj)).toByteArray());
        return ((com.google.android.gms.internal.zzmq.zzc) (obj));
    }

    public void zzwC()
    {
        zzaEN.execute(new Runnable() {

            public void run()
            {
                zzaEO.zzxt();
            }

            final zzcn zzaEO;

            
            {
                zzaEO = zzcn.this;
                super();
            }
        }
);
    }

    void zzxt()
    {
        Object obj;
        if(zzaEG == null)
            throw new IllegalStateException("Callback must be set before execute");
        zzaEG.zzwB();
        zzbg.zzam("Attempting to load resource from disk");
        if((zzcb.zzxl().zzxm() == zzcb.zza.zzaEv || zzcb.zzxl().zzxm() == zzcb.zza.zzaEw) && zzaCk.equals(zzcb.zzxl().getContainerId()))
        {
            zzaEG.zza(zzbf.zza.zzaDU);
            return;
        }
        Object obj1;
        try
        {
            obj = new FileInputStream(zzxu());
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            zzbg.zzaj("Failed to find the resource in the disk");
            zzaEG.zza(zzbf.zza.zzaDU);
            return;
        }
        obj1 = new ByteArrayOutputStream();
        zzmq.zzc(((java.io.InputStream) (obj)), ((java.io.OutputStream) (obj1)));
        obj1 = com.google.android.gms.internal.zzmi.zza.zzo(((ByteArrayOutputStream) (obj1)).toByteArray());
        zzd(((com.google.android.gms.internal.zzmi.zza) (obj1)));
        zzaEG.zzv(obj1);
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            zzbg.zzan("Error closing stream for reading resource from disk");
        }
_L1:
        zzbg.zzam("The Disk resource was successfully read.");
        return;
        Object obj2;
        obj2;
        zzaEG.zza(zzbf.zza.zzaDV);
        zzbg.zzan("Failed to read the resource from disk");
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            zzbg.zzan("Error closing stream for reading resource from disk");
        }
          goto _L1
        obj2;
        zzaEG.zza(zzbf.zza.zzaDV);
        zzbg.zzan("Failed to read the resource from disk. The resource is inconsistent");
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            zzbg.zzan("Error closing stream for reading resource from disk");
        }
          goto _L1
        obj2;
        try
        {
            ((FileInputStream) (obj)).close();
        }
        catch(IOException ioexception)
        {
            zzbg.zzan("Error closing stream for reading resource from disk");
        }
        throw obj2;
    }

    File zzxu()
    {
        String s = (new StringBuilder()).append("resource_").append(zzaCk).toString();
        return new File(mContext.getDir("google_tagmanager", 0), s);
    }

    private final Context mContext;
    private final String zzaCk;
    private zzbf zzaEG;
    private final ExecutorService zzaEN = Executors.newSingleThreadExecutor();
}
