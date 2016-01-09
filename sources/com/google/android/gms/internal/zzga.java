// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            zzgc, zzic

class zzga extends zzgc
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    public zzga(View view, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        super(view);
        zzDb = new WeakReference(ongloballayoutlistener);
    }

    public void onGlobalLayout()
    {
        android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener = (android.view.ViewTreeObserver.OnGlobalLayoutListener)zzDb.get();
        if(ongloballayoutlistener != null)
        {
            ongloballayoutlistener.onGlobalLayout();
            return;
        } else
        {
            detach();
            return;
        }
    }

    protected void zza(ViewTreeObserver viewtreeobserver)
    {
        viewtreeobserver.addOnGlobalLayoutListener(this);
    }

    protected void zzb(ViewTreeObserver viewtreeobserver)
    {
        if(zzic.zzni())
        {
            viewtreeobserver.removeOnGlobalLayoutListener(this);
            return;
        } else
        {
            viewtreeobserver.removeGlobalOnLayoutListener(this);
            return;
        }
    }

    private final WeakReference zzDb;
}
