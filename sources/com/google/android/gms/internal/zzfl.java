// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.app.*;
import android.content.*;
import android.content.pm.*;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.*;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.*;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.PopupWindow;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzj;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.internal:
//            zzfi, zzat, zzap, zzk, 
//            zzfp, zzgd, zzfm, zzak

public class zzfl
{
    private final class zza extends BroadcastReceiver
    {

        public void onReceive(Context context, Intent intent)
        {
            if("android.intent.action.USER_PRESENT".equals(intent.getAction()))
                com.google.android.gms.internal.zzfl.zza(zzCu, true);
            else
            if("android.intent.action.SCREEN_OFF".equals(intent.getAction()))
            {
                com.google.android.gms.internal.zzfl.zza(zzCu, false);
                return;
            }
        }

        final zzfl zzCu;

        private zza()
        {
            zzCu = zzfl.this;
            super();
        }

    }


    public zzfl()
    {
        zzCs = true;
        zzCt = false;
    }

    static Object zza(zzfl zzfl1)
    {
        return zzfl1.zzoe;
    }

    static String zza(zzfl zzfl1, String s)
    {
        zzfl1.zzBW = s;
        return s;
    }

    private JSONArray zza(Collection collection)
        throws JSONException
    {
        JSONArray jsonarray = new JSONArray();
        for(collection = collection.iterator(); collection.hasNext(); zza(jsonarray, collection.next()));
        return jsonarray;
    }

    private void zza(JSONArray jsonarray, Object obj)
        throws JSONException
    {
        if(obj instanceof Bundle)
        {
            jsonarray.put(zzd((Bundle)obj));
            return;
        }
        if(obj instanceof Map)
        {
            jsonarray.put(zzx((Map)obj));
            return;
        }
        if(obj instanceof Collection)
        {
            jsonarray.put(zza((Collection)obj));
            return;
        }
        if(obj instanceof Object[])
        {
            jsonarray.put(zza((Object[])(Object[])obj));
            return;
        } else
        {
            jsonarray.put(obj);
            return;
        }
    }

    private void zza(JSONObject jsonobject, String s, Object obj)
        throws JSONException
    {
        if(obj instanceof Bundle)
        {
            jsonobject.put(s, zzd((Bundle)obj));
            return;
        }
        if(obj instanceof Map)
        {
            jsonobject.put(s, zzx((Map)obj));
            return;
        }
        if(obj instanceof Collection)
        {
            if(s == null)
                s = "null";
            jsonobject.put(s, zza((Collection)obj));
            return;
        }
        if(obj instanceof Object[])
        {
            jsonobject.put(s, zza(((Collection) (Arrays.asList((Object[])(Object[])obj)))));
            return;
        } else
        {
            jsonobject.put(s, obj);
            return;
        }
    }

    static boolean zza(zzfl zzfl1, boolean flag)
    {
        zzfl1.zzCs = flag;
        return flag;
    }

