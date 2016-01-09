// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.lib;


public class Cocos2dxLuaJavaBridge
{

    public Cocos2dxLuaJavaBridge()
    {
    }

    public static native int callLuaFunctionWithString(int i, String s);

    public static native int callLuaGlobalFunctionWithString(String s, String s1);

    public static native int releaseLuaFunction(int i);

    public static native int retainLuaFunction(int i);
}
