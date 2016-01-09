// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.notification;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.games.internal.notification:
//            GameNotification

public final class GameNotificationRef extends zzc
    implements GameNotification
{

    GameNotificationRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public long getId()
    {
        return getLong("_id");
    }

    public String getText()
    {
        return getString("text");
    }

    public String getTitle()
    {
        return getString("title");
    }

    public int getType()
    {
        return getInteger("type");
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("Id", Long.valueOf(getId())).zzg("NotificationId", zzrK()).zzg("Type", Integer.valueOf(getType())).zzg("Title", getTitle()).zzg("Ticker", zzrL()).zzg("Text", getText()).zzg("CoalescedText", zzrM()).zzg("isAcknowledged", Boolean.valueOf(zzrN())).zzg("isSilent", Boolean.valueOf(zzrO())).toString();
    }

    public String zzrK()
    {
        return getString("notification_id");
    }

    public String zzrL()
    {
        return getString("ticker");
    }

    public String zzrM()
    {
        return getString("coalesced_text");
    }

    public boolean zzrN()
    {
        return getInteger("acknowledged") > 0;
    }

    public boolean zzrO()
    {
        return getInteger("alert_level") == 0;
    }
}
