// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.zzb;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.internal.zznb;
import com.google.android.gms.internal.zznj;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentOptions, WalletFragmentInitParams, WalletFragmentStyle

public final class WalletFragment extends Fragment
{
    public static interface OnStateChangedListener
    {

        public abstract void onStateChanged(WalletFragment walletfragment, int i, int j, Bundle bundle);
    }

    static class zza extends com.google.android.gms.internal.zznc.zza
    {

        public void zza(int i, int j, Bundle bundle)
        {
            if(zzaJR != null)
                zzaJR.onStateChanged(zzaJS, i, j, bundle);
        }

        public void zza(OnStateChangedListener onstatechangedlistener)
        {
            zzaJR = onstatechangedlistener;
        }

        private OnStateChangedListener zzaJR;
        private final WalletFragment zzaJS;

        zza(WalletFragment walletfragment)
        {
            zzaJS = walletfragment;
        }
    }

    private static class zzb
        implements LifecycleDelegate
    {

        private int getState()
        {
            int i;
            try
            {
                i = zzaJL.getState();
            }
            catch(RemoteException remoteexception)
            {
                throw new RuntimeException(remoteexception);
            }
            return i;
        }

        private void initialize(WalletFragmentInitParams walletfragmentinitparams)
        {
            try
            {
                zzaJL.initialize(walletfragmentinitparams);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(WalletFragmentInitParams walletfragmentinitparams)
            {
                throw new RuntimeException(walletfragmentinitparams);
            }
        }

        private void onActivityResult(int i, int j, Intent intent)
        {
            try
            {
                zzaJL.onActivityResult(i, j, intent);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(Intent intent)
            {
                throw new RuntimeException(intent);
            }
        }

        private void setEnabled(boolean flag)
        {
            try
            {
                zzaJL.setEnabled(flag);
                return;
            }
            catch(RemoteException remoteexception)
            {
                throw new RuntimeException(remoteexception);
            }
        }

        private void updateMaskedWallet(MaskedWallet maskedwallet)
        {
            try
            {
                zzaJL.updateMaskedWallet(maskedwallet);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(MaskedWallet maskedwallet)
            {
                throw new RuntimeException(maskedwallet);
            }
        }

        private void updateMaskedWalletRequest(MaskedWalletRequest maskedwalletrequest)
        {
            try
            {
                zzaJL.updateMaskedWalletRequest(maskedwalletrequest);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(MaskedWalletRequest maskedwalletrequest)
            {
                throw new RuntimeException(maskedwalletrequest);
            }
        }

        static int zza(zzb zzb1)
        {
            return zzb1.getState();
        }

        static void zza(zzb zzb1, int i, int j, Intent intent)
        {
            zzb1.onActivityResult(i, j, intent);
        }

        static void zza(zzb zzb1, MaskedWallet maskedwallet)
        {
            zzb1.updateMaskedWallet(maskedwallet);
        }

        static void zza(zzb zzb1, MaskedWalletRequest maskedwalletrequest)
        {
            zzb1.updateMaskedWalletRequest(maskedwalletrequest);
        }

        static void zza(zzb zzb1, WalletFragmentInitParams walletfragmentinitparams)
        {
            zzb1.initialize(walletfragmentinitparams);
        }

        static void zza(zzb zzb1, boolean flag)
        {
            zzb1.setEnabled(flag);
        }

        public void onCreate(Bundle bundle)
        {
            try
            {
                zzaJL.onCreate(bundle);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(Bundle bundle)
            {
                throw new RuntimeException(bundle);
            }
        }

        public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
        {
            try
            {
                layoutinflater = (View)com.google.android.gms.dynamic.zze.zzg(zzaJL.onCreateView(com.google.android.gms.dynamic.zze.zzt(layoutinflater), com.google.android.gms.dynamic.zze.zzt(viewgroup), bundle));
            }
            // Misplaced declaration of an exception variable
            catch(LayoutInflater layoutinflater)
            {
                throw new RuntimeException(layoutinflater);
            }
            return layoutinflater;
        }

        public void onDestroy()
        {
        }

        public void onDestroyView()
        {
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
        {
            bundle = (WalletFragmentOptions)bundle.getParcelable("extraWalletFragmentOptions");
            try
            {
                zzaJL.zza(com.google.android.gms.dynamic.zze.zzt(activity), bundle, bundle1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(Activity activity)
            {
                throw new RuntimeException(activity);
            }
        }

        public void onLowMemory()
        {
        }

        public void onPause()
        {
            try
            {
                zzaJL.onPause();
                return;
            }
            catch(RemoteException remoteexception)
            {
                throw new RuntimeException(remoteexception);
            }
        }

        public void onResume()
        {
            try
            {
                zzaJL.onResume();
                return;
            }
            catch(RemoteException remoteexception)
            {
                throw new RuntimeException(remoteexception);
            }
        }

        public void onSaveInstanceState(Bundle bundle)
        {
            try
            {
                zzaJL.onSaveInstanceState(bundle);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(Bundle bundle)
            {
                throw new RuntimeException(bundle);
            }
        }

        public void onStart()
        {
            try
            {
                zzaJL.onStart();
                return;
            }
            catch(RemoteException remoteexception)
            {
                throw new RuntimeException(remoteexception);
            }
        }

        public void onStop()
        {
            try
            {
                zzaJL.onStop();
                return;
            }
            catch(RemoteException remoteexception)
            {
                throw new RuntimeException(remoteexception);
            }
        }

        private final zznb zzaJL;

        private zzb(zznb zznb1)
        {
            zzaJL = zznb1;
        }

    }

    private class zzc extends com.google.android.gms.dynamic.zza
        implements android.view.View.OnClickListener
    {

        public void onClick(View view)
        {
            view = WalletFragment.zza(zzaJT).getActivity();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(view), view, -1);
        }

        protected void zza(FrameLayout framelayout)
        {
            Button button = new Button(WalletFragment.zza(zzaJT).getActivity());
            button.setText(com.google.android.gms.R.string.wallet_buy_button_place_holder);
            byte byte0 = -1;
            byte byte1 = -2;
            int j = byte1;
            int i = byte0;
            if(com.google.android.gms.wallet.fragment.WalletFragment.zze(zzaJT) != null)
            {
                WalletFragmentStyle walletfragmentstyle = com.google.android.gms.wallet.fragment.WalletFragment.zze(zzaJT).getFragmentStyle();
                j = byte1;
                i = byte0;
                if(walletfragmentstyle != null)
                {
                    android.util.DisplayMetrics displaymetrics = WalletFragment.zza(zzaJT).getResources().getDisplayMetrics();
                    i = walletfragmentstyle.zza("buyButtonWidth", displaymetrics, -1);
                    j = walletfragmentstyle.zza("buyButtonHeight", displaymetrics, -2);
                }
            }
            button.setLayoutParams(new android.view.ViewGroup.LayoutParams(i, j));
            button.setOnClickListener(this);
            framelayout.addView(button);
        }

        protected void zza(zzf zzf1)
        {
            Object obj = WalletFragment.zza(zzaJT).getActivity();
            if(com.google.android.gms.wallet.fragment.WalletFragment.zzb(zzaJT) == null && WalletFragment.zzc(zzaJT) && obj != null)
            {
                try
                {
                    obj = zznj.zza(((Activity) (obj)), WalletFragment.zzd(zzaJT), com.google.android.gms.wallet.fragment.WalletFragment.zze(zzaJT), com.google.android.gms.wallet.fragment.WalletFragment.zzf(zzaJT));
                    WalletFragment.zza(zzaJT, new zzb(((zznb) (obj))));
                    WalletFragment.zza(zzaJT, null);
                }
                // Misplaced declaration of an exception variable
                catch(zzf zzf1)
                {
                    return;
                }
                zzf1.zza(com.google.android.gms.wallet.fragment.WalletFragment.zzb(zzaJT));
                if(WalletFragment.zzg(zzaJT) != null)
                {
                    zzb.zza(com.google.android.gms.wallet.fragment.WalletFragment.zzb(zzaJT), WalletFragment.zzg(zzaJT));
                    WalletFragment.zza(zzaJT, null);
                }
                if(WalletFragment.zzh(zzaJT) != null)
                {
                    zzb.zza(com.google.android.gms.wallet.fragment.WalletFragment.zzb(zzaJT), WalletFragment.zzh(zzaJT));
                    WalletFragment.zza(zzaJT, null);
                }
                if(WalletFragment.zzi(zzaJT) != null)
                {
                    zzb.zza(com.google.android.gms.wallet.fragment.WalletFragment.zzb(zzaJT), WalletFragment.zzi(zzaJT));
                    WalletFragment.zza(zzaJT, null);
                }
                if(WalletFragment.zzj(zzaJT) != null)
                {
                    zzb.zza(com.google.android.gms.wallet.fragment.WalletFragment.zzb(zzaJT), WalletFragment.zzj(zzaJT).booleanValue());
                    WalletFragment.zza(zzaJT, null);
                }
            }
        }

        final WalletFragment zzaJT;

        private zzc()
        {
            zzaJT = WalletFragment.this;
            super();
        }

    }


    public WalletFragment()
    {
        mCreated = false;
        zzaJQ = new zza(this);
    }

    public static WalletFragment newInstance(WalletFragmentOptions walletfragmentoptions)
    {
        WalletFragment walletfragment = new WalletFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extraWalletFragmentOptions", walletfragmentoptions);
        walletfragment.zzacp.setArguments(bundle);
        return walletfragment;
    }

    static Fragment zza(WalletFragment walletfragment)
    {
        return walletfragment.zzacp;
    }

    static MaskedWallet zza(WalletFragment walletfragment, MaskedWallet maskedwallet)
    {
        walletfragment.zzaJH = maskedwallet;
        return maskedwallet;
    }

    static MaskedWalletRequest zza(WalletFragment walletfragment, MaskedWalletRequest maskedwalletrequest)
    {
        walletfragment.zzaJG = maskedwalletrequest;
        return maskedwalletrequest;
    }

    static zzb zza(WalletFragment walletfragment, zzb zzb1)
    {
        walletfragment.zzaJN = zzb1;
        return zzb1;
    }

    static WalletFragmentInitParams zza(WalletFragment walletfragment, WalletFragmentInitParams walletfragmentinitparams)
    {
        walletfragment.zzaJF = walletfragmentinitparams;
        return walletfragmentinitparams;
    }

    static WalletFragmentOptions zza(WalletFragment walletfragment, WalletFragmentOptions walletfragmentoptions)
    {
        walletfragment.zzaJE = walletfragmentoptions;
        return walletfragmentoptions;
    }

    static Boolean zza(WalletFragment walletfragment, Boolean boolean1)
    {
        walletfragment.zzaJI = boolean1;
        return boolean1;
    }

    static zzb zzb(WalletFragment walletfragment)
    {
        return walletfragment.zzaJN;
    }

    static boolean zzc(WalletFragment walletfragment)
    {
        return walletfragment.mCreated;
    }

    static com.google.android.gms.dynamic.zzb zzd(WalletFragment walletfragment)
    {
        return walletfragment.zzaJO;
    }

    static WalletFragmentOptions zze(WalletFragment walletfragment)
    {
        return walletfragment.zzaJE;
    }

    static zza zzf(WalletFragment walletfragment)
    {
        return walletfragment.zzaJQ;
    }

    static WalletFragmentInitParams zzg(WalletFragment walletfragment)
    {
        return walletfragment.zzaJF;
    }

    static MaskedWalletRequest zzh(WalletFragment walletfragment)
    {
        return walletfragment.zzaJG;
    }

    static MaskedWallet zzi(WalletFragment walletfragment)
    {
        return walletfragment.zzaJH;
    }

    static Boolean zzj(WalletFragment walletfragment)
    {
        return walletfragment.zzaJI;
    }

    public int getState()
    {
        if(zzaJN != null)
            return zzb.zza(zzaJN);
        else
            return 0;
    }

    public void initialize(WalletFragmentInitParams walletfragmentinitparams)
    {
        if(zzaJN != null)
        {
            zzb.zza(zzaJN, walletfragmentinitparams);
            zzaJF = null;
        } else
        if(zzaJF == null)
        {
            zzaJF = walletfragmentinitparams;
            if(zzaJG != null)
                Log.w("WalletFragment", "updateMaskedWalletRequest() was called before initialize()");
            if(zzaJH != null)
            {
                Log.w("WalletFragment", "updateMaskedWallet() was called before initialize()");
                return;
            }
        } else
        {
            Log.w("WalletFragment", "initialize(WalletFragmentInitParams) was called more than once. Ignoring.");
            return;
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if(zzaJN != null)
            zzb.zza(zzaJN, i, j, intent);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if(bundle == null) goto _L2; else goto _L1
_L1:
        bundle.setClassLoader(com/google/android/gms/wallet/fragment/WalletFragmentOptions.getClassLoader());
        WalletFragmentInitParams walletfragmentinitparams = (WalletFragmentInitParams)bundle.getParcelable("walletFragmentInitParams");
        if(walletfragmentinitparams != null)
        {
            if(zzaJF != null)
                Log.w("WalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
            zzaJF = walletfragmentinitparams;
        }
        if(zzaJG == null)
            zzaJG = (MaskedWalletRequest)bundle.getParcelable("maskedWalletRequest");
        if(zzaJH == null)
            zzaJH = (MaskedWallet)bundle.getParcelable("maskedWallet");
        if(bundle.containsKey("walletFragmentOptions"))
            zzaJE = (WalletFragmentOptions)bundle.getParcelable("walletFragmentOptions");
        if(bundle.containsKey("enabled"))
            zzaJI = Boolean.valueOf(bundle.getBoolean("enabled"));
_L4:
        mCreated = true;
        zzaJP.onCreate(bundle);
        return;
_L2:
        if(zzacp.getArguments() != null)
        {
            WalletFragmentOptions walletfragmentoptions = (WalletFragmentOptions)zzacp.getArguments().getParcelable("extraWalletFragmentOptions");
            if(walletfragmentoptions != null)
            {
                walletfragmentoptions.zzau(zzacp.getActivity());
                zzaJE = walletfragmentoptions;
            }
        }
        if(true) goto _L4; else goto _L3
_L3:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return zzaJP.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        super.onDestroy();
        mCreated = false;
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        if(zzaJE == null)
            zzaJE = WalletFragmentOptions.zza(activity, attributeset);
        attributeset = new Bundle();
        attributeset.putParcelable("attrKeyWalletFragmentOptions", zzaJE);
        zzaJP.onInflate(activity, attributeset, bundle);
    }

    public void onPause()
    {
        super.onPause();
        zzaJP.onPause();
    }

    public void onResume()
    {
        super.onResume();
        zzaJP.onResume();
        FragmentManager fragmentmanager = zzacp.getActivity().getFragmentManager();
        Fragment fragment = fragmentmanager.findFragmentByTag("GooglePlayServicesErrorDialog");
        if(fragment != null)
        {
            fragmentmanager.beginTransaction().remove(fragment).commit();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(zzacp.getActivity()), zzacp.getActivity(), -1);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.setClassLoader(com/google/android/gms/wallet/fragment/WalletFragmentOptions.getClassLoader());
        zzaJP.onSaveInstanceState(bundle);
        if(zzaJF != null)
        {
            bundle.putParcelable("walletFragmentInitParams", zzaJF);
            zzaJF = null;
        }
        if(zzaJG != null)
        {
            bundle.putParcelable("maskedWalletRequest", zzaJG);
            zzaJG = null;
        }
        if(zzaJH != null)
        {
            bundle.putParcelable("maskedWallet", zzaJH);
            zzaJH = null;
        }
        if(zzaJE != null)
        {
            bundle.putParcelable("walletFragmentOptions", zzaJE);
            zzaJE = null;
        }
        if(zzaJI != null)
        {
            bundle.putBoolean("enabled", zzaJI.booleanValue());
            zzaJI = null;
        }
    }

    public void onStart()
    {
        super.onStart();
        zzaJP.onStart();
    }

    public void onStop()
    {
        super.onStop();
        zzaJP.onStop();
    }

    public void setEnabled(boolean flag)
    {
        if(zzaJN != null)
        {
            zzb.zza(zzaJN, flag);
            zzaJI = null;
            return;
        } else
        {
            zzaJI = Boolean.valueOf(flag);
            return;
        }
    }

    public void setOnStateChangedListener(OnStateChangedListener onstatechangedlistener)
    {
        zzaJQ.zza(onstatechangedlistener);
    }

    public void updateMaskedWallet(MaskedWallet maskedwallet)
    {
        if(zzaJN != null)
        {
            zzb.zza(zzaJN, maskedwallet);
            zzaJH = null;
            return;
        } else
        {
            zzaJH = maskedwallet;
            return;
        }
    }

    public void updateMaskedWalletRequest(MaskedWalletRequest maskedwalletrequest)
    {
        if(zzaJN != null)
        {
            zzb.zza(zzaJN, maskedwalletrequest);
            zzaJG = null;
            return;
        } else
        {
            zzaJG = maskedwalletrequest;
            return;
        }
    }

    private boolean mCreated;
    private WalletFragmentOptions zzaJE;
    private WalletFragmentInitParams zzaJF;
    private MaskedWalletRequest zzaJG;
    private MaskedWallet zzaJH;
    private Boolean zzaJI;
    private zzb zzaJN;
    private final com.google.android.gms.dynamic.zzb zzaJO = com.google.android.gms.dynamic.zzb.zza(this);
    private final zzc zzaJP = new zzc();
    private zza zzaJQ;
    private final Fragment zzacp = this;
}
