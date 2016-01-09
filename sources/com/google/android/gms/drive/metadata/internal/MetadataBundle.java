// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.metadata.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.drive.internal.zzx;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.zzig;
import java.util.*;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            zzh, zze

public final class MetadataBundle
    implements SafeParcelable
{

    MetadataBundle(int i, Bundle bundle)
    {
        zzzH = i;
        zzZF = (Bundle)zzv.zzr(bundle);
        zzZF.setClassLoader(getClass().getClassLoader());
        bundle = new ArrayList();
        Iterator iterator = zzZF.keySet().iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            String s1 = (String)iterator.next();
            if(zze.zzcd(s1) == null)
            {
                bundle.add(s1);
                zzx.zzt("MetadataBundle", (new StringBuilder()).append("Ignored unknown metadata field in bundle: ").append(s1).toString());
            }
        } while(true);
        String s;
        for(bundle = bundle.iterator(); bundle.hasNext(); zzZF.remove(s))
            s = (String)bundle.next();

    }

    private MetadataBundle(Bundle bundle)
    {
        this(1, bundle);
    }

    public static MetadataBundle zza(MetadataField metadatafield, Object obj)
    {
        MetadataBundle metadatabundle = zzok();
        metadatabundle.zzb(metadatafield, obj);
        return metadatabundle;
    }

    public static MetadataBundle zza(MetadataBundle metadatabundle)
    {
        return new MetadataBundle(new Bundle(metadatabundle.zzZF));
    }

    public static MetadataBundle zzok()
    {
        return new MetadataBundle(new Bundle());
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;
        if(!(obj instanceof MetadataBundle))
            return false;
        obj = (MetadataBundle)obj;
        Object obj1 = zzZF.keySet();
        if(!((Set) (obj1)).equals(((MetadataBundle) (obj)).zzZF.keySet()))
            return false;
        for(obj1 = ((Set) (obj1)).iterator(); ((Iterator) (obj1)).hasNext();)
        {
            String s = (String)((Iterator) (obj1)).next();
            if(!zzu.equal(zzZF.get(s), ((MetadataBundle) (obj)).zzZF.get(s)))
                return false;
        }

        return true;
    }

    public int hashCode()
    {
        Iterator iterator = zzZF.keySet().iterator();
        String s;
        int i;
        for(i = 1; iterator.hasNext(); i = zzZF.get(s).hashCode() + i * 31)
            s = (String)iterator.next();

        return i;
    }

    public void setContext(Context context)
    {
        BitmapTeleporter bitmapteleporter = (BitmapTeleporter)zza(zzig.zzaak);
        if(bitmapteleporter != null)
            bitmapteleporter.zzc(context.getCacheDir());
    }

    public String toString()
    {
        return (new StringBuilder()).append("MetadataBundle [values=").append(zzZF).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    public Object zza(MetadataField metadatafield)
    {
        return metadatafield.zzi(zzZF);
    }

    public void zzb(MetadataField metadatafield, Object obj)
    {
        if(zze.zzcd(metadatafield.getName()) == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unregistered field: ").append(metadatafield.getName()).toString());
        } else
        {
            metadatafield.zza(obj, zzZF);
            return;
        }
    }

    public boolean zzc(MetadataField metadatafield)
    {
        return zzZF.containsKey(metadatafield.getName());
    }

    public Set zzol()
    {
        HashSet hashset = new HashSet();
        for(Iterator iterator = zzZF.keySet().iterator(); iterator.hasNext(); hashset.add(zze.zzcd((String)iterator.next())));
        return hashset;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzh();
    final Bundle zzZF;
    final int zzzH;

}
