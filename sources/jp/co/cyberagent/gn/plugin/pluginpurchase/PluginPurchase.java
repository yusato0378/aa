// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.gn.plugin.pluginpurchase;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import jp.co.cyberagent.gn.plugin.PluginManager;
import jp.co.cyberagent.gn.plugin.PluginProtocol;
import org.json.JSONArray;

// Referenced classes of package jp.co.cyberagent.gn.plugin.pluginpurchase:
//            IabHelper, Purchase, IabResult, Inventory, 
//            SkuDetails

public class PluginPurchase extends PluginProtocol
{

    public PluginPurchase()
    {
        iabHelper = null;
        productsRequestListener = null;
        paymentListener = null;
        finishListener = null;
        recoveryListener = null;
        dbgQueryInventoryListener = null;
        productsRequestRequestId = null;
        purchaseRequestId = null;
        finishRequestId = null;
        recoveryRequestId = null;
        purchaseList = null;
    }

    public static void canMakePayments(String s, String s1)
    {
        PluginPurchase pluginpurchase = (PluginPurchase)PluginManager.getPlugin(s1);
        PluginManager.logDebug((new StringBuilder("PluginPurchase.canMakePayments : requestId = ")).append(s).append(", pluginId = ").append(s1).toString());
        if(pluginpurchase != null)
        {
            if(pluginpurchase.isSetupDone())
                s1 = "{\\\"canMakePayments\\\":\\\"true\\\"}";
            else
                s1 = "{\\\"canMakePayments\\\":\\\"false\\\"}";
            PluginManager.sendResult(s, s1);
            return;
        } else
        {
            PluginManager.sendErrorResult(s, 10002, "\u30D7\u30E9\u30B0\u30A4\u30F3\u304C\u5B9F\u884C\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002");
            return;
        }
    }

    public static void finish(String s, String s1, String s2)
    {
        PluginPurchase pluginpurchase = (PluginPurchase)PluginManager.getPlugin(s1);
        PluginManager.logDebug((new StringBuilder("PluginPurchase.finish : requestId = ")).append(s).append(", pluginId = ").append(s1).append(", transactionId = ").append(s2).toString());
        if(pluginpurchase != null && pluginpurchase.isSetupDone())
        {
            s1 = pluginpurchase.getPurchase(s2);
            pluginpurchase.finishRequestId = s;
            pluginpurchase.iabHelper.consume(s1, pluginpurchase.finishListener);
            return;
        } else
        {
            PluginManager.sendErrorResult(s, 10002, "\u30D7\u30E9\u30B0\u30A4\u30F3\u304C\u5B9F\u884C\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002");
            return;
        }
    }

