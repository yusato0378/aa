// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.metadata;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.drive.metadata:
//            zzc

public class CustomPropertyKey
    implements SafeParcelable
{

    CustomPropertyKey(int i, String s, int j)
    {
        boolean flag1 = true;
        super();
        zzv.zzb(s, "key");
        zzv.zzb(zzZz.matcher(s).matches(), "key name characters must be alphanumeric or one of .!@$%^&*()-_/");
        boolean flag = flag1;
        if(j != 0)
            if(j == 1)
                flag = flag1;
            else
                flag = false;
        zzv.zzb(flag, "visibility must be either PUBLIC or PRIVATE");
        zzzH = i;
        zzra = s;
        mVisibility = j;
    }

    public CustomPropertyKey(String s, int i)
    {
        this(1, s, i);
    }

    public static CustomPropertyKey fromJson(JSONObject jsonobject)
        throws JSONException
    {
        return new CustomPropertyKey(jsonobject.getString("key"), jsonobject.getInt("visibility"));
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag = true;
        if(obj != null)
        {
            if(obj == this)
                return true;
            if(obj instanceof CustomPropertyKey)
            {
                obj = (CustomPropertyKey)obj;
                if(!((CustomPropertyKey) (obj)).getKey().equals(zzra) || ((CustomPropertyKey) (obj)).getVisibility() != mVisibility)
                    flag = false;
                return flag;
            }
        }
        return false;
    }

    public String getKey()
    {
        return zzra;
    }

    public int getVisibility()
    {
        return mVisibility;
    }

    public int hashCode()
    {
        return (new StringBuilder()).append(zzra).append(mVisibility).toString().hashCode();
    }

    public JSONObject toJson()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("key", getKey());
        jsonobject.put("visibility", getVisibility());
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder()).append("CustomPropertyKey(").append(zzra).append(",").append(mVisibility).append(")").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    public static final int PRIVATE = 1;
    public static final int PUBLIC = 0;
    private static final Pattern zzZz = Pattern.compile("[\\w.!@$%^&*()/-]+");
    final int mVisibility;
    final String zzra;
    final int zzzH;

}
