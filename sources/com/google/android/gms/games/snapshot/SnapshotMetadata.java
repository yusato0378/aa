// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;

public interface SnapshotMetadata
    extends Parcelable, Freezable
{

    public abstract float getCoverImageAspectRatio();

    public abstract Uri getCoverImageUri();

    public abstract String getCoverImageUrl();

    public abstract String getDescription();

    public abstract void getDescription(CharArrayBuffer chararraybuffer);

    public abstract Game getGame();

    public abstract long getLastModifiedTimestamp();

    public abstract Player getOwner();

    public abstract long getPlayedTime();

    public abstract long getProgressValue();

    public abstract String getSnapshotId();

    public abstract String getTitle();

    public abstract String getUniqueName();

    public abstract boolean hasChangePending();

    public static final long PLAYED_TIME_UNKNOWN = -1L;
    public static final long PROGRESS_VALUE_UNKNOWN = -1L;
}
