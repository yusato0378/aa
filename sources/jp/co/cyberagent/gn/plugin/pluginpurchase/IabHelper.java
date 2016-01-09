// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.gn.plugin.pluginpurchase;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.*;
import android.content.pm.PackageManager;
import android.os.*;
import android.text.TextUtils;
import android.util.Log;
import com.android.vending.billing.IInAppBillingService;
import java.util.*;
import jp.co.cyberagent.gn.plugin.PluginManager;
import jp.co.cyberagent.gn.plugin.util.Security;
import org.json.JSONException;

// Referenced classes of package jp.co.cyberagent.gn.plugin.pluginpurchase:
//            IabException, IabResult, Purchase, Inventory, 
//            SkuDetails

public class IabHelper
{
    public static interface OnConsumeFinishedListener
    {

        public abstract void onConsumeFinished(Purchase purchase, IabResult iabresult);
    }

    public static interface OnConsumeMultiFinishedListener
    {

        public abstract void onConsumeMultiFinished(List list, List list1);
    }

    public static interface OnIabPurchaseFinishedListener
    {

        public abstract void onIabPurchaseFinished(IabResult iabresult, Purchase purchase);
    }

    public static interface OnIabSetupFinishedListener
    {

        public abstract void onIabSetupFinished(IabResult iabresult);
    }

    public static interface QueryInventoryFinishedListener
    {

        public abstract void onQueryInventoryFinished(IabResult iabresult, Inventory inventory);
    }


    public IabHelper(Context context, String s)
    {
        mSetupDone = false;
        mDisposed = false;
        mSubscriptionsSupported = false;
        mAsyncInProgress = false;
        mAsyncOperation = "";
        mSignatureBase64 = null;
        mContext = context.getApplicationContext();
        mSignatureBase64 = s;
        PluginManager.logDebug("IabHelper", "IAB helper created.");
    }

    private void checkNotDisposed()
    {
        if(mDisposed)
            throw new IllegalStateException("IabHelper was disposed of, so it cannot be used.");
        else
            return;
    }

    public static String getResponseDesc(int i)
    {
        String as[] = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
        String as1[] = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt".split("/");
        if(i <= -1000)
        {
            int j = -1000 - i;
            if(j >= 0 && j < as1.length)
                return as1[j];
            else
                return (new StringBuilder(String.valueOf(String.valueOf(i)))).append(":Unknown IAB Helper Error").toString();
        }
        if(i < 0 || i >= as.length)
            return (new StringBuilder(String.valueOf(String.valueOf(i)))).append(":Unknown").toString();
        else
            return as[i];
    }

    void checkSetupDone(String s)
    {
        if(!mSetupDone)
        {
            logError((new StringBuilder("Illegal state for operation (")).append(s).append("): IAB helper is not set up.").toString());
            throw new IllegalStateException((new StringBuilder("IAB helper is not set up. Can't perform operation: ")).append(s).toString());
        } else
        {
            return;
        }
    }

    public IabResult consume(Purchase purchase, OnConsumeFinishedListener onconsumefinishedlistener)
    {
        IabResult iabresult = new IabResult(0, "Consumption successful.");
        try
        {
            consume(purchase);
        }
        catch(IabException iabexception)
        {
            iabexception = iabexception.getResult();
        }
        if(onconsumefinishedlistener != null)
            onconsumefinishedlistener.onConsumeFinished(purchase, iabresult);
        return iabresult;
    }

    void consume(Purchase purchase)
        throws IabException
    {
        Object obj;
        String s;
        checkNotDisposed();
        checkSetupDone("consume");
        if(purchase == null)
            throw new IabException(-1010, "Purchase is null.");
        if(!purchase.mItemType.equals("inapp"))
            throw new IabException(-1010, (new StringBuilder("Items of type '")).append(purchase.mItemType).append("' can't be consumed.").toString());
        try
        {
            obj = purchase.getToken();
            s = purchase.getSku();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            throw new IabException(-1001, (new StringBuilder("Remote exception while consuming. PurchaseInfo: ")).append(purchase).toString(), ((Exception) (obj)));
        }
        if(obj == null)
            break MISSING_BLOCK_LABEL_99;
        if(!((String) (obj)).equals(""))
            break MISSING_BLOCK_LABEL_194;
        logError((new StringBuilder("Can't consume ")).append(s).append(". No token.").toString());
        throw new IabException(-1007, (new StringBuilder("PurchaseInfo is missing token for sku: ")).append(s).append(" ").append(purchase).toString());
        int i;
        PluginManager.logDebug("IabHelper", (new StringBuilder("Consuming sku: ")).append(s).append(", token: ").append(((String) (obj))).toString());
        i = mService.consumePurchase(3, mContext.getPackageName(), ((String) (obj)));
        if(i != 0)
            break MISSING_BLOCK_LABEL_274;
        PluginManager.logDebug("IabHelper", (new StringBuilder("Successfully consumed sku: ")).append(s).toString());
        return;
        PluginManager.logDebug("IabHelper", (new StringBuilder("Error consuming consuming sku ")).append(s).append(". ").append(getResponseDesc(i)).toString());
        throw new IabException(i, (new StringBuilder("Error consuming sku ")).append(s).toString());
    }

