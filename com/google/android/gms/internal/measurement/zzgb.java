package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjt;
import java.util.List;

/* loaded from: zzgb.class */
public final class zzgb {

    /* loaded from: zzgb$zza.class */
    public static final class zza extends zzjt<zza, C0006zza> implements zzli {
        private static final zza zzc;
        private static volatile zzlp<zza> zzd;
        private zzkc<zzb> zze = zzjt.zzcc();

        /* renamed from: com.google.android.gms.internal.measurement.zzgb$zza$zza, reason: collision with other inner class name */
        /* loaded from: zzgb$zza$zza.class */
        public static final class C0006zza extends zzjt.zza<zza, C0006zza> implements zzli {
            private C0006zza() {
                super(zza.zzc);
            }

            /* synthetic */ C0006zza(zzgc zzgcVar) {
                this();
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzjt.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }

        public static zza zzc() {
            return zzc;
        }

        public final int zza() {
            return this.zze.size();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzjt
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzgc.zza[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0006zza(null);
                case 3:
                    return zzjt.zza(zzc, "\u0001\u0001����\u0001\u0001\u0001��\u0001��\u0001\u001b", new Object[]{"zze", zzb.class});
                case 4:
                    return zzc;
                case 5:
                    zzlp<zza> zzlpVar = zzd;
                    zzlp<zza> zzlpVar2 = zzlpVar;
                    if (zzlpVar == null) {
                        synchronized (zza.class) {
                            try {
                                zzlp<zza> zzlpVar3 = zzd;
                                zzlpVar2 = zzlpVar3;
                                if (zzlpVar3 == null) {
                                    zzlpVar2 = new zzjt.zzc<>(zzc);
                                    zzd = zzlpVar2;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return zzlpVar2;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final List<zzb> zzd() {
            return this.zze;
        }
    }

    /* loaded from: zzgb$zzb.class */
    public static final class zzb extends zzjt<zzb, zza> implements zzli {
        private static final zzb zzc;
        private static volatile zzlp<zzb> zzd;
        private int zze;
        private String zzf = "";
        private zzkc<zzd> zzg = zzjt.zzcc();

        /* loaded from: zzgb$zzb$zza.class */
        public static final class zza extends zzjt.zza<zzb, zza> implements zzli {
            private zza() {
                super(zzb.zzc);
            }

            /* synthetic */ zza(zzgc zzgcVar) {
                this();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzjt.zza((Class<zzb>) zzb.class, zzbVar);
        }

        private zzb() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzjt
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzgc.zza[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zzjt.zza(zzc, "\u0001\u0002��\u0001\u0001\u0002\u0002��\u0001��\u0001ဈ��\u0002\u001b", new Object[]{"zze", "zzf", "zzg", zzd.class});
                case 4:
                    return zzc;
                case 5:
                    zzlp<zzb> zzlpVar = zzd;
                    zzlp<zzb> zzlpVar2 = zzlpVar;
                    if (zzlpVar == null) {
                        synchronized (zzb.class) {
                            try {
                                zzlp<zzb> zzlpVar3 = zzd;
                                zzlpVar2 = zzlpVar3;
                                if (zzlpVar3 == null) {
                                    zzlpVar2 = new zzjt.zzc<>(zzc);
                                    zzd = zzlpVar2;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return zzlpVar2;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final String zzb() {
            return this.zzf;
        }

        public final List<zzd> zzc() {
            return this.zzg;
        }
    }

    /* loaded from: zzgb$zzc.class */
    public static final class zzc extends zzjt<zzc, zza> implements zzli {
        private static final zzc zzc;
        private static volatile zzlp<zzc> zzd;
        private int zze;
        private zzkc<zzd> zzf = zzjt.zzcc();
        private zza zzg;

        /* loaded from: zzgb$zzc$zza.class */
        public static final class zza extends zzjt.zza<zzc, zza> implements zzli {
            private zza() {
                super(zzc.zzc);
            }

            /* synthetic */ zza(zzgc zzgcVar) {
                this();
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzc = zzcVar;
            zzjt.zza((Class<zzc>) zzc.class, zzcVar);
        }

        private zzc() {
        }

        public final zza zza() {
            zza zzaVar = this.zzg;
            zza zzaVar2 = zzaVar;
            if (zzaVar == null) {
                zzaVar2 = zza.zzc();
            }
            return zzaVar2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzjt
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzgc.zza[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zzjt.zza(zzc, "\u0001\u0002��\u0001\u0001\u0002\u0002��\u0001��\u0001\u001b\u0002ဉ��", new Object[]{"zze", "zzf", zzd.class, "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzlp<zzc> zzlpVar = zzd;
                    zzlp<zzc> zzlpVar2 = zzlpVar;
                    if (zzlpVar == null) {
                        synchronized (zzc.class) {
                            try {
                                zzlp<zzc> zzlpVar3 = zzd;
                                zzlpVar2 = zzlpVar3;
                                if (zzlpVar3 == null) {
                                    zzlpVar2 = new zzjt.zzc<>(zzc);
                                    zzd = zzlpVar2;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return zzlpVar2;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final List<zzd> zzc() {
            return this.zzf;
        }
    }

    /* loaded from: zzgb$zzd.class */
    public static final class zzd extends zzjt<zzd, zzb> implements zzli {
        private static final zzd zzc;
        private static volatile zzlp<zzd> zzd;
        private int zze;
        private int zzf;
        private zzkc<zzd> zzg = zzjt.zzcc();
        private String zzh = "";
        private String zzi = "";
        private boolean zzj;
        private double zzk;

        /* loaded from: zzgb$zzd$zza.class */
        public enum zza implements zzjv {
            UNKNOWN(0),
            STRING(1),
            NUMBER(2),
            BOOLEAN(3),
            STATEMENT(4);

            private static final zzjy<zza> zzf = new zzge();
            private final int zzh;

            zza(int i) {
                this.zzh = i;
            }

            public static zza zza(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return STRING;
                }
                if (i == 2) {
                    return NUMBER;
                }
                if (i == 3) {
                    return BOOLEAN;
                }
                if (i != 4) {
                    return null;
                }
                return STATEMENT;
            }

            public static zzjx zzb() {
                return zzgd.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzjv
            public final int zza() {
                return this.zzh;
            }
        }

        /* loaded from: zzgb$zzd$zzb.class */
        public static final class zzb extends zzjt.zza<zzd, zzb> implements zzli {
            private zzb() {
                super(zzd.zzc);
            }

            /* synthetic */ zzb(zzgc zzgcVar) {
                this();
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzjt.zza((Class<zzd>) zzd.class, zzdVar);
        }

        private zzd() {
        }

        public final double zza() {
            return this.zzk;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Finally extract failed */
        @Override // com.google.android.gms.internal.measurement.zzjt
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzgc.zza[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzjt.zza(zzc, "\u0001\u0006��\u0001\u0001\u0006\u0006��\u0001��\u0001᠌��\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", zza.zzb(), "zzg", zzd.class, "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzc;
                case 5:
                    zzlp<zzd> zzlpVar = zzd;
                    zzlp<zzd> zzlpVar2 = zzlpVar;
                    if (zzlpVar == null) {
                        synchronized (zzd.class) {
                            try {
                                zzlp<zzd> zzlpVar3 = zzd;
                                zzlpVar2 = zzlpVar3;
                                if (zzlpVar3 == null) {
                                    zzlpVar2 = new zzjt.zzc<>(zzc);
                                    zzd = zzlpVar2;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return zzlpVar2;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final zza zzb() {
            zza zza2 = zza.zza(this.zzf);
            zza zzaVar = zza2;
            if (zza2 == null) {
                zzaVar = zza.UNKNOWN;
            }
            return zzaVar;
        }

        public final String zzd() {
            return this.zzh;
        }

        public final String zze() {
            return this.zzi;
        }

        public final List<zzd> zzf() {
            return this.zzg;
        }

        public final boolean zzg() {
            return this.zzj;
        }

        public final boolean zzh() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 4) != 0;
        }
    }
}
