// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zznx, zzny, zznw, 
//            zznr, zznq, zzob

public final class zznn extends zzns
{
    public static final class zza extends zzns
    {

        public static zza[] zzzs()
        {
            if(zzaNa == null)
                synchronized(zznw.zzaNS)
                {
                    if(zzaNa == null)
                        zzaNa = new zza[0];
                }
            return zzaNa;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            if(obj != this) goto _L2; else goto _L1
_L1:
            boolean flag = true;
_L4:
            return flag;
_L2:
            flag = flag1;
            if(!(obj instanceof zza)) goto _L4; else goto _L3
_L3:
            obj = (zza)obj;
            if(name != null) goto _L6; else goto _L5
_L5:
            flag = flag1;
            if(((zza) (obj)).name != null) goto _L4; else goto _L7
_L7:
            if(zzaNb != null)
                break MISSING_BLOCK_LABEL_79;
            flag = flag1;
            if(((zza) (obj)).zzaNb != null) goto _L4; else goto _L8
_L8:
            return zza(((zzns) (obj)));
_L6:
            if(!name.equals(((zza) (obj)).name))
                return false;
              goto _L7
            if(!zzaNb.equals(((zza) (obj)).zzaNb))
                return false;
              goto _L8
        }

        public int hashCode()
        {
            int j = 0;
            int i;
            if(name == null)
                i = 0;
            else
                i = name.hashCode();
            if(zzaNb != null)
                j = zzaNb.hashCode();
            return ((i + 527) * 31 + j) * 31 + zzzP();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            zznr1.zzb(1, name);
            if(zzaNb != null)
                zznr1.zza(2, zzaNb);
            super.zza(zznr1);
        }

        public zzny zzb(zznq zznq1)
            throws IOException
        {
            return zzw(zznq1);
        }

        protected int zzc()
        {
            int j = super.zzc() + zznr.zzj(1, name);
            int i = j;
            if(zzaNb != null)
                i = j + zznr.zzc(2, zzaNb);
            return i;
        }

        public zza zzw(zznq zznq1)
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
                    name = zznq1.readString();
                    break;

