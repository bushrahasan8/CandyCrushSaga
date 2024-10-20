package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* loaded from: zzgcj.class */
public final class zzgcj implements FilenameFilter {
    private final Pattern zza;

    public zzgcj(Pattern pattern) {
        pattern.getClass();
        this.zza = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.zza.matcher(str).matches();
    }
}
