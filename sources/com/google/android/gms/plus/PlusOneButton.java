// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.plus.internal.zzg;

public final class PlusOneButton extends FrameLayout
{
    protected class DefaultOnPlusOneClickListener
        implements android.view.View.OnClickListener, OnPlusOneClickListener
    {

        public void onClick(View view)
        {
            view = (Intent)PlusOneButton.zza(zzayU).getTag();
            if(zzayT != null)
            {
                zzayT.onPlusOneClick(view);
                return;
            } else
            {
                onPlusOneClick(view);
                return;
            }
        }

        public void onPlusOneClick(Intent intent)
        {
            Context context = zzayU.getContext();
            if((context instanceof Activity) && intent != null)
                ((Activity)context).startActivityForResult(intent, PlusOneButton.zzb(zzayU));
        }

        private final OnPlusOneClickListener zzayT;
        final PlusOneButton zzayU;

        public DefaultOnPlusOneClickListener(OnPlusOneClickListener onplusoneclicklistener)
        {
            zzayU = PlusOneButton.this;
            super();
            zzayT = onplusoneclicklistener;
        }
    }

    public static interface OnPlusOneClickListener
    {

        public abstract void onPlusOneClick(Intent intent);
    }


    public PlusOneButton(Context context)
    {
        this(context, null);
    }

    public PlusOneButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mSize = getSize(context, attributeset);
        zzayQ = getAnnotation(context, attributeset);
        zzayR = -1;
        zzS(getContext());
        if(!isInEditMode());
    }

    protected static int getAnnotation(Context context, AttributeSet attributeset)
    {
        byte byte0 = 0;
        context = zzac.zza("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", context, attributeset, true, false, "PlusOneButton");
        if("INLINE".equalsIgnoreCase(context))
            byte0 = 2;
        else
        if(!"NONE".equalsIgnoreCase(context))
            return 1;
        return byte0;
    }

    protected static int getSize(Context context, AttributeSet attributeset)
    {
        context = zzac.zza("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", context, attributeset, true, false, "PlusOneButton");
        if("SMALL".equalsIgnoreCase(context))
            return 0;
        if("MEDIUM".equalsIgnoreCase(context))
            return 1;
        return !"TALL".equalsIgnoreCase(context) ? 3 : 2;
    }

    private void zzS(Context context)
    {
        if(zzayP != null)
            removeView(zzayP);
        zzayP = zzg.zza(context, mSize, zzayQ, zzAX, zzayR);
        setOnPlusOneClickListener(zzayS);
        addView(zzayP);
    }

    static View zza(PlusOneButton plusonebutton)
    {
        return plusonebutton.zzayP;
    }

    static int zzb(PlusOneButton plusonebutton)
    {
        return plusonebutton.zzayR;
    }

    public void initialize(String s, int i)
    {
        zzv.zza(getContext() instanceof Activity, "To use this method, the PlusOneButton must be placed in an Activity. Use initialize(String, OnPlusOneClickListener).");
        zzAX = s;
        zzayR = i;
        zzS(getContext());
    }

    public void initialize(String s, OnPlusOneClickListener onplusoneclicklistener)
    {
        zzAX = s;
        zzayR = 0;
        zzS(getContext());
        setOnPlusOneClickListener(onplusoneclicklistener);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        zzayP.layout(0, 0, k - i, l - j);
    }

    protected void onMeasure(int i, int j)
    {
        View view = zzayP;
        measureChild(view, i, j);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setAnnotation(int i)
    {
        zzayQ = i;
        zzS(getContext());
    }

    public void setOnPlusOneClickListener(OnPlusOneClickListener onplusoneclicklistener)
    {
        zzayS = onplusoneclicklistener;
        zzayP.setOnClickListener(new DefaultOnPlusOneClickListener(onplusoneclicklistener));
    }

    public void setSize(int i)
    {
        mSize = i;
        zzS(getContext());
    }

    public static final int ANNOTATION_BUBBLE = 1;
    public static final int ANNOTATION_INLINE = 2;
    public static final int ANNOTATION_NONE = 0;
    public static final int DEFAULT_ACTIVITY_REQUEST_CODE = -1;
    public static final int SIZE_MEDIUM = 1;
    public static final int SIZE_SMALL = 0;
    public static final int SIZE_STANDARD = 3;
    public static final int SIZE_TALL = 2;
    private int mSize;
    private String zzAX;
    private View zzayP;
    private int zzayQ;
    private int zzayR;
    private OnPlusOneClickListener zzayS;
}
