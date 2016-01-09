// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.personalized:
//            zzb, zza

public class HereContent
    implements SafeParcelable
{
    public static final class Action
        implements SafeParcelable
    {

        public int describeContents()
        {
            zza zza1 = CREATOR;
            return 0;
        }

        public boolean equals(Object obj)
        {
            if(this != obj)
            {
                if(!(obj instanceof Action))
                    return false;
                obj = (Action)obj;
                if(!zzu.equal(zzWn, ((Action) (obj)).zzWn) || !zzu.equal(zzJf, ((Action) (obj)).zzJf))
                    return false;
            }
            return true;
        }

        public String getTitle()
        {
            return zzWn;
        }

        public String getUri()
        {
            return zzJf;
        }

        public int hashCode()
        {
            return zzu.hashCode(new Object[] {
                zzWn, zzJf
            });
        }

        public String toString()
        {
            return zzu.zzq(this).zzg("title", zzWn).zzg("uri", zzJf).toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            zza zza1 = CREATOR;
            zza.zza(this, parcel, i);
        }

        public static final zza CREATOR = new zza();
        private final String zzJf;
        private final String zzWn;
        final int zzzH;


        Action(int i, String s, String s1)
        {
            zzzH = i;
            zzWn = s;
            zzJf = s1;
        }
    }


    HereContent(int i, String s, List list)
    {
        zzzH = i;
        zzath = s;
        zzati = list;
    }

    public int describeContents()
    {
        zzb zzb1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this != obj)
        {
            if(!(obj instanceof HereContent))
                return false;
            obj = (HereContent)obj;
            if(!zzu.equal(zzath, ((HereContent) (obj)).zzath) || !zzu.equal(zzati, ((HereContent) (obj)).zzati))
                return false;
        }
        return true;
    }

    public List getActions()
    {
        return zzati;
    }

    public String getData()
    {
        return zzath;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzath, zzati
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("data", zzath).zzg("actions", zzati).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb zzb1 = CREATOR;
        zzb.zza(this, parcel, i);
    }

    public static final zzb CREATOR = new zzb();
    private final String zzath;
    private final List zzati;
    final int zzzH;

}
