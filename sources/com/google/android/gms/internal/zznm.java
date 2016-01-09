// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataMap;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//            zznn

public final class zznm
{
    public static class zza
    {

        public final zznn zzaMX;
        public final List zzaMY;

        public zza(zznn zznn1, List list)
        {
            zzaMX = zznn1;
            zzaMY = list;
        }
    }


    private static int zza(String s, zznn.zza.zza azza[])
    {
        int i;
        int j;
        int l;
        l = azza.length;
        i = 0;
        j = 14;
_L5:
        zznn.zza.zza zza1;
        if(i >= l)
            break MISSING_BLOCK_LABEL_184;
        zza1 = azza[i];
        if(j != 14) goto _L2; else goto _L1
_L1:
        if(zza1.type != 9 && zza1.type != 2 && zza1.type != 6) goto _L4; else goto _L3
_L3:
        int k = zza1.type;
_L7:
        i++;
        j = k;
          goto _L5
_L4:
        k = j;
        if(zza1.type == 14) goto _L7; else goto _L6
_L6:
        throw new IllegalArgumentException((new StringBuilder()).append("Unexpected TypedValue type: ").append(zza1.type).append(" for key ").append(s).toString());
_L2:
        k = j;
        if(zza1.type == j) goto _L7; else goto _L8
_L8:
        throw new IllegalArgumentException((new StringBuilder()).append("The ArrayList elements should all be the same type, but ArrayList with key ").append(s).append(" contains items of type ").append(j).append(" and ").append(zza1.type).toString());
        return j;
    }

    static int zza(List list, Asset asset)
    {
        list.add(asset);
        return list.size() - 1;
    }

    public static zza zza(DataMap datamap)
    {
        zznn zznn1 = new zznn();
        ArrayList arraylist = new ArrayList();
        zznn1.zzaMZ = zza(datamap, ((List) (arraylist)));
        return new zza(zznn1, arraylist);
    }

