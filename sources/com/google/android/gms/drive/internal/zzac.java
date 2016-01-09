// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.content.Context;
import android.os.*;
import android.util.Pair;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.drive.MetadataBuffer;
import com.google.android.gms.drive.events.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnEventResponse, zzx

public class zzac extends zzam.zza
{
    private static class zza extends Handler
    {

        private static void zza(zzl zzl1, QueryResultEventParcelable queryresulteventparcelable)
        {
            com.google.android.gms.common.data.DataHolder dataholder = queryresulteventparcelable.zznK();
            if(dataholder != null)
                zzl1.zza(new zzj(new MetadataBuffer(dataholder)) {

                    final MetadataBuffer zzYB;

            
            {
                zzYB = metadatabuffer;
                super();
            }
                }
);
            if(queryresulteventparcelable.zznL())
                zzl1.zzbF(queryresulteventparcelable.zznM());
        }

        public void handleMessage(Message message)
        {
            Object obj;
            switch(message.what)
            {
            default:
                zzx.zze(mContext, "EventCallback", "Don't know how to handle this event");
                return;

            case 1: // '\001'
                obj = (Pair)message.obj;
                break;
            }
            message = (zzf)((Pair) (obj)).first;
            obj = (DriveEvent)((Pair) (obj)).second;
            switch(((DriveEvent) (obj)).getType())
            {
            default:
                zzx.zzt("EventCallback", (new StringBuilder()).append("Unexpected event: ").append(obj).toString());
                return;

            case 1: // '\001'
                ((ChangeListener)message).onChange((ChangeEvent)obj);
                return;

            case 2: // '\002'
                ((CompletionListener)message).onCompletion((CompletionEvent)obj);
                return;

            case 3: // '\003'
                zza((zzl)message, (QueryResultEventParcelable)obj);
                return;

            case 4: // '\004'
                ((zzc)message).zza((ChangesAvailableEvent)obj);
                return;

            case 5: // '\005'
                ((zzi)message).zza((ProgressEvent)obj);
                break;
            }
        }

        public void zza(zzf zzf1, DriveEvent driveevent)
        {
            sendMessage(obtainMessage(1, new Pair(zzf1, driveevent)));
        }

        private final Context mContext;

        private zza(Looper looper, Context context)
        {
            super(looper);
            mContext = context;
        }

    }


    public zzac(Looper looper, Context context, int i, zzf zzf)
    {
        zzXh = i;
        zzYy = zzf;
        zzYz = new zza(looper, context);
    }

    public void zzbV(int i)
    {
        zzYA.add(Integer.valueOf(i));
    }

    public boolean zzbW(int i)
    {
        return zzYA.contains(Integer.valueOf(i));
    }

    public void zzc(OnEventResponse oneventresponse)
        throws RemoteException
    {
        oneventresponse = oneventresponse.zzob();
        boolean flag;
        if(zzXh == oneventresponse.getType())
            flag = true;
        else
            flag = false;
        zzv.zzP(flag);
        zzv.zzP(zzYA.contains(Integer.valueOf(oneventresponse.getType())));
        zzYz.zza(zzYy, oneventresponse);
    }

    private final int zzXh;
    private final List zzYA = new ArrayList();
    private final zzf zzYy;
    private final zza zzYz;
}
