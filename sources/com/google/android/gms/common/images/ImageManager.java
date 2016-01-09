// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common.images;

import android.app.ActivityManager;
import android.content.*;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.*;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.internal.*;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.common.images:
//            zza

public final class ImageManager
{
    private final class ImageReceiver extends ResultReceiver
    {

        static ArrayList zza(ImageReceiver imagereceiver)
        {
            return imagereceiver.zzSb;
        }

        public void onReceiveResult(int i, Bundle bundle)
        {
            bundle = (ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            ImageManager.zzf(zzSc).execute(zzSc. new zzc(mUri, bundle));
        }

        public void zzb(com.google.android.gms.common.images.zza zza1)
        {
            com.google.android.gms.common.internal.zzb.zzbI("ImageReceiver.addImageRequest() must be called in the main thread");
            zzSb.add(zza1);
        }

        public void zzc(com.google.android.gms.common.images.zza zza1)
        {
            com.google.android.gms.common.internal.zzb.zzbI("ImageReceiver.removeImageRequest() must be called in the main thread");
            zzSb.remove(zza1);
        }

        public void zzlz()
        {
            Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
            intent.putExtra("com.google.android.gms.extras.uri", mUri);
            intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
            intent.putExtra("com.google.android.gms.extras.priority", 3);
            com.google.android.gms.common.images.ImageManager.zzb(zzSc).sendBroadcast(intent);
        }

        private final Uri mUri;
        private final ArrayList zzSb = new ArrayList();
        final ImageManager zzSc;

        ImageReceiver(Uri uri)
        {
            zzSc = ImageManager.this;
            super(new Handler(Looper.getMainLooper()));
            mUri = uri;
        }
    }

    public static interface OnImageLoadedListener
    {

        public abstract void onImageLoaded(Uri uri, Drawable drawable, boolean flag);
    }

    private static final class zza
    {

        static int zza(ActivityManager activitymanager)
        {
            return activitymanager.getLargeMemoryClass();
        }
    }

    private static final class zzb extends zzhp
    {

        private static int zzT(Context context)
        {
            ActivityManager activitymanager = (ActivityManager)context.getSystemService("activity");
            int i;
            if((context.getApplicationInfo().flags & 0x100000) != 0)
                i = 1;
            else
                i = 0;
            if(i != 0 && zzic.zzne())
                i = zza.zza(activitymanager);
            else
                i = activitymanager.getMemoryClass();
            return (int)((float)(i * 0x100000) * 0.33F);
        }

        protected void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
        {
            zza(flag, (zza.zza)obj, (Bitmap)obj1, (Bitmap)obj2);
        }

        protected int sizeOf(Object obj, Object obj1)
        {
            return zza((zza.zza)obj, (Bitmap)obj1);
        }

        protected int zza(zza.zza zza1, Bitmap bitmap)
        {
            return bitmap.getHeight() * bitmap.getRowBytes();
        }

        protected void zza(boolean flag, zza.zza zza1, Bitmap bitmap, Bitmap bitmap1)
        {
            super.entryRemoved(flag, zza1, bitmap, bitmap1);
        }

        public zzb(Context context)
        {
            super(zzT(context));
        }
    }