    public void consumeAsync(List list, OnConsumeMultiFinishedListener onconsumemultifinishedlistener)
    {
        checkNotDisposed();
        checkSetupDone("consume");
        consumeAsyncInternal(list, null, onconsumemultifinishedlistener);
    }

    public void consumeAsync(Purchase purchase, OnConsumeFinishedListener onconsumefinishedlistener)
    {
        checkNotDisposed();
        checkSetupDone("consume");
        ArrayList arraylist = new ArrayList();
        arraylist.add(purchase);
        consumeAsyncInternal(arraylist, onconsumefinishedlistener, null);
    }

    void consumeAsyncInternal(final List purchases, final OnConsumeFinishedListener singleListener, final OnConsumeMultiFinishedListener multiListener)
    {
        final Handler handler = new Handler();
        flagStartAsync("consume");
        (new Thread(new Runnable() {

            public void run()
            {
                ArrayList arraylist = new ArrayList();
                Iterator iterator = purchases.iterator();
                do
                {
                    if(!iterator.hasNext())
                    {
                        flagEndAsync();
                        if(!mDisposed && singleListener != null)
                            handler.post(arraylist. new Runnable() {

                                public void run()
                                {
                                    singleListener.onConsumeFinished((Purchase)purchases.get(0), (IabResult)results.get(0));
                                }

                                final _cls4 this$1;
                                private final List val$purchases;
                                private final List val$results;
                                private final OnConsumeFinishedListener val$singleListener;

            
            {
                this$1 = final__pcls4;
                singleListener = onconsumefinishedlistener;
                purchases = list;
                results = List.this;
                super();
            }
                            }
);
                        if(!mDisposed && multiListener != null)
                            handler.post(arraylist. new Runnable() {

                                public void run()
                                {
                                    multiListener.onConsumeMultiFinished(purchases, results);
                                }

                                final _cls4 this$1;
                                private final OnConsumeMultiFinishedListener val$multiListener;
                                private final List val$purchases;
                                private final List val$results;

            
            {
                this$1 = final__pcls4;
                multiListener = onconsumemultifinishedlistener;
                purchases = list;
                results = List.this;
                super();
            }
                            }
);
                        return;
                    }
                    Purchase purchase = (Purchase)iterator.next();
                    try
                    {
                        consume(purchase);
                        arraylist.add(new IabResult(0, (new StringBuilder("Successful consume of sku ")).append(purchase.getSku()).toString()));
                    }
                    catch(IabException iabexception)
                    {
                        arraylist.add(iabexception.getResult());
                    }
                } while(true);
            }

            final IabHelper this$0;
            private final Handler val$handler;
            private final OnConsumeMultiFinishedListener val$multiListener;
            private final List val$purchases;
            private final OnConsumeFinishedListener val$singleListener;

            
            {
                this$0 = IabHelper.this;
                purchases = list;
                singleListener = onconsumefinishedlistener;
                handler = handler1;
                multiListener = onconsumemultifinishedlistener;
                super();
            }
        }
)).start();
    }

    public void dispose()
    {
        PluginManager.logDebug("IabHelper", "Disposing.");
        mSetupDone = false;
        if(mServiceConn != null)
        {
            PluginManager.logDebug("IabHelper", "Unbinding from service.");
            if(mContext != null)
                mContext.unbindService(mServiceConn);
        }
        mDisposed = true;
        mContext = null;
        mServiceConn = null;
        mService = null;
        mPurchaseListener = null;
    }

    void flagEndAsync()
    {
        PluginManager.logDebug("IabHelper", (new StringBuilder("Ending async operation: ")).append(mAsyncOperation).toString());
        mAsyncOperation = "";
        mAsyncInProgress = false;
    }

    void flagStartAsync(String s)
    {
        if(mAsyncInProgress)
        {
            throw new IllegalStateException((new StringBuilder("Can't start async operation (")).append(s).append(") because another async operation(").append(mAsyncOperation).append(") is in progress.").toString());
        } else
        {
            mAsyncOperation = s;
            mAsyncInProgress = true;
            PluginManager.logDebug("IabHelper", (new StringBuilder("Starting async operation: ")).append(s).toString());
            return;
        }
    }

    int getResponseCodeFromBundle(Bundle bundle)
    {
        bundle = ((Bundle) (bundle.get("RESPONSE_CODE")));
        if(bundle == null)
        {
            PluginManager.logDebug("IabHelper", "Bundle with null response code, assuming OK (known issue)");
            return 0;
        }
        if(bundle instanceof Integer)
            return ((Integer)bundle).intValue();
        if(bundle instanceof Long)
        {
            return (int)((Long)bundle).longValue();
        } else
        {
            logError("Unexpected type for bundle response code.");
            logError(bundle.getClass().getName());
            throw new RuntimeException((new StringBuilder("Unexpected type for bundle response code: ")).append(bundle.getClass().getName()).toString());
        }
    }

