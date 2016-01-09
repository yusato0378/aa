// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import java.util.List;

public interface AppContentSection
    extends Parcelable, Freezable
{

    public abstract List getActions();

    public abstract Bundle getExtras();

    public abstract String getId();

    public abstract String getTitle();

    public abstract String getType();

    public abstract String zzpY();

    public abstract List zzqi();

    public abstract String zzqk();

    public abstract List zzqs();

    public abstract String zzqt();
}
