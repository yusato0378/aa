// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.*;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnEventResponse

public class zzaz
    implements android.os.Parcelable.Creator
{

    public zzaz()
    {
    }

    static void zza(OnEventResponse oneventresponse, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, oneventresponse.zzzH);
        zzb.zzc(parcel, 2, oneventresponse.zzXh);
        zzb.zza(parcel, 3, oneventresponse.zzZf, i, false);
        zzb.zza(parcel, 5, oneventresponse.zzZg, i, false);
        zzb.zza(parcel, 6, oneventresponse.zzZh, i, false);
        zzb.zza(parcel, 7, oneventresponse.zzZi, i, false);
        zzb.zza(parcel, 8, oneventresponse.zzZj, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzaP(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzco(i);
    }

    public OnEventResponse zzaP(Parcel parcel)
    {
        int i = 0;
        ProgressEvent progressevent = null;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        ChangesAvailableEvent changesavailableevent = null;
        QueryResultEventParcelable queryresulteventparcelable = null;
        CompletionEvent completionevent = null;
        ChangeEvent changeevent = null;
        int j = 0;
        do
            if(parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
                switch(com.google.android.gms.common.internal.safeparcel.zza.zzaV(l))
                {
                case 4: // '\004'
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 3: // '\003'
                    changeevent = (ChangeEvent)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, ChangeEvent.CREATOR);
                    break;

                case 5: // '\005'
                    completionevent = (CompletionEvent)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, CompletionEvent.CREATOR);
                    break;

                case 6: // '\006'
                    queryresulteventparcelable = (QueryResultEventParcelable)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, QueryResultEventParcelable.CREATOR);
                    break;

                case 7: // '\007'
                    changesavailableevent = (ChangesAvailableEvent)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, ChangesAvailableEvent.CREATOR);
                    break;

                case 8: // '\b'
                    progressevent = (ProgressEvent)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, ProgressEvent.CREATOR);
                    break;
                }
            } else
            if(parcel.dataPosition() != k)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            else
                return new OnEventResponse(j, i, changeevent, completionevent, queryresulteventparcelable, changesavailableevent, progressevent);
        while(true);
    }

    public OnEventResponse[] zzco(int i)
    {
        return new OnEventResponse[i];
    }
}
