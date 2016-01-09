// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.gn.plugin.pluginpurchase;

import java.util.*;

// Referenced classes of package jp.co.cyberagent.gn.plugin.pluginpurchase:
//            Purchase, SkuDetails

public class Inventory
{

    Inventory()
    {
        mSkuMap = new LinkedHashMap();
        mPurchaseMap = new LinkedHashMap();
    }

    void addPurchase(Purchase purchase)
    {
        mPurchaseMap.put(purchase.getSku(), purchase);
    }

    void addSkuDetails(SkuDetails skudetails)
    {
        mSkuMap.put(skudetails.getSku(), skudetails);
    }

    public void erasePurchase(String s)
    {
        if(mPurchaseMap.containsKey(s))
            mPurchaseMap.remove(s);
    }

    List getAllOwnedSkus()
    {
        return new ArrayList(mPurchaseMap.keySet());
    }

    List getAllOwnedSkus(String s)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = mPurchaseMap.values().iterator();
        do
        {
            Purchase purchase;
            do
            {
                if(!iterator.hasNext())
                    return arraylist;
                purchase = (Purchase)iterator.next();
            } while(!purchase.getItemType().equals(s));
            arraylist.add(purchase.getSku());
        } while(true);
    }

    List getAllPurchases()
    {
        return new ArrayList(mPurchaseMap.values());
    }

    List getAllSkuDetails()
    {
        return new ArrayList(mSkuMap.values());
    }

    public Purchase getPurchase(String s)
    {
        return (Purchase)mPurchaseMap.get(s);
    }

    public SkuDetails getSkuDetails(String s)
    {
        return (SkuDetails)mSkuMap.get(s);
    }

    public boolean hasDetails(String s)
    {
        return mSkuMap.containsKey(s);
    }

    public boolean hasPurchase(String s)
    {
        return mPurchaseMap.containsKey(s);
    }

    Map mPurchaseMap;
    Map mSkuMap;
}
