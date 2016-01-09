// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.lib;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.util.DisplayMetrics;
import android.view.*;
import android.view.inputmethod.InputMethodManager;
import android.widget.*;

// Referenced classes of package org.cocos2dx.lib:
//            Cocos2dxHelper

public class Cocos2dxEditBoxDialog extends Dialog
{

    public Cocos2dxEditBoxDialog(Context context, String s, String s1, int i, int j, int k, int l, 
            int i1)
    {
        super(context, 0x1030011);
        mTitle = s;
        mMessage = s1;
        mInputMode = i;
        mInputFlag = j;
        mReturnType = k;
        mMaxLength = l;
        mMaxLines = i1;
        if(i1 > 0)
        {
            mIsMultiline = true;
            return;
        } else
        {
            mIsMultiline = false;
            return;
        }
    }

    private void closeKeyboard()
    {
        ((InputMethodManager)getContext().getSystemService("input_method")).hideSoftInputFromWindow(mInputEditText.getWindowToken(), 0);
    }

    private int convertDipsToPixels(float f)
    {
        return Math.round(f * getContext().getResources().getDisplayMetrics().density);
    }

    private void openKeyboard()
    {
        ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(mInputEditText, 0);
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        Rect rect = new Rect();
        getWindow().getDecorView().getHitRect(rect);
        if(!rect.contains((int)motionevent.getX(), (int)motionevent.getY()))
        {
            Cocos2dxHelper.setEditTextDialogResult(mInputEditText.getText().toString());
            closeKeyboard();
            dismiss();
        }
        return super.dispatchTouchEvent(motionevent);
    }

    protected void onCreate(Bundle bundle)
    {
        int i;
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0x80000000));
        bundle = getWindow().getAttributes();
        bundle.gravity = 48;
        getWindow().setAttributes(bundle);
        bundle = new LinearLayout(getContext());
        bundle.setOrientation(1);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        mTextViewTitle = new TextView(getContext());
        android.widget.LinearLayout.LayoutParams layoutparams1 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        i = convertDipsToPixels(10F);
        layoutparams1.rightMargin = i;
        layoutparams1.leftMargin = i;
        mTextViewTitle.setTextSize(1, 20F);
        bundle.addView(mTextViewTitle, layoutparams1);
        mInputEditText = new EditText(getContext());
        layoutparams1 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        i = convertDipsToPixels(10F);
        layoutparams1.rightMargin = i;
        layoutparams1.leftMargin = i;
        bundle.addView(mInputEditText, layoutparams1);
        setContentView(bundle, layoutparams);
        getWindow().addFlags(1024);
        mTextViewTitle.setText(mTitle);
        mInputEditText.setText(mMessage);
        i = mInputEditText.getImeOptions();
        mInputEditText.setImeOptions(0x10000000 | i);
        i = mInputEditText.getImeOptions();
        mInputMode;
        JVM INSTR tableswitch 0 6: default 308
    //                   0 586
    //                   1 596
    //                   2 605
    //                   3 615
    //                   4 623
    //                   5 632
    //                   6 642;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if(mIsMultiline)
        {
            mInputModeContraints = mInputModeContraints | 0x20000;
            mInputEditText.setLines(mMaxLines);
            mInputEditText.setMaxLines(mMaxLines);
        }
        mInputEditText.setInputType(mInputModeContraints | mInputFlagConstraints);
        mInputFlag;
        JVM INSTR tableswitch 0 4: default 404
    //                   0 650
    //                   1 660
    //                   2 670
    //                   3 680
    //                   4 690;
           goto _L9 _L10 _L11 _L12 _L13 _L14
_L9:
        mInputEditText.setInputType(mInputFlagConstraints | mInputModeContraints);
        mReturnType;
        JVM INSTR tableswitch 0 4: default 460
    //                   0 700
    //                   1 714
    //                   2 729
    //                   3 743
    //                   4 757;
           goto _L15 _L16 _L17 _L18 _L19 _L20
_L20:
        break MISSING_BLOCK_LABEL_757;
_L15:
        mInputEditText.setImeOptions(i | 1);
