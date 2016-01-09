// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive;

import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.drive:
//            FileUploadPreferences

public interface DrivePreferencesApi
{
    public static interface FileUploadPreferencesResult
        extends Result
    {

        public abstract FileUploadPreferences getFileUploadPreferences();
    }


    public abstract PendingResult getFileUploadPreferences(GoogleApiClient googleapiclient);

    public abstract PendingResult setFileUploadPreferences(GoogleApiClient googleapiclient, FileUploadPreferences fileuploadpreferences);
}
