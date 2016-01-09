// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzv;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//            zzmj

public class zzmo
{

    public zzmo()
    {
    }

    public String getId()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = zzaGZ.iterator();
        boolean flag = true;
        while(iterator.hasNext()) 
        {
            zzmj zzmj1 = (zzmj)iterator.next();
            if(flag)
                flag = false;
            else
                stringbuilder.append("#");
            stringbuilder.append(zzmj1.getContainerId());
        }
        return stringbuilder.toString();
    }

    public zzmo zzb(zzmj zzmj1)
        throws IllegalArgumentException
    {
        zzv.zzr(zzmj1);
        for(Iterator iterator = zzaGZ.iterator(); iterator.hasNext();)
            if(((zzmj)iterator.next()).getContainerId().equals(zzmj1.getContainerId()))
                throw new IllegalArgumentException((new StringBuilder()).append("The container is already being requested. ").append(zzmj1.getContainerId()).toString());

        zzaGZ.add(zzmj1);
        return this;
    }

    public List zzyl()
    {
        return zzaGZ;
    }

    private final List zzaGZ = new ArrayList();
}
