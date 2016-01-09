// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.content.IntentSender;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.drive.*;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzs, CreateFileIntentSenderRequest, zzak

public class zzj
{

    public zzj(int i)
    {
        zzXv = i;
    }

    public IntentSender build(GoogleApiClient googleapiclient)
    {
        zzv.zzb(zzXt, "Must provide initial metadata to CreateFileActivityBuilder.");
        zzv.zza(googleapiclient.isConnected(), "Client must be connected");
        googleapiclient = (zzs)googleapiclient.zza(Drive.zzKh);
        zzXt.zznz().setContext(googleapiclient.getContext());
        int i;
        if(zzXu == null)
            i = 0;
        else
            i = zzXu.intValue();
        try
        {
            googleapiclient = googleapiclient.zznO().zza(new CreateFileIntentSenderRequest(zzXt.zznz(), i, zzWn, zzWq, zzXv));
        }
        // Misplaced declaration of an exception variable
        catch(GoogleApiClient googleapiclient)
        {
            throw new RuntimeException("Unable to connect Drive Play Service", googleapiclient);
        }
        return googleapiclient;
    }

    public void zza(DriveId driveid)
    {
        zzWq = (DriveId)zzv.zzr(driveid);
    }

    public void zza(MetadataChangeSet metadatachangeset)
    {
        zzXt = (MetadataChangeSet)zzv.zzr(metadatachangeset);
    }

    public void zzbO(int i)
    {
        zzXu = Integer.valueOf(i);
    }

    public void zzcc(String s)
    {
        zzWn = (String)zzv.zzr(s);
    }

    private String zzWn;
    private DriveId zzWq;
    protected MetadataChangeSet zzXt;
    private Integer zzXu;
    private final int zzXv;
}