    private Purchase getPurchase(String s)
    {
        if(s == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = purchaseList.size();
        i = 0;
_L5:
        if(i < j) goto _L3; else goto _L2
_L2:
        return null;
_L3:
        Purchase purchase = (Purchase)purchaseList.get(i);
        if(purchase.getTransactionId().compareTo(s) == 0)
            return purchase;
        i++;
        if(true) goto _L5; else goto _L4
_L4:
    }

    private boolean initListener()
    {
        boolean flag1 = false;
        productsRequestListener = new IabHelper.QueryInventoryFinishedListener() {

            public void onQueryInventoryFinished(IabResult iabresult, Inventory inventory)
            {
                PluginManager.logDebug("productsRequestListener.onQueryInventoryFinished");
                if(iabresult.isSuccess())
                {
                    PluginPurchase.sendResultProductsRequest(productsRequestRequestId, iabresult, inventory);
                } else
                {
                    PluginManager.logDebug((new StringBuilder("productsRequestListener.onQueryInventoryFinished : Failed to query inventory: ")).append(iabresult).toString());
                    PluginPurchase.sendErrorResult(productsRequestRequestId, iabresult.getResponse());
                }
                productsRequestRequestId = null;
            }

            final PluginPurchase this$0;

            
            {
                this$0 = PluginPurchase.this;
                super();
            }
        }
;
        paymentListener = new IabHelper.OnIabPurchaseFinishedListener() {

            public void onIabPurchaseFinished(IabResult iabresult, Purchase purchase)
            {
                int i = iabresult.getResponse();
                PluginManager.logDebug("OnIabPurchaseFinishedListener.onIabPurchaseFinished");
                PluginManager.logDebug((new StringBuilder("result = ")).append(iabresult).append(", purchase = ").append(purchase).toString());
                if(iabresult.isSuccess())
                {
                    if(purchaseList != null)
                        purchaseList.add(purchase);
                    PluginPurchase.sendResultPayment(purchaseRequestId, iabresult, purchase);
                } else
                {
                    if(iabresult.getResponse() == 7)
                        PluginManager.showAlertDialog("\u30A8\u30E9\u30FC", "Google\u6C7A\u6E08\u306B\u5931\u6557\u3057\u307E\u3057\u305F\u3002\u524D\u56DE\u306E\u6C7A\u6E08\u3092\u5B8C\u4E86\u3055\u305B\u3066\u304B\u3089\u3001\u518D\u5EA6\u304A\u8A66\u3057\u304F\u3060\u3055\u3044\u3002");
                    PluginPurchase.sendErrorResult(purchaseRequestId, i);
                }
                purchaseRequestId = null;
            }

            final PluginPurchase this$0;

            
            {
                this$0 = PluginPurchase.this;
                super();
            }
        }
;
        finishListener = new IabHelper.OnConsumeFinishedListener() {

            public void onConsumeFinished(Purchase purchase, IabResult iabresult)
            {
                PluginManager.logDebug("finishListener.onConsumeFinished");
                PluginManager.logDebug((new StringBuilder("Purchase: ")).append(purchase).append(", result: ").append(iabresult).toString());
                if(iabresult.isSuccess() && purchaseList != null)
                    purchaseList.remove(purchase);
                PluginPurchase.sendResultFinish(finishRequestId, iabresult);
                finishRequestId = null;
            }

            final PluginPurchase this$0;

            
            {
                this$0 = PluginPurchase.this;
                super();
            }
        }
;
        recoveryListener = new IabHelper.QueryInventoryFinishedListener() {

            public void onQueryInventoryFinished(IabResult iabresult, Inventory inventory)
            {
                PluginManager.logDebug("recoveryListener.onQueryInventoryFinished");
                if(iabresult.isSuccess())
                {
                    PluginPurchase.sendResultRecovery(recoveryRequestId, iabresult, inventory);
                } else
                {
                    PluginManager.logDebug((new StringBuilder("recoveryListener.onQueryInventoryFinished : Failed to query inventory: ")).append(iabresult).toString());
                    PluginPurchase.sendErrorResult(recoveryRequestId, iabresult.getResponse());
                }
                recoveryRequestId = null;
            }

            final PluginPurchase this$0;

            
            {
                this$0 = PluginPurchase.this;
                super();
            }
        }
;
        dbgQueryInventoryListener = new IabHelper.QueryInventoryFinishedListener() {

            public void onQueryInventoryFinished(IabResult iabresult, Inventory inventory)
            {
                PluginManager.logDebug("dbgQueryInventoryListener.onQueryInventoryFinished");
                if(!iabresult.isFailure()) goto _L2; else goto _L1
_L1:
                PluginManager.logDebug((new StringBuilder("Failed to query inventory: ")).append(iabresult).toString());
_L4:
                return;
_L2:
                PluginManager.logDebug("Query inventory was successful.");
                if(purchaseList == null) goto _L4; else goto _L3
_L3:
                iabresult = inventory.getAllPurchases();
                if(iabresult == null) goto _L6; else goto _L5
_L5:
                int i;
                int k;
                int l;
                k = purchaseList.size();
                l = iabresult.size();
                i = 0;
_L10:
                if(i < l) goto _L7; else goto _L6
_L6:
                i = purchaseList.size() - 1;
                while(i >= 0) 
                {
                    iabresult = (Purchase)purchaseList.get(i);
                    inventory = iabHelper.consume(iabresult, null);
                    if(purchaseList != null && inventory.isSuccess())
                        purchaseList.remove(iabresult);
                    i--;
                }
                  goto _L4
_L7:
                int j;
                inventory = (Purchase)iabresult.get(i);
                j = 0;
_L12:
                if(j < k) goto _L9; else goto _L8
_L8:
                Purchase purchase;
                if(j >= k)
                    purchaseList.add(inventory);
                i++;
                  goto _L10
_L9:
                if(inventory.getOrderId().compareTo((purchase = (Purchase)purchaseList.get(j)).getOrderId()) == 0) goto _L8; else goto _L11
_L11:
                j++;
                  goto _L12
            }

            final PluginPurchase this$0;

            
            {
                this$0 = PluginPurchase.this;
                super();
            }
        }
;
        boolean flag = flag1;
        if(productsRequestListener != null)
        {
            flag = flag1;
            if(paymentListener != null)
            {
                flag = flag1;
                if(recoveryListener != null)
                    flag = true;
            }
        }
        return flag;
    }

    private boolean isSetupDone()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if(iabHelper != null)
        {
            flag = flag1;
            if(iabHelper.isSetupDone())
                flag = true;
        }
        return flag;
    }

