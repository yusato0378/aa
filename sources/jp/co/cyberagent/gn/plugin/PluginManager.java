// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.gn.plugin;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Locale;

// Referenced classes of package jp.co.cyberagent.gn.plugin:
//            PluginProtocol, PluginInfo

public class PluginManager
{

    private PluginManager()
    {
        isInitialized = false;
        currentActivity = null;
        pluginInfoList = null;
    }

    private String createErrorResultString(String s, int i, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append((new StringBuilder("{ \\\"errorCode\\\":")).append(i).append(", \\\"message\\\":\\\"").append(s1).append("\\\" }").toString());
        return createResultString(s, stringbuilder.toString());
    }

    private PluginProtocol createPlugin(String s)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        obj5 = null;
        obj6 = null;
        obj7 = null;
        obj4 = null;
        obj8 = getAbsolutePluginClassName(s);
        obj = obj4;
        if(obj8 == null)
            break MISSING_BLOCK_LABEL_86;
        obj1 = obj5;
        obj2 = obj6;
        obj3 = obj7;
        obj8 = Class.forName(((String) (obj8)));
        obj = obj4;
        if(obj8 == null)
            break MISSING_BLOCK_LABEL_86;
        obj1 = obj5;
        obj2 = obj6;
        obj3 = obj7;
        obj = (PluginProtocol)((Class) (obj8)).newInstance();
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        try
        {
            ((PluginProtocol) (obj)).init();
        }
        catch(ClassNotFoundException classnotfoundexception)
        {
            classnotfoundexception = ((ClassNotFoundException) (obj3));
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            obj = obj2;
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            obj = obj1;
        }
        if(obj != null)
        {
            logDebug((new StringBuilder("createPlugin : Created plugin : ")).append(s).toString());
            return ((PluginProtocol) (obj));
        } else
        {
            logDebug((new StringBuilder("createPlugin : Failed to create plugin : ")).append(s).toString());
            return ((PluginProtocol) (obj));
        }
    }

    private String createResultString(String s, String s1)
    {
        return String.format("{\"requestId\":\"%s\",\"result\":\"%s\"}", new Object[] {
            s, s1
        });
    }

    private String getAbsolutePluginClassName(String s)
    {
        String s1 = null;
        if(s != null)
        {
            s1 = new String((new StringBuilder("jp.co.cyberagent.gn.plugin.")).append(s.toLowerCase(Locale.getDefault())).append(".").append(s).toString());
            logDebug((new StringBuilder("getAbsolutePluginClassName : ")).append(s1).toString());
        }
        return s1;
    }

    public static Activity getCurrentActivity()
    {
        PluginManager pluginmanager = getInstance();
        Activity activity = null;
        if(pluginmanager != null)
            activity = pluginmanager.currentActivity;
        return activity;
    }

    public static PluginManager getInstance()
    {
        if(!instance.isInitialized)
            instance.init();
        return instance;
    }

    public static String getPackageName()
    {
        PluginManager pluginmanager = getInstance();
        String s = null;
        if(pluginmanager.currentActivity != null)
            s = pluginmanager.currentActivity.getPackageName();
        logDebug((new StringBuilder("PluginManager.getPackageName : result = ")).append(s).toString());
        return s;
    }

    public static PluginProtocol getPlugin(String s)
    {
        Object obj = getInstance();
        if(obj == null)
        {
            logDebug("PluginManager not found.");
        } else
        {
            obj = ((PluginManager) (obj)).pluginInfoList;
            int j = ((ArrayList) (obj)).size();
            int i = 0;
            while(i < j) 
            {
                PluginInfo plugininfo = (PluginInfo)((ArrayList) (obj)).get(i);
                if(plugininfo != null && plugininfo.pluginId.compareTo(s) == 0 && plugininfo.protocol != null)
                    return plugininfo.protocol;
                i++;
            }
        }
        return null;
    }

    public static boolean handleActivityResult(int i, int j, Intent intent)
    {
        ArrayList arraylist;
        int k;
        int l;
        boolean flag;
        arraylist = getInstance().pluginInfoList;
        l = arraylist.size();
        flag = false;
        k = 0;
_L5:
        if(k < l) goto _L2; else goto _L1
_L1:
        return flag;
_L2:
        boolean flag1;
        PluginInfo plugininfo = (PluginInfo)arraylist.get(k);
        flag1 = flag;
        if(plugininfo == null)
            break; /* Loop/switch isn't completed */
        flag1 = flag;
        if(plugininfo.protocol == null)
            break; /* Loop/switch isn't completed */
        flag1 = plugininfo.protocol.handleActivityResult(i, j, intent);
        flag = flag1;
        if(flag1) goto _L1; else goto _L3
_L3:
        k++;
        flag = flag1;
        if(true) goto _L5; else goto _L4
_L4:
    }

    public static void loadPlugin(String s, String s1, String s2)
    {
        PluginManager pluginmanager = getInstance();
        PluginInfo plugininfo = null;
        logDebug((new StringBuilder("loadPlugin : ")).append(s).append(", ").append(s1).append(", ").append(s2).toString());
        if(pluginmanager == null)
        {
            logDebug("PluginManager not found.");
            return;
        }
        PluginProtocol pluginprotocol = pluginmanager.createPlugin(s2);
        if(pluginprotocol != null)
        {
            PluginInfo plugininfo1 = new PluginInfo();
            plugininfo = plugininfo1;
            if(plugininfo1 != null)
            {
                plugininfo1.set(s1, s2, pluginprotocol);
                pluginmanager.pluginInfoList.add(plugininfo1);
                plugininfo = plugininfo1;
            }
        }
        if(plugininfo == null)
        {
            logDebug("error.");
            sendErrorResult(s, 10003, "\u30D7\u30E9\u30B0\u30A4\u30F3\u304C\u751F\u6210\u3067\u304D\u307E\u305B\u3093\u3002");
            return;
        } else
        {
            logDebug("ok.");
            sendResult(s, "ok");
            return;
        }
    }

    public static void logDebug(String s)
    {
        logDebug("PluginManager", s);
    }

    public static void logDebug(String s, String s1)
    {
    }

    public static void sendErrorResult(String s, int i, String s1)
    {
        PluginManager pluginmanager = getInstance();
        logDebug((new StringBuilder("sendErrorResult : ")).append(s).append(", ").append(i).append(", ").append(s1).toString());
        if(pluginmanager == null)
        {
            logDebug("PluginManager not found.");
            return;
        } else
        {
            pluginmanager.sendResult(pluginmanager.createErrorResultString(s, i, s1));
            return;
        }
    }

    public static void sendResult(String s, String s1)
    {
        PluginManager pluginmanager = getInstance();
        logDebug((new StringBuilder("sendResult : ")).append(s).append(", ").append(s1).toString());
        if(pluginmanager == null)
        {
            logDebug("PluginManager not found.");
            return;
        } else
        {
            pluginmanager.sendResult(pluginmanager.createResultString(s, s1));
            return;
        }
    }

    public static void setCurrentActivity(Activity activity)
    {
        PluginManager pluginmanager = getInstance();
        if(pluginmanager != null)
            pluginmanager.currentActivity = activity;
    }

    public static void showAlertDialog(final String titleString, final String messageString)
    {
        final Activity activity = getCurrentActivity();
        activity.runOnUiThread(new Runnable() {

            public void run()
            {
                AlertDialog alertdialog = (new android.app.AlertDialog.Builder(activity)).setTitle(titleString).setMessage(messageString).setPositiveButton("OK", null).create();
                if(alertdialog != null)
                    alertdialog.show();
            }

            private final Activity val$activity;
            private final String val$messageString;
            private final String val$titleString;

            
            {
                activity = activity1;
                titleString = s;
                messageString = s1;
                super();
            }
        }
);
    }

    public static void unloadPlugin(String s, String s1, String s2)
    {
        int i;
        boolean flag;
        int j;
        PluginManager pluginmanager = getInstance();
        flag = false;
        logDebug((new StringBuilder("unloadPlugin : ")).append(s).append(", ").append(s1).append(", ").append(s2).toString());
        if(pluginmanager == null)
        {
            logDebug("PluginManager not found.");
            return;
        }
        s2 = pluginmanager.pluginInfoList;
        j = s2.size();
        i = 0;
_L2:
        if(i >= j)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
label0:
            {
                PluginInfo plugininfo = (PluginInfo)s2.get(i);
                if(plugininfo == null || plugininfo.pluginId.compareTo(s1) != 0 || plugininfo.protocol == null)
                    break label0;
                s2.remove(i);
                plugininfo.release();
                i = 1;
            }
        }
        if(i == 0)
        {
            sendErrorResult(s, 10002, "\u30D7\u30E9\u30B0\u30A4\u30F3\u304C\u5B9F\u884C\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002");
            return;
        } else
        {
            sendResult(s, "");
            return;
        }
        i++;
        if(true) goto _L2; else goto _L1
