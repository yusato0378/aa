// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            zzc, Dimension

public final class WalletFragmentStyle
    implements SafeParcelable
{

    public WalletFragmentStyle()
    {
        zzzH = 1;
        zzaJY = new Bundle();
    }

    WalletFragmentStyle(int i, Bundle bundle, int j)
    {
        zzzH = i;
        zzaJY = bundle;
        zzaJZ = j;
    }

    private void zza(TypedArray typedarray, int i, String s)
    {
        if(!zzaJY.containsKey(s))
            if((typedarray = typedarray.peekValue(i)) != null)
            {
                zzaJY.putLong(s, Dimension.zza(typedarray));
                return;
            }
    }

    private void zza(TypedArray typedarray, int i, String s, String s1)
    {
        if(!zzaJY.containsKey(s) && !zzaJY.containsKey(s1))
            if((typedarray = typedarray.peekValue(i)) != null)
                if(((TypedValue) (typedarray)).type >= 28 && ((TypedValue) (typedarray)).type <= 31)
                {
                    zzaJY.putInt(s, ((TypedValue) (typedarray)).data);
                    return;
                } else
                {
                    zzaJY.putInt(s1, ((TypedValue) (typedarray)).resourceId);
                    return;
                }
    }

    private void zzb(TypedArray typedarray, int i, String s)
    {
        if(!zzaJY.containsKey(s))
            if((typedarray = typedarray.peekValue(i)) != null)
            {
                zzaJY.putInt(s, ((TypedValue) (typedarray)).data);
                return;
            }
    }

    public int describeContents()
    {
        return 0;
    }

    public WalletFragmentStyle setBuyButtonAppearance(int i)
    {
        zzaJY.putInt("buyButtonAppearance", i);
        return this;
    }

    public WalletFragmentStyle setBuyButtonHeight(int i)
    {
        zzaJY.putLong("buyButtonHeight", Dimension.zzii(i));
        return this;
    }

    public WalletFragmentStyle setBuyButtonHeight(int i, float f)
    {
        zzaJY.putLong("buyButtonHeight", Dimension.zza(i, f));
        return this;
    }

    public WalletFragmentStyle setBuyButtonText(int i)
    {
        zzaJY.putInt("buyButtonText", i);
        return this;
    }

    public WalletFragmentStyle setBuyButtonWidth(int i)
    {
        zzaJY.putLong("buyButtonWidth", Dimension.zzii(i));
        return this;
    }

    public WalletFragmentStyle setBuyButtonWidth(int i, float f)
    {
        zzaJY.putLong("buyButtonWidth", Dimension.zza(i, f));
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsBackgroundColor(int i)
    {
        zzaJY.remove("maskedWalletDetailsBackgroundResource");
        zzaJY.putInt("maskedWalletDetailsBackgroundColor", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsBackgroundResource(int i)
    {
        zzaJY.remove("maskedWalletDetailsBackgroundColor");
        zzaJY.putInt("maskedWalletDetailsBackgroundResource", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsButtonBackgroundColor(int i)
    {
        zzaJY.remove("maskedWalletDetailsButtonBackgroundResource");
        zzaJY.putInt("maskedWalletDetailsButtonBackgroundColor", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsButtonBackgroundResource(int i)
    {
        zzaJY.remove("maskedWalletDetailsButtonBackgroundColor");
        zzaJY.putInt("maskedWalletDetailsButtonBackgroundResource", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsButtonTextAppearance(int i)
    {
        zzaJY.putInt("maskedWalletDetailsButtonTextAppearance", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsHeaderTextAppearance(int i)
    {
        zzaJY.putInt("maskedWalletDetailsHeaderTextAppearance", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsLogoImageType(int i)
    {
        zzaJY.putInt("maskedWalletDetailsLogoImageType", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsLogoTextColor(int i)
    {
        zzaJY.putInt("maskedWalletDetailsLogoTextColor", i);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsTextAppearance(int i)
    {
        zzaJY.putInt("maskedWalletDetailsTextAppearance", i);
        return this;
    }

    public WalletFragmentStyle setStyleResourceId(int i)
    {
        zzaJZ = i;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

    public int zza(String s, DisplayMetrics displaymetrics, int i)
    {
        if(zzaJY.containsKey(s))
            i = Dimension.zza(zzaJY.getLong(s), displaymetrics);
        return i;
    }

    public void zzau(Context context)
    {
        int i;
        if(zzaJZ <= 0)
            i = com.google.android.gms.R.style.WalletFragmentDefaultStyle;
        else
            i = zzaJZ;
        context = context.obtainStyledAttributes(i, com.google.android.gms.R.styleable.WalletFragmentStyle);
        zza(context, com.google.android.gms.R.styleable.WalletFragmentStyle_buyButtonWidth, "buyButtonWidth");
        zza(context, com.google.android.gms.R.styleable.WalletFragmentStyle_buyButtonHeight, "buyButtonHeight");
        zzb(context, com.google.android.gms.R.styleable.WalletFragmentStyle_buyButtonText, "buyButtonText");
        zzb(context, com.google.android.gms.R.styleable.WalletFragmentStyle_buyButtonAppearance, "buyButtonAppearance");
        zzb(context, com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsTextAppearance, "maskedWalletDetailsTextAppearance");
        zzb(context, com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance, "maskedWalletDetailsHeaderTextAppearance");
        zza(context, com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsBackground, "maskedWalletDetailsBackgroundColor", "maskedWalletDetailsBackgroundResource");
        zzb(context, com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance, "maskedWalletDetailsButtonTextAppearance");
        zza(context, com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsButtonBackground, "maskedWalletDetailsButtonBackgroundColor", "maskedWalletDetailsButtonBackgroundResource");
        zzb(context, com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsLogoTextColor, "maskedWalletDetailsLogoTextColor");
        zzb(context, com.google.android.gms.R.styleable.WalletFragmentStyle_maskedWalletDetailsLogoImageType, "maskedWalletDetailsLogoImageType");
        context.recycle();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    Bundle zzaJY;
    int zzaJZ;
    final int zzzH;

}