    public static void payment(String s, String s1, String s2, String s3, int i)
    {
        PluginPurchase pluginpurchase = (PluginPurchase)PluginManager.getPlugin(s1);
        PluginManager.logDebug((new StringBuilder("PluginPurchase.payment : requestId = ")).append(s).append(", pluginId = ").append(s1).append(", productId = ").append(s3).toString());
        if(pluginpurchase != null && pluginpurchase.isSetupDone())
        {
            s1 = pluginpurchase.iabHelper.launchPurchaseFlow(PluginManager.getCurrentActivity(), s3, Integer.valueOf(s).intValue(), pluginpurchase.paymentListener, s2);
            if(s1.isSuccess())
            {
                pluginpurchase.purchaseRequestId = s;
                return;
            } else
            {
                sendResultPayment(s, s1, null);
                return;
            }
        } else
        {
            PluginManager.sendErrorResult(s, 10002, "\u30D7\u30E9\u30B0\u30A4\u30F3\u304C\u5B9F\u884C\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002");
            return;
        }
    }

    public static void productsRequest(String s, String s1, String s2)
    {
        PluginPurchase pluginpurchase;
        pluginpurchase = (PluginPurchase)PluginManager.getPlugin(s2);
        PluginManager.logDebug((new StringBuilder("PluginPurchase.productsRequest : products = ")).append(s).append(", requestId = ").append(s1).append(", pluginId = ").append(s2).toString());
        if(pluginpurchase == null || !pluginpurchase.isSetupDone()) goto _L2; else goto _L1
_L1:
        s2 = new ArrayList();
        s = new JSONArray(s);
        PluginManager.logDebug((new StringBuilder("productsRequest : jsonArray.length() = ")).append(s.length()).toString());
        int i = 0;
_L5:
        int j = s.length();
        if(i < j) goto _L4; else goto _L3
_L3:
        pluginpurchase.productsRequestRequestId = s1;
        pluginpurchase.iabHelper.querySkuDetails(s2, pluginpurchase.productsRequestListener);
        return;
_L4:
        String s3 = s.getString(i);
        s2.add(s3);
        PluginManager.logDebug((new StringBuilder(String.valueOf(i))).append(" : jsonObject.toString() = ").append(s3).toString());
        i++;
          goto _L5
_L2:
        PluginManager.sendErrorResult(s1, 10002, "\u30D7\u30E9\u30B0\u30A4\u30F3\u304C\u5B9F\u884C\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002");
        return;
        s;
          goto _L3
    }

