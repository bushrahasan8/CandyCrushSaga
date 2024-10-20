package com.google.android.gms.internal.play_games_inputmapping;

import com.ironsource.t2;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Locale;

/* loaded from: zzbe.class */
public final class zzbe {
    static final Locale zza = Locale.ROOT;

    /* JADX WARN: Multi-variable type inference failed */
    public static String zza(Object obj) {
        if (obj == null) {
            obj = "null";
        } else {
            try {
                if (obj.getClass().isArray()) {
                    obj = obj instanceof int[] ? Arrays.toString((int[]) obj) : obj instanceof long[] ? Arrays.toString((long[]) obj) : obj instanceof byte[] ? Arrays.toString((byte[]) obj) : obj instanceof char[] ? Arrays.toString((char[]) obj) : obj instanceof short[] ? Arrays.toString((short[]) obj) : obj instanceof float[] ? Arrays.toString((float[]) obj) : obj instanceof double[] ? Arrays.toString((double[]) obj) : obj instanceof boolean[] ? Arrays.toString((boolean[]) obj) : Arrays.toString((Object[]) obj);
                } else {
                    String obj2 = obj.toString();
                    obj = obj2 == null ? zzf(obj, "toString() returned null") : obj2;
                }
            } catch (RuntimeException e) {
                return zze(obj, e);
            }
        }
        return obj;
    }

    public static void zzb(Formattable formattable, StringBuilder sb, zzax zzaxVar) {
        int zzj = zzaxVar.zzj();
        int i = zzj & 162;
        int i2 = i;
        if (i != 0) {
            int i3 = 0;
            int i4 = (zzj & 32) != 0 ? 1 : 0;
            int i5 = (zzj & 128) != 0 ? 2 : 0;
            if ((zzj & 2) != 0) {
                i3 = 4;
            }
            i2 = i4 | i5 | i3;
        }
        int length = sb.length();
        Formatter formatter = new Formatter(sb, zza);
        try {
            formattable.formatTo(formatter, i2, zzaxVar.zzf(), zzaxVar.zzg());
        } catch (RuntimeException e) {
            sb.setLength(length);
            try {
                formatter.out().append(zze(formattable, e));
            } catch (IOException e2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzc(StringBuilder sb, Number number, zzax zzaxVar) {
        boolean zzk = zzaxVar.zzk();
        long longValue = number.longValue();
        if (number instanceof Long) {
            zzd(sb, longValue, zzk);
            return;
        }
        if (number instanceof Integer) {
            zzd(sb, longValue & 4294967295L, zzk);
            return;
        }
        if (number instanceof Byte) {
            zzd(sb, longValue & 255, zzk);
            return;
        }
        if (number instanceof Short) {
            zzd(sb, longValue & 65535, zzk);
            return;
        }
        if (!(number instanceof BigInteger)) {
            throw new IllegalStateException("unsupported number type: ".concat(String.valueOf(number.getClass())));
        }
        String bigInteger = ((BigInteger) number).toString(16);
        String str = bigInteger;
        if (zzk) {
            str = bigInteger.toUpperCase(zza);
        }
        sb.append(str);
    }

    private static void zzd(StringBuilder sb, long j, boolean z) {
        if (j == 0) {
            sb.append(t2.h);
            return;
        }
        String str = true != z ? "0123456789abcdef" : "0123456789ABCDEF";
        for (int numberOfLeadingZeros = (63 - Long.numberOfLeadingZeros(j)) & (-4); numberOfLeadingZeros >= 0; numberOfLeadingZeros -= 4) {
            sb.append(str.charAt((int) ((j >>> numberOfLeadingZeros) & 15)));
        }
    }

    private static String zze(Object obj, RuntimeException runtimeException) {
        String simpleName;
        try {
            simpleName = runtimeException.toString();
        } catch (RuntimeException e) {
            simpleName = e.getClass().getSimpleName();
        }
        return zzf(obj, simpleName);
    }

    private static String zzf(Object obj, String str) {
        String name = obj.getClass().getName();
        int identityHashCode = System.identityHashCode(obj);
        StringBuilder sb = new StringBuilder(name.length() + 16 + String.valueOf(str).length());
        sb.append("{");
        sb.append(name);
        sb.append("@");
        sb.append(identityHashCode);
        sb.append(": ");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
