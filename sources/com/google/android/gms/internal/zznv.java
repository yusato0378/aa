// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//            zznr, zznt, zzoa, zzny

class zznv
    implements Cloneable
{

    zznv()
    {
        zzaNR = new ArrayList();
    }

    private byte[] toByteArray()
        throws IOException
    {
        byte abyte0[] = new byte[zzc()];
        zza(zznr.zzw(abyte0));
        return abyte0;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return zzzT();
    }

    public boolean equals(Object obj)
    {
        boolean flag2 = false;
        boolean flag;
        if(obj == this)
        {
            flag = true;
        } else
        {
            flag = flag2;
            if(obj instanceof zznv)
            {
                obj = (zznv)obj;
                if(zzaNQ != null && ((zznv) (obj)).zzaNQ != null)
                {
                    flag = flag2;
                    if(zzaNP == ((zznv) (obj)).zzaNP)
                    {
                        if(!zzaNP.zzaNJ.isArray())
                            return zzaNQ.equals(((zznv) (obj)).zzaNQ);
                        if(zzaNQ instanceof byte[])
                            return Arrays.equals((byte[])(byte[])zzaNQ, (byte[])(byte[])((zznv) (obj)).zzaNQ);
                        if(zzaNQ instanceof int[])
                            return Arrays.equals((int[])(int[])zzaNQ, (int[])(int[])((zznv) (obj)).zzaNQ);
                        if(zzaNQ instanceof long[])
                            return Arrays.equals((long[])(long[])zzaNQ, (long[])(long[])((zznv) (obj)).zzaNQ);
                        if(zzaNQ instanceof float[])
                            return Arrays.equals((float[])(float[])zzaNQ, (float[])(float[])((zznv) (obj)).zzaNQ);
                        if(zzaNQ instanceof double[])
                            return Arrays.equals((double[])(double[])zzaNQ, (double[])(double[])((zznv) (obj)).zzaNQ);
                        if(zzaNQ instanceof boolean[])
                            return Arrays.equals((boolean[])(boolean[])zzaNQ, (boolean[])(boolean[])((zznv) (obj)).zzaNQ);
                        else
                            return Arrays.deepEquals((Object[])(Object[])zzaNQ, (Object[])(Object[])((zznv) (obj)).zzaNQ);
                    }
                } else
                {
                    if(zzaNR != null && ((zznv) (obj)).zzaNR != null)
                        return zzaNR.equals(((zznv) (obj)).zzaNR);
                    boolean flag1;
                    try
                    {
                        flag1 = Arrays.equals(toByteArray(), ((zznv) (obj)).toByteArray());
                    }
                    // Misplaced declaration of an exception variable
                    catch(Object obj)
                    {
                        throw new IllegalStateException(((Throwable) (obj)));
                    }
                    return flag1;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        int i;
        try
        {
            i = Arrays.hashCode(toByteArray());
        }
        catch(IOException ioexception)
        {
            throw new IllegalStateException(ioexception);
        }
        return i + 527;
    }

    void zza(zznr zznr1)
        throws IOException
    {
        if(zzaNQ != null)
        {
            zzaNP.zza(zzaNQ, zznr1);
        } else
        {
            Iterator iterator = zzaNR.iterator();
            while(iterator.hasNext()) 
                ((zzoa)iterator.next()).zza(zznr1);
        }
    }

    void zza(zzoa zzoa1)
    {
        zzaNR.add(zzoa1);
    }

    Object zzb(zznt zznt1)
    {
        if(zzaNQ != null)
        {
            if(zzaNP != zznt1)
                throw new IllegalStateException("Tried to getExtension with a differernt Extension.");
        } else
        {
            zzaNP = zznt1;
            zzaNQ = zznt1.zzy(zzaNR);
            zzaNR = null;
        }
        return zzaNQ;
    }

    int zzc()
    {
        if(zzaNQ == null) goto _L2; else goto _L1
_L1:
        int j = zzaNP.zzM(zzaNQ);
_L4:
        return j;
_L2:
        Iterator iterator = zzaNR.iterator();
        int i = 0;
        do
        {
            j = i;
            if(!iterator.hasNext())
                continue;
            i = ((zzoa)iterator.next()).zzc() + i;
        } while(true);
        if(true) goto _L4; else goto _L3
_L3:
    }

    public final zznv zzzT()
    {
        Object obj;
        int i;
        i = 0;
        obj = new zznv();
        obj.zzaNP = zzaNP;
        if(zzaNR != null) goto _L2; else goto _L1
_L1:
        obj.zzaNR = null;
_L4:
        if(zzaNQ == null)
            return ((zznv) (obj));
        break; /* Loop/switch isn't completed */
_L2:
        try
        {
            ((zznv) (obj)).zzaNR.addAll(zzaNR);
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            throw new AssertionError(obj);
        }
        if(true) goto _L4; else goto _L3
_L3:
        if(!(zzaNQ instanceof zzny))
            break MISSING_BLOCK_LABEL_93;
        obj.zzaNQ = ((zzny)zzaNQ).zzzR();
        return ((zznv) (obj));
        if(!(zzaNQ instanceof byte[]))
            break MISSING_BLOCK_LABEL_122;
        obj.zzaNQ = ((byte[])(byte[])zzaNQ).clone();
        return ((zznv) (obj));
        if(!(zzaNQ instanceof byte[][])) goto _L6; else goto _L5
_L5:
        Object obj1;
        Object obj2;
        obj1 = (byte[][])(byte[][])zzaNQ;
        obj2 = new byte[obj1.length][];
        obj.zzaNQ = obj2;
        i = 0;
_L8:
        if(i >= obj1.length)
            break; /* Loop/switch isn't completed */
        obj2[i] = (byte[])obj1[i].clone();
        i++;
        if(true) goto _L8; else goto _L7
_L6:
        if(!(zzaNQ instanceof boolean[]))
            break MISSING_BLOCK_LABEL_216;
        obj.zzaNQ = ((boolean[])(boolean[])zzaNQ).clone();
        return ((zznv) (obj));
        if(!(zzaNQ instanceof int[]))
            break MISSING_BLOCK_LABEL_245;
        obj.zzaNQ = ((int[])(int[])zzaNQ).clone();
        return ((zznv) (obj));
        if(!(zzaNQ instanceof long[]))
            break MISSING_BLOCK_LABEL_274;
        obj.zzaNQ = ((long[])(long[])zzaNQ).clone();
        return ((zznv) (obj));
        if(!(zzaNQ instanceof float[]))
            break MISSING_BLOCK_LABEL_303;
        obj.zzaNQ = ((float[])(float[])zzaNQ).clone();
        return ((zznv) (obj));
        if(!(zzaNQ instanceof double[]))
            break MISSING_BLOCK_LABEL_332;
        obj.zzaNQ = ((double[])(double[])zzaNQ).clone();
        return ((zznv) (obj));
        if(!(zzaNQ instanceof zzny[])) goto _L7; else goto _L9
_L9:
        obj1 = (zzny[])(zzny[])zzaNQ;
        obj2 = new zzny[obj1.length];
        obj.zzaNQ = obj2;
_L11:
        if(i >= obj1.length) goto _L7; else goto _L10
_L10:
        obj2[i] = obj1[i].zzzR();
        i++;
          goto _L11
_L7:
        return ((zznv) (obj));
    }

    private zznt zzaNP;
    private Object zzaNQ;
    private List zzaNR;
}