    public static void recovery(String s, String s1)
    {
        PluginPurchase pluginpurchase = (PluginPurchase)PluginManager.getPlugin(s1);
        PluginManager.logDebug((new StringBuilder("PluginPurchase.recovery : requestId = ")).append(s).append(", pluginId = ").append(s1).toString());
        if(pluginpurchase != null && pluginpurchase.isSetupDone())
        {
            pluginpurchase.recoveryRequestId = s;
            pluginpurchase.iabHelper.queryPurchases(pluginpurchase.recoveryListener);
            return;
        } else
        {
            PluginManager.sendErrorResult(s, 10002, "\u30D7\u30E9\u30B0\u30A4\u30F3\u304C\u5B9F\u884C\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002");
            return;
        }
    }

    public static void sendErrorResult(String s, int i)
    {
        String s1;
        int j;
        boolean flag;
        flag = false;
        s1 = "";
        j = ((flag) ? 1 : 0);
        i;
        JVM INSTR lookupswitch 18: default 164
    //                   -1010: 243
    //                   -1009: 243
    //                   -1008: 243
    //                   -1007: 243
    //                   -1006: 243
    //                   -1005: 236
    //                   -1004: 243
    //                   -1003: 243
    //                   -1002: 243
    //                   -1001: 243
    //                   0: 167
    //                   1: 236
    //                   3: 243
    //                   4: 243
    //                   5: 243
    //                   6: 243
    //                   7: 243
    //                   8: 243;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L3 _L2 _L2 _L2 _L2 _L4 _L3 _L2 _L2 _L2 _L2 _L2 _L2
_L1:
        j = ((flag) ? 1 : 0);
_L4:
        j;
        JVM INSTR tableswitch 10000 10003: default 200
    //                   10000 250
    //                   10001 257
    //                   10002 264
    //                   10003 270;
           goto _L5 _L6 _L7 _L8 _L9
_L5:
        PluginManager.sendErrorResult(s, j, (new StringBuilder(String.valueOf(s1))).append("\uFF08").append(i).append("\uFF09").toString());
        return;
_L3:
        j = 10000;
          goto _L4
_L2:
        j = 10001;
          goto _L4
_L6:
        s1 = "\u51E6\u7406\u304C\u30AD\u30E3\u30F3\u30BB\u30EB\u3055\u308C\u307E\u3057\u305F\u3002";
          goto _L5
_L7:
        s1 = "\u4E0D\u660E\u306A\u30A8\u30E9\u30FC\u304C\u767A\u751F\u3057\u307E\u3057\u305F\u3002";
          goto _L5
_L8:
        s1 = "\u30D7\u30E9\u30B0\u30A4\u30F3\u304C\u5B9F\u884C\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002";
          goto _L5
_L9:
        s1 = "\u30D7\u30E9\u30B0\u30A4\u30F3\u304C\u751F\u6210\u3067\u304D\u307E\u305B\u3093\u3002";
          goto _L5
    }

    private static void sendResultFinish(String s, IabResult iabresult)
    {
        if(s == null)
            s = "finish";
        if(iabresult.isSuccess())
        {
            PluginManager.sendResult(s, "{ \\\"result\\\":\\\"ok\\\" }");
            return;
        } else
        {
            PluginManager.sendResult(s, "{ \\\"result\\\":\\\"error\\\" }");
            return;
        }
    }

    private static void sendResultPayment(String s, IabResult iabresult, Purchase purchase)
    {
        if(s == null)
            s = "payment";
        if(iabresult.isSuccess())
        {
            iabresult = purchase.toJSONString(false);
            PluginManager.logDebug((new StringBuilder("PluginPurchase.sendResultPayment : resultString = ")).append(iabresult).toString());
            PluginManager.sendResult(s, iabresult);
            return;
        } else
        {
            sendErrorResult(s, iabresult.getResponse());
            return;
        }
    }

