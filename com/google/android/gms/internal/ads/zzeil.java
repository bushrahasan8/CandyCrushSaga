package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: zzeil.class */
public final class zzeil {
    private final Context zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeil(Context context) {
        this.zza = context;
    }

    public final ListenableFuture zza(boolean z) {
        GetTopicsRequest build = new GetTopicsRequest.Builder().setAdsSdkName(MobileAds.ERROR_DOMAIN).setShouldRecordObservation(z).build();
        TopicsManagerFutures from = TopicsManagerFutures.from(this.zza);
        return from != null ? from.getTopicsAsync(build) : zzgen.zzg(new IllegalStateException());
    }
}
