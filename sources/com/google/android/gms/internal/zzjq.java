// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzib

public class zzjq
{

    public static String zzcr(String s)
    {
        if(zzpb())
            return s;
        else
            return zzw(s, (String)zzadR.get());
    }

    public static boolean zzpb()
    {
        String s = (String)zzadR.get();
        return s == null || s.startsWith("com.google");
    }

    private static String zzw(String s, String s1)
    {
        if(s == null || s1 == null)
        {
            return s;
        } else
        {
            byte abyte0[] = new byte[s.length() + s1.length()];
            System.arraycopy(s.getBytes(), 0, abyte0, 0, s.length());
            System.arraycopy(s1.getBytes(), 0, abyte0, s.length(), s1.length());
            return Integer.toHexString(zzib.zza(abyte0, 0, abyte0.length, 0));
        }
    }

    private static final ThreadLocal zzadR = new ThreadLocal();

}
