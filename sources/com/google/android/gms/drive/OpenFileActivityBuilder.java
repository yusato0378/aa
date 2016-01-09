// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive;

import android.content.IntentSender;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.drive.internal.OpenFileIntentSenderRequest;
import com.google.android.gms.drive.internal.zzak;
import com.google.android.gms.drive.internal.zzs;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.internal.FilterHolder;

// Referenced classes of package com.google.android.gms.drive:
//            Drive, DriveId

public class OpenFileActivityBuilder
{

    public OpenFileActivityBuilder()
    {
    }

    public IntentSender build(GoogleApiClient googleapiclient)
    {
        zzv.zza(googleapiclient.isConnected(), "Client must be connected");
        if(zzWo == null)
            zzWo = new String[0];
        if(zzWo.length > 0 && zzWp != null)
            throw new IllegalStateException("Cannot use a selection filter and set mimetypes simultaneously");
        FilterHolder filterholder;
        if(zzWp == null)
            filterholder = null;
        else
            filterholder = new FilterHolder(zzWp);
        try
        {
            googleapiclient = ((zzs)googleapiclient.zza(Drive.zzKh)).zznO().zza(new OpenFileIntentSenderRequest(zzWn, zzWo, zzWq, filterholder));
        }
        // Misplaced declaration of an exception variable
        catch(GoogleApiClient googleapiclient)
        {
            throw new RuntimeException("Unable to connect Drive Play Service", googleapiclient);
        }
        return googleapiclient;
    }

    public OpenFileActivityBuilder setActivityStartFolder(DriveId driveid)
    {
        zzWq = (DriveId)zzv.zzr(driveid);
        return this;
    }

    public OpenFileActivityBuilder setActivityTitle(String s)
    {
        zzWn = (String)zzv.zzr(s);
        return this;
    }

    public OpenFileActivityBuilder setMimeType(String as[])
    {
        boolean flag;
        if(as != null)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "mimeTypes may not be null");
        zzWo = as;
        return this;
    }

    public static final String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
    private String zzWn;
    private String zzWo[];
    private Filter zzWp;
    private DriveId zzWq;
}
