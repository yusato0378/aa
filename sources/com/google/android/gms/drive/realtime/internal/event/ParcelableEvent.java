// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            zzc, TextInsertedDetails, TextDeletedDetails, ValuesAddedDetails, 
//            ValuesRemovedDetails, ValuesSetDetails, ValueChangedDetails, ReferenceShiftedDetails, 
//            ObjectChangedDetails, FieldChangedDetails

public class ParcelableEvent
    implements SafeParcelable
{

    ParcelableEvent(int i, String s, String s1, List list, boolean flag, boolean flag1, boolean flag2, 
            String s2, String s3, TextInsertedDetails textinserteddetails, TextDeletedDetails textdeleteddetails, ValuesAddedDetails valuesaddeddetails, ValuesRemovedDetails valuesremoveddetails, ValuesSetDetails valuessetdetails, 
            ValueChangedDetails valuechangeddetails, ReferenceShiftedDetails referenceshifteddetails, ObjectChangedDetails objectchangeddetails, FieldChangedDetails fieldchangeddetails)
    {
        zzzH = i;
        zzBL = s;
        zzFh = s1;
        zzabx = list;
        zzaby = flag;
        zzabz = flag1;
        zzabA = flag2;
        zzabr = s2;
        zzabB = s3;
        zzabC = textinserteddetails;
        zzabD = textdeleteddetails;
        zzabE = valuesaddeddetails;
        zzabF = valuesremoveddetails;
        zzabG = valuessetdetails;
        zzabH = valuechangeddetails;
        zzabI = referenceshifteddetails;
        zzabJ = objectchangeddetails;
        zzabK = fieldchangeddetails;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    final String zzBL;
    final String zzFh;
    final boolean zzabA;
    final String zzabB;
    final TextInsertedDetails zzabC;
    final TextDeletedDetails zzabD;
    final ValuesAddedDetails zzabE;
    final ValuesRemovedDetails zzabF;
    final ValuesSetDetails zzabG;
    final ValueChangedDetails zzabH;
    final ReferenceShiftedDetails zzabI;
    final ObjectChangedDetails zzabJ;
    final FieldChangedDetails zzabK;
    final String zzabr;
    final List zzabx;
    final boolean zzaby;
    final boolean zzabz;
    final int zzzH;

}
