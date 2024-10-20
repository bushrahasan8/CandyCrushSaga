package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* loaded from: zzeij.class */
public final class zzeij {
    private MeasurementManagerFutures zza;
    private final Context zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeij(Context context) {
        this.zzb = context;
    }

    public final ListenableFuture zza() {
        MeasurementManagerFutures from = MeasurementManagerFutures.from(this.zzb);
        this.zza = from;
        return from == null ? zzgen.zzg(new IllegalStateException("MeasurementManagerFutures is null")) : from.getMeasurementApiStatusAsync();
    }

    public final ListenableFuture zzb(Uri uri, InputEvent inputEvent) {
        MeasurementManagerFutures measurementManagerFutures = this.zza;
        Objects.requireNonNull(measurementManagerFutures);
        return measurementManagerFutures.registerSourceAsync(uri, inputEvent);
    }
}