    private static zznn.zza.zza zza(List list, Object obj)
    {
        zznn.zza.zza zza1;
        zza1 = new zznn.zza.zza();
        if(obj == null)
        {
            zza1.type = 14;
            return zza1;
        }
        zza1.zzaNd = new zznn.zza.zza.zza();
        if(!(obj instanceof String)) goto _L2; else goto _L1
_L1:
        zza1.type = 2;
        zza1.zzaNd.zzaNf = (String)obj;
_L8:
        return zza1;
_L2:
        ArrayList arraylist;
        zznn.zza.zza azza1[];
        int j;
        int k;
        int l;
        if(obj instanceof Integer)
        {
            zza1.type = 6;
            zza1.zzaNd.zzaNj = ((Integer)obj).intValue();
            continue; /* Loop/switch isn't completed */
        }
        if(obj instanceof Long)
        {
            zza1.type = 5;
            zza1.zzaNd.zzaNi = ((Long)obj).longValue();
            continue; /* Loop/switch isn't completed */
        }
        if(obj instanceof Double)
        {
            zza1.type = 3;
            zza1.zzaNd.zzaNg = ((Double)obj).doubleValue();
            continue; /* Loop/switch isn't completed */
        }
        if(obj instanceof Float)
        {
            zza1.type = 4;
            zza1.zzaNd.zzaNh = ((Float)obj).floatValue();
            continue; /* Loop/switch isn't completed */
        }
        if(obj instanceof Boolean)
        {
            zza1.type = 8;
            zza1.zzaNd.zzaNl = ((Boolean)obj).booleanValue();
            continue; /* Loop/switch isn't completed */
        }
        if(obj instanceof Byte)
        {
            zza1.type = 7;
            zza1.zzaNd.zzaNk = ((Byte)obj).byteValue();
            continue; /* Loop/switch isn't completed */
        }
        if(obj instanceof byte[])
        {
            zza1.type = 1;
            zza1.zzaNd.zzaNe = (byte[])(byte[])obj;
            continue; /* Loop/switch isn't completed */
        }
        if(obj instanceof String[])
        {
            zza1.type = 11;
            zza1.zzaNd.zzaNo = (String[])(String[])obj;
            continue; /* Loop/switch isn't completed */
        }
        if(obj instanceof long[])
        {
            zza1.type = 12;
            zza1.zzaNd.zzaNp = (long[])(long[])obj;
            continue; /* Loop/switch isn't completed */
        }
        if(obj instanceof float[])
        {
            zza1.type = 15;
            zza1.zzaNd.zzaNq = (float[])(float[])obj;
            continue; /* Loop/switch isn't completed */
        }
        if(obj instanceof Asset)
        {
            zza1.type = 13;
            zza1.zzaNd.zzaNr = zza(list, (Asset)obj);
            continue; /* Loop/switch isn't completed */
        }
        if(obj instanceof DataMap)
        {
            zza1.type = 9;
            obj = (DataMap)obj;
            Object obj2 = ((DataMap) (obj)).keySet();
            zznn.zza azza[] = new zznn.zza[((Set) (obj2)).size()];
            obj2 = ((Set) (obj2)).iterator();
            for(int i = 0; ((Iterator) (obj2)).hasNext(); i++)
            {
                String s = (String)((Iterator) (obj2)).next();
                azza[i] = new zznn.zza();
                azza[i].name = s;
                azza[i].zzaNb = zza(list, ((DataMap) (obj)).get(s));
            }

            zza1.zzaNd.zzaNm = azza;
            continue; /* Loop/switch isn't completed */
        }
        if(!(obj instanceof ArrayList))
            break; /* Loop/switch isn't completed */
        zza1.type = 10;
        arraylist = (ArrayList)obj;
        azza1 = new zznn.zza.zza[arraylist.size()];
        obj = null;
        l = arraylist.size();
        k = 0;
        j = 14;
_L4:
        Object obj1;
        zznn.zza.zza zza2;
        if(k >= l)
            break MISSING_BLOCK_LABEL_740;
        obj1 = arraylist.get(k);
        zza2 = zza(list, obj1);
        if(zza2.type != 14 && zza2.type != 2 && zza2.type != 6 && zza2.type != 9)
            throw new IllegalArgumentException((new StringBuilder()).append("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a ").append(obj1.getClass()).toString());
        if(j != 14 || zza2.type == 14)
            break; /* Loop/switch isn't completed */
        j = zza2.type;
        obj = obj1;
_L6:
        azza1[k] = zza2;
        k++;
        if(true) goto _L4; else goto _L3
_L3:
        if(zza2.type == j) goto _L6; else goto _L5
_L5:
        throw new IllegalArgumentException((new StringBuilder()).append("ArrayList elements must all be of the sameclass, but this one contains a ").append(obj.getClass()).append(" and a ").append(obj1.getClass()).toString());
        zza1.zzaNd.zzaNn = azza1;
        if(true) goto _L8; else goto _L7
_L7:
        throw new RuntimeException((new StringBuilder()).append("newFieldValueFromValue: unexpected value ").append(obj.getClass().getSimpleName()).toString());
    }

    public static DataMap zza(zza zza1)
    {
        DataMap datamap = new DataMap();
        zznn.zza azza[] = zza1.zzaMX.zzaMZ;
        int j = azza.length;
        for(int i = 0; i < j; i++)
        {
            zznn.zza zza2 = azza[i];
            zza(zza1.zzaMY, datamap, zza2.name, zza2.zzaNb);
        }

        return datamap;
    }

    private static ArrayList zza(List list, zznn.zza.zza.zza zza1, int i)
    {
        ArrayList arraylist = new ArrayList(zza1.zzaNn.length);
        zza1 = zza1.zzaNn;
        int l = zza1.length;
        int j = 0;
        while(j < l) 
        {
            zznn.zza azza[] = zza1[j];
            if(((zznn.zza.zza) (azza)).type == 14)
                arraylist.add(null);
            else
            if(i == 9)
            {
                DataMap datamap = new DataMap();
                azza = ((zznn.zza.zza) (azza)).zzaNd.zzaNm;
                int i1 = azza.length;
                for(int k = 0; k < i1; k++)
                {
                    zznn.zza zza2 = azza[k];
                    zza(list, datamap, zza2.name, zza2.zzaNb);
                }

                arraylist.add(datamap);
            } else
            if(i == 2)
                arraylist.add(((zznn.zza.zza) (azza)).zzaNd.zzaNf);
            else
            if(i == 6)
                arraylist.add(Integer.valueOf(((zznn.zza.zza) (azza)).zzaNd.zzaNj));
            else
                throw new IllegalArgumentException((new StringBuilder()).append("Unexpected typeOfArrayList: ").append(i).toString());
            j++;
        }
        return arraylist;
    }