_L21:
        if(mMaxLength > 0)
            mInputEditText.setFilters(new InputFilter[] {
                new android.text.InputFilter.LengthFilter(mMaxLength)
            });
        (new Handler()).postDelayed(new Runnable() {

            public void run()
            {
                mInputEditText.requestFocus();
                mInputEditText.setSelection(mInputEditText.length());
                openKeyboard();
            }

            final Cocos2dxEditBoxDialog this$0;

            
            {
                this$0 = Cocos2dxEditBoxDialog.this;
                super();
            }
        }
, 200L);
        mInputEditText.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            public void onFocusChange(View view, boolean flag)
            {
                if(!flag)
                {
                    Cocos2dxHelper.setEditTextDialogResult(mInputEditText.getText().toString());
                    closeKeyboard();
                    dismiss();
                }
            }

            final Cocos2dxEditBoxDialog this$0;

            
            {
                this$0 = Cocos2dxEditBoxDialog.this;
                super();
            }
        }
);
        mInputEditText.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            public boolean onEditorAction(TextView textview, int j, KeyEvent keyevent)
            {
                if(!mIsMultiline && (j != 0 || j == 0 && keyevent != null && keyevent.getAction() == 0))
                {
                    Cocos2dxHelper.setEditTextDialogResult(mInputEditText.getText().toString());
                    closeKeyboard();
                    dismiss();
                    return true;
                } else
                {
                    return false;
                }
            }

            final Cocos2dxEditBoxDialog this$0;

            
            {
                this$0 = Cocos2dxEditBoxDialog.this;
                super();
            }
        }
);
        mInputEditText.setOnKeyListener(new android.view.View.OnKeyListener() {

            public boolean onKey(View view, int j, KeyEvent keyevent)
            {
                return j == 66 && keyevent.getAction() == 0 && mIsMultiline && ((EditText)view).getLineCount() >= mMaxLines;
            }

            final Cocos2dxEditBoxDialog this$0;

            
            {
                this$0 = Cocos2dxEditBoxDialog.this;
                super();
            }
        }
);
        getWindow().setLayout(-1, -2);
        setCanceledOnTouchOutside(true);
        return;
_L2:
        mInputModeContraints = 0x20001;
          goto _L1
_L3:
        mInputModeContraints = 33;
          goto _L1
_L4:
        mInputModeContraints = 4098;
          goto _L1
_L5:
        mInputModeContraints = 3;
          goto _L1
_L6:
        mInputModeContraints = 17;
          goto _L1
_L7:
        mInputModeContraints = 12290;
          goto _L1
_L8:
        mInputModeContraints = 1;
          goto _L1
_L10:
        mInputFlagConstraints = 129;
          goto _L9
_L11:
        mInputFlagConstraints = 0x80000;
          goto _L9
_L12:
        mInputFlagConstraints = 8192;
          goto _L9
_L13:
        mInputFlagConstraints = 16384;
          goto _L9
_L14:
        mInputFlagConstraints = 4096;
          goto _L9
_L16:
        mInputEditText.setImeOptions(i | 1);
          goto _L21
_L17:
        mInputEditText.setImeOptions(i | 6);
          goto _L21
_L18:
        mInputEditText.setImeOptions(i | 4);
          goto _L21
_L19:
        mInputEditText.setImeOptions(i | 3);
          goto _L21
        mInputEditText.setImeOptions(i | 2);
          goto _L21
    }

    private final int kEditBoxInputFlagInitialCapsAllCharacters = 4;
    private final int kEditBoxInputFlagInitialCapsSentence = 3;
    private final int kEditBoxInputFlagInitialCapsWord = 2;
    private final int kEditBoxInputFlagPassword = 0;
    private final int kEditBoxInputFlagSensitive = 1;
    private final int kEditBoxInputModeAny = 0;
    private final int kEditBoxInputModeDecimal = 5;
    private final int kEditBoxInputModeEmailAddr = 1;
    private final int kEditBoxInputModeNumeric = 2;
    private final int kEditBoxInputModePhoneNumber = 3;
    private final int kEditBoxInputModeSingleLine = 6;
    private final int kEditBoxInputModeUrl = 4;
    private final int kKeyboardReturnTypeDefault = 0;
    private final int kKeyboardReturnTypeDone = 1;
    private final int kKeyboardReturnTypeGo = 4;
    private final int kKeyboardReturnTypeSearch = 3;
    private final int kKeyboardReturnTypeSend = 2;
    private EditText mInputEditText;
    private final int mInputFlag;
    private int mInputFlagConstraints;
    private final int mInputMode;
    private int mInputModeContraints;
    private boolean mIsMultiline;
    private final int mMaxLength;
    private final int mMaxLines;
    private final String mMessage;
    private final int mReturnType;
    private TextView mTextViewTitle;
    private final String mTitle;





}
