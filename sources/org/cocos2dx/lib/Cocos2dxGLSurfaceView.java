// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.lib;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.*;
import android.view.inputmethod.InputMethodManager;

// Referenced classes of package org.cocos2dx.lib:
//            Cocos2dxRenderer, Cocos2dxTextInputWraper, Cocos2dxVideoHelper, Cocos2dxEditText, 
//            Cocos2dxAccelerometer

public class Cocos2dxGLSurfaceView extends GLSurfaceView
{

    public Cocos2dxGLSurfaceView(Context context)
    {
        super(context);
        mscaleGestureDetector = null;
        initView();
    }

    public Cocos2dxGLSurfaceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mscaleGestureDetector = null;
        initView();
    }

    public static void closeIMEKeyboard()
    {
        Message message = new Message();
        message.what = 3;
        sHandler.sendMessage(message);
    }

    private static void dumpMotionEvent(MotionEvent motionevent)
    {
        StringBuilder stringbuilder = new StringBuilder();
        int i = motionevent.getAction();
        int k = i & 0xff;
        stringbuilder.append("event ACTION_").append((new String[] {
            "DOWN", "UP", "MOVE", "CANCEL", "OUTSIDE", "POINTER_DOWN", "POINTER_UP", "7?", "8?", "9?"
        })[k]);
        if(k == 5 || k == 6)
        {
            stringbuilder.append("(pid ").append(i >> 8);
            stringbuilder.append(")");
        }
        stringbuilder.append("[");
        for(int j = 0; j < motionevent.getPointerCount(); j++)
        {
            stringbuilder.append("#").append(j);
            stringbuilder.append("(pid ").append(motionevent.getPointerId(j));
            stringbuilder.append(")=").append((int)motionevent.getX(j));
            stringbuilder.append(",").append((int)motionevent.getY(j));
            if(j + 1 < motionevent.getPointerCount())
                stringbuilder.append(";");
        }

        stringbuilder.append("]");
        Log.d(TAG, stringbuilder.toString());
    }

    private String getContentText()
    {
        return mCocos2dxRenderer.getContentText();
    }

    public static Cocos2dxGLSurfaceView getInstance()
    {
        return mCocos2dxGLSurfaceView;
    }

    public static void openIMEKeyboard()
    {
        Message message = new Message();
        message.what = 2;
        message.obj = mCocos2dxGLSurfaceView.getContentText();
        sHandler.sendMessage(message);
    }

    public static void queueAccelerometer(float f, float f1, float f2, long l)
    {
        mCocos2dxGLSurfaceView.queueEvent(new Runnable(f, f1, f2, l) {

            public void run()
            {
                Cocos2dxAccelerometer.onSensorChanged(x, y, z, timestamp);
            }

            final long val$timestamp;
            final float val$x;
            final float val$y;
            final float val$z;

            
            {
                x = f;
                y = f1;
                z = f2;
                timestamp = l;
                super();
            }
        }
);
    }

    public void deleteBackward()
    {
        queueEvent(new Runnable() {

            public void run()
            {
                mCocos2dxRenderer.handleDeleteBackward();
            }

            final Cocos2dxGLSurfaceView this$0;

            
            {
                this$0 = Cocos2dxGLSurfaceView.this;
                super();
            }
        }
);
    }

    public Cocos2dxEditText getCocos2dxEditText()
    {
        return mCocos2dxEditText;
    }

    protected void initView()
    {
        setEGLContextClientVersion(2);
        setFocusableInTouchMode(true);
        mCocos2dxGLSurfaceView = this;
        sCocos2dxTextInputWraper = new Cocos2dxTextInputWraper(this);
        sHandler = new Handler() {

            public void handleMessage(Message message)
            {
                message.what;
                JVM INSTR tableswitch 2 3: default 28
            //                           2 29
            //                           3 151;
                   goto _L1 _L2 _L3
_L1:
                return;
_L2:
                if(mCocos2dxEditText != null && mCocos2dxEditText.requestFocus())
                {
                    mCocos2dxEditText.removeTextChangedListener(Cocos2dxGLSurfaceView.sCocos2dxTextInputWraper);
                    mCocos2dxEditText.setText("");
                    message = (String)message.obj;
                    mCocos2dxEditText.append(message);
                    Cocos2dxGLSurfaceView.sCocos2dxTextInputWraper.setOriginText(message);
                    mCocos2dxEditText.addTextChangedListener(Cocos2dxGLSurfaceView.sCocos2dxTextInputWraper);
                    ((InputMethodManager)Cocos2dxGLSurfaceView.mCocos2dxGLSurfaceView.getContext().getSystemService("input_method")).showSoftInput(mCocos2dxEditText, 0);
                    Log.d("GLSurfaceView", "showSoftInput");
                    return;
                }
                continue; /* Loop/switch isn't completed */
_L3:
                if(mCocos2dxEditText != null)
                {
                    mCocos2dxEditText.removeTextChangedListener(Cocos2dxGLSurfaceView.sCocos2dxTextInputWraper);
                    ((InputMethodManager)Cocos2dxGLSurfaceView.mCocos2dxGLSurfaceView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(mCocos2dxEditText.getWindowToken(), 0);
                    requestFocus();
                    Log.d("GLSurfaceView", "HideSoftInput");
                    return;
                }
                if(true) goto _L1; else goto _L4
_L4:
            }

            final Cocos2dxGLSurfaceView this$0;

            
            {
                this$0 = Cocos2dxGLSurfaceView.this;
                super();
            }
        }
;
    }

    public void insertText(final String pText)
    {
        queueEvent(new Runnable() {

            public void run()
            {
                mCocos2dxRenderer.handleInsertText(pText);
            }

            final Cocos2dxGLSurfaceView this$0;
            final String val$pText;

            
            {
                this$0 = Cocos2dxGLSurfaceView.this;
                pText = s;
                super();
            }
        }
);
    }

    public boolean onKeyDown(final int pKeyCode, KeyEvent keyevent)
    {
        switch(pKeyCode)
        {
        default:
            return super.onKeyDown(pKeyCode, keyevent);

        case 4: // '\004'
            Cocos2dxVideoHelper.mVideoHandler.sendEmptyMessage(1000);
            // fall through

        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 66: // 'B'
        case 82: // 'R'
        case 85: // 'U'
            queueEvent(new Runnable() {

                public void run()
                {
                    mCocos2dxRenderer.handleKeyDown(pKeyCode);
                }

                final Cocos2dxGLSurfaceView this$0;
                final int val$pKeyCode;

            
            {
                this$0 = Cocos2dxGLSurfaceView.this;
                pKeyCode = i;
                super();
            }
            }
);
            break;
        }
        return true;
    }

    public void onPause()
    {
        queueEvent(new Runnable() {

            public void run()
            {
                mCocos2dxRenderer.handleOnPause();
            }

            final Cocos2dxGLSurfaceView this$0;

            
            {
                this$0 = Cocos2dxGLSurfaceView.this;
                super();
            }
        }
);
        setRenderMode(0);
    }

    public void onResume()
    {
        super.onResume();
        setRenderMode(1);
        queueEvent(new Runnable() {

            public void run()
            {
                mCocos2dxRenderer.handleOnResume();
            }

            final Cocos2dxGLSurfaceView this$0;

            
            {
                this$0 = Cocos2dxGLSurfaceView.this;
                super();
            }
        }
);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        if(!isInEditMode())
            mCocos2dxRenderer.setScreenWidthAndHeight(i, j);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        final int ids[];
        final float xs[];
        final float ys[];
        int l = motionevent.getPointerCount();
        ids = new int[l];
        xs = new float[l];
        ys = new float[l];
        for(int i = 0; i < l; i++)
        {
            ids[i] = motionevent.getPointerId(i);
            xs[i] = motionevent.getX(i);
            ys[i] = motionevent.getY(i);
        }

        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 124
    //                   0 184
    //                   1 272
    //                   2 211
    //                   3 299
    //                   4 124
    //                   5 142
    //                   6 230;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
        if(mscaleGestureDetector != null)
            mscaleGestureDetector.onTouchEvent(motionevent);
        return true;
_L6:
        int j = motionevent.getAction() >> 8;
        queueEvent(new Runnable() {

            public void run()
            {
                mCocos2dxRenderer.handleActionDown(idPointerDown, xPointerDown, yPointerDown);
            }

            final Cocos2dxGLSurfaceView this$0;
            final int val$idPointerDown;
            final float val$xPointerDown;
            final float val$yPointerDown;

            
            {
                this$0 = Cocos2dxGLSurfaceView.this;
                idPointerDown = i;
                xPointerDown = f;
                yPointerDown = f1;
                super();
            }
        }
);
        continue; /* Loop/switch isn't completed */
_L2:
        queueEvent(new Runnable() {

            public void run()
            {
                mCocos2dxRenderer.handleActionDown(idDown, xDown, yDown);
            }

            final Cocos2dxGLSurfaceView this$0;
            final int val$idDown;
            final float val$xDown;
            final float val$yDown;

            
            {
                this$0 = Cocos2dxGLSurfaceView.this;
                idDown = i;
                xDown = f;
                yDown = f1;
                super();
            }
        }
);
        continue; /* Loop/switch isn't completed */
_L4:
        queueEvent(new Runnable() {

            public void run()
            {
                mCocos2dxRenderer.handleActionMove(ids, xs, ys);
            }

            final Cocos2dxGLSurfaceView this$0;
            final int val$ids[];
            final float val$xs[];
            final float val$ys[];

            
            {
                this$0 = Cocos2dxGLSurfaceView.this;
                ids = ai;
                xs = af;
                ys = af1;
                super();
            }
        }
);
        continue; /* Loop/switch isn't completed */
_L7:
        int k = motionevent.getAction() >> 8;
        queueEvent(new Runnable() {

            public void run()
            {
                mCocos2dxRenderer.handleActionUp(idPointerUp, xPointerUp, yPointerUp);
            }

            final Cocos2dxGLSurfaceView this$0;
            final int val$idPointerUp;
            final float val$xPointerUp;
            final float val$yPointerUp;

            
            {
                this$0 = Cocos2dxGLSurfaceView.this;
                idPointerUp = i;
                xPointerUp = f;
                yPointerUp = f1;
                super();
            }
        }
);
        continue; /* Loop/switch isn't completed */
_L3:
        queueEvent(new Runnable() {

            public void run()
            {
                mCocos2dxRenderer.handleActionUp(idUp, xUp, yUp);
            }

            final Cocos2dxGLSurfaceView this$0;
            final int val$idUp;
            final float val$xUp;
            final float val$yUp;

            
            {
                this$0 = Cocos2dxGLSurfaceView.this;
                idUp = i;
                xUp = f;
                yUp = f1;
                super();
            }
        }
);
        continue; /* Loop/switch isn't completed */
_L5:
        queueEvent(new Runnable() {

            public void run()
            {
                mCocos2dxRenderer.handleActionCancel(ids, xs, ys);
            }

            final Cocos2dxGLSurfaceView this$0;
            final int val$ids[];
            final float val$xs[];
            final float val$ys[];

            
            {
                this$0 = Cocos2dxGLSurfaceView.this;
                ids = ai;
                xs = af;
                ys = af1;
                super();
            }
        }
);
        if(true) goto _L1; else goto _L8
_L8:
    }

    public void setCocos2dxEditText(Cocos2dxEditText cocos2dxedittext)
    {
        mCocos2dxEditText = cocos2dxedittext;
        if(mCocos2dxEditText != null && sCocos2dxTextInputWraper != null)
        {
            mCocos2dxEditText.setOnEditorActionListener(sCocos2dxTextInputWraper);
            mCocos2dxEditText.setCocos2dxGLSurfaceView(this);
            requestFocus();
        }
    }

    public void setCocos2dxRenderer(Cocos2dxRenderer cocos2dxrenderer)
    {
        mCocos2dxRenderer = cocos2dxrenderer;
        setRenderer(mCocos2dxRenderer);
    }

    public void setScaleGestureDetector(ScaleGestureDetector scalegesturedetector)
    {
        mscaleGestureDetector = scalegesturedetector;
    }

    private static final int HANDLER_CLOSE_IME_KEYBOARD = 3;
    private static final int HANDLER_OPEN_IME_KEYBOARD = 2;
    private static final String TAG = org/cocos2dx/lib/Cocos2dxGLSurfaceView.getSimpleName();
    private static Cocos2dxGLSurfaceView mCocos2dxGLSurfaceView;
    private static Cocos2dxTextInputWraper sCocos2dxTextInputWraper;
    private static Handler sHandler;
    private Cocos2dxEditText mCocos2dxEditText;
    private Cocos2dxRenderer mCocos2dxRenderer;
    private ScaleGestureDetector mscaleGestureDetector;





}
