// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.*;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzj, zzn, PlaceLocalization

public final class PlaceImpl
    implements SafeParcelable, Place
{
    public static class zza
    {

        public zza zzY(boolean flag)
        {
            zzasC = flag;
            return this;
        }

        public zza zzZ(boolean flag)
        {
            zzasJ = flag;
            return this;
        }

        public zza zza(LatLng latlng)
        {
            zzarw = latlng;
            return this;
        }

        public zza zza(LatLngBounds latlngbounds)
        {
            zzasA = latlngbounds;
            return this;
        }

        public zza zzcK(String s)
        {
            zzGM = s;
            return this;
        }

        public zza zzcL(String s)
        {
            mName = s;
            return this;
        }

        public zza zzcM(String s)
        {
            zzacM = s;
            return this;
        }

        public zza zzcN(String s)
        {
            zzary = s;
            return this;
        }

        public zza zzf(float f)
        {
            zzasz = f;
            return this;
        }

        public zza zzfV(int i)
        {
            zzasE = i;
            return this;
        }

        public zza zzg(float f)
        {
            zzasD = f;
            return this;
        }

        public zza zzk(Uri uri)
        {
            zzarz = uri;
            return this;
        }

        public zza zzn(List list)
        {
            zzasO = list;
            return this;
        }

        public zza zzo(List list)
        {
            zzasI = list;
            return this;
        }

        public PlaceImpl zzth()
        {
            return new PlaceImpl(zzzH, zzGM, zzasO, Collections.emptyList(), zzasN, mName, zzacM, zzary, zzasH, zzasI, zzarw, zzasz, zzasA, zzasB, zzarz, zzasC, zzasD, zzasE, zzasF, zzasJ, PlaceLocalization.zza(mName, zzacM, zzary, zzasH, zzasI));
        }

        private String mName;
        private String zzGM;
        private String zzacM;
        private LatLng zzarw;
        private String zzary;
        private Uri zzarz;
        private LatLngBounds zzasA;
        private String zzasB;
        private boolean zzasC;
        private float zzasD;
        private int zzasE;
        private long zzasF;
        private String zzasH;
        private List zzasI;
        private boolean zzasJ;
        private Bundle zzasN;
        private List zzasO;
        private float zzasz;
        private int zzzH;

        public zza()
        {
            zzzH = 0;
        }
    }


    PlaceImpl(int i, String s, List list, List list1, Bundle bundle, String s1, String s2, 
            String s3, String s4, List list2, LatLng latlng, float f, LatLngBounds latlngbounds, String s5, 
            Uri uri, boolean flag, float f1, int j, long l, boolean flag1, 
            PlaceLocalization placelocalization)
    {
        zzzH = i;
        zzGM = s;
        zzarx = Collections.unmodifiableList(list);
        zzasG = list1;
        if(bundle == null)
            bundle = new Bundle();
        zzasx = bundle;
        mName = s1;
        zzacM = s2;
        zzary = s3;
        zzasH = s4;
        if(list2 == null)
            list2 = Collections.emptyList();
        zzasI = list2;
        zzarw = latlng;
        zzasz = f;
        zzasA = latlngbounds;
        if(s5 == null)
            s5 = "UTC";
        zzasB = s5;
        zzarz = uri;
        zzasC = flag;
        zzasD = f1;
        zzasE = j;
        zzasF = l;
        zzasr = null;
        zzasJ = flag1;
        zzasy = placelocalization;
    }

    private void zzcJ(String s)
    {
        if(zzasJ && zzasM != null)
            zzasM.zzz(zzGM, s);
    }

    public int describeContents()
    {
        zzj zzj1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this != obj)
        {
            if(!(obj instanceof PlaceImpl))
                return false;
            obj = (PlaceImpl)obj;
            if(!zzGM.equals(((PlaceImpl) (obj)).zzGM) || !zzu.equal(zzasr, ((PlaceImpl) (obj)).zzasr) || zzasF != ((PlaceImpl) (obj)).zzasF)
                return false;
        }
        return true;
    }

    public Object freeze()
    {
        return zztg();
    }

    public volatile CharSequence getAddress()
    {
        return getAddress();
    }

    public String getAddress()
    {
        zzcJ("getAddress");
        return zzacM;
    }

    public String getId()
    {
        zzcJ("getId");
        return zzGM;
    }

    public LatLng getLatLng()
    {
        zzcJ("getLatLng");
        return zzarw;
    }

    public Locale getLocale()
    {
        zzcJ("getLocale");
        return zzasr;
    }

    public volatile CharSequence getName()
    {
        return getName();
    }

    public String getName()
    {
        zzcJ("getName");
        return mName;
    }

    public volatile CharSequence getPhoneNumber()
    {
        return getPhoneNumber();
    }

    public String getPhoneNumber()
    {
        zzcJ("getPhoneNumber");
        return zzary;
    }

    public List getPlaceTypes()
    {
        zzcJ("getPlaceTypes");
        return zzarx;
    }

    public int getPriceLevel()
    {
        zzcJ("getPriceLevel");
        return zzasE;
    }

    public float getRating()
    {
        zzcJ("getRating");
        return zzasD;
    }

    public LatLngBounds getViewport()
    {
        zzcJ("getViewport");
        return zzasA;
    }

    public Uri getWebsiteUri()
    {
        zzcJ("getWebsiteUri");
        return zzarz;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzGM, zzasr, Long.valueOf(zzasF)
        });
    }

    public boolean isDataValid()
    {
        return true;
    }

    public void setLocale(Locale locale)
    {
        zzasr = locale;
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("id", zzGM).zzg("placeTypes", zzarx).zzg("locale", zzasr).zzg("name", mName).zzg("address", zzacM).zzg("phoneNumber", zzary).zzg("latlng", zzarw).zzg("viewport", zzasA).zzg("websiteUri", zzarz).zzg("isPermanentlyClosed", Boolean.valueOf(zzasC)).zzg("priceLevel", Integer.valueOf(zzasE)).zzg("timestampSecs", Long.valueOf(zzasF)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzj zzj1 = CREATOR;
        zzj.zza(this, parcel, i);
    }

    public void zza(zzn zzn1)
    {
        zzasM = zzn1;
    }

    public boolean zzsT()
    {
        zzcJ("isPermanentlyClosed");
        return zzasC;
    }

    public List zzsY()
    {
        zzcJ("getTypesDeprecated");
        return zzasG;
    }

    public float zzsZ()
    {
        zzcJ("getLevelNumber");
        return zzasz;
    }

    public String zzta()
    {
        zzcJ("getRegularOpenHours");
        return zzasH;
    }

    public List zztb()
    {
        zzcJ("getAttributions");
        return zzasI;
    }

    public long zztc()
    {
        return zzasF;
    }

    public Bundle zztd()
    {
        return zzasx;
    }

    public String zzte()
    {
        return zzasB;
    }

    public PlaceLocalization zztf()
    {
        zzcJ("getLocalization");
        return zzasy;
    }

    public Place zztg()
    {
        return this;
    }

    public static final zzj CREATOR = new zzj();
    private final String mName;
    private final String zzGM;
    private final String zzacM;
    private final LatLng zzarw;
    private final List zzarx;
    private final String zzary;
    private final Uri zzarz;
    private final LatLngBounds zzasA;
    private final String zzasB;
    private final boolean zzasC;
    private final float zzasD;
    private final int zzasE;
    private final long zzasF;
    private final List zzasG;
    private final String zzasH;
    private final List zzasI;
    final boolean zzasJ;
    private final Map zzasK = Collections.unmodifiableMap(new HashMap());
    private final TimeZone zzasL = null;
    private zzn zzasM;
    private Locale zzasr;
    private final Bundle zzasx;
    private final PlaceLocalization zzasy;
    private final float zzasz;
    final int zzzH;

}
