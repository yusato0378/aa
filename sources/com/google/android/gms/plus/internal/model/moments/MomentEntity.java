// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;
import java.util.*;

// Referenced classes of package com.google.android.gms.plus.internal.model.moments:
//            zzb, ItemScopeEntity

public final class MomentEntity extends FastSafeParcelableJsonResponse
    implements Moment
{

    public MomentEntity()
    {
        zzzH = 1;
        zzazD = new HashSet();
    }

    MomentEntity(Set set, int i, String s, ItemScopeEntity itemscopeentity, String s1, ItemScopeEntity itemscopeentity1, String s2)
    {
        zzazD = set;
        zzzH = i;
        zzGM = s;
        zzaAy = itemscopeentity;
        zzaAq = s1;
        zzaAz = itemscopeentity1;
        zzAV = s2;
    }

    public MomentEntity(Set set, String s, ItemScopeEntity itemscopeentity, String s1, ItemScopeEntity itemscopeentity1, String s2)
    {
        zzazD = set;
        zzzH = 1;
        zzGM = s;
        zzaAy = itemscopeentity;
        zzaAq = s1;
        zzaAz = itemscopeentity1;
        zzAV = s2;
    }

    public int describeContents()
    {
        zzb zzb1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if(!(obj instanceof MomentEntity))
                return false;
            if(this == obj)
                return true;
            obj = (MomentEntity)obj;
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
label1:
            do
            {
                for(Iterator iterator = zzazC.values().iterator(); iterator.hasNext();)
                {
                    field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                    if(!zza(field))
                        continue label1;
                    if(((MomentEntity) (obj)).zza(field))
                    {
                        if(!zzb(field).equals(((MomentEntity) (obj)).zzb(field)))
                            return false;
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while(!((MomentEntity) (obj)).zza(field));
            return false;
        }
        return true;
    }

    public Object freeze()
    {
        return zzvN();
    }

    public String getId()
    {
        return zzGM;
    }

    public ItemScope getResult()
    {
        return zzaAy;
    }

    public String getStartDate()
    {
        return zzaAq;
    }

    public ItemScope getTarget()
    {
        return zzaAz;
    }

    public String getType()
    {
        return zzAV;
    }

    public boolean hasId()
    {
        return zzazD.contains(Integer.valueOf(2));
    }

    public boolean hasResult()
    {
        return zzazD.contains(Integer.valueOf(4));
    }

    public boolean hasStartDate()
    {
        return zzazD.contains(Integer.valueOf(5));
    }

    public boolean hasTarget()
    {
        return zzazD.contains(Integer.valueOf(6));
    }

    public boolean hasType()
    {
        return zzazD.contains(Integer.valueOf(7));
    }

    public int hashCode()
    {
        Iterator iterator = zzazC.values().iterator();
        int i = 0;
        do
        {
            if(!iterator.hasNext())
                break;
            com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if(zza(field))
            {
                int j = field.zzmF();
                i = zzb(field).hashCode() + (i + j);
            }
        } while(true);
        return i;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb zzb1 = CREATOR;
        com.google.android.gms.plus.internal.model.moments.zzb.zza(this, parcel, i);
    }

    protected boolean zza(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        return zzazD.contains(Integer.valueOf(field.zzmF()));
    }

    protected Object zzb(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        switch(field.zzmF())
        {
        case 3: // '\003'
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(field.zzmF()).toString());

        case 2: // '\002'
            return zzGM;

        case 4: // '\004'
            return zzaAy;

        case 5: // '\005'
            return zzaAq;

        case 6: // '\006'
            return zzaAz;

        case 7: // '\007'
            return zzAV;
        }
    }

    public Map zzmy()
    {
        return zzvL();
    }

    public HashMap zzvL()
    {
        return zzazC;
    }

    public MomentEntity zzvN()
    {
        return this;
    }

    public static final zzb CREATOR = new zzb();
    private static final HashMap zzazC;
    String zzAV;
    String zzGM;
    String zzaAq;
    ItemScopeEntity zzaAy;
    ItemScopeEntity zzaAz;
    final Set zzazD;
    final int zzzH;

    static 
    {
        zzazC = new HashMap();
        zzazC.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("id", 2));
        zzazC.put("result", com.google.android.gms.common.server.response.FastJsonResponse.Field.zza("result", 4, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        zzazC.put("startDate", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("startDate", 5));
        zzazC.put("target", com.google.android.gms.common.server.response.FastJsonResponse.Field.zza("target", 6, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        zzazC.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("type", 7));
    }
}