    private final class zzc
        implements Runnable
    {

        public void run()
        {
            Object obj;
            CountDownLatch countdownlatch;
            boolean flag;
            boolean flag1;
            com.google.android.gms.common.internal.zzb.zzbJ("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            flag = false;
            flag1 = false;
            obj = null;
            countdownlatch = null;
            if(zzSd == null) goto _L2; else goto _L1
_L1:
            obj = BitmapFactory.decodeFileDescriptor(zzSd.getFileDescriptor());
            flag = flag1;
_L3:
            OutOfMemoryError outofmemoryerror;
            try
            {
                zzSd.close();
            }
            catch(IOException ioexception)
            {
                Log.e("ImageManager", "closed failed", ioexception);
            }
_L2:
            countdownlatch = new CountDownLatch(1);
            ImageManager.zzg(zzSc).post(zzSc. new zzf(mUri, ((Bitmap) (obj)), flag, countdownlatch));
            try
            {
                countdownlatch.await();
                return;
            }
            catch(InterruptedException interruptedexception)
            {
                Log.w("ImageManager", (new StringBuilder()).append("Latch interrupted while posting ").append(mUri).toString());
            }
            break MISSING_BLOCK_LABEL_164;
            outofmemoryerror;
            Log.e("ImageManager", (new StringBuilder()).append("OOM while loading bitmap for uri: ").append(mUri).toString(), outofmemoryerror);
            flag = true;
            outofmemoryerror = countdownlatch;
              goto _L3
        }

        private final Uri mUri;
        final ImageManager zzSc;
        private final ParcelFileDescriptor zzSd;

        public zzc(Uri uri, ParcelFileDescriptor parcelfiledescriptor)
        {
            zzSc = ImageManager.this;
            super();
            mUri = uri;
            zzSd = parcelfiledescriptor;
        }
    }

    private final class zzd
        implements Runnable
    {

        public void run()
        {
            com.google.android.gms.common.internal.zzb.zzbI("LoadImageRunnable must be executed on the main thread");
            Object obj = (ImageReceiver)ImageManager.zza(zzSc).get(zzSe);
            if(obj != null)
            {
                ImageManager.zza(zzSc).remove(zzSe);
                ((ImageReceiver) (obj)).zzc(zzSe);
            }
            zza.zza zza1 = zzSe.zzSg;
            if(zza1.uri == null)
            {
                zzSe.zza(com.google.android.gms.common.images.ImageManager.zzb(zzSc), ImageManager.zzc(zzSc), true);
                return;
            }
            obj = ImageManager.zza(zzSc, zza1);
            if(obj != null)
            {
                zzSe.zza(com.google.android.gms.common.images.ImageManager.zzb(zzSc), ((Bitmap) (obj)), true);
                return;
            }
            obj = (Long)ImageManager.zzd(zzSc).get(zza1.uri);
            if(obj != null)
            {
                if(SystemClock.elapsedRealtime() - ((Long) (obj)).longValue() < 0x36ee80L)
                {
                    zzSe.zza(com.google.android.gms.common.images.ImageManager.zzb(zzSc), ImageManager.zzc(zzSc), true);
                    return;
                }
                ImageManager.zzd(zzSc).remove(zza1.uri);
            }
            zzSe.zza(com.google.android.gms.common.images.ImageManager.zzb(zzSc), ImageManager.zzc(zzSc));
            ImageReceiver imagereceiver = (ImageReceiver)ImageManager.zze(zzSc).get(zza1.uri);
            obj = imagereceiver;
            if(imagereceiver == null)
            {
                obj = zzSc. new ImageReceiver(zza1.uri);
                ImageManager.zze(zzSc).put(zza1.uri, obj);
            }
            ((ImageReceiver) (obj)).zzb(zzSe);
            if(!(zzSe instanceof zza.zzc))
                ImageManager.zza(zzSc).put(zzSe, obj);
            synchronized(ImageManager.zzlx())
            {
                if(!ImageManager.zzly().contains(zza1.uri))
                {
                    ImageManager.zzly().add(zza1.uri);
                    ((ImageReceiver) (obj)).zzlz();
                }
            }
            return;
            exception;
            obj1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        final ImageManager zzSc;
        private final com.google.android.gms.common.images.zza zzSe;

        public zzd(com.google.android.gms.common.images.zza zza1)
        {
            zzSc = ImageManager.this;
            super();
            zzSe = zza1;
        }
    }

    private static final class zze
        implements ComponentCallbacks2
    {

        public void onConfigurationChanged(Configuration configuration)
        {
        }

        public void onLowMemory()
        {
            zzRW.evictAll();
        }

        public void onTrimMemory(int i)
        {
            if(i >= 60)
                zzRW.evictAll();
            else
            if(i >= 20)
            {
                zzRW.trimToSize(zzRW.size() / 2);
                return;
            }
        }

        private final zzb zzRW;

        public zze(zzb zzb1)
        {
            zzRW = zzb1;
        }
    }

    private final class zzf
        implements Runnable
    {

        private void zza(ImageReceiver imagereceiver, boolean flag)
        {
            imagereceiver = ImageReceiver.zza(imagereceiver);
            int j = imagereceiver.size();
            int i = 0;
            while(i < j) 
            {
                com.google.android.gms.common.images.zza zza1 = (com.google.android.gms.common.images.zza)imagereceiver.get(i);
                if(flag)
                {
                    zza1.zza(com.google.android.gms.common.images.ImageManager.zzb(zzSc), mBitmap, false);
                } else
                {
                    ImageManager.zzd(zzSc).put(mUri, Long.valueOf(SystemClock.elapsedRealtime()));
                    zza1.zza(com.google.android.gms.common.images.ImageManager.zzb(zzSc), ImageManager.zzc(zzSc), false);
                }
                if(!(zza1 instanceof zza.zzc))
                    ImageManager.zza(zzSc).remove(zza1);
                i++;
            }
        }

        public void run()
        {
            com.google.android.gms.common.internal.zzb.zzbI("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean flag;
            if(mBitmap != null)
                flag = true;
            else
                flag = false;
            if(ImageManager.zzh(zzSc) != null)
            {
                if(zzSf)
                {
                    ImageManager.zzh(zzSc).evictAll();
                    System.gc();
                    zzSf = false;
                    ImageManager.zzg(zzSc).post(this);
                    return;
                }
                if(flag)
                    ImageManager.zzh(zzSc).put(new zza.zza(mUri), mBitmap);
            }
            ImageReceiver imagereceiver = (ImageReceiver)ImageManager.zze(zzSc).remove(mUri);
            if(imagereceiver != null)
                zza(imagereceiver, flag);
            zzns.countDown();
            synchronized(ImageManager.zzlx())
            {
                ImageManager.zzly().remove(mUri);
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private final Bitmap mBitmap;
        private final Uri mUri;
        final ImageManager zzSc;
        private boolean zzSf;
        private final CountDownLatch zzns;

        public zzf(Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
        {
            zzSc = ImageManager.this;
            super();
            mUri = uri;
            mBitmap = bitmap;
            zzSf = flag;
            zzns = countdownlatch;
        }
    }


    private ImageManager(Context context, boolean flag)
    {
        mContext = context.getApplicationContext();
        if(flag)
        {
            zzRW = new zzb(mContext);
            if(zzic.zznh())
                zzlw();
        } else
        {
            zzRW = null;
        }
    }

    public static ImageManager create(Context context)
    {
        return zzb(context, false);
    }

    static Bitmap zza(ImageManager imagemanager, zza.zza zza1)
    {
        return imagemanager.zza(zza1);
    }

    private Bitmap zza(zza.zza zza1)
    {
        if(zzRW == null)
            return null;
        else
            return (Bitmap)zzRW.get(zza1);
    }

    static Map zza(ImageManager imagemanager)
    {
        return imagemanager.zzRY;
    }

    static Context zzb(ImageManager imagemanager)
    {
        return imagemanager.mContext;
    }

    public static ImageManager zzb(Context context, boolean flag)
    {
        if(flag)
        {
            if(zzRU == null)
                zzRU = new ImageManager(context, true);
            return zzRU;
        }
        if(zzRT == null)
            zzRT = new ImageManager(context, false);
        return zzRT;
    }

    static zzhg zzc(ImageManager imagemanager)
    {
        return imagemanager.zzRX;
    }

    static Map zzd(ImageManager imagemanager)
    {
        return imagemanager.zzSa;
    }

    static Map zze(ImageManager imagemanager)
    {
        return imagemanager.zzRZ;
    }

    static ExecutorService zzf(ImageManager imagemanager)
    {
        return imagemanager.zzRV;
    }

    static Handler zzg(ImageManager imagemanager)
    {
        return imagemanager.mHandler;
    }

    static zzb zzh(ImageManager imagemanager)
    {
        return imagemanager.zzRW;
    }

    private void zzlw()
    {
        mContext.registerComponentCallbacks(new zze(zzRW));
    }

    static Object zzlx()
    {
        return zzRR;
    }

    static HashSet zzly()
    {
        return zzRS;
    }

    public void loadImage(ImageView imageview, int i)
    {
        zza(new zza.zzb(imageview, i));
    }

    public void loadImage(ImageView imageview, Uri uri)
    {
        zza(new zza.zzb(imageview, uri));
    }

    public void loadImage(ImageView imageview, Uri uri, int i)
    {
        imageview = new zza.zzb(imageview, uri);
        imageview.zzaI(i);
        zza(imageview);
    }

    public void loadImage(OnImageLoadedListener onimageloadedlistener, Uri uri)
    {
        zza(new zza.zzc(onimageloadedlistener, uri));
    }

    public void loadImage(OnImageLoadedListener onimageloadedlistener, Uri uri, int i)
    {
        onimageloadedlistener = new zza.zzc(onimageloadedlistener, uri);
        onimageloadedlistener.zzaI(i);
        zza(onimageloadedlistener);
    }

    public void zza(com.google.android.gms.common.images.zza zza1)
    {
        com.google.android.gms.common.internal.zzb.zzbI("ImageManager.loadImage() must be called in the main thread");
        (new zzd(zza1)).run();
    }

    private static final Object zzRR = new Object();
    private static HashSet zzRS = new HashSet();
    private static ImageManager zzRT;
    private static ImageManager zzRU;
    private final Context mContext;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private final ExecutorService zzRV = Executors.newFixedThreadPool(4);
    private final zzb zzRW;
    private final zzhg zzRX = new zzhg();
    private final Map zzRY = new HashMap();
    private final Map zzRZ = new HashMap();
    private final Map zzSa = new HashMap();

}
