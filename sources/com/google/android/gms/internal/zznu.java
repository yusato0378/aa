// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zznv

class zznu
    implements Cloneable
{

    public zznu()
    {
        this(10);
    }

    public zznu(int i)
    {
        zzaNM = false;
        i = idealIntArraySize(i);
        zzaNN = new int[i];
        zzaNO = new zznv[i];
        mSize = 0;
    }

    private void gc()
    {
        int l = mSize;
        int ai[] = zzaNN;
        zznv azznv[] = zzaNO;
        int i = 0;
        int j;
        int k;
        for(j = 0; i < l; j = k)
        {
            zznv zznv1 = azznv[i];
            k = j;
            if(zznv1 != zzaNL)
            {
                if(i != j)
                {
                    ai[j] = ai[i];
                    azznv[j] = zznv1;
                    azznv[i] = null;
                }
                k = j + 1;
            }
            i++;
        }

        zzaNM = false;
        mSize = j;
    }

    private int idealByteArraySize(int i)
    {
        int j = 4;
        do
        {
label0:
            {
                int k = i;
                if(j < 32)
                {
                    if(i > (1 << j) - 12)
                        break label0;
                    k = (1 << j) - 12;
                }
                return k;
            }
            j++;
        } while(true);
    }

    private int idealIntArraySize(int i)
    {
        return idealByteArraySize(i * 4) / 4;
    }

    private boolean zza(int ai[], int ai1[], int i)
    {
        for(int j = 0; j < i; j++)
            if(ai[j] != ai1[j])
                return false;

        return true;
    }

    private boolean zza(zznv azznv[], zznv azznv1[], int i)
    {
        for(int j = 0; j < i; j++)
            if(!azznv[j].equals(azznv1[j]))
                return false;

        return true;
    }

    private int zzjE(int i)
    {
        int j = 0;
        for(int k = mSize - 1; j <= k;)
        {
            int l = j + k >>> 1;
            int i1 = zzaNN[l];
            if(i1 < i)
                j = l + 1;
            else
            if(i1 > i)
                k = l - 1;
            else
                return l;
        }

        return ~j;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return zzzS();
    }

    public boolean equals(Object obj)
    {
        if(obj != this)
        {
            if(!(obj instanceof zznu))
                return false;
            obj = (zznu)obj;
            if(size() != ((zznu) (obj)).size())
                return false;
            if(!zza(zzaNN, ((zznu) (obj)).zzaNN, mSize) || !zza(zzaNO, ((zznu) (obj)).zzaNO, mSize))
                return false;
        }
        return true;
    }

    public int hashCode()
    {
        if(zzaNM)
            gc();
        int j = 17;
        for(int i = 0; i < mSize; i++)
            j = (j * 31 + zzaNN[i]) * 31 + zzaNO[i].hashCode();

        return j;
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public int size()
    {
        if(zzaNM)
            gc();
        return mSize;
    }

    public void zza(int i, zznv zznv1)
    {
        int j = zzjE(i);
        if(j >= 0)
        {
            zzaNO[j] = zznv1;
            return;
        }
        int k = ~j;
        if(k < mSize && zzaNO[k] == zzaNL)
        {
            zzaNN[k] = i;
            zzaNO[k] = zznv1;
            return;
        }
        j = k;
        if(zzaNM)
        {
            j = k;
            if(mSize >= zzaNN.length)
            {
                gc();
                j = ~zzjE(i);
            }
        }
        if(mSize >= zzaNN.length)
        {
            int l = idealIntArraySize(mSize + 1);
            int ai[] = new int[l];
            zznv azznv[] = new zznv[l];
            System.arraycopy(zzaNN, 0, ai, 0, zzaNN.length);
            System.arraycopy(zzaNO, 0, azznv, 0, zzaNO.length);
            zzaNN = ai;
            zzaNO = azznv;
        }
        if(mSize - j != 0)
        {
            System.arraycopy(zzaNN, j, zzaNN, j + 1, mSize - j);
            System.arraycopy(zzaNO, j, zzaNO, j + 1, mSize - j);
        }
        zzaNN[j] = i;
        zzaNO[j] = zznv1;
        mSize = mSize + 1;
    }

    public zznv zzjC(int i)
    {
        i = zzjE(i);
        if(i < 0 || zzaNO[i] == zzaNL)
            return null;
        else
            return zzaNO[i];
    }

    public zznv zzjD(int i)
    {
        if(zzaNM)
            gc();
        return zzaNO[i];
    }

    public final zznu zzzS()
    {
        int i = 0;
        int j = size();
        zznu zznu1 = new zznu(j);
        System.arraycopy(zzaNN, 0, zznu1.zzaNN, 0, j);
        for(; i < j; i++)
            if(zzaNO[i] != null)
                zznu1.zzaNO[i] = zzaNO[i].zzzT();

        zznu1.mSize = j;
        return zznu1;
    }

    private static final zznv zzaNL = new zznv();
    private int mSize;
    private boolean zzaNM;
    private int zzaNN[];
    private zznv zzaNO[];

}
