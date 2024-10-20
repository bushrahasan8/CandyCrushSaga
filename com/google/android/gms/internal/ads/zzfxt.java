package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: zzfxt.class */
public final class zzfxt {
    public static String zza(String str) {
        String str2 = str;
        if (zzfxd.zza(str)) {
            str2 = null;
        }
        return str2;
    }

    public static String zzb(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i = 0;
        while (true) {
            length = objArr.length;
            if (i >= length) {
                break;
            }
            Object obj = objArr[i];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e) {
                    String str3 = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str3), (Throwable) e);
                    str2 = "<" + str3 + " threw " + e.getClass().getName() + ">";
                }
            }
            objArr[i] = str2;
            i++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i3 >= length2 || (indexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, indexOf);
            sb.append(objArr[i3]);
            i2 = indexOf + 2;
            i3++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i3 < length2) {
            sb.append(" [");
            sb.append(objArr[i3]);
            for (int i4 = i3 + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String zzc(String str) {
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        return str2;
    }

    public static boolean zzd(String str) {
        return zzfxd.zza(str);
    }
}
