// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.dimage.android;

import android.content.Context;
import android.os.AsyncTask;
import jp.co.cyberz.fox.analytics.base.d;

// Referenced classes of package jp.co.dimage.android:
//            c, l, f, b

public class k
{
    class a extends AsyncTask
    {

        private boolean a()
        {
            if(!e)
                i = true;
            if(!f)
                j = true;
            if(!g || !jp.co.dimage.android.b.c())
                k = true;
            if(!h)
                l = true;
            if(!i)
                i = k.a(a);
            if(!j)
                j = k.b(a);
            if(!k)
                k = k.c(a);
            if(!l)
                l = jp.co.dimage.android.k.d(a);
            return i && j && k && l;
        }

        protected transient Void a(Void avoid[])
        {
            if(b > 0) goto _L2; else goto _L1
_L1:
            return null;
_L2:
            int i1 = 0;
_L4:
            if(i1 >= b)
                break; /* Loop/switch isn't completed */
            if(a())
                return null;
            Thread.sleep(1000L);
            i1++;
            continue; /* Loop/switch isn't completed */
            avoid;
            i1++;
            if(true) goto _L4; else goto _L3
_L3:
            if(true) goto _L1; else goto _L5
_L5:
            avoid;
            throw avoid;
        }

        protected void a(Void void1)
        {
            super.onPostExecute(void1);
            if(c != null)
                c.a(k.e(a));
            if(d != null)
                d.a();
        }

        public void a(b b1)
        {
            c = b1;
        }

        public void a(c c1)
        {
            d = c1;
        }

        public void a(boolean flag)
        {
            e = flag;
        }

        public void b(boolean flag)
        {
            f = flag;
        }

        public void c(boolean flag)
        {
            g = flag;
        }

        public void d(boolean flag)
        {
            h = flag;
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((Void[])aobj);
        }

        protected void onPostExecute(Object obj)
        {
            a((Void)obj);
        }

        final k a;
        private int b;
        private b c;
        private c d;
        private boolean e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private boolean k;
        private boolean l;

        public a(int i1)
        {
            a = k.this;
            super();
            b = 5;
            c = null;
            d = null;
            e = false;
            f = false;
            g = false;
            h = false;
            i = false;
            j = false;
            k = false;
            l = false;
            if(i1 > 0)
                b = i1;
        }
    }

    public static interface b
    {

        public abstract void a(f.a a1);
    }

    public static interface c
    {

        public abstract void a();
    }


    public k(Context context)
    {
        this(context, null, null);
    }

    public k(Context context, f f1, f.a a1)
    {
        g = context;
        e = f1;
        f = a1;
    }

    private boolean a()
    {
        return !l.a(jp.co.dimage.android.c.a(g));
    }

    static boolean a(k k1)
    {
        return k1.a();
    }

    private boolean b()
    {
        return e.b();
    }

    static boolean b(k k1)
    {
        return k1.b();
    }

    private boolean c()
    {
        return !l.a(jp.co.dimage.android.b.a());
    }

    static boolean c(k k1)
    {
        return k1.c();
    }

    private boolean d()
    {
        return !l.a(l.a(g));
    }

    static boolean d(k k1)
    {
        return k1.d();
    }

    static f.a e(k k1)
    {
        return k1.f;
    }

    public void a(Integer integer, b b1)
    {
        Integer integer1 = integer;
        if(integer == null)
            integer1 = Integer.valueOf(0);
        integer = new a(integer1.intValue());
        integer.a(b1);
        if(e.k())
            integer.a(true);
        if(e.j())
            integer.b(true);
        if(e.h())
            integer.c(true);
        if(e.g())
            integer.d(true);
        (new d()).a(integer, null);
    }

    public void a(Integer integer, boolean flag, boolean flag1, boolean flag2, boolean flag3, c c1)
    {
        Integer integer1 = integer;
        if(integer == null)
            integer1 = Integer.valueOf(0);
        integer = new a(integer1.intValue());
        integer.a(c1);
        if(flag)
            integer.a(true);
        if(flag1)
            integer.b(true);
        if(flag2)
            integer.c(true);
        if(flag3)
            integer.d(true);
        (new d()).a(integer, null);
    }

    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    private f e;
    private f.a f;
    private Context g;
}
