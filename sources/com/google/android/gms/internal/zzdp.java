// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.webkit.*;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//            zzdn, zzfl

public class zzdp
    implements zzdn
{

    public zzdp(Context context)
    {
        mContext = context;
    }

    public void zza(String s, String s1, String s2)
    {
        zzb.zzaj("Fetching assets for the given html");
        zzfl.zzCr.post(new Runnable(s1, s2) {

            public void run()
            {
                WebView webview = zzxk.zzdS();
                webview.setWebViewClient(new WebViewClient(this, webview) {

                    public void onPageFinished(WebView webview, String s)
                    {
                        zzb.zzaj("Loading assets have finished");
                        zzxl.zzxk.zzxh.remove(zzps);
                    }

                    public void onReceivedError(WebView webview, int i, String s, String s1)
                    {
                        zzb.zzan("Loading assets have failed.");
                        zzxl.zzxk.zzxh.remove(zzps);
                    }

                    final WebView zzps;
                    final _cls1 zzxl;

            
            {
                zzxl = _pcls1;
                zzps = webview;
                super();
            }
                }
);
                zzxk.zzxh.add(webview);
                webview.loadDataWithBaseURL(zzxi, zzxj, "text/html", "UTF-8", null);
                zzb.zzaj("Fetching assets finished.");
            }

            final String zzxi;
            final String zzxj;
            final zzdp zzxk;

            
            {
                zzxk = zzdp.this;
                zzxi = s;
                zzxj = s1;
                super();
            }
        }
);
    }

    public WebView zzdS()
    {
        WebView webview = new WebView(mContext);
        webview.getSettings().setJavaScriptEnabled(true);
        return webview;
    }

    private final Context mContext;
    final Set zzxh = Collections.synchronizedSet(new HashSet());
}
