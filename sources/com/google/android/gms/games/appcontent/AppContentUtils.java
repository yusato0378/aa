// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.zzhq;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentActionRef, AppContentAnnotationRef, AppContentConditionRef, AppContentTupleRef, 
//            AppContentTuple

public final class AppContentUtils
{
    private static interface AppContentRunner
    {

        public abstract void zzb(ArrayList arraylist, int i);
    }


    public AppContentUtils()
    {
    }

    public static ArrayList zza(DataHolder dataholder, ArrayList arraylist, String s, int i)
    {
        ArrayList arraylist1 = new ArrayList();
        zza(dataholder, 1, s, "action_id", i, new AppContentRunner(arraylist1) {

            public void zzb(ArrayList arraylist2, int j)
            {
                zzahB.add(new AppContentActionRef(arraylist2, j));
            }

            final ArrayList zzahB;

            
            {
                zzahB = arraylist;
                super();
            }
        }
, arraylist);
        return arraylist1;
    }

    private static void zza(DataHolder dataholder, int i, String s, String s1, int j, AppContentRunner appcontentrunner, ArrayList arraylist)
    {
        DataHolder dataholder1 = (DataHolder)arraylist.get(i);
        dataholder = dataholder.zzd(s, j, dataholder.zzaD(j));
        if(!TextUtils.isEmpty(dataholder))
        {
            j = dataholder1.getCount();
            dataholder = dataholder.split(",");
            for(i = 0; i < j; i++)
            {
                s = dataholder1.zzd(s1, i, dataholder1.zzaD(i));
                if(!TextUtils.isEmpty(s) && zzhq.zzb(dataholder, s))
                    appcontentrunner.zzb(arraylist, i);
            }

        }
    }

    public static ArrayList zzb(DataHolder dataholder, ArrayList arraylist, String s, int i)
    {
        ArrayList arraylist1 = new ArrayList();
        zza(dataholder, 2, s, "annotation_id", i, new AppContentRunner(arraylist1) {

            public void zzb(ArrayList arraylist2, int j)
            {
                zzahB.add(new AppContentAnnotationRef(arraylist2, j));
            }

            final ArrayList zzahB;

            
            {
                zzahB = arraylist;
                super();
            }
        }
, arraylist);
        return arraylist1;
    }

    public static ArrayList zzc(DataHolder dataholder, ArrayList arraylist, String s, int i)
    {
        ArrayList arraylist1 = new ArrayList();
        zza(dataholder, 4, s, "condition_id", i, new AppContentRunner(arraylist1) {

            public void zzb(ArrayList arraylist2, int j)
            {
                zzahB.add(new AppContentConditionRef(arraylist2, j));
            }

            final ArrayList zzahB;

            
            {
                zzahB = arraylist;
                super();
            }
        }
, arraylist);
        return arraylist1;
    }

    public static Bundle zzd(DataHolder dataholder, ArrayList arraylist, String s, int i)
    {
        Bundle bundle = new Bundle();
        zza(dataholder, 3, s, "tuple_id", i, new AppContentRunner((DataHolder)arraylist.get(3), bundle) {

            public void zzb(ArrayList arraylist1, int j)
            {
                arraylist1 = new AppContentTupleRef(zzahC, j);
                zzahD.putString(arraylist1.getName(), arraylist1.getValue());
            }

            final DataHolder zzahC;
            final Bundle zzahD;

            
            {
                zzahC = dataholder;
                zzahD = bundle;
                super();
            }
        }
, arraylist);
        return bundle;
    }
}
