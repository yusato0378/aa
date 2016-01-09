// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            ParcelableEvent, TextInsertedDetails, TextDeletedDetails, ValuesAddedDetails, 
//            ValuesRemovedDetails, ValuesSetDetails, ValueChangedDetails, ReferenceShiftedDetails, 
//            ObjectChangedDetails, FieldChangedDetails

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void zza(ParcelableEvent parcelableevent, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, parcelableevent.zzzH);
        zzb.zza(parcel, 2, parcelableevent.zzBL, false);
        zzb.zza(parcel, 3, parcelableevent.zzFh, false);
        zzb.zzb(parcel, 4, parcelableevent.zzabx, false);
        zzb.zza(parcel, 5, parcelableevent.zzaby);
        zzb.zza(parcel, 6, parcelableevent.zzabr, false);
        zzb.zza(parcel, 7, parcelableevent.zzabB, false);
        zzb.zza(parcel, 8, parcelableevent.zzabC, i, false);
        zzb.zza(parcel, 9, parcelableevent.zzabD, i, false);
        zzb.zza(parcel, 10, parcelableevent.zzabE, i, false);
        zzb.zza(parcel, 11, parcelableevent.zzabF, i, false);
        zzb.zza(parcel, 12, parcelableevent.zzabG, i, false);
        zzb.zza(parcel, 13, parcelableevent.zzabH, i, false);
        zzb.zza(parcel, 14, parcelableevent.zzabI, i, false);
        zzb.zza(parcel, 15, parcelableevent.zzabJ, i, false);
        zzb.zza(parcel, 17, parcelableevent.zzabA);
        zzb.zza(parcel, 16, parcelableevent.zzabz);
        zzb.zza(parcel, 18, parcelableevent.zzabK, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzbL(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzdl(i);
    }

    public ParcelableEvent zzbL(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        String s3 = null;
        String s2 = null;
        java.util.ArrayList arraylist = null;
        boolean flag2 = false;
        boolean flag1 = false;
        boolean flag = false;
        String s1 = null;
        String s = null;
        TextInsertedDetails textinserteddetails = null;
        TextDeletedDetails textdeleteddetails = null;
        ValuesAddedDetails valuesaddeddetails = null;
        ValuesRemovedDetails valuesremoveddetails = null;
        ValuesSetDetails valuessetdetails = null;
        ValueChangedDetails valuechangeddetails = null;
        ReferenceShiftedDetails referenceshifteddetails = null;
        ObjectChangedDetails objectchangeddetails = null;
        FieldChangedDetails fieldchangeddetails = null;
        do
            if(parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
                switch(com.google.android.gms.common.internal.safeparcel.zza.zzaV(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 3: // '\003'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel, k);
                    break;

                case 5: // '\005'
                    flag2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 8: // '\b'
                    textinserteddetails = (TextInsertedDetails)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, TextInsertedDetails.CREATOR);
                    break;

                case 9: // '\t'
                    textdeleteddetails = (TextDeletedDetails)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, TextDeletedDetails.CREATOR);
                    break;

                case 10: // '\n'
                    valuesaddeddetails = (ValuesAddedDetails)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, ValuesAddedDetails.CREATOR);
                    break;

                case 11: // '\013'
                    valuesremoveddetails = (ValuesRemovedDetails)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, ValuesRemovedDetails.CREATOR);
                    break;

                case 12: // '\f'
                    valuessetdetails = (ValuesSetDetails)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, ValuesSetDetails.CREATOR);
                    break;

                case 13: // '\r'
                    valuechangeddetails = (ValueChangedDetails)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, ValueChangedDetails.CREATOR);
                    break;

                case 14: // '\016'
                    referenceshifteddetails = (ReferenceShiftedDetails)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, ReferenceShiftedDetails.CREATOR);
                    break;

                case 15: // '\017'
                    objectchangeddetails = (ObjectChangedDetails)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, ObjectChangedDetails.CREATOR);
                    break;

                case 17: // '\021'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 16: // '\020'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 18: // '\022'
                    fieldchangeddetails = (FieldChangedDetails)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, FieldChangedDetails.CREATOR);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new ParcelableEvent(i, s3, s2, arraylist, flag2, flag1, flag, s1, s, textinserteddetails, textdeleteddetails, valuesaddeddetails, valuesremoveddetails, valuessetdetails, valuechangeddetails, referenceshifteddetails, objectchangeddetails, fieldchangeddetails);
        while(true);
    }

    public ParcelableEvent[] zzdl(int i)
    {
        return new ParcelableEvent[i];
    }
}
