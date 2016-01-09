// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            zzi

public final class LineItem
    implements SafeParcelable
{
    public final class Builder
    {

        public LineItem build()
        {
            return zzaIy;
        }

        public Builder setCurrencyCode(String s)
        {
            zzaIy.zzaHT = s;
            return this;
        }

        public Builder setDescription(String s)
        {
            zzaIy.description = s;
            return this;
        }

        public Builder setQuantity(String s)
        {
            zzaIy.zzaIv = s;
            return this;
        }

        public Builder setRole(int i)
        {
            zzaIy.zzaIx = i;
            return this;
        }

        public Builder setTotalPrice(String s)
        {
            zzaIy.zzaHS = s;
            return this;
        }

        public Builder setUnitPrice(String s)
        {
            zzaIy.zzaIw = s;
            return this;
        }

        final LineItem zzaIy;

        private Builder()
        {
            zzaIy = LineItem.this;
            super();
        }

    }

    public static interface Role
    {

        public static final int REGULAR = 0;
        public static final int SHIPPING = 2;
        public static final int TAX = 1;
    }


    LineItem()
    {
        zzzH = 1;
        zzaIx = 0;
    }

    LineItem(int i, String s, String s1, String s2, String s3, int j, String s4)
    {
        zzzH = i;
        description = s;
        zzaIv = s1;
        zzaIw = s2;
        zzaHS = s3;
        zzaIx = j;
        zzaHT = s4;
    }

    public static Builder newBuilder()
    {
        LineItem lineitem = new LineItem();
        lineitem.getClass();
        return lineitem. new Builder();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCurrencyCode()
    {
        return zzaHT;
    }

    public String getDescription()
    {
        return description;
    }

    public String getQuantity()
    {
        return zzaIv;
    }

    public int getRole()
    {
        return zzaIx;
    }

    public String getTotalPrice()
    {
        return zzaHS;
    }

    public String getUnitPrice()
    {
        return zzaIw;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzi();
    String description;
    String zzaHS;
    String zzaHT;
    String zzaIv;
    String zzaIw;
    int zzaIx;
    private final int zzzH;

}
