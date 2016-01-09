// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.multiplayer.turnbased;


// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatch

public interface OnTurnBasedMatchUpdateReceivedListener
{

    public abstract void onTurnBasedMatchReceived(TurnBasedMatch turnbasedmatch);

    public abstract void onTurnBasedMatchRemoved(String s);
}
