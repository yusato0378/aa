// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzi

public final class Field
    implements SafeParcelable
{

    Field(int i, String s, int j)
    {
        zzzH = i;
        mName = (String)zzv.zzr(s);
        zzadw = j;
    }

    private Field(String s, int i)
    {
        this(1, s, i);
    }

    private boolean zza(Field field)
    {
        return mName.equals(field.mName) && zzadw == field.zzadw;
    }

    private static Field zzcn(String s)
    {
        return new Field(s, 1);
    }

    private static Field zzco(String s)
    {
        return new Field(s, 2);
    }

    private static Field zzcp(String s)
    {
        return new Field(s, 3);
    }

    private static Field zzcq(String s)
    {
        return new Field(s, 4);
    }

    public static Field zzm(String s, int i)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 34: default 288
    //                   -2131707655: 450
    //                   -1992012396: 579
    //                   -1655966961: 464
    //                   -1569430471: 774
    //                   -1439978388: 669
    //                   -1221029593: 624
    //                   -1110756780: 609
    //                   -921832806: 804
    //                   -791592328: 894
    //                   -631448035: 492
    //                   -626344110: 654
    //                   -619868540: 714
    //                   -494782871: 639
    //                   -437053898: 744
    //                   -277306353: 534
    //                   -266093204: 789
    //                   -168965370: 520
    //                   120: 909
    //                   121: 924
    //                   122: 940
    //                   97759: 506
    //                   107876: 729
    //                   108114: 759
    //                   113135: 834
    //                   109641799: 849
    //                   109761319: 864
    //                   112903913: 879
    //                   137365935: 684
    //                   198162679: 699
    //                   224520316: 594
    //                   288459765: 564
    //                   811264586: 819
    //                   829251210: 549
    //                   2036550306: 478;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35
_L1:
        break; /* Loop/switch isn't completed */
_L21:
        break MISSING_BLOCK_LABEL_940;
_L36:
        switch(byte0)
        {
        default:
            return new Field(s, i);

        case 0: // '\0'
            return FIELD_ACCURACY;

        case 1: // '\001'
            return FIELD_ACTIVITY;

        case 2: // '\002'
            return FIELD_ALTITUDE;

        case 3: // '\003'
            return FIELD_AVERAGE;

        case 4: // '\004'
            return FIELD_BPM;

        case 5: // '\005'
            return FIELD_CALORIES;

        case 6: // '\006'
            return FIELD_CIRCUMFERENCE;

        case 7: // '\007'
            return FIELD_CONFIDENCE;

        case 8: // '\b'
            return FIELD_DISTANCE;

        case 9: // '\t'
            return FIELD_DURATION;

        case 10: // '\n'
            return zzads;

        case 11: // '\013'
            return FIELD_FOOD_ITEM;

        case 12: // '\f'
            return FIELD_HEIGHT;

        case 13: // '\r'
            return FIELD_HIGH_LATITUDE;

        case 14: // '\016'
            return FIELD_HIGH_LONGITUDE;

        case 15: // '\017'
            return FIELD_LATITUDE;

        case 16: // '\020'
            return FIELD_LONGITUDE;

        case 17: // '\021'
            return FIELD_LOW_LATITUDE;

        case 18: // '\022'
            return FIELD_LOW_LONGITUDE;

        case 19: // '\023'
            return FIELD_MAX;

        case 20: // '\024'
            return FIELD_MEAL_TYPE;

        case 21: // '\025'
            return FIELD_MIN;

        case 22: // '\026'
            return FIELD_NUM_SEGMENTS;

        case 23: // '\027'
            return FIELD_NUTRIENTS;

        case 24: // '\030'
            return FIELD_PERCENTAGE;

        case 25: // '\031'
            return FIELD_REVOLUTIONS;

        case 26: // '\032'
            return FIELD_RPM;

        case 27: // '\033'
            return FIELD_SPEED;

        case 28: // '\034'
            return FIELD_STEPS;

        case 29: // '\035'
            return FIELD_WATTS;

        case 30: // '\036'
            return FIELD_WEIGHT;

        case 31: // '\037'
            return zzadt;

        case 32: // ' '
            return zzadu;

        case 33: // '!'
            return zzadv;
        }
_L2:
        if(s.equals("accuracy"))
            byte0 = 0;
          goto _L36
_L4:
        if(s.equals("activity"))
            byte0 = 1;
          goto _L36
_L35:
        if(s.equals("altitude"))
            byte0 = 2;
          goto _L36
_L11:
        if(s.equals("average"))
            byte0 = 3;
          goto _L36
_L22:
        if(s.equals("bpm"))
            byte0 = 4;
          goto _L36
_L18:
        if(s.equals("calories"))
            byte0 = 5;
          goto _L36
_L16:
        if(s.equals("circumference"))
            byte0 = 6;
          goto _L36
_L34:
        if(s.equals("confidence"))
            byte0 = 7;
          goto _L36
_L32:
        if(s.equals("distance"))
            byte0 = 8;
          goto _L36
_L3:
        if(s.equals("duration"))
            byte0 = 9;
          goto _L36
_L31:
        if(s.equals("edge_type"))
            byte0 = 10;
          goto _L36
_L8:
        if(s.equals("food_item"))
            byte0 = 11;
          goto _L36
_L7:
        if(s.equals("height"))
            byte0 = 12;
          goto _L36
_L14:
        if(s.equals("high_latitude"))
            byte0 = 13;
          goto _L36
_L12:
        if(s.equals("high_longitude"))
            byte0 = 14;
          goto _L36
_L6:
        if(s.equals("latitude"))
            byte0 = 15;
          goto _L36
_L29:
        if(s.equals("longitude"))
            byte0 = 16;
          goto _L36
_L30:
        if(s.equals("low_latitude"))
            byte0 = 17;
          goto _L36
_L13:
        if(s.equals("low_longitude"))
            byte0 = 18;
          goto _L36
_L23:
        if(s.equals("max"))
            byte0 = 19;
          goto _L36
_L15:
        if(s.equals("meal_type"))
            byte0 = 20;
          goto _L36
_L24:
        if(s.equals("min"))
            byte0 = 21;
          goto _L36
_L5:
        if(s.equals("num_segments"))
            byte0 = 22;
          goto _L36
_L17:
        if(s.equals("nutrients"))
            byte0 = 23;
          goto _L36
_L9:
        if(s.equals("percentage"))
            byte0 = 24;
          goto _L36
_L33:
        if(s.equals("revolutions"))
            byte0 = 25;
          goto _L36
_L25:
        if(s.equals("rpm"))
            byte0 = 26;
          goto _L36
_L26:
        if(s.equals("speed"))
            byte0 = 27;
          goto _L36
_L27:
        if(s.equals("steps"))
            byte0 = 28;
          goto _L36
_L28:
        if(s.equals("watts"))
            byte0 = 29;
          goto _L36
_L10:
        if(s.equals("weight"))
            byte0 = 30;
          goto _L36
_L19:
        if(s.equals("x"))
            byte0 = 31;
          goto _L36
_L20:
        if(s.equals("y"))
            byte0 = 32;
          goto _L36
        if(s.equals("z"))
            byte0 = 33;
          goto _L36
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof Field) && zza((Field)obj);
    }

    public int getFormat()
    {
        return zzadw;
    }

    public String getName()
    {
        return mName;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return mName.hashCode();
    }

    public String toString()
    {
        String s1 = mName;
        String s;
        if(zzadw == 1)
            s = "i";
        else
            s = "f";
        return String.format("%s(%s)", new Object[] {
            s1, s
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzi();
    public static final Field FIELD_ACCURACY = zzco("accuracy");
    public static final Field FIELD_ACTIVITY = zzcn("activity");
    public static final Field FIELD_ALTITUDE = zzco("altitude");
    public static final Field FIELD_AVERAGE = zzco("average");
    public static final Field FIELD_BPM = zzco("bpm");
    public static final Field FIELD_CALORIES = zzco("calories");
    public static final Field FIELD_CIRCUMFERENCE = zzco("circumference");
    public static final Field FIELD_CONFIDENCE = zzco("confidence");
    public static final Field FIELD_DISTANCE = zzco("distance");
    public static final Field FIELD_DURATION = zzcn("duration");
    public static final Field FIELD_FOOD_ITEM = zzcp("food_item");
    public static final Field FIELD_HEIGHT = zzco("height");
    public static final Field FIELD_HIGH_LATITUDE = zzco("high_latitude");
    public static final Field FIELD_HIGH_LONGITUDE = zzco("high_longitude");
    public static final Field FIELD_LATITUDE = zzco("latitude");
    public static final Field FIELD_LONGITUDE = zzco("longitude");
    public static final Field FIELD_LOW_LATITUDE = zzco("low_latitude");
    public static final Field FIELD_LOW_LONGITUDE = zzco("low_longitude");
    public static final Field FIELD_MAX = zzco("max");
    public static final Field FIELD_MEAL_TYPE = zzcn("meal_type");
    public static final Field FIELD_MIN = zzco("min");
    public static final Field FIELD_NUM_SEGMENTS = zzcn("num_segments");
    public static final Field FIELD_NUTRIENTS = zzcq("nutrients");
    public static final Field FIELD_PERCENTAGE = zzco("percentage");
    public static final Field FIELD_REVOLUTIONS = zzcn("revolutions");
    public static final Field FIELD_RPM = zzco("rpm");
    public static final Field FIELD_SPEED = zzco("speed");
    public static final Field FIELD_STEPS = zzcn("steps");
    public static final Field FIELD_WATTS = zzco("watts");
    public static final Field FIELD_WEIGHT = zzco("weight");
    public static final int FORMAT_FLOAT = 2;
    public static final int FORMAT_INT32 = 1;
    public static final int FORMAT_MAP = 4;
    public static final int FORMAT_STRING = 3;
    public static final int MEAL_TYPE_BREAKFAST = 1;
    public static final int MEAL_TYPE_DINNER = 3;
    public static final int MEAL_TYPE_LUNCH = 2;
    public static final int MEAL_TYPE_SNACK = 4;
    public static final int MEAL_TYPE_UNKNOWN = 0;
    public static final String NUTRIENT_CALCIUM = "calcium";
    public static final String NUTRIENT_CALORIES = "calories";
    public static final String NUTRIENT_CHOLESTEROL = "cholesterol";
    public static final String NUTRIENT_DIETARY_FIBER = "dietary_fiber";
    public static final String NUTRIENT_IRON = "iron";
    public static final String NUTRIENT_MONOUNSATURATED_FAT = "fat.monounsaturated";
    public static final String NUTRIENT_POLYUNSATURATED_FAT = "fat.polyunsaturated";
    public static final String NUTRIENT_POTASSIUM = "potassium";
    public static final String NUTRIENT_PROTEIN = "protein";
    public static final String NUTRIENT_SATURATED_FAT = "fat.saturated";
    public static final String NUTRIENT_SODIUM = "sodium";
    public static final String NUTRIENT_SUGAR = "sugar";
    public static final String NUTRIENT_TOTAL_CARBS = "carbs.total";
    public static final String NUTRIENT_TOTAL_FAT = "fat.total";
    public static final String NUTRIENT_TRANS_FAT = "fat.trans";
    public static final String NUTRIENT_VITAMIN_A = "vitamin_a";
    public static final String NUTRIENT_VITAMIN_C = "vitamin_c";
    public static final Field zzads = zzcn("edge_type");
    public static final Field zzadt = zzco("x");
    public static final Field zzadu = zzco("y");
    public static final Field zzadv = zzco("z");
    private final String mName;
    private final int zzadw;
    private final int zzzH;

}
