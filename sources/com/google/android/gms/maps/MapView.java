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
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.*;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions, GoogleMap, OnMapReadyCallback, MapsInitializer

public class MapView extends FrameLayout
{
    static class zza
        implements MapLifecycleDelegate
    {

        public void getMapAsync(OnMapReadyCallback onmapreadycallback)
        {
            try
            {
                zzaug.getMapAsync(new com.google.android.gms.maps.internal.zzm.zza(this, onmapreadycallback) {

                    public void zza(IGoogleMapDelegate igooglemapdelegate)
                        throws RemoteException
                    {
                        zzaua.onMapReady(new GoogleMap(igooglemapdelegate));
                    }

                    final OnMapReadyCallback zzaua;
                    final zza zzaui;

            
            {
                zzaui = zza1;
                zzaua = onmapreadycallback;
                super();
            }
                }
);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(OnMapReadyCallback onmapreadycallback)
            {
                throw new RuntimeRemoteException(onmapreadycallback);
            }
        }

        public void onCreate(Bundle bundle)
        {
            try
            {
                zzaug.onCreate(bundle);
                zzauh = (View)zze.zzg(zzaug.getView());
                zzauf.removeAllViews();
                zzauf.addView(zzauh);
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
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }

        public void onDestroy()
        {
            try
            {
                zzaug.onDestroy();
                return;
            }
            catch(RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public void onDestroyView()
        {
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
        {
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        public void onLowMemory()
        {
            try
            {
                zzaug.onLowMemory();
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
                zzaug.onPause();
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
                zzaug.onResume();
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
                zzaug.onSaveInstanceState(bundle);
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

        public IMapViewDelegate zztE()
        {
            return zzaug;
        }

        private final ViewGroup zzauf;
        private final IMapViewDelegate zzaug;
        private View zzauh;

        public zza(ViewGroup viewgroup, IMapViewDelegate imapviewdelegate)
        {
            zzaug = (IMapViewDelegate)zzv.zzr(imapviewdelegate);
            zzauf = (ViewGroup)zzv.zzr(viewgroup);
        }
    }

    static class zzb extends com.google.android.gms.dynamic.zza
    {

        public void getMapAsync(OnMapReadyCallback onmapreadycallback)
        {
            if(zzou() != null)
            {
                ((zza)zzou()).getMapAsync(onmapreadycallback);
                return;
            } else
            {
                zzaud.add(onmapreadycallback);
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
                break MISSING_BLOCK_LABEL_136;
            IMapViewDelegate imapviewdelegate;
            MapsInitializer.initialize(mContext);
            imapviewdelegate = zzy.zzah(mContext).zza(zze.zzt(mContext), zzauk);
            if(imapviewdelegate == null)
                return;
            RemoteException remoteexception;
            zzauc.zza(new zza(zzauj, imapviewdelegate));
            OnMapReadyCallback onmapreadycallback;
            for(Iterator iterator = zzaud.iterator(); iterator.hasNext(); ((zza)zzou()).getMapAsync(onmapreadycallback))
                onmapreadycallback = (OnMapReadyCallback)iterator.next();

            try
            {
                zzaud.clear();
                return;
            }
            // Misplaced declaration of an exception variable
            catch(RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
            catch(GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception) { }
        }

        private final Context mContext;
        protected zzf zzauc;
        private final List zzaud = new ArrayList();
        private final ViewGroup zzauj;
        private final GoogleMapOptions zzauk;

        zzb(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
        {
            zzauj = viewgroup;
            mContext = context;
            zzauk = googlemapoptions;
        }
    }


    public MapView(Context context)
    {
        super(context);
        zzaue = new zzb(this, context, null);
        init();
    }

    public MapView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        zzaue = new zzb(this, context, GoogleMapOptions.createFromAttributes(context, attributeset));
        init();
    }

    public MapView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        zzaue = new zzb(this, context, GoogleMapOptions.createFromAttributes(context, attributeset));
        init();
    }

    public MapView(Context context, GoogleMapOptions googlemapoptions)
    {
        super(context);
        zzaue = new zzb(this, context, googlemapoptions);
        init();
    }

    private void init()
    {
        setClickable(true);
    }

    public final GoogleMap getMap()
    {
        if(zzatY != null)
            return zzatY;
        zzaue.zztD();
        if(zzaue.zzou() == null)
            return null;
        try
        {
            zzatY = new GoogleMap(((zza)zzaue.zzou()).zztE().getMap());
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return zzatY;
    }

    public void getMapAsync(OnMapReadyCallback onmapreadycallback)
    {
        zzv.zzbI("getMapAsync() must be called on the main thread");
        zzaue.getMapAsync(onmapreadycallback);
    }

    public final void onCreate(Bundle bundle)
    {
        zzaue.onCreate(bundle);
        if(zzaue.zzou() == null)
            com.google.android.gms.dynamic.zza.zzb(this);
    }

    public final void onDestroy()
    {
        zzaue.onDestroy();
    }

    public final void onLowMemory()
    {
        zzaue.onLowMemory();
    }

    public final void onPause()
    {
        zzaue.onPause();
    }

    public final void onResume()
    {
        zzaue.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        zzaue.onSaveInstanceState(bundle);
    }

    private GoogleMap zzatY;
    private final zzb zzaue;
}
