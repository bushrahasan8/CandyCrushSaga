package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: zzcq.class */
public abstract class zzcq {
    private static zzcq zza = new zzcp();

    public static zzcq zza() {
        zzcq zzcqVar;
        synchronized (zzcq.class) {
            try {
                zzcqVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzcqVar;
    }

    public abstract URLConnection zza(URL url, String str) throws IOException;
}
