package com.google.android.gms.internal.play_games_inputmapping;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: zzaz.class */
public final class zzaz implements zzaq {
    private static final Set zza = new HashSet(Arrays.asList(Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class));
    private final StringBuilder zzd;
    private boolean zze = false;
    private final String zzb = "[CONTEXT ";
    private final String zzc = " ]";

    public zzaz(String str, String str2, StringBuilder sb) {
        this.zzd = sb;
    }

    private static int zzc(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt == '\"' || charAt == '\\') {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzaq
    public final void zza(String str, @NullableDecl Object obj) {
        char c;
        char c2 = ' ';
        if (this.zze) {
            this.zzd.append(' ');
        } else {
            if (this.zzd.length() > 0) {
                StringBuilder sb = this.zzd;
                if (sb.length() > 1000 || this.zzd.indexOf("\n") != -1) {
                    c2 = '\n';
                }
                sb.append(c2);
            }
            this.zzd.append(this.zzb);
            this.zze = true;
        }
        StringBuilder sb2 = this.zzd;
        sb2.append(str);
        sb2.append('=');
        if (obj == null) {
            sb2.append(true);
            return;
        }
        if (zza.contains(obj.getClass())) {
            sb2.append(obj);
            return;
        }
        sb2.append('\"');
        String obj2 = obj.toString();
        int i = 0;
        while (true) {
            int zzc = zzc(obj2, i);
            if (zzc == -1) {
                sb2.append((CharSequence) obj2, i, obj2.length());
                sb2.append('\"');
                return;
            }
            sb2.append((CharSequence) obj2, i, zzc);
            i = zzc + 1;
            char charAt = obj2.charAt(zzc);
            if (charAt == '\t') {
                c = 't';
            } else if (charAt == '\n') {
                c = 'n';
            } else if (charAt != '\r') {
                c = charAt;
                if (charAt != '\"') {
                    c = charAt;
                    if (charAt != '\\') {
                        sb2.append((char) 65533);
                    }
                }
            } else {
                c = 'r';
            }
            sb2.append("\\");
            sb2.append(c);
        }
    }

    public final void zzb() {
        if (this.zze) {
            this.zzd.append(this.zzc);
        }
    }
}