_L1:
    }

    public native void JNISendResult(String s);

    public PluginManager init()
    {
        pluginInfoList = new ArrayList();
        if(pluginInfoList != null)
            isInitialized = true;
        return this;
    }

    public void sendResult(String s)
    {
        JNISendResult(s);
    }

    public static final boolean DBG_PROC_ENABLE = false;
    public static final boolean JSON_UNITY = false;
    public static final boolean LOG_DBG_ENABLE = false;
    public static final String LOG_DBG_TAG = "PluginManager";
    public static final String PACKAGE_NAME_BASE = "jp.co.cyberagent.gn.plugin.";
    public static final int PLUGIN_ERROR_CODE_CALCELLED = 10000;
    public static final int PLUGIN_ERROR_CODE_CANT_CREATE = 10003;
    public static final int PLUGIN_ERROR_CODE_INTERNAL = 10001;
    public static final int PLUGIN_ERROR_CODE_NOT_FOUND = 10002;
    public static final int PLUGIN_ERROR_CODE_SUCCESS = 0;
    public static final String PLUGIN_ERROR_MSG_CALCELLED = "\u51E6\u7406\u304C\u30AD\u30E3\u30F3\u30BB\u30EB\u3055\u308C\u307E\u3057\u305F\u3002";
    public static final String PLUGIN_ERROR_MSG_CANT_CREATE = "\u30D7\u30E9\u30B0\u30A4\u30F3\u304C\u751F\u6210\u3067\u304D\u307E\u305B\u3093\u3002";
    public static final String PLUGIN_ERROR_MSG_INTERNAL = "\u4E0D\u660E\u306A\u30A8\u30E9\u30FC\u304C\u767A\u751F\u3057\u307E\u3057\u305F\u3002";
    public static final String PLUGIN_ERROR_MSG_NOT_FOUND = "\u30D7\u30E9\u30B0\u30A4\u30F3\u304C\u5B9F\u884C\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002";
    public static final String PLUGIN_ERROR_MSG_SUCCESS = "";
    public static final String SEND_RESULT_TARGET_METHOD = "ResultPlugin";
    public static final String SEND_RESULT_TARGET_OBJECT = "PluginManager";
    private static PluginManager instance = new PluginManager();
    private Activity currentActivity;
    private boolean isInitialized;
    private ArrayList pluginInfoList;

}
