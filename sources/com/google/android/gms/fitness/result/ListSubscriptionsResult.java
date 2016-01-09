// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import java.util.*;

// Referenced classes of package com.google.android.gms.fitness.result:
//            zzh

public class ListSubscriptionsResult
    implements Result, SafeParcelable
{

    ListSubscriptionsResult(int i, List list, Status status)
    {
        zzzH = i;
        zzafP = list;
        zzKr = status;
    }

    public ListSubscriptionsResult(List list, Status status)
    {
        zzzH = 3;
        zzafP = Collections.unmodifiableList(list);
        zzKr = (Status)zzv.zzb(status, "status");
    }

    public static ListSubscriptionsResult zzG(Status status)
    {
        return new ListSubscriptionsResult(Collections.emptyList(), status);
    }

    private boolean zzb(ListSubscriptionsResult listsubscriptionsresult)
    {
        return zzKr.equals(listsubscriptionsresult.zzKr) && zzu.equal(zzafP, listsubscriptionsresult.zzafP);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof ListSubscriptionsResult) && zzb((ListSubscriptionsResult)obj);
    }

    public Status getStatus()
    {
        return zzKr;
    }

    public List getSubscriptions()
    {
        return zzafP;
    }

    public List getSubscriptions(DataType datatype)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = zzafP.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Subscription subscription = (Subscription)iterator.next();
            if(datatype.equals(subscription.zzoX()))
                arraylist.add(subscription);
        } while(true);
        return Collections.unmodifiableList(arraylist);
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzKr, zzafP
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("status", zzKr).zzg("subscriptions", zzafP).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzh();
    private final Status zzKr;
    private final List zzafP;
    private final int zzzH;

}
