// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.multiplayer;


// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Invitation

public interface OnInvitationReceivedListener
{

    public abstract void onInvitationReceived(Invitation invitation);

    public abstract void onInvitationRemoved(String s);
}
