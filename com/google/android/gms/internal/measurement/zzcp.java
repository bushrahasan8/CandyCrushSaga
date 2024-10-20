package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: zzcp.class */
final class zzcp extends zzcq {
    private zzcp() {
    }

    @Override // com.google.android.gms.internal.measurement.zzcq
    public final URLConnection zza(URL url, String str) throws IOException {
        return url.openConnection();
    }
}
