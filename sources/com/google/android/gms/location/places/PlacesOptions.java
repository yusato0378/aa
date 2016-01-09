// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places;


public final class PlacesOptions
    implements com.google.android.gms.common.api.Api.ApiOptions.Optional
{
    public static class Builder
    {

        static String zza(Builder builder)
        {
            return builder.zzasd;
        }

        public PlacesOptions build()
        {
            return new PlacesOptions(this);
        }

        private String zzasd;

        public Builder()
        {
        }
    }


    private PlacesOptions(Builder builder)
    {
        zzasc = Builder.zza(builder);
    }


    public final String zzasc;
}
