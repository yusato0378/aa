// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush;

import android.content.Context;
import com.growthpush.model.Client;
import com.growthpush.model.Tag;
import com.growthpush.utils.IOUtils;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class Preference
{

    private Preference()
    {
        context = null;
        preferences = null;
    }

    private JSONObject fetch(String s)
    {
        try
        {
            s = getPreferences().getJSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            return null;
        }
        return s;
    }

    public static Preference getInstance()
    {
        return instance;
    }

    private JSONObject getPreferences()
    {
        this;
        JVM INSTR monitorenter ;
        if(context == null)
            throw new IllegalStateException("Context is null.");
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        JSONObject jsonobject = preferences;
        if(jsonobject != null)
            break MISSING_BLOCK_LABEL_56;
        try
        {
            preferences = new JSONObject(IOUtils.toString(context.openFileInput("growthpush-preferences")));
        }
        catch(IOException ioexception) { }
        catch(JSONException jsonexception) { }
        if(preferences == null)
            preferences = new JSONObject();
        jsonobject = preferences;
        this;
        JVM INSTR monitorexit ;
        return jsonobject;
    }

    private void save(String s, JSONObject jsonobject)
    {
        JSONObject jsonobject1 = getPreferences();
        try
        {
            jsonobject1.put(s, jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        try
        {
            s = context.openFileOutput("growthpush-preferences", 0);
            s.write(jsonobject1.toString().getBytes());
            s.flush();
        }
        // Misplaced declaration of an exception variable
        catch(String s) { }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void deleteClient()
    {
        save("client", null);
    }

    public void deleteTags()
    {
        save("tags", null);
    }

    public Client fetchClient()
    {
        JSONObject jsonobject = fetch("client");
        if(jsonobject == null)
        {
            return null;
        } else
        {
            Client client = new Client();
            client.setJsonObject(jsonobject);
            return client;
        }
    }

    public Tag fetchTag(String s)
    {
        JSONObject jsonobject;
        for(jsonobject = fetch("tags"); jsonobject == null || !jsonobject.has(s);)
            return null;

        Tag tag = new Tag();
        try
        {
            tag.setJsonObject(jsonobject.getJSONObject(s));
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            return tag;
        }
        return tag;
    }

    public void saveClient(Client client)
    {
        this;
        JVM INSTR monitorenter ;
        if(client != null)
            break MISSING_BLOCK_LABEL_21;
        throw new IllegalArgumentException("Argument client cannot be null.");
        client;
        this;
        JVM INSTR monitorexit ;
        throw client;
        save("client", client.getJsonObject());
        this;
        JVM INSTR monitorexit ;
    }

    public void saveTag(Tag tag)
    {
        this;
        JVM INSTR monitorenter ;
        if(tag != null)
            break MISSING_BLOCK_LABEL_21;
        throw new IllegalArgumentException("Argument tag cannot be null.");
        tag;
        this;
        JVM INSTR monitorexit ;
        throw tag;
        JSONObject jsonobject1 = fetch("tags");
        JSONObject jsonobject;
        jsonobject = jsonobject1;
        if(jsonobject1 != null)
            break MISSING_BLOCK_LABEL_42;
        jsonobject = new JSONObject();
        try
        {
            jsonobject.put(tag.getName(), tag.getJsonObject());
        }
        // Misplaced declaration of an exception variable
        catch(Tag tag) { }
        save("tags", jsonobject);
        this;
        JVM INSTR monitorexit ;
    }

    public void setContext(Context context1)
    {
        context = context1;
    }

    private static final String CLIENT_KEY = "client";
    private static final String FILE_NAME = "growthpush-preferences";
    private static final String TAG_KEY = "tags";
    private static Preference instance = new Preference();
    private Context context;
    private JSONObject preferences;

}
