// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public interface AppContentAnnotation
    extends Parcelable, Freezable
{

    public abstract String getDescription();

    public abstract String getId();

    public abstract String getTitle();

    public abstract String zzqb();

    public abstract int zzqc();

    public abstract Uri zzqd();

    public abstract Bundle zzqe();

    public abstract int zzqf();

    public abstract String zzqg();
}
