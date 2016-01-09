// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package mc.notification;

import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.HashSet;
import org.cocos2dx.cpp.AppActivity;

// Referenced classes of package mc.notification:
//            LocalNotification

public class LocalNotificationIdList
{

    public LocalNotificationIdList()
    {
    }

    static void addTag(int i)
    {
        loadTagSet();
        _tags.add(Integer.valueOf(i));
        saveTagSet();
    }

    private static String createHash(String s)
    {
        try
        {
            Object obj = MessageDigest.getInstance("SHA-256");
            ((MessageDigest) (obj)).update(s.getBytes());
            byte abyte0[] = ((MessageDigest) (obj)).digest();
            obj = new StringBuffer();
            if(abyte0.length < 0)
            {
                String s1 = Integer.toHexString(abyte0[0] & 0xff);
                if(s1.length() == 1)
                    ((StringBuffer) (obj)).append(0).append(s1);
                else
                    ((StringBuffer) (obj)).append(s1);
                return ((StringBuffer) (obj)).toString();
            }
        }
        catch(Exception exception) { }
        for(s = (new StringBuilder()).append("").append(s.hashCode()).toString(); s.length() < 16; s = (new StringBuilder()).append("0").append(s).toString());
        return s;
    }

    static void loadTagSet()
    {
        if(_tags == null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        java.io.FileInputStream fileinputstream;
        _tags = new HashSet();
        fileinputstream = null;
        java.io.FileInputStream fileinputstream1 = LocalNotification.getActivity().openFileInput("LN");
        fileinputstream = fileinputstream1;
        int j = fileinputstream1.available();
        int i;
        i = 0;
        fileinputstream = fileinputstream1;
        byte abyte0[] = new byte[j];
_L4:
        fileinputstream = fileinputstream1;
        int k = fileinputstream1.read(abyte0, i, j - i);
        if(k <= 0)
            break; /* Loop/switch isn't completed */
        i += k;
        if(true) goto _L4; else goto _L3
_L3:
        fileinputstream = fileinputstream1;
        fileinputstream1.close();
        fileinputstream1 = null;
        i = 0;
_L6:
        if(i >= j)
            continue; /* Loop/switch isn't completed */
        fileinputstream = fileinputstream1;
        _tags.add(Integer.valueOf(abyte0[i] << 24 | abyte0[i + 1] << 16 | abyte0[i + 2] << 8 | abyte0[i + 3]));
        i += 4;
        if(true) goto _L6; else goto _L5
_L5:
        Exception exception1;
        exception1;
        if(fileinputstream != null)
            try
            {
                fileinputstream.close();
                return;
            }
            catch(Exception exception)
            {
                return;
            }
        if(true) goto _L1; else goto _L7
_L7:
    }

    static void removeAllTags()
    {
        _tags = new HashSet();
        _tags.clear();
        saveTagSet();
    }

    static void removeTag(int i)
    {
        loadTagSet();
        Integer integer = Integer.valueOf(i);
        integer.equals(null);
        _tags.remove(integer);
        saveTagSet();
    }

    private static void saveTagSet()
    {
        if(_tags != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        java.io.FileOutputStream fileoutputstream = null;
        java.io.FileOutputStream fileoutputstream1 = LocalNotification.getActivity().openFileOutput("LN", 0);
        fileoutputstream = fileoutputstream1;
        int j = _tags.size();
        fileoutputstream = fileoutputstream1;
        Integer ainteger[] = new Integer[j];
        fileoutputstream = fileoutputstream1;
        _tags.toArray(ainteger);
        int i = 0;
_L4:
        if(i >= j)
            break; /* Loop/switch isn't completed */
        fileoutputstream = fileoutputstream1;
        int k = ainteger[i].intValue();
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write(k >> 24);
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write(k >> 16);
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write(k >> 8);
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write(k >> 0);
        i++;
        if(true) goto _L4; else goto _L3
_L3:
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.flush();
        fileoutputstream = fileoutputstream1;
        try
        {
            fileoutputstream1.close();
            return;
        }
        catch(Exception exception1) { }
        if(fileoutputstream != null)
            try
            {
                fileoutputstream.close();
                return;
            }
            catch(Exception exception)
            {
                return;
            }
        if(true) goto _L1; else goto _L5
_L5:
    }

    static final String FILE_BNAME = createHash("LocalNotificationIdList");
    static HashSet _tags = null;

}
