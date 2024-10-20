package com.google.android.gms.internal.play_games_inputmapping;

/* loaded from: zzdq.class */
public class zzdq extends zzdo {
    private static final String zza;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000e, code lost:
    
        if (r4.matches("\\n|\\r(?:\\n)?") == false) goto L4;
     */
    static {
        /*
            java.lang.String r0 = "line.separator"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L19
            r4 = r0
            r0 = r4
            java.lang.String r1 = "\\n|\\r(?:\\n)?"
            boolean r0 = r0.matches(r1)     // Catch: java.lang.SecurityException -> L19
            r3 = r0
            r0 = r3
            if (r0 != 0) goto L14
        L11:
            java.lang.String r0 = "\n"
            r4 = r0
        L14:
            r0 = r4
            com.google.android.gms.internal.play_games_inputmapping.zzdq.zza = r0
            return
        L19:
            r4 = move-exception
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_games_inputmapping.zzdq.m2280clinit():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(String str, int i) throws zzdp {
        while (i < str.length()) {
            int i2 = i + 1;
            if (str.charAt(i) != '%') {
                i = i2;
            } else {
                if (i2 >= str.length()) {
                    throw zzdp.zzc("trailing unquoted '%' character", str, i);
                }
                char charAt = str.charAt(i2);
                if (charAt != '%' && charAt != 'n') {
                    return i;
                }
                i += 2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdo
    public final void zzb(StringBuilder sb, String str, int i, int i2) {
        int i3 = i;
        while (i < i2) {
            int i4 = i + 1;
            if (str.charAt(i) == '%') {
                if (i4 == i2) {
                    break;
                }
                char charAt = str.charAt(i4);
                if (charAt == '%') {
                    sb.append((CharSequence) str, i3, i4);
                } else if (charAt == 'n') {
                    sb.append((CharSequence) str, i3, i);
                    sb.append(zza);
                }
                i3 = i + 2;
                i = i3;
            }
            i = i4;
        }
        if (i3 < i2) {
            sb.append((CharSequence) str, i3, i2);
        }
    }
}