    int getResponseCodeFromIntent(Intent intent)
    {
        intent = ((Intent) (intent.getExtras().get("RESPONSE_CODE")));
        if(intent == null)
        {
            logError("Intent with no response code, assuming OK (known issue)");
            return 0;
        }
        if(intent instanceof Integer)
            return ((Integer)intent).intValue();
        if(intent instanceof Long)
        {
            return (int)((Long)intent).longValue();
        } else
        {
            logError("Unexpected type for intent response code.");
            logError(intent.getClass().getName());
            throw new RuntimeException((new StringBuilder("Unexpected type for intent response code: ")).append(intent.getClass().getName()).toString());
        }
    }

    public boolean handleActivityResult(int i, int j, Intent intent)
    {
        String s;
        String s1;
        if(i != mRequestCode)
            return false;
        checkNotDisposed();
        checkSetupDone("handleActivityResult");
        flagEndAsync();
        if(intent == null)
        {
            logError("Null data in IAB activity result.");
            intent = new IabResult(-1002, "Null data in IAB result");
            if(mPurchaseListener != null)
                mPurchaseListener.onIabPurchaseFinished(intent, null);
            return true;
        }
        i = getResponseCodeFromIntent(intent);
        s = intent.getStringExtra("INAPP_PURCHASE_DATA");
        s1 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        if(j != -1 || i != 0) goto _L2; else goto _L1
_L1:
        PluginManager.logDebug("IabHelper", "Successful resultcode from purchase activity.");
        PluginManager.logDebug("IabHelper", (new StringBuilder("Purchase data: ")).append(s).toString());
        PluginManager.logDebug("IabHelper", (new StringBuilder("Data signature: ")).append(s1).toString());
        PluginManager.logDebug("IabHelper", (new StringBuilder("Extras: ")).append(intent.getExtras()).toString());
        PluginManager.logDebug("IabHelper", (new StringBuilder("Expected item type: ")).append(mPurchasingItemType).toString());
        if(s == null || s1 == null)
        {
            logError("BUG: either purchaseData or dataSignature is null.");
            PluginManager.logDebug("IabHelper", (new StringBuilder("Extras: ")).append(intent.getExtras().toString()).toString());
            intent = new IabResult(-1008, "IAB returned null purchaseData or dataSignature");
            if(mPurchaseListener != null)
                mPurchaseListener.onIabPurchaseFinished(intent, null);
            return true;
        }
        intent = new Purchase(mPurchasingItemType, s, s1);
        String s2 = intent.getSku();
        if(verifyPurchaseData(s, s1)) goto _L4; else goto _L3
_L3:
        logError((new StringBuilder("Purchase signature verification FAILED for sku ")).append(s2).toString());
        IabResult iabresult = new IabResult(-1003, (new StringBuilder("Signature verification failed for sku ")).append(s2).toString());
        if(mPurchaseListener != null)
            mPurchaseListener.onIabPurchaseFinished(iabresult, intent);
          goto _L5
_L4:
        PluginManager.logDebug("IabHelper", "Purchase signature successfully verified.");
        if(mPurchaseListener != null)
            mPurchaseListener.onIabPurchaseFinished(new IabResult(0, "Success"), intent);
_L8:
        return true;
        intent;
_L6:
        logError("Failed to parse purchase data.");
        intent = new IabResult(-1002, "Failed to parse purchase data.");
        if(mPurchaseListener != null)
            mPurchaseListener.onIabPurchaseFinished(intent, null);
        return true;
_L2:
        if(j == -1)
        {
            PluginManager.logDebug("IabHelper", (new StringBuilder("Result code was OK but in-app billing response was not OK: ")).append(getResponseDesc(i)).toString());
            if(mPurchaseListener != null)
            {
                intent = new IabResult(i, "Problem purchashing item.");
                mPurchaseListener.onIabPurchaseFinished(intent, null);
            }
        } else
        if(j == 0)
        {
            PluginManager.logDebug("IabHelper", (new StringBuilder("Purchase canceled - Response: ")).append(getResponseDesc(i)).toString());
            intent = new IabResult(-1005, "User canceled.");
            if(mPurchaseListener != null)
                mPurchaseListener.onIabPurchaseFinished(intent, null);
        } else
        {
            logError((new StringBuilder("Purchase failed. Result code: ")).append(Integer.toString(j)).append(". Response: ").append(getResponseDesc(i)).toString());
            intent = new IabResult(-1006, "Unknown purchase response.");
            if(mPurchaseListener != null)
                mPurchaseListener.onIabPurchaseFinished(intent, null);
        }
        continue; /* Loop/switch isn't completed */
        intent;
        if(true) goto _L6; else goto _L5
_L5:
        return true;
        if(true) goto _L8; else goto _L7
_L7:
    }

