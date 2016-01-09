// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.*;

// Referenced classes of package com.google.android.gms.location:
//            zza, Geofence

public class GeofencingRequest
    implements SafeParcelable
{
    public static final class Builder
    {

        public static int zzfx(int i)
        {
            return i & 7;
        }

        public Builder addGeofence(Geofence geofence)
        {
            zzv.zzb(geofence, "geofence can't be null.");
            zzv.zzb(geofence instanceof ParcelableGeofence, "Geofence must be created using Geofence.Builder.");
            zzapT.add((ParcelableGeofence)geofence);
            return this;
        }

        public Builder addGeofences(List list)
        {
            if(list != null && !list.isEmpty())
            {
                list = list.iterator();
                while(list.hasNext()) 
                {
                    Geofence geofence = (Geofence)list.next();
                    if(geofence != null)
                        addGeofence(geofence);
                }
            }
            return this;
        }

        public GeofencingRequest build()
        {
            boolean flag;
            if(!zzapT.isEmpty())
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "No geofence has been added to this request.");
            return new GeofencingRequest(zzapT, zzapU);
        }

        public Builder setInitialTrigger(int i)
        {
            zzapU = zzfx(i);
            return this;
        }

        private final List zzapT = new ArrayList();
        private int zzapU;

        public Builder()
        {
            zzapU = 5;
        }
    }


    GeofencingRequest(int i, List list, int j)
    {
        zzzH = i;
        zzapT = list;
        zzapU = j;
    }

    private GeofencingRequest(List list, int i)
    {
        this(1, list, i);
    }


    public int describeContents()
    {
        return 0;
    }

    public List getGeofences()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(zzapT);
        return arraylist;
    }

    public int getInitialTrigger()
    {
        return zzapU;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

    public List zzsz()
    {
        return zzapT;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    public static final int INITIAL_TRIGGER_DWELL = 4;
    public static final int INITIAL_TRIGGER_ENTER = 1;
    public static final int INITIAL_TRIGGER_EXIT = 2;
    private final List zzapT;
    private final int zzapU;
    private final int zzzH;

}
