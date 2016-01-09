// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zznx, zzny, zznw, 
//            zznr, zznq, zzob

public final class zzno extends zzns
{

    public zzno()
    {
        zzzx();
    }

    public static zzno zzt(byte abyte0[])
        throws zznx
    {
        return (zzno)zzny.zza(new zzno(), abyte0);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if(obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if(obj instanceof zzno)
            {
                obj = (zzno)obj;
                flag = flag1;
                if(zznw.equals(zzaNs, ((zzno) (obj)).zzaNs))
                {
                    flag = flag1;
                    if(zznw.equals(zzaNt, ((zzno) (obj)).zzaNt))
                    {
                        flag = flag1;
                        if(zznw.zza(zzaNu, ((zzno) (obj)).zzaNu))
                            return zza(((zzns) (obj)));
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (((zznw.hashCode(zzaNs) + 527) * 31 + zznw.hashCode(zzaNt)) * 31 + zznw.zza(zzaNu)) * 31 + zzzP();
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        boolean flag = false;
        if(zzaNs != null && zzaNs.length > 0)
        {
            for(int i = 0; i < zzaNs.length; i++)
            {
                String s = zzaNs[i];
                if(s != null)
                    zznr1.zzb(1, s);
            }

        }
        if(zzaNt != null && zzaNt.length > 0)
        {
            for(int j = 0; j < zzaNt.length; j++)
                zznr1.zzx(2, zzaNt[j]);

        }
        if(zzaNu != null && zzaNu.length > 0)
        {
            for(int k = ((flag) ? 1 : 0); k < zzaNu.length; k++)
            {
                byte abyte0[] = zzaNu[k];
                if(abyte0 != null)
                    zznr1.zza(3, abyte0);
            }

        }
        super.zza(zznr1);
    }

    public zzny zzb(zznq zznq1)
        throws IOException
    {
        return zzz(zznq1);
    }

    protected int zzc()
    {
        boolean flag = false;
        int l2 = super.zzc();
        int j;
        int k;
        if(zzaNs != null && zzaNs.length > 0)
        {
            int i = 0;
            k = 0;
            int l;
            int k1;
            for(l = 0; i < zzaNs.length; l = k1)
            {
                String s = zzaNs[i];
                int i2 = k;
                k1 = l;
                if(s != null)
                {
                    k1 = l + 1;
                    i2 = k + zznr.zzeB(s);
                }
                i++;
                k = i2;
            }

            k = l2 + k + l * 1;
        } else
        {
            k = l2;
        }
        j = k;
        if(zzaNt != null)
        {
            j = k;
            if(zzaNt.length > 0)
            {
                j = 0;
                int i1 = 0;
                for(; j < zzaNt.length; j++)
                    i1 += zznr.zzju(zzaNt[j]);

                j = k + i1 + zzaNt.length * 1;
            }
        }
        k = j;
        if(zzaNu != null)
        {
            k = j;
            if(zzaNu.length > 0)
            {
                int j1 = 0;
                int l1 = 0;
                for(k = ((flag) ? 1 : 0); k < zzaNu.length;)
                {
                    byte abyte0[] = zzaNu[k];
                    int k2 = j1;
                    int j2 = l1;
                    if(abyte0 != null)
                    {
                        j2 = l1 + 1;
                        k2 = j1 + zznr.zzy(abyte0);
                    }
                    k++;
                    j1 = k2;
                    l1 = j2;
                }

                k = j + j1 + l1 * 1;
            }
        }
        return k;
    }

    public zzno zzz(zznq zznq1)
        throws IOException
    {
        do
        {
            int i = zznq1.zzzy();
            switch(i)
            {
            default:
                if(zza(zznq1, i))
                    continue;
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int j1 = zzob.zzb(zznq1, 10);
                String as[];
                int j;
                if(zzaNs == null)
                    j = 0;
                else
                    j = zzaNs.length;
                as = new String[j1 + j];
                j1 = j;
                if(j != 0)
                {
                    System.arraycopy(zzaNs, 0, as, 0, j);
                    j1 = j;
                }
                for(; j1 < as.length - 1; j1++)
                {
                    as[j1] = zznq1.readString();
                    zznq1.zzzy();
                }

                as[j1] = zznq1.readString();
                zzaNs = as;
                break;

            case 16: // '\020'
                int k1 = zzob.zzb(zznq1, 16);
                int ai[];
                int k;
                if(zzaNt == null)
                    k = 0;
                else
                    k = zzaNt.length;
                ai = new int[k1 + k];
                k1 = k;
                if(k != 0)
                {
                    System.arraycopy(zzaNt, 0, ai, 0, k);
                    k1 = k;
                }
                for(; k1 < ai.length - 1; k1++)
                {
                    ai[k1] = zznq1.zzzB();
                    zznq1.zzzy();
                }

                ai[k1] = zznq1.zzzB();
                zzaNt = ai;
                break;

            case 18: // '\022'
                int j2 = zznq1.zzjn(zznq1.zzzF());
                int l = zznq1.getPosition();
                int l1;
                for(l1 = 0; zznq1.zzzK() > 0; l1++)
                    zznq1.zzzB();

                zznq1.zzjp(l);
                int ai1[];
                if(zzaNt == null)
                    l = 0;
                else
                    l = zzaNt.length;
                ai1 = new int[l1 + l];
                l1 = l;
                if(l != 0)
                {
                    System.arraycopy(zzaNt, 0, ai1, 0, l);
                    l1 = l;
                }
                for(; l1 < ai1.length; l1++)
                    ai1[l1] = zznq1.zzzB();

                zzaNt = ai1;
                zznq1.zzjo(j2);
                break;

            case 26: // '\032'
                int i2 = zzob.zzb(zznq1, 26);
                byte abyte0[][];
                int i1;
                if(zzaNu == null)
                    i1 = 0;
                else
                    i1 = zzaNu.length;
                abyte0 = new byte[i2 + i1][];
                i2 = i1;
                if(i1 != 0)
                {
                    System.arraycopy(zzaNu, 0, abyte0, 0, i1);
                    i2 = i1;
                }
                for(; i2 < abyte0.length - 1; i2++)
                {
                    abyte0[i2] = zznq1.readBytes();
                    zznq1.zzzy();
                }

                abyte0[i2] = zznq1.readBytes();
                zzaNu = abyte0;
                break;
            }
        } while(true);
    }

    public zzno zzzx()
    {
        zzaNs = zzob.zzaOa;
        zzaNt = zzob.zzaNV;
        zzaNu = zzob.zzaOb;
        zzaNI = null;
        zzaNT = -1;
        return this;
    }

    public String zzaNs[];
    public int zzaNt[];
    public byte zzaNu[][];
}
