package com.google.android.gms.games.snapshot;

import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

/* loaded from: Snapshot.class */
public interface Snapshot extends Freezable<Snapshot>, Parcelable {
    SnapshotMetadata getMetadata();

    SnapshotContents getSnapshotContents();
}
