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
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.internal.zzx;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanorama, StreetViewPanoramaOptions, OnStreetViewPanoramaReadyCallback, MapsInitializer

public class SupportStreetViewPanoramaFragment extends Fragment
{
    static class zza
        implements StreetViewLifecycleDelegate
    {

        public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
        {
            try
            {
                zzauu.getStreetViewPanoramaAsync(new com.google.android.gms.maps.internal.zzv.zza(this, onstreetviewpanoramareadycallback) {

                    public void zza(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
                        throws RemoteException
                    {
                        zzauv.onStreetViewPanoramaReady(new StreetViewPanorama(istreetviewpanoramadelegate));
                    }

                    final zza zzauN;
                    final OnStreetViewPanoramaReadyCallback zzauv;

            
            {
                zzauN = zza1;
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
            Bundle bundle1;
            bundle1 = bundle;
            if(bundle != null)
                break MISSING_BLOCK_LABEL_14;
            bundle1 = new Bundle();
            bundle = zzTb.getArguments();
            if(bundle == null)
                break MISSING_BLOCK_LABEL_47;
            if(bundle.containsKey("StreetViewPanoramaOptions"))
                zzx.zza(bundle1, "StreetViewPanoramaOptions", bundle.getParcelable("StreetViewPanoramaOptions"));
            zzauu.onCreate(bundle1);
            return;
            bundle;
            throw new RuntimeRemoteException(bundle);
        }

        public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
        {
            try
            {
                layoutinflater = zzauu.onCreateView(zze.zzt(layoutinflater), zze.zzt(viewgroup), bundle);
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
                zzauu.onDestroy();
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
                zzauu.onDestroyView();
                return;
            }
            catch(RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
        {
            try
            {
                zzauu.onInflate(zze.zzt(activity), null, bundle1);
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
                zzauu.onLowMemory();
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
                zzauu.onPause();
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
                zzauu.onResume();
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
                zzauu.onSaveInstanceState(bundle);
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

        public IStreetViewPanoramaFragmentDelegate zztG()
        {
            return zzauu;
        }

        private final Fragment zzTb;
        private final IStreetViewPanoramaFragmentDelegate zzauu;

        public zza(Fragment fragment, IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate)
        {
            zzauu = (IStreetViewPanoramaFragmentDelegate)zzv.zzr(istreetviewpanoramafragmentdelegate);
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
            if(zzpf == null || zzauc == null || zzou() != null)
                break MISSING_BLOCK_LABEL_132;
            try
            {
                MapsInitializer.initialize(zzpf);
                IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate = zzy.zzah(zzpf).zzl(zze.zzt(zzpf));
                zzauc.zza(new zza(zzTb, istreetviewpanoramafragmentdelegate));
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

        private final Fragment zzTb;
        protected zzf zzauc;
        private final List zzaux = new ArrayList();
        private Activity zzpf;

        zzb(Fragment fragment)
        {
            zzTb = fragment;
        }
    }


    public SupportStreetViewPanoramaFragment()
    {
    }

    public static SupportStreetViewPanoramaFragment newInstance()
    {
        return new SupportStreetViewPanoramaFragment();
    }

    public static SupportStreetViewPanoramaFragment newInstance(StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        SupportStreetViewPanoramaFragment supportstreetviewpanoramafragment = new SupportStreetViewPanoramaFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("StreetViewPanoramaOptions", streetviewpanoramaoptions);
        supportstreetviewpanoramafragment.setArguments(bundle);
        return supportstreetviewpanoramafragment;
    }

    public final StreetViewPanorama getStreetViewPanorama()
    {
        Object obj = zztG();
        if(obj != null)
        {
            try
            {
                obj = ((IStreetViewPanoramaFragmentDelegate) (obj)).getStreetViewPanorama();
            }
            catch(RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
            if(obj != null)
            {
                if(zzaut == null || zzaut.zztF().asBinder() != ((IStreetViewPanoramaDelegate) (obj)).asBinder())
                    zzaut = new StreetViewPanorama(((IStreetViewPanoramaDelegate) (obj)));
                return zzaut;
            }
        }
        return null;
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
    {
        zzv.zzbI("getStreetViewPanoramaAsync() must be called on the main thread");
        zzauM.getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
    }

    public void onActivityCreated(Bundle bundle)
    {
        if(bundle != null)
            bundle.setClassLoader(com/google/android/gms/maps/SupportStreetViewPanoramaFragment.getClassLoader());
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        zzb.zza(zzauM, activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        zzauM.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return zzauM.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        zzauM.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        zzauM.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        zzb.zza(zzauM, activity);
        attributeset = new Bundle();
        zzauM.onInflate(activity, attributeset, bundle);
    }

    public void onLowMemory()
    {
        zzauM.onLowMemory();
        super.onLowMemory();
    }

    public void onPause()
    {
        zzauM.onPause();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        zzauM.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if(bundle != null)
            bundle.setClassLoader(com/google/android/gms/maps/SupportStreetViewPanoramaFragment.getClassLoader());
        super.onSaveInstanceState(bundle);
        zzauM.onSaveInstanceState(bundle);
    }

    public void setArguments(Bundle bundle)
    {
        super.setArguments(bundle);
    }

    protected IStreetViewPanoramaFragmentDelegate zztG()
    {
        zzauM.zztD();
        if(zzauM.zzou() == null)
            return null;
        else
            return ((zza)zzauM.zzou()).zztG();
    }

    private final zzb zzauM = new zzb(this);
    private StreetViewPanorama zzaut;
}
