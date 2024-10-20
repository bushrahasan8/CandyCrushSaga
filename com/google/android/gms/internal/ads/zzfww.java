package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: zzfww.class */
public final class zzfww {
    private final String zza;
    private final zzfwu zzb;
    private zzfwu zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfww(String str, zzfwv zzfwvVar) {
        zzfwu zzfwuVar = new zzfwu();
        this.zzb = zzfwuVar;
        this.zzc = zzfwuVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzfwu zzfwuVar = this.zzb.zzb;
        String str = "";
        while (true) {
            String str2 = str;
            if (zzfwuVar == null) {
                sb.append('}');
                return sb.toString();
            }
            Object obj = zzfwuVar.zza;
            sb.append(str2);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            zzfwuVar = zzfwuVar.zzb;
            str = ", ";
        }
    }

    public final zzfww zza(Object obj) {
        zzfwu zzfwuVar = new zzfwu();
        this.zzc.zzb = zzfwuVar;
        this.zzc = zzfwuVar;
        zzfwuVar.zza = obj;
        return this;
    }
}
