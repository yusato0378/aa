// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.wearable.DataItemBuffer;
import java.util.*;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            CapabilityInfoParcelable, AddLocalCapabilityResponse, zzbg, zza, 
//            CloseChannelResponse, DeleteDataItemsResponse, GetAllCapabilitiesResponse, GetCapabilityResponse, 
//            zzq, GetChannelInputStreamResponse, zzm, GetChannelOutputStreamResponse, 
//            zzn, GetConnectedNodesResponse, GetDataItemResponse, GetFdForAssetResponse, 
//            GetLocalNodeResponse, OpenChannelResponse, PutDataResponse, ChannelSendFileResponse, 
//            RemoveLocalCapabilityResponse, SendMessageResponse, ChannelReceiveFileResponse

final class zzbj
{
    static final class zza extends zzb
    {

        public void zza(AddLocalCapabilityResponse addlocalcapabilityresponse)
        {
            zzL(new zzg.zzb(zzbg.zzeJ(addlocalcapabilityresponse.statusCode)));
        }

        public zza(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static abstract class zzb extends com.google.android.gms.wearable.internal.zza
    {

        public void zzL(Object obj)
        {
            com.google.android.gms.common.api.zza.zzb zzb1 = zzJS;
            if(zzb1 != null)
            {
                zzb1.zzj(obj);
                zzJS = null;
            }
        }

        private com.google.android.gms.common.api.zza.zzb zzJS;

        public zzb(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzJS = zzb1;
        }
    }

    static final class zzc extends zzb
    {

        public void zza(CloseChannelResponse closechannelresponse)
        {
            zzL(new Status(closechannelresponse.statusCode));
        }

        public zzc(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzd extends zzb
    {

        public void zzb(CloseChannelResponse closechannelresponse)
        {
            zzL(new Status(closechannelresponse.statusCode));
        }

        public zzd(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zze extends zzb
    {

        public void zza(DeleteDataItemsResponse deletedataitemsresponse)
        {
            zzL(new zzu.zzc(zzbg.zzeJ(deletedataitemsresponse.statusCode), deletedataitemsresponse.zzaMc));
        }

        public zze(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzf extends zzb
    {

        public void zza(GetAllCapabilitiesResponse getallcapabilitiesresponse)
        {
            zzL(new zzg.zzd(zzbg.zzeJ(getallcapabilitiesresponse.statusCode), zzbj.zzx(getallcapabilitiesresponse.zzaMd)));
        }

        public zzf(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzg extends zzb
    {

        public void zza(GetCapabilityResponse getcapabilityresponse)
        {
            zzL(new zzg.zze(zzbg.zzeJ(getcapabilityresponse.statusCode), new zzg.zzc(getcapabilityresponse.zzaMe)));
        }

        public zzg(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzh extends zzb
    {

        public void zza(GetChannelInputStreamResponse getchannelinputstreamresponse)
        {
            com.google.android.gms.wearable.internal.zzm zzm1 = null;
            if(getchannelinputstreamresponse.zzaMf != null)
            {
                zzm1 = new com.google.android.gms.wearable.internal.zzm(new android.os.ParcelFileDescriptor.AutoCloseInputStream(getchannelinputstreamresponse.zzaMf));
                zzaME.zza(zzm1.zzzi());
            }
            zzL(new ChannelImpl.zza(new Status(getchannelinputstreamresponse.statusCode), zzm1));
        }

        private final com.google.android.gms.wearable.internal.zzq zzaME;

        public zzh(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.wearable.internal.zzq zzq1)
        {
            super(zzb1);
            zzaME = (com.google.android.gms.wearable.internal.zzq)zzv.zzr(zzq1);
        }
    }

    static final class zzi extends zzb
    {

        public void zza(GetChannelOutputStreamResponse getchanneloutputstreamresponse)
        {
            com.google.android.gms.wearable.internal.zzn zzn1 = null;
            if(getchanneloutputstreamresponse.zzaMf != null)
            {
                zzn1 = new com.google.android.gms.wearable.internal.zzn(new android.os.ParcelFileDescriptor.AutoCloseOutputStream(getchanneloutputstreamresponse.zzaMf));
                zzaME.zza(zzn1.zzzi());
            }
            zzL(new ChannelImpl.zzb(new Status(getchanneloutputstreamresponse.statusCode), zzn1));
        }

        private final com.google.android.gms.wearable.internal.zzq zzaME;

        public zzi(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.wearable.internal.zzq zzq1)
        {
            super(zzb1);
            zzaME = (com.google.android.gms.wearable.internal.zzq)zzv.zzr(zzq1);
        }
    }

    static final class zzj extends zzb
    {

        public void zza(GetConnectedNodesResponse getconnectednodesresponse)
        {
            ArrayList arraylist = new ArrayList();
            arraylist.addAll(getconnectednodesresponse.zzaMj);
            zzL(new zzax.zzb(zzbg.zzeJ(getconnectednodesresponse.statusCode), arraylist));
        }

        public zzj(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzk extends zzb
    {

        public void zza(GetDataItemResponse getdataitemresponse)
        {
            zzL(new zzu.zzb(zzbg.zzeJ(getdataitemresponse.statusCode), getdataitemresponse.zzaMk));
        }

        public zzk(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzl extends zzb
    {

        public void zzad(DataHolder dataholder)
        {
            zzL(new DataItemBuffer(dataholder));
        }

        public zzl(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzm extends zzb
    {

        public void zza(GetFdForAssetResponse getfdforassetresponse)
        {
            zzL(new zzu.zzd(zzbg.zzeJ(getfdforassetresponse.statusCode), getfdforassetresponse.zzaMl));
        }

        public zzm(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzn extends zzb
    {

        public void zza(GetLocalNodeResponse getlocalnoderesponse)
        {
            zzL(new zzax.zzc(zzbg.zzeJ(getlocalnoderesponse.statusCode), getlocalnoderesponse.zzaMm));
        }

        public zzn(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzo extends com.google.android.gms.wearable.internal.zza
    {

        public void zza(Status status)
        {
        }

        zzo()
        {
        }
    }

    static final class zzp extends zzb
    {

        public void zza(OpenChannelResponse openchannelresponse)
        {
            zzL(new zzi.zzb(zzbg.zzeJ(openchannelresponse.statusCode), openchannelresponse.zzaLB));
        }

        public zzp(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzq extends zzb
    {

        public void zza(PutDataResponse putdataresponse)
        {
            zzL(new zzu.zzb(zzbg.zzeJ(putdataresponse.statusCode), putdataresponse.zzaMk));
            if(putdataresponse.statusCode != 0)
                for(putdataresponse = zztP.iterator(); putdataresponse.hasNext(); ((FutureTask)putdataresponse.next()).cancel(true));
        }

        private final List zztP;

        zzq(com.google.android.gms.common.api.zza.zzb zzb1, List list)
        {
            super(zzb1);
            zztP = list;
        }
    }

    static final class zzr extends zzb
    {

        public void zza(ChannelSendFileResponse channelsendfileresponse)
        {
            zzL(new Status(channelsendfileresponse.statusCode));
        }

        public zzr(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzs extends zzb
    {

        public void zza(RemoveLocalCapabilityResponse removelocalcapabilityresponse)
        {
            zzL(new zzg.zzb(zzbg.zzeJ(removelocalcapabilityresponse.statusCode)));
        }

        public zzs(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzt extends zzb
    {

        public void zza(SendMessageResponse sendmessageresponse)
        {
            zzL(new zzav.zzb(zzbg.zzeJ(sendmessageresponse.statusCode), sendmessageresponse.zzaMB));
        }

        public zzt(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }

    static final class zzu extends zzb
    {

        public void zza(ChannelReceiveFileResponse channelreceivefileresponse)
        {
            zzL(new Status(channelreceivefileresponse.statusCode));
        }

        public zzu(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
        }
    }


    private static Map zzw(List list)
    {
        HashMap hashmap = new HashMap(list.size() * 2);
        CapabilityInfoParcelable capabilityinfoparcelable;
        for(list = list.iterator(); list.hasNext(); hashmap.put(capabilityinfoparcelable.getName(), new zzg.zzc(capabilityinfoparcelable)))
            capabilityinfoparcelable = (CapabilityInfoParcelable)list.next();

        return hashmap;
    }

    static Map zzx(List list)
    {
        return zzw(list);
    }
}