    private JSONObject zzd(Bundle bundle)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        String s;
        for(Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); zza(jsonobject, s, bundle.get(s)))
            s = (String)iterator.next();

        return jsonobject;
    }

    private boolean zzm(Context context)
    {
        context = (PowerManager)context.getSystemService("power");
        if(context == null)
            return false;
        else
            return context.isScreenOn();
    }

    public String zzA(Context context)
    {
        context = (ActivityManager)context.getSystemService("activity");
        if(context == null)
            return null;
        context = context.getRunningTasks(1);
        if(context == null)
            break MISSING_BLOCK_LABEL_68;
        if(context.isEmpty())
            break MISSING_BLOCK_LABEL_68;
        context = (android.app.ActivityManager.RunningTaskInfo)context.get(0);
        if(context == null)
            break MISSING_BLOCK_LABEL_68;
        if(((android.app.ActivityManager.RunningTaskInfo) (context)).topActivity == null)
            break MISSING_BLOCK_LABEL_68;
        context = ((android.app.ActivityManager.RunningTaskInfo) (context)).topActivity.getClassName();
        return context;
        context;
        return null;
    }

    public boolean zzB(Context context)
    {
        KeyguardManager keyguardmanager;
        Object obj;
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
        boolean flag;
        try
        {
            obj = (ActivityManager)context.getSystemService("activity");
            keyguardmanager = (KeyguardManager)context.getSystemService("keyguard");
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            return false;
        }
        if(obj == null || keyguardmanager == null)
            break MISSING_BLOCK_LABEL_116;
        obj = ((ActivityManager) (obj)).getRunningAppProcesses();
        if(obj == null)
            return false;
        obj = ((List) (obj)).iterator();
        do
        {
            if(!((Iterator) (obj)).hasNext())
                break MISSING_BLOCK_LABEL_111;
            runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
        } while(Process.myPid() != runningappprocessinfo.pid);
        if(runningappprocessinfo.importance != 100 || keyguardmanager.inKeyguardRestrictedInputMode())
            break MISSING_BLOCK_LABEL_111;
        flag = zzm(context);
        if(flag)
            return true;
        return false;
        return false;
    }

    public DisplayMetrics zza(WindowManager windowmanager)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        windowmanager.getDefaultDisplay().getMetrics(displaymetrics);
        return displaymetrics;
    }

    public PopupWindow zza(View view, int i, int j, boolean flag)
    {
        return new PopupWindow(view, i, j, flag);
    }

    public String zza(Context context, View view, AdSizeParcel adsizeparcel)
    {
        if(!((Boolean)zzat.zzrR.get()).booleanValue())
            return null;
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        JSONObject jsonobject1 = new JSONObject();
        jsonobject1.put("width", adsizeparcel.width);
        jsonobject1.put("height", adsizeparcel.height);
        jsonobject.put("size", jsonobject1);
        jsonobject.put("activity", zzA(context));
        if(adsizeparcel.zzpY) goto _L2; else goto _L1
_L1:
        adsizeparcel = new JSONArray();
_L7:
        if(view == null) goto _L4; else goto _L3
_L3:
        int i;
        try
        {
            context = view.getParent();
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Fail to get view hierarchy json", context);
            return null;
        }
        if(context == null)
            break MISSING_BLOCK_LABEL_171;
        i = -1;
        if(context instanceof ViewGroup)
            i = ((ViewGroup)context).indexOfChild(view);
        view = new JSONObject();
        view.put("type", context.getClass().getName());
        view.put("index_of_child", i);
        adsizeparcel.put(view);
        if(context == null)
            break; /* Loop/switch isn't completed */
        if(!(context instanceof View))
            break; /* Loop/switch isn't completed */
        context = (View)context;
          goto _L5
_L4:
        if(adsizeparcel.length() > 0)
            jsonobject.put("parents", adsizeparcel);
_L2:
        context = jsonobject.toString();
        return context;
_L5:
        view = context;
        if(true) goto _L7; else goto _L6
_L6:
        context = null;
          goto _L5
        if(true) goto _L7; else goto _L8
_L8:
    }

    public String zza(Context context, zzk zzk1, String s)
    {
        if(zzk1 == null)
            return s;
        Uri uri;
        Uri uri1;
        try
        {
            uri1 = Uri.parse(s);
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            return s;
        }
        uri = uri1;
        if(zzk1.zzc(uri1))
            uri = zzk1.zza(uri1, context);
        context = uri.toString();
        return context;
    }

    public String zza(InputStreamReader inputstreamreader)
        throws IOException
    {
        StringBuilder stringbuilder = new StringBuilder(8192);
        char ac[] = new char[2048];
        do
        {
            int i = inputstreamreader.read(ac);
            if(i != -1)
                stringbuilder.append(ac, 0, i);
            else
                return stringbuilder.toString();
        } while(true);
    }

    JSONArray zza(Object aobj[])
        throws JSONException
    {
        JSONArray jsonarray = new JSONArray();
        int j = aobj.length;
        for(int i = 0; i < j; i++)
            zza(jsonarray, aobj[i]);

        return jsonarray;
    }

    public void zza(Activity activity, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        activity = activity.getWindow();
        if(activity != null && activity.getDecorView() != null && activity.getDecorView().getViewTreeObserver() != null)
            activity.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(ongloballayoutlistener);
    }

    public void zza(Activity activity, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
    {
        activity = activity.getWindow();
        if(activity != null && activity.getDecorView() != null && activity.getDecorView().getViewTreeObserver() != null)
            activity.getDecorView().getViewTreeObserver().addOnScrollChangedListener(onscrollchangedlistener);
    }

    public void zza(Context context, String s, WebSettings websettings)
    {
        websettings.setUserAgentString(zzf(context, s));
    }

    public void zza(Context context, String s, String s1, Bundle bundle)
    {
        s1 = (new android.net.Uri.Builder()).scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", s1);
        String s2;
        for(Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); s1.appendQueryParameter(s2, bundle.getString(s2)))
            s2 = (String)iterator.next();

        com.google.android.gms.ads.internal.zzh.zzaQ().zzc(context, s, s1.toString());
    }

    public void zza(Context context, String s, List list)
    {
        for(list = list.iterator(); list.hasNext(); (new zzfp(context, s, (String)list.next())).zzeW());
    }

    public void zza(Context context, String s, List list, String s1)
    {
        for(list = list.iterator(); list.hasNext(); (new zzfp(context, s, (String)list.next(), s1)).zzeW());
    }

    public void zza(Context context, String s, boolean flag, HttpURLConnection httpurlconnection)
    {
        zza(context, s, flag, httpurlconnection, false);
    }

    public void zza(Context context, String s, boolean flag, HttpURLConnection httpurlconnection, String s1)
    {
        httpurlconnection.setConnectTimeout(60000);
        httpurlconnection.setInstanceFollowRedirects(flag);
        httpurlconnection.setReadTimeout(60000);
        httpurlconnection.setRequestProperty("User-Agent", s1);
        httpurlconnection.setUseCaches(false);
    }

    public void zza(Context context, String s, boolean flag, HttpURLConnection httpurlconnection, boolean flag1)
    {
        httpurlconnection.setConnectTimeout(60000);
        httpurlconnection.setInstanceFollowRedirects(flag);
        httpurlconnection.setReadTimeout(60000);
        httpurlconnection.setRequestProperty("User-Agent", zzf(context, s));
        httpurlconnection.setUseCaches(flag1);
    }

    public boolean zza(PackageManager packagemanager, String s, String s1)
    {
        return packagemanager.checkPermission(s1, s) == 0;
    }

    public boolean zza(ClassLoader classloader, Class class1, String s)
    {
        boolean flag;
        try
        {
            flag = class1.isAssignableFrom(Class.forName(s, false, classloader));
        }
        // Misplaced declaration of an exception variable
        catch(ClassLoader classloader)
        {
            return false;
        }
        return flag;
    }

    public String zzad(String s)
    {
        return Uri.parse(s).buildUpon().query(null).build().toString();
    }

    public int zzae(String s)
    {
        int i;
        try
        {
            i = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append("Could not parse value:").append(s).toString());
            return 0;
        }
        return i;
    }

    public boolean zzaf(String s)
    {
        if(TextUtils.isEmpty(s))
            return false;
        else
            return s.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    public String zzb(zzgd zzgd1, String s)
    {
        return zza(zzgd1.getContext(), zzgd1.zzfv(), s);
    }

    public void zzb(Activity activity, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
    {
        activity = activity.getWindow();
        if(activity != null && activity.getDecorView() != null && activity.getDecorView().getViewTreeObserver() != null)
            activity.getDecorView().getViewTreeObserver().removeOnScrollChangedListener(onscrollchangedlistener);
    }

    public void zzc(Context context, String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(s1);
        zza(context, s, arraylist);
    }

    public Map zzd(Uri uri)
    {
        if(uri == null)
            return null;
        HashMap hashmap = new HashMap();
        String s;
        for(Iterator iterator = com.google.android.gms.ads.internal.zzh.zzaS().zze(uri).iterator(); iterator.hasNext(); hashmap.put(s, uri.getQueryParameter(s)))
            s = (String)iterator.next();

        return hashmap;
    }

    public boolean zzeZ()
    {
        return zzCs;
    }

    public String zzf(Context context, String s)
    {
label0:
        {
            synchronized(zzoe)
            {
                if(zzBW == null)
                    break label0;
                context = zzBW;
            }
            return context;
        }
        try
        {
            zzBW = com.google.android.gms.ads.internal.zzh.zzaS().getDefaultUserAgent(context);
        }
        catch(Exception exception) { }
        if(!TextUtils.isEmpty(zzBW))
            break MISSING_BLOCK_LABEL_145;
        if(com.google.android.gms.ads.internal.client.zzj.zzbJ().zzfk())
            break MISSING_BLOCK_LABEL_136;
        zzBW = null;
        zzCr.post(new Runnable(context) {

            public void run()
            {
                synchronized(com.google.android.gms.internal.zzfl.zza(zzCu))
                {
                    com.google.android.gms.internal.zzfl.zza(zzCu, zzCu.zzx(zzoH));
                    com.google.android.gms.internal.zzfl.zza(zzCu).notifyAll();
                }
                return;
                exception1;
                obj1;
                JVM INSTR monitorexit ;
                throw exception1;
            }

            final zzfl zzCu;
            final Context zzoH;

            
            {
                zzCu = zzfl.this;
                zzoH = context;
                super();
            }
        }
);
_L1:
        context = zzBW;
        if(context != null)
            break MISSING_BLOCK_LABEL_145;
        zzoe.wait();
          goto _L1
        context;
        zzBW = zzfa();
        com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append("Interrupted, use default user agent: ").append(zzBW).toString());
          goto _L1
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        zzBW = zzx(context);
_L2:
        zzBW = (new StringBuilder()).append(zzBW).append(" (Mobile; ").append(s).append(")").toString();
        context = zzBW;
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        zzBW = zzfa();
          goto _L2
    }

    String zzfa()
    {
        StringBuffer stringbuffer = new StringBuffer(256);
        stringbuffer.append("Mozilla/5.0 (Linux; U; Android");
        if(android.os.Build.VERSION.RELEASE != null)
            stringbuffer.append(" ").append(android.os.Build.VERSION.RELEASE);
        stringbuffer.append("; ").append(Locale.getDefault());
        if(Build.DEVICE != null)
        {
            stringbuffer.append("; ").append(Build.DEVICE);
            if(Build.DISPLAY != null)
                stringbuffer.append(" Build/").append(Build.DISPLAY);
        }
        stringbuffer.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return stringbuffer.toString();
    }

    public String zzfb()
    {
        Object obj;
        byte abyte0[];
        byte abyte1[];
        int i;
        obj = UUID.randomUUID();
        abyte0 = BigInteger.valueOf(((UUID) (obj)).getLeastSignificantBits()).toByteArray();
        abyte1 = BigInteger.valueOf(((UUID) (obj)).getMostSignificantBits()).toByteArray();
        obj = (new BigInteger(1, abyte0)).toString();
        i = 0;
_L2:
        if(i >= 2)
            break; /* Loop/switch isn't completed */
        Object obj1;
        obj1 = MessageDigest.getInstance("MD5");
        ((MessageDigest) (obj1)).update(abyte0);
        ((MessageDigest) (obj1)).update(abyte1);
        byte abyte2[] = new byte[8];
        System.arraycopy(((MessageDigest) (obj1)).digest(), 0, abyte2, 0, 8);
        obj1 = (new BigInteger(1, abyte2)).toString();
        obj = obj1;
_L3:
        i++;
        if(true) goto _L2; else goto _L1
_L1:
        return ((String) (obj));
        NoSuchAlgorithmException nosuchalgorithmexception;
        nosuchalgorithmexception;
          goto _L3
    }

    public String zzfc()
    {
        String s = Build.MANUFACTURER;
        String s1 = Build.MODEL;
        if(s1.startsWith(s))
            return s1;
        else
            return (new StringBuilder()).append(s).append(" ").append(s1).toString();
    }

    protected int[] zzfd()
    {
        return (new int[] {
            0, 0
        });
    }

    public int[] zzg(Activity activity)
    {
        activity = activity.getWindow();
        if(activity != null)
        {
            activity = activity.findViewById(0x1020002);
            if(activity != null)
                return (new int[] {
                    activity.getWidth(), activity.getHeight()
                });
        }
        return zzfd();
    }

    public int[] zzh(Activity activity)
    {
        int ai[] = zzg(activity);
        return (new int[] {
            com.google.android.gms.ads.internal.client.zzj.zzbJ().zzc(activity, ai[0]), com.google.android.gms.ads.internal.client.zzj.zzbJ().zzc(activity, ai[1])
        });
    }

    public int[] zzi(Activity activity)
    {
        activity = activity.getWindow();
        if(activity != null)
        {
            activity = activity.findViewById(0x1020002);
            if(activity != null)
                return (new int[] {
                    activity.getTop(), activity.getBottom()
                });
        }
        return zzfd();
    }

    public Bitmap zzj(View view)
    {
        view.setDrawingCacheEnabled(true);
        Bitmap bitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return bitmap;
    }

    public int[] zzj(Activity activity)
    {
        int ai[] = zzi(activity);
        return (new int[] {
            com.google.android.gms.ads.internal.client.zzj.zzbJ().zzc(activity, ai[0]), com.google.android.gms.ads.internal.client.zzj.zzbJ().zzc(activity, ai[1])
        });
    }

    public int zzk(Activity activity)
    {
        if(activity == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Fail to get AdActivity type since it is null");
            return 0;
        }
        activity = AdOverlayInfoParcel.zzb(activity.getIntent());
        if(activity == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Fail to get AdOverlayInfo");
            return 0;
        }
        switch(((AdOverlayInfoParcel) (activity)).zzwF)
        {
        default:
            return 0;

        case 1: // '\001'
            return 1;

        case 2: // '\002'
            return 2;

        case 3: // '\003'
            return 3;
        }
    }

    public boolean zzv(Context context)
    {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        context = context.getPackageManager().resolveActivity(intent, 0x10000);
        if(context == null || ((ResolveInfo) (context)).activityInfo == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
            return false;
        }
        boolean flag;
        if((((ResolveInfo) (context)).activityInfo.configChanges & 0x10) == 0)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "keyboard"
            }));
            flag = false;
        } else
        {
            flag = true;
        }
        if((((ResolveInfo) (context)).activityInfo.configChanges & 0x20) == 0)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "keyboardHidden"
            }));
            flag = false;
        }
        if((((ResolveInfo) (context)).activityInfo.configChanges & 0x80) == 0)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "orientation"
            }));
            flag = false;
        }
        if((((ResolveInfo) (context)).activityInfo.configChanges & 0x100) == 0)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "screenLayout"
            }));
            flag = false;
        }
        if((((ResolveInfo) (context)).activityInfo.configChanges & 0x200) == 0)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "uiMode"
            }));
            flag = false;
        }
        if((((ResolveInfo) (context)).activityInfo.configChanges & 0x400) == 0)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "screenSize"
            }));
            flag = false;
        }
        if((((ResolveInfo) (context)).activityInfo.configChanges & 0x800) == 0)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "smallestScreenSize"
            }));
            return false;
        } else
        {
            return flag;
        }
    }

    public boolean zzw(Context context)
    {
        if(zzCt)
        {
            return false;
        } else
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.intent.action.USER_PRESENT");
            intentfilter.addAction("android.intent.action.SCREEN_OFF");
            context.getApplicationContext().registerReceiver(new zza(), intentfilter);
            zzCt = true;
            return true;
        }
    }

    protected String zzx(Context context)
    {
        return (new WebView(context)).getSettings().getUserAgentString();
    }

    public JSONObject zzx(Map map)
        throws JSONException
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            String s;
            for(Iterator iterator = map.keySet().iterator(); iterator.hasNext(); zza(jsonobject, s, map.get(s)))
                s = (String)iterator.next();

        }
        // Misplaced declaration of an exception variable
        catch(Map map)
        {
            throw new JSONException((new StringBuilder()).append("Could not convert map to JSON: ").append(map.getMessage()).toString());
        }
        return jsonobject;
    }

    public android.app.AlertDialog.Builder zzy(Context context)
    {
        return new android.app.AlertDialog.Builder(context);
    }

    public zzak zzz(Context context)
    {
        return new zzak(context);
    }

    public static final Handler zzCr = new zzfi(Looper.getMainLooper());
    private String zzBW;
    private boolean zzCs;
    private boolean zzCt;
    private final Object zzoe = new Object();

}