    public boolean isSetupDone()
    {
        return mSetupDone;
    }

    public IabResult launchPurchaseFlow(Activity activity, String s, int i, OnIabPurchaseFinishedListener oniabpurchasefinishedlistener)
    {
        return launchPurchaseFlow(activity, s, i, oniabpurchasefinishedlistener, "");
    }

    public IabResult launchPurchaseFlow(Activity activity, String s, int i, OnIabPurchaseFinishedListener oniabpurchasefinishedlistener, String s1)
    {
        return launchPurchaseFlow(activity, s, "inapp", i, oniabpurchasefinishedlistener, s1);
    }

    public IabResult launchPurchaseFlow(Activity activity, String s, String s1, int i, OnIabPurchaseFinishedListener oniabpurchasefinishedlistener, String s2)
    {
        IabResult iabresult;
        checkNotDisposed();
        checkSetupDone("launchPurchaseFlow");
        flagStartAsync("launchPurchaseFlow");
        iabresult = new IabResult(0, "ok");
        if(s1.equals("subs") && !mSubscriptionsSupported)
        {
            activity = new IabResult(-1009, "Subscriptions are not available.");
            flagEndAsync();
            if(oniabpurchasefinishedlistener != null)
                oniabpurchasefinishedlistener.onIabPurchaseFinished(activity, null);
            return activity;
        }
        int j;
        PluginManager.logDebug("IabHelper", (new StringBuilder("Constructing buy intent for ")).append(s).append(", item type: ").append(s1).toString());
        s2 = mService.getBuyIntent(3, mContext.getPackageName(), s, s1, s2);
        j = getResponseCodeFromBundle(s2);
        if(j == 0)
            break MISSING_BLOCK_LABEL_207;
        logError((new StringBuilder("Unable to buy item, Error response: ")).append(getResponseDesc(j)).toString());
        flagEndAsync();
        activity = new IabResult(j, "Unable to buy item");
        if(oniabpurchasefinishedlistener == null)
            break MISSING_BLOCK_LABEL_205;
        oniabpurchasefinishedlistener.onIabPurchaseFinished(activity, null);
        return activity;
        s2 = (PendingIntent)s2.getParcelable("BUY_INTENT");
        PluginManager.logDebug("IabHelper", (new StringBuilder("Launching buy intent for ")).append(s).append(". Request code: ").append(i).toString());
        mRequestCode = i;
        mPurchaseListener = oniabpurchasefinishedlistener;
        mPurchasingItemType = s1;
        activity.startIntentSenderForResult(s2.getIntentSender(), i, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
        activity = iabresult;
_L1:
        return activity;
        activity;
_L3:
        logError((new StringBuilder("SendIntentException while launching purchase flow for sku ")).append(s).toString());
        flagEndAsync();
        s = new IabResult(-1004, "Failed to send intent.");
        activity = s;
        if(oniabpurchasefinishedlistener != null)
        {
            oniabpurchasefinishedlistener.onIabPurchaseFinished(s, null);
            activity = s;
        }
          goto _L1
        activity;
_L2:
        logError((new StringBuilder("RemoteException while launching purchase flow for sku ")).append(s).toString());
        flagEndAsync();
        s = new IabResult(-1001, "Remote exception while starting purchase flow");
        activity = s;
        if(oniabpurchasefinishedlistener != null)
        {
            oniabpurchasefinishedlistener.onIabPurchaseFinished(s, null);
            activity = s;
        }
          goto _L1
        activity;
          goto _L2
        activity;
          goto _L3
    }

    public IabResult launchSubscriptionPurchaseFlow(Activity activity, String s, int i, OnIabPurchaseFinishedListener oniabpurchasefinishedlistener)
    {
        return launchSubscriptionPurchaseFlow(activity, s, i, oniabpurchasefinishedlistener, "");
    }

    public IabResult launchSubscriptionPurchaseFlow(Activity activity, String s, int i, OnIabPurchaseFinishedListener oniabpurchasefinishedlistener, String s1)
    {
        return launchPurchaseFlow(activity, s, "subs", i, oniabpurchasefinishedlistener, s1);
    }

    void logError(String s)
    {
        Log.e("IabHelper", (new StringBuilder("In-app billing error: ")).append(s).toString());
    }

    void logWarn(String s)
    {
        Log.w("IabHelper", (new StringBuilder("In-app billing warning: ")).append(s).toString());
    }

    public Inventory queryInventory(boolean flag, List list)
        throws IabException
    {
        return queryInventory(flag, list, null);
    }

    public Inventory queryInventory(boolean flag, List list, List list1)
        throws IabException
    {
        Inventory inventory;
        checkNotDisposed();
        checkSetupDone("queryInventory");
        int i;
        try
        {
            inventory = new Inventory();
            i = queryPurchases(inventory, "inapp");
        }
        // Misplaced declaration of an exception variable
        catch(List list)
        {
            throw new IabException(-1001, "Remote exception while refreshing inventory.", list);
        }
        // Misplaced declaration of an exception variable
        catch(List list)
        {
            throw new IabException(-1002, "Error parsing JSON response while refreshing inventory.", list);
        }
        if(i == 0)
            break MISSING_BLOCK_LABEL_64;
        throw new IabException(i, "Error refreshing inventory (querying owned items).");
        if(!flag)
            break MISSING_BLOCK_LABEL_113;
        i = querySkuDetails("inapp", inventory, list);
        if(i == 0)
            break MISSING_BLOCK_LABEL_113;
        throw new IabException(i, "Error refreshing inventory (querying prices of items).");
        int j;
        if(!mSubscriptionsSupported)
            break MISSING_BLOCK_LABEL_181;
        j = queryPurchases(inventory, "subs");
        if(j == 0)
            break MISSING_BLOCK_LABEL_148;
        throw new IabException(j, "Error refreshing inventory (querying owned subscriptions).");
        if(!flag)
            break MISSING_BLOCK_LABEL_181;
        j = querySkuDetails("subs", inventory, list1);
        if(j == 0)
            break MISSING_BLOCK_LABEL_181;
        throw new IabException(j, "Error refreshing inventory (querying prices of subscriptions).");
        return inventory;
    }

    public void queryInventoryAsync(QueryInventoryFinishedListener queryinventoryfinishedlistener)
    {
        queryInventoryAsync(true, null, queryinventoryfinishedlistener);
    }

    public void queryInventoryAsync(final boolean querySkuDetails, final List moreSkus, final QueryInventoryFinishedListener listener)
    {
        final Handler handler = new Handler();
        checkNotDisposed();
        checkSetupDone("queryInventory");
        flagStartAsync("refresh inventory");
        (new Thread(new Runnable() {

            public void run()
            {
                Inventory inventory;
                final IabResult result_f;
                result_f = new IabResult(0, "Inventory refresh successful.");
                inventory = null;
                Inventory inventory1 = queryInventory(querySkuDetails, moreSkus);
                inventory = inventory1;
_L2:
                flagEndAsync();
                if(!mDisposed && listener != null)
                    handler.post(inventory. new Runnable() {

                        public void run()
                        {
                            listener.onQueryInventoryFinished(result_f, inv_f);
                        }

                        final _cls3 this$1;
                        private final Inventory val$inv_f;
                        private final QueryInventoryFinishedListener val$listener;
                        private final IabResult val$result_f;

            
            {
                this$1 = final__pcls3;
                listener = queryinventoryfinishedlistener;
                result_f = iabresult;
                inv_f = Inventory.this;
                super();
            }
                    }
);
                return;
                IabException iabexception;
                iabexception;
                iabexception = iabexception.getResult();
                if(true) goto _L2; else goto _L1
_L1:
            }

            final IabHelper this$0;
            private final Handler val$handler;
            private final QueryInventoryFinishedListener val$listener;
            private final List val$moreSkus;
            private final boolean val$querySkuDetails;

            
            {
                this$0 = IabHelper.this;
                querySkuDetails = flag;
                moreSkus = list;
                listener = queryinventoryfinishedlistener;
                handler = handler1;
                super();
            }
        }
)).start();
    }

    public void queryInventoryAsync(boolean flag, QueryInventoryFinishedListener queryinventoryfinishedlistener)
    {
        queryInventoryAsync(flag, null, queryinventoryfinishedlistener);
    }

    int queryPurchases(Inventory inventory, String s)
        throws JSONException, RemoteException
    {
        Object obj;
        int i;
        PluginManager.logDebug("IabHelper", (new StringBuilder("Querying owned items, item type: ")).append(s).toString());
        PluginManager.logDebug("IabHelper", (new StringBuilder("Package name: ")).append(mContext.getPackageName()).toString());
        i = 0;
        obj = null;
_L2:
        Object obj1;
        ArrayList arraylist;
        ArrayList arraylist1;
        boolean flag;
        PluginManager.logDebug("IabHelper", (new StringBuilder("Calling getPurchases with continuation token: ")).append(((String) (obj))).toString());
        obj = mService.getPurchases(3, mContext.getPackageName(), s, ((String) (obj)));
        int j = getResponseCodeFromBundle(((Bundle) (obj)));
        PluginManager.logDebug("IabHelper", (new StringBuilder("Owned items response: ")).append(String.valueOf(j)).toString());
        if(j != 0)
        {
            PluginManager.logDebug("IabHelper", (new StringBuilder("getPurchases() failed: ")).append(getResponseDesc(j)).toString());
            return j;
        }
        if(!((Bundle) (obj)).containsKey("INAPP_PURCHASE_ITEM_LIST") || !((Bundle) (obj)).containsKey("INAPP_PURCHASE_DATA_LIST") || !((Bundle) (obj)).containsKey("INAPP_DATA_SIGNATURE_LIST"))
        {
            logError("Bundle returned from getPurchases() doesn't contain required fields.");
            return -1002;
        }
        obj1 = ((Bundle) (obj)).getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        arraylist = ((Bundle) (obj)).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        arraylist1 = ((Bundle) (obj)).getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        boolean flag1 = false;
        flag = i;
        i = ((flag1) ? 1 : 0);
_L3:
label0:
        {
            if(i < arraylist.size())
                break label0;
            obj1 = ((Bundle) (obj)).getString("INAPP_CONTINUATION_TOKEN");
            PluginManager.logDebug("IabHelper", (new StringBuilder("Continuation token: ")).append(((String) (obj1))).toString());
            obj = obj1;
            i = ((flag) ? 1 : 0);
            if(TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                String s1;
                Object obj2;
                String s2;
                if(flag)
                    i = -1003;
                else
                    i = 0;
                return i;
            }
        }
        if(true) goto _L2; else goto _L1
_L1:
        s1 = (String)arraylist.get(i);
        obj2 = (String)arraylist1.get(i);
        s2 = (String)((ArrayList) (obj1)).get(i);
        if(verifyPurchaseData(s1, ((String) (obj2))))
        {
            PluginManager.logDebug("IabHelper", (new StringBuilder("Sku is owned: ")).append(s2).toString());
            obj2 = new Purchase(s, s1, ((String) (obj2)));
            if(TextUtils.isEmpty(((Purchase) (obj2)).getToken()))
            {
                logWarn("BUG: empty/null token!");
                PluginManager.logDebug("IabHelper", (new StringBuilder("Purchase data: ")).append(s1).toString());
            }
            inventory.addPurchase(((Purchase) (obj2)));
        } else
        {
            logWarn("Purchase signature verification **FAILED**. Not adding item.");
            PluginManager.logDebug("IabHelper", (new StringBuilder("   Purchase data: ")).append(s1).toString());
            PluginManager.logDebug("IabHelper", (new StringBuilder("   Signature: ")).append(((String) (obj2))).toString());
            flag = true;
        }
        i++;
          goto _L3
    }

    public IabResult queryPurchases(QueryInventoryFinishedListener queryinventoryfinishedlistener)
    {
        Inventory inventory;
        IabResult iabresult;
        iabresult = new IabResult(0, "Inventory refresh successful.");
        inventory = null;
        Inventory inventory1 = queryInventory(false, null, null);
        inventory = inventory1;
_L2:
        if(queryinventoryfinishedlistener != null)
            queryinventoryfinishedlistener.onQueryInventoryFinished(iabresult, inventory);
        return iabresult;
        IabException iabexception;
        iabexception;
        iabexception = iabexception.getResult();
        if(true) goto _L2; else goto _L1
_L1:
    }

    int querySkuDetails(String s, Inventory inventory, List list)
        throws RemoteException, JSONException
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        PluginManager.logDebug("IabHelper", "Querying SKU details.");
        arraylist.addAll(inventory.getAllOwnedSkus(s));
        if(list == null) goto _L2; else goto _L1
_L1:
        list = list.iterator();
_L5:
        if(list.hasNext()) goto _L3; else goto _L2
_L2:
        String s1;
        if(arraylist.size() == 0)
        {
            PluginManager.logDebug("IabHelper", "queryPrices: nothing to do because there are no SKUs.");
        } else
        {
            list = new Bundle();
            list.putStringArrayList("ITEM_ID_LIST", arraylist);
            list = mService.getSkuDetails(3, mContext.getPackageName(), s, list);
            if(!list.containsKey("DETAILS_LIST"))
            {
                int i = getResponseCodeFromBundle(list);
                if(i != 0)
                {
                    PluginManager.logDebug("IabHelper", (new StringBuilder("getSkuDetails() failed: ")).append(getResponseDesc(i)).toString());
                    return i;
                } else
                {
                    logError("getSkuDetails() returned a bundle with neither an error nor a detail list.");
                    return -1002;
                }
            }
            list = list.getStringArrayList("DETAILS_LIST").iterator();
            while(list.hasNext()) 
            {
                SkuDetails skudetails = new SkuDetails(s, (String)list.next());
                PluginManager.logDebug("IabHelper", (new StringBuilder("Got sku details: ")).append(skudetails).toString());
                inventory.addSkuDetails(skudetails);
            }
        }
        return 0;
_L3:
        s1 = (String)list.next();
        if(!arraylist.contains(s1))
            arraylist.add(s1);
        if(true) goto _L5; else goto _L4
_L4:
    }

