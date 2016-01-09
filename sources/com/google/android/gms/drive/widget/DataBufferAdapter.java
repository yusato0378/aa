// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.widget;

import android.content.Context;
import android.database.CursorIndexOutOfBoundsException;
import android.view.*;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.drive.internal.zzx;
import java.util.*;

public class DataBufferAdapter extends BaseAdapter
{

    public DataBufferAdapter(Context context, int i)
    {
        this(context, i, 0, ((List) (new ArrayList())));
    }

    public DataBufferAdapter(Context context, int i, int j)
    {
        this(context, i, j, ((List) (new ArrayList())));
    }

    public DataBufferAdapter(Context context, int i, int j, List list)
    {
        zzacc = true;
        mContext = context;
        zzabY = i;
        zzabX = i;
        zzabZ = j;
        zzaca = list;
        zzacb = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    public transient DataBufferAdapter(Context context, int i, int j, DataBuffer adatabuffer[])
    {
        this(context, i, j, Arrays.asList(adatabuffer));
    }

    public DataBufferAdapter(Context context, int i, List list)
    {
        this(context, i, 0, list);
    }

    public transient DataBufferAdapter(Context context, int i, DataBuffer adatabuffer[])
    {
        this(context, i, 0, Arrays.asList(adatabuffer));
    }

    private View zza(int i, View view, ViewGroup viewgroup, int j)
    {
        if(view == null)
            view = zzacb.inflate(j, viewgroup, false);
        if(zzabZ != 0)
            break MISSING_BLOCK_LABEL_57;
        viewgroup = (TextView)view;
_L1:
        Object obj = getItem(i);
        if(obj instanceof CharSequence)
        {
            viewgroup.setText((CharSequence)obj);
            return view;
        } else
        {
            viewgroup.setText(obj.toString());
            return view;
        }
        try
        {
            viewgroup = (TextView)view.findViewById(zzabZ);
        }
        // Misplaced declaration of an exception variable
        catch(View view)
        {
            zzx.zza("DataBufferAdapter", view, "You must supply a resource ID for a TextView");
            throw new IllegalStateException("DataBufferAdapter requires the resource ID to be a TextView", view);
        }
          goto _L1
    }

    public void append(DataBuffer databuffer)
    {
        zzaca.add(databuffer);
        if(zzacc)
            notifyDataSetChanged();
    }

    public void clear()
    {
        for(Iterator iterator = zzaca.iterator(); iterator.hasNext(); ((DataBuffer)iterator.next()).release());
        zzaca.clear();
        if(zzacc)
            notifyDataSetChanged();
    }

    public Context getContext()
    {
        return mContext;
    }

    public int getCount()
    {
        Iterator iterator = zzaca.iterator();
        int i;
        for(i = 0; iterator.hasNext(); i = ((DataBuffer)iterator.next()).getCount() + i);
        return i;
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        return zza(i, view, viewgroup, zzabY);
    }

    public Object getItem(int i)
        throws CursorIndexOutOfBoundsException
    {
        Iterator iterator = zzaca.iterator();
        int j = i;
        while(iterator.hasNext()) 
        {
            DataBuffer databuffer = (DataBuffer)iterator.next();
            int k = databuffer.getCount();
            if(k <= j)
            {
                j -= k;
            } else
            {
                Object obj;
                try
                {
                    obj = databuffer.get(j);
                }
                catch(CursorIndexOutOfBoundsException cursorindexoutofboundsexception)
                {
                    throw new CursorIndexOutOfBoundsException(i, getCount());
                }
                return obj;
            }
        }
        throw new CursorIndexOutOfBoundsException(i, getCount());
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        return zza(i, view, viewgroup, zzabX);
    }

    public void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
        zzacc = true;
    }

    public void setDropDownViewResource(int i)
    {
        zzabY = i;
    }

    public void setNotifyOnChange(boolean flag)
    {
        zzacc = flag;
    }

    private final Context mContext;
    private final int zzabX;
    private int zzabY;
    private final int zzabZ;
    private final List zzaca;
    private final LayoutInflater zzacb;
    private boolean zzacc;
}
