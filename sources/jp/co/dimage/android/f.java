// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.dimage.android;

import android.content.*;
import android.net.Uri;
import android.util.Log;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.security.GeneralSecurityException;
import jp.co.cyberz.fox.analytics.base.e;
import jp.co.cyberz.fox.analytics.base.g;
import jp.co.cyberz.fox.notify.a;

// Referenced classes of package jp.co.dimage.android:
//            e, l, c, m, 
//            a, g, d, b, 
//            Fingerprint, k, h, i

public class f
    implements jp.co.dimage.android.e
{
    static final class a extends Enum
    {

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(jp/co/dimage/android/f$a, s1);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        String a()
        {
            return d;
        }

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a e[];
        private String d;

        static 
        {
            a = new a("INSTALL", 0, "0");
            b = new a("START", 1, "1");
            c = new a("OTHERS", 2, "2");
            e = (new a[] {
                a, b, c
            });
        }

        private a(String s1, int i1, String s2)
        {
            super(s1, i1);
            d = s2;
        }
    }


    public f(c c1)
    {
        c = null;
        d = "";
        e = "";
        f = "";
        g = "";
        h = "";
        i = "";
        j = "";
        k = "";
        l = "";
        m = "";
        n = "";
        o = "";
        be = "";
        bf = false;
        bg = false;
        bh = false;
        bi = false;
        bj = false;
        bk = false;
        bl = false;
        bm = false;
        bn = false;
        bo = false;
        bp = false;
        bq = false;
        br = false;
        bs = false;
        bt = false;
        bu = Integer.valueOf(0);
        bw = Boolean.valueOf(false);
        bx = null;
        by = "";
        bz = "";
        bA = "";
        bB = "";
        bC = "";
        bD = "";
        bE = "";
        bF = "";
        bG = "";
        bH = "";
        bI = null;
        bJ = false;
        bK = "";
        bL = null;
        bx = c1;
        w();
    }

    private String a(String s1, String as[])
    {
        s1 = jp.co.dimage.android.l.a(s1, as);
        return (new StringBuilder()).append(h).append(s1).toString();
    }

    private String a(a a1, int i1)
    {
        return a(a1, null, i1);
    }

    private String a(a a1, String s1, int i1)
    {
label0:
        {
            Object obj = a("/p/cv?_app={0}&_xuid={1}&_xuniq={2}&_xevent={3}", new String[] {
                f, j, d, a1.a()
            });
            a1 = ((a) (obj));
            if(!jp.co.dimage.android.l.a(e))
                a1 = (new StringBuilder()).append(((String) (obj))).append("&_buid=").append(e).toString();
            obj = a1;
            if(g != null)
            {
                obj = a1;
                if(g.length() > 0)
                    obj = (new StringBuilder()).append(a1).append("&appinfo=").append(g).toString();
            }
            Object obj1 = obj;
            if(l != null)
            {
                obj1 = obj;
                if(l.equals("1"))
                    obj1 = (new StringBuilder()).append(((String) (obj))).append("&_sdktest=1").toString();
            }
            a1 = ((a) (obj1));
            if(bw.booleanValue())
                a1 = (new StringBuilder()).append(((String) (obj1))).append("&_isrand=1").toString();
            obj1 = "default";
            obj = obj1;
            if(s1 != null)
            {
                obj = obj1;
                if(s1.length() > 0)
                    obj = URLEncoder.encode(s1);
            }
            s1 = a1;
            if(obj != null)
                s1 = (new StringBuilder()).append(a1).append("&_rurl=").append(((String) (obj))).toString();
            a1 = s1;
            if(by != null)
                a1 = (new StringBuilder()).append(s1).append("&_bundle_id=").append(by).toString();
            s1 = a1;
            if(bA != null)
                s1 = (new StringBuilder()).append(a1).append("&_model=").append(bA).toString();
            a1 = s1;
            if(bB != null)
                a1 = (new StringBuilder()).append(s1).append("&_os_ver=").append(bB).toString();
            a1 = (new StringBuilder()).append(a1).append("&_sdk_ver=v2.15.7g").toString();
            obj = a1;
            if(!jp.co.dimage.android.l.a(m))
                obj = (new StringBuilder()).append(a1).append("&_hash=").append(d(f, j, d)).toString();
            Object obj2;
            Object obj3;
            boolean flag;
            if(bx.N() && !bp)
                flag = true;
            else
                flag = false;
            if(flag)
                a1 = "true";
            else
                a1 = "false";
            obj1 = "true";
            s1 = ((String) (obj1));
            if(i1 == 0)
            {
                s1 = ((String) (obj1));
                if(flag)
                    s1 = "false";
            }
            if(!jp.co.dimage.android.l.a(j))
                if(i1 == 0)
                {
                    s1 = "true";
                    a1 = "false";
                } else
                {
                    s1 = "false";
                    a1 = "false";
                }
            if(jp.co.dimage.android.l.a(i))
                i = bx.b();
            obj3 = obj;
            obj2 = a1;
            obj1 = s1;
            if(!jp.co.dimage.android.l.a(i))
            {
                obj3 = obj;
                obj2 = a1;
                obj1 = s1;
                if(i.length() > 5)
                {
                    obj3 = obj;
                    obj2 = a1;
                    obj1 = s1;
                    if("LINE_".equals(i.substring(0, 5)))
                    {
                        if(i1 == 0)
                            a1 = "true";
                        else
                            a1 = "false";
                        obj3 = (new StringBuilder()).append(((String) (obj))).append("&_referrer_hash=").append(jp.co.dimage.android.l.d((new StringBuilder()).append(i).append(m).toString())).toString();
                        obj2 = "false";
                        obj1 = a1;
                    }
                }
            }
            a1 = ((a) (obj3));
            if(!jp.co.dimage.android.l.a(i))
            {
                i = URLEncoder.encode(i);
                a1 = (new StringBuilder()).append(((String) (obj3))).append("&_referrer=").append(i).toString();
            }
            if("2".equals(o))
                if(i1 == 0)
                {
                    obj1 = "true";
                    obj2 = "false";
                } else
                {
                    obj1 = "false";
                    obj2 = "false";
                }
            a1 = (new StringBuilder()).append(a1).append("&_use_bw=").append(((String) (obj2))).toString();
            a1 = (new StringBuilder()).append(a1).append("&_cv_target=").append(((String) (obj1))).toString();
            if(bx.y() == jp.co.dimage.android.c.a.a)
                be = "1";
            if(bx.y() == c.a.b)
                be = "2";
            if(bx.y() == c.a.c)
                be = "4";
            s1 = (new StringBuilder()).append(a1).append("&_xuniq_type=").append(be).toString();
            a1 = s1;
            if(!jp.co.dimage.android.l.a(bD))
            {
                a1 = (new StringBuilder()).append(s1).append("&_pfapp=").append(bD).toString();
                a1 = (new StringBuilder()).append(a1).append("&_pf=").append(bC).toString();
            }
            s1 = a1;
            if(bx.h())
                s1 = (new StringBuilder()).append(a1).append("&_jb=1").toString();
            if(!bJ)
            {
                a1 = s1;
                if(!jp.co.dimage.android.m.a(c))
                    break label0;
            }
            a1 = (new StringBuilder()).append(s1).append("&_dd=1").toString();
        }
        s1 = a1;
        if(!jp.co.dimage.android.l.a(bK))
            s1 = (new StringBuilder()).append(a1).append("&_dd_type=").append(bK).toString();
        a1 = s1;
        if(bm)
        {
            if(jp.co.dimage.android.l.a(n))
                n = jp.co.dimage.android.l.a();
            a1 = s1;
            if(!jp.co.dimage.android.l.a(n))
                a1 = (new StringBuilder()).append(s1).append("&_fbid=").append(n).toString();
        }
        s1 = a1;
        if(!jp.co.dimage.android.l.a(bE))
            s1 = (new StringBuilder()).append(a1).append("&_fpid=").append(bE).toString();
        a1 = s1;
        if(!jp.co.dimage.android.l.a(bF))
            a1 = (new StringBuilder()).append(s1).append("&_fptdl=").append(bF).toString();
        s1 = a1;
        if(bn)
        {
            s1 = a1;
            if(!jp.co.dimage.android.l.a(bG))
            {
                s1 = a1;
                if(!"1".equals(be))
                {
                    a1 = (new StringBuilder()).append(a1).append("&_adid=").append(bG).toString();
                    s1 = (new StringBuilder()).append(a1).append("&_adte=").append(bH).toString();
                }
            }
        }
        a1 = s1;
        if(bf)
            a1 = (new StringBuilder()).append(s1).append("&_optout=1").toString();
        s1 = a1;
        if(!jp.co.dimage.android.l.a(o))
            s1 = (new StringBuilder()).append(a1).append("&_xroute=").append(o).toString();
        return s1;
    }

    static String a(f f1, String s1)
    {
        f1.bG = s1;
        return s1;
    }

    static c a(f f1)
    {
        return f1.bx;
    }

    static void a(f f1, a a1)
    {
        f1.b(a1);
    }

    static String b(f f1, String s1)
    {
        f1.bH = s1;
        return s1;
    }

    private void b(a a1)
    {
        m m1 = new m(c, bx.P(), bx.Q());
        if(bn)
            bx.a(c.a.c);
        else
            bx.a(c.a.b);
        if(m1.c())
            bx.b(m1.e());
        bx.c();
        if(bx.R())
            bx.S();
        d = bx.o();
        Log.d("F.O.X CV", (new StringBuilder()).append("xuniq: ").append(d).toString());
        bx.a();
        j = bx.m();
        if(jp.co.cyberz.fox.analytics.base.e.h())
            bx.i();
        if(jp.co.cyberz.fox.notify.a.b())
            bx.j();
        a1 = a(a1, 0);
        if(aW.booleanValue())
            jp.co.dimage.android.a.d("F.O.X", (new StringBuilder()).append("sendConversion: ").append(a1).toString());
        if(!t())
            (new jp.co.dimage.android.g(bx)).execute(new String[] {
                a1
            });
        if(!jp.co.cyberz.fox.analytics.base.g.a(bI)) goto _L2; else goto _L1
_L1:
        c();
_L4:
        return;
_L2:
        if(bp)
        {
            c();
            return;
        }
        if(u() || !bo || !br) goto _L4; else goto _L3
_L3:
        Intent intent;
label0:
        {
            intent = new Intent("android.intent.action.VIEW");
            String s1 = bI;
            if(s() && s1.startsWith("http://"))
            {
                a1 = s1;
                if(s1.startsWith("https://"))
                    break label0;
            }
            a1 = a(a.b, bI, 1);
        }
        try
        {
            intent.setData(Uri.parse(a1));
            b(intent);
        }
        // Misplaced declaration of an exception variable
        catch(a a1)
        {
            c();
            return;
        }
        c();
        return;
        a1;
        c();
        throw a1;
    }

    private void c(a a1)
    {
        while(!bx.g() || t() && s() || !o()) 
            return;
        d(a1);
    }

    private String d(String s1, String s2, String s3)
    {
        return jp.co.dimage.android.l.d((new StringBuilder()).append(s1).append(s2).append(s3).append(m).toString());
    }

    private void d(a a1)
    {
        String s1 = q();
        (new d(bx, this, a1)).execute(new String[] {
            s1
        });
    }

    private void j(String s1)
    {
        FileOutputStream fileoutputstream = c.openFileOutput(s1, 0);
        Object obj;
        if(fileoutputstream != null)
            try
            {
                fileoutputstream.close();
            }
            catch(IOException ioexception) { }
        if(s1.equals("__ADMAGE_APP_CONVERSION_COMPLETED__"))
        {
            bh = true;
        } else
        {
            if(s1.equals("__ADMAGE_WEB_CONVERSION_COMPLETED__"))
            {
                bg = true;
                return;
            }
            if(s1.equals("__ADMAGE_LINE_FC_CONVERSION_COMPLETED__"))
            {
                bj = true;
                return;
            }
        }
        return;
        obj;
        jp.co.dimage.android.a.b("F.O.X", (new StringBuilder()).append("createFile failed. ").append(s1).toString());
        if(false)
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch(String s1)
            {
                return;
            }
        else
            break MISSING_BLOCK_LABEL_33;
        obj;
        if(false)
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch(String s1) { }
        throw obj;
    }

    private void l()
    {
        Object obj;
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        obj = bx.f();
        if(jp.co.dimage.android.l.a(((String) (obj)))) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if("1".equals(obj))
            flag = true;
_L4:
        if(flag)
        {
            bJ = true;
            bK = "car";
        }
        return;
_L2:
        obj = Class.forName("jp.co.CAReward_Ack.CARController");
        if(obj == null)
            break MISSING_BLOCK_LABEL_139;
        obj = ((Class) (obj)).getMethod("getUID", new Class[] {
            android/content/Context
        });
        if(obj == null)
            break MISSING_BLOCK_LABEL_139;
        flag1 = jp.co.dimage.android.l.a((String)((Method) (obj)).invoke(null, new Object[] {
            c
        }));
        Exception exception;
        if(!flag1)
            flag = true;
        else
            flag = false;
        try
        {
            bx.a(flag);
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch(Exception exception) { }
        break MISSING_BLOCK_LABEL_123;
        exception;
        exception.printStackTrace();
        continue; /* Loop/switch isn't completed */
        flag = false;
        if(true) goto _L4; else goto _L3
_L3:
    }

    private void m()
    {
        Object obj;
        boolean flag;
        boolean flag1;
        try
        {
            obj = Class.forName("jp.co.cyberagent.camp.tracking.CampCvTracking");
        }
        catch(Exception exception)
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        if(obj == null) goto _L2; else goto _L1
_L1:
        obj = ((Class) (obj)).getMethod("getUuid", new Class[] {
            android/content/Context
        });
        if(obj == null) goto _L2; else goto _L3
_L3:
        flag1 = jp.co.dimage.android.l.a((String)((Method) (obj)).invoke(null, new Object[] {
            c
        }));
        if(flag1) goto _L2; else goto _L4
_L4:
        flag = true;
_L6:
        if(flag)
        {
            bJ = true;
            bK = "camp";
        }
        return;
_L2:
        flag = false;
        if(true) goto _L6; else goto _L5
_L5:
    }

    private void n()
    {
        jp.co.dimage.android.b.a(c, new b.a() {

            public void a(String s1, boolean flag)
            {
                if(jp.co.dimage.android.l.a(s1))
                    return;
                f f1;
                try
                {
                    jp.co.dimage.android.f.a(a, jp.co.dimage.android.i.a(s1, jp.co.dimage.android.i.a.a));
                    if(!jp.co.dimage.android.f.a(a).d())
                    {
                        jp.co.dimage.android.f.a(a).a(jp.co.dimage.android.i.b(s1), "4");
                        jp.co.dimage.android.f.a(a).a(c.a.c);
                    }
                    f1 = a;
                }
                // Misplaced declaration of an exception variable
                catch(String s1)
                {
                    return;
                }
                if(flag)
                    s1 = "0";
                else
                    s1 = "1";
                f.b(f1, s1);
                return;
            }

            final f a;

            
            {
                a = f.this;
                super();
            }
        }
);
    }

    private boolean o()
    {
        return jp.co.dimage.android.l.b(c);
    }

    private void p()
    {
        if(!jp.co.dimage.android.l.a(j) && !jp.co.dimage.android.l.a(o) && "2".equals(o) && !j.equals(bv))
        {
            bv = j;
            if(bx.g() && o())
            {
                Log.d("F.O.X REENGAGEMENT", (new StringBuilder()).append("xuniq: ").append(d).toString());
                String s1 = a(a.b, 0);
                (new jp.co.dimage.android.g(bx)).execute(new String[] {
                    s1
                });
                return;
            }
        }
    }

    private String q()
    {
        String s2 = a("/p/tmck?_app={0}&_bundle_id={1}&_bv={2}&_model={3}&_os_ver={4}&_sdk_ver={5}", new String[] {
            f, by, bz, bA, bB, "v2.15.7g"
        });
        String s1 = s2;
        if(!jp.co.dimage.android.l.a(bD))
        {
            s1 = (new StringBuilder()).append(s2).append("&_pfapp=").append(bD).toString();
            s1 = (new StringBuilder()).append(s1).append("&_pf=").append(bC).toString();
        }
        return s1;
    }

    private String r()
    {
        String s2 = a("/p/cub?_app={0}&_buid={1}&_xuniq={2}&_bundle_id={3}&_bv={4}&_model={5}&_os_ver={6}&_sdk_ver={7}", new String[] {
            f, e, d, by, bz, bA, bB, "v2.15.7g"
        });
        String s1 = s2;
        if(!jp.co.dimage.android.l.a(bD))
        {
            s1 = (new StringBuilder()).append(s2).append("&_pfapp=").append(bD).toString();
            s1 = (new StringBuilder()).append(s1).append("&_pf=").append(bC).toString();
        }
        return s1;
    }

    private boolean s()
    {
        return bg;
    }

    private boolean t()
    {
        return bh;
    }

    private boolean u()
    {
        return bi;
    }

    private boolean v()
    {
        return bj;
    }

    private void w()
    {
        f = bx.p();
        d = bx.o();
        g = bx.q();
        j = bx.m();
        i = bx.r();
        l = bx.u();
        h = bx.t();
        k = bx.s();
        c = bx.l();
        bg = bx.z();
        bh = bx.A();
        bi = bx.B();
        bj = bx.C();
        by = bx.E();
        bz = bx.G();
        bA = bx.I();
        bB = bx.K();
        m = bx.L();
        bf = bx.M();
        if(jp.co.dimage.android.l.a(by))
            by = "";
        if(jp.co.dimage.android.l.a(bz))
            bz = "";
        if(jp.co.dimage.android.l.a(bA))
            bA = "";
        if(jp.co.dimage.android.l.a(bB))
            bB = "";
        m();
    }

    public void a()
    {
        c(a.b);
    }

    public void a(Intent intent)
    {
        if(intent != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Uri uri = intent.getData();
        if(uri == null)
            break; /* Loop/switch isn't completed */
        if(uri.isHierarchical())
        {
            a(uri);
            return;
        }
        if(true) goto _L1; else goto _L3
_L3:
        intent = intent.getExtras();
        if(intent != null && bx.a(intent))
        {
            j = bx.m();
            o = bx.n();
            p();
            return;
        }
        if(true) goto _L1; else goto _L4
_L4:
    }

    public void a(Uri uri)
    {
        while(uri == null || !bx.a(uri)) 
            return;
        j = bx.m();
        o = bx.n();
        p();
    }

    public void a(Integer integer)
    {
        bu = integer;
    }

    public void a(String s1)
    {
        if(!bx.g())
        {
            return;
        } else
        {
            bI = s1;
            c(a.b);
            return;
        }
    }

    public void a(String s1, String s2)
    {
        e = s2;
        a(s1);
    }

    public void a(String s1, String s2, String s3)
    {
        l();
        b(s1, s2, s3);
    }

    public void a(a a1)
    {
        if(!bl || !bq)
            return;
        if(bn)
            n();
        if(bs)
        {
            bL = new Fingerprint();
            bL.a(h);
            bL.a(this);
            bL.a(a1);
            bL.a(c);
        }
        if(bs || bt || bn || bu.intValue() > 0)
        {
            (new k(c, this, a1)).a(bu, new k.b() {

                public void a(a a2)
                {
                    jp.co.dimage.android.f.a(a, a2);
                }

                final f a;

            
            {
                a = f.this;
                super();
            }
            }
);
            return;
        } else
        {
            b(a1);
            return;
        }
    }

    public void a(boolean flag)
    {
        bk = flag;
    }

    public void b(Intent intent)
    {
        c.startActivity(intent);
    }

    public void b(String s1)
    {
        l();
        a(s1);
    }

    public void b(String s1, String s2)
    {
        l();
        a(s1, s2);
    }

    public void b(String s1, String s2, String s3)
    {
        bC = s3;
        bD = s2;
        if(jp.co.dimage.android.l.a(h))
            h = "http://app-adforce.jp/ad";
        a(s1);
    }

    public void b(boolean flag)
    {
        bl = flag;
    }

    public boolean b()
    {
        return !jp.co.dimage.android.l.a(bE);
    }

    public void c()
    {
        j("__ADMAGE_WEB_CONVERSION_COMPLETED__");
        bg = true;
        j("__ADMAGE_CONVERSION_PAGE_OPENED__");
        bi = true;
    }

    public void c(String s1)
    {
        c(a.c);
        Intent intent = new Intent("android.intent.action.VIEW");
        String s2 = s1;
        if(!s())
        {
            s2 = s1;
            if(bx.g())
            {
                s2 = a(a.c, s1, 1);
                c();
            }
        }
        try
        {
            intent.setData(Uri.parse(s2));
            b(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(String s1)
        {
            return;
        }
    }

    public void c(String s1, String s2)
    {
        l();
        e(s1, s2);
    }

    public void c(String s1, String s2, String s3)
    {
        if(!jp.co.dimage.android.l.a(s3))
        {
            bC = s2;
            bD = s1;
            e = s3;
            s1 = bx.e();
            if(jp.co.dimage.android.l.a(s1) || !s1.equals(s3))
            {
                if(jp.co.dimage.android.l.a(h))
                    h = "http://app-adforce.jp/ad";
                s1 = r();
                (new h(bx, s3)).execute(new String[] {
                    s1
                });
                return;
            }
        }
    }

    public void c(boolean flag)
    {
        bm = flag;
    }

    public void d()
    {
        j("__ADMAGE_APP_CONVERSION_COMPLETED__");
        bh = true;
    }

    public void d(String s1)
    {
        bx.a(s1);
        j = bx.m();
        if(k != null && k.equals("1"))
            c(jp.co.dimage.android.a.a);
    }

    public void d(String s1, String s2)
    {
        bE = s1;
        bF = s2;
    }

    public void d(boolean flag)
    {
        bn = flag;
    }

    public void e(String s1)
    {
        if(!v())
        {
            bx.a(s1);
            if(bx.g() && bh && t())
            {
                s1 = a(a.b, 0);
                (new jp.co.dimage.android.g(bx, "__ADMAGE_LINE_FC_CONVERSION_COMPLETED__")).execute(new String[] {
                    s1
                });
                return;
            }
        }
    }

    public void e(String s1, String s2)
    {
        b("default", s1, s2);
    }

    public void e(boolean flag)
    {
        bo = flag;
    }

    public boolean e()
    {
        return bk;
    }

    public void f(String s1)
    {
        d(s1);
    }

    public void f(boolean flag)
    {
        bp = flag;
    }

    public boolean f()
    {
        return bl;
    }

    public void g(String s1)
    {
        if(jp.co.dimage.android.l.a(s1))
        {
            return;
        } else
        {
            a(Uri.parse(s1));
            return;
        }
    }

    public void g(boolean flag)
    {
        bq = flag;
    }

    public boolean g()
    {
        return bm;
    }

    public void h(String s1)
    {
        j(s1);
    }

    public void h(boolean flag)
    {
        br = flag;
    }

    public boolean h()
    {
        return bn;
    }

    public void i(String s1)
    {
        h = s1;
    }

    public void i(boolean flag)
    {
        bs = flag;
    }

    public boolean i()
    {
        return bo;
    }

    public void j(boolean flag)
    {
        bt = flag;
    }

    public boolean j()
    {
        return bs;
    }

    public void k(boolean flag)
    {
        bf = flag;
    }

    public boolean k()
    {
        return bt;
    }

    public static final int a = 0;
    public static final int b = 1;
    private static String bv = null;
    private String bA;
    private String bB;
    private String bC;
    private String bD;
    private String bE;
    private String bF;
    private String bG;
    private String bH;
    private String bI;
    private boolean bJ;
    private String bK;
    private Fingerprint bL;
    private String be;
    private boolean bf;
    private boolean bg;
    private boolean bh;
    private boolean bi;
    private boolean bj;
    private boolean bk;
    private boolean bl;
    private boolean bm;
    private boolean bn;
    private boolean bo;
    private boolean bp;
    private boolean bq;
    private boolean br;
    private boolean bs;
    private boolean bt;
    private Integer bu;
    private Boolean bw;
    private c bx;
    private String by;
    private String bz;
    private Context c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;

}
