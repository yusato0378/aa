// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places.internal;

import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzno;
import com.google.android.gms.internal.zznx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class zzq extends zzc
{

    public zzq(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    protected String zzA(String s, String s1)
    {
        String s2 = s1;
        if(zzbF(s))
        {
            s2 = s1;
            if(!zzbH(s))
                s2 = getString(s);
        }
        return s2;
    }

    protected SafeParcelable zza(String s, android.os.Parcelable.Creator creator)
    {
        s = zzc(s, null);
        if(s == null)
            return null;
        else
            return com.google.android.gms.common.internal.safeparcel.zzc.zza(s, creator);
    }

    protected List zza(String s, android.os.Parcelable.Creator creator, List list)
    {
        s = zzc(s, null);
        if(s != null) goto _L2; else goto _L1
_L1:
        zzno zzno1;
        return list;
_L2:
        byte abyte0[][];
        int j;
        if((zzno1 = zzno.zzt(s)).zzaNu == null)
            continue; /* Loop/switch isn't completed */
        s = new ArrayList(zzno1.zzaNu.length);
        abyte0 = zzno1.zzaNu;
        j = abyte0.length;
        int i = 0;
_L4:
        if(i >= j)
            break; /* Loop/switch isn't completed */
        s.add(com.google.android.gms.common.internal.safeparcel.zzc.zza(abyte0[i], creator));
        i++;
        if(true) goto _L4; else goto _L3
_L3:
        return s;
        s;
        if(Log.isLoggable("SafeDataBufferRef", 6))
        {
            Log.e("SafeDataBufferRef", "Cannot parse byte[]", s);
            return list;
        }
        if(true) goto _L1; else goto _L5
_L5:
    }

    protected List zza(String s, List list)
    {
        s = zzc(s, null);
        if(s != null) goto _L2; else goto _L1
_L1:
        return list;
_L2:
        ArrayList arraylist;
        if(((zzno) (s = zzno.zzt(s))).zzaNt == null)
            continue; /* Loop/switch isn't completed */
        arraylist = new ArrayList(((zzno) (s)).zzaNt.length);
        int i = 0;
_L4:
        if(i >= ((zzno) (s)).zzaNt.length)
            break; /* Loop/switch isn't completed */
        arraylist.add(Integer.valueOf(((zzno) (s)).zzaNt[i]));
        i++;
        if(true) goto _L4; else goto _L3
_L3:
        return arraylist;
        s;
        if(Log.isLoggable("SafeDataBufferRef", 6))
        {
            Log.e("SafeDataBufferRef", "Cannot parse byte[]", s);
            return list;
        }
        if(true) goto _L1; else goto _L5
_L5:
    }

    protected float zzb(String s, float f)
    {
        float f1 = f;
        if(zzbF(s))
        {
            f1 = f;
            if(!zzbH(s))
                f1 = getFloat(s);
        }
        return f1;
    }

    protected List zzb(String s, List list)
    {
        s = zzc(s, null);
        if(s != null) goto _L2; else goto _L1
_L1:
        return list;
_L2:
        if(((zzno) (s = zzno.zzt(s))).zzaNs == null)
            continue; /* Loop/switch isn't completed */
        s = Arrays.asList(((zzno) (s)).zzaNs);
        return s;
        s;
        if(Log.isLoggable("SafeDataBufferRef", 6))
        {
            Log.e("SafeDataBufferRef", "Cannot parse byte[]", s);
            return list;
        }
        if(true) goto _L1; else goto _L3
_L3:
    }

    protected byte[] zzc(String s, byte abyte0[])
    {
        byte abyte1[] = abyte0;
        if(zzbF(s))
        {
            abyte1 = abyte0;
            if(!zzbH(s))
                abyte1 = getByteArray(s);
        }
        return abyte1;
    }

    protected boolean zzh(String s, boolean flag)
    {
        boolean flag1 = flag;
        if(zzbF(s))
        {
            flag1 = flag;
            if(!zzbH(s))
                flag1 = getBoolean(s);
        }
        return flag1;
    }

    protected int zzy(String s, int i)
    {
        int j = i;
        if(zzbF(s))
        {
            j = i;
            if(!zzbH(s))
                j = getInteger(s);
        }
        return j;
    }

    private final String TAG = "SafeDataBufferRef";
}
