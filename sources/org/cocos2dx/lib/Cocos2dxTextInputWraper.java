// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.lib;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

// Referenced classes of package org.cocos2dx.lib:
//            Cocos2dxGLSurfaceView

public class Cocos2dxTextInputWraper
    implements TextWatcher, android.widget.TextView.OnEditorActionListener
{

    public Cocos2dxTextInputWraper(Cocos2dxGLSurfaceView cocos2dxglsurfaceview)
    {
        mCocos2dxGLSurfaceView = cocos2dxglsurfaceview;
    }

    private boolean isFullScreenEdit()
    {
        return ((InputMethodManager)mCocos2dxGLSurfaceView.getCocos2dxEditText().getContext().getSystemService("input_method")).isFullscreenMode();
    }

    public void afterTextChanged(Editable editable)
    {
        if(isFullScreenEdit())
            return;
        int j = editable.length() - mText.length();
        int i = j;
        if(j > 0)
        {
            String s = editable.subSequence(mText.length(), editable.length()).toString();
            mCocos2dxGLSurfaceView.insertText(s);
        } else
        {
            while(i < 0) 
            {
                mCocos2dxGLSurfaceView.deleteBackward();
                i++;
            }
        }
        mText = editable.toString();
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        mText = charsequence.toString();
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if(mCocos2dxGLSurfaceView.getCocos2dxEditText() == textview && isFullScreenEdit())
        {
            if(mOriginText != null)
            {
                for(int j = mOriginText.length(); j > 0; j--)
                    mCocos2dxGLSurfaceView.deleteBackward();

            }
            String s = textview.getText().toString();
            keyevent = s;
            if(s != null)
            {
                textview = s;
                if(s.compareTo("") == 0)
                    textview = "\n";
                keyevent = textview;
                if('\n' != textview.charAt(textview.length() - 1))
                    keyevent = (new StringBuilder()).append(textview).append('\n').toString();
            }
            mCocos2dxGLSurfaceView.insertText(keyevent);
        }
        if(i == 6)
            mCocos2dxGLSurfaceView.requestFocus();
        return false;
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void setOriginText(String s)
    {
        mOriginText = s;
    }

    private static final String TAG = org/cocos2dx/lib/Cocos2dxTextInputWraper.getSimpleName();
    private final Cocos2dxGLSurfaceView mCocos2dxGLSurfaceView;
    private String mOriginText;
    private String mText;

}
