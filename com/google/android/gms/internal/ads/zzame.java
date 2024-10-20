package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzame.class */
public final class zzame {
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final Set zzd;

    private zzame(String str, int i, String str2, Set set) {
        this.zzb = i;
        this.zza = str;
        this.zzc = str2;
        this.zzd = set;
    }

    public static zzame zza(String str, int i) {
        String trim;
        String trim2 = str.trim();
        zzek.zzd(!trim2.isEmpty());
        int indexOf = trim2.indexOf(" ");
        if (indexOf == -1) {
            trim = "";
        } else {
            trim = trim2.substring(indexOf).trim();
            trim2 = trim2.substring(0, indexOf);
        }
        int i2 = zzfy.zza;
        String[] split = trim2.split("\\.", -1);
        String str2 = split[0];
        HashSet hashSet = new HashSet();
        for (int i3 = 1; i3 < split.length; i3++) {
            hashSet.add(split[i3]);
        }
        return new zzame(str2, i, trim, hashSet);
    }

    public static zzame zzb() {
        return new zzame("", 0, "", Collections.emptySet());
    }
}
