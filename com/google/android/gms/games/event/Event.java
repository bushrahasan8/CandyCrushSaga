package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.games.Player;

@VisibleForTesting
/* loaded from: Event.class */
public interface Event extends Freezable<Event>, Parcelable {
    String getDescription();

    void getDescription(CharArrayBuffer charArrayBuffer);

    String getEventId();

    String getFormattedValue();

    void getFormattedValue(CharArrayBuffer charArrayBuffer);

    Uri getIconImageUri();

    @Deprecated
    @KeepName
    String getIconImageUrl();

    String getName();

    void getName(CharArrayBuffer charArrayBuffer);

    Player getPlayer();

    long getValue();

    boolean isVisible();
}
