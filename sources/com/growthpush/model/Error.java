// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush.model;

import org.json.JSONException;
import org.json.JSONObject;

public class Error
{

    public Error()
    {
    }

    public Error(int i, String s)
    {
        this();
        setCode(i);
        setMessage(s);
    }

    public Error(JSONObject jsonobject)
    {
        this();
        setJsonObject(jsonobject);
    }

    public int getCode()
    {
        return code;
    }

    public String getMessage()
    {
        return message;
    }

    public void setCode(int i)
    {
        code = i;
    }

    public void setJsonObject(JSONObject jsonobject)
    {
        try
        {
            if(jsonobject.has("code"))
                setCode(jsonobject.getInt("code"));
            if(jsonobject.has("message"))
                setMessage(jsonobject.getString("message"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch(JSONObject jsonobject)
        {
            throw new IllegalArgumentException("Failed to parse JSON.");
        }
    }

    public void setMessage(String s)
    {
        message = s;
    }

    private int code;
    private String message;
}
