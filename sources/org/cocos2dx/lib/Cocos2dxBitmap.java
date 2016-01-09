// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.lib;

import android.content.Context;
import android.graphics.*;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedList;

// Referenced classes of package org.cocos2dx.lib:
//            Cocos2dxTypefaces

public class Cocos2dxBitmap
{
    private static class TextProperty
    {

        private final int mHeightPerLine;
        private final String mLines[];
        private final int mMaxWidth;
        private final int mTotalHeight;





        TextProperty(int i, int j, String as[])
        {
            mMaxWidth = i;
            mHeightPerLine = j;
            mTotalHeight = as.length * j;
            mLines = as;
        }
    }


    public Cocos2dxBitmap()
    {
    }

    private static TextProperty computeTextProperty(String s, int i, int j, Paint paint)
    {
        int k;
        int i1;
        android.graphics.Paint.FontMetricsInt fontmetricsint = paint.getFontMetricsInt();
        i1 = (int)Math.ceil(fontmetricsint.bottom - fontmetricsint.top);
        k = 0;
        s = splitString(s, i, j, paint);
        if(i == 0) goto _L2; else goto _L1
_L1:
        k = i;
_L4:
        return new TextProperty(k, i1, s);
_L2:
        int j1 = s.length;
        j = 0;
        i = k;
        do
        {
            k = i;
            if(j >= j1)
                continue;
            String s1 = s[j];
            int l = (int)Math.ceil(paint.measureText(s1, 0, s1.length()));
            k = i;
            if(l > i)
                k = l;
            j++;
            i = k;
        } while(true);
        if(true) goto _L4; else goto _L3
_L3:
    }

    private static int computeX(String s, int i, int j)
    {
        switch(j)
        {
        default:
            return 0;

        case 3: // '\003'
            return i / 2;

        case 2: // '\002'
            return i;
        }
    }

    private static int computeY(android.graphics.Paint.FontMetricsInt fontmetricsint, int i, int j, int k)
    {
        int l = -fontmetricsint.top;
        if(i <= j) goto _L2; else goto _L1
_L1:
        k;
        JVM INSTR tableswitch 1 3: default 40
    //                   1 43
    //                   2 61
    //                   3 49;
           goto _L2 _L3 _L4 _L5
_L2:
        return l;
_L3:
        return -fontmetricsint.top;
_L5:
        return -fontmetricsint.top + (i - j) / 2;
_L4:
        return -fontmetricsint.top + (i - j);
    }

    public static void createTextBitmap(String s, String s1, int i, int j, int k, int l)
    {
        createTextBitmapShadowStroke(s, s1, i, 1.0F, 1.0F, 1.0F, j, k, l, false, 0.0F, 0.0F, 0.0F, 0.0F, false, 1.0F, 1.0F, 1.0F, 1.0F);
    }

