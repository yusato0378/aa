// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness;


public class FitnessActivities
{

    FitnessActivities()
    {
    }

    public static String getMimeType(String s)
    {
        return (new StringBuilder()).append("vnd.google.fitness.activity/").append(s).toString();
    }

    public static String getName(int i)
    {
        String s;
        if(i < 0 || i >= zzacB.length)
        {
            s = "unknown";
        } else
        {
            String s1 = zzacB[i];
            s = s1;
            if(s1 == null)
                return "unknown";
        }
        return s;
    }

    public static int zzcl(String s)
    {
        for(int i = 0; i < zzacB.length; i++)
            if(zzacB[i].equals(s))
                return i;

        return 4;
    }

    public static final String AEROBICS = "aerobics";
    public static final String BADMINTON = "badminton";
    public static final String BASEBALL = "baseball";
    public static final String BASKETBALL = "basketball";
    public static final String BIATHLON = "biathlon";
    public static final String BIKING = "biking";
    public static final String BIKING_HAND = "biking.hand";
    public static final String BIKING_MOUNTAIN = "biking.mountain";
    public static final String BIKING_ROAD = "biking.road";
    public static final String BIKING_SPINNING = "biking.spinning";
    public static final String BIKING_STATIONARY = "biking.stationary";
    public static final String BIKING_UTILITY = "biking.utility";
    public static final String BOXING = "boxing";
    public static final String CALISTHENICS = "calisthenics";
    public static final String CIRCUIT_TRAINING = "circuit_training";
    public static final String CRICKET = "cricket";
    public static final String CURLING = "curling";
    public static final String DANCING = "dancing";
    public static final String DIVING = "diving";
    public static final String ELLIPTICAL = "elliptical";
    public static final String ERGOMETER = "ergometer";
    public static final String EXTRA_STATUS = "actionStatus";
    public static final String FENCING = "fencing";
    public static final String FOOTBALL_AMERICAN = "football.american";
    public static final String FOOTBALL_AUSTRALIAN = "football.australian";
    public static final String FOOTBALL_SOCCER = "football.soccer";
    public static final String FRISBEE_DISC = "frisbee_disc";
    public static final String GARDENING = "gardening";
    public static final String GOLF = "golf";
    public static final String GYMNASTICS = "gymnastics";
    public static final String HANDBALL = "handball";
    public static final String HIKING = "hiking";
    public static final String HOCKEY = "hockey";
    public static final String HORSEBACK_RIDING = "horseback_riding";
    public static final String HOUSEWORK = "housework";
    public static final String ICE_SKATING = "ice_skating";
    public static final String IN_VEHICLE = "in_vehicle";
    public static final String JUMP_ROPE = "jump_rope";
    public static final String KAYAKING = "kayaking";
    public static final String KETTLEBELL_TRAINING = "kettlebell_training";
    public static final String KICKBOXING = "kickboxing";
    public static final String KICK_SCOOTER = "kick_scooter";
    public static final String KITESURFING = "kitesurfing";
    public static final String MARTIAL_ARTS = "martial_arts";
    public static final String MEDITATION = "meditation";
    public static final String MIME_TYPE_PREFIX = "vnd.google.fitness.activity/";
    public static final String MIXED_MARTIAL_ARTS = "martial_arts.mixed";
    public static final String ON_FOOT = "on_foot";
    public static final String OTHER = "other";
    public static final String P90X = "p90x";
    public static final String PARAGLIDING = "paragliding";
    public static final String PILATES = "pilates";
    public static final String POLO = "polo";
    public static final String RACQUETBALL = "racquetball";
    public static final String ROCK_CLIMBING = "rock_climbing";
    public static final String ROWING = "rowing";
    public static final String ROWING_MACHINE = "rowing.machine";
    public static final String RUGBY = "rugby";
    public static final String RUNNING = "running";
    public static final String RUNNING_JOGGING = "running.jogging";
    public static final String RUNNING_SAND = "running.sand";
    public static final String RUNNING_TREADMILL = "running.treadmill";
    public static final String SAILING = "sailing";
    public static final String SCUBA_DIVING = "scuba_diving";
    public static final String SKATEBOARDING = "skateboarding";
    public static final String SKATING = "skating";
    public static final String SKATING_CROSS = "skating.cross";
    public static final String SKATING_INDOOR = "skating.indoor";
    public static final String SKATING_INLINE = "skating.inline";
    public static final String SKIING = "skiing";
    public static final String SKIING_BACK_COUNTRY = "skiing.back_country";
    public static final String SKIING_CROSS_COUNTRY = "skiing.cross_country";
    public static final String SKIING_DOWNHILL = "skiing.downhill";
    public static final String SKIING_KITE = "skiing.kite";
    public static final String SKIING_ROLLER = "skiing.roller";
    public static final String SLEDDING = "sledding";
    public static final String SLEEP = "sleep";
    public static final String SLEEP_AWAKE = "sleep.awake";
    public static final String SLEEP_DEEP = "sleep.deep";
    public static final String SLEEP_LIGHT = "sleep.light";
    public static final String SLEEP_REM = "sleep.rem";
    public static final String SNOWBOARDING = "snowboarding";
    public static final String SNOWMOBILE = "snowmobile";
    public static final String SNOWSHOEING = "snowshoeing";
    public static final String SQUASH = "squash";
    public static final String STAIR_CLIMBING = "stair_climbing";
    public static final String STAIR_CLIMBING_MACHINE = "stair_climbing.machine";
    public static final String STANDUP_PADDLEBOARDING = "standup_paddleboarding";
    public static final String STATUS_ACTIVE = "ActiveActionStatus";
    public static final String STATUS_COMPLETED = "CompletedActionStatus";
    public static final String STILL = "still";
    public static final String STRENGTH_TRAINING = "strength_training";
    public static final String SURFING = "surfing";
    public static final String SWIMMING = "swimming";
    public static final String SWIMMING_OPEN_WATER = "swimming.open_water";
    public static final String SWIMMING_POOL = "swimming.pool";
    public static final String TABLE_TENNIS = "table_tennis";
    public static final String TEAM_SPORTS = "team_sports";
    public static final String TENNIS = "tennis";
    public static final String TILTING = "tilting";
    public static final String TREADMILL = "treadmill";
    public static final String UNKNOWN = "unknown";
    public static final String VOLLEYBALL = "volleyball";
    public static final String VOLLEYBALL_BEACH = "volleyball.beach";
    public static final String VOLLEYBALL_INDOOR = "volleyball.indoor";
    public static final String WAKEBOARDING = "wakeboarding";
    public static final String WALKING = "walking";
    public static final String WALKING_FITNESS = "walking.fitness";
    public static final String WALKING_NORDIC = "walking.nordic";
    public static final String WALKING_TREADMILL = "walking.treadmill";
    public static final String WATER_POLO = "water_polo";
    public static final String WEIGHTLIFTING = "weightlifting";
    public static final String WHEELCHAIR = "wheelchair";
    public static final String WINDSURFING = "windsurfing";
    public static final String YOGA = "yoga";
    public static final String ZUMBA = "zumba";
    private static final String zzacB[];

