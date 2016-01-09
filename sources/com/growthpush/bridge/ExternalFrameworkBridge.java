// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush.bridge;

import android.os.Bundle;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class ExternalFrameworkBridge
{

    public ExternalFrameworkBridge()
    {
        customFileds = new ArrayList();
    }

    private String serializeCustomFiled(Bundle bundle)
    {
        JSONObject jsonobject;
        Iterator iterator;
        jsonobject = new JSONObject();
        iterator = bundle.keySet().iterator();
_L2:
        do
        {
            String s;
            String s1;
            if(!iterator.hasNext())
                if(jsonobject.toString() != null)
                    return jsonobject.toString();
                else
                    return null;
            s = (String)iterator.next();
            s1 = bundle.get(s).toString();
        } while(s.equals("showDialog") || s.equals("collapse_key") || s.equals("from"));
        if(s.equals("growthpush"))
        {
            jsonobject.put(s, new JSONObject(s1));
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            jsonobject.put(s, s1);
        }
        catch(JSONException jsonexception) { }
        if(true) goto _L2; else goto _L1
_L1:
    }

    protected abstract void callbackExternalFramework(String s);

    public void callbackExternalFrameworkWithExtra(Bundle bundle)
    {
        callbackExternalFramework(serializeCustomFiled(bundle));
    }

    public void callbackWithStoredCustomFiled()
    {
        if(!customFileds.isEmpty())
        {
            callbackExternalFramework((String)customFileds.get(0));
            customFileds.remove(0);
        }
    }

    protected List customFileds;
}
