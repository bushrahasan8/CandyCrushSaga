package com.google.android.gms.internal.play_games_inputmapping;

/* loaded from: zzds.class */
public final class zzds {
    public static Object zza(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str.concat(" must not be null"));
    }

    public static void zzb(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static String zzc(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("identifier must not be empty");
        }
        if (!zzd(str.charAt(0))) {
            throw new IllegalArgumentException(str.length() != 0 ? "identifier must start with an ASCII letter: ".concat(str) : new String("identifier must start with an ASCII letter: "));
        }
        for (int i = 1; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!zzd(charAt) && ((charAt < '0' || charAt > '9') && charAt != '_')) {
                throw new IllegalArgumentException(str.length() != 0 ? "identifier must contain only ASCII letters, digits or underscore: ".concat(str) : new String("identifier must contain only ASCII letters, digits or underscore: "));
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r3 > 'z') goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean zzd(char r3) {
        /*
            r0 = 1
            r5 = r0
            r0 = r3
            r1 = 97
            if (r0 < r1) goto L10
            r0 = r5
            r4 = r0
            r0 = r3
            r1 = 122(0x7a, float:1.71E-43)
            if (r0 <= r1) goto L25
        L10:
            r0 = r3
            r1 = 65
            if (r0 < r1) goto L23
            r0 = r3
            r1 = 90
            if (r0 > r1) goto L21
            r0 = r5
            r4 = r0
            goto L25
        L21:
            r0 = 0
            return r0
        L23:
            r0 = 0
            r4 = r0
        L25:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_games_inputmapping.zzds.zzd(char):boolean");
    }
}
