// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.moments.ItemScope;
import java.util.*;

// Referenced classes of package com.google.android.gms.plus.internal.model.moments:
//            zza

public final class ItemScopeEntity extends FastSafeParcelableJsonResponse
    implements ItemScope
{

    public ItemScopeEntity()
    {
        zzzH = 1;
        zzazD = new HashSet();
    }

    ItemScopeEntity(Set set, int i, ItemScopeEntity itemscopeentity, List list, ItemScopeEntity itemscopeentity1, String s, String s1, 
            String s2, List list1, int j, List list2, ItemScopeEntity itemscopeentity2, List list3, String s3, 
            String s4, ItemScopeEntity itemscopeentity3, String s5, String s6, String s7, List list4, String s8, 
            String s9, String s10, String s11, String s12, String s13, String s14, String s15, 
            String s16, ItemScopeEntity itemscopeentity4, String s17, String s18, String s19, String s20, ItemScopeEntity itemscopeentity5, 
            double d, ItemScopeEntity itemscopeentity6, double d1, String s21, ItemScopeEntity itemscopeentity7, 
            List list5, String s22, String s23, String s24, String s25, ItemScopeEntity itemscopeentity8, String s26, 
            String s27, String s28, ItemScopeEntity itemscopeentity9, String s29, String s30, String s31, String s32, 
            String s33, String s34)
    {
        zzazD = set;
        zzzH = i;
        zzazE = itemscopeentity;
        zzazF = list;
        zzazG = itemscopeentity1;
        zzazH = s;
        zzazI = s1;
        zzazJ = s2;
        zzazK = list1;
        zzazL = j;
        zzazM = list2;
        zzazN = itemscopeentity2;
        zzazO = list3;
        zzazP = s3;
        zzazQ = s4;
        zzazR = itemscopeentity3;
        zzazS = s5;
        zzazT = s6;
        zzql = s7;
        zzazU = list4;
        zzazV = s8;
        zzazW = s9;
        zzazX = s10;
        zzadH = s11;
        zzazY = s12;
        zzazZ = s13;
        zzaAa = s14;
        zzaAb = s15;
        zzaAc = s16;
        zzaAd = itemscopeentity4;
        zzaAe = s17;
        zzaAf = s18;
        zzGM = s19;
        zzaAg = s20;
        zzaAh = itemscopeentity5;
        zzapL = d;
        zzaAi = itemscopeentity6;
        zzapM = d1;
        mName = s21;
        zzaAj = itemscopeentity7;
        zzaAk = list5;
        zzaAl = s22;
        zzaAm = s23;
        zzaAn = s24;
        zzaAo = s25;
        zzaAp = itemscopeentity8;
        zzaAq = s26;
        zzaAr = s27;
        zzaAs = s28;
        zzaAt = itemscopeentity9;
        zzaAu = s29;
        zzaAv = s30;
        zzAV = s31;
        zzAX = s32;
        zzaAw = s33;
        zzaAx = s34;
    }

    public ItemScopeEntity(Set set, ItemScopeEntity itemscopeentity, List list, ItemScopeEntity itemscopeentity1, String s, String s1, String s2, 
            List list1, int i, List list2, ItemScopeEntity itemscopeentity2, List list3, String s3, String s4, 
            ItemScopeEntity itemscopeentity3, String s5, String s6, String s7, List list4, String s8, String s9, 
            String s10, String s11, String s12, String s13, String s14, String s15, String s16, 
            ItemScopeEntity itemscopeentity4, String s17, String s18, String s19, String s20, ItemScopeEntity itemscopeentity5, double d, ItemScopeEntity itemscopeentity6, double d1, String s21, ItemScopeEntity itemscopeentity7, List list5, 
            String s22, String s23, String s24, String s25, ItemScopeEntity itemscopeentity8, String s26, String s27, 
            String s28, ItemScopeEntity itemscopeentity9, String s29, String s30, String s31, String s32, String s33, 
            String s34)
    {
        zzazD = set;
        zzzH = 1;
        zzazE = itemscopeentity;
        zzazF = list;
        zzazG = itemscopeentity1;
        zzazH = s;
        zzazI = s1;
        zzazJ = s2;
        zzazK = list1;
        zzazL = i;
        zzazM = list2;
        zzazN = itemscopeentity2;
        zzazO = list3;
        zzazP = s3;
        zzazQ = s4;
        zzazR = itemscopeentity3;
        zzazS = s5;
        zzazT = s6;
        zzql = s7;
        zzazU = list4;
        zzazV = s8;
        zzazW = s9;
        zzazX = s10;
        zzadH = s11;
        zzazY = s12;
        zzazZ = s13;
        zzaAa = s14;
        zzaAb = s15;
        zzaAc = s16;
        zzaAd = itemscopeentity4;
        zzaAe = s17;
        zzaAf = s18;
        zzGM = s19;
        zzaAg = s20;
        zzaAh = itemscopeentity5;
        zzapL = d;
        zzaAi = itemscopeentity6;
        zzapM = d1;
        mName = s21;
        zzaAj = itemscopeentity7;
        zzaAk = list5;
        zzaAl = s22;
        zzaAm = s23;
        zzaAn = s24;
        zzaAo = s25;
        zzaAp = itemscopeentity8;
        zzaAq = s26;
        zzaAr = s27;
        zzaAs = s28;
        zzaAt = itemscopeentity9;
        zzaAu = s29;
        zzaAv = s30;
        zzAV = s31;
        zzAX = s32;
        zzaAw = s33;
        zzaAx = s34;
    }

    public int describeContents()
    {
        zza zza1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if(!(obj instanceof ItemScopeEntity))
                return false;
            if(this == obj)
                return true;
            obj = (ItemScopeEntity)obj;
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
label1:
            do
            {
                for(Iterator iterator = zzazC.values().iterator(); iterator.hasNext();)
                {
                    field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                    if(!zza(field))
                        continue label1;
                    if(((ItemScopeEntity) (obj)).zza(field))
                    {
                        if(!zzb(field).equals(((ItemScopeEntity) (obj)).zzb(field)))
                            return false;
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while(!((ItemScopeEntity) (obj)).zza(field));
            return false;
        }
        return true;
    }

    public Object freeze()
    {
        return zzvM();
    }

    public ItemScope getAbout()
    {
        return zzazE;
    }

    public List getAdditionalName()
    {
        return zzazF;
    }

    public ItemScope getAddress()
    {
        return zzazG;
    }

    public String getAddressCountry()
    {
        return zzazH;
    }

    public String getAddressLocality()
    {
        return zzazI;
    }

    public String getAddressRegion()
    {
        return zzazJ;
    }

    public List getAssociated_media()
    {
        return (ArrayList)zzazK;
    }

    public int getAttendeeCount()
    {
        return zzazL;
    }

    public List getAttendees()
    {
        return (ArrayList)zzazM;
    }

    public ItemScope getAudio()
    {
        return zzazN;
    }

    public List getAuthor()
    {
        return (ArrayList)zzazO;
    }

    public String getBestRating()
    {
        return zzazP;
    }

    public String getBirthDate()
    {
        return zzazQ;
    }

    public ItemScope getByArtist()
    {
        return zzazR;
    }

    public String getCaption()
    {
        return zzazS;
    }

    public String getContentSize()
    {
        return zzazT;
    }

    public String getContentUrl()
    {
        return zzql;
    }

    public List getContributor()
    {
        return (ArrayList)zzazU;
    }

    public String getDateCreated()
    {
        return zzazV;
    }

    public String getDateModified()
    {
        return zzazW;
    }

    public String getDatePublished()
    {
        return zzazX;
    }

    public String getDescription()
    {
        return zzadH;
    }

    public String getDuration()
    {
        return zzazY;
    }

    public String getEmbedUrl()
    {
        return zzazZ;
    }

    public String getEndDate()
    {
        return zzaAa;
    }

    public String getFamilyName()
    {
        return zzaAb;
    }

    public String getGender()
    {
        return zzaAc;
    }

    public ItemScope getGeo()
    {
        return zzaAd;
    }

    public String getGivenName()
    {
        return zzaAe;
    }

    public String getHeight()
    {
        return zzaAf;
    }

    public String getId()
    {
        return zzGM;
    }

    public String getImage()
    {
        return zzaAg;
    }

    public ItemScope getInAlbum()
    {
        return zzaAh;
    }

    public double getLatitude()
    {
        return zzapL;
    }

    public ItemScope getLocation()
    {
        return zzaAi;
    }

    public double getLongitude()
    {
        return zzapM;
    }

    public String getName()
    {
        return mName;
    }

    public ItemScope getPartOfTVSeries()
    {
        return zzaAj;
    }

    public List getPerformers()
    {
        return (ArrayList)zzaAk;
    }

    public String getPlayerType()
    {
        return zzaAl;
    }

    public String getPostOfficeBoxNumber()
    {
        return zzaAm;
    }

    public String getPostalCode()
    {
        return zzaAn;
    }

    public String getRatingValue()
    {
        return zzaAo;
    }

    public ItemScope getReviewRating()
    {
        return zzaAp;
    }

    public String getStartDate()
    {
        return zzaAq;
    }

    public String getStreetAddress()
    {
        return zzaAr;
    }

    public String getText()
    {
        return zzaAs;
    }

    public ItemScope getThumbnail()
    {
        return zzaAt;
    }

    public String getThumbnailUrl()
    {
        return zzaAu;
    }

    public String getTickerSymbol()
    {
        return zzaAv;
    }

    public String getType()
    {
        return zzAV;
    }

    public String getUrl()
    {
        return zzAX;
    }

    public String getWidth()
    {
        return zzaAw;
    }

    public String getWorstRating()
    {
        return zzaAx;
    }

    public boolean hasAbout()
    {
        return zzazD.contains(Integer.valueOf(2));
    }

    public boolean hasAdditionalName()
    {
        return zzazD.contains(Integer.valueOf(3));
    }

    public boolean hasAddress()
    {
        return zzazD.contains(Integer.valueOf(4));
    }

    public boolean hasAddressCountry()
    {
        return zzazD.contains(Integer.valueOf(5));
    }

    public boolean hasAddressLocality()
    {
        return zzazD.contains(Integer.valueOf(6));
    }

    public boolean hasAddressRegion()
    {
        return zzazD.contains(Integer.valueOf(7));
    }

    public boolean hasAssociated_media()
    {
        return zzazD.contains(Integer.valueOf(8));
    }

    public boolean hasAttendeeCount()
    {
        return zzazD.contains(Integer.valueOf(9));
    }

    public boolean hasAttendees()
    {
        return zzazD.contains(Integer.valueOf(10));
    }

    public boolean hasAudio()
    {
        return zzazD.contains(Integer.valueOf(11));
    }

    public boolean hasAuthor()
    {
        return zzazD.contains(Integer.valueOf(12));
    }

    public boolean hasBestRating()
    {
        return zzazD.contains(Integer.valueOf(13));
    }

    public boolean hasBirthDate()
    {
        return zzazD.contains(Integer.valueOf(14));
    }

    public boolean hasByArtist()
    {
        return zzazD.contains(Integer.valueOf(15));
    }

    public boolean hasCaption()
    {
        return zzazD.contains(Integer.valueOf(16));
    }

    public boolean hasContentSize()
    {
        return zzazD.contains(Integer.valueOf(17));
    }

    public boolean hasContentUrl()
    {
        return zzazD.contains(Integer.valueOf(18));
    }

    public boolean hasContributor()
    {
        return zzazD.contains(Integer.valueOf(19));
    }

    public boolean hasDateCreated()
    {
        return zzazD.contains(Integer.valueOf(20));
    }

    public boolean hasDateModified()
    {
        return zzazD.contains(Integer.valueOf(21));
    }

    public boolean hasDatePublished()
    {
        return zzazD.contains(Integer.valueOf(22));
    }

    public boolean hasDescription()
    {
        return zzazD.contains(Integer.valueOf(23));
    }

    public boolean hasDuration()
    {
        return zzazD.contains(Integer.valueOf(24));
    }

    public boolean hasEmbedUrl()
    {
        return zzazD.contains(Integer.valueOf(25));
    }

    public boolean hasEndDate()
    {
        return zzazD.contains(Integer.valueOf(26));
    }

    public boolean hasFamilyName()
    {
        return zzazD.contains(Integer.valueOf(27));
    }

    public boolean hasGender()
    {
        return zzazD.contains(Integer.valueOf(28));
    }

    public boolean hasGeo()
    {
        return zzazD.contains(Integer.valueOf(29));
    }

    public boolean hasGivenName()
    {
        return zzazD.contains(Integer.valueOf(30));
    }

    public boolean hasHeight()
    {
        return zzazD.contains(Integer.valueOf(31));
    }

    public boolean hasId()
    {
        return zzazD.contains(Integer.valueOf(32));
    }

    public boolean hasImage()
    {
        return zzazD.contains(Integer.valueOf(33));
    }

    public boolean hasInAlbum()
    {
        return zzazD.contains(Integer.valueOf(34));
    }

    public boolean hasLatitude()
    {
        return zzazD.contains(Integer.valueOf(36));
    }

    public boolean hasLocation()
    {
        return zzazD.contains(Integer.valueOf(37));
    }

    public boolean hasLongitude()
    {
        return zzazD.contains(Integer.valueOf(38));
    }

    public boolean hasName()
    {
        return zzazD.contains(Integer.valueOf(39));
    }

    public boolean hasPartOfTVSeries()
    {
        return zzazD.contains(Integer.valueOf(40));
    }

    public boolean hasPerformers()
    {
        return zzazD.contains(Integer.valueOf(41));
    }

    public boolean hasPlayerType()
    {
        return zzazD.contains(Integer.valueOf(42));
    }

    public boolean hasPostOfficeBoxNumber()
    {
        return zzazD.contains(Integer.valueOf(43));
    }

    public boolean hasPostalCode()
    {
        return zzazD.contains(Integer.valueOf(44));
    }

    public boolean hasRatingValue()
    {
        return zzazD.contains(Integer.valueOf(45));
    }

    public boolean hasReviewRating()
    {
        return zzazD.contains(Integer.valueOf(46));
    }

    public boolean hasStartDate()
    {
        return zzazD.contains(Integer.valueOf(47));
    }

    public boolean hasStreetAddress()
    {
        return zzazD.contains(Integer.valueOf(48));
    }

    public boolean hasText()
    {
        return zzazD.contains(Integer.valueOf(49));
    }

    public boolean hasThumbnail()
    {
        return zzazD.contains(Integer.valueOf(50));
    }

    public boolean hasThumbnailUrl()
    {
        return zzazD.contains(Integer.valueOf(51));
    }

    public boolean hasTickerSymbol()
    {
        return zzazD.contains(Integer.valueOf(52));
    }

    public boolean hasType()
    {
        return zzazD.contains(Integer.valueOf(53));
    }

    public boolean hasUrl()
    {
        return zzazD.contains(Integer.valueOf(54));
    }

    public boolean hasWidth()
    {
        return zzazD.contains(Integer.valueOf(55));
    }

    public boolean hasWorstRating()
    {
        return zzazD.contains(Integer.valueOf(56));
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
        zza zza1 = CREATOR;
        com.google.android.gms.plus.internal.model.moments.zza.zza(this, parcel, i);
    }

    protected boolean zza(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        return zzazD.contains(Integer.valueOf(field.zzmF()));
    }

    protected Object zzb(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        switch(field.zzmF())
        {
        case 35: // '#'
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(field.zzmF()).toString());

        case 2: // '\002'
            return zzazE;

        case 3: // '\003'
            return zzazF;

        case 4: // '\004'
            return zzazG;

        case 5: // '\005'
            return zzazH;

        case 6: // '\006'
            return zzazI;

        case 7: // '\007'
            return zzazJ;

        case 8: // '\b'
            return zzazK;

        case 9: // '\t'
            return Integer.valueOf(zzazL);

        case 10: // '\n'
            return zzazM;

        case 11: // '\013'
            return zzazN;

        case 12: // '\f'
            return zzazO;

        case 13: // '\r'
            return zzazP;

        case 14: // '\016'
            return zzazQ;

        case 15: // '\017'
            return zzazR;

        case 16: // '\020'
            return zzazS;

        case 17: // '\021'
            return zzazT;

        case 18: // '\022'
            return zzql;

        case 19: // '\023'
            return zzazU;

        case 20: // '\024'
            return zzazV;

        case 21: // '\025'
            return zzazW;

        case 22: // '\026'
            return zzazX;

        case 23: // '\027'
            return zzadH;

        case 24: // '\030'
            return zzazY;

        case 25: // '\031'
            return zzazZ;

        case 26: // '\032'
            return zzaAa;

        case 27: // '\033'
            return zzaAb;

        case 28: // '\034'
            return zzaAc;

        case 29: // '\035'
            return zzaAd;

        case 30: // '\036'
            return zzaAe;

        case 31: // '\037'
            return zzaAf;

        case 32: // ' '
            return zzGM;

        case 33: // '!'
            return zzaAg;

        case 34: // '"'
            return zzaAh;

        case 36: // '$'
            return Double.valueOf(zzapL);

        case 37: // '%'
            return zzaAi;

        case 38: // '&'
            return Double.valueOf(zzapM);

        case 39: // '\''
            return mName;

        case 40: // '('
            return zzaAj;

        case 41: // ')'
            return zzaAk;

        case 42: // '*'
            return zzaAl;

        case 43: // '+'
            return zzaAm;

        case 44: // ','
            return zzaAn;

        case 45: // '-'
            return zzaAo;

        case 46: // '.'
            return zzaAp;

        case 47: // '/'
            return zzaAq;

        case 48: // '0'
            return zzaAr;

        case 49: // '1'
            return zzaAs;

        case 50: // '2'
            return zzaAt;

        case 51: // '3'
            return zzaAu;

        case 52: // '4'
            return zzaAv;

        case 53: // '5'
            return zzAV;

        case 54: // '6'
            return zzAX;

        case 55: // '7'
            return zzaAw;

        case 56: // '8'
            return zzaAx;
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

    public ItemScopeEntity zzvM()
    {
        return this;
    }

    public static final zza CREATOR = new zza();
    private static final HashMap zzazC;
    String mName;
    String zzAV;
    String zzAX;
    String zzGM;
    String zzaAa;
    String zzaAb;
    String zzaAc;
    ItemScopeEntity zzaAd;
    String zzaAe;
    String zzaAf;
    String zzaAg;
    ItemScopeEntity zzaAh;
    ItemScopeEntity zzaAi;
    ItemScopeEntity zzaAj;
    List zzaAk;
    String zzaAl;
    String zzaAm;
    String zzaAn;
    String zzaAo;
    ItemScopeEntity zzaAp;
    String zzaAq;
    String zzaAr;
    String zzaAs;
    ItemScopeEntity zzaAt;
    String zzaAu;
    String zzaAv;
    String zzaAw;
    String zzaAx;
    String zzadH;
    double zzapL;
    double zzapM;
    final Set zzazD;
    ItemScopeEntity zzazE;
    List zzazF;
    ItemScopeEntity zzazG;
    String zzazH;
    String zzazI;
    String zzazJ;
    List zzazK;
    int zzazL;
    List zzazM;
    ItemScopeEntity zzazN;
    List zzazO;
    String zzazP;
    String zzazQ;
    ItemScopeEntity zzazR;
    String zzazS;
    String zzazT;
    List zzazU;
    String zzazV;
    String zzazW;
    String zzazX;
    String zzazY;
    String zzazZ;
    String zzql;
    final int zzzH;

    static 
    {
        zzazC = new HashMap();
        zzazC.put("about", com.google.android.gms.common.server.response.FastJsonResponse.Field.zza("about", 2, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        zzazC.put("additionalName", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzl("additionalName", 3));
        zzazC.put("address", com.google.android.gms.common.server.response.FastJsonResponse.Field.zza("address", 4, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        zzazC.put("addressCountry", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("addressCountry", 5));
        zzazC.put("addressLocality", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("addressLocality", 6));
        zzazC.put("addressRegion", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("addressRegion", 7));
        zzazC.put("associated_media", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzb("associated_media", 8, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        zzazC.put("attendeeCount", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzh("attendeeCount", 9));
        zzazC.put("attendees", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzb("attendees", 10, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        zzazC.put("audio", com.google.android.gms.common.server.response.FastJsonResponse.Field.zza("audio", 11, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        zzazC.put("author", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzb("author", 12, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        zzazC.put("bestRating", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("bestRating", 13));
        zzazC.put("birthDate", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("birthDate", 14));
        zzazC.put("byArtist", com.google.android.gms.common.server.response.FastJsonResponse.Field.zza("byArtist", 15, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        zzazC.put("caption", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("caption", 16));
        zzazC.put("contentSize", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("contentSize", 17));
        zzazC.put("contentUrl", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("contentUrl", 18));
        zzazC.put("contributor", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzb("contributor", 19, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        zzazC.put("dateCreated", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("dateCreated", 20));
        zzazC.put("dateModified", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("dateModified", 21));
        zzazC.put("datePublished", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("datePublished", 22));
        zzazC.put("description", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("description", 23));
        zzazC.put("duration", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("duration", 24));
        zzazC.put("embedUrl", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("embedUrl", 25));
        zzazC.put("endDate", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("endDate", 26));
        zzazC.put("familyName", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("familyName", 27));
        zzazC.put("gender", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("gender", 28));
        zzazC.put("geo", com.google.android.gms.common.server.response.FastJsonResponse.Field.zza("geo", 29, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        zzazC.put("givenName", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("givenName", 30));
        zzazC.put("height", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("height", 31));
        zzazC.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("id", 32));
        zzazC.put("image", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("image", 33));
        zzazC.put("inAlbum", com.google.android.gms.common.server.response.FastJsonResponse.Field.zza("inAlbum", 34, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        zzazC.put("latitude", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzi("latitude", 36));
        zzazC.put("location", com.google.android.gms.common.server.response.FastJsonResponse.Field.zza("location", 37, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        zzazC.put("longitude", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzi("longitude", 38));
        zzazC.put("name", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("name", 39));
        zzazC.put("partOfTVSeries", com.google.android.gms.common.server.response.FastJsonResponse.Field.zza("partOfTVSeries", 40, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        zzazC.put("performers", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzb("performers", 41, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        zzazC.put("playerType", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("playerType", 42));
        zzazC.put("postOfficeBoxNumber", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("postOfficeBoxNumber", 43));
        zzazC.put("postalCode", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("postalCode", 44));
        zzazC.put("ratingValue", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("ratingValue", 45));
        zzazC.put("reviewRating", com.google.android.gms.common.server.response.FastJsonResponse.Field.zza("reviewRating", 46, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        zzazC.put("startDate", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("startDate", 47));
        zzazC.put("streetAddress", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("streetAddress", 48));
        zzazC.put("text", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("text", 49));
        zzazC.put("thumbnail", com.google.android.gms.common.server.response.FastJsonResponse.Field.zza("thumbnail", 50, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        zzazC.put("thumbnailUrl", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("thumbnailUrl", 51));
        zzazC.put("tickerSymbol", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("tickerSymbol", 52));
        zzazC.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("type", 53));
        zzazC.put("url", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("url", 54));
        zzazC.put("width", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("width", 55));
        zzazC.put("worstRating", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("worstRating", 56));
    }
}
