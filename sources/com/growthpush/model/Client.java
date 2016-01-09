// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush.model;

import com.growthpush.GrowthPush;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.growthpush.model:
//            Model, Environment, ClientStatus

public class Client extends Model
{

    public Client()
    {
    }

    public Client(String s, Environment environment1)
    {
        this();
        setToken(s);
        setEnvironment(environment1);
    }

    public int getApplicationId()
    {
        return applicationId;
    }

    public String getCode()
    {
        return code;
    }

    public Date getCreated()
    {
        return created;
    }

    public Environment getEnvironment()
    {
        return environment;
    }

    public long getId()
    {
        return id;
    }

    public JSONObject getJsonObject()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("id", getId());
            jsonobject.put("applicationId", getApplicationId());
            jsonobject.put("code", getCode());
            jsonobject.put("token", getToken());
            if(getEnvironment() != null)
                jsonobject.put("environment", getEnvironment().toString());
            if(getStatus() != null)
                jsonobject.put("status", getStatus().toString());
            if(getCreated() != null)
                jsonobject.put("created", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(getCreated()));
        }
        catch(JSONException jsonexception)
        {
            return null;
        }
        return jsonobject;
    }

    public ClientStatus getStatus()
    {
        return status;
    }

    public String getToken()
    {
        return token;
    }

    public Client save(GrowthPush growthpush)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("applicationId", Integer.valueOf(growthpush.getApplicationId()));
        hashmap.put("secret", growthpush.getSecret());
        hashmap.put("token", token);
        hashmap.put("environment", environment.toString());
        hashmap.put("os", "android");
        growthpush = post("clients", hashmap);
        if(growthpush != null)
            setJsonObject(growthpush);
        return this;
    }

    public void setApplicationId(int i)
    {
        applicationId = i;
    }

    public void setCode(String s)
    {
        code = s;
    }

    public void setCreated(Date date)
    {
        created = date;
    }

    public void setEnvironment(Environment environment1)
    {
        environment = environment1;
    }

    public void setId(long l)
    {
        id = l;
    }

    public void setJsonObject(JSONObject jsonobject)
    {
        if(jsonobject != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        try
        {
            if(jsonobject.has("id"))
                setId(jsonobject.getLong("id"));
            if(jsonobject.has("applicationId"))
                setApplicationId(jsonobject.getInt("applicationId"));
            if(jsonobject.has("code"))
                setCode(jsonobject.getString("code"));
            if(jsonobject.has("token"))
                setToken(jsonobject.getString("token"));
            if(jsonobject.has("environment"))
                setEnvironment(Environment.valueOf(jsonobject.getString("environment")));
            if(jsonobject.has("status"))
                setStatus(ClientStatus.valueOf(jsonobject.getString("status")));
            flag = jsonobject.has("created");
        }
        // Misplaced declaration of an exception variable
        catch(JSONObject jsonobject)
        {
            throw new IllegalArgumentException("Failed to parse JSON.");
        }
        if(!flag) goto _L1; else goto _L3
_L3:
        setCreated((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).parse(jsonobject.getString("created")));
        return;
        jsonobject;
    }

    public void setStatus(ClientStatus clientstatus)
    {
        status = clientstatus;
    }

    public void setToken(String s)
    {
        token = s;
    }

    public Client update()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("code", code);
        hashmap.put("token", token);
        hashmap.put("environment", environment.toString());
        setJsonObject(put((new StringBuilder("clients/")).append(id).toString(), hashmap));
        return this;
    }

    private int applicationId;
    private String code;
    private Date created;
    private Environment environment;
    private long id;
    private ClientStatus status;
    private String token;
}
