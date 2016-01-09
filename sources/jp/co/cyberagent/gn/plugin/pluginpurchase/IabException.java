// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.gn.plugin.pluginpurchase;


// Referenced classes of package jp.co.cyberagent.gn.plugin.pluginpurchase:
//            IabResult

public class IabException extends Exception
{

    public IabException(int i, String s)
    {
        this(new IabResult(i, s));
    }

    public IabException(int i, String s, Exception exception)
    {
        this(new IabResult(i, s), exception);
    }

    public IabException(IabResult iabresult)
    {
        this(iabresult, ((Exception) (null)));
    }

    public IabException(IabResult iabresult, Exception exception)
    {
        super(iabresult.getMessage(), exception);
        mResult = iabresult;
    }

    public IabResult getResult()
    {
        return mResult;
    }

    IabResult mResult;
}
