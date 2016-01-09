// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.nearby.messages:
//            zza

public class Message
    implements SafeParcelable
{

    Message(int i, byte abyte0[], String s, String s1)
    {
        boolean flag;
        if(abyte0.length <= 1000)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)", new Object[] {
            Integer.valueOf(abyte0.length), Integer.valueOf(1000)
        });
        versionCode = i;
        content = (byte[])zzv.zzr(abyte0);
        type = (String)zzv.zzr(s1);
        abyte0 = s;
        if(s == null)
            abyte0 = "";
        zzUq = abyte0;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getNamespace()
    {
        return zzUq;
    }

    public String getType()
    {
        return type;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Message{type='").append(type).append("'").append(", namespace='").append(zzUq).append("'").append(", content=[").append(content.length).append(" bytes]").append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

    public byte[] zzuY()
    {
        return content;
    }

    public static final zza CREATOR = new zza();
    private final byte content[];
    private final String type;
    final int versionCode;
    private final String zzUq;

}
