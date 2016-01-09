// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.*;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.dynamic.*;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.*;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanorama, StreetViewPanoramaOptions, OnStreetViewPanoramaReadyCallback

public class StreetViewPanoramaView extends FrameLayout
{
    static class zza
        implements StreetViewLifecycleDelegate
    {

        public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
        {
            try
            {
                zzauG.getStreetViewPanoramaAsync(new com.google.android.gms.maps.internal.zzv.zza(this, onstreetviewpanoramareadycallback) {

                    public void zza(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
                        throws RemoteException
                    {
                        zzauv.onStreetViewPanoramaReady(new StreetViewPanorama(istreetviewpanoramadelegate));
                    }

                    final zza zzauI;
                    final OnStreetViewPanoramaReadyCallback zzauv;

            
            {
                zzauI = zza1;
                zzauv = onstreetviewpanoramareadycallback;
                super();
            }
                }
);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
            {
                throw new RuntimeRemoteException(onstreetviewpanoramareadycallback);
            }
        }

        public void onCreate(Bundle bundle)
        {
            try
            {
                zzauG.onCreate(bundle);
                zzauH = (View)zze.zzg(zzauG.getView());
                zzauf.removeAllViews();
                zzauf.addView(zzauH);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(Bundle bundle)
            {
                throw new RuntimeRemoteException(bundle);
            }
        }

        public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
        {
            throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
        }

        public void onDestroy()
        {
            try
            {
                zzauG.onDestroy();
                return;
            }
            catch(RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public void onDestroyView()
        {
            throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
        {
            throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
        }

        public void onLowMemory()
        {
            try
            {
                zzauG.onLowMemory();
                return;
            }
            catch(RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public void onPause()
        {
            try
            {
                zzauG.onPause();
                return;
            }
            catch(RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public void onResume()
        {
            try
            {
                zzauG.onResume();
                return;
            }
            catch(RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public void onSaveInstanceState(Bundle bundle)
        {
            try
            {
                zzauG.onSaveInstanceState(bundle);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(Bundle bundle)
            {
                throw new RuntimeRemoteException(bundle);
            }
        }

        public void onStart()
        {
        }

        public void onStop()
        {
        }

        public IStreetViewPanoramaViewDelegate zztK()
        {
            return zzauG;
        }

        private final IStreetViewPanoramaViewDelegate zzauG;
        private View zzauH;
        private final ViewGroup zzauf;

        public zza(ViewGroup viewgroup, IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate)
        {
            zzauG = (IStreetViewPanoramaViewDelegate)zzv.zzr(istreetviewpanoramaviewdelegate);
            zzauf = (ViewGroup)zzv.zzr(viewgroup);
        }
    }

    static class zzb extends com.google.android.gms.dynamic.zza
    {

        public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
        {
            if(zzou() != null)
            {
                ((zza)zzou()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
                return;
            } else
            {
                zzaux.add(onstreetviewpanoramareadycallback);
                return;
            }
        }

        protected void zza(zzf zzf1)
        {
            zzauc = zzf1;
            zztD();
        }

        public void zztD()
        {
            if(zzauc == null || zzou() != null)
                break MISSING_BLOCK_LABEL_121;
            try
            {
                IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate = zzy.zzah(mContext).zza(zze.zzt(mContext), zzauJ);
                zzauc.zza(new zza(zzauj, istreetviewpanoramaviewdelegate));
                OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback;
                for(Iterator iterator = zzaux.iterator(); iterator.hasNext(); ((zza)zzou()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback))
                    onstreetviewpanoramareadycallback = (OnStreetViewPanoramaReadyCallback)iterator.next();

            }
            catch(RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
            catch(GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
            {
                return;
            }
            zzaux.clear();
        }

        private final Context mContext;
        private final StreetViewPanoramaOptions zzauJ;
        protected zzf zzauc;
        private final ViewGroup zzauj;
        private final List zzaux = new ArrayList();

        zzb(ViewGroup viewgroup, Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
        {
            zzauj = viewgroup;
            mContext = context;
            zzauJ = streetviewpanoramaoptions;
        }
    }


    public StreetViewPanoramaView(Context context)
    {
        super(context);
        zzauF = new zzb(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        zzauF = new zzb(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        zzauF = new zzb(this, context, null);
    }

    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        super(context);
        zzauF = new zzb(this, context, streetviewpanoramaoptions);
    }

    public final StreetViewPanorama getStreetViewPanorama()
    {
        if(zzaut != null)
            return zzaut;
        zzauF.zztD();
        if(zzauF.zzou() == null)
            return null;
        try
        {
            zzaut = new StreetViewPanorama(((zza)zzauF.zzou()).zztK().getStreetViewPanorama());
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return zzaut;
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
    {
        zzv.zzbI("getStreetViewPanoramaAsync() must be called on the main thread");
        zzauF.getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
    }

    public final void onCreate(Bundle bundle)
    {
        zzauF.onCreate(bundle);
        if(zzauF.zzou() == null)
            com.google.android.gms.dynamic.zza.zzb(this);
    }

    public final void onDestroy()
    {
        zzauF.onDestroy();
    }

    public final void onLowMemory()
    {
        zzauF.onLowMemory();
    }

    public final void onPause()
    {
        zzauF.onPause();
    }

    public final void onResume()
    {
        zzauF.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        zzauF.onSaveInstanceState(bundle);
    }

    private final zzb zzauF;
    private StreetViewPanorama zzaut;
}
