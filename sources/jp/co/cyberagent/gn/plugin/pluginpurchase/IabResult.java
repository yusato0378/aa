// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.gn.plugin.pluginpurchase;


// Referenced classes of package jp.co.cyberagent.gn.plugin.pluginpurchase:
//            IabHelper

public class IabResult
{

    public IabResult(int i, String s)
    {
        mResponse = i;
        if(s == null || s.trim().length() == 0)
        {
            mMessage = IabHelper.getResponseDesc(i);
            return;
        } else
        {
            mMessage = (new StringBuilder(String.valueOf(s))).append(" (response: ").append(IabHelper.getResponseDesc(i)).append(")").toString();
            return;
        }
    }

    public String getMessage()
    {
        return mMessage;
    }

    public int getResponse()
    {
        return mResponse;
    }

    public boolean isFailure()
    {
        return !isSuccess();
    }

    public boolean isSuccess()
    {
        return mResponse == 0;
    }

    public String toString()
    {
        return (new StringBuilder("IabResult: ")).append(getMessage()).toString();
    }

    String mMessage;
    int mResponse;
}
