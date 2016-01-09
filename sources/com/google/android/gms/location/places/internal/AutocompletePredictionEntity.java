// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.location.places.AutocompletePrediction;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zza, zzr

public class AutocompletePredictionEntity
    implements SafeParcelable, AutocompletePrediction
{
    public static class SubstringEntity
        implements SafeParcelable, com.google.android.gms.location.places.AutocompletePrediction.Substring
    {

        public int describeContents()
        {
            return 0;
        }

        public boolean equals(Object obj)
        {
            if(this != obj)
            {
                if(!(obj instanceof SubstringEntity))
                    return false;
                obj = (SubstringEntity)obj;
                if(!zzu.equal(Integer.valueOf(mOffset), Integer.valueOf(((SubstringEntity) (obj)).mOffset)) || !zzu.equal(Integer.valueOf(mLength), Integer.valueOf(((SubstringEntity) (obj)).mLength)))
                    return false;
            }
            return true;
        }

        public int getLength()
        {
            return mLength;
        }

        public int getOffset()
        {
            return mOffset;
        }

        public int hashCode()
        {
            return zzu.hashCode(new Object[] {
                Integer.valueOf(mOffset), Integer.valueOf(mLength)
            });
        }

        public String toString()
        {
            return zzu.zzq(this).zzg("offset", Integer.valueOf(mOffset)).zzg("length", Integer.valueOf(mLength)).toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            zzr.zza(this, parcel, i);
        }

        public static final android.os.Parcelable.Creator CREATOR = new zzr();
        final int mLength;
        final int mOffset;
        final int zzzH;


        public SubstringEntity(int i, int j, int k)
        {
            zzzH = i;
            mOffset = j;
            mLength = k;
        }
    }


    AutocompletePredictionEntity(int i, String s, String s1, List list, List list1, int j)
    {
        zzzH = i;
        zzadH = s;
        zzarP = s1;
        zzarx = list;
        zzasj = list1;
        zzask = j;
    }

    public static AutocompletePredictionEntity zza(String s, String s1, List list, List list1, int i)
    {
        return new AutocompletePredictionEntity(0, (String)zzv.zzr(s), s1, list, list1, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this != obj)
        {
            if(!(obj instanceof AutocompletePredictionEntity))
                return false;
            obj = (AutocompletePredictionEntity)obj;
            if(!zzu.equal(zzadH, ((AutocompletePredictionEntity) (obj)).zzadH) || !zzu.equal(zzarP, ((AutocompletePredictionEntity) (obj)).zzarP) || !zzu.equal(zzarx, ((AutocompletePredictionEntity) (obj)).zzarx) || !zzu.equal(zzasj, ((AutocompletePredictionEntity) (obj)).zzasj) || !zzu.equal(Integer.valueOf(zzask), Integer.valueOf(((AutocompletePredictionEntity) (obj)).zzask)))
                return false;
        }
        return true;
    }

    public Object freeze()
    {
        return zzsW();
    }

    public String getDescription()
    {
        return zzadH;
    }

    public List getMatchedSubstrings()
    {
        return zzasj;
    }

    public String getPlaceId()
    {
        return zzarP;
    }

    public List getPlaceTypes()
    {
        return zzarx;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzadH, zzarP, zzarx, zzasj, Integer.valueOf(zzask)
        });
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("description", zzadH).zzg("placeId", zzarP).zzg("placeTypes", zzarx).zzg("substrings", zzasj).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.location.places.internal.zza.zza(this, parcel, i);
    }

    public AutocompletePrediction zzsW()
    {
        return this;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    final String zzadH;
    final String zzarP;
    final List zzarx;
    final List zzasj;
    final int zzask;
    final int zzzH;

}
