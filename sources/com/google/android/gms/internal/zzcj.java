// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzh;
import java.util.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.internal:
//            zzcp

public final class zzcj
{

    public zzcj(JSONObject jsonobject)
        throws JSONException
    {
        Object obj1 = null;
        super();
        zzus = jsonobject.getString("id");
        Object obj = jsonobject.getJSONArray("adapters");
        ArrayList arraylist = new ArrayList(((JSONArray) (obj)).length());
        for(int i = 0; i < ((JSONArray) (obj)).length(); i++)
            arraylist.add(((JSONArray) (obj)).getString(i));

        zzut = Collections.unmodifiableList(arraylist);
        zzuu = jsonobject.optString("allocation_id", null);
        zzuw = zzh.zzba().zza(jsonobject, "clickurl");
        zzux = zzh.zzba().zza(jsonobject, "imp_urls");
        obj = jsonobject.optJSONObject("ad");
        if(obj != null)
            obj = ((JSONObject) (obj)).toString();
        else
            obj = null;
        zzur = ((String) (obj));
        obj = jsonobject.optJSONObject("data");
        if(obj != null)
            jsonobject = ((JSONObject) (obj)).toString();
        else
            jsonobject = null;
        zzuy = jsonobject;
        if(obj != null && !((JSONObject) (obj)).isNull("equivalent_ad_network_id"))
            zzuz = ((JSONObject) (obj)).optString("equivalent_ad_network_id", zzus);
        else
            zzuz = zzus;
        jsonobject = obj1;
        if(obj != null)
            jsonobject = ((JSONObject) (obj)).optString("class_name");
        zzuv = jsonobject;
    }

    public final String zzur;
    public final String zzus;
    public final List zzut;
    public final String zzuu;
    public final String zzuv;
    public final List zzuw;
    public final List zzux;
    public final String zzuy;
    public final String zzuz;
}
