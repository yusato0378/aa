// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.adteck.lib;

import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.*;

// Referenced classes of package jp.co.cyberagent.adteck.lib:
//            StringEX, Logger, Base64, ArrayUtil

public class HashtableEX extends Hashtable
{

    public HashtableEX()
    {
    }

    public HashtableEX(Rect rect)
    {
        if(rect == null)
        {
            return;
        } else
        {
            set("left", rect.left);
            set("top", rect.top);
            set("right", rect.right);
            set("bottom", rect.bottom);
            return;
        }
    }

    public HashtableEX(AttributeSet attributeset)
    {
        if(attributeset != null)
        {
            int i = 0;
            while(i < attributeset.getAttributeCount()) 
            {
                set(attributeset.getAttributeName(i), attributeset.getAttributeValue(i));
                i++;
            }
        }
    }

    public HashtableEX(String s, int i)
    {
        set(s, i);
    }

    public HashtableEX(String s, String s1)
    {
        set(s, s1);
    }

    public HashtableEX(String s, boolean flag)
    {
        set(s, flag);
    }

    public HashtableEX(ArrayList arraylist)
    {
        if(arraylist != null)
        {
            int i = 0;
            while(i < arraylist.size()) 
            {
                set(i, (String)arraylist.get(i));
                i++;
            }
        }
    }

    public HashtableEX(Hashtable hashtable)
    {
        if(hashtable != null)
        {
            Iterator iterator = hashtable.keySet().iterator();
            while(iterator.hasNext()) 
            {
                String s = (String)iterator.next();
                put(s, (String)hashtable.get(s));
            }
        }
    }

    public HashtableEX(Map map)
    {
        if(map != null)
        {
            Iterator iterator = map.keySet().iterator();
            while(iterator.hasNext()) 
            {
                String s = (String)iterator.next();
                put(s, (String)map.get(s));
            }
        }
    }

    public HashtableEX(HashtableEX hashtableex)
    {
        if(hashtableex != null)
        {
            String as[] = hashtableex.getKeys();
            int j = as.length;
            int i = 0;
            while(i < j) 
            {
                String s = as[i];
                put(s, (String)hashtableex.get(s));
                i++;
            }
        }
    }

    public HashtableEX(String as[])
    {
        if(as != null)
        {
            int i = 0;
            while(i < as.length) 
            {
                set(i, as[i]);
                i++;
            }
        }
    }

    public static boolean empty(HashtableEX hashtableex)
    {
        while(hashtableex == null || hashtableex.size() == 0) 
            return true;
        return false;
    }

    public static boolean empty(HashtableEX ahashtableex[])
    {
        return ahashtableex == null || ahashtableex.length == 0;
    }

    public static HashtableEX merge(HashtableEX hashtableex, HashtableEX hashtableex1)
    {
        if(empty(hashtableex))
        {
            return new HashtableEX(hashtableex1);
        } else
        {
            hashtableex = new HashtableEX(hashtableex);
            hashtableex.merge(hashtableex1);
            return hashtableex;
        }
    }

    public HashtableEX copy()
    {
        return new HashtableEX(this);
    }

    public boolean empty(int i)
    {
        return empty(String.format("%d", new Object[] {
            Integer.valueOf(i)
        }));
    }

    public boolean empty(String s)
    {
        return StringEX.empty(getString(s, ""));
    }

    public Intent get(Intent intent)
    {
        Logger.trace(String.format("[%s::%s] begin.", new Object[] {
            "HashtableEX", "putExtra"
        }));
        Iterator iterator = keySet().iterator();
        do
        {
            if(!iterator.hasNext())
            {
                Logger.trace(String.format("[%s::%s] end.", new Object[] {
                    "HashtableEX", "putExtra"
                }));
                return intent;
            }
            String s = (String)iterator.next();
            intent.putExtra(s, (String)get(s));
        } while(true);
    }

    public boolean getBoolean(int i)
    {
        return getBoolean(String.format("%d", new Object[] {
            Integer.valueOf(i)
        }));
    }

    public boolean getBoolean(String s)
    {
        return getBoolean(s, false);
    }

    public boolean getBoolean(String s, boolean flag)
    {
        if(!containsKey(s))
            return flag;
        if(getString(s).equals("true"))
            return true;
        return getInteger(s) != 0;
    }

