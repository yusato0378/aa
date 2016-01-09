// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.gn.plugin.pluginpurchase;

import android.text.format.DateUtils;
import jp.co.cyberagent.gn.plugin.PluginManager;
import org.json.JSONException;
import org.json.JSONObject;

public class Purchase
{

    public Purchase(String s, String s1, String s2)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject(s1);
        mItemType = s;
        mOriginalJson = s1;
        mOrderId = jsonobject.optString("orderId");
        mPackageName = jsonobject.optString("packageName");
        mSku = jsonobject.optString("productId");
        mPurchaseTime = jsonobject.optLong("purchaseTime");
        mPurchaseState = jsonobject.optInt("purchaseState");
        mDeveloperPayload = jsonobject.optString("developerPayload");
        mToken = jsonobject.optString("token", jsonobject.optString("purchaseToken"));
        mSignature = s2;
    }

    public String getDeveloperPayload()
    {
        return mDeveloperPayload;
    }

    public String getItemType()
    {
        return mItemType;
    }

    public String getOrderId()
    {
        return mOrderId;
    }

    public String getOriginalJson()
    {
        return mOriginalJson;
    }

    public String getPackageName()
    {
        return mPackageName;
    }

    public int getPurchaseState()
    {
        return mPurchaseState;
    }

    public long getPurchaseTime()
    {
        return mPurchaseTime;
    }

    public String getSignature()
    {
        return mSignature;
    }

    public String getSku()
    {
        return mSku;
    }

    public String getToken()
    {
        return mToken;
    }

    public String getTransactionId()
    {
        return getDeveloperPayload();
    }

    public String toJSONString(boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s = DateUtils.formatDateTime(PluginManager.getCurrentActivity(), getPurchaseTime(), 21);
        stringbuilder.append((new StringBuilder("{ \\\"transactionId\\\":\\\"")).append(getOrderId()).append("\\\", ").toString());
        stringbuilder.append((new StringBuilder("\\\"transactionDate\\\":\\\"")).append(s).append("\\\", ").toString());
        stringbuilder.append("\\\"errorCode\\\":0, ");
        stringbuilder.append((new StringBuilder("\\\"productId\\\":\\\"")).append(getSku()).append("\\\", ").toString());
        stringbuilder.append("\\\"quantity\\\":1, ");
        s = mOriginalJson.replace("\"", "\\\\\\\"");
        stringbuilder.append((new StringBuilder("\\\"purchaseData\\\":\\\"")).append(s).append("\\\", ").toString());
        if(flag)
        {
            stringbuilder.append((new StringBuilder("\\\"signature\\\":\\\"")).append(getSignature()).append("\\\", ").toString());
            stringbuilder.append((new StringBuilder("\\\"tid\\\":\\\"")).append(getTransactionId()).append("\\\" }").toString());
        } else
        {
            stringbuilder.append((new StringBuilder("\\\"signature\\\":\\\"")).append(getSignature()).append("\\\" }").toString());
        }
        return stringbuilder.toString();
    }

    public String toString()
    {
        return (new StringBuilder("PurchaseInfo(type:")).append(mItemType).append("):").append(mOriginalJson).toString();
    }

    String mDeveloperPayload;
    String mItemType;
    String mOrderId;
    String mOriginalJson;
    String mPackageName;
    int mPurchaseState;
    long mPurchaseTime;
    String mSignature;
    String mSku;
    String mToken;
}
