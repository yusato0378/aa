// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            zzgc

class zzgb extends zzgc
    implements android.view.ViewTreeObserver.OnScrollChangedListener
{

    public zzgb(View view, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
    {
        super(view);
        zzDb = new WeakReference(onscrollchangedlistener);
    }

    public void onScrollChanged()
    {
        android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener = (android.view.ViewTreeObserver.OnScrollChangedListener)zzDb.get();
        if(onscrollchangedlistener != null)
        {
            onscrollchangedlistener.onScrollChanged();
            return;
        } else
        {
            detach();
            return;
        }
    }

    protected void zza(ViewTreeObserver viewtreeobserver)
    {
        viewtreeobserver.addOnScrollChangedListener(this);
    }

    protected void zzb(ViewTreeObserver viewtreeobserver)
    {
        viewtreeobserver.removeOnScrollChangedListener(this);
    }

    private final WeakReference zzDb;
}