    private static void zza(List list, DataMap datamap, String s, zznn.zza.zza zza1)
    {
        int i = zza1.type;
        if(i == 14)
        {
            datamap.putString(s, null);
            return;
        }
        Object obj = zza1.zzaNd;
        if(i == 1)
        {
            datamap.putByteArray(s, ((zznn.zza.zza.zza) (obj)).zzaNe);
            return;
        }
        if(i == 11)
        {
            datamap.putStringArray(s, ((zznn.zza.zza.zza) (obj)).zzaNo);
            return;
        }
        if(i == 12)
        {
            datamap.putLongArray(s, ((zznn.zza.zza.zza) (obj)).zzaNp);
            return;
        }
        if(i == 15)
        {
            datamap.putFloatArray(s, ((zznn.zza.zza.zza) (obj)).zzaNq);
            return;
        }
        if(i == 2)
        {
            datamap.putString(s, ((zznn.zza.zza.zza) (obj)).zzaNf);
            return;
        }
        if(i == 3)
        {
            datamap.putDouble(s, ((zznn.zza.zza.zza) (obj)).zzaNg);
            return;
        }
        if(i == 4)
        {
            datamap.putFloat(s, ((zznn.zza.zza.zza) (obj)).zzaNh);
            return;
        }
        if(i == 5)
        {
            datamap.putLong(s, ((zznn.zza.zza.zza) (obj)).zzaNi);
            return;
        }
        if(i == 6)
        {
            datamap.putInt(s, ((zznn.zza.zza.zza) (obj)).zzaNj);
            return;
        }
        if(i == 7)
        {
            datamap.putByte(s, (byte)((zznn.zza.zza.zza) (obj)).zzaNk);
            return;
        }
        if(i == 8)
        {
            datamap.putBoolean(s, ((zznn.zza.zza.zza) (obj)).zzaNl);
            return;
        }
        if(i == 13)
            if(list == null)
            {
                throw new RuntimeException((new StringBuilder()).append("populateBundle: unexpected type for: ").append(s).toString());
            } else
            {
                datamap.putAsset(s, (Asset)list.get((int)((zznn.zza.zza.zza) (obj)).zzaNr));
                return;
            }
        if(i == 9)
        {
            zza1 = new DataMap();
            obj = ((zznn.zza.zza.zza) (obj)).zzaNm;
            int j = obj.length;
            for(i = 0; i < j; i++)
            {
                Object obj1 = obj[i];
                zza(list, ((DataMap) (zza1)), ((zznn.zza) (obj1)).name, ((zznn.zza) (obj1)).zzaNb);
            }

            datamap.putDataMap(s, zza1);
            return;
        }
        if(i == 10)
        {
            i = zza(s, ((zznn.zza.zza.zza) (obj)).zzaNn);
            list = zza(list, ((zznn.zza.zza.zza) (obj)), i);
            if(i == 14)
            {
                datamap.putStringArrayList(s, list);
                return;
            }
            if(i == 9)
            {
                datamap.putDataMapArrayList(s, list);
                return;
            }
            if(i == 2)
            {
                datamap.putStringArrayList(s, list);
                return;
            }
            if(i == 6)
            {
                datamap.putIntegerArrayList(s, list);
                return;
            } else
            {
                throw new IllegalStateException((new StringBuilder()).append("Unexpected typeOfArrayList: ").append(i).toString());
            }
        } else
        {
            throw new RuntimeException((new StringBuilder()).append("populateBundle: unexpected type ").append(i).toString());
        }
    }

    private static zznn.zza[] zza(DataMap datamap, List list)
    {
        Object obj = datamap.keySet();
        zznn.zza azza[] = new zznn.zza[((Set) (obj)).size()];
        obj = ((Set) (obj)).iterator();
        for(int i = 0; ((Iterator) (obj)).hasNext(); i++)
        {
            String s = (String)((Iterator) (obj)).next();
            Object obj1 = datamap.get(s);
            azza[i] = new zznn.zza();
            azza[i].name = s;
            azza[i].zzaNb = zza(list, obj1);
        }

        return azza;
    }
}
