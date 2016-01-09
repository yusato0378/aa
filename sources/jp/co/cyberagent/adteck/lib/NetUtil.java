// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.adteck.lib;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package jp.co.cyberagent.adteck.lib:
//            HTTPUtil, HashtableEX, StringEX, Logger, 
//            Hash, ByteArrayOutputStreamEX

public class NetUtil extends HTTPUtil
{

    public NetUtil()
    {
        params = new HashtableEX();
        mimes = new HashtableEX();
        filenames = new HashtableEX();
        result = null;
    }

    public static HashtableEX getParams(String s)
    {
        HashtableEX hashtableex = new HashtableEX();
        s = StringEX.preg_match("\\?(.+)$", s, 1);
        if(s != null)
        {
            s = StringEX.preg_split("&", s);
            int j = s.length;
            int i = 0;
            while(i < j) 
            {
                String s1 = s[i];
                ArrayList arraylist = new ArrayList();
                if(StringEX.preg_match(s1, "^(.*)=(.*)$", arraylist) && arraylist.size() >= 1)
                    if(arraylist.size() == 2)
                        hashtableex.set((String)arraylist.get(1), "");
                    else
                    if(arraylist.size() == 3)
                        hashtableex.set((String)arraylist.get(1), (String)arraylist.get(2));
                i++;
            }
        }
        return hashtableex;
    }

    public static String getPath(String s)
    {
        return split(s, 2);
    }

    public static String getSearch(String s)
    {
        return split(s, 4);
    }

    public static String makeQueryString(String s, String s1, String s2)
    {
        getParams(s).set(s1, s2);
        return null;
    }

    public static String makeQueryString(HashtableEX hashtableex)
    {
        if(hashtableex == null)
            return null;
        else
            return hashtableex.getQuery(true);
    }

    public static String makeUrl(String s, String s1)
    {
        return makeUrl(s, s1, null);
    }

    public static String makeUrl(String s, String s1, HashtableEX hashtableex)
    {
        String s2 = s1;
        if(!StringEX.preg_match("^\\/", s1))
            s2 = String.format("/%s", new Object[] {
                s1
            });
        if(hashtableex == null || hashtableex.size() == 0)
            s = String.format("%s%s", new Object[] {
                s, s2
            });
        else
        if(StringEX.preg_match("\\?", s2))
            s = String.format("%s%s&%s", new Object[] {
                s, s2, makeQueryString(hashtableex)
            });
        else
            s = String.format("%s%s?%s", new Object[] {
                s, s2, makeQueryString(hashtableex)
            });
        return String.format("http://%s", new Object[] {
            s
        });
    }

    public static String makeUrl(String s, HashtableEX hashtableex)
    {
        HashtableEX hashtableex1 = hashtableex;
        if(hashtableex == null)
            hashtableex1 = new HashtableEX();
        s = split(s);
        if(s == null)
        {
            Logger.error(jp/co/cyberagent/adteck/lib/NetUtil, "makeUrl", "failed to split url.", new Object[0]);
            return null;
        } else
        {
            return makeUrl(s[2], s[3], hashtableex1);
        }
    }

    public static String split(String s, int i)
    {
        s = split(s);
        if(i < 0 || s.length < i - 1)
            return null;
        else
            return s[i];
    }

    public static String[] split(String s)
    {
        ArrayList arraylist = new ArrayList();
        if(!StringEX.preg_match("^(.+?):\\/\\/(.+?)(\\/[^\\?#]*)\\??([^#]*)\\#?(.*)$", s, arraylist))
            return null;
        else
            return (String[])arraylist.toArray(new String[0]);
    }

    public byte[] get(String s)
    {
        setMethod("GET");
        String s2 = getQueryString();
        String s1 = s;
        if(s2 != null)
            s1 = String.format("%s?%s", new Object[] {
                s, s2
            });
        if(!connect(s1))
        {
            Logger.error(this, "get", "failed to connect.", new Object[0]);
            return null;
        }
        result = new ByteArrayOutputStream();
        do
        {
            int i = (int)read();
            if(i <= -1)
            {
                close();
                return result.toByteArray();
            }
            result.write(buffer, 0, i);
        } while(true);
    }

    protected String getBoundary()
    {
        String s = String.format("%d", new Object[] {
            Long.valueOf(System.currentTimeMillis() / 1000L)
        });
        String s1 = Hash.toString(Hash.md5(s));
        if(s1 == null)
        {
            Logger.warn(this, "getBoundary", "failed to get md5.", new Object[0]);
            return s;
        } else
        {
            return s1;
        }
    }

