// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.zzb;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONException;

public class zzn extends zzb
{

    public zzn(String s, int i)
    {
        super(s, Collections.singleton(s), Collections.emptySet(), i);
    }

    public static final Collection zzce(String s)
        throws JSONException
    {
        if(s == null)
            return null;
        ArrayList arraylist = new ArrayList();
        s = new JSONArray(s);
        for(int i = 0; i < s.length(); i++)
            arraylist.add(s.getString(i));

        return Collections.unmodifiableCollection(arraylist);
    }

    protected volatile void zza(Bundle bundle, Object obj)
    {
        zza(bundle, (Collection)obj);
    }

    protected void zza(Bundle bundle, Collection collection)
    {
        bundle.putStringArrayList(getName(), new ArrayList(collection));
    }

    protected Object zzc(DataHolder dataholder, int i, int j)
    {
        return zzd(dataholder, i, j);
    }

    protected Collection zzd(DataHolder dataholder, int i, int j)
    {
        try
        {
            dataholder = zzce(dataholder.zzd(getName(), i, j));
        }
        // Misplaced declaration of an exception variable
        catch(DataHolder dataholder)
        {
            throw new IllegalStateException("DataHolder supplied invalid JSON", dataholder);
        }
        return dataholder;
    }

    protected Object zzj(Bundle bundle)
    {
        return zzo(bundle);
    }

    protected Collection zzo(Bundle bundle)
    {
        return bundle.getStringArrayList(getName());
    }
}
