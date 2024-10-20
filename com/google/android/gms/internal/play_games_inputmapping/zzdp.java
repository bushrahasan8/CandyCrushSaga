package com.google.android.gms.internal.play_games_inputmapping;

/* loaded from: zzdp.class */
public final class zzdp extends RuntimeException {
    private zzdp(String str, String str2) {
        super(str);
    }

    public static zzdp zza(String str, String str2, int i, int i2) {
        return new zzdp(zze(str, str2, i, i2), str2);
    }

    public static zzdp zzb(String str, String str2, int i) {
        return new zzdp(zze(str, str2, i, i + 1), str2);
    }

    public static zzdp zzc(String str, String str2, int i) {
        return new zzdp(zze(str, str2, i, -1), str2);
    }

    public static zzdp zzd(String str, String str2) {
        return new zzdp(str, str2);
    }

    private static String zze(String str, String str2, int i, int i2) {
        int i3 = i2;
        if (i2 < 0) {
            i3 = str2.length();
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(": ");
        if (i > 8) {
            sb.append("...");
            sb.append((CharSequence) str2, i - 5, i);
        } else {
            sb.append((CharSequence) str2, 0, i);
        }
        sb.append('[');
        sb.append(str2.substring(i, i3));
        sb.append(']');
        if (str2.length() - i3 > 8) {
            sb.append((CharSequence) str2, i3, i3 + 5);
            sb.append("...");
        } else {
            sb.append((CharSequence) str2, i3, str2.length());
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        synchronized (this) {
        }
        return this;
    }
}
