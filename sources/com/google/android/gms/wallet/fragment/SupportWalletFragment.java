// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
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
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.dynamic.zzh;
import com.google.android.gms.internal.zznb;
import com.google.android.gms.internal.zznj;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentOptions, WalletFragmentInitParams, WalletFragmentStyle

public final class SupportWalletFragment extends Fragment
{
    public static interface OnStateChangedListener
    {

        public abstract void onStateChanged(SupportWalletFragment supportwalletfragment, int i, int j, Bundle bundle);
    }

    static class zza extends com.google.android.gms.internal.zznc.zza
    {

        public void zza(int i, int j, Bundle bundle)
        {
            if(zzaJJ != null)
                zzaJJ.onStateChanged(zzaJK, i, j, bundle);
        }

        public void zza(OnStateChangedListener onstatechangedlistener)
        {
            zzaJJ = onstatechangedlistener;
        }

        private OnStateChangedListener zzaJJ;
        private final SupportWalletFragment zzaJK;

        zza(SupportWalletFragment supportwalletfragment)
        {
            zzaJK = supportwalletfragment;
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
            view = SupportWalletFragment.zza(zzaJM).getActivity();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(view), view, -1);
        }

        protected void zza(FrameLayout framelayout)
        {
            Button button = new Button(SupportWalletFragment.zza(zzaJM).getActivity());
            button.setText(com.google.android.gms.R.string.wallet_buy_button_place_holder);
            byte byte0 = -1;
            byte byte1 = -2;
            int j = byte1;
            int i = byte0;
            if(com.google.android.gms.wallet.fragment.SupportWalletFragment.zze(zzaJM) != null)
            {
                WalletFragmentStyle walletfragmentstyle = com.google.android.gms.wallet.fragment.SupportWalletFragment.zze(zzaJM).getFragmentStyle();
                j = byte1;
                i = byte0;
                if(walletfragmentstyle != null)
                {
                    android.util.DisplayMetrics displaymetrics = SupportWalletFragment.zza(zzaJM).getResources().getDisplayMetrics();
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
            Object obj = SupportWalletFragment.zza(zzaJM).getActivity();
            if(SupportWalletFragment.zzb(zzaJM) == null && SupportWalletFragment.zzc(zzaJM) && obj != null)
            {
                try
                {
                    obj = zznj.zza(((Activity) (obj)), SupportWalletFragment.zzd(zzaJM), com.google.android.gms.wallet.fragment.SupportWalletFragment.zze(zzaJM), com.google.android.gms.wallet.fragment.SupportWalletFragment.zzf(zzaJM));
                    SupportWalletFragment.zza(zzaJM, new zzb(((zznb) (obj))));
                    SupportWalletFragment.zza(zzaJM, null);
                }
                // Misplaced declaration of an exception variable
                catch(zzf zzf1)
                {
                    return;
                }
                zzf1.zza(SupportWalletFragment.zzb(zzaJM));
                if(SupportWalletFragment.zzg(zzaJM) != null)
                {
                    zzb.zza(SupportWalletFragment.zzb(zzaJM), SupportWalletFragment.zzg(zzaJM));
                    SupportWalletFragment.zza(zzaJM, null);
                }
                if(com.google.android.gms.wallet.fragment.SupportWalletFragment.zzh(zzaJM) != null)
                {
                    zzb.zza(SupportWalletFragment.zzb(zzaJM), com.google.android.gms.wallet.fragment.SupportWalletFragment.zzh(zzaJM));
                    SupportWalletFragment.zza(zzaJM, null);
                }
                if(SupportWalletFragment.zzi(zzaJM) != null)
                {
                    zzb.zza(SupportWalletFragment.zzb(zzaJM), SupportWalletFragment.zzi(zzaJM));
                    SupportWalletFragment.zza(zzaJM, null);
                }
                if(SupportWalletFragment.zzj(zzaJM) != null)
                {
                    zzb.zza(SupportWalletFragment.zzb(zzaJM), SupportWalletFragment.zzj(zzaJM).booleanValue());
                    SupportWalletFragment.zza(zzaJM, null);
                }
            }
        }

        final SupportWalletFragment zzaJM;

        private zzc()
        {
            zzaJM = SupportWalletFragment.this;
            super();
        }

    }


    public SupportWalletFragment()
    {
        mCreated = false;
        zzaJD = new zza(this);
    }

    public static SupportWalletFragment newInstance(WalletFragmentOptions walletfragmentoptions)
    {
        SupportWalletFragment supportwalletfragment = new SupportWalletFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extraWalletFragmentOptions", walletfragmentoptions);
        supportwalletfragment.zzTb.setArguments(bundle);
        return supportwalletfragment;
    }

    static Fragment zza(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.zzTb;
    }

    static MaskedWallet zza(SupportWalletFragment supportwalletfragment, MaskedWallet maskedwallet)
    {
        supportwalletfragment.zzaJH = maskedwallet;
        return maskedwallet;
    }

    static MaskedWalletRequest zza(SupportWalletFragment supportwalletfragment, MaskedWalletRequest maskedwalletrequest)
    {
        supportwalletfragment.zzaJG = maskedwalletrequest;
        return maskedwalletrequest;
    }

    static zzb zza(SupportWalletFragment supportwalletfragment, zzb zzb1)
    {
        supportwalletfragment.zzaJA = zzb1;
        return zzb1;
    }

    static WalletFragmentInitParams zza(SupportWalletFragment supportwalletfragment, WalletFragmentInitParams walletfragmentinitparams)
    {
        supportwalletfragment.zzaJF = walletfragmentinitparams;
        return walletfragmentinitparams;
    }

    static WalletFragmentOptions zza(SupportWalletFragment supportwalletfragment, WalletFragmentOptions walletfragmentoptions)
    {
        supportwalletfragment.zzaJE = walletfragmentoptions;
        return walletfragmentoptions;
    }

    static Boolean zza(SupportWalletFragment supportwalletfragment, Boolean boolean1)
    {
        supportwalletfragment.zzaJI = boolean1;
        return boolean1;
    }

    static zzb zzb(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.zzaJA;
    }

    static boolean zzc(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.mCreated;
    }

    static zzh zzd(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.zzaJB;
    }

    static WalletFragmentOptions zze(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.zzaJE;
    }

    static zza zzf(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.zzaJD;
    }

    static WalletFragmentInitParams zzg(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.zzaJF;
    }

    static MaskedWalletRequest zzh(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.zzaJG;
    }

    static MaskedWallet zzi(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.zzaJH;
    }

    static Boolean zzj(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.zzaJI;
    }

    public int getState()
    {
        if(zzaJA != null)
            return zzb.zza(zzaJA);
        else
            return 0;
    }

    public void initialize(WalletFragmentInitParams walletfragmentinitparams)
    {
        if(zzaJA != null)
        {
            zzb.zza(zzaJA, walletfragmentinitparams);
            zzaJF = null;
        } else
        if(zzaJF == null)
        {
            zzaJF = walletfragmentinitparams;
            if(zzaJG != null)
                Log.w("SupportWalletFragment", "updateMaskedWalletRequest() was called before initialize()");
            if(zzaJH != null)
            {
                Log.w("SupportWalletFragment", "updateMaskedWallet() was called before initialize()");
                return;
            }
        } else
        {
            Log.w("SupportWalletFragment", "initialize(WalletFragmentInitParams) was called more than once. Ignoring.");
            return;
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if(zzaJA != null)
            zzb.zza(zzaJA, i, j, intent);
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
                Log.w("SupportWalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
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
        zzaJC.onCreate(bundle);
        return;
_L2:
        if(zzTb.getArguments() != null)
        {
            WalletFragmentOptions walletfragmentoptions = (WalletFragmentOptions)zzTb.getArguments().getParcelable("extraWalletFragmentOptions");
            if(walletfragmentoptions != null)
            {
                walletfragmentoptions.zzau(zzTb.getActivity());
                zzaJE = walletfragmentoptions;
            }
        }
        if(true) goto _L4; else goto _L3
_L3:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return zzaJC.onCreateView(layoutinflater, viewgroup, bundle);
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
        zzaJC.onInflate(activity, attributeset, bundle);
    }

    public void onPause()
    {
        super.onPause();
        zzaJC.onPause();
    }

    public void onResume()
    {
        super.onResume();
        zzaJC.onResume();
        FragmentManager fragmentmanager = zzTb.getActivity().getSupportFragmentManager();
        Fragment fragment = fragmentmanager.findFragmentByTag("GooglePlayServicesErrorDialog");
        if(fragment != null)
        {
            fragmentmanager.beginTransaction().remove(fragment).commit();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(zzTb.getActivity()), zzTb.getActivity(), -1);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.setClassLoader(com/google/android/gms/wallet/fragment/WalletFragmentOptions.getClassLoader());
        zzaJC.onSaveInstanceState(bundle);
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
        zzaJC.onStart();
    }

    public void onStop()
    {
        super.onStop();
        zzaJC.onStop();
    }

    public void setEnabled(boolean flag)
    {
        if(zzaJA != null)
        {
            zzb.zza(zzaJA, flag);
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
        zzaJD.zza(onstatechangedlistener);
    }

    public void updateMaskedWallet(MaskedWallet maskedwallet)
    {
        if(zzaJA != null)
        {
            zzb.zza(zzaJA, maskedwallet);
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
        if(zzaJA != null)
        {
            zzb.zza(zzaJA, maskedwalletrequest);
            zzaJG = null;
            return;
        } else
        {
            zzaJG = maskedwalletrequest;
            return;
        }
    }

    private boolean mCreated;
    private final Fragment zzTb = this;
    private zzb zzaJA;
    private final zzh zzaJB = com.google.android.gms.dynamic.zzh.zza(this);
    private final zzc zzaJC = new zzc();
    private zza zzaJD;
    private WalletFragmentOptions zzaJE;
    private WalletFragmentInitParams zzaJF;
    private MaskedWalletRequest zzaJG;
    private MaskedWallet zzaJH;
    private Boolean zzaJI;
}
