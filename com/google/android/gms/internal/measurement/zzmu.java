package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: zzmu.class */
public final class zzmu extends RuntimeException {
    private final List<String> zza;

    public zzmu(zzlg zzlgVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.zza = null;
    }
}