    public Bundle getBundle()
    {
        Bundle bundle = new Bundle();
        String as[] = getKeys();
        int j = as.length;
        int i = 0;
        do
        {
            if(i >= j)
                return bundle;
            String s = as[i];
            bundle.putString(s, getString(s));
            i++;
        } while(true);
    }

    public byte[] getByteArray(int i)
    {
        return getByteArray(String.format("%d", new Object[] {
            Integer.valueOf(i)
        }));
    }

    public byte[] getByteArray(String s)
    {
        if(!isByteArray(s))
            return null;
        try
        {
            s = Base64.decode(getString(s));
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            return null;
        }
        return s;
    }

    public ContentValues getContentValue()
    {
        ContentValues contentvalues = new ContentValues();
        String as[] = getKeys();
        int j = as.length;
        int i = 0;
        do
        {
            if(i >= j)
                return contentvalues;
            String s = as[i];
            Logger.trace(this, "getContentValue", "key '%s', val length is '%d'.", new Object[] {
                s, Integer.valueOf(getString(s).length())
            });
            contentvalues.put(s, getString(s));
            i++;
        } while(true);
    }

    public double getDouble(String s)
    {
        return getDouble(s, 0.0F);
    }

    public double getDouble(String s, float f)
    {
        if(!containsKey(s))
            return (double)f;
        if(get(s) == null)
            return (double)f;
        else
            return MathUtil.Parse.parseDouble((String)get(s));
    }

    public float getFloat(int i)
    {
        return getFloat(String.format("%d", new Object[] {
            Integer.valueOf(i)
        }));
    }

    public float getFloat(String s)
    {
        return getFloat(s, 0.0F);
    }

    public float getFloat(String s, float f)
    {
        while(!containsKey(s) || get(s) == null) 
            return f;
        return MathUtil.Parse.parseFloat((String)get(s));
    }

    public Hashtable getHashtable()
    {
        Hashtable hashtable = new Hashtable();
        String as[] = getKeys();
        int j = as.length;
        int i = 0;
        do
        {
            if(i >= j)
                return hashtable;
            String s = as[i];
            hashtable.put(s, getString(s));
            i++;
        } while(true);
    }

    public int getInteger(int i)
    {
        return getInteger(String.format("%d", new Object[] {
            Integer.valueOf(i)
        }));
    }

    public int getInteger(String s)
    {
        return getInteger(s, 0);
    }

    public int getInteger(String s, int i)
    {
        while(!containsKey(s) || get(s) == null) 
            return i;
        return MathUtil.Parse.parseInt((String)get(s));
    }

    public Intent getIntent()
    {
        Intent intent = new Intent();
        String as[] = getKeys();
        int j = as.length;
        int i = 0;
        do
        {
            if(i >= j)
                return intent;
            String s = as[i];
            intent.putExtra(s, getString(s));
            i++;
        } while(true);
    }

    public String[] getKeys()
    {
        return (String[])keySet().toArray(new String[0]);
    }

    public long getLong(int i)
    {
        return getLong(String.format("%d", new Object[] {
            Integer.valueOf(i)
        }));
    }

    public long getLong(String s)
    {
        return getLong(s, 0L);
    }

    public long getLong(String s, long l)
    {
        while(!containsKey(s) || get(s) == null) 
            return l;
        return MathUtil.Parse.parseLong((String)get(s));
    }

    public String getQuery()
    {
        return getQuery(false);
    }

    public String getQuery(boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        String as[] = getKeys();
        int j = as.length;
        int i = 0;
        do
        {
            if(i >= j)
                return ArrayUtil.join("&", arraylist);
            String s2 = as[i];
            String s1 = getString(s2);
            String s = s1;
            if(flag)
                s = StringEX.urlencode(s1);
            arraylist.add(String.format("%s=%s", new Object[] {
                s2, s
            }));
            i++;
        } while(true);
    }

    public String getString(int i)
    {
        return getString(i, "");
    }

    public String getString(int i, String s)
    {
        return getString(String.format("%d", new Object[] {
            Integer.valueOf(i)
        }), s);
    }

    public String getString(String s)
    {
        return getString(s, "");
    }

    public String getString(String s, String s1)
    {
        if(!containsKey(s))
            return s1;
        else
            return (String)get(s);
    }

    public boolean has(int i)
    {
        return has(String.format("%d", new Object[] {
            Integer.valueOf(i)
        }));
    }

    public boolean has(String s)
    {
        if(s == null)
            return false;
        else
            return super.containsKey(s);
    }

    public boolean isByteArray(int i)
    {
        return isByteArray(String.format("%d", new Object[] {
            Integer.valueOf(i)
        }));
    }