    private static void sendResultProductsRequest(String s, IabResult iabresult, Inventory inventory)
    {
        iabresult = new StringBuilder();
        iabresult.append("[ ");
        if(inventory == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        inventory = inventory.getAllSkuDetails();
        j = inventory.size();
        i = 0;
_L5:
        if(i < j) goto _L3; else goto _L2
_L2:
        iabresult.append(" ]");
        inventory = iabresult.toString();
        PluginManager.logDebug((new StringBuilder("PluginPurchase.sendResultProductsRequest : resultString = ")).append(inventory).toString());
        iabresult = s;
        if(s == null)
            iabresult = "productsRequest";
        PluginManager.sendResult(iabresult, inventory);
        return;
_L3:
        iabresult.append(((SkuDetails)inventory.get(i)).toStringAsCommonFormat());
        if(i + 1 < j)
            iabresult.append(", ");
        i++;
        if(true) goto _L5; else goto _L4
_L4:
    }

    private static void sendResultRecovery(String s, IabResult iabresult, Inventory inventory)
    {
        if(s == null)
            s = "recovery";
        if(instance == null || !iabresult.isSuccess()) goto _L2; else goto _L1
_L1:
        int j;
        instance.purchaseList = inventory.getAllPurchases();
        j = instance.purchaseList.size();
        if(j <= 0) goto _L4; else goto _L3
_L3:
        int i;
        iabresult = new StringBuilder();
        iabresult.append("[");
        i = 0;
_L9:
        if(i < j) goto _L6; else goto _L5
_L5:
        iabresult.append("]");
        iabresult = iabresult.toString();
_L7:
        PluginManager.logDebug((new StringBuilder("PluginPurchase.sendResultRecovery : resultString = ")).append(iabresult).toString());
        PluginManager.sendResult(s, iabresult);
        return;
_L6:
        inventory = (Purchase)instance.purchaseList.get(i);
        if(i + 1 < j)
            iabresult.append((new StringBuilder(String.valueOf(inventory.toJSONString(true)))).append(", ").toString());
        else
            iabresult.append(inventory.toJSONString(true));
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        iabresult = "[]";
        if(true) goto _L7; else goto _L2
_L2:
        sendErrorResult(s, iabresult.getResponse());
        return;
        if(true) goto _L9; else goto _L8
_L8:
    }

    public boolean handleActivityResult(int i, int j, Intent intent)
    {
        boolean flag = false;
        if(isSetupDone())
            flag = iabHelper.handleActivityResult(i, j, intent);
        return flag;
    }

    public volatile PluginProtocol init()
    {
        return init();
    }

    public PluginPurchase init()
    {
        if(super.init("PluginPurchase") != null)
        {
            instance = this;
            iabHelper = new IabHelper(PluginManager.getCurrentActivity(), null);
            purchaseList = new ArrayList();
            if(iabHelper != null && purchaseList != null && initListener())
                iabHelper.startSetup(new IabHelper.OnIabSetupFinishedListener() {

                    public void onIabSetupFinished(IabResult iabresult)
                    {
                        PluginManager.logDebug("Setup finished.");
                        if(!iabresult.isSuccess())
                            PluginManager.logDebug((new StringBuilder("Problem setting up in-app billing: ")).append(iabresult).toString());
                    }

                    final PluginPurchase this$0;

            
            {
                this$0 = PluginPurchase.this;
                super();
            }
                }
);
        }
        return this;
    }

    public void release()
    {
        if(iabHelper != null)
        {
            iabHelper.dispose();
            iabHelper = null;
        }
        productsRequestRequestId = null;
        purchaseRequestId = null;
        finishRequestId = null;
        recoveryRequestId = null;
        purchaseList = null;
        super.release();
    }

    public static final boolean DBG_QUERY_INVENTORY_ENABLE = false;
    public static final String PLUGIN_NAME = "PluginPurchase";
    private static PluginPurchase instance = null;
    private IabHelper.QueryInventoryFinishedListener dbgQueryInventoryListener;
    private IabHelper.OnConsumeFinishedListener finishListener;
    private String finishRequestId;
    private IabHelper iabHelper;
    private IabHelper.OnIabPurchaseFinishedListener paymentListener;
    private IabHelper.QueryInventoryFinishedListener productsRequestListener;
    private String productsRequestRequestId;
    private List purchaseList;
    private String purchaseRequestId;
    private IabHelper.QueryInventoryFinishedListener recoveryListener;
    private String recoveryRequestId;















}
