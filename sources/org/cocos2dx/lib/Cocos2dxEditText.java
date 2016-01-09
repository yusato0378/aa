// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.lib;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.EditText;

// Referenced classes of package org.cocos2dx.lib:
//            Cocos2dxGLSurfaceView

public class Cocos2dxEditText extends EditText
{

    public Cocos2dxEditText(Context context)
    {
        super(context);
    }

    public Cocos2dxEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public Cocos2dxEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        super.onKeyDown(i, keyevent);
        if(i == 4)
            mCocos2dxGLSurfaceView.requestFocus();
        return true;
    }

    public void setCocos2dxGLSurfaceView(Cocos2dxGLSurfaceView cocos2dxglsurfaceview)
    {
        mCocos2dxGLSurfaceView = cocos2dxglsurfaceview;
    }

    private Cocos2dxGLSurfaceView mCocos2dxGLSurfaceView;
}
