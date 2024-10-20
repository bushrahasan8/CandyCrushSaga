package com.google.android.gms.internal.play_games_inputmapping;

import java.util.logging.Level;

/* loaded from: zzck.class */
public final class zzck {
    public static String zza(String str, String str2, boolean z) {
        int i;
        char charAt;
        String str3 = str2;
        if (str2.length() > 23) {
            int length = str2.length();
            do {
                length--;
                i = -1;
                if (length >= 0) {
                    charAt = str2.charAt(length);
                    if (charAt == '.') {
                        break;
                    }
                } else {
                    break;
                }
            } while (charAt != '$');
            i = length;
            str3 = str2.substring(i + 1);
        }
        String concat = "".concat(String.valueOf(str3));
        return concat.substring(0, Math.min(concat.length(), 23));
    }

    public static int zzb(Level level) {
        int intValue = level.intValue();
        if (intValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (intValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (intValue >= Level.INFO.intValue()) {
            return 4;
        }
        return intValue >= Level.FINE.intValue() ? 3 : 2;
    }
}