    protected byte[] getPostData()
    {
        String s;
        ByteArrayOutputStreamEX bytearrayoutputstreamex;
        s = String.format("---------------------------%s", new Object[] {
            getBoundary()
        });
        Logger.trace(String.format("[%s] boundary is '%s'.", new Object[] {
            getClass().getSimpleName(), s
        }));
        bytearrayoutputstreamex = new ByteArrayOutputStreamEX();
        if(params.size() <= 0) goto _L2; else goto _L1
_L1:
        String as[];
        int i;
        int j;
        as = params.getKeys();
        j = as.length;
        i = 0;
_L5:
        if(i < j) goto _L3; else goto _L2
_L2:
        bytearrayoutputstreamex.write(String.format("--%s--", new Object[] {
            s
        }));
        setHeader("Content-Type", String.format("multipart/form-data; boundary=%s", new Object[] {
            s
        }));
        return bytearrayoutputstreamex.toByteArray();
_L3:
        String s1;
        s1 = as[i];
        if(!params.isHashtableEX(s1))
            break; /* Loop/switch isn't completed */
_L6:
        i++;
        if(true) goto _L5; else goto _L4
_L4:
        bytearrayoutputstreamex.write(String.format("--%s\r\n", new Object[] {
            s
        }));
        if(mimes.has(s1))
        {
            Logger.trace(this, "getPostData", "key '%s' is byte[].", new Object[] {
                s1
            });
            bytearrayoutputstreamex.write(String.format("Content-Disposition: form-data; name=\"%s\"; filename=\"%s\"\r\n", new Object[] {
                s1, filenames.getString(s1, s1)
            }));
            bytearrayoutputstreamex.write(String.format("Content-Type: %s\r\n", new Object[] {
                mimes.getString(s1, "application/octet-stream")
            }));
            bytearrayoutputstreamex.write("\r\n");
            bytearrayoutputstreamex.write(params.getByteArray(s1));
        } else
        {
            Logger.trace(this, "getPostData", "key '%s' is string.", new Object[] {
                s1
            });
            bytearrayoutputstreamex.write(String.format("Content-Disposition: form-data; name=\"%s\"\r\n", new Object[] {
                s1
            }));
            bytearrayoutputstreamex.write("\r\n");
            bytearrayoutputstreamex.write(params.getString(s1));
        }
        bytearrayoutputstreamex.write("\r\n");
          goto _L6
        if(true) goto _L5; else goto _L7
_L7:
    }

    protected String getQueryString()
    {
        HashtableEX hashtableex = new HashtableEX();
        String as[] = params.getKeys();
        int j = as.length;
        int i = 0;
        do
        {
            if(i >= j)
                return makeQueryString(hashtableex);
            String s = as[i];
            if(!mimes.has(s) && !params.isHashtableEX(s))
                hashtableex.set(s, params.getString(s));
            i++;
        } while(true);
    }

    public byte[] getResult()
    {
        if(result == null)
        {
            Logger.error(this, "getResult", "result is null.", new Object[0]);
            return null;
        } else
        {
            return result.toByteArray();
        }
    }

    public String getString(String s)
    {
        return StringEX.toString(get(s));
    }

    public byte[] post(String s)
    {
        setMethod("POST");
        post = getPostData();
        if(!connect(s))
        {
            Logger.error(this, "post", "failed to connect.", new Object[0]);
            return null;
        }
        result = new ByteArrayOutputStream();
        do
        {
            int i = (int)read();
            if(i <= -1)
            {
                close();
                return result.toByteArray();
            }
            result.write(buffer, 0, i);
        } while(true);
    }

    public String postString(String s)
    {
        byte abyte0[] = post(s);
        if(abyte0 == null)
        {
            Logger.error(this, "postString", "failed to post '%s'.", new Object[] {
                s
            });
            return null;
        } else
        {
            return new String(abyte0, 0, abyte0.length);
        }
    }

    public boolean setHeader(HashtableEX hashtableex)
    {
        int i = 0;
        if(hashtableex == null)
        {
            Logger.error(this, "setHeader", "headers is null.", new Object[0]);
            return false;
        }
        String as[] = hashtableex.getKeys();
        int j = as.length;
        do
        {
            if(i >= j)
                return true;
            String s = as[i];
            setHeader(s, hashtableex.getString(s));
            i++;
        } while(true);
    }

    public void setMime(String s, String s1)
    {
        mimes.set(s, s1);
    }

    public boolean setParam(String s, int i)
    {
        params.set(s, i);
        return true;
    }

    public boolean setParam(String s, long l)
    {
        params.set(s, l);
        return true;
    }

    public boolean setParam(String s, String s1)
    {
        params.set(s, s1);
        return true;
    }

    public boolean setParams(HashtableEX hashtableex)
    {
        return params.merge(hashtableex);
    }

    protected HashtableEX filenames;
    protected HashtableEX mimes;
    protected HashtableEX params;
    protected ByteArrayOutputStream result;
}
