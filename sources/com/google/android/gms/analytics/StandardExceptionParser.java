// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.analytics;

import android.content.Context;
import android.content.pm.*;
import com.google.android.gms.analytics.internal.zzad;
import java.util.*;

// Referenced classes of package com.google.android.gms.analytics:
//            ExceptionParser

public class StandardExceptionParser
    implements ExceptionParser
{

    public StandardExceptionParser(Context context, Collection collection)
    {
        setIncludedPackages(context, collection);
    }

    protected StackTraceElement getBestStackTraceElement(Throwable throwable)
    {
        throwable = throwable.getStackTrace();
        if(throwable == null || throwable.length == 0)
            return null;
        int j = throwable.length;
        int i = 0;
        do
        {
            if(i >= j)
                break;
            StackTraceElement stacktraceelement = throwable[i];
            String s = stacktraceelement.getClassName();
            for(Iterator iterator = zzEJ.iterator(); iterator.hasNext();)
                if(s.startsWith((String)iterator.next()))
                    return stacktraceelement;

            i++;
        } while(true);
        return throwable[0];
    }

    protected Throwable getCause(Throwable throwable)
    {
        for(; throwable.getCause() != null; throwable = throwable.getCause());
        return throwable;
    }

    public String getDescription(String s, Throwable throwable)
    {
        return getDescription(getCause(throwable), getBestStackTraceElement(getCause(throwable)), s);
    }

    protected String getDescription(Throwable throwable, StackTraceElement stacktraceelement, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(throwable.getClass().getSimpleName());
        if(stacktraceelement != null)
        {
            String as[] = stacktraceelement.getClassName().split("\\.");
            String s1 = "unknown";
            throwable = s1;
            if(as != null)
            {
                throwable = s1;
                if(as.length > 0)
                    throwable = as[as.length - 1];
            }
            stringbuilder.append(String.format(" (@%s:%s:%s)", new Object[] {
                throwable, stacktraceelement.getMethodName(), Integer.valueOf(stacktraceelement.getLineNumber())
            }));
        }
        if(s != null)
            stringbuilder.append(String.format(" {%s}", new Object[] {
                s
            }));
        return stringbuilder.toString();
    }

    public void setIncludedPackages(Context context, Collection collection)
    {
        HashSet hashset;
        zzEJ.clear();
        hashset = new HashSet();
        if(collection != null)
            hashset.addAll(collection);
        if(context == null) goto _L2; else goto _L1
_L1:
        collection = context.getApplicationContext().getPackageName();
        zzEJ.add(collection);
        context = context.getApplicationContext().getPackageManager().getPackageInfo(collection, 1).activities;
        if(context == null) goto _L2; else goto _L3
_L3:
        int j = context.length;
        int i = 0;
_L4:
        if(i >= j)
            break; /* Loop/switch isn't completed */
        hashset.add(((ActivityInfo) (context[i])).packageName);
        i++;
        if(true) goto _L4; else goto _L2
        context;
        zzad.zzal("No package found");
_L2:
        context = hashset.iterator();
label0:
        do
        {
            if(context.hasNext())
            {
                collection = (String)context.next();
                Iterator iterator = zzEJ.iterator();
                boolean flag = true;
                do
                {
label1:
                    {
                        if(iterator.hasNext())
                        {
                            String s = (String)iterator.next();
                            if(collection.startsWith(s))
                                break label1;
                            if(s.startsWith(collection))
                                zzEJ.remove(s);
                        }
                        if(flag)
                            zzEJ.add(collection);
                        continue label0;
                    }
                    flag = false;
                } while(true);
            }
            return;
        } while(true);
    }

    private final TreeSet zzEJ = new TreeSet();
}
