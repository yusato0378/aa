// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.fitness.data.Field;
import com.google.android.gms.internal.zziz;
import java.util.*;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzi

public class DataTypeCreateRequest
    implements SafeParcelable
{
    public static class Builder
    {

        static String zza(Builder builder)
        {
            return builder.mName;
        }

        static List zzb(Builder builder)
        {
            return builder.zzadn;
        }

        public Builder addField(Field field)
        {
            if(!zzadn.contains(field))
                zzadn.add(field);
            return this;
        }

        public Builder addField(String s, int i)
        {
            boolean flag;
            if(s != null && !s.isEmpty())
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Invalid name specified");
            return addField(Field.zzm(s, i));
        }

        public DataTypeCreateRequest build()
        {
            boolean flag1 = true;
            boolean flag;
            if(mName != null)
                flag = true;
            else
                flag = false;
            zzv.zza(flag, "Must set the name");
            if(!zzadn.isEmpty())
                flag = flag1;
            else
                flag = false;
            zzv.zza(flag, "Must specify the data fields");
            return new DataTypeCreateRequest(this);
        }

        public Builder setName(String s)
        {
            mName = s;
            return this;
        }

        private String mName;
        private List zzadn;

        public Builder()
        {
            zzadn = new ArrayList();
        }
    }


    DataTypeCreateRequest(int i, String s, List list, IBinder ibinder, String s1)
    {
        zzzH = i;
        mName = s;
        zzadn = Collections.unmodifiableList(list);
        if(ibinder == null)
            s = null;
        else
            s = com.google.android.gms.internal.zziz.zza.zzaF(ibinder);
        zzafe = s;
        zzJd = s1;
    }

    private DataTypeCreateRequest(Builder builder)
    {
        this(Builder.zza(builder), Builder.zzb(builder), null, null);
    }


    public DataTypeCreateRequest(DataTypeCreateRequest datatypecreaterequest, zziz zziz1, String s)
    {
        this(datatypecreaterequest.mName, datatypecreaterequest.zzadn, zziz1, s);
    }

    public DataTypeCreateRequest(String s, List list, zziz zziz1, String s1)
    {
        zzzH = 2;
        mName = s;
        zzadn = Collections.unmodifiableList(list);
        zzafe = zziz1;
        zzJd = s1;
    }

    private boolean zzb(DataTypeCreateRequest datatypecreaterequest)
    {
        return zzu.equal(mName, datatypecreaterequest.mName) && zzu.equal(zzadn, datatypecreaterequest.zzadn);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof DataTypeCreateRequest) && zzb((DataTypeCreateRequest)obj);
    }

    public List getFields()
    {
        return zzadn;
    }

    public String getName()
    {
        return mName;
    }

    public String getPackageName()
    {
        return zzJd;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            mName, zzadn
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("name", mName).zzg("fields", zzadn).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.zza(this, parcel, i);
    }

    public IBinder zzpf()
    {
        if(zzafe == null)
            return null;
        else
            return zzafe.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzi();
    private final String mName;
    private final String zzJd;
    private final List zzadn;
    private final zziz zzafe;
    private final int zzzH;

}
