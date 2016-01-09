// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.lib;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package org.cocos2dx.lib:
//            Cocos2dxActivity, Cocos2dxEditBoxDialog

public class Cocos2dxHandler extends Handler
{
    public static class DialogMessage
    {

        public String message;
        public String titile;

        public DialogMessage(String s, String s1)
        {
            titile = s;
            message = s1;
        }
    }

    public static class EditBoxMessage
    {

        public String content;
        public int inputFlag;
        public int inputMode;
        public int maxLength;
        public int maxLines;
        public int returnType;
        public String title;

        public EditBoxMessage(String s, String s1, int i, int j, int k, int l, int i1)
        {
            content = s1;
            title = s;
            inputMode = i;
            inputFlag = j;
            returnType = k;
            maxLength = l;
            maxLines = i1;
        }
    }


    public Cocos2dxHandler(Cocos2dxActivity cocos2dxactivity)
    {
        mActivity = new WeakReference(cocos2dxactivity);
    }

    private void showDialog(Message message)
    {
        Cocos2dxActivity cocos2dxactivity = (Cocos2dxActivity)mActivity.get();
        message = (DialogMessage)message.obj;
        (new android.app.AlertDialog.Builder(cocos2dxactivity)).setTitle(((DialogMessage) (message)).titile).setMessage(((DialogMessage) (message)).message).setPositiveButton("Ok", new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

            final Cocos2dxHandler this$0;

            
            {
                this$0 = Cocos2dxHandler.this;
                super();
            }
        }
).create().show();
    }

    private void showEditBoxDialog(Message message)
    {
        message = (EditBoxMessage)message.obj;
        (new Cocos2dxEditBoxDialog((Context)mActivity.get(), ((EditBoxMessage) (message)).title, ((EditBoxMessage) (message)).content, ((EditBoxMessage) (message)).inputMode, ((EditBoxMessage) (message)).inputFlag, ((EditBoxMessage) (message)).returnType, ((EditBoxMessage) (message)).maxLength, ((EditBoxMessage) (message)).maxLines)).show();
    }

    public void handleMessage(Message message)
    {
        switch(message.what)
        {
        default:
            return;

        case 1: // '\001'
            showDialog(message);
            return;

        case 2: // '\002'
            showEditBoxDialog(message);
            break;
        }
    }

    public static final int HANDLER_SHOW_DIALOG = 1;
    public static final int HANDLER_SHOW_EDITBOX_DIALOG = 2;
    private WeakReference mActivity;
}