    public Inventory querySkuDetails(List list)
        throws IabException
    {
        Inventory inventory;
        checkNotDisposed();
        checkSetupDone("querySkuDetails");
        int i;
        try
        {
            inventory = new Inventory();
            i = querySkuDetails("inapp", inventory, list);
        }
        // Misplaced declaration of an exception variable
        catch(List list)
        {
            throw new IabException(-1001, "Remote exception while refreshing inventory.", list);
        }
        // Misplaced declaration of an exception variable
        catch(List list)
        {
            throw new IabException(-1002, "Error parsing JSON response while refreshing inventory.", list);
        }
        if(i == 0)
            break MISSING_BLOCK_LABEL_60;
        throw new IabException(i, "Error refreshing inventory (querying prices of items).");
        if(!mSubscriptionsSupported)
            break MISSING_BLOCK_LABEL_108;
        i = querySkuDetails("subs", inventory, list);
        if(i == 0)
            break MISSING_BLOCK_LABEL_108;
        throw new IabException(i, "Error refreshing inventory (querying prices of subscriptions).");
        return inventory;
    }

    public Inventory querySkuDetails(List list, QueryInventoryFinishedListener queryinventoryfinishedlistener)
    {
        IabResult iabresult;
        IabResult iabresult1;
        iabresult1 = new IabResult(0, "Inventory refresh successful.");
        iabresult = null;
        list = querySkuDetails(list);
        iabresult = iabresult1;
_L2:
        if(queryinventoryfinishedlistener != null)
            queryinventoryfinishedlistener.onQueryInventoryFinished(iabresult, list);
        return list;
        list;
        IabResult iabresult2 = list.getResult();
        list = iabresult;
        iabresult = iabresult2;
        if(true) goto _L2; else goto _L1
_L1:
    }

