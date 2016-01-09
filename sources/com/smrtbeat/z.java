// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.smrtbeat;

import android.graphics.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// Referenced classes of package com.smrtbeat:
//            c, SmartBeatJni, y, d, 
//            N

final class z
    implements Runnable
{

    z(y y1)
    {
        b = y1;
        super();
    }

    final Runnable a(ByteBuffer bytebuffer)
    {
        a = bytebuffer;
        return this;
    }

    public final void run()
    {
        try
        {
            if(c.D.length() > 0)
            {
                a.order(ByteOrder.nativeOrder()).position(0);
                if(SmartBeatJni.copyTextureBuffer(a))
                {
                    y.a(b).copyPixelsFromBuffer(a);
                    a = null;
                    y.b(b).drawBitmap(y.a(b), 0.0F, 0.0F, new Paint());
                    N.a(d.c, y.c(b), System.currentTimeMillis());
                }
            }
        }
        catch(Exception exception)
        {
            y.a(b, null);
            return;
        }
        y.a(b, null);
        return;
        Exception exception1;
        exception1;
        y.a(b, null);
        throw exception1;
    }

    private ByteBuffer a;
    private y b;
}
