// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.events;

import android.os.*;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.internal.zzan;
import com.google.android.gms.drive.internal.zzx;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.zzhy;
import com.google.android.gms.internal.zzig;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

// Referenced classes of package com.google.android.gms.drive.events:
//            ResourceEvent, zze

public final class CompletionEvent
    implements SafeParcelable, ResourceEvent
{

    CompletionEvent(int i, DriveId driveid, String s, ParcelFileDescriptor parcelfiledescriptor, ParcelFileDescriptor parcelfiledescriptor1, MetadataBundle metadatabundle, List list, 
            int j, IBinder ibinder)
    {
        zzWV = false;
        zzWW = false;
        zzWX = false;
        zzzH = i;
        zzVL = driveid;
        zzKw = s;
        zzWQ = parcelfiledescriptor;
        zzWR = parcelfiledescriptor1;
        zzWS = metadatabundle;
        zzWT = list;
        zzue = j;
        zzWU = ibinder;
    }

    private void zzR(boolean flag)
    {
        zznH();
        zzWX = true;
        zzhy.zza(zzWQ);
        zzhy.zza(zzWR);
        if(zzWS != null && zzWS.zzc(zzig.zzaak))
            ((BitmapTeleporter)zzWS.zza(zzig.zzaak)).release();
        if(zzWU == null)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("No callback on ");
            String s;
            if(flag)
                s = "snooze";
            else
                s = "dismiss";
            zzx.zzu("CompletionEvent", stringbuilder.append(s).toString());
            return;
        }
        try
        {
            com.google.android.gms.drive.internal.zzan.zza.zzae(zzWU).zzR(flag);
            return;
        }
        catch(RemoteException remoteexception)
        {
            StringBuilder stringbuilder1 = (new StringBuilder()).append("RemoteException on ");
            String s1;
            if(flag)
                s1 = "snooze";
            else
                s1 = "dismiss";
            zzx.zzu("CompletionEvent", stringbuilder1.append(s1).append(": ").append(remoteexception).toString());
            return;
        }
    }

    private void zznH()
    {
        if(zzWX)
            throw new IllegalStateException("Event has already been dismissed or snoozed.");
        else
            return;
    }

    public int describeContents()
    {
        return 0;
    }

    public void dismiss()
    {
        zzR(false);
    }

    public String getAccountName()
    {
        zznH();
        return zzKw;
    }

    public InputStream getBaseContentsInputStream()
    {
        zznH();
        if(zzWQ == null)
            return null;
        if(zzWV)
        {
            throw new IllegalStateException("getBaseInputStream() can only be called once per CompletionEvent instance.");
        } else
        {
            zzWV = true;
            return new FileInputStream(zzWQ.getFileDescriptor());
        }
    }

    public DriveId getDriveId()
    {
        zznH();
        return zzVL;
    }

    public InputStream getModifiedContentsInputStream()
    {
        zznH();
        if(zzWR == null)
            return null;
        if(zzWW)
        {
            throw new IllegalStateException("getModifiedInputStream() can only be called once per CompletionEvent instance.");
        } else
        {
            zzWW = true;
            return new FileInputStream(zzWR.getFileDescriptor());
        }
    }

    public MetadataChangeSet getModifiedMetadataChangeSet()
    {
        zznH();
        if(zzWS != null)
            return new MetadataChangeSet(zzWS);
        else
            return null;
    }

    public int getStatus()
    {
        zznH();
        return zzue;
    }

    public List getTrackingTags()
    {
        zznH();
        return new ArrayList(zzWT);
    }

    public int getType()
    {
        return 2;
    }

    public void snooze()
    {
        zzR(true);
    }

    public String toString()
    {
        String s;
        if(zzWT == null)
            s = "<null>";
        else
            s = (new StringBuilder()).append("'").append(TextUtils.join("','", zzWT)).append("'").toString();
        return String.format(Locale.US, "CompletionEvent [id=%s, status=%s, trackingTag=%s]", new Object[] {
            zzVL, Integer.valueOf(zzue), s
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zze();
    public static final int STATUS_CANCELED = 3;
    public static final int STATUS_CONFLICT = 2;
    public static final int STATUS_FAILURE = 1;
    public static final int STATUS_SUCCESS = 0;
    final String zzKw;
    final DriveId zzVL;
    final ParcelFileDescriptor zzWQ;
    final ParcelFileDescriptor zzWR;
    final MetadataBundle zzWS;
    final List zzWT;
    final IBinder zzWU;
    private boolean zzWV;
    private boolean zzWW;
    private boolean zzWX;
    final int zzue;
    final int zzzH;

}
