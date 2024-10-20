package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
/* loaded from: StockProfileImage.class */
public interface StockProfileImage extends Freezable<StockProfileImage>, Parcelable {
    String getImageUrl();

    Uri zza();
}
