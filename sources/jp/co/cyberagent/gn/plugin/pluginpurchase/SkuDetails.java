// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.gn.plugin.pluginpurchase;

import org.json.JSONException;
import org.json.JSONObject;

public class SkuDetails
{

    public SkuDetails(String s)
        throws JSONException
    {
        this("inapp", s);
    }

    public SkuDetails(String s, String s1)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject(s1);
        mItemType = s;
        mJson = s1;
        mSku = jsonobject.optString("productId");
        mType = jsonobject.optString("type");
        mPrice = jsonobject.optString("price");
        mTitle = jsonobject.optString("title");
        mDescription = jsonobject.optString("description");
    }

    public String getDescription()
    {
        return mDescription;
    }

    public String getPrice()
    {
        return mPrice;
    }

    public String getSku()
    {
        return mSku;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public String getType()
    {
        return mType;
    }

    public String toString()
    {
        return (new StringBuilder("SkuDetails:")).append(mJson).toString();
    }

    public String toStringAsCommonFormat()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Integer integer = Integer.valueOf(mPrice.replaceAll("[^0-9]", ""));
        stringbuilder.append((new StringBuilder("{ \\\"title\\\" : \\\"")).append(mTitle).append("\\\", ").toString());
        stringbuilder.append((new StringBuilder("\\\"priceString\\\" : \\\"")).append(mPrice).append("\\\", ").toString());
        stringbuilder.append((new StringBuilder("\\\"price\\\" : ")).append(integer.toString()).append(", ").toString());
        stringbuilder.append((new StringBuilder("\\\"description\\\" : \\\"")).append(mDescription).append("\\\", ").toString());
        stringbuilder.append((new StringBuilder("\\\"productId\\\" : \\\"")).append(mSku).append("\\\" }").toString());
        return stringbuilder.toString();
    }

    String mDescription;
    String mItemType;
    String mJson;
    String mPrice;
    String mSku;
    String mTitle;
    String mType;
}
