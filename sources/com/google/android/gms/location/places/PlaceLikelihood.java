// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places;

import com.google.android.gms.common.data.Freezable;

// Referenced classes of package com.google.android.gms.location.places:
//            Place

public interface PlaceLikelihood
    extends Freezable
{

    public abstract float getLikelihood();

    public abstract Place getPlace();
}
