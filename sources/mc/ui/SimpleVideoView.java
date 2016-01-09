// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package mc.ui;

import android.app.*;
import android.content.*;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.*;
import android.widget.RelativeLayout;
import java.io.IOException;
import mc.core.MCLog;
import org.cocos2dx.lib.Cocos2dxActivity;

public class SimpleVideoView extends Activity
    implements android.view.SurfaceHolder.Callback, android.media.MediaPlayer.OnCompletionListener
{
    public static class SkipVideoDialogFragment extends DialogFragment
    {

        public Dialog onCreateDialog(Bundle bundle)
        {
            bundle = new android.app.AlertDialog.Builder(getActivity());
            bundle.setMessage("\u30B9\u30AD\u30C3\u30D7\u3057\u307E\u3059\u304B\uFF1F").setPositiveButton("\u306F\u3044", new android.content.DialogInterface.OnClickListener() {

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    MCLog.v("SkipVideoDialogFragment push PositiveButton", new Object[0]);
                    ((SimpleVideoView)getActivity()).removeVideo();
                }

                final SkipVideoDialogFragment this$0;

            
            {
                this$0 = SkipVideoDialogFragment.this;
                super();
            }
            }
).setNegativeButton("\u3044\u3044\u3048", new android.content.DialogInterface.OnClickListener() {

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    MCLog.v("SkipVideoDialogFragment push NegativeButton", new Object[0]);
                }

                final SkipVideoDialogFragment this$0;

            
            {
                this$0 = SkipVideoDialogFragment.this;
                super();
            }
            }
);
            return bundle.create();
        }

        public SkipVideoDialogFragment()
        {
        }
    }


    public SimpleVideoView()
    {
        m_finishfuncFlag = false;
    }

    private void finishFunc()
    {
        if(m_finishfuncFlag)
        {
            MCLog.v("finishFunc", new Object[0]);
            m_finishfuncFlag = false;
            ((Cocos2dxActivity)Cocos2dxActivity.getContext()).runOnGLThread(new Runnable() {

                public void run()
                {
                    finishMovie();
                }

                final SimpleVideoView this$0;

            
            {
                this$0 = SimpleVideoView.this;
                super();
            }
            }
);
        }
    }

    private native void finishMovie();

    public static void play(String s)
    {
        MCLog.v((new StringBuilder()).append("simple video view play:").append(s).toString(), new Object[0]);
        Context context = Cocos2dxActivity.getContext();
        Intent intent = new Intent();
        intent.setClass(context, mc/ui/SimpleVideoView);
        intent.putExtra("path", s);
        context.startActivity(intent);
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        MCLog.v("Video OnCompletion", new Object[0]);
        removeVideo();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        MCLog.v("Video onCreate", new Object[0]);
        bundle = new SurfaceView(this);
        bundle.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        Object obj = bundle.getHolder();
        ((SurfaceHolder) (obj)).addCallback(this);
        ((SurfaceHolder) (obj)).setType(3);
        Object obj1 = ((WindowManager)getSystemService("window")).getDefaultDisplay();
        obj = new Point();
        ((Display) (obj1)).getSize(((Point) (obj)));
        player = new MediaPlayer();
        float f;
        float f1;
        float f2;
        int i;
        try
        {
            obj1 = getIntent().getStringExtra("path");
            obj1 = getAssets().openFd(((String) (obj1)));
            player.setDataSource(((AssetFileDescriptor) (obj1)).getFileDescriptor(), ((AssetFileDescriptor) (obj1)).getStartOffset(), ((AssetFileDescriptor) (obj1)).getLength());
            player.setOnCompletionListener(this);
            player.prepare();
            f = player.getVideoWidth();
            f1 = player.getVideoHeight();
            i = ((Point) (obj)).x;
        }
        // Misplaced declaration of an exception variable
        catch(Bundle bundle)
        {
            MCLog.v("file not found", new Object[0]);
            MCLog.v((new StringBuilder()).append("").append(bundle).toString(), new Object[0]);
            return;
        }
        f2 = (float)i / f;
        obj = new RelativeLayout(this);
        obj1 = new android.widget.RelativeLayout.LayoutParams((int)(f * f2), (int)(f1 * f2));
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(13, 1);
        ((RelativeLayout) (obj)).addView(bundle, ((android.view.ViewGroup.LayoutParams) (obj1)));
        bundle.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                (new SkipVideoDialogFragment()).show(getFragmentManager(), "dialog");
            }

            final SimpleVideoView this$0;

            
            {
                this$0 = SimpleVideoView.this;
                super();
            }
        }
);
        setContentView(((View) (obj)));
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if(i != 4);
        return super.onKeyDown(i, keyevent);
    }

    protected void onPause()
    {
        super.onPause();
        MCLog.v("Video onPause", new Object[0]);
        removeVideo();
    }

    protected void onStop()
    {
        super.onStop();
        MCLog.v("Video onStop", new Object[0]);
    }

    public void removeVideo()
    {
        if(player != null)
        {
            player.reset();
            player.release();
            player = null;
            finishFunc();
            finish();
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        MCLog.v("Video surfaceChanged", new Object[0]);
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        MCLog.v("Video SurfaceView create", new Object[0]);
        player.setDisplay(surfaceholder);
        player.start();
        m_finishfuncFlag = true;
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        MCLog.v("Video surfaceDestroyed", new Object[0]);
    }

    private boolean m_finishfuncFlag;
    private MediaPlayer player;

}
