// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.dimage.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.io.File;
import java.io.IOException;

// Referenced classes of package jp.co.dimage.android:
//            j, l

public class m extends j
{

    public m(Context context)
    {
        this(context, null, null);
    }

    public m(Context context, String s, String s1)
    {
        b = "";
        c = "";
        d = "";
        e = "";
        f = "";
        g = true;
        a = context;
        b = s;
        c = s1;
        d = context.getPackageName();
        h();
    }

    public static boolean a(Context context)
    {
        return "1".equals(context.getSharedPreferences("__FOX__", 0).getString("__FOX_REINSTALL__", "0"));
    }

    private boolean b(Context context)
    {
        try
        {
            context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            return true;
        }
        while(context == null || ((ApplicationInfo) (context)).metaData == null || ((ApplicationInfo) (context)).metaData.getInt("APPADFORCE_USE_EXTERNAL_STORAGE", 1) != 0) 
            return true;
        return false;
    }

    private boolean b(String s)
    {
        if(s == null || "".equals(s))
            return false;
        else
            return b(f(), s);
    }

    private String f()
    {
        String s = d;
        if(!jp.co.dimage.android.l.a(b))
            s = b;
        return (new StringBuilder()).append(b()).append(s).append("/").toString();
    }

    private String g()
    {
        String s = "__FOX_XUNIQ__";
        if(!jp.co.dimage.android.l.a(c))
            s = c;
        return s;
    }

    private void h()
    {
        g = b(a);
        if(g)
            i();
        j();
    }

    private void i()
    {
        if(!b(f()))
            (new File(f())).mkdir();
        String s = (new StringBuilder()).append(f()).append(g()).toString();
        if(!b(s))
            (new File(s)).getParentFile().mkdirs();
    }

    private void j()
    {
        Object obj = k();
        if(obj == null)
            return;
        try
        {
            obj = a(((File) (obj)));
            f = ((String) (obj)).split(",")[0];
            e = ((String) (obj)).split(",")[1];
            return;
        }
        catch(Exception exception)
        {
            return;
        }
    }

    private File k()
    {
        File file = l();
        File file1 = m();
        if(file != null || file1 != null)
        {
            if(file != null && file1 != null)
                if(file.lastModified() < file1.lastModified())
                    return file1;
                else
                    return file;
            if(file != null)
                return file;
            if(file1 != null)
                return file1;
        }
        return null;
    }

    private File l()
    {
        if(jp.co.dimage.android.l.a(c) || jp.co.dimage.android.l.a(b))
            return null;
        File file = new File((new StringBuilder()).append(b()).append(b).toString(), c);
        File file1 = new File((new StringBuilder()).append(b()).append(b).toString(), "__FOX_XUNIQ__");
        File file3 = new File((new StringBuilder()).append(b()).append(d).toString(), c);
        if(!file.exists() && !file1.exists() && !file3.exists())
            return null;
        File afile[] = new File[3];
        afile[0] = file;
        afile[1] = file1;
        afile[2] = file3;
        int j1 = afile.length;
        int i1 = 0;
        file = null;
        while(i1 < j1) 
        {
            File file4 = afile[i1];
            File file2 = file;
            if(file == null)
                file2 = file4;
            if(file2 != null && file4.exists() && file2.lastModified() < file4.lastModified())
                file = file4;
            else
                file = file2;
            i1++;
        }
        if(!file.exists())
            return null;
        else
            return file;
    }

    private File m()
    {
        File file = new File((new StringBuilder()).append(b()).append(d).toString(), "__FOX_XUNIQ__");
        if(file.exists())
            return file;
        else
            return null;
    }

    private boolean n()
    {
        while(k() == null || (!jp.co.dimage.android.l.a(b) || !jp.co.dimage.android.l.a(c)) && !b(f(), g())) 
            return true;
        return false;
    }

    public void a(Context context, boolean flag)
    {
        SharedPreferences sharedpreferences = context.getSharedPreferences("__FOX__", 0);
        context = sharedpreferences.getString("__FOX_REINSTALL__", "");
        if(!jp.co.dimage.android.l.a(context) && context.length() > 0)
            return;
        if(flag)
            context = "1";
        else
            context = "0";
        sharedpreferences.edit().putString("__FOX_REINSTALL__", context).commit();
    }

    public boolean c()
    {
        return !jp.co.dimage.android.l.a(e) && !jp.co.dimage.android.l.a(f);
    }

    public String d()
    {
        if(jp.co.dimage.android.l.a(e))
            return null;
        else
            return e;
    }

    public boolean d(String s, String s1)
    {
        while(jp.co.dimage.android.l.a(s) || jp.co.dimage.android.l.a(s1) || !g || !a() || !n()) 
            return false;
        File file;
        boolean flag;
        try
        {
            file = k();
            s = (new StringBuilder()).append(s).append(",").append(s1).toString();
            c(f(), g());
            flag = a(f(), g(), s);
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            return false;
        }
        if(file == null || !flag)
            break MISSING_BLOCK_LABEL_105;
        b(file);
        return flag;
    }

    public String e()
    {
        if(jp.co.dimage.android.l.a(f))
            return null;
        else
            return f;
    }

    private Context a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private boolean g;
}