                case 18: // '\022'
                    if(zzaNb == null)
                        zzaNb = new zza();
                    zznq1.zza(zzaNb);
                    break;
                }
            } while(true);
        }

        public zza zzzt()
        {
            name = "";
            zzaNb = null;
            zzaNI = null;
            zzaNT = -1;
            return this;
        }

        private static volatile zza zzaNa[];
        public String name;
        public zza zzaNb;

        public zza()
        {
            zzzt();
        }
    }

    public static final class zza.zza extends zzns
    {

        public static zza.zza[] zzzu()
        {
            if(zzaNc == null)
                synchronized(zznw.zzaNS)
                {
                    if(zzaNc == null)
                        zzaNc = new zza.zza[0];
                }
            return zzaNc;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            if(obj != this) goto _L2; else goto _L1
_L1:
            boolean flag = true;
_L4:
            return flag;
_L2:
            flag = flag1;
            if(!(obj instanceof zza.zza)) goto _L4; else goto _L3
_L3:
            obj = (zza.zza)obj;
            flag = flag1;
            if(type != ((zza.zza) (obj)).type) goto _L4; else goto _L5
_L5:
            if(zzaNd != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if(((zza.zza) (obj)).zzaNd != null) goto _L4; else goto _L8
_L8:
            return zza(((zzns) (obj)));
_L7:
            if(!zzaNd.equals(((zza.zza) (obj)).zzaNd))
                return false;
            if(true) goto _L8; else goto _L9
_L9:
        }

        public int hashCode()
        {
            int j = type;
            int i;
            if(zzaNd == null)
                i = 0;
            else
                i = zzaNd.hashCode();
            return (i + (j + 527) * 31) * 31 + zzzP();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            zznr1.zzx(1, type);
            if(zzaNd != null)
                zznr1.zza(2, zzaNd);
            super.zza(zznr1);
        }

        public zzny zzb(zznq zznq1)
            throws IOException
        {
            return zzx(zznq1);
        }

        protected int zzc()
        {
            int j = super.zzc() + zznr.zzz(1, type);
            int i = j;
            if(zzaNd != null)
                i = j + zznr.zzc(2, zzaNd);
            return i;
        }

        public zza.zza zzx(zznq zznq1)
            throws IOException
        {
_L5:
            int i = zznq1.zzzy();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 49
        //                       8: 51
        //                       18: 143;
               goto _L1 _L2 _L3 _L4
_L1:
            if(zza(zznq1, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            int j = zznq1.zzzB();
            switch(j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
                type = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if(zzaNd == null)
                zzaNd = new zza();
            zznq1.zza(zzaNd);
            if(true) goto _L5; else goto _L6
_L6:
        }

        public zza.zza zzzv()
        {
            type = 1;
            zzaNd = null;
            zzaNI = null;
            zzaNT = -1;
            return this;
        }

        private static volatile zza.zza zzaNc[];
        public int type;
        public zza zzaNd;

        public zza.zza()
        {
            zzzv();
        }
    }

    public static final class zza.zza.zza extends zzns
    {

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            if(obj != this) goto _L2; else goto _L1
_L1:
            boolean flag = true;
_L4:
            return flag;
_L2:
            flag = flag1;
            if(!(obj instanceof zza.zza.zza))
                continue; /* Loop/switch isn't completed */
            obj = (zza.zza.zza)obj;
            flag = flag1;
            if(!Arrays.equals(zzaNe, ((zza.zza.zza) (obj)).zzaNe))
                continue; /* Loop/switch isn't completed */
            if(zzaNf != null)
                break; /* Loop/switch isn't completed */
            flag = flag1;
            if(((zza.zza.zza) (obj)).zzaNf != null)
                continue; /* Loop/switch isn't completed */
_L5:
            flag = flag1;
            if(Double.doubleToLongBits(zzaNg) == Double.doubleToLongBits(((zza.zza.zza) (obj)).zzaNg))
            {
                flag = flag1;
                if(Float.floatToIntBits(zzaNh) == Float.floatToIntBits(((zza.zza.zza) (obj)).zzaNh))
                {
                    flag = flag1;
                    if(zzaNi == ((zza.zza.zza) (obj)).zzaNi)
                    {
                        flag = flag1;
                        if(zzaNj == ((zza.zza.zza) (obj)).zzaNj)
                        {
                            flag = flag1;
                            if(zzaNk == ((zza.zza.zza) (obj)).zzaNk)
                            {
                                flag = flag1;
                                if(zzaNl == ((zza.zza.zza) (obj)).zzaNl)
                                {
                                    flag = flag1;
                                    if(zznw.equals(zzaNm, ((zza.zza.zza) (obj)).zzaNm))
                                    {
                                        flag = flag1;
                                        if(zznw.equals(zzaNn, ((zza.zza.zza) (obj)).zzaNn))
                                        {
                                            flag = flag1;
                                            if(zznw.equals(zzaNo, ((zza.zza.zza) (obj)).zzaNo))
                                            {
                                                flag = flag1;
                                                if(zznw.equals(zzaNp, ((zza.zza.zza) (obj)).zzaNp))
                                                {
                                                    flag = flag1;
                                                    if(zznw.equals(zzaNq, ((zza.zza.zza) (obj)).zzaNq))
                                                    {
                                                        flag = flag1;
                                                        if(zzaNr == ((zza.zza.zza) (obj)).zzaNr)
                                                            return zza(((zzns) (obj)));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if(true) goto _L4; else goto _L3
_L3:
            if(!zzaNf.equals(((zza.zza.zza) (obj)).zzaNf))
                return false;
              goto _L5
            if(true) goto _L4; else goto _L6
_L6:
        }

        public int hashCode()
        {
            int j = Arrays.hashCode(zzaNe);
            int i;
            char c;
            int k;
            int l;
            int i1;
            int j1;
            int k1;
            long l1;
            if(zzaNf == null)
                i = 0;
            else
                i = zzaNf.hashCode();
            l1 = Double.doubleToLongBits(zzaNg);
            k = (int)(l1 ^ l1 >>> 32);
            l = Float.floatToIntBits(zzaNh);
            i1 = (int)(zzaNi ^ zzaNi >>> 32);
            j1 = zzaNj;
            k1 = zzaNk;
            if(zzaNl)
                c = '\u04CF';
            else
                c = '\u04D5';
            return (((((((c + ((((((i + (j + 527) * 31) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31) * 31 + zznw.hashCode(zzaNm)) * 31 + zznw.hashCode(zzaNn)) * 31 + zznw.hashCode(zzaNo)) * 31 + zznw.hashCode(zzaNp)) * 31 + zznw.hashCode(zzaNq)) * 31 + (int)(zzaNr ^ zzaNr >>> 32)) * 31 + zzzP();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            boolean flag = false;
            if(!Arrays.equals(zzaNe, zzob.zzaOc))
                zznr1.zza(1, zzaNe);
            if(!zzaNf.equals(""))
                zznr1.zzb(2, zzaNf);
            if(Double.doubleToLongBits(zzaNg) != Double.doubleToLongBits(0.0D))
                zznr1.zza(3, zzaNg);
            if(Float.floatToIntBits(zzaNh) != Float.floatToIntBits(0.0F))
                zznr1.zzb(4, zzaNh);
            if(zzaNi != 0L)
                zznr1.zzb(5, zzaNi);
            if(zzaNj != 0)
                zznr1.zzx(6, zzaNj);
            if(zzaNk != 0)
                zznr1.zzy(7, zzaNk);
            if(zzaNl)
                zznr1.zzb(8, zzaNl);
            if(zzaNm != null && zzaNm.length > 0)
            {
                for(int i = 0; i < zzaNm.length; i++)
                {
                    zza zza1 = zzaNm[i];
                    if(zza1 != null)
                        zznr1.zza(9, zza1);
                }

            }
            if(zzaNn != null && zzaNn.length > 0)
            {
                for(int j = 0; j < zzaNn.length; j++)
                {
                    zza.zza zza2 = zzaNn[j];
                    if(zza2 != null)
                        zznr1.zza(10, zza2);
                }

            }
            if(zzaNo != null && zzaNo.length > 0)
            {
                for(int k = 0; k < zzaNo.length; k++)
                {
                    String s = zzaNo[k];
                    if(s != null)
                        zznr1.zzb(11, s);
                }

            }
            if(zzaNp != null && zzaNp.length > 0)
            {
                for(int l = 0; l < zzaNp.length; l++)
                    zznr1.zzb(12, zzaNp[l]);

            }
            if(zzaNr != 0L)
                zznr1.zzb(13, zzaNr);
            if(zzaNq != null && zzaNq.length > 0)
            {
                for(int i1 = ((flag) ? 1 : 0); i1 < zzaNq.length; i1++)
                    zznr1.zzb(14, zzaNq[i1]);

            }
            super.zza(zznr1);
        }

        public zzny zzb(zznq zznq1)
            throws IOException
        {
            return zzy(zznq1);
        }

        protected int zzc()
        {
            boolean flag = false;
            int j = super.zzc();
            int i = j;
            if(!Arrays.equals(zzaNe, zzob.zzaOc))
                i = j + zznr.zzb(1, zzaNe);
            j = i;
            if(!zzaNf.equals(""))
                j = i + zznr.zzj(2, zzaNf);
            i = j;
            if(Double.doubleToLongBits(zzaNg) != Double.doubleToLongBits(0.0D))
                i = j + zznr.zzb(3, zzaNg);
            j = i;
            if(Float.floatToIntBits(zzaNh) != Float.floatToIntBits(0.0F))
                j = i + zznr.zzc(4, zzaNh);
            i = j;
            if(zzaNi != 0L)
                i = j + zznr.zzd(5, zzaNi);
            j = i;
            if(zzaNj != 0)
                j = i + zznr.zzz(6, zzaNj);
            int k = j;
            if(zzaNk != 0)
                k = j + zznr.zzA(7, zzaNk);
            i = k;
            if(zzaNl)
                i = k + zznr.zzc(8, zzaNl);
            j = i;
            if(zzaNm != null)
            {
                j = i;
                if(zzaNm.length > 0)
                {
                    for(j = 0; j < zzaNm.length;)
                    {
                        zza zza1 = zzaNm[j];
                        int l = i;
                        if(zza1 != null)
                            l = i + zznr.zzc(9, zza1);
                        j++;
                        i = l;
                    }

                    j = i;
                }
            }
            i = j;
            if(zzaNn != null)
            {
                i = j;
                if(zzaNn.length > 0)
                {
                    i = j;
                    for(j = 0; j < zzaNn.length;)
                    {
                        zza.zza zza2 = zzaNn[j];
                        int i1 = i;
                        if(zza2 != null)
                            i1 = i + zznr.zzc(10, zza2);
                        j++;
                        i = i1;
                    }

                }
            }
            j = i;
            if(zzaNo != null)
            {
                j = i;
                if(zzaNo.length > 0)
                {
                    j = 0;
                    int j1 = 0;
                    int l1;
                    int i2;
                    for(l1 = 0; j < zzaNo.length; l1 = i2)
                    {
                        String s = zzaNo[j];
                        int j2 = j1;
                        i2 = l1;
                        if(s != null)
                        {
                            i2 = l1 + 1;
                            j2 = j1 + zznr.zzeB(s);
                        }
                        j++;
                        j1 = j2;
                    }

                    j = i + j1 + l1 * 1;
                }
            }
            i = j;
            if(zzaNp != null)
            {
                i = j;
                if(zzaNp.length > 0)
                {
                    int k1 = 0;
                    for(i = ((flag) ? 1 : 0); i < zzaNp.length; i++)
                        k1 += zznr.zzX(zzaNp[i]);

                    i = j + k1 + zzaNp.length * 1;
                }
            }
            j = i;
            if(zzaNr != 0L)
                j = i + zznr.zzd(13, zzaNr);
            i = j;
            if(zzaNq != null)
            {
                i = j;
                if(zzaNq.length > 0)
                    i = j + zzaNq.length * 4 + zzaNq.length * 1;
            }
            return i;
        }

        public zza.zza.zza zzy(zznq zznq1)
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
                    zzaNe = zznq1.readBytes();
                    break;

                case 18: // '\022'
                    zzaNf = zznq1.readString();
                    break;

                case 25: // '\031'
                    zzaNg = zznq1.readDouble();
                    break;

                case 37: // '%'
                    zzaNh = zznq1.readFloat();
                    break;

                case 40: // '('
                    zzaNi = zznq1.zzzA();
                    break;

                case 48: // '0'
                    zzaNj = zznq1.zzzB();
                    break;

                case 56: // '8'
                    zzaNk = zznq1.zzzD();
                    break;

                case 64: // '@'
                    zzaNl = zznq1.zzzC();
                    break;

                case 74: // 'J'
                    int i2 = zzob.zzb(zznq1, 74);
                    zza azza[];
                    int j;
                    if(zzaNm == null)
                        j = 0;
                    else
                        j = zzaNm.length;
                    azza = new zza[i2 + j];
                    i2 = j;
                    if(j != 0)
                    {
                        System.arraycopy(zzaNm, 0, azza, 0, j);
                        i2 = j;
                    }
                    for(; i2 < azza.length - 1; i2++)
                    {
                        azza[i2] = new zza();
                        zznq1.zza(azza[i2]);
                        zznq1.zzzy();
                    }

                    azza[i2] = new zza();
                    zznq1.zza(azza[i2]);
                    zzaNm = azza;
                    break;

                case 82: // 'R'
                    int j2 = zzob.zzb(zznq1, 82);
                    zza.zza azza1[];
                    int k;
                    if(zzaNn == null)
                        k = 0;
                    else
                        k = zzaNn.length;
                    azza1 = new zza.zza[j2 + k];
                    j2 = k;
                    if(k != 0)
                    {
                        System.arraycopy(zzaNn, 0, azza1, 0, k);
                        j2 = k;
                    }
                    for(; j2 < azza1.length - 1; j2++)
                    {
                        azza1[j2] = new zza.zza();
                        zznq1.zza(azza1[j2]);
                        zznq1.zzzy();
                    }

                    azza1[j2] = new zza.zza();
                    zznq1.zza(azza1[j2]);
                    zzaNn = azza1;
                    break;

                case 90: // 'Z'
                    int k2 = zzob.zzb(zznq1, 90);
                    String as[];
                    int l;
                    if(zzaNo == null)
                        l = 0;
                    else
                        l = zzaNo.length;
                    as = new String[k2 + l];
                    k2 = l;
                    if(l != 0)
                    {
                        System.arraycopy(zzaNo, 0, as, 0, l);
                        k2 = l;
                    }
                    for(; k2 < as.length - 1; k2++)
                    {
                        as[k2] = zznq1.readString();
                        zznq1.zzzy();
                    }

                    as[k2] = zznq1.readString();
                    zzaNo = as;
                    break;

                case 96: // '`'
                    int l2 = zzob.zzb(zznq1, 96);
                    long al[];
                    int i1;
                    if(zzaNp == null)
                        i1 = 0;
                    else
                        i1 = zzaNp.length;
                    al = new long[l2 + i1];
                    l2 = i1;
                    if(i1 != 0)
                    {
                        System.arraycopy(zzaNp, 0, al, 0, i1);
                        l2 = i1;
                    }
                    for(; l2 < al.length - 1; l2++)
                    {
                        al[l2] = zznq1.zzzA();
                        zznq1.zzzy();
                    }

                    al[l2] = zznq1.zzzA();
                    zzaNp = al;
                    break;

                case 98: // 'b'
                    int l3 = zznq1.zzjn(zznq1.zzzF());
                    int j1 = zznq1.getPosition();
                    int i3;
                    for(i3 = 0; zznq1.zzzK() > 0; i3++)
                        zznq1.zzzA();

                    zznq1.zzjp(j1);
                    long al1[];
                    if(zzaNp == null)
                        j1 = 0;
                    else
                        j1 = zzaNp.length;
                    al1 = new long[i3 + j1];
                    i3 = j1;
                    if(j1 != 0)
                    {
                        System.arraycopy(zzaNp, 0, al1, 0, j1);
                        i3 = j1;
                    }
                    for(; i3 < al1.length; i3++)
                        al1[i3] = zznq1.zzzA();

                    zzaNp = al1;
                    zznq1.zzjo(l3);
                    break;

                case 104: // 'h'
                    zzaNr = zznq1.zzzA();
                    break;

                case 117: // 'u'
                    int j3 = zzob.zzb(zznq1, 117);
                    float af[];
                    int k1;
                    if(zzaNq == null)
                        k1 = 0;
                    else
                        k1 = zzaNq.length;
                    af = new float[j3 + k1];
                    j3 = k1;
                    if(k1 != 0)
                    {
                        System.arraycopy(zzaNq, 0, af, 0, k1);
                        j3 = k1;
                    }
                    for(; j3 < af.length - 1; j3++)
                    {
                        af[j3] = zznq1.readFloat();
                        zznq1.zzzy();
                    }

                    af[j3] = zznq1.readFloat();
                    zzaNq = af;
                    break;

                case 114: // 'r'
                    int l1 = zznq1.zzzF();
                    int i4 = zznq1.zzjn(l1);
                    int k3 = l1 / 4;
                    float af1[];
                    if(zzaNq == null)
                        l1 = 0;
                    else
                        l1 = zzaNq.length;
                    af1 = new float[k3 + l1];
                    k3 = l1;
                    if(l1 != 0)
                    {
                        System.arraycopy(zzaNq, 0, af1, 0, l1);
                        k3 = l1;
                    }
                    for(; k3 < af1.length; k3++)
                        af1[k3] = zznq1.readFloat();

                    zzaNq = af1;
                    zznq1.zzjo(i4);
                    break;
                }
            } while(true);
        }

        public zza.zza.zza zzzw()
        {
            zzaNe = zzob.zzaOc;
            zzaNf = "";
            zzaNg = 0.0D;
            zzaNh = 0.0F;
            zzaNi = 0L;
            zzaNj = 0;
            zzaNk = 0;
            zzaNl = false;
            zzaNm = zza.zzzs();
            zzaNn = zza.zza.zzzu();
            zzaNo = zzob.zzaOa;
            zzaNp = zzob.zzaNW;
            zzaNq = zzob.zzaNX;
            zzaNr = 0L;
            zzaNI = null;
            zzaNT = -1;
            return this;
        }

        public byte zzaNe[];
        public String zzaNf;
        public double zzaNg;
        public float zzaNh;
        public long zzaNi;
        public int zzaNj;
        public int zzaNk;
        public boolean zzaNl;
        public zza zzaNm[];
        public zza.zza zzaNn[];
        public String zzaNo[];
        public long zzaNp[];
        public float zzaNq[];
        public long zzaNr;

        public zza.zza.zza()
        {
            zzzw();
        }
    }


    public zznn()
    {
        zzzr();
    }

    public static zznn zzs(byte abyte0[])
        throws zznx
    {
        return (zznn)zzny.zza(new zznn(), abyte0);
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
            if(obj instanceof zznn)
            {
                obj = (zznn)obj;
                flag = flag1;
                if(zznw.equals(zzaMZ, ((zznn) (obj)).zzaMZ))
                    return zza(((zzns) (obj)));
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (zznw.hashCode(zzaMZ) + 527) * 31 + zzzP();
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        if(zzaMZ != null && zzaMZ.length > 0)
        {
            for(int i = 0; i < zzaMZ.length; i++)
            {
                zza zza1 = zzaMZ[i];
                if(zza1 != null)
                    zznr1.zza(1, zza1);
            }

        }
        super.zza(zznr1);
    }

    public zzny zzb(zznq zznq1)
        throws IOException
    {
        return zzv(zznq1);
    }

    protected int zzc()
    {
        int i = super.zzc();
        int k = i;
        if(zzaMZ != null)
        {
            k = i;
            if(zzaMZ.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if(j >= zzaMZ.length)
                        break;
                    zza zza1 = zzaMZ[j];
                    k = i;
                    if(zza1 != null)
                        k = i + zznr.zzc(1, zza1);
                    j++;
                    i = k;
                } while(true);
            }
        }
        return k;
    }

    public zznn zzv(zznq zznq1)
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
                int k = zzob.zzb(zznq1, 10);
                zza azza[];
                int j;
                if(zzaMZ == null)
                    j = 0;
                else
                    j = zzaMZ.length;
                azza = new zza[k + j];
                k = j;
                if(j != 0)
                {
                    System.arraycopy(zzaMZ, 0, azza, 0, j);
                    k = j;
                }
                for(; k < azza.length - 1; k++)
                {
                    azza[k] = new zza();
                    zznq1.zza(azza[k]);
                    zznq1.zzzy();
                }

                azza[k] = new zza();
                zznq1.zza(azza[k]);
                zzaMZ = azza;
                break;
            }
        } while(true);
    }

    public zznn zzzr()
    {
        zzaMZ = zza.zzzs();
        zzaNI = null;
        zzaNT = -1;
        return this;
    }

    public zza zzaMZ[];
}
