package com.google.android.gms.internal.play_games_inputmapping;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: zzfl.class */
public final class zzfl {
    public static final zzfl zza;
    public static final zzfl zzb;
    public static final zzfl zzc;
    public static final zzfl zzd;
    public static final zzfl zze;
    public static final zzfl zzf;
    public static final zzfl zzg;
    public static final zzfl zzh;
    public static final zzfl zzi;
    public static final zzfl zzj;
    private static final zzfl[] zzn;
    private final Class zzk;
    private final Class zzl;
    private final Object zzm;

    static {
        zzfl zzflVar = new zzfl("VOID", 0, Void.class, Void.class, null);
        zza = zzflVar;
        Class cls = Integer.TYPE;
        zzfl zzflVar2 = new zzfl("INT", 1, cls, Integer.class, 0);
        zzb = zzflVar2;
        zzfl zzflVar3 = new zzfl("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzflVar3;
        zzfl zzflVar4 = new zzfl("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzflVar4;
        zzfl zzflVar5 = new zzfl("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzflVar5;
        zzfl zzflVar6 = new zzfl("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzflVar6;
        zzfl zzflVar7 = new zzfl("STRING", 6, String.class, String.class, "");
        zzg = zzflVar7;
        zzfl zzflVar8 = new zzfl("BYTE_STRING", 7, zzek.class, zzek.class, zzek.zzb);
        zzh = zzflVar8;
        zzfl zzflVar9 = new zzfl("ENUM", 8, cls, Integer.class, null);
        zzi = zzflVar9;
        zzfl zzflVar10 = new zzfl("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzflVar10;
        zzn = new zzfl[]{zzflVar, zzflVar2, zzflVar3, zzflVar4, zzflVar5, zzflVar6, zzflVar7, zzflVar8, zzflVar9, zzflVar10};
    }

    private zzfl(String str, int i, Class cls, Class cls2, Object obj) {
        this.zzk = cls;
        this.zzl = cls2;
        this.zzm = obj;
    }

    public static zzfl[] values() {
        return (zzfl[]) zzn.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}
