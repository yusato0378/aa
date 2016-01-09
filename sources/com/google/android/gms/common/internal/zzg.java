// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.*;
import android.support.v4.app.Fragment;
import android.util.Log;

public class zzg
    implements android.content.DialogInterface.OnClickListener
{

    public zzg(Activity activity, Intent intent, int i)
    {
        zzpf = activity;
        zzTb = null;
        mIntent = intent;
        zzTc = i;
    }

    public zzg(Fragment fragment, Intent intent, int i)
    {
        zzpf = null;
        zzTb = fragment;
        mIntent = intent;
        zzTc = i;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if(mIntent == null || zzTb == null) goto _L2; else goto _L1
_L1:
        zzTb.startActivityForResult(mIntent, zzTc);
_L4:
        dialoginterface.dismiss();
        return;
_L2:
        if(mIntent != null)
            zzpf.startActivityForResult(mIntent, zzTc);
        if(true) goto _L4; else goto _L3
_L3:
        dialoginterface;
        Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
        return;
    }

    private final Intent mIntent;
    private final Fragment zzTb;
    private final int zzTc;
    private final Activity zzpf;
}
