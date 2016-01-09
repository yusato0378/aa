// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

// Referenced classes of package com.google.android.gms.location.places:
//            PlaceFilter, PlaceReport

public interface PlaceDetectionApi
{

    public abstract PendingResult getCurrentPlace(GoogleApiClient googleapiclient, PlaceFilter placefilter);

    public abstract PendingResult reportDeviceAtPlace(GoogleApiClient googleapiclient, PlaceReport placereport);
}