    public void querySkuDetailsAsync(final List productIdList, final QueryInventoryFinishedListener listener)
    {
        final Handler handler = new Handler();
        checkNotDisposed();
        checkSetupDone("querySkuDetails");
        flagStartAsync("refresh inventory");
        (new Thread(new Runnable() {

            public void run()
            {
                Inventory inventory;
                final IabResult result_f;
                result_f = new IabResult(0, "Inventory refresh successful.");
                inventory = null;
                Inventory inventory1 = querySkuDetails(productIdList);
                inventory = inventory1;
_L2:
                flagEndAsync();
                if(!mDisposed && listener != null)
                    handler.post(inventory. new Runnable() {

                        public void run()
                        {
                            listener.onQueryInventoryFinished(result_f, inventory_f);
                        }

                        final _cls2 this$1;
                        private final Inventory val$inventory_f;
                        private final QueryInventoryFinishedListener val$listener;
                        private final IabResult val$result_f;

            
            {
                this$1 = final__pcls2;
                listener = queryinventoryfinishedlistener;
                result_f = iabresult;
                inventory_f = Inventory.this;
                super();
            }
                    }
);
                return;
                IabException iabexception;
                iabexception;
                iabexception = iabexception.getResult();
                if(true) goto _L2; else goto _L1
_L1:
            }

            final IabHelper this$0;
            private final Handler val$handler;
            private final QueryInventoryFinishedListener val$listener;
            private final List val$productIdList;

            
            {
                this$0 = IabHelper.this;
                productIdList = list;
                listener = queryinventoryfinishedlistener;
                handler = handler1;
                super();
            }
        }
)).start();
    }

