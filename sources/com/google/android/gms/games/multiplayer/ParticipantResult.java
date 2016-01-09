// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.games.internal.constants.MatchResult;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            ParticipantResultCreator

public final class ParticipantResult
    implements SafeParcelable
{

    public ParticipantResult(int i, String s, int j, int k)
    {
        zzzH = i;
        zzaiJ = (String)zzv.zzr(s);
        zzv.zzP(MatchResult.isValid(j));
        zzanA = j;
        zzanB = k;
    }

    public ParticipantResult(String s, int i, int j)
    {
        this(1, s, i, j);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getParticipantId()
    {
        return zzaiJ;
    }

    public int getPlacing()
    {
        return zzanB;
    }

    public int getResult()
    {
        return zzanA;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ParticipantResultCreator.zza(this, parcel, i);
    }

    public static final ParticipantResultCreator CREATOR = new ParticipantResultCreator();
    public static final int MATCH_RESULT_DISAGREED = 5;
    public static final int MATCH_RESULT_DISCONNECT = 4;
    public static final int MATCH_RESULT_LOSS = 1;
    public static final int MATCH_RESULT_NONE = 3;
    public static final int MATCH_RESULT_TIE = 2;
    public static final int MATCH_RESULT_UNINITIALIZED = -1;
    public static final int MATCH_RESULT_WIN = 0;
    public static final int PLACING_UNINITIALIZED = -1;
    private final String zzaiJ;
    private final int zzanA;
    private final int zzanB;
    private final int zzzH;

}
