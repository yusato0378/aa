// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.smrtbeat;

import android.graphics.*;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.Build;
import java.nio.*;
import java.util.*;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

// Referenced classes of package com.smrtbeat:
//            SmartBeatJni, P, N, c, 
//            q, A, z, d

class y
{

    y()
    {
        f = 0;
        g = false;
        h = -1;
        i = 0;
        j = 0;
        k = 0;
        l = 0;
        m = 0;
        n = 0;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
        t = true;
        u = false;
        v = 0L;
        w = null;
        x = null;
        y = new ArrayList();
    }

    private static int a(int i1, String s1)
    {
        i1 = GLES20.glCreateShader(i1);
        if(i1 != 0)
        {
            GLES20.glShaderSource(i1, s1);
            GLES20.glCompileShader(i1);
            s1 = new int[1];
            GLES20.glGetShaderiv(i1, 35713, s1, 0);
            if(s1[0] == 0)
            {
                GLES20.glDeleteShader(i1);
                return 0;
            }
        }
        return i1;
    }

    private int a(String s1, String s2)
    {
        int i1 = a(35633, s1);
        int j1;
        if(i1 != 0)
            if((j1 = a(35632, s2)) != 0)
            {
                int k1 = GLES20.glCreateProgram();
                if(k1 != 0)
                {
                    GLES20.glAttachShader(k1, i1);
                    e("glAttachShader");
                    GLES20.glAttachShader(k1, j1);
                    e("glAttachShader");
                    GLES20.glLinkProgram(k1);
                    s1 = new int[1];
                    GLES20.glGetProgramiv(k1, 35714, s1, 0);
                    if(s1[0] != 1)
                    {
                        GLES20.glDeleteShader(i1);
                        GLES20.glDeleteShader(j1);
                        GLES20.glDeleteProgram(k1);
                        return 0;
                    }
                }
                return k1;
            }
        return 0;
    }

    static Bitmap a(y y1)
    {
        return y1.p;
    }

    static void a()
    {
        f().h();
    }

