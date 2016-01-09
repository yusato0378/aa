// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.gn.plugin.notification;

import org.json.JSONException;
import org.json.JSONObject;

public class NotificationDialogParameter
{

    public NotificationDialogParameter()
    {
        notificationId = -1;
        title = null;
        text = null;
        smallIconResourceId = 0;
    }

    public boolean toParameter(String s)
    {
        Object obj = null;
        if(s == null) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject = new JSONObject(s);
        if(jsonobject == null) goto _L2; else goto _L3
_L3:
        notificationId = jsonobject.optInt("notificationId");
        if(!jsonobject.isNull("title")) goto _L5; else goto _L4
_L4:
        s = null;
_L10:
        title = s;
        if(!jsonobject.isNull("text")) goto _L7; else goto _L6
_L6:
        s = obj;
_L8:
        text = s;
        smallIconResourceId = jsonobject.optInt("smallIconResourceId");
        return true;
_L5:
        try
        {
            s = jsonobject.optString("title");
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch(String s) { }
        break; /* Loop/switch isn't completed */
_L7:
        s = jsonobject.optString("text");
        if(true) goto _L8; else goto _L2
_L2:
        return false;
        if(true) goto _L10; else goto _L9
_L9:
    }

    public String toString()
    {
        String s = null;
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
        }
        catch(JSONException jsonexception)
        {
            return null;
        }
        if(jsonobject == null)
            break MISSING_BLOCK_LABEL_63;
        jsonobject.put("notificationId", notificationId);
        jsonobject.put("title", title);
        jsonobject.put("text", text);
        jsonobject.put("smallIconResourceId", smallIconResourceId);
        s = jsonobject.toString();
        return s;
    }

    public int notificationId;
    public int smallIconResourceId;
    public String text;
    public String title;
}
