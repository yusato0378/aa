// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzf, BitmapDescriptor, LatLng

public final class MarkerOptions
    implements SafeParcelable
{

    public MarkerOptions()
    {
        zzavm = 0.5F;
        zzavn = 1.0F;
        zzave = true;
        zzavy = false;
        zzavz = 0.0F;
        zzavA = 0.5F;
        zzavB = 0.0F;
        mAlpha = 1.0F;
        zzzH = 1;
    }

    MarkerOptions(int i, LatLng latlng, String s, String s1, IBinder ibinder, float f, float f1, 
            boolean flag, boolean flag1, boolean flag2, float f2, float f3, float f4, float f5)
    {
        zzavm = 0.5F;
        zzavn = 1.0F;
        zzave = true;
        zzavy = false;
        zzavz = 0.0F;
        zzavA = 0.5F;
        zzavB = 0.0F;
        mAlpha = 1.0F;
        zzzH = i;
        zzauA = latlng;
        zzWn = s;
        zzavv = s1;
        if(ibinder == null)
            latlng = null;
        else
            latlng = new BitmapDescriptor(com.google.android.gms.dynamic.zzd.zza.zzat(ibinder));
        zzavw = latlng;
        zzavm = f;
        zzavn = f1;
        zzavx = flag;
        zzave = flag1;
        zzavy = flag2;
        zzavz = f2;
        zzavA = f3;
        zzavB = f4;
        mAlpha = f5;
    }

    public MarkerOptions alpha(float f)
    {
        mAlpha = f;
        return this;
    }

    public MarkerOptions anchor(float f, float f1)
    {
        zzavm = f;
        zzavn = f1;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public MarkerOptions draggable(boolean flag)
    {
        zzavx = flag;
        return this;
    }

    public MarkerOptions flat(boolean flag)
    {
        zzavy = flag;
        return this;
    }

    public float getAlpha()
    {
        return mAlpha;
    }

    public float getAnchorU()
    {
        return zzavm;
    }

    public float getAnchorV()
    {
        return zzavn;
    }

    public BitmapDescriptor getIcon()
    {
        return zzavw;
    }

    public float getInfoWindowAnchorU()
    {
        return zzavA;
    }

    public float getInfoWindowAnchorV()
    {
        return zzavB;
    }

    public LatLng getPosition()
    {
        return zzauA;
    }

    public float getRotation()
    {
        return zzavz;
    }

    public String getSnippet()
    {
        return zzavv;
    }

    public String getTitle()
    {
        return zzWn;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public MarkerOptions icon(BitmapDescriptor bitmapdescriptor)
    {
        zzavw = bitmapdescriptor;
        return this;
    }

    public MarkerOptions infoWindowAnchor(float f, float f1)
    {
        zzavA = f;
        zzavB = f1;
        return this;
    }

    public boolean isDraggable()
    {
        return zzavx;
    }

    public boolean isFlat()
    {
        return zzavy;
    }

    public boolean isVisible()
    {
        return zzave;
    }

    public MarkerOptions position(LatLng latlng)
    {
        zzauA = latlng;
        return this;
    }

    public MarkerOptions rotation(float f)
    {
        zzavz = f;
        return this;
    }

    public MarkerOptions snippet(String s)
    {
        zzavv = s;
        return this;
    }

    public MarkerOptions title(String s)
    {
        zzWn = s;
        return this;
    }

    public MarkerOptions visible(boolean flag)
    {
        zzave = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf.zza(this, parcel, i);
    }

    IBinder zztS()
    {
        if(zzavw == null)
            return null;
        else
            return zzavw.zztp().asBinder();
    }

    public static final zzf CREATOR = new zzf();
    private float mAlpha;
    private String zzWn;
    private LatLng zzauA;
    private float zzavA;
    private float zzavB;
    private boolean zzave;
    private float zzavm;
    private float zzavn;
    private String zzavv;
    private BitmapDescriptor zzavw;
    private boolean zzavx;
    private boolean zzavy;
    private float zzavz;
    private final int zzzH;

}
