// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            zzc

public class FieldWithSortOrder
    implements SafeParcelable
{

    FieldWithSortOrder(int i, String s, boolean flag)
    {
        zzzH = i;
        zzZv = s;
        zzaaP = flag;
    }

    public FieldWithSortOrder(String s, boolean flag)
    {
        this(1, s, flag);
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        Locale locale = Locale.US;
        String s1 = zzZv;
        String s;
        if(zzaaP)
            s = "ASC";
        else
            s = "DESC";
        return String.format(locale, "FieldWithSortOrder[%s %s]", new Object[] {
            s1, s
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

    public static final zzc CREATOR = new zzc();
    final String zzZv;
    final boolean zzaaP;
    final int zzzH;

}
