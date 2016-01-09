// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness;

import android.content.*;
import android.content.pm.*;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import java.util.concurrent.TimeUnit;

public interface HistoryApi
{
    public static class ViewIntentBuilder
    {

        private Intent zzi(Intent intent)
        {
            if(zzacF != null)
            {
                Intent intent1 = (new Intent(intent)).setPackage(zzacF);
                ResolveInfo resolveinfo = mContext.getPackageManager().resolveActivity(intent1, 0);
                if(resolveinfo != null)
                {
                    intent = resolveinfo.activityInfo.name;
                    intent1.setComponent(new ComponentName(zzacF, intent));
                    return intent1;
                }
            }
            return intent;
        }

        public Intent build()
        {
            boolean flag1 = true;
            Intent intent;
            boolean flag;
            if(zzGX > 0L)
                flag = true;
            else
                flag = false;
            zzv.zza(flag, "Start time must be set");
            if(zzacE > zzGX)
                flag = flag1;
            else
                flag = false;
            zzv.zza(flag, "End time must be set and after start time");
            intent = new Intent("vnd.google.fitness.VIEW");
            intent.setType(DataType.getMimeType(zzacD.getDataType()));
            intent.putExtra("vnd.google.fitness.start_time", zzGX);
            intent.putExtra("vnd.google.fitness.end_time", zzacE);
            zzc.zza(zzacD, intent, "vnd.google.fitness.data_source");
            return zzi(intent);
        }

        public ViewIntentBuilder setDataSource(DataSource datasource)
        {
            zzv.zzb(datasource.getDataType().equals(zzacC), "Data source %s is not for the data type %s", new Object[] {
                datasource, zzacC
            });
            zzacD = datasource;
            return this;
        }

        public ViewIntentBuilder setPreferredApplication(String s)
        {
            zzacF = s;
            return this;
        }

        public ViewIntentBuilder setTimeInterval(long l, long l1, TimeUnit timeunit)
        {
            zzGX = timeunit.toMillis(l);
            zzacE = timeunit.toMillis(l1);
            return this;
        }

        private final Context mContext;
        private long zzGX;
        private final DataType zzacC;
        private DataSource zzacD;
        private long zzacE;
        private String zzacF;

        public ViewIntentBuilder(Context context, DataType datatype)
        {
            mContext = context;
            zzacC = datatype;
        }
    }


    public abstract PendingResult deleteData(GoogleApiClient googleapiclient, DataDeleteRequest datadeleterequest);

    public abstract PendingResult insertData(GoogleApiClient googleapiclient, DataSet dataset);

    public abstract PendingResult readDailyTotal(GoogleApiClient googleapiclient, DataType datatype);

    public abstract PendingResult readData(GoogleApiClient googleapiclient, DataReadRequest datareadrequest);
}
