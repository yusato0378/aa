// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import java.util.*;

// Referenced classes of package com.google.android.gms.nearby.messages:
//            zzb

public class MessageFilter
    implements SafeParcelable
{
    public static final class zza
    {

        public MessageFilter zzva()
        {
            return new MessageFilter(zzaxG);
        }

        private final List zzaxG = new ArrayList();

        public zza()
        {
        }
    }


    MessageFilter(int i, List list)
    {
        versionCode = i;
        zzaxG = Collections.unmodifiableList((List)zzv.zzr(list));
    }

    private MessageFilter(List list)
    {
        this(1, list);
    }


    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("MessageFilter").append(zzaxG).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

    List zzuZ()
    {
        return zzaxG;
    }

    public static final zzb CREATOR = new zzb();
    final int versionCode;
    private final List zzaxG;

}
