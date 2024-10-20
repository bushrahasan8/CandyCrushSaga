package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;

/* loaded from: SnapshotMetadata.class */
public interface SnapshotMetadata extends Freezable<SnapshotMetadata>, Parcelable {
    public static final long PLAYED_TIME_UNKNOWN = -1;
    public static final long PROGRESS_VALUE_UNKNOWN = -1;

    float getCoverImageAspectRatio();

    Uri getCoverImageUri();

    @Deprecated
    @KeepName
    String getCoverImageUrl();

    String getDescription();

    void getDescription(CharArrayBuffer charArrayBuffer);

    String getDeviceName();

    Game getGame();

    long getLastModifiedTimestamp();

    Player getOwner();

    long getPlayedTime();

    long getProgressValue();

    String getSnapshotId();

    String getUniqueName();

    boolean hasChangePending();

    String zza();
}
