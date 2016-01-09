// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.people.Person;
import java.util.*;

// Referenced classes of package com.google.android.gms.plus.internal.model.people:
//            zza, zzb, zzc, zzd, 
//            zze, zzf, zzg, zzh, 
//            zzi, zzj

public final class PersonEntity extends FastSafeParcelableJsonResponse
    implements Person
{
    public static final class AgeRangeEntity extends FastSafeParcelableJsonResponse
        implements com.google.android.gms.plus.model.people.Person.AgeRange
    {

        public int describeContents()
        {
            zzb zzb1 = CREATOR;
            return 0;
        }

        public boolean equals(Object obj)
        {
label0:
            {
                if(!(obj instanceof AgeRangeEntity))
                    return false;
                if(this == obj)
                    return true;
                obj = (AgeRangeEntity)obj;
                com.google.android.gms.common.server.response.FastJsonResponse.Field field;
label1:
                do
                {
                    for(Iterator iterator = zzazC.values().iterator(); iterator.hasNext();)
                    {
                        field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                        if(!zza(field))
                            continue label1;
                        if(((AgeRangeEntity) (obj)).zza(field))
                        {
                            if(!zzb(field).equals(((AgeRangeEntity) (obj)).zzb(field)))
                                return false;
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while(!((AgeRangeEntity) (obj)).zza(field));
                return false;
            }
            return true;
        }

        public Object freeze()
        {
            return zzvQ();
        }

        public int getMax()
        {
            return zzaAU;
        }

        public int getMin()
        {
            return zzaAV;
        }

        public boolean hasMax()
        {
            return zzazD.contains(Integer.valueOf(2));
        }

        public boolean hasMin()
        {
            return zzazD.contains(Integer.valueOf(3));
        }

        public int hashCode()
        {
            Iterator iterator = zzazC.values().iterator();
            int i = 0;
            do
            {
                if(!iterator.hasNext())
                    break;
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if(zza(field))
                {
                    int j = field.zzmF();
                    i = zzb(field).hashCode() + (i + j);
                }
            } while(true);
            return i;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            zzb zzb1 = CREATOR;
            com.google.android.gms.plus.internal.model.people.zzb.zza(this, parcel, i);
        }

        protected boolean zza(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return zzazD.contains(Integer.valueOf(field.zzmF()));
        }

        protected Object zzb(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch(field.zzmF())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(field.zzmF()).toString());

            case 2: // '\002'
                return Integer.valueOf(zzaAU);

            case 3: // '\003'
                return Integer.valueOf(zzaAV);
            }
        }

        public Map zzmy()
        {
            return zzvL();
        }

        public HashMap zzvL()
        {
            return zzazC;
        }

        public AgeRangeEntity zzvQ()
        {
            return this;
        }

        public static final zzb CREATOR = new zzb();
        private static final HashMap zzazC;
        int zzaAU;
        int zzaAV;
        final Set zzazD;
        final int zzzH;

        static 
        {
            zzazC = new HashMap();
            zzazC.put("max", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzh("max", 2));
            zzazC.put("min", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzh("min", 3));
        }

        public AgeRangeEntity()
        {
            zzzH = 1;
            zzazD = new HashSet();
        }

        AgeRangeEntity(Set set, int i, int j, int k)
        {
            zzazD = set;
            zzzH = i;
            zzaAU = j;
            zzaAV = k;
        }
    }

    public static final class CoverEntity extends FastSafeParcelableJsonResponse
        implements com.google.android.gms.plus.model.people.Person.Cover
    {

        public int describeContents()
        {
            zzc zzc1 = CREATOR;
            return 0;
        }

        public boolean equals(Object obj)
        {
label0:
            {
                if(!(obj instanceof CoverEntity))
                    return false;
                if(this == obj)
                    return true;
                obj = (CoverEntity)obj;
                com.google.android.gms.common.server.response.FastJsonResponse.Field field;
label1:
                do
                {
                    for(Iterator iterator = zzazC.values().iterator(); iterator.hasNext();)
                    {
                        field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                        if(!zza(field))
                            continue label1;
                        if(((CoverEntity) (obj)).zza(field))
                        {
                            if(!zzb(field).equals(((CoverEntity) (obj)).zzb(field)))
                                return false;
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while(!((CoverEntity) (obj)).zza(field));
                return false;
            }
            return true;
        }

        public Object freeze()
        {
            return zzvR();
        }

        public com.google.android.gms.plus.model.people.Person.Cover.CoverInfo getCoverInfo()
        {
            return zzaAW;
        }

        public com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto getCoverPhoto()
        {
            return zzaAX;
        }

        public int getLayout()
        {
            return zzaAY;
        }

        public boolean hasCoverInfo()
        {
            return zzazD.contains(Integer.valueOf(2));
        }

        public boolean hasCoverPhoto()
        {
            return zzazD.contains(Integer.valueOf(3));
        }

        public boolean hasLayout()
        {
            return zzazD.contains(Integer.valueOf(4));
        }

        public int hashCode()
        {
            Iterator iterator = zzazC.values().iterator();
            int i = 0;
            do
            {
                if(!iterator.hasNext())
                    break;
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if(zza(field))
                {
                    int j = field.zzmF();
                    i = zzb(field).hashCode() + (i + j);
                }
            } while(true);
            return i;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            zzc zzc1 = CREATOR;
            zzc.zza(this, parcel, i);
        }

        protected boolean zza(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return zzazD.contains(Integer.valueOf(field.zzmF()));
        }

        protected Object zzb(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch(field.zzmF())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(field.zzmF()).toString());

            case 2: // '\002'
                return zzaAW;

            case 3: // '\003'
                return zzaAX;

            case 4: // '\004'
                return Integer.valueOf(zzaAY);
            }
        }

        public Map zzmy()
        {
            return zzvL();
        }

        public HashMap zzvL()
        {
            return zzazC;
        }

        public CoverEntity zzvR()
        {
            return this;
        }

        public static final zzc CREATOR = new zzc();
        private static final HashMap zzazC;
        CoverInfoEntity zzaAW;
        CoverPhotoEntity zzaAX;
        int zzaAY;
        final Set zzazD;
        final int zzzH;

        static 
        {
            zzazC = new HashMap();
            zzazC.put("coverInfo", com.google.android.gms.common.server.response.FastJsonResponse.Field.zza("coverInfo", 2, com/google/android/gms/plus/internal/model/people/PersonEntity$CoverEntity$CoverInfoEntity));
            zzazC.put("coverPhoto", com.google.android.gms.common.server.response.FastJsonResponse.Field.zza("coverPhoto", 3, com/google/android/gms/plus/internal/model/people/PersonEntity$CoverEntity$CoverPhotoEntity));
            zzazC.put("layout", com.google.android.gms.common.server.response.FastJsonResponse.Field.zza("layout", 4, (new StringToIntConverter()).zzg("banner", 0), false));
        }

        public CoverEntity()
        {
            zzzH = 1;
            zzazD = new HashSet();
        }

        CoverEntity(Set set, int i, CoverInfoEntity coverinfoentity, CoverPhotoEntity coverphotoentity, int j)
        {
            zzazD = set;
            zzzH = i;
            zzaAW = coverinfoentity;
            zzaAX = coverphotoentity;
            zzaAY = j;
        }
    }

    public static final class CoverEntity.CoverInfoEntity extends FastSafeParcelableJsonResponse
        implements com.google.android.gms.plus.model.people.Person.Cover.CoverInfo
    {

        public int describeContents()
        {
            zzd zzd1 = CREATOR;
            return 0;
        }

        public boolean equals(Object obj)
        {
label0:
            {
                if(!(obj instanceof CoverEntity.CoverInfoEntity))
                    return false;
                if(this == obj)
                    return true;
                obj = (CoverEntity.CoverInfoEntity)obj;
                com.google.android.gms.common.server.response.FastJsonResponse.Field field;
label1:
                do
                {
                    for(Iterator iterator = zzazC.values().iterator(); iterator.hasNext();)
                    {
                        field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                        if(!zza(field))
                            continue label1;
                        if(((CoverEntity.CoverInfoEntity) (obj)).zza(field))
                        {
                            if(!zzb(field).equals(((CoverEntity.CoverInfoEntity) (obj)).zzb(field)))
                                return false;
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while(!((CoverEntity.CoverInfoEntity) (obj)).zza(field));
                return false;
            }
            return true;
        }

        public Object freeze()
        {
            return zzvS();
        }

        public int getLeftImageOffset()
        {
            return zzaAZ;
        }

        public int getTopImageOffset()
        {
            return zzaBa;
        }

        public boolean hasLeftImageOffset()
        {
            return zzazD.contains(Integer.valueOf(2));
        }

        public boolean hasTopImageOffset()
        {
            return zzazD.contains(Integer.valueOf(3));
        }

        public int hashCode()
        {
            Iterator iterator = zzazC.values().iterator();
            int i = 0;
            do
            {
                if(!iterator.hasNext())
                    break;
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if(zza(field))
                {
                    int j = field.zzmF();
                    i = zzb(field).hashCode() + (i + j);
                }
            } while(true);
            return i;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            zzd zzd1 = CREATOR;
            zzd.zza(this, parcel, i);
        }

        protected boolean zza(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return zzazD.contains(Integer.valueOf(field.zzmF()));
        }

        protected Object zzb(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch(field.zzmF())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(field.zzmF()).toString());

            case 2: // '\002'
                return Integer.valueOf(zzaAZ);

            case 3: // '\003'
                return Integer.valueOf(zzaBa);
            }
        }

        public Map zzmy()
        {
            return zzvL();
        }

        public HashMap zzvL()
        {
            return zzazC;
        }

        public CoverEntity.CoverInfoEntity zzvS()
        {
            return this;
        }

        public static final zzd CREATOR = new zzd();
        private static final HashMap zzazC;
        int zzaAZ;
        int zzaBa;
        final Set zzazD;
        final int zzzH;

        static 
        {
            zzazC = new HashMap();
            zzazC.put("leftImageOffset", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzh("leftImageOffset", 2));
            zzazC.put("topImageOffset", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzh("topImageOffset", 3));
        }

        public CoverEntity.CoverInfoEntity()
        {
            zzzH = 1;
            zzazD = new HashSet();
        }

        CoverEntity.CoverInfoEntity(Set set, int i, int j, int k)
        {
            zzazD = set;
            zzzH = i;
            zzaAZ = j;
            zzaBa = k;
        }
    }

    public static final class CoverEntity.CoverPhotoEntity extends FastSafeParcelableJsonResponse
        implements com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto
    {

        public int describeContents()
        {
            zze zze1 = CREATOR;
            return 0;
        }

        public boolean equals(Object obj)
        {
label0:
            {
                if(!(obj instanceof CoverEntity.CoverPhotoEntity))
                    return false;
                if(this == obj)
                    return true;
                obj = (CoverEntity.CoverPhotoEntity)obj;
                com.google.android.gms.common.server.response.FastJsonResponse.Field field;
label1:
                do
                {
                    for(Iterator iterator = zzazC.values().iterator(); iterator.hasNext();)
                    {
                        field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                        if(!zza(field))
                            continue label1;
                        if(((CoverEntity.CoverPhotoEntity) (obj)).zza(field))
                        {
                            if(!zzb(field).equals(((CoverEntity.CoverPhotoEntity) (obj)).zzb(field)))
                                return false;
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while(!((CoverEntity.CoverPhotoEntity) (obj)).zza(field));
                return false;
            }
            return true;
        }

        public Object freeze()
        {
            return zzvT();
        }

        public int getHeight()
        {
            return zzmb;
        }

        public String getUrl()
        {
            return zzAX;
        }

        public int getWidth()
        {
            return zzma;
        }

        public boolean hasHeight()
        {
            return zzazD.contains(Integer.valueOf(2));
        }

        public boolean hasUrl()
        {
            return zzazD.contains(Integer.valueOf(3));
        }

        public boolean hasWidth()
        {
            return zzazD.contains(Integer.valueOf(4));
        }

        public int hashCode()
        {
            Iterator iterator = zzazC.values().iterator();
            int i = 0;
            do
            {
                if(!iterator.hasNext())
                    break;
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if(zza(field))
                {
                    int j = field.zzmF();
                    i = zzb(field).hashCode() + (i + j);
                }
            } while(true);
            return i;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            zze zze1 = CREATOR;
            zze.zza(this, parcel, i);
        }

        protected boolean zza(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return zzazD.contains(Integer.valueOf(field.zzmF()));
        }

        protected Object zzb(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch(field.zzmF())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(field.zzmF()).toString());

            case 2: // '\002'
                return Integer.valueOf(zzmb);

            case 3: // '\003'
                return zzAX;

            case 4: // '\004'
                return Integer.valueOf(zzma);
            }
        }

        public Map zzmy()
        {
            return zzvL();
        }

        public HashMap zzvL()
        {
            return zzazC;
        }

        public CoverEntity.CoverPhotoEntity zzvT()
        {
            return this;
        }

        public static final zze CREATOR = new zze();
        private static final HashMap zzazC;
        String zzAX;
        final Set zzazD;
        int zzma;
        int zzmb;
        final int zzzH;

        static 
        {
            zzazC = new HashMap();
            zzazC.put("height", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzh("height", 2));
            zzazC.put("url", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("url", 3));
            zzazC.put("width", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzh("width", 4));
        }

        public CoverEntity.CoverPhotoEntity()
        {
            zzzH = 1;
            zzazD = new HashSet();
        }

        CoverEntity.CoverPhotoEntity(Set set, int i, int j, String s, int k)
        {
            zzazD = set;
            zzzH = i;
            zzmb = j;
            zzAX = s;
            zzma = k;
        }
    }

    public static final class ImageEntity extends FastSafeParcelableJsonResponse
        implements com.google.android.gms.plus.model.people.Person.Image
    {

        public int describeContents()
        {
            zzf zzf1 = CREATOR;
            return 0;
        }

        public boolean equals(Object obj)
        {
label0:
            {
                if(!(obj instanceof ImageEntity))
                    return false;
                if(this == obj)
                    return true;
                obj = (ImageEntity)obj;
                com.google.android.gms.common.server.response.FastJsonResponse.Field field;
label1:
                do
                {
                    for(Iterator iterator = zzazC.values().iterator(); iterator.hasNext();)
                    {
                        field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                        if(!zza(field))
                            continue label1;
                        if(((ImageEntity) (obj)).zza(field))
                        {
                            if(!zzb(field).equals(((ImageEntity) (obj)).zzb(field)))
                                return false;
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while(!((ImageEntity) (obj)).zza(field));
                return false;
            }
            return true;
        }

        public Object freeze()
        {
            return zzvU();
        }

        public String getUrl()
        {
            return zzAX;
        }

        public boolean hasUrl()
        {
            return zzazD.contains(Integer.valueOf(2));
        }

        public int hashCode()
        {
            Iterator iterator = zzazC.values().iterator();
            int i = 0;
            do
            {
                if(!iterator.hasNext())
                    break;
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if(zza(field))
                {
                    int j = field.zzmF();
                    i = zzb(field).hashCode() + (i + j);
                }
            } while(true);
            return i;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            zzf zzf1 = CREATOR;
            zzf.zza(this, parcel, i);
        }

        protected boolean zza(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return zzazD.contains(Integer.valueOf(field.zzmF()));
        }

        protected Object zzb(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch(field.zzmF())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(field.zzmF()).toString());

            case 2: // '\002'
                return zzAX;
            }
        }

        public Map zzmy()
        {
            return zzvL();
        }

        public HashMap zzvL()
        {
            return zzazC;
        }

        public ImageEntity zzvU()
        {
            return this;
        }

        public static final zzf CREATOR = new zzf();
        private static final HashMap zzazC;
        String zzAX;
        final Set zzazD;
        final int zzzH;

        static 
        {
            zzazC = new HashMap();
            zzazC.put("url", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("url", 2));
        }

        public ImageEntity()
        {
            zzzH = 1;
            zzazD = new HashSet();
        }

        public ImageEntity(String s)
        {
            zzazD = new HashSet();
            zzzH = 1;
            zzAX = s;
            zzazD.add(Integer.valueOf(2));
        }

        ImageEntity(Set set, int i, String s)
        {
            zzazD = set;
            zzzH = i;
            zzAX = s;
        }
    }

    public static final class NameEntity extends FastSafeParcelableJsonResponse
        implements com.google.android.gms.plus.model.people.Person.Name
    {

        public int describeContents()
        {
            zzg zzg1 = CREATOR;
            return 0;
        }

        public boolean equals(Object obj)
        {
label0:
            {
                if(!(obj instanceof NameEntity))
                    return false;
                if(this == obj)
                    return true;
                obj = (NameEntity)obj;
                com.google.android.gms.common.server.response.FastJsonResponse.Field field;
label1:
                do
                {
                    for(Iterator iterator = zzazC.values().iterator(); iterator.hasNext();)
                    {
                        field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                        if(!zza(field))
                            continue label1;
                        if(((NameEntity) (obj)).zza(field))
                        {
                            if(!zzb(field).equals(((NameEntity) (obj)).zzb(field)))
                                return false;
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while(!((NameEntity) (obj)).zza(field));
                return false;
            }
            return true;
        }

        public Object freeze()
        {
            return zzvV();
        }

        public String getFamilyName()
        {
            return zzaAb;
        }

        public String getFormatted()
        {
            return zzaBb;
        }

        public String getGivenName()
        {
            return zzaAe;
        }

        public String getHonorificPrefix()
        {
            return zzaBc;
        }

        public String getHonorificSuffix()
        {
            return zzaBd;
        }

        public String getMiddleName()
        {
            return zzaBe;
        }

        public boolean hasFamilyName()
        {
            return zzazD.contains(Integer.valueOf(2));
        }

        public boolean hasFormatted()
        {
            return zzazD.contains(Integer.valueOf(3));
        }

        public boolean hasGivenName()
        {
            return zzazD.contains(Integer.valueOf(4));
        }

        public boolean hasHonorificPrefix()
        {
            return zzazD.contains(Integer.valueOf(5));
        }

        public boolean hasHonorificSuffix()
        {
            return zzazD.contains(Integer.valueOf(6));
        }

        public boolean hasMiddleName()
        {
            return zzazD.contains(Integer.valueOf(7));
        }

        public int hashCode()
        {
            Iterator iterator = zzazC.values().iterator();
            int i = 0;
            do
            {
                if(!iterator.hasNext())
                    break;
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if(zza(field))
                {
                    int j = field.zzmF();
                    i = zzb(field).hashCode() + (i + j);
                }
            } while(true);
            return i;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            zzg zzg1 = CREATOR;
            zzg.zza(this, parcel, i);
        }

        protected boolean zza(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return zzazD.contains(Integer.valueOf(field.zzmF()));
        }

        protected Object zzb(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch(field.zzmF())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(field.zzmF()).toString());

            case 2: // '\002'
                return zzaAb;

            case 3: // '\003'
                return zzaBb;

            case 4: // '\004'
                return zzaAe;

            case 5: // '\005'
                return zzaBc;

            case 6: // '\006'
                return zzaBd;

            case 7: // '\007'
                return zzaBe;
            }
        }

        public Map zzmy()
        {
            return zzvL();
        }

        public HashMap zzvL()
        {
            return zzazC;
        }

        public NameEntity zzvV()
        {
            return this;
        }

        public static final zzg CREATOR = new zzg();
        private static final HashMap zzazC;
        String zzaAb;
        String zzaAe;
        String zzaBb;
        String zzaBc;
        String zzaBd;
        String zzaBe;
        final Set zzazD;
        final int zzzH;

        static 
        {
            zzazC = new HashMap();
            zzazC.put("familyName", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("familyName", 2));
            zzazC.put("formatted", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("formatted", 3));
            zzazC.put("givenName", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("givenName", 4));
            zzazC.put("honorificPrefix", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("honorificPrefix", 5));
            zzazC.put("honorificSuffix", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("honorificSuffix", 6));
            zzazC.put("middleName", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("middleName", 7));
        }

        public NameEntity()
        {
            zzzH = 1;
            zzazD = new HashSet();
        }

        NameEntity(Set set, int i, String s, String s1, String s2, String s3, String s4, 
                String s5)
        {
            zzazD = set;
            zzzH = i;
            zzaAb = s;
            zzaBb = s1;
            zzaAe = s2;
            zzaBc = s3;
            zzaBd = s4;
            zzaBe = s5;
        }
    }

    public static final class OrganizationsEntity extends FastSafeParcelableJsonResponse
        implements com.google.android.gms.plus.model.people.Person.Organizations
    {

        public int describeContents()
        {
            zzh zzh1 = CREATOR;
            return 0;
        }

        public boolean equals(Object obj)
        {
label0:
            {
                if(!(obj instanceof OrganizationsEntity))
                    return false;
                if(this == obj)
                    return true;
                obj = (OrganizationsEntity)obj;
                com.google.android.gms.common.server.response.FastJsonResponse.Field field;
label1:
                do
                {
                    for(Iterator iterator = zzazC.values().iterator(); iterator.hasNext();)
                    {
                        field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                        if(!zza(field))
                            continue label1;
                        if(((OrganizationsEntity) (obj)).zza(field))
                        {
                            if(!zzb(field).equals(((OrganizationsEntity) (obj)).zzb(field)))
                                return false;
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while(!((OrganizationsEntity) (obj)).zza(field));
                return false;
            }
            return true;
        }

        public Object freeze()
        {
            return zzvW();
        }

        public String getDepartment()
        {
            return zzaBf;
        }

        public String getDescription()
        {
            return zzadH;
        }

        public String getEndDate()
        {
            return zzaAa;
        }

        public String getLocation()
        {
            return zzaBg;
        }

        public String getName()
        {
            return mName;
        }

        public String getStartDate()
        {
            return zzaAq;
        }

        public String getTitle()
        {
            return zzWn;
        }

        public int getType()
        {
            return zzMG;
        }

        public boolean hasDepartment()
        {
            return zzazD.contains(Integer.valueOf(2));
        }

        public boolean hasDescription()
        {
            return zzazD.contains(Integer.valueOf(3));
        }

        public boolean hasEndDate()
        {
            return zzazD.contains(Integer.valueOf(4));
        }

        public boolean hasLocation()
        {
            return zzazD.contains(Integer.valueOf(5));
        }

        public boolean hasName()
        {
            return zzazD.contains(Integer.valueOf(6));
        }

        public boolean hasPrimary()
        {
            return zzazD.contains(Integer.valueOf(7));
        }

        public boolean hasStartDate()
        {
            return zzazD.contains(Integer.valueOf(8));
        }

        public boolean hasTitle()
        {
            return zzazD.contains(Integer.valueOf(9));
        }

        public boolean hasType()
        {
            return zzazD.contains(Integer.valueOf(10));
        }

        public int hashCode()
        {
            Iterator iterator = zzazC.values().iterator();
            int i = 0;
            do
            {
                if(!iterator.hasNext())
                    break;
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if(zza(field))
                {
                    int j = field.zzmF();
                    i = zzb(field).hashCode() + (i + j);
                }
            } while(true);
            return i;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public boolean isPrimary()
        {
            return zzaBh;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            zzh zzh1 = CREATOR;
            zzh.zza(this, parcel, i);
        }

        protected boolean zza(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return zzazD.contains(Integer.valueOf(field.zzmF()));
        }

        protected Object zzb(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch(field.zzmF())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(field.zzmF()).toString());

            case 2: // '\002'
                return zzaBf;

            case 3: // '\003'
                return zzadH;

            case 4: // '\004'
                return zzaAa;

            case 5: // '\005'
                return zzaBg;

            case 6: // '\006'
                return mName;

            case 7: // '\007'
                return Boolean.valueOf(zzaBh);

            case 8: // '\b'
                return zzaAq;

            case 9: // '\t'
                return zzWn;

            case 10: // '\n'
                return Integer.valueOf(zzMG);
            }
        }

        public Map zzmy()
        {
            return zzvL();
        }

        public HashMap zzvL()
        {
            return zzazC;
        }

        public OrganizationsEntity zzvW()
        {
            return this;
        }

        public static final zzh CREATOR = new zzh();
        private static final HashMap zzazC;
        String mName;
        int zzMG;
        String zzWn;
        String zzaAa;
        String zzaAq;
        String zzaBf;
        String zzaBg;
        boolean zzaBh;
        String zzadH;
        final Set zzazD;
        final int zzzH;

        static 
        {
            zzazC = new HashMap();
            zzazC.put("department", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("department", 2));
            zzazC.put("description", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("description", 3));
            zzazC.put("endDate", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("endDate", 4));
            zzazC.put("location", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("location", 5));
            zzazC.put("name", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("name", 6));
            zzazC.put("primary", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzj("primary", 7));
            zzazC.put("startDate", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("startDate", 8));
            zzazC.put("title", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("title", 9));
            zzazC.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.zza("type", 10, (new StringToIntConverter()).zzg("work", 0).zzg("school", 1), false));
        }

        public OrganizationsEntity()
        {
            zzzH = 1;
            zzazD = new HashSet();
        }

        OrganizationsEntity(Set set, int i, String s, String s1, String s2, String s3, String s4, 
                boolean flag, String s5, String s6, int j)
        {
            zzazD = set;
            zzzH = i;
            zzaBf = s;
            zzadH = s1;
            zzaAa = s2;
            zzaBg = s3;
            mName = s4;
            zzaBh = flag;
            zzaAq = s5;
            zzWn = s6;
            zzMG = j;
        }
    }

    public static final class PlacesLivedEntity extends FastSafeParcelableJsonResponse
        implements com.google.android.gms.plus.model.people.Person.PlacesLived
    {

        public int describeContents()
        {
            zzi zzi1 = CREATOR;
            return 0;
        }

        public boolean equals(Object obj)
        {
label0:
            {
                if(!(obj instanceof PlacesLivedEntity))
                    return false;
                if(this == obj)
                    return true;
                obj = (PlacesLivedEntity)obj;
                com.google.android.gms.common.server.response.FastJsonResponse.Field field;
label1:
                do
                {
                    for(Iterator iterator = zzazC.values().iterator(); iterator.hasNext();)
                    {
                        field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                        if(!zza(field))
                            continue label1;
                        if(((PlacesLivedEntity) (obj)).zza(field))
                        {
                            if(!zzb(field).equals(((PlacesLivedEntity) (obj)).zzb(field)))
                                return false;
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while(!((PlacesLivedEntity) (obj)).zza(field));
                return false;
            }
            return true;
        }

        public Object freeze()
        {
            return zzvX();
        }

        public String getValue()
        {
            return mValue;
        }

        public boolean hasPrimary()
        {
            return zzazD.contains(Integer.valueOf(2));
        }

        public boolean hasValue()
        {
            return zzazD.contains(Integer.valueOf(3));
        }

        public int hashCode()
        {
            Iterator iterator = zzazC.values().iterator();
            int i = 0;
            do
            {
                if(!iterator.hasNext())
                    break;
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if(zza(field))
                {
                    int j = field.zzmF();
                    i = zzb(field).hashCode() + (i + j);
                }
            } while(true);
            return i;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public boolean isPrimary()
        {
            return zzaBh;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            zzi zzi1 = CREATOR;
            zzi.zza(this, parcel, i);
        }

        protected boolean zza(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return zzazD.contains(Integer.valueOf(field.zzmF()));
        }

        protected Object zzb(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch(field.zzmF())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(field.zzmF()).toString());

            case 2: // '\002'
                return Boolean.valueOf(zzaBh);

            case 3: // '\003'
                return mValue;
            }
        }

        public Map zzmy()
        {
            return zzvL();
        }

        public HashMap zzvL()
        {
            return zzazC;
        }

        public PlacesLivedEntity zzvX()
        {
            return this;
        }

        public static final zzi CREATOR = new zzi();
        private static final HashMap zzazC;
        String mValue;
        boolean zzaBh;
        final Set zzazD;
        final int zzzH;

        static 
        {
            zzazC = new HashMap();
            zzazC.put("primary", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzj("primary", 2));
            zzazC.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("value", 3));
        }

        public PlacesLivedEntity()
        {
            zzzH = 1;
            zzazD = new HashSet();
        }

        PlacesLivedEntity(Set set, int i, boolean flag, String s)
        {
            zzazD = set;
            zzzH = i;
            zzaBh = flag;
            mValue = s;
        }
    }

    public static final class UrlsEntity extends FastSafeParcelableJsonResponse
        implements com.google.android.gms.plus.model.people.Person.Urls
    {

        public int describeContents()
        {
            zzj zzj1 = CREATOR;
            return 0;
        }

        public boolean equals(Object obj)
        {
label0:
            {
                if(!(obj instanceof UrlsEntity))
                    return false;
                if(this == obj)
                    return true;
                obj = (UrlsEntity)obj;
                com.google.android.gms.common.server.response.FastJsonResponse.Field field;
label1:
                do
                {
                    for(Iterator iterator = zzazC.values().iterator(); iterator.hasNext();)
                    {
                        field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                        if(!zza(field))
                            continue label1;
                        if(((UrlsEntity) (obj)).zza(field))
                        {
                            if(!zzb(field).equals(((UrlsEntity) (obj)).zzb(field)))
                                return false;
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while(!((UrlsEntity) (obj)).zza(field));
                return false;
            }
            return true;
        }

        public Object freeze()
        {
            return zzvZ();
        }

        public String getLabel()
        {
            return zzawK;
        }

        public int getType()
        {
            return zzMG;
        }

        public String getValue()
        {
            return mValue;
        }

        public boolean hasLabel()
        {
            return zzazD.contains(Integer.valueOf(5));
        }

        public boolean hasType()
        {
            return zzazD.contains(Integer.valueOf(6));
        }

        public boolean hasValue()
        {
            return zzazD.contains(Integer.valueOf(4));
        }

        public int hashCode()
        {
            Iterator iterator = zzazC.values().iterator();
            int i = 0;
            do
            {
                if(!iterator.hasNext())
                    break;
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if(zza(field))
                {
                    int j = field.zzmF();
                    i = zzb(field).hashCode() + (i + j);
                }
            } while(true);
            return i;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            zzj zzj1 = CREATOR;
            zzj.zza(this, parcel, i);
        }

        protected boolean zza(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return zzazD.contains(Integer.valueOf(field.zzmF()));
        }

        protected Object zzb(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch(field.zzmF())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(field.zzmF()).toString());

            case 5: // '\005'
                return zzawK;

            case 6: // '\006'
                return Integer.valueOf(zzMG);

            case 4: // '\004'
                return mValue;
            }
        }

        public Map zzmy()
        {
            return zzvL();
        }

        public HashMap zzvL()
        {
            return zzazC;
        }

        public int zzvY()
        {
            return 4;
        }

        public UrlsEntity zzvZ()
        {
            return this;
        }

        public static final zzj CREATOR = new zzj();
        private static final HashMap zzazC;
        String mValue;
        int zzMG;
        private final int zzaBi;
        String zzawK;
        final Set zzazD;
        final int zzzH;

        static 
        {
            zzazC = new HashMap();
            zzazC.put("label", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("label", 5));
            zzazC.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.zza("type", 6, (new StringToIntConverter()).zzg("home", 0).zzg("work", 1).zzg("blog", 2).zzg("profile", 3).zzg("other", 4).zzg("otherProfile", 5).zzg("contributor", 6).zzg("website", 7), false));
            zzazC.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("value", 4));
        }

        public UrlsEntity()
        {
            zzaBi = 4;
            zzzH = 1;
            zzazD = new HashSet();
        }

        UrlsEntity(Set set, int i, String s, int j, String s1, int k)
        {
            zzaBi = 4;
            zzazD = set;
            zzzH = i;
            zzawK = s;
            zzMG = j;
            mValue = s1;
        }
    }

    public static class zza
    {

        public static int zzdq(String s)
        {
            if(s.equals("person"))
                return 0;
            if(s.equals("page"))
                return 1;
            else
                throw new IllegalArgumentException((new StringBuilder()).append("Unknown objectType string: ").append(s).toString());
        }
    }


    public PersonEntity()
    {
        zzzH = 1;
        zzazD = new HashSet();
    }

    public PersonEntity(String s, String s1, ImageEntity imageentity, int i, String s2)
    {
        zzzH = 1;
        zzazD = new HashSet();
        zzWF = s;
        zzazD.add(Integer.valueOf(9));
        zzGM = s1;
        zzazD.add(Integer.valueOf(14));
        zzaAI = imageentity;
        zzazD.add(Integer.valueOf(15));
        zzaAM = i;
        zzazD.add(Integer.valueOf(21));
        zzAX = s2;
        zzazD.add(Integer.valueOf(27));
    }

    PersonEntity(Set set, int i, String s, AgeRangeEntity agerangeentity, String s1, String s2, int j, 
            CoverEntity coverentity, String s3, String s4, int k, String s5, ImageEntity imageentity, boolean flag, 
            String s6, NameEntity nameentity, String s7, int l, List list, List list1, int i1, 
            int j1, String s8, String s9, List list2, boolean flag1)
    {
        zzazD = set;
        zzzH = i;
        zzaAB = s;
        zzaAC = agerangeentity;
        zzaAD = s1;
        zzaAE = s2;
        zzaAF = j;
        zzaAG = coverentity;
        zzaAH = s3;
        zzWF = s4;
        zzqm = k;
        zzGM = s5;
        zzaAI = imageentity;
        zzaAJ = flag;
        zzMf = s6;
        zzaAK = nameentity;
        zzaAL = s7;
        zzaAM = l;
        zzaAN = list;
        zzaAO = list1;
        zzaAP = i1;
        zzaAQ = j1;
        zzaAR = s8;
        zzAX = s9;
        zzaAS = list2;
        zzaAT = flag1;
    }

    public static PersonEntity zzl(byte abyte0[])
    {
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        abyte0 = CREATOR.zzeU(parcel);
        parcel.recycle();
        return abyte0;
    }

    public int describeContents()
    {
        com.google.android.gms.plus.internal.model.people.zza zza1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if(!(obj instanceof PersonEntity))
                return false;
            if(this == obj)
                return true;
            obj = (PersonEntity)obj;
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
label1:
            do
            {
                for(Iterator iterator = zzazC.values().iterator(); iterator.hasNext();)
                {
                    field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                    if(!zza(field))
                        continue label1;
                    if(((PersonEntity) (obj)).zza(field))
                    {
                        if(!zzb(field).equals(((PersonEntity) (obj)).zzb(field)))
                            return false;
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while(!((PersonEntity) (obj)).zza(field));
            return false;
        }
        return true;
    }

    public Object freeze()
    {
        return zzvP();
    }

    public String getAboutMe()
    {
        return zzaAB;
    }

    public com.google.android.gms.plus.model.people.Person.AgeRange getAgeRange()
    {
        return zzaAC;
    }

    public String getBirthday()
    {
        return zzaAD;
    }

    public String getBraggingRights()
    {
        return zzaAE;
    }

    public int getCircledByCount()
    {
        return zzaAF;
    }

    public com.google.android.gms.plus.model.people.Person.Cover getCover()
    {
        return zzaAG;
    }

    public String getCurrentLocation()
    {
        return zzaAH;
    }

    public String getDisplayName()
    {
        return zzWF;
    }

    public int getGender()
    {
        return zzqm;
    }

    public String getId()
    {
        return zzGM;
    }

    public com.google.android.gms.plus.model.people.Person.Image getImage()
    {
        return zzaAI;
    }

    public String getLanguage()
    {
        return zzMf;
    }

    public com.google.android.gms.plus.model.people.Person.Name getName()
    {
        return zzaAK;
    }

    public String getNickname()
    {
        return zzaAL;
    }

    public int getObjectType()
    {
        return zzaAM;
    }

    public List getOrganizations()
    {
        return (ArrayList)zzaAN;
    }

    public List getPlacesLived()
    {
        return (ArrayList)zzaAO;
    }

    public int getPlusOneCount()
    {
        return zzaAP;
    }

    public int getRelationshipStatus()
    {
        return zzaAQ;
    }

    public String getTagline()
    {
        return zzaAR;
    }

    public String getUrl()
    {
        return zzAX;
    }

    public List getUrls()
    {
        return (ArrayList)zzaAS;
    }

    public boolean hasAboutMe()
    {
        return zzazD.contains(Integer.valueOf(2));
    }

    public boolean hasAgeRange()
    {
        return zzazD.contains(Integer.valueOf(3));
    }

    public boolean hasBirthday()
    {
        return zzazD.contains(Integer.valueOf(4));
    }

    public boolean hasBraggingRights()
    {
        return zzazD.contains(Integer.valueOf(5));
    }

    public boolean hasCircledByCount()
    {
        return zzazD.contains(Integer.valueOf(6));
    }

    public boolean hasCover()
    {
        return zzazD.contains(Integer.valueOf(7));
    }

    public boolean hasCurrentLocation()
    {
        return zzazD.contains(Integer.valueOf(8));
    }

    public boolean hasDisplayName()
    {
        return zzazD.contains(Integer.valueOf(9));
    }

    public boolean hasGender()
    {
        return zzazD.contains(Integer.valueOf(12));
    }

    public boolean hasId()
    {
        return zzazD.contains(Integer.valueOf(14));
    }

    public boolean hasImage()
    {
        return zzazD.contains(Integer.valueOf(15));
    }

    public boolean hasIsPlusUser()
    {
        return zzazD.contains(Integer.valueOf(16));
    }

    public boolean hasLanguage()
    {
        return zzazD.contains(Integer.valueOf(18));
    }

    public boolean hasName()
    {
        return zzazD.contains(Integer.valueOf(19));
    }

    public boolean hasNickname()
    {
        return zzazD.contains(Integer.valueOf(20));
    }

    public boolean hasObjectType()
    {
        return zzazD.contains(Integer.valueOf(21));
    }

    public boolean hasOrganizations()
    {
        return zzazD.contains(Integer.valueOf(22));
    }

    public boolean hasPlacesLived()
    {
        return zzazD.contains(Integer.valueOf(23));
    }

    public boolean hasPlusOneCount()
    {
        return zzazD.contains(Integer.valueOf(24));
    }

    public boolean hasRelationshipStatus()
    {
        return zzazD.contains(Integer.valueOf(25));
    }

    public boolean hasTagline()
    {
        return zzazD.contains(Integer.valueOf(26));
    }

    public boolean hasUrl()
    {
        return zzazD.contains(Integer.valueOf(27));
    }

    public boolean hasUrls()
    {
        return zzazD.contains(Integer.valueOf(28));
    }

    public boolean hasVerified()
    {
        return zzazD.contains(Integer.valueOf(29));
    }

    public int hashCode()
    {
        Iterator iterator = zzazC.values().iterator();
        int i = 0;
        do
        {
            if(!iterator.hasNext())
                break;
            com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if(zza(field))
            {
                int j = field.zzmF();
                i = zzb(field).hashCode() + (i + j);
            }
        } while(true);
        return i;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public boolean isPlusUser()
    {
        return zzaAJ;
    }

    public boolean isVerified()
    {
        return zzaAT;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.plus.internal.model.people.zza zza1 = CREATOR;
        com.google.android.gms.plus.internal.model.people.zza.zza(this, parcel, i);
    }

    protected boolean zza(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        return zzazD.contains(Integer.valueOf(field.zzmF()));
    }

    protected Object zzb(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        switch(field.zzmF())
        {
        case 10: // '\n'
        case 11: // '\013'
        case 13: // '\r'
        case 17: // '\021'
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(field.zzmF()).toString());

        case 2: // '\002'
            return zzaAB;

        case 3: // '\003'
            return zzaAC;

        case 4: // '\004'
            return zzaAD;

        case 5: // '\005'
            return zzaAE;

        case 6: // '\006'
            return Integer.valueOf(zzaAF);

        case 7: // '\007'
            return zzaAG;

        case 8: // '\b'
            return zzaAH;

        case 9: // '\t'
            return zzWF;

        case 12: // '\f'
            return Integer.valueOf(zzqm);

        case 14: // '\016'
            return zzGM;

        case 15: // '\017'
            return zzaAI;

        case 16: // '\020'
            return Boolean.valueOf(zzaAJ);

        case 18: // '\022'
            return zzMf;

        case 19: // '\023'
            return zzaAK;

        case 20: // '\024'
            return zzaAL;

        case 21: // '\025'
            return Integer.valueOf(zzaAM);

        case 22: // '\026'
            return zzaAN;

        case 23: // '\027'
            return zzaAO;

        case 24: // '\030'
            return Integer.valueOf(zzaAP);

        case 25: // '\031'
            return Integer.valueOf(zzaAQ);

        case 26: // '\032'
            return zzaAR;

        case 27: // '\033'
            return zzAX;

        case 28: // '\034'
            return zzaAS;

        case 29: // '\035'
            return Boolean.valueOf(zzaAT);
        }
    }

    public Map zzmy()
    {
        return zzvL();
    }

    public HashMap zzvL()
    {
        return zzazC;
    }

    public PersonEntity zzvP()
    {
        return this;
    }

    public static final com.google.android.gms.plus.internal.model.people.zza CREATOR = new com.google.android.gms.plus.internal.model.people.zza();
    private static final HashMap zzazC;
    String zzAX;
    String zzGM;
    String zzMf;
    String zzWF;
    String zzaAB;
    AgeRangeEntity zzaAC;
    String zzaAD;
    String zzaAE;
    int zzaAF;
    CoverEntity zzaAG;
    String zzaAH;
    ImageEntity zzaAI;
    boolean zzaAJ;
    NameEntity zzaAK;
    String zzaAL;
    int zzaAM;
    List zzaAN;
    List zzaAO;
    int zzaAP;
    int zzaAQ;
    String zzaAR;
    List zzaAS;
    boolean zzaAT;
    final Set zzazD;
    int zzqm;
    final int zzzH;

    static 
    {
        zzazC = new HashMap();
        zzazC.put("aboutMe", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("aboutMe", 2));
        zzazC.put("ageRange", com.google.android.gms.common.server.response.FastJsonResponse.Field.zza("ageRange", 3, com/google/android/gms/plus/internal/model/people/PersonEntity$AgeRangeEntity));
        zzazC.put("birthday", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("birthday", 4));
        zzazC.put("braggingRights", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("braggingRights", 5));
        zzazC.put("circledByCount", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzh("circledByCount", 6));
        zzazC.put("cover", com.google.android.gms.common.server.response.FastJsonResponse.Field.zza("cover", 7, com/google/android/gms/plus/internal/model/people/PersonEntity$CoverEntity));
        zzazC.put("currentLocation", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("currentLocation", 8));
        zzazC.put("displayName", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("displayName", 9));
        zzazC.put("gender", com.google.android.gms.common.server.response.FastJsonResponse.Field.zza("gender", 12, (new StringToIntConverter()).zzg("male", 0).zzg("female", 1).zzg("other", 2), false));
        zzazC.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("id", 14));
        zzazC.put("image", com.google.android.gms.common.server.response.FastJsonResponse.Field.zza("image", 15, com/google/android/gms/plus/internal/model/people/PersonEntity$ImageEntity));
        zzazC.put("isPlusUser", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzj("isPlusUser", 16));
        zzazC.put("language", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("language", 18));
        zzazC.put("name", com.google.android.gms.common.server.response.FastJsonResponse.Field.zza("name", 19, com/google/android/gms/plus/internal/model/people/PersonEntity$NameEntity));
        zzazC.put("nickname", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("nickname", 20));
        zzazC.put("objectType", com.google.android.gms.common.server.response.FastJsonResponse.Field.zza("objectType", 21, (new StringToIntConverter()).zzg("person", 0).zzg("page", 1), false));
        zzazC.put("organizations", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzb("organizations", 22, com/google/android/gms/plus/internal/model/people/PersonEntity$OrganizationsEntity));
        zzazC.put("placesLived", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzb("placesLived", 23, com/google/android/gms/plus/internal/model/people/PersonEntity$PlacesLivedEntity));
        zzazC.put("plusOneCount", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzh("plusOneCount", 24));
        zzazC.put("relationshipStatus", com.google.android.gms.common.server.response.FastJsonResponse.Field.zza("relationshipStatus", 25, (new StringToIntConverter()).zzg("single", 0).zzg("in_a_relationship", 1).zzg("engaged", 2).zzg("married", 3).zzg("its_complicated", 4).zzg("open_relationship", 5).zzg("widowed", 6).zzg("in_domestic_partnership", 7).zzg("in_civil_union", 8), false));
        zzazC.put("tagline", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("tagline", 26));
        zzazC.put("url", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("url", 27));
        zzazC.put("urls", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzb("urls", 28, com/google/android/gms/plus/internal/model/people/PersonEntity$UrlsEntity));
        zzazC.put("verified", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzj("verified", 29));
    }
}
