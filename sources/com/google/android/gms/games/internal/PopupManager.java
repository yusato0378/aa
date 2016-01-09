// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal;

import android.app.Activity;
import android.os.*;
import android.view.*;
import com.google.android.gms.internal.zzic;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl, GamesLog

public class PopupManager
{
    public static final class PopupLocationInfo
    {

        public Bundle zzrl()
        {
            Bundle bundle = new Bundle();
            bundle.putInt("popupLocationInfo.gravity", gravity);
            bundle.putInt("popupLocationInfo.displayId", zzajr);
            bundle.putInt("popupLocationInfo.left", left);
            bundle.putInt("popupLocationInfo.top", top);
            bundle.putInt("popupLocationInfo.right", right);
            bundle.putInt("popupLocationInfo.bottom", bottom);
            return bundle;
        }

        public int bottom;
        public int gravity;
        public int left;
        public int right;
        public int top;
        public IBinder zzajq;
        public int zzajr;

        private PopupLocationInfo(int i, IBinder ibinder)
        {
            zzajr = -1;
            left = 0;
            top = 0;
            right = 0;
            bottom = 0;
            gravity = i;
            zzajq = ibinder;
        }

    }

    private static final class PopupManagerHCMR1 extends PopupManager
        implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        private void zzp(View view)
        {
            int j = -1;
            int i = j;
            if(zzic.zznj())
            {
                Display display = view.getDisplay();
                i = j;
                if(display != null)
                    i = display.getDisplayId();
            }
            IBinder ibinder = view.getWindowToken();
            int ai[] = new int[2];
            view.getLocationInWindow(ai);
            j = view.getWidth();
            int k = view.getHeight();
            zzajp.zzajr = i;
            zzajp.zzajq = ibinder;
            zzajp.left = ai[0];
            zzajp.top = ai[1];
            zzajp.right = ai[0] + j;
            zzajp.bottom = ai[1] + k;
            if(zzahP)
            {
                zzrm();
                zzahP = false;
            }
        }

        public void onGlobalLayout()
        {
            View view;
            if(zzajs != null)
                if((view = (View)zzajs.get()) != null)
                {
                    zzp(view);
                    return;
                }
        }

        public void onViewAttachedToWindow(View view)
        {
            zzp(view);
        }

        public void onViewDetachedFromWindow(View view)
        {
            zzajo.zzra();
            view.removeOnAttachStateChangeListener(this);
        }

        protected void zzeY(int i)
        {
            zzajp = new PopupLocationInfo(i, null);
        }

        public void zzo(View view)
        {
            zzajo.zzra();
            if(zzajs != null)
            {
                View view1 = (View)zzajs.get();
                android.content.Context context1 = zzajo.getContext();
                Object obj = view1;
                if(view1 == null)
                {
                    obj = view1;
                    if(context1 instanceof Activity)
                        obj = ((Activity)context1).getWindow().getDecorView();
                }
                if(obj != null)
                {
                    ((View) (obj)).removeOnAttachStateChangeListener(this);
                    obj = ((View) (obj)).getViewTreeObserver();
                    android.content.Context context;
                    if(zzic.zzni())
                        ((ViewTreeObserver) (obj)).removeOnGlobalLayoutListener(this);
                    else
                        ((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(this);
                }
            }
            zzajs = null;
            context = zzajo.getContext();
            obj = view;
            if(view == null)
            {
                obj = view;
                if(context instanceof Activity)
                {
                    obj = ((Activity)context).findViewById(0x1020002);
                    view = ((View) (obj));
                    if(obj == null)
                        view = ((Activity)context).getWindow().getDecorView();
                    GamesLog.zzt("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments");
                    obj = view;
                }
            }
            if(obj != null)
            {
                zzp(((View) (obj)));
                zzajs = new WeakReference(obj);
                ((View) (obj)).addOnAttachStateChangeListener(this);
                ((View) (obj)).getViewTreeObserver().addOnGlobalLayoutListener(this);
                return;
            } else
            {
                GamesLog.zzu("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
                return;
            }
        }

        public void zzrm()
        {
            if(zzajp.zzajq != null)
            {
                zzrm();
                return;
            }
            boolean flag;
            if(zzajs != null)
                flag = true;
            else
                flag = false;
            zzahP = flag;
        }

        private boolean zzahP;
        private WeakReference zzajs;

        protected PopupManagerHCMR1(GamesClientImpl gamesclientimpl, int i)
        {
            super(gamesclientimpl, i, null);
            zzahP = false;
        }
    }


    private PopupManager(GamesClientImpl gamesclientimpl, int i)
    {
        zzajo = gamesclientimpl;
        zzeY(i);
    }


    public static PopupManager zza(GamesClientImpl gamesclientimpl, int i)
    {
        if(zzic.zznf())
            return new PopupManagerHCMR1(gamesclientimpl, i);
        else
            return new PopupManager(gamesclientimpl, i);
    }

    public void setGravity(int i)
    {
        zzajp.gravity = i;
    }

    protected void zzeY(int i)
    {
        zzajp = new PopupLocationInfo(i, new Binder());
    }

    public void zzo(View view)
    {
    }

    public void zzrm()
    {
        zzajo.zza(zzajp.zzajq, zzajp.zzrl());
    }

    public Bundle zzrn()
    {
        return zzajp.zzrl();
    }

    public IBinder zzro()
    {
        return zzajp.zzajq;
    }

    public PopupLocationInfo zzrp()
    {
        return zzajp;
    }

    protected GamesClientImpl zzajo;
    protected PopupLocationInfo zzajp;
}
