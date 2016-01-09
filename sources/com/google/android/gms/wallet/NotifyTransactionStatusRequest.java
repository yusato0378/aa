// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.wallet:
//            zzm

public final class NotifyTransactionStatusRequest
    implements SafeParcelable
{
    public final class Builder
    {

        public NotifyTransactionStatusRequest build()
        {
            boolean flag1 = true;
            boolean flag;
            if(!TextUtils.isEmpty(zzaJj.zzaHZ))
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "googleTransactionId is required");
            if(zzaJj.status >= 1 && zzaJj.status <= 8)
                flag = flag1;
            else
                flag = false;
            zzv.zzb(flag, "status is an unrecognized value");
            return zzaJj;
        }

        public Builder setDetailedReason(String s)
        {
            zzaJj.zzaJi = s;
            return this;
        }

        public Builder setGoogleTransactionId(String s)
        {
            zzaJj.zzaHZ = s;
            return this;
        }

        public Builder setStatus(int i)
        {
            zzaJj.status = i;
            return this;
        }

        final NotifyTransactionStatusRequest zzaJj;

        private Builder()
        {
            zzaJj = NotifyTransactionStatusRequest.this;
            super();
        }

    }

    public static interface Status
    {

        public static final int SUCCESS = 1;
    }

    public static interface Status.Error
    {

        public static final int AVS_DECLINE = 7;
        public static final int BAD_CARD = 4;
        public static final int BAD_CVC = 3;
        public static final int DECLINED = 5;
        public static final int FRAUD_DECLINE = 8;
        public static final int OTHER = 6;
        public static final int UNKNOWN = 2;
    }


    NotifyTransactionStatusRequest()
    {
        zzzH = 1;
    }

    NotifyTransactionStatusRequest(int i, String s, int j, String s1)
    {
        zzzH = i;
        zzaHZ = s;
        status = j;
        zzaJi = s1;
    }

    public static Builder newBuilder()
    {
        NotifyTransactionStatusRequest notifytransactionstatusrequest = new NotifyTransactionStatusRequest();
        notifytransactionstatusrequest.getClass();
        return notifytransactionstatusrequest. new Builder();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getDetailedReason()
    {
        return zzaJi;
    }

    public String getGoogleTransactionId()
    {
        return zzaHZ;
    }

    public int getStatus()
    {
        return status;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzm.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzm();
    int status;
    String zzaHZ;
    String zzaJi;
    final int zzzH;

}