    public static boolean createTextBitmapShadowStroke(String s, String s1, int i, float f, float f1, float f2, int j, int k, 
            int l, boolean flag, float f3, float f4, float f5, float f6, boolean flag1, 
            float f7, float f8, float f9, float f10)
    {
        int i1 = j & 0xf;
        int j1 = j >> 4 & 0xf;
        Object obj = refactorString(s);
        s = newPaint(s1, i, i1);
        if(k != 0 && (int)Math.ceil(s.measureText(((String) (obj)), 0, 1)) > k)
        {
            Log.w("createTextBitmapShadowStroke warning:", "the input width is less than the width of the pString's first word\n");
            return false;
        }
        s.setARGB(255, (int)(255D * (double)f), (int)(255D * (double)f1), (int)(255D * (double)f2));
        obj = computeTextProperty(((String) (obj)), k, l, s);
        if(l == 0)
            j = ((TextProperty) (obj)).mTotalHeight;
        else
            j = l;
        if(((TextProperty) (obj)).mMaxWidth == 0 || j == 0)
        {
            Log.w("createTextBitmapShadowStroke warning:", "textProperty MaxWidth is 0 or bitMapTotalHeight is 0\n");
            return false;
        }
        Bitmap bitmap = Bitmap.createBitmap(((TextProperty) (obj)).mMaxWidth + (int)0.0F, (int)0.0F + j, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        Object obj1 = s.getFontMetricsInt();
        if(flag1)
        {
            s1 = newPaint(s1, i, i1);
            s1.setStyle(android.graphics.Paint.Style.STROKE);
            s1.setStrokeWidth(f10);
            s1.setARGB(255, (int)(255F * f7), (int)(255F * f8), (int)(255F * f9));
            j = computeY(((android.graphics.Paint.FontMetricsInt) (obj1)), l, ((TextProperty) (obj)).mTotalHeight, j1);
            obj1 = ((TextProperty) (obj)).mLines;
            k = obj1.length;
            for(i = 0; i < k; i++)
            {
                String s3 = obj1[i];
                l = computeX(s3, ((TextProperty) (obj)).mMaxWidth, i1);
                canvas.drawText(s3, (float)l + 0.0F, (float)j + 0.0F, s1);
                canvas.drawText(s3, (float)l + 0.0F, (float)j + 0.0F, s);
                j += ((TextProperty) (obj)).mHeightPerLine;
            }

        } else
        {
            j = computeY(((android.graphics.Paint.FontMetricsInt) (obj1)), l, ((TextProperty) (obj)).mTotalHeight, j1);
            s1 = ((TextProperty) (obj)).mLines;
            k = s1.length;
            for(i = 0; i < k; i++)
            {
                String s2 = s1[i];
                canvas.drawText(s2, (float)computeX(s2, ((TextProperty) (obj)).mMaxWidth, i1) + 0.0F, (float)j + 0.0F, s);
                j += ((TextProperty) (obj)).mHeightPerLine;
            }

        }
        initNativeObject(bitmap);
        return true;
    }

    private static LinkedList divideStringWithMaxWidth(String s, int i, Paint paint)
    {
        int j1 = s.length();
        int k = 0;
        LinkedList linkedlist = new LinkedList();
        for(int j = 1; j <= j1;)
        {
            int k1 = (int)Math.ceil(paint.measureText(s, k, j));
            int i1 = j;
            int l = k;
            if(k1 >= i)
            {
                l = s.substring(0, j).lastIndexOf(" ");
                if(l != -1 && l > k)
                    linkedlist.add(s.substring(k, l));
                else
                if(k1 > i)
                {
                    linkedlist.add(s.substring(k, j - 1));
                    j--;
                } else
                {
                    linkedlist.add(s.substring(k, j));
                }
                for(j = l + 1; j < j1 && s.charAt(j) == ' '; j++);
                l = j;
                i1 = j;
            }
            j = i1 + 1;
            k = l;
        }

        if(k < j1)
            linkedlist.add(s.substring(k));
        return linkedlist;
    }

    private static int getFontSizeAccordingHeight(int i)
    {
        Paint paint = new Paint();
        Rect rect = new Rect();
        paint.setTypeface(Typeface.DEFAULT);
        int j = 1;
        boolean flag = false;
        while(!flag) 
        {
            paint.setTextSize(j);
            paint.getTextBounds("SghMNy", 0, "SghMNy".length(), rect);
            j++;
            if(i - rect.height() <= 2)
                flag = true;
            Log.d("font size", (new StringBuilder()).append("incr size:").append(j).toString());
        }
        return j;
    }

    private static byte[] getPixels(Bitmap bitmap)
    {
        if(bitmap != null)
        {
            byte abyte0[] = new byte[bitmap.getWidth() * bitmap.getHeight() * 4];
            ByteBuffer bytebuffer = ByteBuffer.wrap(abyte0);
            bytebuffer.order(ByteOrder.nativeOrder());
            bitmap.copyPixelsToBuffer(bytebuffer);
            return abyte0;
        } else
        {
            return null;
        }
    }

    private static String getStringWithEllipsis(String s, float f, float f1)
    {
        if(TextUtils.isEmpty(s))
        {
            return "";
        } else
        {
            TextPaint textpaint = new TextPaint();
            textpaint.setTypeface(Typeface.DEFAULT);
            textpaint.setTextSize(f1);
            return TextUtils.ellipsize(s, textpaint, f, android.text.TextUtils.TruncateAt.END).toString();
        }
    }

    private static void initNativeObject(Bitmap bitmap)
    {
        byte abyte0[] = getPixels(bitmap);
        if(abyte0 == null)
        {
            return;
        } else
        {
            nativeInitBitmapDC(bitmap.getWidth(), bitmap.getHeight(), abyte0);
            return;
        }
    }

    private static native void nativeInitBitmapDC(int i, int j, byte abyte0[]);

    private static Paint newPaint(String s, int i, int j)
    {
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setTextSize(i);
        paint.setAntiAlias(true);
        if(s.endsWith(".ttf"))
            try
            {
                paint.setTypeface(Cocos2dxTypefaces.get(_context, s));
            }
            catch(Exception exception)
            {
                Log.e("Cocos2dxBitmap", (new StringBuilder()).append("error to create ttf type face: ").append(s).toString());
                paint.setTypeface(Typeface.create(s, 0));
            }
        else
            paint.setTypeface(Typeface.create(s, 0));
        switch(j)
        {
        default:
            paint.setTextAlign(android.graphics.Paint.Align.LEFT);
            return paint;

        case 3: // '\003'
            paint.setTextAlign(android.graphics.Paint.Align.CENTER);
            return paint;

        case 2: // '\002'
            paint.setTextAlign(android.graphics.Paint.Align.RIGHT);
            return paint;
        }
    }

    private static String refactorString(String s)
    {
        if(s.compareTo("") == 0)
            return " ";
        s = new StringBuilder(s);
        int i = 0;
        int j = s.indexOf("\n");
        do
        {
label0:
            {
                if(j != -1)
                {
                    if(j == 0 || s.charAt(j - 1) == '\n')
                    {
                        s.insert(i, " ");
                        i = j + 2;
                    } else
                    {
                        i = j + 1;
                    }
                    if(i <= s.length() && j != s.length())
                        break label0;
                }
                return s.toString();
            }
            j = s.indexOf("\n", i);
        } while(true);
    }

    public static void setContext(Context context)
    {
        _context = context;
    }

    private static String[] splitString(String s, int i, int j, Paint paint)
    {
        int k;
label0:
        {
            s = s.split("\\n");
            Object obj = paint.getFontMetricsInt();
            k = j / (int)Math.ceil(((android.graphics.Paint.FontMetricsInt) (obj)).bottom - ((android.graphics.Paint.FontMetricsInt) (obj)).top);
            if(i == 0)
                break label0;
            obj = new LinkedList();
            int l = s.length;
            j = 0;
label1:
            do
            {
label2:
                {
                    if(j < l)
                    {
                        String s1 = s[j];
                        if((int)Math.ceil(paint.measureText(s1)) > i)
                            ((LinkedList) (obj)).addAll(divideStringWithMaxWidth(s1, i, paint));
                        else
                            ((LinkedList) (obj)).add(s1);
                        if(k <= 0 || ((LinkedList) (obj)).size() < k)
                            break label2;
                    }
                    if(k > 0 && ((LinkedList) (obj)).size() > k)
                        for(; ((LinkedList) (obj)).size() > k; ((LinkedList) (obj)).removeLast());
                    break label1;
                }
                j++;
            } while(true);
            s = new String[((LinkedList) (obj)).size()];
            ((LinkedList) (obj)).toArray(s);
            return s;
        }
        if(j != 0 && s.length > k)
        {
            paint = new LinkedList();
            for(i = 0; i < k; i++)
                paint.add(s[i]);

            s = new String[paint.size()];
            paint.toArray(s);
            return s;
        } else
        {
            return s;
        }
    }

    private static final int HORIZONTALALIGN_CENTER = 3;
    private static final int HORIZONTALALIGN_LEFT = 1;
    private static final int HORIZONTALALIGN_RIGHT = 2;
    private static final int VERTICALALIGN_BOTTOM = 2;
    private static final int VERTICALALIGN_CENTER = 3;
    private static final int VERTICALALIGN_TOP = 1;
    private static Context _context;
}
