// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common;

import android.app.*;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.zzv;

public class ErrorDialogFragment extends DialogFragment
{

    public ErrorDialogFragment()
    {
        mDialog = null;
        zzOK = null;
    }

    public static ErrorDialogFragment newInstance(Dialog dialog)
    {
        return newInstance(dialog, null);
    }

    public static ErrorDialogFragment newInstance(Dialog dialog, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        ErrorDialogFragment errordialogfragment = new ErrorDialogFragment();
        dialog = (Dialog)zzv.zzb(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        errordialogfragment.mDialog = dialog;
        if(oncancellistener != null)
            errordialogfragment.zzOK = oncancellistener;
        return errordialogfragment;
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
