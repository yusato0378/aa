// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.*;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzdp, zzdn

public class zzdo extends Handler
{

    public zzdo(Context context)
    {
        this(((zzdn) (new zzdp(context))));
    }

    public zzdo(zzdn zzdn1)
    {
        zzxg = zzdn1;
    }

    private void zzc(JSONObject jsonobject)
    {
        try
        {
            zzxg.zza(jsonobject.getString("request_id"), jsonobject.getString("base_url"), jsonobject.getString("html"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch(JSONObject jsonobject)
        {
            return;
        }
    }

    public void handleMessage(Message message)
    {
        message = message.getData();
        if(message == null)
            return;
        try
        {
            message = new JSONObject(message.getString("data"));
            if("fetch_html".equals(message.getString("message_name")))
            {
                zzc(message);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch(Message message) { }
        return;
    }

    private final zzdn zzxg;
}