    static 
    {
        zzacB = new String[113];
        zzacB[9] = "aerobics";
        zzacB[10] = "badminton";
        zzacB[11] = "baseball";
        zzacB[12] = "basketball";
        zzacB[13] = "biathlon";
        zzacB[1] = "biking";
        zzacB[14] = "biking.hand";
        zzacB[15] = "biking.mountain";
        zzacB[16] = "biking.road";
        zzacB[17] = "biking.spinning";
        zzacB[18] = "biking.stationary";
        zzacB[19] = "biking.utility";
        zzacB[20] = "boxing";
        zzacB[21] = "calisthenics";
        zzacB[22] = "circuit_training";
        zzacB[23] = "cricket";
        zzacB[106] = "curling";
        zzacB[24] = "dancing";
        zzacB[102] = "diving";
        zzacB[25] = "elliptical";
        zzacB[103] = "ergometer";
        zzacB[6] = "exiting_vehicle";
        zzacB[26] = "fencing";
        zzacB[27] = "football.american";
        zzacB[28] = "football.australian";
        zzacB[29] = "football.soccer";
        zzacB[30] = "frisbee_disc";
        zzacB[31] = "gardening";
        zzacB[32] = "golf";
        zzacB[33] = "gymnastics";
        zzacB[34] = "handball";
        zzacB[35] = "hiking";
        zzacB[36] = "hockey";
        zzacB[37] = "horseback_riding";
        zzacB[38] = "housework";
        zzacB[104] = "ice_skating";
        zzacB[0] = "in_vehicle";
        zzacB[39] = "jump_rope";
        zzacB[40] = "kayaking";
        zzacB[41] = "kettlebell_training";
        zzacB[107] = "kick_scooter";
        zzacB[42] = "kickboxing";
        zzacB[43] = "kitesurfing";
        zzacB[44] = "martial_arts";
        zzacB[45] = "meditation";
        zzacB[46] = "martial_arts.mixed";
        zzacB[2] = "on_foot";
        zzacB[108] = "other";
        zzacB[47] = "p90x";
        zzacB[48] = "paragliding";
        zzacB[49] = "pilates";
        zzacB[50] = "polo";
        zzacB[51] = "racquetball";
        zzacB[52] = "rock_climbing";
        zzacB[53] = "rowing";
        zzacB[54] = "rowing.machine";
        zzacB[55] = "rugby";
        zzacB[8] = "running";
        zzacB[56] = "running.jogging";
        zzacB[57] = "running.sand";
        zzacB[58] = "running.treadmill";
        zzacB[59] = "sailing";
        zzacB[60] = "scuba_diving";
        zzacB[61] = "skateboarding";
        zzacB[62] = "skating";
        zzacB[63] = "skating.cross";
        zzacB[105] = "skating.indoor";
        zzacB[64] = "skating.inline";
        zzacB[65] = "skiing";
        zzacB[66] = "skiing.back_country";
        zzacB[67] = "skiing.cross_country";
        zzacB[68] = "skiing.downhill";
        zzacB[69] = "skiing.kite";
        zzacB[70] = "skiing.roller";
        zzacB[71] = "sledding";
        zzacB[72] = "sleep";
        zzacB[109] = "sleep.light";
        zzacB[110] = "sleep.deep";
        zzacB[111] = "sleep.rem";
        zzacB[112] = "sleep.awake";
        zzacB[73] = "snowboarding";
        zzacB[74] = "snowmobile";
        zzacB[75] = "snowshoeing";
        zzacB[76] = "squash";
        zzacB[77] = "stair_climbing";
        zzacB[78] = "stair_climbing.machine";
        zzacB[79] = "standup_paddleboarding";
        zzacB[3] = "still";
        zzacB[80] = "strength_training";
        zzacB[81] = "surfing";
        zzacB[82] = "swimming";
        zzacB[83] = "swimming.pool";
        zzacB[84] = "swimming.open_water";
        zzacB[85] = "table_tennis";
        zzacB[86] = "team_sports";
        zzacB[87] = "tennis";
        zzacB[5] = "tilting";
        zzacB[88] = "treadmill";
        zzacB[4] = "unknown";
        zzacB[89] = "volleyball";
        zzacB[90] = "volleyball.beach";
        zzacB[91] = "volleyball.indoor";
        zzacB[92] = "wakeboarding";
        zzacB[7] = "walking";
        zzacB[93] = "walking.fitness";
        zzacB[94] = "walking.nordic";
        zzacB[95] = "walking.treadmill";
        zzacB[96] = "water_polo";
        zzacB[97] = "weightlifting";
        zzacB[98] = "wheelchair";
        zzacB[99] = "windsurfing";
        zzacB[100] = "yoga";
        zzacB[101] = "zumba";
    }
}
