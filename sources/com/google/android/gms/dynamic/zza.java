// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzf;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.dynamic:
//            LifecycleDelegate, zzf

public abstract class com.google.android.gms.dynamic.zza
{
    private static interface zza
    {

        public abstract int getState();

        public abstract void zzb(LifecycleDelegate lifecycledelegate);
    }


    public com.google.android.gms.dynamic.zza()
    {
    }

    static Bundle zza(com.google.android.gms.dynamic.zza zza1, Bundle bundle)
    {
        zza1.zzace = bundle;
        return bundle;
    }

    static LifecycleDelegate zza(com.google.android.gms.dynamic.zza zza1, LifecycleDelegate lifecycledelegate)
    {
        zza1.zzacd = lifecycledelegate;
        return lifecycledelegate;
    }

    static LinkedList zza(com.google.android.gms.dynamic.zza zza1)
    {
        return zza1.zzacf;
    }

    private void zza(Bundle bundle, zza zza1)
    {
        if(zzacd != null)
        {
            zza1.zzb(zzacd);
            return;
        }
        if(zzacf == null)
            zzacf = new LinkedList();
        zzacf.add(zza1);
        if(bundle != null)
            if(zzace == null)
                zzace = (Bundle)bundle.clone();
            else
                zzace.putAll(bundle);
        zza(zzacg);
    }

    static LifecycleDelegate zzb(com.google.android.gms.dynamic.zza zza1)
    {
        return zza1.zzacd;
    }

    public static void zzb(FrameLayout framelayout)
    {
        Context context = framelayout.getContext();
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        String s1 = zzf.zzh(context, i);
        String s = zzf.zzi(context, i);
        LinearLayout linearlayout = new LinearLayout(framelayout.getContext());
        linearlayout.setOrientation(1);
        linearlayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        framelayout.addView(linearlayout);
        framelayout = new TextView(framelayout.getContext());
        framelayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        framelayout.setText(s1);
        linearlayout.addView(framelayout);
        if(s != null)
        {
            framelayout = new Button(context);
            framelayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
            framelayout.setText(s);
            linearlayout.addView(framelayout);
            framelayout.setOnClickListener(new android.view.View.OnClickListener(context, i) {

                public void onClick(View view)
                {
                    zzoH.startActivity(GooglePlayServicesUtil.zzar(zzaco));
                }

                final int zzaco;
                final Context zzoH;

            
            {
                zzoH = context;
                zzaco = i;
                super();
            }
            }
);
        }
    }

    private void zzdu(int i)
    {
        for(; !zzacf.isEmpty() && ((zza)zzacf.getLast()).getState() >= i; zzacf.removeLast());
    }

    public void onCreate(Bundle bundle)
    {
        zza(bundle, new zza(bundle) {

            public int getState()
            {
                return 1;
            }

            public void zzb(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.zza.zzb(zzach).onCreate(zzack);
            }

            final com.google.android.gms.dynamic.zza zzach;
            final Bundle zzack;

            
            {
                zzach = com.google.android.gms.dynamic.zza.this;
                zzack = bundle;
                super();
            }
        }
);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        FrameLayout framelayout = new FrameLayout(layoutinflater.getContext());
        zza(bundle, new zza(framelayout, layoutinflater, viewgroup, bundle) {

            public int getState()
            {
                return 2;
            }

            public void zzb(LifecycleDelegate lifecycledelegate)
            {
                zzacl.removeAllViews();
                zzacl.addView(com.google.android.gms.dynamic.zza.zzb(zzach).onCreateView(zzacm, zzacn, zzack));
            }

            final com.google.android.gms.dynamic.zza zzach;
            final Bundle zzack;
            final FrameLayout zzacl;
            final LayoutInflater zzacm;
            final ViewGroup zzacn;

            
            {
                zzach = com.google.android.gms.dynamic.zza.this;
                zzacl = framelayout;
                zzacm = layoutinflater;
                zzacn = viewgroup;
                zzack = bundle;
                super();
            }
        }
);
        if(zzacd == null)
            zza(framelayout);
        return framelayout;
    }

    public void onDestroy()
    {
        if(zzacd != null)
        {
            zzacd.onDestroy();
            return;
        } else
        {
            zzdu(1);
            return;
        }
    }

    public void onDestroyView()
    {
        if(zzacd != null)
        {
            zzacd.onDestroyView();
            return;
        } else
        {
            zzdu(2);
            return;
        }
    }

    public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
    {
        zza(bundle1, new zza(activity, bundle, bundle1) {

            public int getState()
            {
                return 0;
            }

            public void zzb(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.zza.zzb(zzach).onInflate(zzaci, zzacj, zzack);
            }

            final com.google.android.gms.dynamic.zza zzach;
            final Activity zzaci;
            final Bundle zzacj;
            final Bundle zzack;

            
            {
                zzach = com.google.android.gms.dynamic.zza.this;
                zzaci = activity;
                zzacj = bundle;
                zzack = bundle1;
                super();
            }
        }
);
    }

    public void onLowMemory()
    {
        if(zzacd != null)
            zzacd.onLowMemory();
    }

    public void onPause()
    {
        if(zzacd != null)
        {
            zzacd.onPause();
            return;
        } else
        {
            zzdu(5);
            return;
        }
    }

    public void onResume()
    {
        zza(((Bundle) (null)), new zza() {

            public int getState()
            {
                return 5;
            }

            public void zzb(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.zza.zzb(zzach).onResume();
            }

            final com.google.android.gms.dynamic.zza zzach;

            
            {
                zzach = com.google.android.gms.dynamic.zza.this;
                super();
            }
        }
);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if(zzacd != null)
            zzacd.onSaveInstanceState(bundle);
        else
        if(zzace != null)
        {
            bundle.putAll(zzace);
            return;
        }
    }

    public void onStart()
    {
        zza(((Bundle) (null)), new zza() {

            public int getState()
            {
                return 4;
            }

            public void zzb(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.zza.zzb(zzach).onStart();
            }

            final com.google.android.gms.dynamic.zza zzach;

            
            {
                zzach = com.google.android.gms.dynamic.zza.this;
                super();
            }
        }
);
    }

    public void onStop()
    {
        if(zzacd != null)
        {
            zzacd.onStop();
            return;
        } else
        {
            zzdu(4);
            return;
        }
    }

    protected void zza(FrameLayout framelayout)
    {
        zzb(framelayout);
    }

    protected abstract void zza(com.google.android.gms.dynamic.zzf zzf1);

    public LifecycleDelegate zzou()
    {
        return zzacd;
    }

    private LifecycleDelegate zzacd;
    private Bundle zzace;
    private LinkedList zzacf;
    private final com.google.android.gms.dynamic.zzf zzacg = new com.google.android.gms.dynamic.zzf() {

        public void zza(LifecycleDelegate lifecycledelegate)
        {
            com.google.android.gms.dynamic.zza.zza(zzach, lifecycledelegate);
            for(lifecycledelegate = com.google.android.gms.dynamic.zza.zza(zzach).iterator(); lifecycledelegate.hasNext(); ((zza)lifecycledelegate.next()).zzb(com.google.android.gms.dynamic.zza.zzb(zzach)));
            com.google.android.gms.dynamic.zza.zza(zzach).clear();
            com.google.android.gms.dynamic.zza.zza(zzach, null);
        }

        final com.google.android.gms.dynamic.zza zzach;

            
            {
                zzach = com.google.android.gms.dynamic.zza.this;
                super();
            }
    }
;
}
