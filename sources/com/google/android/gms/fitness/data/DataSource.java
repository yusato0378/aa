// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.data;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzf, DataType, Application, Device

public class DataSource
    implements SafeParcelable
{
    public static final class Builder
    {

        static DataType zza(Builder builder)
        {
            return builder.zzacC;
        }

        static int zzb(Builder builder)
        {
            return builder.zzMG;
        }

        static String zzc(Builder builder)
        {
            return builder.mName;
        }

        static Device zzd(Builder builder)
        {
            return builder.zzadb;
        }

        static Application zze(Builder builder)
        {
            return builder.zzadc;
        }

        static String zzf(Builder builder)
        {
            return builder.zzadd;
        }

        public DataSource build()
        {
            boolean flag1 = true;
            boolean flag;
            if(zzacC != null)
                flag = true;
            else
                flag = false;
            zzv.zza(flag, "Must set data type");
            if(zzMG >= 0)
                flag = flag1;
            else
                flag = false;
            zzv.zza(flag, "Must set data source type");
            return new DataSource(this);
        }

        public Builder setAppPackageName(Context context)
        {
            return setAppPackageName(context.getPackageName());
        }

        public Builder setAppPackageName(String s)
        {
            zzadc = Application.zzcm(s);
            return this;
        }

        public Builder setDataType(DataType datatype)
        {
            zzacC = datatype;
            return this;
        }

        public Builder setDevice(Device device)
        {
            zzadb = device;
            return this;
        }

        public Builder setName(String s)
        {
            mName = s;
            return this;
        }

        public Builder setStreamName(String s)
        {
            boolean flag;
            if(s != null)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Must specify a valid stream name");
            zzadd = s;
            return this;
        }

        public Builder setType(int i)
        {
            zzMG = i;
            return this;
        }

        private String mName;
        private int zzMG;
        private DataType zzacC;
        private Device zzadb;
        private Application zzadc;
        private String zzadd;

        public Builder()
        {
            zzMG = -1;
            zzadd = "";
        }
    }


    DataSource(int i, DataType datatype, String s, int j, Device device, Application application, String s1)
    {
        zzzH = i;
        zzacC = datatype;
        zzMG = j;
        mName = s;
        zzadb = device;
        zzadc = application;
        zzadd = s1;
        zzade = zzoN();
    }

    private DataSource(Builder builder)
    {
        zzzH = 3;
        zzacC = Builder.zza(builder);
        zzMG = Builder.zzb(builder);
        mName = com.google.android.gms.fitness.data.Builder.zzc(builder);
        zzadb = Builder.zzd(builder);
        zzadc = Builder.zze(builder);
        zzadd = Builder.zzf(builder);
        zzade = zzoN();
    }


    public static DataSource extract(Intent intent)
    {
        if(intent == null)
            return null;
        else
            return (DataSource)zzc.zza(intent, "vnd.google.fitness.data_source", CREATOR);
    }

    private String getTypeString()
    {
        switch(zzMG)
        {
        default:
            throw new IllegalArgumentException("invalid type value");

        case 0: // '\0'
            return "raw";

        case 1: // '\001'
            return "derived";
        }
    }

    private boolean zza(DataSource datasource)
    {
        return zzade.equals(datasource.zzade);
    }

    private String zzoN()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getTypeString());
        stringbuilder.append(":").append(zzacC.getName());
        if(zzadc != null)
            stringbuilder.append(":").append(zzadc.getPackageName());
        if(zzadb != null)
            stringbuilder.append(":").append(zzadb.getStreamIdentifier());
        if(zzadd != null)
            stringbuilder.append(":").append(zzadd);
        return stringbuilder.toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof DataSource) && zza((DataSource)obj);
    }

    public String getAppPackageName()
    {
        if(zzadc == null)
            return null;
        else
            return zzadc.getPackageName();
    }

    public DataType getDataType()
    {
        return zzacC;
    }

    public Device getDevice()
    {
        return zzadb;
    }

    public String getName()
    {
        return mName;
    }

    public String getStreamIdentifier()
    {
        return zzade;
    }

    public String getStreamName()
    {
        return zzadd;
    }

    public int getType()
    {
        return zzMG;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzade.hashCode();
    }

    public String toDebugString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if(zzMG == 0)
            s = "r";
        else
            s = "d";
        stringbuilder = stringbuilder.append(s).append(":").append(zzacC.zzoO());
        if(zzadc == null)
            s = "";
        else
        if(zzadc.equals(Application.zzacJ))
            s = ":gms";
        else
            s = (new StringBuilder()).append(":").append(zzadc.getPackageName()).toString();
        stringbuilder = stringbuilder.append(s);
        if(zzadb != null)
            s = (new StringBuilder()).append(":").append(zzadb.getModel()).append(":").append(zzadb.getUid()).toString();
        else
            s = "";
        stringbuilder = stringbuilder.append(s);
        if(zzadd != null)
            s = (new StringBuilder()).append(":").append(zzadd).toString();
        else
            s = "";
        return stringbuilder.append(s).toString();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("DataSource{");
        stringbuilder.append(getTypeString());
        if(mName != null)
            stringbuilder.append(":").append(mName);
        if(zzadc != null)
            stringbuilder.append(":").append(zzadc);
        if(zzadb != null)
            stringbuilder.append(":").append(zzadb);
        if(zzadd != null)
            stringbuilder.append(":").append(zzadd);
        stringbuilder.append(":").append(zzacC);
        return stringbuilder.append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf.zza(this, parcel, i);
    }

    public Application zzoM()
    {
        return zzadc;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzf();
    public static final String EXTRA_DATA_SOURCE = "vnd.google.fitness.data_source";
    public static final int TYPE_DERIVED = 1;
    public static final int TYPE_RAW = 0;
    private final String mName;
    private final int zzMG;
    private final DataType zzacC;
    private final Device zzadb;
    private final Application zzadc;
    private final String zzadd;
    private final String zzade;
    private final int zzzH;

}
