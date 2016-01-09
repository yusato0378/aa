// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.gn.plugin.notification;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import jp.co.cyberagent.gn.plugin.util.FileUtil;
import org.json.*;

public class NotificationParameter
{

    public NotificationParameter()
    {
        isShowDialog = false;
        notificationNumber = 0;
        title = null;
        text = null;
        tickerText = null;
        smallIconResourceName = null;
        largeIconBitmapName = null;
        defaults = -1;
        soundPathAndFilename = null;
        lightColor = 0;
        lightOnMs = 0;
        lightOffMs = 0;
        vibratePattern = null;
    }

    public Bitmap getLargeIconBitmap(Context context)
    {
        Object obj1 = null;
        Object obj = obj1;
        if(context != null)
        {
            obj = obj1;
            if(largeIconBitmapName != null)
            {
                obj = context.getResources();
                obj = BitmapFactory.decodeResource(((Resources) (obj)), ((Resources) (obj)).getIdentifier(largeIconBitmapName, null, context.getPackageName()));
            }
        }
        return ((Bitmap) (obj));
    }

    public int getSmallIconResourceId(Context context)
    {
        boolean flag = false;
        int i = ((flag) ? 1 : 0);
        if(context != null)
        {
            i = ((flag) ? 1 : 0);
            if(smallIconResourceName != null)
                i = context.getResources().getIdentifier(smallIconResourceName, null, context.getPackageName());
        }
        return i;
    }

    public Uri getSoundUri(Context context)
    {
        Uri uri = null;
        if(context != null)
            uri = FileUtil.getResourceFileUri(context.getPackageName(), soundPathAndFilename);
        return uri;
    }

    public boolean toParameter(String s)
    {
        Object obj;
        boolean flag;
        boolean flag1;
        obj = null;
        flag1 = false;
        flag = flag1;
        if(s == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            return false;
        }
        flag = flag1;
        if(jsonobject == null) goto _L2; else goto _L3
_L3:
        if(jsonobject.optInt("isShowDialog") == 0)
            flag = false;
        else
            flag = true;
        isShowDialog = flag;
        notificationNumber = jsonobject.optInt("notificationNumber");
        if(!jsonobject.isNull("title")) goto _L5; else goto _L4
_L4:
        s = null;
_L27:
        title = s;
        if(!jsonobject.isNull("text")) goto _L7; else goto _L6
_L6:
        s = null;
_L20:
        text = s;
        if(!jsonobject.isNull("tickerText")) goto _L9; else goto _L8
_L8:
        s = null;
_L21:
        tickerText = s;
        if(!jsonobject.isNull("smallIconResourceName")) goto _L11; else goto _L10
_L10:
        s = null;
_L22:
        smallIconResourceName = s;
        if(!jsonobject.isNull("largeIconBitmapName")) goto _L13; else goto _L12
_L12:
        s = null;
_L23:
        largeIconBitmapName = s;
        defaults = jsonobject.optInt("defaults");
        if(!jsonobject.isNull("soundPathAndFilename")) goto _L15; else goto _L14
_L14:
        s = obj;
_L24:
        soundPathAndFilename = s;
        lightColor = jsonobject.optInt("lightColor");
        lightOnMs = jsonobject.optInt("lightOnMs");
        lightOffMs = jsonobject.optInt("lightOffMs");
        s = jsonobject.optJSONArray("vibratePattern");
        if(s == null) goto _L17; else goto _L16
_L16:
        j = s.length();
        vibratePattern = new long[j];
        if(vibratePattern == null) goto _L17; else goto _L18
_L18:
        i = 0;
          goto _L19
_L5:
        s = jsonobject.optString("title");
        continue; /* Loop/switch isn't completed */
_L7:
        s = jsonobject.optString("text");
          goto _L20
_L9:
        s = jsonobject.optString("tickerText");
          goto _L21
_L11:
        s = jsonobject.optString("smallIconResourceName");
          goto _L22
_L13:
        s = jsonobject.optString("largeIconBitmapName");
          goto _L23
_L15:
        s = jsonobject.optString("soundPathAndFilename");
          goto _L24
_L25:
        vibratePattern[i] = s.optLong(i);
        i++;
_L19:
        if(i < j) goto _L25; else goto _L17
_L17:
        flag = true;
_L2:
        return flag;
        if(true) goto _L27; else goto _L26
_L26:
    }

    public String toString()
    {
        JSONObject jsonobject = new JSONObject();
        if(jsonobject == null)
            break MISSING_BLOCK_LABEL_216;
        JSONException jsonexception;
        JSONArray jsonarray;
        int i;
        int j;
        if(isShowDialog)
            i = 1;
        else
            i = 0;
        jsonobject.put("isShowDialog", i);
        jsonobject.put("notificationNumber", notificationNumber);
        jsonobject.put("title", title);
        jsonobject.put("text", text);
        jsonobject.put("tickerText", tickerText);
        jsonobject.put("smallIconResourceName", smallIconResourceName);
        jsonobject.put("largeIconBitmapName", largeIconBitmapName);
        jsonobject.put("defaults", defaults);
        jsonobject.put("soundPathAndFilename", soundPathAndFilename);
        jsonobject.put("lightColor", lightColor);
        jsonobject.put("lightOnMs", lightOnMs);
        jsonobject.put("lightOffMs", lightOffMs);
        if(vibratePattern == null) goto _L2; else goto _L1
_L1:
        jsonarray = new JSONArray();
        if(jsonarray == null) goto _L2; else goto _L3
_L3:
        j = vibratePattern.length;
        i = 0;
_L7:
        if(i < j) goto _L5; else goto _L4
_L4:
        jsonobject.put("vibratePattern", jsonarray);
_L2:
        return jsonobject.toString();
_L5:
        jsonarray.put(vibratePattern[i]);
        i++;
        if(true) goto _L7; else goto _L6
_L6:
        jsonexception;
        return null;
    }

    public int defaults;
    public boolean isShowDialog;
    public String largeIconBitmapName;
    public int lightColor;
    public int lightOffMs;
    public int lightOnMs;
    public int notificationNumber;
    public String smallIconResourceName;
    public String soundPathAndFilename;
    public String text;
    public String tickerText;
    public String title;
    public long vibratePattern[];
}
