// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush.model;

import com.growthpush.GrowthPushException;
import com.growthpush.utils.IOUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;
import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.*;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.growthpush.model:
//            Error

public class Model
{

    public Model()
    {
        TIMEOUT = 0x493e0;
        results = new HashMap();
        HttpConnectionParams.setConnectionTimeout(httpClient.getParams(), TIMEOUT);
        HttpConnectionParams.setSoTimeout(httpClient.getParams(), TIMEOUT);
    }

    private JSONObject request(HttpUriRequest httpurirequest)
    {
        Object obj;
        try
        {
            httpurirequest = httpClient.execute(httpurirequest);
        }
        // Misplaced declaration of an exception variable
        catch(HttpUriRequest httpurirequest)
        {
            throw new GrowthPushException((new StringBuilder("Feiled to execute HTTP request. ")).append(httpurirequest.getMessage()).toString(), httpurirequest);
        }
        obj = new JSONObject(IOUtils.toString(httpurirequest.getEntity().getContent()));
        int i;
        try
        {
            httpurirequest.getEntity().consumeContent();
        }
        // Misplaced declaration of an exception variable
        catch(HttpUriRequest httpurirequest)
        {
            throw new GrowthPushException((new StringBuilder("Failed to close connection. ")).append(httpurirequest.getMessage()).toString(), httpurirequest);
        }
        i = httpurirequest.getStatusLine().getStatusCode();
        if(i < 200 || i >= 300)
            throw new GrowthPushException((new Error(((JSONObject) (obj)))).getMessage());
        else
            return ((JSONObject) (obj));
        obj;
        throw new GrowthPushException((new StringBuilder("Failed to read HTTP response. ")).append(((IOException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        obj;
        try
        {
            httpurirequest.getEntity().consumeContent();
        }
        // Misplaced declaration of an exception variable
        catch(HttpUriRequest httpurirequest)
        {
            throw new GrowthPushException((new StringBuilder("Failed to close connection. ")).append(httpurirequest.getMessage()).toString(), httpurirequest);
        }
        throw obj;
        obj;
        throw new GrowthPushException((new StringBuilder("Failed to parse response JSON. ")).append(((JSONException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
    }

    public JSONObject post(String s, Map map)
    {
        ArrayList arraylist = new ArrayList();
        map = map.entrySet().iterator();
        do
        {
            if(!map.hasNext())
            {
                s = new HttpPost((new StringBuilder("https://api.growthpush.com/1/")).append(s).toString());
                s.setHeader("Accept", "application/json");
                java.util.Map.Entry entry;
                try
                {
                    s.setEntity(new UrlEncodedFormEntity(arraylist, "UTF-8"));
                }
                // Misplaced declaration of an exception variable
                catch(Map map) { }
                return request(s);
            }
            entry = (java.util.Map.Entry)map.next();
            arraylist.add(new BasicNameValuePair((String)entry.getKey(), String.valueOf(entry.getValue())));
        } while(true);
    }

    public JSONObject put(String s, Map map)
    {
        ArrayList arraylist = new ArrayList();
        map = map.entrySet().iterator();
        do
        {
            if(!map.hasNext())
            {
                s = new HttpPut((new StringBuilder("https://api.growthpush.com/1/")).append(s).toString());
                s.setHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                java.util.Map.Entry entry;
                try
                {
                    s.setEntity(new UrlEncodedFormEntity(arraylist, "UTF-8"));
                }
                // Misplaced declaration of an exception variable
                catch(Map map) { }
                return request(s);
            }
            entry = (java.util.Map.Entry)map.next();
            arraylist.add(new BasicNameValuePair((String)entry.getKey(), String.valueOf(entry.getValue())));
        } while(true);
    }

    private int TIMEOUT;
    private final HttpClient httpClient = new DefaultHttpClient();
    public HashMap results;
}