    private void a(int i1, int j1, int k1, int l1, int i2, float f1, boolean flag)
    {
        int j2 = c;
        int k2 = d;
        int l2 = e;
        f1 = (float)l1 / (float)k1;
        float f2 = (float)i2 / (float)k1;
        float af[] = new float[8];
        if(flag)
        {
            af[0] = 0.0F;
            af[1] = f2;
            af[2] = 1.0F;
            af[3] = f2;
            af[4] = 0.0F;
            af[5] = f2 - 1.0F;
            af[6] = 1.0F;
            af[7] = f2 - 1.0F;
        } else
        {
            af[0] = 0.0F;
            af[1] = 0.0F;
            af[2] = f1;
            af[3] = 0.0F;
            af[4] = 0.0F;
            af[5] = f2;
            af[6] = f1;
            af[7] = f2;
        }
        GLES20.glUseProgram(j1);
        w.position(0);
        w.put(new float[] {
            -1F, -1F, 1.0F, -1F, -1F, 1.0F, 1.0F, 1.0F
        }).position(0);
        GLES20.glEnableVertexAttribArray(j2);
        GLES20.glVertexAttribPointer(j2, 2, 5126, false, 0, w);
        x.position(0);
        x.put(af).position(0);
        GLES20.glEnableVertexAttribArray(k2);
        GLES20.glVertexAttribPointer(k2, 2, 5126, false, 0, x);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i1);
        GLES20.glUniform1i(l2, 0);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
    }

    static void a(y y1, Thread thread)
    {
        y1.s = null;
    }

    static void a(String s1)
    {
        f().y.add(s1);
    }

    private boolean a(int i1, int j1)
    {
        int ai[] = new int[1];
        int l1 = c(i1, j1);
        GLES20.glGenFramebuffers(1, ai, 0);
        i = ai[0];
        GLES20.glBindFramebuffer(36160, i);
        int k1;
        if(android.os.Build.VERSION.SDK_INT >= 18)
            k1 = 1;
        else
            k1 = 0;
        k = SmartBeatJni.newImageTargetTexture(i1, j1, n, k1);
        if(k <= 0)
        {
            GLES20.glDeleteFramebuffers(1, ai, 0);
            i = 0;
            return false;
        }
        GLES20.glBindTexture(3553, k);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, k, 0);
        i1 = GLES20.glCheckFramebufferStatus(36160);
        if(i1 != 36053)
        {
            N.a(P.a, String.format("failed to init fbo1 : %d", new Object[] {
                Integer.valueOf(i1)
            }));
            return false;
        }
        GLES20.glGenFramebuffers(1, ai, 0);
        h = ai[0];
        GLES20.glBindFramebuffer(36160, h);
        GLES20.glGenRenderbuffers(1, ai, 0);
        GLES20.glBindRenderbuffer(36161, ai[0]);
        if(android.os.Build.VERSION.SDK_INT >= 18)
        {
            GLES20.glRenderbufferStorage(36161, 35056, l1, l1);
            if(GLES20.glGetError() != 0)
            {
                GLES20.glBindRenderbuffer(36161, 0);
                GLES20.glDeleteRenderbuffers(1, ai, 0);
            } else
            {
                GLES20.glFramebufferRenderbuffer(36160, 36128, 36161, ai[0]);
            }
        }
        GLES20.glGenTextures(1, ai, 0);
        j = ai[0];
        GLES20.glBindTexture(3553, j);
        GLES20.glTexImage2D(3553, 0, 6408, l1, l1, 0, 6408, 5121, null);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j, 0);
        i1 = GLES20.glCheckFramebufferStatus(36160);
        if(i1 != 36053)
        {
            N.a(P.a, String.format("failed to init fbo2 : %d", new Object[] {
                Integer.valueOf(i1)
            }));
            return false;
        } else
        {
            w = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            x = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            return true;
        }
    }

    private static int b(int i1, int j1)
    {
        int l1 = Math.max(i1, j1);
        int k1 = 128;
        do
        {
            if(k1 >= l1 || k1 <= 0 || k1 * k1 > i1 * j1)
            {
                i1 = k1 >> 1;
                if(i1 > 512)
                    return 512;
                else
                    return i1;
            }
            k1 <<= 1;
        } while(true);
    }

    static Canvas b(y y1)
    {
        return y1.r;
    }

    static boolean b()
    {
        y y1;
        y1 = f();
        if(y1.t && y1.h <= 0)
        {
            EGL10 egl10 = (EGL10)EGLContext.getEGL();
            boolean flag;
            if(N.i())
                flag = false;
            else
                flag = true;
            y1.u = flag;
            if(!y1.u)
                if(android.os.Build.VERSION.SDK_INT < 14)
                {
                    N.a(P.d, "Not support ScreenCapture(GLES) (supports from Android 4.0)");
                    y1.t = false;
                } else
                if(c.q < 2)
                {
                    if(c.q == 0)
                        N.a(P.b, "OpenGLES version may not be set. Please set version!");
                    N.a(P.d, "Not support ScreenCapture(GLES) (supports from ES2.0)");
                    y1.t = false;
                } else
                if(!c.p)
                {
                    N.a(P.d, String.format("Not supported ScreenCapture(GLES) (NDK load failed arch=%s)", new Object[] {
                        Build.CPU_ABI
                    }));
                    y1.t = false;
                } else
                if(Build.MODEL == null || Build.MODEL.length() <= 0)
                {
                    N.a(P.d, "Not supported ScreenCapture(GLES) (model name is missing)");
                    y1.t = false;
                } else
                if(!com.smrtbeat.q.a(Build.MODEL) && !y1.d(Build.MODEL))
                {
                    y1.t = false;
                    N.a(P.d, String.format("Not support ScreenCapture(GLES) (unsupport model:%s)", new Object[] {
                        Build.MODEL
                    }));
                } else
                {
label0:
                    {
                        javax.microedition.khronos.egl.EGLDisplay egldisplay = egl10.eglGetCurrentDisplay();
                        javax.microedition.khronos.egl.EGLSurface eglsurface = egl10.eglGetCurrentSurface(12377);
                        int ai3[] = new int[1];
                        egl10.eglQuerySurface(egldisplay, eglsurface, 12375, ai3);
                        y1.l = ai3[0];
                        egl10.eglQuerySurface(egldisplay, eglsurface, 12374, ai3);
                        y1.m = ai3[0];
                        if(y1.l > 0 && y1.m > 0)
                            break label0;
                        if(android.os.Build.VERSION.SDK_INT >= 17)
                        {
                            int ai[] = new int[2];
                            android.opengl.EGLDisplay egldisplay1 = EGL14.eglGetCurrentDisplay();
                            android.opengl.EGLSurface eglsurface1 = EGL14.eglGetCurrentSurface(12377);
                            EGL14.eglQuerySurface(egldisplay1, eglsurface1, 12375, ai, 0);
                            EGL14.eglQuerySurface(egldisplay1, eglsurface1, 12374, ai, 1);
                            Point point = new Point(ai[0], ai[1]);
                            y1.l = point.x;
                            y1.m = point.y;
                        }
                        if(y1.l > 0 && y1.m > 0)
                            break label0;
                        y1.t = false;
                    }
                }
        }
_L2:
        int i1;
        A a1;
        int ai1[];
        int ai2[];
        int j1;
        int k1;
        int l1;
        boolean flag1;
        if(y1.t && !y1.u && y1.h > 0)
        {
            if(y1.s != null)
                i1 = 0;
            else
            if(y1.g)
            {
                i1 = 0;
            } else
            {
                long l2 = System.currentTimeMillis();
                if(l2 - y1.v < 1000L)
                    i1 = 0;
                else
                if(c.I)
                {
                    i1 = 0;
                } else
                {
                    y1.v = l2;
                    i1 = 1;
                }
            }
            if(i1 != 0)
            {
                GLES20.glBindFramebuffer(36160, y1.h);
                GLES20.glClear(16640);
                y1.g = true;
            }
        }
        e("beginOnDrawFrame");
        return f().t && !f().u;
        y1.n = b(y1.l, y1.m);
        c.J = GLES20.glGetString(7936);
        c.K = GLES20.glGetString(7937);
        c.L = GLES20.glGetString(7938);
        a1 = new A(y1);
        a1.a(0, true);
        k1 = y1.l;
        l1 = y1.m;
        ai2 = new int[1];
        j1 = c(k1, l1);
        GLES20.glGenFramebuffers(1, ai2, 0);
        y1.i = ai2[0];
        GLES20.glBindFramebuffer(36160, y1.i);
        if(android.os.Build.VERSION.SDK_INT >= 18)
            i1 = 1;
        else
            i1 = 0;
        y1.k = SmartBeatJni.newImageTargetTexture(k1, l1, y1.n, i1);
        if(y1.k <= 0)
        {
            GLES20.glDeleteFramebuffers(1, ai2, 0);
            y1.i = 0;
            flag1 = false;
        } else
        {
            GLES20.glBindTexture(3553, y1.k);
            GLES20.glTexParameteri(3553, 10241, 9728);
            GLES20.glTexParameteri(3553, 10240, 9728);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, y1.k, 0);
            i1 = GLES20.glCheckFramebufferStatus(36160);
            if(i1 != 36053)
            {
                N.a(P.a, String.format("failed to init fbo1 : %d", new Object[] {
                    Integer.valueOf(i1)
                }));
                flag1 = false;
            } else
            {
                GLES20.glGenFramebuffers(1, ai2, 0);
                y1.h = ai2[0];
                GLES20.glBindFramebuffer(36160, y1.h);
                GLES20.glGenRenderbuffers(1, ai2, 0);
                GLES20.glBindRenderbuffer(36161, ai2[0]);
                if(android.os.Build.VERSION.SDK_INT >= 18)
                {
                    GLES20.glRenderbufferStorage(36161, 35056, j1, j1);
                    if(GLES20.glGetError() != 0)
                    {
                        GLES20.glBindRenderbuffer(36161, 0);
                        GLES20.glDeleteRenderbuffers(1, ai2, 0);
                    } else
                    {
                        GLES20.glFramebufferRenderbuffer(36160, 36128, 36161, ai2[0]);
                    }
                }
                GLES20.glGenTextures(1, ai2, 0);
                y1.j = ai2[0];
                GLES20.glBindTexture(3553, y1.j);
                GLES20.glTexImage2D(3553, 0, 6408, j1, j1, 0, 6408, 5121, null);
                GLES20.glTexParameteri(3553, 10241, 9728);
                GLES20.glTexParameteri(3553, 10240, 9728);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, y1.j, 0);
                i1 = GLES20.glCheckFramebufferStatus(36160);
                if(i1 != 36053)
                {
                    N.a(P.a, String.format("failed to init fbo2 : %d", new Object[] {
                        Integer.valueOf(i1)
                    }));
                    flag1 = false;
                } else
                {
                    y1.w = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                    y1.x = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                    flag1 = true;
                }
            }
        }
        y1.t = flag1;
        a1.a(true, true);
        if(!y1.t)
        {
            N.a(P.d, "Not support ScreenCapture(GLES) (failed to alloc memory)");
            y1.h();
            y1.t = false;
        } else
        {
            k1 = a(35633, "attribute vec2 aPosition;\nattribute vec2 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = vec4(aPosition, 0.0, 1.0);\n  vTextureCoord = aTextureCoord;\n}\n");
            if(k1 == 0)
            {
                i1 = 0;
            } else
            {
                l1 = a(35632, "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                if(l1 == 0)
                {
                    i1 = 0;
                } else
                {
                    j1 = GLES20.glCreateProgram();
                    i1 = j1;
                    if(j1 != 0)
                    {
                        GLES20.glAttachShader(j1, k1);
                        e("glAttachShader");
                        GLES20.glAttachShader(j1, l1);
                        e("glAttachShader");
                        GLES20.glLinkProgram(j1);
                        ai1 = new int[1];
                        GLES20.glGetProgramiv(j1, 35714, ai1, 0);
                        i1 = j1;
                        if(ai1[0] != 1)
                        {
                            GLES20.glDeleteShader(k1);
                            GLES20.glDeleteShader(l1);
                            GLES20.glDeleteProgram(j1);
                            i1 = 0;
                        }
                    }
                }
            }
            y1.f = i1;
            y1.c = GLES20.glGetAttribLocation(y1.f, "aPosition");
            e("glGetAttribLocation aPosition");
            if(y1.c == -1)
            {
                N.a(P.a, "Could not get attrib location for aPosition");
                i1 = 0;
            } else
            {
                y1.d = GLES20.glGetAttribLocation(y1.f, "aTextureCoord");
                e("glGetAttribLocation aTextureCoord");
                if(y1.d == -1)
                {
                    N.a(P.a, "Could not get attrib location for aTextureCoord");
                    i1 = 0;
                } else
                {
                    y1.e = GLES20.glGetUniformLocation(y1.f, "sTexture");
                    e("glGetAttribLocation sTexture");
                    if(y1.e == -1)
                    {
                        N.a(P.a, "Could not get attrib location for sTexture");
                        i1 = 0;
                    } else
                    {
                        i1 = 1;
                    }
                }
            }
            if(i1 == 0)
            {
                N.a(P.a, "failed to init");
                y1.h();
                y1.t = false;
            } else
            {
                i1 = y1.n;
                i1 = SmartBeatJni.getTextureLongerSideLength();
                y1.o = ByteBuffer.allocateDirect(i1 * i1 << 2);
                y1.p = Bitmap.createBitmap(i1, i1, android.graphics.Bitmap.Config.ARGB_8888);
                i1 = c(y1.l, y1.m) / y1.n;
                y1.q = Bitmap.createBitmap(y1.l / i1, y1.m / i1, android.graphics.Bitmap.Config.ARGB_8888);
                y1.r = new Canvas(y1.q);
            }
        }
        if(true) goto _L2; else goto _L1
_L1:
    }

    static boolean b(String s1)
    {
        if(s1 == null || s1.length() <= 0)
            return false;
        if(com.smrtbeat.q.a(s1))
            return true;
        else
            return f().d(s1);
    }

    private static int c(int i1, int j1)
    {
        j1 = Math.max(i1, j1);
        i1 = 256;
        do
        {
            if(i1 >= j1 || i1 <= 0)
                return i1;
            i1 <<= 1;
        } while(true);
    }

    static Bitmap c(y y1)
    {
        return y1.q;
    }

    static void c()
    {
        y y1;
        y1 = f();
        break MISSING_BLOCK_LABEL_4;
        if(y1.t && !y1.u && y1.g)
        {
            int ai[] = new int[1];
            GLES20.glGetIntegerv(36006, ai, 0);
            if(ai[0] == y1.h)
            {
                int i1 = c(y1.l, y1.m);
                A a1 = new A(y1);
                a1.a(y1.j, true);
                GLES20.glBindFramebuffer(36160, y1.i);
                GLES20.glClear(16640);
                GLES20.glViewport(0, 0, y1.n, y1.n);
                y1.a(y1.j, y1.f, i1, y1.l, y1.m, 1.0F, true);
                a1.a(true, false);
                y1.s = new Thread((new z(y1)).a(y1.o));
                y1.s.start();
                a1 = new A(y1);
                a1.a(y1.j, true);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glClear(16640);
                GLES20.glViewport(0, 0, y1.l, y1.m);
                y1.a(y1.j, y1.f, i1, y1.l, y1.m, 1.0F, false);
                a1.a(true, false);
            }
            y1.g = false;
        }
        e("endOnDrawFrame");
        return;
    }

    static void c(String s1)
    {
        e(s1);
    }

    private void d()
    {
        boolean flag;
        flag = true;
        break MISSING_BLOCK_LABEL_3;
        if(t && h <= 0)
        {
            Object obj = (EGL10)EGLContext.getEGL();
            boolean flag1;
            if(N.i())
                flag1 = false;
            else
                flag1 = true;
            u = flag1;
            if(!u)
            {
                if(android.os.Build.VERSION.SDK_INT < 14)
                {
                    N.a(P.d, "Not support ScreenCapture(GLES) (supports from Android 4.0)");
                    t = false;
                    return;
                }
                if(c.q < 2)
                {
                    if(c.q == 0)
                        N.a(P.b, "OpenGLES version may not be set. Please set version!");
                    N.a(P.d, "Not support ScreenCapture(GLES) (supports from ES2.0)");
                    t = false;
                    return;
                }
                if(!c.p)
                {
                    N.a(P.d, String.format("Not supported ScreenCapture(GLES) (NDK load failed arch=%s)", new Object[] {
                        Build.CPU_ABI
                    }));
                    t = false;
                    return;
                }
                if(Build.MODEL == null || Build.MODEL.length() <= 0)
                {
                    N.a(P.d, "Not supported ScreenCapture(GLES) (model name is missing)");
                    t = false;
                    return;
                }
                if(!com.smrtbeat.q.a(Build.MODEL) && !d(Build.MODEL))
                {
                    t = false;
                    N.a(P.d, String.format("Not support ScreenCapture(GLES) (unsupport model:%s)", new Object[] {
                        Build.MODEL
                    }));
                    return;
                }
                javax.microedition.khronos.egl.EGLDisplay egldisplay = ((EGL10) (obj)).eglGetCurrentDisplay();
                javax.microedition.khronos.egl.EGLSurface eglsurface = ((EGL10) (obj)).eglGetCurrentSurface(12377);
                int ai3[] = new int[1];
                ((EGL10) (obj)).eglQuerySurface(egldisplay, eglsurface, 12375, ai3);
                l = ai3[0];
                ((EGL10) (obj)).eglQuerySurface(egldisplay, eglsurface, 12374, ai3);
                m = ai3[0];
                if(l <= 0 || m <= 0)
                {
                    if(android.os.Build.VERSION.SDK_INT >= 17)
                    {
                        int ai[] = new int[2];
                        android.opengl.EGLDisplay egldisplay1 = EGL14.eglGetCurrentDisplay();
                        android.opengl.EGLSurface eglsurface1 = EGL14.eglGetCurrentSurface(12377);
                        EGL14.eglQuerySurface(egldisplay1, eglsurface1, 12375, ai, 0);
                        EGL14.eglQuerySurface(egldisplay1, eglsurface1, 12374, ai, 1);
                        ai = new Point(ai[0], ai[1]);
                        l = ((Point) (ai)).x;
                        m = ((Point) (ai)).y;
                    }
                    if(l <= 0 || m <= 0)
                    {
                        t = false;
                        return;
                    }
                }
                n = b(l, m);
                c.J = GLES20.glGetString(7936);
                c.K = GLES20.glGetString(7937);
                c.L = GLES20.glGetString(7938);
                ai = new A(this);
                ai.a(0, true);
                int l1 = l;
                int i2 = m;
                int ai2[] = new int[1];
                int j1 = c(l1, i2);
                GLES20.glGenFramebuffers(1, ai2, 0);
                i = ai2[0];
                GLES20.glBindFramebuffer(36160, i);
                int i1;
                if(android.os.Build.VERSION.SDK_INT >= 18)
                    i1 = 1;
                else
                    i1 = 0;
                k = SmartBeatJni.newImageTargetTexture(l1, i2, n, i1);
                if(k <= 0)
                {
                    GLES20.glDeleteFramebuffers(1, ai2, 0);
                    i = 0;
                    flag1 = false;
                } else
                {
                    GLES20.glBindTexture(3553, k);
                    GLES20.glTexParameteri(3553, 10241, 9728);
                    GLES20.glTexParameteri(3553, 10240, 9728);
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, k, 0);
                    i1 = GLES20.glCheckFramebufferStatus(36160);
                    if(i1 != 36053)
                    {
                        N.a(P.a, String.format("failed to init fbo1 : %d", new Object[] {
                            Integer.valueOf(i1)
                        }));
                        flag1 = false;
                    } else
                    {
                        GLES20.glGenFramebuffers(1, ai2, 0);
                        h = ai2[0];
                        GLES20.glBindFramebuffer(36160, h);
                        GLES20.glGenRenderbuffers(1, ai2, 0);
                        GLES20.glBindRenderbuffer(36161, ai2[0]);
                        if(android.os.Build.VERSION.SDK_INT >= 18)
                        {
                            GLES20.glRenderbufferStorage(36161, 35056, j1, j1);
                            if(GLES20.glGetError() != 0)
                            {
                                GLES20.glBindRenderbuffer(36161, 0);
                                GLES20.glDeleteRenderbuffers(1, ai2, 0);
                            } else
                            {
                                GLES20.glFramebufferRenderbuffer(36160, 36128, 36161, ai2[0]);
                            }
                        }
                        GLES20.glGenTextures(1, ai2, 0);
                        j = ai2[0];
                        GLES20.glBindTexture(3553, j);
                        GLES20.glTexImage2D(3553, 0, 6408, j1, j1, 0, 6408, 5121, null);
                        GLES20.glTexParameteri(3553, 10241, 9728);
                        GLES20.glTexParameteri(3553, 10240, 9728);
                        GLES20.glTexParameteri(3553, 10242, 33071);
                        GLES20.glTexParameteri(3553, 10243, 33071);
                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j, 0);
                        i1 = GLES20.glCheckFramebufferStatus(36160);
                        if(i1 != 36053)
                        {
                            N.a(P.a, String.format("failed to init fbo2 : %d", new Object[] {
                                Integer.valueOf(i1)
                            }));
                            flag1 = false;
                        } else
                        {
                            w = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                            x = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                            flag1 = true;
                        }
                    }
                }
                t = flag1;
                ai.a(true, true);
                if(!t)
                {
                    N.a(P.d, "Not support ScreenCapture(GLES) (failed to alloc memory)");
                    h();
                    t = false;
                    return;
                }
                l1 = a(35633, "attribute vec2 aPosition;\nattribute vec2 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = vec4(aPosition, 0.0, 1.0);\n  vTextureCoord = aTextureCoord;\n}\n");
                if(l1 == 0)
                {
                    i1 = 0;
                } else
                {
                    int j2 = a(35632, "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                    if(j2 == 0)
                    {
                        i1 = 0;
                    } else
                    {
                        int k1 = GLES20.glCreateProgram();
                        i1 = k1;
                        if(k1 != 0)
                        {
                            GLES20.glAttachShader(k1, l1);
                            e("glAttachShader");
                            GLES20.glAttachShader(k1, j2);
                            e("glAttachShader");
                            GLES20.glLinkProgram(k1);
                            int ai1[] = new int[1];
                            GLES20.glGetProgramiv(k1, 35714, ai1, 0);
                            i1 = k1;
                            if(ai1[0] != 1)
                            {
                                GLES20.glDeleteShader(l1);
                                GLES20.glDeleteShader(j2);
                                GLES20.glDeleteProgram(k1);
                                i1 = 0;
                            }
                        }
                    }
                }
                f = i1;
                c = GLES20.glGetAttribLocation(f, "aPosition");
                e("glGetAttribLocation aPosition");
                if(c == -1)
                {
                    N.a(P.a, "Could not get attrib location for aPosition");
                    i1 = 0;
                } else
                {
                    d = GLES20.glGetAttribLocation(f, "aTextureCoord");
                    e("glGetAttribLocation aTextureCoord");
                    if(d == -1)
                    {
                        N.a(P.a, "Could not get attrib location for aTextureCoord");
                        i1 = 0;
                    } else
                    {
                        e = GLES20.glGetUniformLocation(f, "sTexture");
                        e("glGetAttribLocation sTexture");
                        i1 = ((flag) ? 1 : 0);
                        if(e == -1)
                        {
                            N.a(P.a, "Could not get attrib location for sTexture");
                            i1 = 0;
                        }
                    }
                }
                if(i1 == 0)
                {
                    N.a(P.a, "failed to init");
                    h();
                    t = false;
                    return;
                } else
                {
                    i1 = n;
                    i1 = SmartBeatJni.getTextureLongerSideLength();
                    o = ByteBuffer.allocateDirect(i1 * i1 << 2);
                    p = Bitmap.createBitmap(i1, i1, android.graphics.Bitmap.Config.ARGB_8888);
                    i1 = c(l, m) / n;
                    q = Bitmap.createBitmap(l / i1, m / i1, android.graphics.Bitmap.Config.ARGB_8888);
                    r = new Canvas(q);
                    return;
                }
            }
        }
        return;
    }

    private boolean d(String s1)
    {
        if(s1 == null)
            return false;
        Iterator iterator = y.iterator();
        do
            if(!iterator.hasNext())
                return false;
        while(!((String)iterator.next()).equals(s1));
        N.a(P.d, String.format("this model(%s) is allowd by custmer whitelist", new Object[] {
            s1
        }));
        return true;
    }

    private static void e(String s1)
    {
        do
        {
            int i1 = GLES20.glGetError();
            if(i1 == 0)
                return;
            N.a(P.a, String.format("%s:glErrro %d", new Object[] {
                s1, Integer.valueOf(i1)
            }));
        } while(true);
    }

    private static boolean e()
    {
        return c.p;
    }

    private static y f()
    {
        if(z != null) goto _L2; else goto _L1
_L1:
        com/smrtbeat/y;
        JVM INSTR monitorenter ;
        if(z == null)
            z = new y();
        com/smrtbeat/y;
        JVM INSTR monitorexit ;
_L2:
        return z;
        Exception exception;
        exception;
        throw exception;
    }

    private boolean g()
    {
        if(s == null && !g)
        {
            long l1 = System.currentTimeMillis();
            if(l1 - v >= 1000L && !c.I)
            {
                v = l1;
                return true;
            }
        }
        return false;
    }

    private void h()
    {
        e("cleanup");
        f = 0;
        h = -1;
        i = 0;
        l = 0;
        m = 0;
        if(p != null)
        {
            p.recycle();
            p = null;
        }
        if(q != null)
        {
            N.a(d.c, q);
            q = null;
        }
        if(r != null)
            r = null;
        v = System.currentTimeMillis();
        t = true;
    }

    private void i()
    {
        boolean flag;
        flag = false;
        if(t && h <= 0)
        {
            EGL10 egl10 = (EGL10)EGLContext.getEGL();
            boolean flag1;
            if(N.i())
                flag1 = false;
            else
                flag1 = true;
            u = flag1;
            if(!u)
                if(android.os.Build.VERSION.SDK_INT < 14)
                {
                    N.a(P.d, "Not support ScreenCapture(GLES) (supports from Android 4.0)");
                    t = false;
                } else
                if(c.q < 2)
                {
                    if(c.q == 0)
                        N.a(P.b, "OpenGLES version may not be set. Please set version!");
                    N.a(P.d, "Not support ScreenCapture(GLES) (supports from ES2.0)");
                    t = false;
                } else
                if(!c.p)
                {
                    N.a(P.d, String.format("Not supported ScreenCapture(GLES) (NDK load failed arch=%s)", new Object[] {
                        Build.CPU_ABI
                    }));
                    t = false;
                } else
                if(Build.MODEL == null || Build.MODEL.length() <= 0)
                {
                    N.a(P.d, "Not supported ScreenCapture(GLES) (model name is missing)");
                    t = false;
                } else
                if(!com.smrtbeat.q.a(Build.MODEL) && !d(Build.MODEL))
                {
                    t = false;
                    N.a(P.d, String.format("Not support ScreenCapture(GLES) (unsupport model:%s)", new Object[] {
                        Build.MODEL
                    }));
                } else
                {
label0:
                    {
                        javax.microedition.khronos.egl.EGLDisplay egldisplay = egl10.eglGetCurrentDisplay();
                        javax.microedition.khronos.egl.EGLSurface eglsurface = egl10.eglGetCurrentSurface(12377);
                        int ai3[] = new int[1];
                        egl10.eglQuerySurface(egldisplay, eglsurface, 12375, ai3);
                        l = ai3[0];
                        egl10.eglQuerySurface(egldisplay, eglsurface, 12374, ai3);
                        m = ai3[0];
                        if(l > 0 && m > 0)
                            break label0;
                        if(android.os.Build.VERSION.SDK_INT >= 17)
                        {
                            int ai[] = new int[2];
                            android.opengl.EGLDisplay egldisplay1 = EGL14.eglGetCurrentDisplay();
                            android.opengl.EGLSurface eglsurface1 = EGL14.eglGetCurrentSurface(12377);
                            EGL14.eglQuerySurface(egldisplay1, eglsurface1, 12375, ai, 0);
                            EGL14.eglQuerySurface(egldisplay1, eglsurface1, 12374, ai, 1);
                            Point point = new Point(ai[0], ai[1]);
                            l = point.x;
                            m = point.y;
                        }
                        if(l > 0 && m > 0)
                            break label0;
                        t = false;
                    }
                }
        }
_L2:
        int i1;
        A a1;
        int ai1[];
        int ai2[];
        int j1;
        int k1;
        int l1;
        boolean flag2;
        if(t && !u && h > 0)
        {
            if(s != null)
            {
                i1 = ((flag) ? 1 : 0);
            } else
            {
                i1 = ((flag) ? 1 : 0);
                if(!g)
                {
                    long l2 = System.currentTimeMillis();
                    i1 = ((flag) ? 1 : 0);
                    if(l2 - v >= 1000L)
                    {
                        i1 = ((flag) ? 1 : 0);
                        if(!c.I)
                        {
                            v = l2;
                            i1 = 1;
                        }
                    }
                }
            }
            if(i1 != 0)
            {
                GLES20.glBindFramebuffer(36160, h);
                GLES20.glClear(16640);
                g = true;
                return;
            }
        }
        return;
        n = b(l, m);
        c.J = GLES20.glGetString(7936);
        c.K = GLES20.glGetString(7937);
        c.L = GLES20.glGetString(7938);
        a1 = new A(this);
        a1.a(0, true);
        k1 = l;
        l1 = m;
        ai2 = new int[1];
        j1 = c(k1, l1);
        GLES20.glGenFramebuffers(1, ai2, 0);
        i = ai2[0];
        GLES20.glBindFramebuffer(36160, i);
        if(android.os.Build.VERSION.SDK_INT >= 18)
            i1 = 1;
        else
            i1 = 0;
        k = SmartBeatJni.newImageTargetTexture(k1, l1, n, i1);
        if(k <= 0)
        {
            GLES20.glDeleteFramebuffers(1, ai2, 0);
            i = 0;
            flag2 = false;
        } else
        {
            GLES20.glBindTexture(3553, k);
            GLES20.glTexParameteri(3553, 10241, 9728);
            GLES20.glTexParameteri(3553, 10240, 9728);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, k, 0);
            i1 = GLES20.glCheckFramebufferStatus(36160);
            if(i1 != 36053)
            {
                N.a(P.a, String.format("failed to init fbo1 : %d", new Object[] {
                    Integer.valueOf(i1)
                }));
                flag2 = false;
            } else
            {
                GLES20.glGenFramebuffers(1, ai2, 0);
                h = ai2[0];
                GLES20.glBindFramebuffer(36160, h);
                GLES20.glGenRenderbuffers(1, ai2, 0);
                GLES20.glBindRenderbuffer(36161, ai2[0]);
                if(android.os.Build.VERSION.SDK_INT >= 18)
                {
                    GLES20.glRenderbufferStorage(36161, 35056, j1, j1);
                    if(GLES20.glGetError() != 0)
                    {
                        GLES20.glBindRenderbuffer(36161, 0);
                        GLES20.glDeleteRenderbuffers(1, ai2, 0);
                    } else
                    {
                        GLES20.glFramebufferRenderbuffer(36160, 36128, 36161, ai2[0]);
                    }
                }
                GLES20.glGenTextures(1, ai2, 0);
                j = ai2[0];
                GLES20.glBindTexture(3553, j);
                GLES20.glTexImage2D(3553, 0, 6408, j1, j1, 0, 6408, 5121, null);
                GLES20.glTexParameteri(3553, 10241, 9728);
                GLES20.glTexParameteri(3553, 10240, 9728);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, j, 0);
                i1 = GLES20.glCheckFramebufferStatus(36160);
                if(i1 != 36053)
                {
                    N.a(P.a, String.format("failed to init fbo2 : %d", new Object[] {
                        Integer.valueOf(i1)
                    }));
                    flag2 = false;
                } else
                {
                    w = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                    x = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                    flag2 = true;
                }
            }
        }
        t = flag2;
        a1.a(true, true);
        if(!t)
        {
            N.a(P.d, "Not support ScreenCapture(GLES) (failed to alloc memory)");
            h();
            t = false;
        } else
        {
            k1 = a(35633, "attribute vec2 aPosition;\nattribute vec2 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = vec4(aPosition, 0.0, 1.0);\n  vTextureCoord = aTextureCoord;\n}\n");
            if(k1 == 0)
            {
                i1 = 0;
            } else
            {
                l1 = a(35632, "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                if(l1 == 0)
                {
                    i1 = 0;
                } else
                {
                    j1 = GLES20.glCreateProgram();
                    i1 = j1;
                    if(j1 != 0)
                    {
                        GLES20.glAttachShader(j1, k1);
                        e("glAttachShader");
                        GLES20.glAttachShader(j1, l1);
                        e("glAttachShader");
                        GLES20.glLinkProgram(j1);
                        ai1 = new int[1];
                        GLES20.glGetProgramiv(j1, 35714, ai1, 0);
                        i1 = j1;
                        if(ai1[0] != 1)
                        {
                            GLES20.glDeleteShader(k1);
                            GLES20.glDeleteShader(l1);
                            GLES20.glDeleteProgram(j1);
                            i1 = 0;
                        }
                    }
                }
            }
            f = i1;
            c = GLES20.glGetAttribLocation(f, "aPosition");
            e("glGetAttribLocation aPosition");
            if(c == -1)
            {
                N.a(P.a, "Could not get attrib location for aPosition");
                i1 = 0;
            } else
            {
                d = GLES20.glGetAttribLocation(f, "aTextureCoord");
                e("glGetAttribLocation aTextureCoord");
                if(d == -1)
                {
                    N.a(P.a, "Could not get attrib location for aTextureCoord");
                    i1 = 0;
                } else
                {
                    e = GLES20.glGetUniformLocation(f, "sTexture");
                    e("glGetAttribLocation sTexture");
                    if(e == -1)
                    {
                        N.a(P.a, "Could not get attrib location for sTexture");
                        i1 = 0;
                    } else
                    {
                        i1 = 1;
                    }
                }
            }
            if(i1 == 0)
            {
                N.a(P.a, "failed to init");
                h();
                t = false;
            } else
            {
                i1 = n;
                i1 = SmartBeatJni.getTextureLongerSideLength();
                o = ByteBuffer.allocateDirect(i1 * i1 << 2);
                p = Bitmap.createBitmap(i1, i1, android.graphics.Bitmap.Config.ARGB_8888);
                i1 = c(l, m) / n;
                q = Bitmap.createBitmap(l / i1, m / i1, android.graphics.Bitmap.Config.ARGB_8888);
                r = new Canvas(q);
            }
        }
        if(true) goto _L2; else goto _L1
_L1:
    }

    private void j()
    {
        while(!t || u || !g) 
            return;
        int ai[] = new int[1];
        GLES20.glGetIntegerv(36006, ai, 0);
        if(ai[0] == h)
        {
            int i1 = c(l, m);
            A a1 = new A(this);
            a1.a(j, true);
            GLES20.glBindFramebuffer(36160, i);
            GLES20.glClear(16640);
            GLES20.glViewport(0, 0, n, n);
            a(j, f, i1, l, m, 1.0F, true);
            a1.a(true, false);
            s = new Thread((new z(this)).a(o));
            s.start();
            a1 = new A(this);
            a1.a(j, true);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClear(16640);
            GLES20.glViewport(0, 0, l, m);
            a(j, f, i1, l, m, 1.0F, false);
            a1.a(true, false);
        }
        g = false;
    }

    private boolean k()
    {
        int k1 = a(35633, "attribute vec2 aPosition;\nattribute vec2 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = vec4(aPosition, 0.0, 1.0);\n  vTextureCoord = aTextureCoord;\n}\n");
        if(k1 != 0) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L4:
        f = i1;
        c = GLES20.glGetAttribLocation(f, "aPosition");
        e("glGetAttribLocation aPosition");
        if(c == -1)
        {
            N.a(P.a, "Could not get attrib location for aPosition");
            return false;
        }
        break; /* Loop/switch isn't completed */
_L2:
        int l1 = a(35632, "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        if(l1 == 0)
        {
            i1 = 0;
        } else
        {
            int j1 = GLES20.glCreateProgram();
            i1 = j1;
            if(j1 != 0)
            {
                GLES20.glAttachShader(j1, k1);
                e("glAttachShader");
                GLES20.glAttachShader(j1, l1);
                e("glAttachShader");
                GLES20.glLinkProgram(j1);
                int ai[] = new int[1];
                GLES20.glGetProgramiv(j1, 35714, ai, 0);
                i1 = j1;
                if(ai[0] != 1)
                {
                    GLES20.glDeleteShader(k1);
                    GLES20.glDeleteShader(l1);
                    GLES20.glDeleteProgram(j1);
                    i1 = 0;
                }
            }
        }
        if(true) goto _L4; else goto _L3
_L3:
        d = GLES20.glGetAttribLocation(f, "aTextureCoord");
        e("glGetAttribLocation aTextureCoord");
        if(d == -1)
        {
            N.a(P.a, "Could not get attrib location for aTextureCoord");
            return false;
        }
        e = GLES20.glGetUniformLocation(f, "sTexture");
        e("glGetAttribLocation sTexture");
        if(e == -1)
        {
            N.a(P.a, "Could not get attrib location for sTexture");
            return false;
        } else
        {
            return true;
        }
    }

    private static int l()
    {
        return 35056;
    }

    private static final int a = 4;
    private static final int b = 8;
    private static y z = null;
    private final String A;
    private final String B;
    private int c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private ByteBuffer o;
    private Bitmap p;
    private Bitmap q;
    private Canvas r;
    private Thread s;
    private boolean t;
    private boolean u;
    private long v;
    private FloatBuffer w;
    private FloatBuffer x;
    private List y;

}
