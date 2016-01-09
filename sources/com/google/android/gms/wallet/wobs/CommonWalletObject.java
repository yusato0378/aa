// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzhq;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            zza, TimeInterval

public class CommonWalletObject
    implements SafeParcelable
{
    public final class zza
    {

        public zza zzex(String s)
        {
            zzaKi.zzga = s;
            return this;
        }

        public CommonWalletObject zzyU()
        {
            return zzaKi;
        }

        final CommonWalletObject zzaKi;

        private zza()
        {
            zzaKi = CommonWalletObject.this;
            super();
        }

    }


    CommonWalletObject()
    {
        zzzH = 1;
        zzaIH = zzhq.zznc();
        zzaIJ = zzhq.zznc();
        zzaIM = zzhq.zznc();
        zzaIO = zzhq.zznc();
        zzaIP = zzhq.zznc();
        zzaIQ = zzhq.zznc();
    }

    CommonWalletObject(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, int j, ArrayList arraylist, TimeInterval timeinterval, ArrayList arraylist1, String s8, 
            String s9, ArrayList arraylist2, boolean flag, ArrayList arraylist3, ArrayList arraylist4, ArrayList arraylist5)
    {
        zzzH = i;
        zzga = s;
        zzaIG = s1;
        name = s2;
        zzaIA = s3;
        zzaIC = s4;
        zzaID = s5;
        zzaIE = s6;
        zzaIF = s7;
        state = j;
        zzaIH = arraylist;
        zzaII = timeinterval;
        zzaIJ = arraylist1;
        zzaIK = s8;
        zzaIL = s9;
        zzaIM = arraylist2;
        zzaIN = flag;
        zzaIO = arraylist3;
        zzaIP = arraylist4;
        zzaIQ = arraylist5;
    }

    public static zza zzyT()
    {
        CommonWalletObject commonwalletobject = new CommonWalletObject();
        commonwalletobject.getClass();
        return commonwalletobject. new zza();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getId()
    {
        return zzga;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.wallet.wobs.zza.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.wallet.wobs.zza();
    String name;
    int state;
    String zzaIA;
    String zzaIC;
    String zzaID;
    String zzaIE;
    String zzaIF;
    String zzaIG;
    ArrayList zzaIH;
    TimeInterval zzaII;
    ArrayList zzaIJ;
    String zzaIK;
    String zzaIL;
    ArrayList zzaIM;
    boolean zzaIN;
    ArrayList zzaIO;
    ArrayList zzaIP;
    ArrayList zzaIQ;
    String zzga;
    private final int zzzH;

}
