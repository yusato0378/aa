// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package android.support.v4.content.res;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.content.res:
//            ResourcesCompatApi21

public class ResourcesCompat
{

    public ResourcesCompat()
    {
    }

    public static Drawable getDrawable(Resources resources, int i, android.content.res.Resources.Theme theme)
        throws android.content.res.Resources.NotFoundException
    {
        if(android.os.Build.VERSION.SDK_INT >= 21)
            return ResourcesCompatApi21.getDrawable(resources, i, theme);
        else
            return resources.getDrawable(i);
    }
}
