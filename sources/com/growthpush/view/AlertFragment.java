// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.Window;

// Referenced classes of package com.growthpush.view:
//            AlertActivity, DialogCallback

public class AlertFragment extends DialogFragment
    implements android.content.DialogInterface.OnClickListener
{

    public AlertFragment()
    {
    }

    private Dialog generateAlertDialog()
    {
        Object obj = getActivity().getPackageManager();
        android.content.pm.ApplicationInfo applicationinfo;
        try
        {
            applicationinfo = ((PackageManager) (obj)).getApplicationInfo(getActivity().getPackageName(), 0);
        }
        catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return null;
        }
        obj = (new android.app.AlertDialog.Builder(getActivity())).setIcon(((PackageManager) (obj)).getApplicationIcon(applicationinfo)).setTitle(((PackageManager) (obj)).getApplicationLabel(applicationinfo)).setMessage(getArguments().getString("message")).setPositiveButton("OK", this).setNegativeButton("Cancel", this).create();
        ((Dialog) (obj)).setOnKeyListener(new android.content.DialogInterface.OnKeyListener() {

            public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
            {
                if(i == 4 && listener != null)
                    listener.onClickNegative(dialoginterface);
                return false;
            }

            final AlertFragment this$0;

            
            {
                this$0 = AlertFragment.this;
                super();
            }
        }
);
        ((Dialog) (obj)).getWindow().setBackgroundDrawable(new ColorDrawable(0));
        ((Dialog) (obj)).setCanceledOnTouchOutside(false);
        return ((Dialog) (obj));
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if(activity instanceof AlertActivity)
            listener = (DialogCallback)activity;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        i;
        JVM INSTR tableswitch -2 -1: default 24
    //                   -2 43
    //                   -1 25;
           goto _L1 _L2 _L3
_L1:
        return;
_L3:
        if(listener != null)
        {
            listener.onClickPositive(dialoginterface);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if(listener != null)
        {
            listener.onClickNegative(dialoginterface);
            return;
        }
        if(true) goto _L1; else goto _L4
_L4:
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        Dialog dialog1 = generateAlertDialog();
        Dialog dialog = dialog1;
        if(dialog1 == null)
            dialog = super.onCreateDialog(bundle);
        return dialog;
    }

    private DialogCallback listener;

}
