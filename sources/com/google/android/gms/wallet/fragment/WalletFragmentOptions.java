// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            zzb, WalletFragmentStyle

public final class WalletFragmentOptions
    implements SafeParcelable
{
    public final class Builder
    {

        public WalletFragmentOptions build()
        {
            return zzaJX;
        }

        public Builder setEnvironment(int i)
        {
            WalletFragmentOptions.zza(zzaJX, i);
            return this;
        }

        public Builder setFragmentStyle(int i)
        {
            WalletFragmentOptions.zza(zzaJX, (new WalletFragmentStyle()).setStyleResourceId(i));
            return this;
        }

        public Builder setFragmentStyle(WalletFragmentStyle walletfragmentstyle)
        {
            WalletFragmentOptions.zza(zzaJX, walletfragmentstyle);
            return this;
        }

        public Builder setMode(int i)
        {
            WalletFragmentOptions.zzc(zzaJX, i);
            return this;
        }

        public Builder setTheme(int i)
        {
            WalletFragmentOptions.zzb(zzaJX, i);
            return this;
        }

        final WalletFragmentOptions zzaJX;

        private Builder()
        {
            zzaJX = WalletFragmentOptions.this;
            super();
        }

    }


    private WalletFragmentOptions()
    {
        zzzH = 1;
    }

    WalletFragmentOptions(int i, int j, int k, WalletFragmentStyle walletfragmentstyle, int l)
    {
        zzzH = i;
        zzaJt = j;
        mTheme = k;
        zzaJW = walletfragmentstyle;
        zzVK = l;
    }

    public static Builder newBuilder()
    {
        WalletFragmentOptions walletfragmentoptions = new WalletFragmentOptions();
        walletfragmentoptions.getClass();
        return walletfragmentoptions. new Builder();
    }

    static int zza(WalletFragmentOptions walletfragmentoptions, int i)
    {
        walletfragmentoptions.zzaJt = i;
        return i;
    }

    public static WalletFragmentOptions zza(Context context, AttributeSet attributeset)
    {
        attributeset = context.obtainStyledAttributes(attributeset, com.google.android.gms.R.styleable.WalletFragmentOptions);
        int i = attributeset.getInt(com.google.android.gms.R.styleable.WalletFragmentOptions_appTheme, 0);
        int j = attributeset.getInt(com.google.android.gms.R.styleable.WalletFragmentOptions_environment, 1);
        int k = attributeset.getResourceId(com.google.android.gms.R.styleable.WalletFragmentOptions_fragmentStyle, 0);
        int l = attributeset.getInt(com.google.android.gms.R.styleable.WalletFragmentOptions_fragmentMode, 1);
        attributeset.recycle();
        attributeset = new WalletFragmentOptions();
        attributeset.mTheme = i;
        attributeset.zzaJt = j;
        attributeset.zzaJW = (new WalletFragmentStyle()).setStyleResourceId(k);
        ((WalletFragmentOptions) (attributeset)).zzaJW.zzau(context);
        attributeset.zzVK = l;
        return attributeset;
    }

    static WalletFragmentStyle zza(WalletFragmentOptions walletfragmentoptions, WalletFragmentStyle walletfragmentstyle)
    {
        walletfragmentoptions.zzaJW = walletfragmentstyle;
        return walletfragmentstyle;
    }

    static int zzb(WalletFragmentOptions walletfragmentoptions, int i)
    {
        walletfragmentoptions.mTheme = i;
        return i;
    }

    static int zzc(WalletFragmentOptions walletfragmentoptions, int i)
    {
        walletfragmentoptions.zzVK = i;
        return i;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getEnvironment()
    {
        return zzaJt;
    }

    public WalletFragmentStyle getFragmentStyle()
    {
        return zzaJW;
    }

    public int getMode()
    {
        return zzVK;
    }

    public int getTheme()
    {
        return mTheme;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.wallet.fragment.zzb.zza(this, parcel, i);
    }

    public void zzau(Context context)
    {
        if(zzaJW != null)
            zzaJW.zzau(context);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    private int mTheme;
    private int zzVK;
    private WalletFragmentStyle zzaJW;
    private int zzaJt;
    final int zzzH;

}
