// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.adteck.lib;

import android.os.StrictMode;
import java.io.*;
import java.net.*;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package jp.co.cyberagent.adteck.lib:
//            HashtableEX, Logger

public class HTTPUtil
{

    public HTTPUtil()
    {
        httpURLConnection = null;
        url = null;
        buffer = new byte[0x20000];
        readByte = 0L;
        totalByte = 0L;
        responseCode = -1;
        contentType = null;
        post = null;
        method = "GET";
        headers = new HashtableEX();
    }

    public boolean close()
    {
        if(!isConnected())
        {
            return true;
        } else
        {
            httpURLConnection.disconnect();
            httpURLConnection = null;
            return true;
        }
    }

    public boolean connect(String s)
    {
        if(android.os.Build.VERSION.SDK_INT > 9)
            StrictMode.setThreadPolicy((new android.os.StrictMode.ThreadPolicy.Builder()).permitAll().build());
        close();
        Logger.trace(this, "connect", "connecting '%s'.", new Object[] {
            s
        });
        Object obj;
        try
        {
            obj = new URL(s);
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            Logger.error(this, "connect", "URL url is not valid.", new Object[0]);
            return false;
        }
        try
        {
            httpURLConnection = (HttpURLConnection)((URL) (obj)).openConnection();
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            s.printStackTrace();
            Logger.error(this, "connect", "'openConnection' failed.", new Object[0]);
            return false;
        }
        httpURLConnection.setInstanceFollowRedirects(true);
        try
        {
            httpURLConnection.setRequestMethod(method);
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            s.printStackTrace();
            Logger.error(this, "connect", "'setRequestMethod' failed.", new Object[0]);
            return false;
        }
        obj = headers.keySet().iterator();
        do
        {
            if(!((Iterator) (obj)).hasNext())
            {
                if(post != null && method == "POST")
                {
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setDoInput(true);
                    String s1;
                    try
                    {
                        obj = httpURLConnection.getOutputStream();
                        ((OutputStream) (obj)).write(post);
                        ((OutputStream) (obj)).flush();
                        ((OutputStream) (obj)).close();
                    }
                    // Misplaced declaration of an exception variable
                    catch(String s)
                    {
                        s.printStackTrace();
                        Logger.error(this, "connect", "set post data failed.", new Object[0]);
                        return false;
                    }
                }
                try
                {
                    httpURLConnection.connect();
                }
                // Misplaced declaration of an exception variable
                catch(String s)
                {
                    s.printStackTrace();
                    Logger.error(this, "connect", "'connect' failed.", new Object[0]);
                    return false;
                }
                contentType = httpURLConnection.getContentType();
                try
                {
                    responseCode = httpURLConnection.getResponseCode();
                }
                // Misplaced declaration of an exception variable
                catch(String s)
                {
                    Logger.error(this, "connect", "'getResponseCode' failed.", new Object[0]);
                    return false;
                }
                if(responseCode != 200)
                    Logger.trace(this, "connect", "response code is '%d'.", new Object[] {
                        Integer.valueOf(responseCode)
                    });
                url = s;
                totalByte = 0L;
                return true;
            }
            s1 = (String)((Iterator) (obj)).next();
            Logger.trace(this, "connect", "header '%s: %s' is set.", new Object[] {
                s1, headers.get(s1)
            });
            httpURLConnection.setRequestProperty(s1, (String)headers.get(s1));
        } while(true);
    }

    public byte[] getBuffer()
    {
        return buffer;
    }

    public long getContentLength()
    {
        long l;
        if(!isConnected())
        {
            Logger.notice(this, "getContentLength", "http status is not connected.", new Object[0]);
            l = -1L;
        } else
        {
            long l1 = httpURLConnection.getContentLength();
            l = l1;
            if(l1 < 0L)
            {
                Logger.trace(this, "getContentLength", "content length is '%d'.", new Object[] {
                    Long.valueOf(l1)
                });
                return -1L;
            }
        }
        return l;
    }

    public long getContentRemain()
    {
        long l = httpURLConnection.getContentLength();
        if(l < 0L)
        {
            Logger.notice(this, "getContentRemain", "invalid content length, already downloaded?.", new Object[0]);
            return -1L;
        } else
        {
            return l - totalByte;
        }
    }

    public long getReadByte()
    {
        return readByte;
    }

    public int getResponseCode()
    {
        return responseCode;
    }

    public long getTotalByte()
    {
        return totalByte;
    }

    public String getUrl()
    {
        return url;
    }

    public boolean isConnected()
    {
        return httpURLConnection != null;
    }

    public boolean isExist()
    {
        boolean flag = false;
        int i = getResponseCode();
        if(i == 200 || i == 202 || i == 206 || i == 416)
        {
            Logger.trace(this, "isExist", "'%s' is exist.", new Object[] {
                url
            });
            flag = true;
        }
        return flag;
    }

    public boolean isSuccess()
    {
        return responseCode >= 200 && responseCode < 300;
    }

    public long read()
    {
        if(!isConnected())
            return -1L;
        Object obj;
        try
        {
            obj = httpURLConnection.getInputStream();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            obj = httpURLConnection.getErrorStream();
        }
        if(obj == null)
        {
            Logger.error(jp/co/cyberagent/adteck/lib/HTTPUtil, "read", "failed to get input stream.", new Object[0]);
            readByte = -1L;
            return -1L;
        }
        try
        {
            readByte = ((InputStream) (obj)).read(buffer, 0, buffer.length);
        }
        catch(Exception exception)
        {
            readByte = -1L;
            Logger.error(jp/co/cyberagent/adteck/lib/HTTPUtil, "read", "failed to read from input stream.", new Object[0]);
            return readByte;
        }
        if(readByte > -1L)
            totalByte = totalByte + readByte;
        return readByte;
    }

    public void setBufferSize(int i)
    {
        buffer = new byte[i];
    }

    public boolean setHeader(String s, String s1)
    {
        if(s == null || s1 == null)
            Logger.warn(this, "setHeader", "key or val is empty.", new Object[0]);
        headers.put(s, s1);
        Logger.trace(this, "setHeader", "key '%s' val '%s' is set.", new Object[] {
            s, s1
        });
        return true;
    }

    public boolean setMethod(String s)
    {
        while(s == null || !s.equals("GET") && !s.equals("POST")) 
            return false;
        method = s;
        return true;
    }

    public boolean setPost(byte abyte0[])
    {
        post = abyte0;
        return true;
    }

    public static final String METHOD_GET = "GET";
    public static final String METHOD_POST = "POST";
    protected byte buffer[];
    protected String contentType;
    protected HashtableEX headers;
    protected HttpURLConnection httpURLConnection;
    protected String method;
    protected byte post[];
    protected long readByte;
    protected int responseCode;
    protected long totalByte;
    protected String url;
}
