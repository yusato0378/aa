// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal.model.moments:
//            ItemScopeEntity

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void zza(ItemScopeEntity itemscopeentity, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        Set set = itemscopeentity.zzazD;
        if(set.contains(Integer.valueOf(1)))
            zzb.zzc(parcel, 1, itemscopeentity.zzzH);
        if(set.contains(Integer.valueOf(2)))
            zzb.zza(parcel, 2, itemscopeentity.zzazE, i, true);
        if(set.contains(Integer.valueOf(3)))
            zzb.zzb(parcel, 3, itemscopeentity.zzazF, true);
        if(set.contains(Integer.valueOf(4)))
            zzb.zza(parcel, 4, itemscopeentity.zzazG, i, true);
        if(set.contains(Integer.valueOf(5)))
            zzb.zza(parcel, 5, itemscopeentity.zzazH, true);
        if(set.contains(Integer.valueOf(6)))
            zzb.zza(parcel, 6, itemscopeentity.zzazI, true);
        if(set.contains(Integer.valueOf(7)))
            zzb.zza(parcel, 7, itemscopeentity.zzazJ, true);
        if(set.contains(Integer.valueOf(8)))
            zzb.zzc(parcel, 8, itemscopeentity.zzazK, true);
        if(set.contains(Integer.valueOf(9)))
            zzb.zzc(parcel, 9, itemscopeentity.zzazL);
        if(set.contains(Integer.valueOf(10)))
            zzb.zzc(parcel, 10, itemscopeentity.zzazM, true);
        if(set.contains(Integer.valueOf(11)))
            zzb.zza(parcel, 11, itemscopeentity.zzazN, i, true);
        if(set.contains(Integer.valueOf(12)))
            zzb.zzc(parcel, 12, itemscopeentity.zzazO, true);
        if(set.contains(Integer.valueOf(13)))
            zzb.zza(parcel, 13, itemscopeentity.zzazP, true);
        if(set.contains(Integer.valueOf(14)))
            zzb.zza(parcel, 14, itemscopeentity.zzazQ, true);
        if(set.contains(Integer.valueOf(15)))
            zzb.zza(parcel, 15, itemscopeentity.zzazR, i, true);
        if(set.contains(Integer.valueOf(17)))
            zzb.zza(parcel, 17, itemscopeentity.zzazT, true);
        if(set.contains(Integer.valueOf(16)))
            zzb.zza(parcel, 16, itemscopeentity.zzazS, true);
        if(set.contains(Integer.valueOf(19)))
            zzb.zzc(parcel, 19, itemscopeentity.zzazU, true);
        if(set.contains(Integer.valueOf(18)))
            zzb.zza(parcel, 18, itemscopeentity.zzql, true);
        if(set.contains(Integer.valueOf(21)))
            zzb.zza(parcel, 21, itemscopeentity.zzazW, true);
        if(set.contains(Integer.valueOf(20)))
            zzb.zza(parcel, 20, itemscopeentity.zzazV, true);
        if(set.contains(Integer.valueOf(23)))
            zzb.zza(parcel, 23, itemscopeentity.zzadH, true);
        if(set.contains(Integer.valueOf(22)))
            zzb.zza(parcel, 22, itemscopeentity.zzazX, true);
        if(set.contains(Integer.valueOf(25)))
            zzb.zza(parcel, 25, itemscopeentity.zzazZ, true);
        if(set.contains(Integer.valueOf(24)))
            zzb.zza(parcel, 24, itemscopeentity.zzazY, true);
        if(set.contains(Integer.valueOf(27)))
            zzb.zza(parcel, 27, itemscopeentity.zzaAb, true);
        if(set.contains(Integer.valueOf(26)))
            zzb.zza(parcel, 26, itemscopeentity.zzaAa, true);
        if(set.contains(Integer.valueOf(29)))
            zzb.zza(parcel, 29, itemscopeentity.zzaAd, i, true);
        if(set.contains(Integer.valueOf(28)))
            zzb.zza(parcel, 28, itemscopeentity.zzaAc, true);
        if(set.contains(Integer.valueOf(31)))
            zzb.zza(parcel, 31, itemscopeentity.zzaAf, true);
        if(set.contains(Integer.valueOf(30)))
            zzb.zza(parcel, 30, itemscopeentity.zzaAe, true);
        if(set.contains(Integer.valueOf(34)))
            zzb.zza(parcel, 34, itemscopeentity.zzaAh, i, true);
        if(set.contains(Integer.valueOf(32)))
            zzb.zza(parcel, 32, itemscopeentity.zzGM, true);
        if(set.contains(Integer.valueOf(33)))
            zzb.zza(parcel, 33, itemscopeentity.zzaAg, true);
        if(set.contains(Integer.valueOf(38)))
            zzb.zza(parcel, 38, itemscopeentity.zzapM);
        if(set.contains(Integer.valueOf(39)))
            zzb.zza(parcel, 39, itemscopeentity.mName, true);
        if(set.contains(Integer.valueOf(36)))
            zzb.zza(parcel, 36, itemscopeentity.zzapL);
        if(set.contains(Integer.valueOf(37)))
            zzb.zza(parcel, 37, itemscopeentity.zzaAi, i, true);
        if(set.contains(Integer.valueOf(42)))
            zzb.zza(parcel, 42, itemscopeentity.zzaAl, true);
        if(set.contains(Integer.valueOf(43)))
            zzb.zza(parcel, 43, itemscopeentity.zzaAm, true);
        if(set.contains(Integer.valueOf(40)))
            zzb.zza(parcel, 40, itemscopeentity.zzaAj, i, true);
        if(set.contains(Integer.valueOf(41)))
            zzb.zzc(parcel, 41, itemscopeentity.zzaAk, true);
        if(set.contains(Integer.valueOf(46)))
            zzb.zza(parcel, 46, itemscopeentity.zzaAp, i, true);
        if(set.contains(Integer.valueOf(47)))
            zzb.zza(parcel, 47, itemscopeentity.zzaAq, true);
        if(set.contains(Integer.valueOf(44)))
            zzb.zza(parcel, 44, itemscopeentity.zzaAn, true);
        if(set.contains(Integer.valueOf(45)))
            zzb.zza(parcel, 45, itemscopeentity.zzaAo, true);
        if(set.contains(Integer.valueOf(51)))
            zzb.zza(parcel, 51, itemscopeentity.zzaAu, true);
        if(set.contains(Integer.valueOf(50)))
            zzb.zza(parcel, 50, itemscopeentity.zzaAt, i, true);
        if(set.contains(Integer.valueOf(49)))
            zzb.zza(parcel, 49, itemscopeentity.zzaAs, true);
        if(set.contains(Integer.valueOf(48)))
            zzb.zza(parcel, 48, itemscopeentity.zzaAr, true);
        if(set.contains(Integer.valueOf(55)))
            zzb.zza(parcel, 55, itemscopeentity.zzaAw, true);
        if(set.contains(Integer.valueOf(54)))
            zzb.zza(parcel, 54, itemscopeentity.zzAX, true);
        if(set.contains(Integer.valueOf(53)))
            zzb.zza(parcel, 53, itemscopeentity.zzAV, true);
        if(set.contains(Integer.valueOf(52)))
            zzb.zza(parcel, 52, itemscopeentity.zzaAv, true);
        if(set.contains(Integer.valueOf(56)))
            zzb.zza(parcel, 56, itemscopeentity.zzaAx, true);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzeS(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzhl(i);
    }

    public ItemScopeEntity zzeS(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        HashSet hashset = new HashSet();
        int j = 0;
        ItemScopeEntity itemscopeentity9 = null;
        java.util.ArrayList arraylist5 = null;
        ItemScopeEntity itemscopeentity8 = null;
        String s34 = null;
        String s33 = null;
        String s32 = null;
        java.util.ArrayList arraylist4 = null;
        int i = 0;
        java.util.ArrayList arraylist3 = null;
        ItemScopeEntity itemscopeentity7 = null;
        java.util.ArrayList arraylist2 = null;
        String s31 = null;
        String s30 = null;
        ItemScopeEntity itemscopeentity6 = null;
        String s29 = null;
        String s28 = null;
        String s27 = null;
        java.util.ArrayList arraylist1 = null;
        String s26 = null;
        String s25 = null;
        String s24 = null;
        String s23 = null;
        String s22 = null;
        String s21 = null;
        String s20 = null;
        String s19 = null;
        String s18 = null;
        ItemScopeEntity itemscopeentity5 = null;
        String s17 = null;
        String s16 = null;
        String s15 = null;
        String s14 = null;
        ItemScopeEntity itemscopeentity4 = null;
        double d1 = 0.0D;
        ItemScopeEntity itemscopeentity3 = null;
        double d = 0.0D;
        String s13 = null;
        ItemScopeEntity itemscopeentity2 = null;
        java.util.ArrayList arraylist = null;
        String s12 = null;
        String s11 = null;
        String s10 = null;
        String s9 = null;
        ItemScopeEntity itemscopeentity1 = null;
        String s8 = null;
        String s7 = null;
        String s6 = null;
        ItemScopeEntity itemscopeentity = null;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        String s1 = null;
        String s = null;
        do
            if(parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
                switch(com.google.android.gms.common.internal.safeparcel.zza.zzaV(l))
                {
                case 35: // '#'
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    itemscopeentity9 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    arraylist5 = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel, l);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    itemscopeentity8 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s34 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    s33 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    s32 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    arraylist4 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 9: // '\t'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 10: // '\n'
                    arraylist3 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(10));
                    break;

                case 11: // '\013'
                    itemscopeentity7 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(11));
                    break;

                case 12: // '\f'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(12));
                    break;

                case 13: // '\r'
                    s31 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(13));
                    break;

                case 14: // '\016'
                    s30 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(14));
                    break;

                case 15: // '\017'
                    itemscopeentity6 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(15));
                    break;

                case 17: // '\021'
                    s28 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(17));
                    break;

                case 16: // '\020'
                    s29 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(16));
                    break;

                case 19: // '\023'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(19));
                    break;

                case 18: // '\022'
                    s27 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(18));
                    break;

                case 21: // '\025'
                    s25 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(21));
                    break;

                case 20: // '\024'
                    s26 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(20));
                    break;

                case 23: // '\027'
                    s23 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(23));
                    break;

                case 22: // '\026'
                    s24 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(22));
                    break;

                case 25: // '\031'
                    s21 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(25));
                    break;

                case 24: // '\030'
                    s22 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(24));
                    break;

                case 27: // '\033'
                    s19 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(27));
                    break;

                case 26: // '\032'
                    s20 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(26));
                    break;

                case 29: // '\035'
                    itemscopeentity5 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(29));
                    break;

                case 28: // '\034'
                    s18 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(28));
                    break;

                case 31: // '\037'
                    s16 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(31));
                    break;

                case 30: // '\036'
                    s17 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(30));
                    break;

                case 34: // '"'
                    itemscopeentity4 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(34));
                    break;

                case 32: // ' '
                    s15 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(32));
                    break;

                case 33: // '!'
                    s14 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(33));
                    break;

                case 38: // '&'
                    d = com.google.android.gms.common.internal.safeparcel.zza.zzm(parcel, l);
                    hashset.add(Integer.valueOf(38));
                    break;

                case 39: // '\''
                    s13 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(39));
                    break;

                case 36: // '$'
                    d1 = com.google.android.gms.common.internal.safeparcel.zza.zzm(parcel, l);
                    hashset.add(Integer.valueOf(36));
                    break;

                case 37: // '%'
                    itemscopeentity3 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(37));
                    break;

                case 42: // '*'
                    s12 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(42));
                    break;

                case 43: // '+'
                    s11 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(43));
                    break;

                case 40: // '('
                    itemscopeentity2 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(40));
                    break;

                case 41: // ')'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(41));
                    break;

                case 46: // '.'
                    itemscopeentity1 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(46));
                    break;

                case 47: // '/'
                    s8 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(47));
                    break;

                case 44: // ','
                    s10 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(44));
                    break;

                case 45: // '-'
                    s9 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(45));
                    break;

                case 51: // '3'
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(51));
                    break;

                case 50: // '2'
                    itemscopeentity = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(50));
                    break;

                case 49: // '1'
                    s6 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(49));
                    break;

                case 48: // '0'
                    s7 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(48));
                    break;

                case 55: // '7'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(55));
                    break;

                case 54: // '6'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(54));
                    break;

                case 53: // '5'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(53));
                    break;

                case 52: // '4'
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(52));
                    break;

                case 56: // '8'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    hashset.add(Integer.valueOf(56));
                    break;
                }
            } else
            {
                if(parcel.dataPosition() != k)
                    throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
                return new ItemScopeEntity(hashset, j, itemscopeentity9, arraylist5, itemscopeentity8, s34, s33, s32, arraylist4, i, arraylist3, itemscopeentity7, arraylist2, s31, s30, itemscopeentity6, s29, s28, s27, arraylist1, s26, s25, s24, s23, s22, s21, s20, s19, s18, itemscopeentity5, s17, s16, s15, s14, itemscopeentity4, d1, itemscopeentity3, d, s13, itemscopeentity2, arraylist, s12, s11, s10, s9, itemscopeentity1, s8, s7, s6, itemscopeentity, s5, s4, s3, s2, s1, s);
            }
        while(true);
    }

    public ItemScopeEntity[] zzhl(int i)
    {
        return new ItemScopeEntity[i];
    }
}
