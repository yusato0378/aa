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

public class Event extends Model
{

    public Event()
    {
    }

    public Event(String s, String s1)
    {
        this();
        setName(s);
        setValue(s1);
    }

    private void setJsonObject(JSONObject jsonobject)
    {
        try
        {
            if(jsonobject.has("goalId"))
                setGoalId(jsonobject.getInt("goalId"));
            if(jsonobject.has("timestamp"))
                setTimeStamp(jsonobject.getLong("timestamp"));
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

    public long getClientId()
    {
        return clientId;
    }

    public int getGoalId()
    {
        return goalId;
    }

    public String getName()
    {
        return name;
    }

    public long getTimeStamp()
    {
        return timeStamp;
    }

    public String getValue()
    {
        return value;
    }

    public Event save(GrowthPush growthpush)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("clientId", Long.valueOf(growthpush.getClient().getId()));
        hashmap.put("code", growthpush.getClient().getCode());
        hashmap.put("name", name);
        hashmap.put("value", value);
        growthpush = post("events", hashmap);
        if(growthpush != null)
            setJsonObject(growthpush);
        return this;
    }

    public void setClientId(long l)
    {
        clientId = l;
    }

    public void setGoalId(int i)
    {
        goalId = i;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setTimeStamp(long l)
    {
        timeStamp = l;
    }

    public void setValue(String s)
    {
        value = s;
    }

    private long clientId;
    private int goalId;
    private String name;
    private long timeStamp;
    private String value;
}