    public void startSetup(final OnIabSetupFinishedListener listener)
    {
        checkNotDisposed();
        if(mSetupDone)
            throw new IllegalStateException("IAB helper is already set up.");
        PluginManager.logDebug("IabHelper", "Starting in-app billing setup.");
        mServiceConn = new ServiceConnection() {

            public void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                if(!mDisposed) goto _L2; else goto _L1
_L1:
                return;
_L2:
                PluginManager.logDebug("IabHelper", "Billing service connected.");
                mService = com.android.vending.billing.IInAppBillingService.Stub.asInterface(ibinder);
                componentname = mContext.getPackageName();
                int i;
                PluginManager.logDebug("IabHelper", "Checking for in-app billing 3 support.");
                i = mService.isBillingSupported(3, componentname, "inapp");
                if(i == 0)
                    break MISSING_BLOCK_LABEL_133;
                try
                {
                    if(listener != null)
                        listener.onIabSetupFinished(new IabResult(i, "Error checking for billing v3 support."));
                    mSubscriptionsSupported = false;
                    return;
                }
                // Misplaced declaration of an exception variable
                catch(ComponentName componentname) { }
                if(listener == null) goto _L1; else goto _L3
_L3:
                listener.onIabSetupFinished(new IabResult(-1001, "RemoteException while setting up in-app billing."));
                return;
                PluginManager.logDebug("IabHelper", (new StringBuilder("In-app billing version 3 supported for ")).append(componentname).toString());
                i = mService.isBillingSupported(3, componentname, "subs");
                if(i != 0)
                    break MISSING_BLOCK_LABEL_225;
                PluginManager.logDebug("IabHelper", "Subscriptions AVAILABLE.");
                mSubscriptionsSupported = true;
_L5:
                mSetupDone = true;
                if(listener == null) goto _L1; else goto _L4
_L4:
                listener.onIabSetupFinished(new IabResult(0, "Setup successful."));
                return;
                PluginManager.logDebug("IabHelper", (new StringBuilder("Subscriptions NOT AVAILABLE. Response: ")).append(i).toString());
                  goto _L5
            }

            public void onServiceDisconnected(ComponentName componentname)
            {
                PluginManager.logDebug("IabHelper", "Billing service disconnected.");
                mService = null;
            }

            final IabHelper this$0;
            private final OnIabSetupFinishedListener val$listener;

            
            {
                this$0 = IabHelper.this;
                listener = oniabsetupfinishedlistener;
                super();
            }
        }
;
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        if(!mContext.getPackageManager().queryIntentServices(intent, 0).isEmpty())
            mContext.bindService(intent, mServiceConn, 1);
        else
        if(listener != null)
        {
            listener.onIabSetupFinished(new IabResult(3, "Billing service unavailable on device."));
            return;
        }
    }

    public boolean subscriptionsSupported()
    {
        checkNotDisposed();
        return mSubscriptionsSupported;
    }

    boolean verifyPurchaseData(String s, String s1)
    {
        if(mSignatureBase64 == null)
            return true;
        else
            return Security.verifyWithBase64Key(mSignatureBase64, s, s1);
    }

    public static final int BILLING_RESPONSE_RESULT_BILLING_UNAVAILABLE = 3;
    public static final int BILLING_RESPONSE_RESULT_DEVELOPER_ERROR = 5;
    public static final int BILLING_RESPONSE_RESULT_ERROR = 6;
    public static final int BILLING_RESPONSE_RESULT_ITEM_ALREADY_OWNED = 7;
    public static final int BILLING_RESPONSE_RESULT_ITEM_NOT_OWNED = 8;
    public static final int BILLING_RESPONSE_RESULT_ITEM_UNAVAILABLE = 4;
    public static final int BILLING_RESPONSE_RESULT_OK = 0;
    public static final int BILLING_RESPONSE_RESULT_USER_CANCELED = 1;
    public static final String DBG_TAG = "IabHelper";
    public static final String GET_SKU_DETAILS_ITEM_LIST = "ITEM_ID_LIST";
    public static final String GET_SKU_DETAILS_ITEM_TYPE_LIST = "ITEM_TYPE_LIST";
    public static final int IABHELPER_BAD_RESPONSE = -1002;
    public static final int IABHELPER_ERROR_BASE = -1000;
    public static final int IABHELPER_INVALID_CONSUMPTION = -1010;
    public static final int IABHELPER_MISSING_TOKEN = -1007;
    public static final int IABHELPER_REMOTE_EXCEPTION = -1001;
    public static final int IABHELPER_SEND_INTENT_FAILED = -1004;
    public static final int IABHELPER_SUBSCRIPTIONS_NOT_AVAILABLE = -1009;
    public static final int IABHELPER_UNKNOWN_ERROR = -1008;
    public static final int IABHELPER_UNKNOWN_PURCHASE_RESPONSE = -1006;
    public static final int IABHELPER_USER_CANCELLED = -1005;
    public static final int IABHELPER_VERIFICATION_FAILED = -1003;
    public static final String INAPP_CONTINUATION_TOKEN = "INAPP_CONTINUATION_TOKEN";
    public static final int IN_APP_BILLING_VERSION = 3;
    public static final String ITEM_TYPE_INAPP = "inapp";
    public static final String ITEM_TYPE_SUBS = "subs";
    public static final String RESPONSE_BUY_INTENT = "BUY_INTENT";
    public static final String RESPONSE_CODE = "RESPONSE_CODE";
    public static final String RESPONSE_GET_SKU_DETAILS_LIST = "DETAILS_LIST";
    public static final String RESPONSE_INAPP_ITEM_LIST = "INAPP_PURCHASE_ITEM_LIST";
    public static final String RESPONSE_INAPP_PURCHASE_DATA = "INAPP_PURCHASE_DATA";
    public static final String RESPONSE_INAPP_PURCHASE_DATA_LIST = "INAPP_PURCHASE_DATA_LIST";
    public static final String RESPONSE_INAPP_SIGNATURE = "INAPP_DATA_SIGNATURE";
    public static final String RESPONSE_INAPP_SIGNATURE_LIST = "INAPP_DATA_SIGNATURE_LIST";
    boolean mAsyncInProgress;
    String mAsyncOperation;
    Context mContext;
    boolean mDisposed;
    OnIabPurchaseFinishedListener mPurchaseListener;
    String mPurchasingItemType;
    int mRequestCode;
    IInAppBillingService mService;
    ServiceConnection mServiceConn;
    boolean mSetupDone;
    String mSignatureBase64;
    boolean mSubscriptionsSupported;
}
