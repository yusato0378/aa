// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.internal.zzx;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMap, GoogleMapOptions, OnMapReadyCallback, MapsInitializer

public class SupportMapFragment extends Fragment
{
    static class zza
        implements MapLifecycleDelegate
    {

        public void getMapAsync(OnMapReadyCallback onmapreadycallback)
        {
            try
            {
                zzatZ.getMapAsync(new com.google.android.gms.maps.internal.zzm.zza(this, onmapreadycallback) {

                    public void zza(IGoogleMapDelegate igooglemapdelegate)
                        throws RemoteException
                    {
                        zzaua.onMapReady(new GoogleMap(igooglemapdelegate));
                    }

                    final zza zzauL;
                    final OnMapReadyCallback zzaua;

            
            {
                zzauL = zza1;
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
            Bundle bundle1;
            bundle1 = bundle;
            if(bundle != null)
                break MISSING_BLOCK_LABEL_14;
            bundle1 = new Bundle();
            bundle = zzTb.getArguments();
            if(bundle == null)
                break MISSING_BLOCK_LABEL_47;
            if(bundle.containsKey("MapOptions"))
                zzx.zza(bundle1, "MapOptions", bundle.getParcelable("MapOptions"));
            zzatZ.onCreate(bundle1);
            return;
            bundle;
            throw new RuntimeRemoteException(bundle);
        }

        public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
        {
            try
            {
                layoutinflater = zzatZ.onCreateView(zze.zzt(layoutinflater), zze.zzt(viewgroup), bundle);
            }
            // Misplaced declaration of an exception variable
            catch(LayoutInflater layoutinflater)
            {
                throw new RuntimeRemoteException(layoutinflater);
            }
            return (View)zze.zzg(layoutinflater);
        }

        public void onDestroy()
        {
            try
            {
                zzatZ.onDestroy();
                return;
            }
            catch(RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public void onDestroyView()
        {
            try
            {
                zzatZ.onDestroyView();
                return;
            }
            catch(RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
        {
            bundle = (GoogleMapOptions)bundle.getParcelable("MapOptions");
            try
            {
                zzatZ.onInflate(zze.zzt(activity), bundle, bundle1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(Activity activity)
            {
                throw new RuntimeRemoteException(activity);
            }
        }

        public void onLowMemory()
        {
            try
            {
                zzatZ.onLowMemory();
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
                zzatZ.onPause();
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
                zzatZ.onResume();
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
                zzatZ.onSaveInstanceState(bundle);
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

        public IMapFragmentDelegate zztC()
        {
            return zzatZ;
        }

        private final Fragment zzTb;
        private final IMapFragmentDelegate zzatZ;

        public zza(Fragment fragment, IMapFragmentDelegate imapfragmentdelegate)
        {
            zzatZ = (IMapFragmentDelegate)zzv.zzr(imapfragmentdelegate);
            zzTb = (Fragment)zzv.zzr(fragment);
        }
    }

    static class zzb extends com.google.android.gms.dynamic.zza
    {

        private void setActivity(Activity activity)
        {
            zzpf = activity;
            zztD();
        }

        static void zza(zzb zzb1, Activity activity)
        {
            zzb1.setActivity(activity);
        }

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
            if(zzpf == null || zzauc == null || zzou() != null)
                break MISSING_BLOCK_LABEL_139;
            IMapFragmentDelegate imapfragmentdelegate;
            MapsInitializer.initialize(zzpf);
            imapfragmentdelegate = zzy.zzah(zzpf).zzk(zze.zzt(zzpf));
            if(imapfragmentdelegate == null)
                return;
            RemoteException remoteexception;
            zzauc.zza(new zza(zzTb, imapfragmentdelegate));
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

        private final Fragment zzTb;
        protected zzf zzauc;
        private final List zzaud = new ArrayList();
        private Activity zzpf;

        zzb(Fragment fragment)
        {
            zzTb = fragment;
        }
    }


    public SupportMapFragment()
    {
    }

    public static SupportMapFragment newInstance()
    {
        return new SupportMapFragment();
    }

    public static SupportMapFragment newInstance(GoogleMapOptions googlemapoptions)
    {
        SupportMapFragment supportmapfragment = new SupportMapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googlemapoptions);
        supportmapfragment.setArguments(bundle);
        return supportmapfragment;
    }

    public final GoogleMap getMap()
    {
        Object obj = zztC();
        if(obj != null)
        {
            try
            {
                obj = ((IMapFragmentDelegate) (obj)).getMap();
            }
            catch(RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
            if(obj != null)
            {
                if(zzatY == null || zzatY.zztr().asBinder() != ((IGoogleMapDelegate) (obj)).asBinder())
                    zzatY = new GoogleMap(((IGoogleMapDelegate) (obj)));
                return zzatY;
            }
        }
        return null;
    }

    public void getMapAsync(OnMapReadyCallback onmapreadycallback)
    {
        zzv.zzbI("getMapAsync must be called on the main thread.");
        zzauK.getMapAsync(onmapreadycallback);
    }

    public void onActivityCreated(Bundle bundle)
    {
        if(bundle != null)
            bundle.setClassLoader(com/google/android/gms/maps/SupportMapFragment.getClassLoader());
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        zzb.zza(zzauK, activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        zzauK.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = zzauK.onCreateView(layoutinflater, viewgroup, bundle);
        layoutinflater.setClickable(true);
        return layoutinflater;
    }

    public void onDestroy()
    {
        zzauK.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        zzauK.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        zzb.zza(zzauK, activity);
        attributeset = GoogleMapOptions.createFromAttributes(activity, attributeset);
        Bundle bundle1 = new Bundle();
        bundle1.putParcelable("MapOptions", attributeset);
        zzauK.onInflate(activity, bundle1, bundle);
    }

    public void onLowMemory()
    {
        zzauK.onLowMemory();
        super.onLowMemory();
    }

    public void onPause()
    {
        zzauK.onPause();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        zzauK.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if(bundle != null)
            bundle.setClassLoader(com/google/android/gms/maps/SupportMapFragment.getClassLoader());
        super.onSaveInstanceState(bundle);
        zzauK.onSaveInstanceState(bundle);
    }

    public void setArguments(Bundle bundle)
    {
        super.setArguments(bundle);
    }

    protected IMapFragmentDelegate zztC()
    {
        zzauK.zztD();
        if(zzauK.zzou() == null)
            return null;
        else
            return ((zza)zzauK.zzou()).zztC();
    }

    private GoogleMap zzatY;
    private final zzb zzauK = new zzb(this);
}
