// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzhq;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TimeInterval;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet:
//            zzj

public final class LoyaltyWalletObject
    implements SafeParcelable
{

    LoyaltyWalletObject()
    {
        zzzH = 4;
        zzaIH = zzhq.zznc();
        zzaIJ = zzhq.zznc();
        zzaIM = zzhq.zznc();
        zzaIO = zzhq.zznc();
        zzaIP = zzhq.zznc();
        zzaIQ = zzhq.zznc();
    }

    LoyaltyWalletObject(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, String s9, int j, ArrayList arraylist, TimeInterval timeinterval, 
            ArrayList arraylist1, String s10, String s11, ArrayList arraylist2, boolean flag, ArrayList arraylist3, ArrayList arraylist4, 
            ArrayList arraylist5, LoyaltyPoints loyaltypoints)
    {
        zzzH = i;
        zzga = s;
        zzaIz = s1;
        zzaIA = s2;
        zzaIB = s3;
        zzate = s4;
        zzaIC = s5;
        zzaID = s6;
        zzaIE = s7;
        zzaIF = s8;
        zzaIG = s9;
        state = j;
        zzaIH = arraylist;
        zzaII = timeinterval;
        zzaIJ = arraylist1;
        zzaIK = s10;
        zzaIL = s11;
        zzaIM = arraylist2;
        zzaIN = flag;
        zzaIO = arraylist3;
        zzaIP = arraylist4;
        zzaIQ = arraylist5;
        zzaIR = loyaltypoints;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccountId()
    {
        return zzaIz;
    }

    public String getAccountName()
    {
        return zzate;
    }

    public String getBarcodeAlternateText()
    {
        return zzaIC;
    }

    public String getBarcodeType()
    {
        return zzaID;
    }

    public String getBarcodeValue()
    {
        return zzaIE;
    }

    public String getId()
    {
        return zzga;
    }

    public String getIssuerName()
    {
        return zzaIA;
    }

    public String getProgramName()
    {
        return zzaIB;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzj.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzj();
    int state;
    String zzaIA;
    String zzaIB;
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
    LoyaltyPoints zzaIR;
    String zzaIz;
    String zzate;
    String zzga;
    private final int zzzH;

}
