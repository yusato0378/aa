// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.lib;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

// Referenced classes of package org.cocos2dx.lib:
//            Cocos2dxActivity

public class Cocos2dxLocalStorage
{
    private static class DBOpenHelper extends SQLiteOpenHelper
    {

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE IF NOT EXISTS ").append(Cocos2dxLocalStorage.TABLE_NAME).append("(key TEXT PRIMARY KEY,value TEXT);").toString());
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            Log.w("Cocos2dxLocalStorage", (new StringBuilder()).append("Upgrading database from version ").append(i).append(" to ").append(j).append(", which will destroy all old data").toString());
        }

        DBOpenHelper(Context context)
        {
            super(context, Cocos2dxLocalStorage.DATABASE_NAME, null, 1);
        }
    }


    public Cocos2dxLocalStorage()
    {
    }

    public static void destory()
    {
        if(mDatabase != null)
            mDatabase.close();
    }

    public static String getItem(String s)
    {
        String s1;
        Object obj;
        Cursor cursor;
        cursor = null;
        obj = null;
        s1 = cursor;
        String s2 = (new StringBuilder()).append("select value from ").append(TABLE_NAME).append(" where key=?").toString();
        s1 = cursor;
        cursor = mDatabase.rawQuery(s2, new String[] {
            s
        });
        s = obj;
_L1:
        s1 = s;
        if(!cursor.moveToNext())
            break MISSING_BLOCK_LABEL_80;
        if(s == null)
            break MISSING_BLOCK_LABEL_99;
        s1 = s;
        Log.e("Cocos2dxLocalStorage", "The key contains more than one value.");
        s1 = s;
        try
        {
            cursor.close();
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            s.printStackTrace();
            s = s1;
        }
        s1 = s;
        if(s == null)
            s1 = "";
        return s1;
        s1 = s;
        s = cursor.getString(cursor.getColumnIndex("value"));
          goto _L1
    }

    public static boolean init(String s, String s1)
    {
        if(Cocos2dxActivity.getContext() != null)
        {
            DATABASE_NAME = s;
            TABLE_NAME = s1;
            mDatabaseOpenHelper = new DBOpenHelper(Cocos2dxActivity.getContext());
            mDatabase = mDatabaseOpenHelper.getWritableDatabase();
            return true;
        } else
        {
            return false;
        }
    }

    public static void removeItem(String s)
    {
        try
        {
            String s1 = (new StringBuilder()).append("delete from ").append(TABLE_NAME).append(" where key=?").toString();
            mDatabase.execSQL(s1, new Object[] {
                s
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            s.printStackTrace();
        }
    }

    public static void setItem(String s, String s1)
    {
        try
        {
            String s2 = (new StringBuilder()).append("replace into ").append(TABLE_NAME).append("(key,value)values(?,?)").toString();
            mDatabase.execSQL(s2, new Object[] {
                s, s1
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            s.printStackTrace();
        }
    }

    private static String DATABASE_NAME = "jsb.sqlite";
    private static final int DATABASE_VERSION = 1;
    private static String TABLE_NAME = "data";
    private static final String TAG = "Cocos2dxLocalStorage";
    private static SQLiteDatabase mDatabase = null;
    private static DBOpenHelper mDatabaseOpenHelper = null;



}
