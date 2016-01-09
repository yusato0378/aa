// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush.utils;

import java.io.*;

public class IOUtils
{

    public IOUtils()
    {
    }

    public static String toString(InputStream inputstream)
        throws IOException
    {
        Object obj;
        StringBuilder stringbuilder;
        obj = new BufferedReader(new InputStreamReader(inputstream));
        stringbuilder = new StringBuilder();
_L1:
        String s = ((BufferedReader) (obj)).readLine();
        if(s != null)
            break MISSING_BLOCK_LABEL_48;
        obj = stringbuilder.toString();
        Object obj1;
        if(inputstream != null)
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch(InputStream inputstream)
            {
                if(android.os.Build.VERSION.SDK_INT >= 9)
                    throw new IOException("Failed to close InputStream.", inputstream);
                else
                    throw new IOException("Failed to close InputStream.");
            }
        return ((String) (obj));
        stringbuilder.append(s);
          goto _L1
        obj1;
        if(android.os.Build.VERSION.SDK_INT >= 9)
            throw new IOException("Failed to convert InputStream to String.", ((Throwable) (obj1)));
        break MISSING_BLOCK_LABEL_118;
        obj1;
        if(inputstream != null)
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch(InputStream inputstream)
            {
                if(android.os.Build.VERSION.SDK_INT >= 9)
                    throw new IOException("Failed to close InputStream.", inputstream);
                else
                    throw new IOException("Failed to close InputStream.");
            }
        throw obj1;
        throw new IOException("Failed to convert InputStream to String.");
    }
}
