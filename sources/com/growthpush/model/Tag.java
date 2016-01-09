// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush.model;

import com.growthpush.GrowthPush;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.growthpush.model:
//            Model, Client

public class Tag extends Model
{

    public Tag()
    {
    }

    public Tag(String s, String s1)
    {
        this();
        setName(s);
        setValue(s1);
    }

    public long getClientId()
    {
        return clientId;
    }

    public JSONObject getJsonObject()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("tagId", getTagId());
            jsonobject.put("clientId", getClientId());
            jsonobject.put("value", getValue());
        }
        catch(JSONException jsonexception)
        {
            return jsonobject;
        }
        return jsonobject;
    }

    public String getName()
    {
        return name;
    }

    public int getTagId()
    {
        return tagId;
    }

    public String getValue()
    {
        return value;
    }

    public Tag save(GrowthPush growthpush)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("clientId", Long.valueOf(growthpush.getClient().getId()));
        hashmap.put("code", growthpush.getClient().getCode());
        hashmap.put("name", name);
        hashmap.put("value", value);
        growthpush = post("tags", hashmap);
        if(growthpush != null)
            setJsonObject(growthpush);
        return this;
    }

    public void setClientId(long l)
    {
        clientId = l;
    }

    public void setJsonObject(JSONObject jsonobject)
    {
        try
        {
            if(jsonobject.has("tagId"))
                setTagId(jsonobject.getInt("tagId"));
            if(jsonobject.has("clientId"))
                setClientId(jsonobject.getLong("clientId"));
            if(jsonobject.has("value"))
                setValue(jsonobject.getString("value"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch(JSONObject jsonobject)
        {
            throw new IllegalArgumentException("Failed to parse JSON.");
        }
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setTagId(int i)
    {
        tagId = i;
    }

    public void setValue(String s)
    {
        value = s;
    }

    private long clientId;
    private String name;
    private int tagId;
    private String value;
}
