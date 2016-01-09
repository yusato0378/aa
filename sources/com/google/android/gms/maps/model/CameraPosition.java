// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.maps.model:
//            zza, LatLng

public final class CameraPosition
    implements SafeParcelable
{
    public static final class Builder
    {

        public Builder bearing(float f)
        {
            zzauW = f;
            return this;
        }

        public CameraPosition build()
        {
            return new CameraPosition(zzauT, zzauU, zzauV, zzauW);
        }

        public Builder target(LatLng latlng)
        {
            zzauT = latlng;
            return this;
        }

        public Builder tilt(float f)
        {
            zzauV = f;
            return this;
        }

        public Builder zoom(float f)
        {
            zzauU = f;
            return this;
        }

        private LatLng zzauT;
        private float zzauU;
        private float zzauV;
        private float zzauW;

        public Builder()
        {
        }

        public Builder(CameraPosition cameraposition)
        {
            zzauT = cameraposition.target;
            zzauU = cameraposition.zoom;
            zzauV = cameraposition.tilt;
            zzauW = cameraposition.bearing;
        }
    }


    CameraPosition(int i, LatLng latlng, float f, float f1, float f2)
    {
        zzv.zzb(latlng, "null camera target");
        boolean flag;
        if(0.0F <= f1 && f1 <= 90F)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "Tilt needs to be between 0 and 90 inclusive");
        zzzH = i;
        target = latlng;
        zoom = f;
        tilt = f1 + 0.0F;
        f = f2;
        if((double)f2 <= 0.0D)
            f = f2 % 360F + 360F;
        bearing = f % 360F;
    }

    public CameraPosition(LatLng latlng, float f, float f1, float f2)
    {
        this(1, latlng, f, f1, f2);
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static Builder builder(CameraPosition cameraposition)
    {
        return new Builder(cameraposition);
    }

    public static CameraPosition createFromAttributes(Context context, AttributeSet attributeset)
    {
        if(attributeset == null)
            return null;
        context = context.getResources().obtainAttributes(attributeset, com.google.android.gms.R.styleable.MapAttrs);
        float f;
        float f1;
        Builder builder1;
        if(context.hasValue(com.google.android.gms.R.styleable.MapAttrs_cameraTargetLat))
            f = context.getFloat(com.google.android.gms.R.styleable.MapAttrs_cameraTargetLat, 0.0F);
        else
            f = 0.0F;
        if(context.hasValue(com.google.android.gms.R.styleable.MapAttrs_cameraTargetLng))
            f1 = context.getFloat(com.google.android.gms.R.styleable.MapAttrs_cameraTargetLng, 0.0F);
        else
            f1 = 0.0F;
        attributeset = new LatLng(f, f1);
        builder1 = builder();
        builder1.target(attributeset);
        if(context.hasValue(com.google.android.gms.R.styleable.MapAttrs_cameraZoom))
            builder1.zoom(context.getFloat(com.google.android.gms.R.styleable.MapAttrs_cameraZoom, 0.0F));
        if(context.hasValue(com.google.android.gms.R.styleable.MapAttrs_cameraBearing))
            builder1.bearing(context.getFloat(com.google.android.gms.R.styleable.MapAttrs_cameraBearing, 0.0F));
        if(context.hasValue(com.google.android.gms.R.styleable.MapAttrs_cameraTilt))
            builder1.tilt(context.getFloat(com.google.android.gms.R.styleable.MapAttrs_cameraTilt, 0.0F));
        return builder1.build();
    }

    public static final CameraPosition fromLatLngZoom(LatLng latlng, float f)
    {
        return new CameraPosition(latlng, f, 0.0F, 0.0F);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this != obj)
        {
            if(!(obj instanceof CameraPosition))
                return false;
            obj = (CameraPosition)obj;
            if(!target.equals(((CameraPosition) (obj)).target) || Float.floatToIntBits(zoom) != Float.floatToIntBits(((CameraPosition) (obj)).zoom) || Float.floatToIntBits(tilt) != Float.floatToIntBits(((CameraPosition) (obj)).tilt) || Float.floatToIntBits(bearing) != Float.floatToIntBits(((CameraPosition) (obj)).bearing))
                return false;
        }
        return true;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            target, Float.valueOf(zoom), Float.valueOf(tilt), Float.valueOf(bearing)
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("target", target).zzg("zoom", Float.valueOf(zoom)).zzg("tilt", Float.valueOf(tilt)).zzg("bearing", Float.valueOf(bearing)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

    public static final zza CREATOR = new zza();
    public final float bearing;
    public final LatLng target;
    public final float tilt;
    public final float zoom;
    private final int zzzH;

}
