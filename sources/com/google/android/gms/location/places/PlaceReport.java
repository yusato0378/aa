// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.location.places:
//            PlaceReportCreator

public class PlaceReport
    implements SafeParcelable
{

    PlaceReport(int i, String s, String s1, String s2)
    {
        zzzH = i;
        zzarP = s;
        mTag = s1;
        zzarQ = s2;
    }

    public static PlaceReport create(String s, String s1)
    {
        return zzf(s, s1, "unknown");
    }

    private static boolean zzcI(String s)
    {
        byte byte0;
        boolean flag;
        flag = true;
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 5: default 60
    //                   -1436706272: 128
    //                   -1194968642: 114
    //                   -284840886: 100
    //                   -262743844: 156
    //                   1287171955: 142;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        switch(byte0)
        {
        default:
            flag = false;
            // fall through

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            return flag;
        }
_L4:
        if(s.equals("unknown"))
            byte0 = 0;
        continue; /* Loop/switch isn't completed */
_L3:
        if(s.equals("userReported"))
            byte0 = 1;
        continue; /* Loop/switch isn't completed */
_L2:
        if(s.equals("inferredGeofencing"))
            byte0 = 2;
        continue; /* Loop/switch isn't completed */
_L6:
        if(s.equals("inferredRadioSignals"))
            byte0 = 3;
        continue; /* Loop/switch isn't completed */
_L5:
        if(s.equals("inferredReverseGeocoding"))
            byte0 = 4;
        if(true) goto _L1; else goto _L7
_L7:
    }

    public static PlaceReport zzf(String s, String s1, String s2)
    {
        zzv.zzbS(s);
        zzv.zzbS(s1);
        zzv.zzbS(s2);
        zzv.zzb(zzcI(s2), "Invalid source");
        return new PlaceReport(1, s, s1, s2);
    }

    public int describeContents()
    {
        PlaceReportCreator placereportcreator = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(obj instanceof PlaceReport)
            if(zzu.equal(zzarP, ((PlaceReport) (obj = (PlaceReport)obj)).zzarP) && zzu.equal(mTag, ((PlaceReport) (obj)).mTag) && zzu.equal(zzarQ, ((PlaceReport) (obj)).zzarQ))
                return true;
        return false;
    }

    public String getPlaceId()
    {
        return zzarP;
    }

    public String getSource()
    {
        return zzarQ;
    }

    public String getTag()
    {
        return mTag;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzarP, mTag, zzarQ
        });
    }

    public String toString()
    {
        com.google.android.gms.common.internal.zzu.zza zza = zzu.zzq(this);
        zza.zzg("placeId", zzarP);
        zza.zzg("tag", mTag);
        if(!"unknown".equals(zzarQ))
            zza.zzg("source", zzarQ);
        return zza.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PlaceReportCreator placereportcreator = CREATOR;
        PlaceReportCreator.zza(this, parcel, i);
    }

    public static final PlaceReportCreator CREATOR = new PlaceReportCreator();
    private final String mTag;
    private final String zzarP;
    private final String zzarQ;
    final int zzzH;

}
