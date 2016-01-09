// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.events.*;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzaz

public class OnEventResponse
    implements SafeParcelable
{

    OnEventResponse(int i, int j, ChangeEvent changeevent, CompletionEvent completionevent, QueryResultEventParcelable queryresulteventparcelable, ChangesAvailableEvent changesavailableevent, ProgressEvent progressevent)
    {
        zzzH = i;
        zzXh = j;
        zzZf = changeevent;
        zzZg = completionevent;
        zzZh = queryresulteventparcelable;
        zzZi = changesavailableevent;
        zzZj = progressevent;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzaz.zza(this, parcel, i);
    }

    public DriveEvent zzob()
    {
        switch(zzXh)
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unexpected event type ").append(zzXh).toString());

        case 1: // '\001'
            return zzZf;

        case 2: // '\002'
            return zzZg;

        case 3: // '\003'
            return zzZh;

        case 4: // '\004'
            return zzZi;

        case 5: // '\005'
            return zzZj;
        }
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzaz();
    final int zzXh;
    final ChangeEvent zzZf;
    final CompletionEvent zzZg;
    final QueryResultEventParcelable zzZh;
    final ChangesAvailableEvent zzZi;
    final ProgressEvent zzZj;
    final int zzzH;

}
