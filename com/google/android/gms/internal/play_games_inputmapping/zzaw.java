package com.google.android.gms.internal.play_games_inputmapping;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Found several "values" enum fields: [] */
/* loaded from: zzaw.class */
public final class zzaw {
    public static final zzaw zza;
    public static final zzaw zzb;
    public static final zzaw zzc;
    public static final zzaw zzd;
    public static final zzaw zze;
    public static final zzaw zzf;
    public static final zzaw zzg;
    public static final zzaw zzh;
    public static final zzaw zzi;
    public static final zzaw zzj;
    private static final zzaw[] zzk;
    private static final zzaw[] zzp;
    private final char zzl;
    private final zzay zzm;
    private final int zzn;
    private final String zzo;

    static {
        zzaw zzawVar = new zzaw("STRING", 0, 's', zzay.GENERAL, "-#", true);
        zza = zzawVar;
        zzaw zzawVar2 = new zzaw("BOOLEAN", 1, 'b', zzay.BOOLEAN, "-", true);
        zzb = zzawVar2;
        zzaw zzawVar3 = new zzaw("CHAR", 2, 'c', zzay.CHARACTER, "-", true);
        zzc = zzawVar3;
        zzay zzayVar = zzay.INTEGRAL;
        zzaw zzawVar4 = new zzaw("DECIMAL", 3, 'd', zzayVar, "-0+ ,(", false);
        zzd = zzawVar4;
        zzaw zzawVar5 = new zzaw("OCTAL", 4, 'o', zzayVar, "-#0(", false);
        zze = zzawVar5;
        zzaw zzawVar6 = new zzaw("HEX", 5, 'x', zzayVar, "-#0(", true);
        zzf = zzawVar6;
        zzay zzayVar2 = zzay.FLOAT;
        zzaw zzawVar7 = new zzaw("FLOAT", 6, 'f', zzayVar2, "-#0+ ,(", false);
        zzg = zzawVar7;
        zzaw zzawVar8 = new zzaw("EXPONENT", 7, 'e', zzayVar2, "-#0+ (", true);
        zzh = zzawVar8;
        zzaw zzawVar9 = new zzaw("GENERAL", 8, 'g', zzayVar2, "-0+ ,(", true);
        zzi = zzawVar9;
        zzaw zzawVar10 = new zzaw("EXPONENT_HEX", 9, 'a', zzayVar2, "-#0+ ", true);
        zzj = zzawVar10;
        zzp = new zzaw[]{zzawVar, zzawVar2, zzawVar3, zzawVar4, zzawVar5, zzawVar6, zzawVar7, zzawVar8, zzawVar9, zzawVar10};
        zzk = new zzaw[26];
        for (zzaw zzawVar11 : values()) {
            zzk[zzf(zzawVar11.zzl)] = zzawVar11;
        }
    }

    private zzaw(String str, int i, char c, zzay zzayVar, String str2, boolean z) {
        this.zzl = c;
        this.zzm = zzayVar;
        this.zzn = zzax.zzc(str2, z);
        StringBuilder sb = new StringBuilder(2);
        sb.append("%");
        sb.append(c);
        this.zzo = sb.toString();
    }

    public static zzaw[] values() {
        return (zzaw[]) zzp.clone();
    }

    public static zzaw zza(char c) {
        zzaw zzawVar = zzk[zzf(c)];
        if ((c & ' ') != 0) {
            return zzawVar;
        }
        if (zzawVar == null || (zzawVar.zzn & 128) == 0) {
            return null;
        }
        return zzawVar;
    }

    private static int zzf(char c) {
        return (c | ' ') - 97;
    }

    public final char zzb() {
        return this.zzl;
    }

    public final zzay zzc() {
        return this.zzm;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzd() {
        return this.zzn;
    }

    public final String zze() {
        return this.zzo;
    }
}