    public boolean isByteArray(String s)
    {
        if(!has(s))
            return false;
        try
        {
            Base64.decode(getString(s));
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            return false;
        }
        return true;
    }

    public boolean isDouble(String s)
    {
        if(!has(s))
            return false;
        else
            return StringEX.isDouble(getString(s));
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public boolean isHashtableEX(String s)
    {
        return false;
    }

    public boolean isInteger(String s)
    {
        if(!has(s))
            return false;
        else
            return StringEX.isInt(getString(s));
    }

    public boolean isNumeric(String s)
    {
        if(!has(s))
            return false;
        else
            return StringEX.isNumeric(getString(s));
    }

    public boolean merge(HashtableEX hashtableex)
    {
        if(hashtableex == null)
            return false;
        Iterator iterator = hashtableex.keySet().iterator();
        do
        {
            if(!iterator.hasNext())
                return true;
            String s = (String)iterator.next();
            put(s, (String)hashtableex.get(s));
        } while(true);
    }

    public volatile Object put(Object obj, Object obj1)
    {
        return put((String)obj, (String)obj1);
    }

    public String put(int i, String s)
    {
        return put(String.format("%d", new Object[] {
            Integer.valueOf(i)
        }), s);
    }

    public String put(String s, String s1)
    {
        String s2 = s1;
        if(s1 == null)
            s2 = "";
        return (String)super.put(s, s2);
    }

    public String remove(int i)
    {
        return (String)super.remove(String.format("%d", new Object[] {
            Integer.valueOf(i)
        }));
    }

    public String set(int i, double d)
    {
        return set(String.format("%d", new Object[] {
            Integer.valueOf(i)
        }), d);
    }

    public String set(int i, float f)
    {
        return set(String.format("%d", new Object[] {
            Integer.valueOf(i)
        }), f);
    }

    public String set(int i, int j)
    {
        return set(String.format("%d", new Object[] {
            Integer.valueOf(i)
        }), j);
    }

    public String set(int i, String s)
    {
        return set(String.format("%d", new Object[] {
            Integer.valueOf(i)
        }), s);
    }

    public String set(int i, boolean flag)
    {
        return set(String.format("%d", new Object[] {
            Integer.valueOf(i)
        }), flag);
    }

    public String set(int i, byte abyte0[])
    {
        return set(String.format("%d", new Object[] {
            Integer.valueOf(i)
        }), abyte0);
    }

    public String set(String s, double d)
    {
        return put(s, String.format("%f", new Object[] {
            Double.valueOf(d)
        }));
    }

    public String set(String s, float f)
    {
        return put(s, String.format("%f", new Object[] {
            Float.valueOf(f)
        }));
    }

    public String set(String s, int i)
    {
        return put(s, String.format("%d", new Object[] {
            Integer.valueOf(i)
        }));
    }

    public String set(String s, long l)
    {
        return put(s, String.format("%d", new Object[] {
            Long.valueOf(l)
        }));
    }

    public String set(String s, String s1)
    {
        if(s1 == null)
            s1 = "";
        return put(s, s1);
    }

    public String set(String s, boolean flag)
    {
        String s1;
        if(flag)
            s1 = "true";
        else
            s1 = "false";
        return put(s, s1);
    }

    public String set(String s, byte abyte0[])
    {
        return set(s, Base64.encodeBytes(abyte0));
    }

    public boolean set(HashtableEX hashtableex)
    {
        if(empty(hashtableex))
            return false;
        String as[] = hashtableex.getKeys();
        int j = as.length;
        int i = 0;
        do
        {
            if(i >= j)
                return true;
            String s = as[i];
            set(s, (String)hashtableex.get(s));
            i++;
        } while(true);
    }

    public boolean setQuery(String s)
    {
        if(!StringEX.empty(s)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if(StringEX.empty(s = s.split("&"))) goto _L1; else goto _L3
_L3:
        int i;
        int j;
        j = s.length;
        i = 0;
_L5:
        String as[];
        if(i >= j)
            return true;
        as = s[i].split("=");
        if(!StringEX.empty(as))
            break; /* Loop/switch isn't completed */
_L6:
        i++;
        if(true) goto _L5; else goto _L4
_L4:
        if(as.length == 1)
            set(as[0], "");
        else
            set(as[0], as[1]);
          goto _L6
        if(true) goto _L5; else goto _L7
_L7:
    }
}
