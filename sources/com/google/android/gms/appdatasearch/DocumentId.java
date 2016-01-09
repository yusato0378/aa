// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            zzc

public class DocumentId
    implements SafeParcelable
{

    DocumentId(int i, String s, String s1, String s2)
    {
        zzzH = i;
        zzJd = s;
        zzJe = s1;
        zzJf = s2;
    }

    public DocumentId(String s, String s1, String s2)
    {
        this(1, s, s1, s2);
    }

    public int describeContents()
    {
        zzc zzc1 = CREATOR;
        return 0;
    }

    public String toString()
    {
        return String.format("DocumentId[packageName=%s, corpusName=%s, uri=%s]", new Object[] {
            zzJd, zzJe, zzJf
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc zzc1 = CREATOR;
        zzc.zza(this, parcel, i);
    }

    public static final zzc CREATOR = new zzc();
    final String zzJd;
    final String zzJe;
    final String zzJf;
    final int zzzH;

}
