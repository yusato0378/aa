// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.games.internal.constants.TimeSpan;
import java.util.HashMap;

public final class ScoreSubmissionData
{
    public static final class Result
    {

        public String toString()
        {
            return zzu.zzq(this).zzg("RawScore", Long.valueOf(rawScore)).zzg("FormattedScore", formattedScore).zzg("ScoreTag", scoreTag).zzg("NewBest", Boolean.valueOf(newBest)).toString();
        }

        public final String formattedScore;
        public final boolean newBest;
        public final long rawScore;
        public final String scoreTag;

        public Result(long l, String s, String s1, boolean flag)
        {
            rawScore = l;
            formattedScore = s;
            scoreTag = s1;
            newBest = flag;
        }
    }


    public ScoreSubmissionData(DataHolder dataholder)
    {
        zzOJ = dataholder.getStatusCode();
        zzanp = new HashMap();
        int j = dataholder.getCount();
        boolean flag;
        if(j == 3)
            flag = true;
        else
            flag = false;
        zzv.zzQ(flag);
        for(int i = 0; i < j; i++)
        {
            int k = dataholder.zzaD(i);
            if(i == 0)
            {
                zzamL = dataholder.zzd("leaderboardId", i, k);
                zzagC = dataholder.zzd("playerId", i, k);
            }
            if(dataholder.zze("hasResult", i, k))
                zza(new Result(dataholder.zzb("rawScore", i, k), dataholder.zzd("formattedScore", i, k), dataholder.zzd("scoreTag", i, k), dataholder.zze("newBest", i, k)), dataholder.zzc("timeSpan", i, k));
        }

    }

    private void zza(Result result, int i)
    {
        zzanp.put(Integer.valueOf(i), result);
    }

    public String getLeaderboardId()
    {
        return zzamL;
    }

    public String getPlayerId()
    {
        return zzagC;
    }

    public Result getScoreResult(int i)
    {
        return (Result)zzanp.get(Integer.valueOf(i));
    }

    public String toString()
    {
        com.google.android.gms.common.internal.zzu.zza zza1 = zzu.zzq(this).zzg("PlayerId", zzagC).zzg("StatusCode", Integer.valueOf(zzOJ));
        int i = 0;
        while(i < 3) 
        {
            Object obj = (Result)zzanp.get(Integer.valueOf(i));
            zza1.zzg("TimesSpan", TimeSpan.zzeZ(i));
            if(obj == null)
                obj = "null";
            else
                obj = ((Result) (obj)).toString();
            zza1.zzg("Result", obj);
            i++;
        }
        return zza1.toString();
    }

    private static final String zzamJ[] = {
        "leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest", "scoreTag"
    };
    private int zzOJ;
    private String zzagC;
    private String zzamL;
    private HashMap zzanp;

}
