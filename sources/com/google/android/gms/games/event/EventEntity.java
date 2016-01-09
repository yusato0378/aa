// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.zzhu;

// Referenced classes of package com.google.android.gms.games.event:
//            Event, EventEntityCreator

public final class EventEntity
    implements SafeParcelable, Event
{

    EventEntity(int i, String s, String s1, String s2, Uri uri, String s3, Player player, 
            long l, String s4, boolean flag)
    {
        zzzH = i;
        zzahE = s;
        mName = s1;
        zzadH = s2;
        zzafY = uri;
        zzagj = s3;
        zzaha = new PlayerEntity(player);
        zzahF = l;
        zzahG = s4;
        zzahH = flag;
    }

    public EventEntity(Event event)
    {
        zzzH = 1;
        zzahE = event.getEventId();
        mName = event.getName();
        zzadH = event.getDescription();
        zzafY = event.getIconImageUri();
        zzagj = event.getIconImageUrl();
        zzaha = (PlayerEntity)event.getPlayer().freeze();
        zzahF = event.getValue();
        zzahG = event.getFormattedValue();
        zzahH = event.isVisible();
    }

    static int zza(Event event)
    {
        return zzu.hashCode(new Object[] {
            event.getEventId(), event.getName(), event.getDescription(), event.getIconImageUri(), event.getIconImageUrl(), event.getPlayer(), Long.valueOf(event.getValue()), event.getFormattedValue(), Boolean.valueOf(event.isVisible())
        });
    }

    static boolean zza(Event event, Object obj)
    {
        boolean flag1 = true;
        if(obj instanceof Event) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(event == obj) goto _L4; else goto _L3
_L3:
        obj = (Event)obj;
        if(!zzu.equal(((Event) (obj)).getEventId(), event.getEventId()) || !zzu.equal(((Event) (obj)).getName(), event.getName()) || !zzu.equal(((Event) (obj)).getDescription(), event.getDescription()) || !zzu.equal(((Event) (obj)).getIconImageUri(), event.getIconImageUri()) || !zzu.equal(((Event) (obj)).getIconImageUrl(), event.getIconImageUrl()) || !zzu.equal(((Event) (obj)).getPlayer(), event.getPlayer()) || !zzu.equal(Long.valueOf(((Event) (obj)).getValue()), Long.valueOf(event.getValue())) || !zzu.equal(((Event) (obj)).getFormattedValue(), event.getFormattedValue()))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(Boolean.valueOf(((Event) (obj)).isVisible()), Boolean.valueOf(event.isVisible()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(Event event)
    {
        return zzu.zzq(event).zzg("Id", event.getEventId()).zzg("Name", event.getName()).zzg("Description", event.getDescription()).zzg("IconImageUri", event.getIconImageUri()).zzg("IconImageUrl", event.getIconImageUrl()).zzg("Player", event.getPlayer()).zzg("Value", Long.valueOf(event.getValue())).zzg("FormattedValue", event.getFormattedValue()).zzg("isVisible", Boolean.valueOf(event.isVisible())).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public Event freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public String getDescription()
    {
        return zzadH;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        zzhu.zzb(zzadH, chararraybuffer);
    }

    public String getEventId()
    {
        return zzahE;
    }

    public String getFormattedValue()
    {
        return zzahG;
    }

    public void getFormattedValue(CharArrayBuffer chararraybuffer)
    {
        zzhu.zzb(zzahG, chararraybuffer);
    }

    public Uri getIconImageUri()
    {
        return zzafY;
    }

    public String getIconImageUrl()
    {
        return zzagj;
    }

    public String getName()
    {
        return mName;
    }

    public void getName(CharArrayBuffer chararraybuffer)
    {
        zzhu.zzb(mName, chararraybuffer);
    }

    public Player getPlayer()
    {
        return zzaha;
    }

    public long getValue()
    {
        return zzahF;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zza(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public boolean isVisible()
    {
        return zzahH;
    }

    public String toString()
    {
        return zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        EventEntityCreator.zza(this, parcel, i);
    }

    public static final EventEntityCreator CREATOR = new EventEntityCreator();
    private final String mName;
    private final String zzadH;
    private final Uri zzafY;
    private final String zzagj;
    private final String zzahE;
    private final long zzahF;
    private final String zzahG;
    private final boolean zzahH;
    private final PlayerEntity zzaha;
    private final int zzzH;

}
