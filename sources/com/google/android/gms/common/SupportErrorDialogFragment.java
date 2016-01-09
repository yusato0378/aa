// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import com.google.android.gms.common.internal.zzv;

public class SupportErrorDialogFragment extends DialogFragment
{

    public SupportErrorDialogFragment()
    {
        mDialog = null;
        zzOK = null;
    }

    public static SupportErrorDialogFragment newInstance(Dialog dialog)
    {
        return newInstance(dialog, null);
    }

    public static SupportErrorDialogFragment newInstance(Dialog dialog, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        SupportErrorDialogFragment supporterrordialogfragment = new SupportErrorDialogFragment();
        dialog = (Dialog)zzv.zzb(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        supporterrordialogfragment.mDialog = dialog;
        if(oncancellistener != null)
            supporterrordialogfragment.zzOK = oncancellistener;
        return supporterrordialogfragment;
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        if(zzOK != null)
            zzOK.onCancel(dialoginterface);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        if(mDialog == null)
            setShowsDialog(false);
        return mDialog;
    }

    public void show(FragmentManager fragmentmanager, String s)
    {
        super.show(fragmentmanager, s);
    }

    private Dialog mDialog;
    private android.content.DialogInterface.OnCancelListener zzOK;
}
