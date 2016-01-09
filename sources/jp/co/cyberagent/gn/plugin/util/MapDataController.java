// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.gn.plugin.util;

import java.io.*;
import java.util.HashMap;

// Referenced classes of package jp.co.cyberagent.gn.plugin.util:
//            FileUtil

public class MapDataController
{

    public MapDataController()
    {
        valid = false;
        changed = false;
        mapObjFilename = null;
        map = null;
    }

    public void exit()
    {
        if(valid)
        {
            if(changed)
                save();
            valid = false;
            mapObjFilename = null;
            map = null;
        }
    }

    public byte[] get(String s)
    {
        byte abyte0[] = null;
        if(map != null)
            abyte0 = (byte[])map.get(s);
        return abyte0;
    }

    public boolean init(String s)
    {
        if(!valid)
        {
            changed = false;
            if(s == null)
                s = "mapdatacontrollerdef.obj";
            mapObjFilename = s;
            if(!load())
                map = new HashMap();
            if(map != null)
                valid = true;
        }
        return valid;
    }

    public boolean isChanged()
    {
        return changed;
    }

    public boolean isValid()
    {
        return valid;
    }

    public boolean load()
    {
        return load(1, mapObjFilename);
    }

    public boolean load(int i, String s)
    {
        boolean flag = false;
        try
        {
            s = FileUtil.getInstance().openObjectInputStream(i, s);
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            return false;
        }
        if(s == null)
            break MISSING_BLOCK_LABEL_37;
        map = (HashMap)s.readObject();
        s.close();
        changed = false;
        flag = true;
        return flag;
    }

    public byte[] put(String s, byte abyte0[])
    {
        byte abyte1[] = null;
        if(map != null)
        {
            abyte1 = (byte[])map.put(s, abyte0);
            changed = true;
        }
        return abyte1;
    }

    public byte[] remove(String s)
    {
        byte abyte0[] = null;
        if(map != null)
        {
            abyte0 = (byte[])map.remove(s);
            changed = true;
        }
        return abyte0;
    }

    public boolean save()
    {
        return save(1, mapObjFilename);
    }

    public boolean save(int i, String s)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if(map == null)
            break MISSING_BLOCK_LABEL_48;
        try
        {
            s = FileUtil.getInstance().openObjectOutputStream(i, s);
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            return false;
        }
        flag = flag1;
        if(s == null)
            break MISSING_BLOCK_LABEL_48;
        s.writeObject(map);
        s.close();
        changed = false;
        flag = true;
        return flag;
    }

    public static final String MAP_OBJ_FILENAME_DEF = "mapdatacontrollerdef.obj";
    protected boolean changed;
    protected HashMap map;
    protected String mapObjFilename;
    protected boolean valid;
}
