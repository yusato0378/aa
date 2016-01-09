// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.wearable:
//            zzc

public class Asset
    implements SafeParcelable
{

    Asset(int i, byte abyte0[], String s, ParcelFileDescriptor parcelfiledescriptor, Uri uri1)
    {
        zzzH = i;
        zzanX = abyte0;
        zzaKy = s;
        zzaKz = parcelfiledescriptor;
        uri = uri1;
    }

    public static Asset createFromBytes(byte abyte0[])
    {
        if(abyte0 == null)
            throw new IllegalArgumentException("Asset data cannot be null");
        else
            return new Asset(1, abyte0, null, null, null);
    }

    public static Asset createFromFd(ParcelFileDescriptor parcelfiledescriptor)
    {
        if(parcelfiledescriptor == null)
            throw new IllegalArgumentException("Asset fd cannot be null");
        else
            return new Asset(1, null, null, parcelfiledescriptor, null);
    }

    public static Asset createFromRef(String s)
    {
        if(s == null)
            throw new IllegalArgumentException("Asset digest cannot be null");
        else
            return new Asset(1, null, s, null, null);
    }

    public static Asset createFromUri(Uri uri1)
    {
        if(uri1 == null)
            throw new IllegalArgumentException("Asset uri cannot be null");
        else
            return new Asset(1, null, null, null, uri1);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this != obj)
        {
            if(!(obj instanceof Asset))
                return false;
            obj = (Asset)obj;
            if(!zzu.equal(zzanX, ((Asset) (obj)).zzanX) || !zzu.equal(zzaKy, ((Asset) (obj)).zzaKy) || !zzu.equal(zzaKz, ((Asset) (obj)).zzaKz) || !zzu.equal(uri, ((Asset) (obj)).uri))
                return false;
        }
        return true;
    }

    public byte[] getData()
    {
        return zzanX;
    }

    public String getDigest()
    {
        return zzaKy;
    }

    public ParcelFileDescriptor getFd()
    {
        return zzaKz;
    }

    public Uri getUri()
    {
        return uri;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzanX, zzaKy, zzaKz, uri
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Asset[@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        if(zzaKy == null)
        {
            stringbuilder.append(", nodigest");
        } else
        {
            stringbuilder.append(", ");
            stringbuilder.append(zzaKy);
        }
        if(zzanX != null)
        {
            stringbuilder.append(", size=");
            stringbuilder.append(zzanX.length);
        }
        if(zzaKz != null)
        {
            stringbuilder.append(", fd=");
            stringbuilder.append(zzaKz);
        }
        if(uri != null)
        {
            stringbuilder.append(", uri=");
            stringbuilder.append(uri);
        }
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i | 1);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    public Uri uri;
    private String zzaKy;
    public ParcelFileDescriptor zzaKz;
    private byte zzanX[];
    final int zzzH;

}
