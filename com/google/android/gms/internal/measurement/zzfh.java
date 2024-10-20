package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjt;
import java.util.List;

/* loaded from: zzfh.class */
public final class zzfh {

    /* loaded from: zzfh$zza.class */
    public static final class zza extends zzjt<zza, C0000zza> implements zzli {
        private static final zza zzc;
        private static volatile zzlp<zza> zzd;
        private int zze;
        private int zzf;
        private zzkc<zze> zzg = zzjt.zzcc();
        private zzkc<zzb> zzh = zzjt.zzcc();
        private boolean zzi;
        private boolean zzj;

        /* renamed from: com.google.android.gms.internal.measurement.zzfh$zza$zza, reason: collision with other inner class name */
        /* loaded from: zzfh$zza$zza.class */
        public static final class C0000zza extends zzjt.zza<zza, C0000zza> implements zzli {
            private C0000zza() {
                super(zza.zzc);
            }

            /* synthetic */ C0000zza(zzfg zzfgVar) {
                this();
            }

            public final int zza() {
                return ((zza) this.zza).zzb();
            }

            public final C0000zza zza(int i, zzb.zza zzaVar) {
                zzak();
                ((zza) this.zza).zza(i, (zzb) ((zzjt) zzaVar.zzah()));
                return this;
            }

            public final C0000zza zza(int i, zze.zza zzaVar) {
                zzak();
                ((zza) this.zza).zza(i, (zze) ((zzjt) zzaVar.zzah()));
                return this;
            }

            public final zzb zza(int i) {
                return ((zza) this.zza).zza(i);
            }

            public final int zzb() {
                return ((zza) this.zza).zzc();
            }

            public final zze zzb(int i) {
                return ((zza) this.zza).zzb(i);
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzjt.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i, zzb zzbVar) {
            zzbVar.getClass();
            zzkc<zzb> zzkcVar = this.zzh;
            if (!zzkcVar.zzc()) {
                this.zzh = zzjt.zza(zzkcVar);
            }
            this.zzh.set(i, zzbVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i, zze zzeVar) {
            zzeVar.getClass();
            zzkc<zze> zzkcVar = this.zzg;
            if (!zzkcVar.zzc()) {
                this.zzg = zzjt.zza(zzkcVar);
            }
            this.zzg.set(i, zzeVar);
        }

        public final int zza() {
            return this.zzf;
        }

        public final zzb zza(int i) {
            return this.zzh.get(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzjt
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzfg.zza[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0000zza(null);
                case 3:
                    return zzjt.zza(zzc, "\u0001\u0005��\u0001\u0001\u0005\u0005��\u0002��\u0001င��\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", zze.class, "zzh", zzb.class, "zzi", "zzj"});
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

        public final int zzb() {
            return this.zzh.size();
        }

        public final zze zzb(int i) {
            return this.zzg.get(i);
        }

        public final int zzc() {
            return this.zzg.size();
        }

        public final List<zzb> zze() {
            return this.zzh;
        }

        public final List<zze> zzf() {
            return this.zzg;
        }

        public final boolean zzg() {
            return (this.zze & 1) != 0;
        }
    }

    /* loaded from: zzfh$zzb.class */
    public static final class zzb extends zzjt<zzb, zza> implements zzli {
        private static final zzb zzc;
        private static volatile zzlp<zzb> zzd;
        private int zze;
        private int zzf;
        private String zzg = "";
        private zzkc<zzc> zzh = zzjt.zzcc();
        private boolean zzi;
        private zzd zzj;
        private boolean zzk;
        private boolean zzl;
        private boolean zzm;

        /* loaded from: zzfh$zzb$zza.class */
        public static final class zza extends zzjt.zza<zzb, zza> implements zzli {
            private zza() {
                super(zzb.zzc);
            }

            /* synthetic */ zza(zzfg zzfgVar) {
                this();
            }

            public final int zza() {
                return ((zzb) this.zza).zza();
            }

            public final zza zza(int i, zzc zzcVar) {
                zzak();
                ((zzb) this.zza).zza(i, zzcVar);
                return this;
            }

            public final zza zza(String str) {
                zzak();
                ((zzb) this.zza).zza(str);
                return this;
            }

            public final zzc zza(int i) {
                return ((zzb) this.zza).zza(i);
            }

            public final String zzb() {
                return ((zzb) this.zza).zzf();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzjt.zza((Class<zzb>) zzb.class, zzbVar);
        }

        private zzb() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i, zzc zzcVar) {
            zzcVar.getClass();
            zzkc<zzc> zzkcVar = this.zzh;
            if (!zzkcVar.zzc()) {
                this.zzh = zzjt.zza(zzkcVar);
            }
            this.zzh.set(i, zzcVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 2;
            this.zzg = str;
        }

        public static zza zzc() {
            return zzc.zzbx();
        }

        public final int zza() {
            return this.zzh.size();
        }

        public final zzc zza(int i) {
            return this.zzh.get(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzjt
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzfg.zza[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zzjt.zza(zzc, "\u0001\b��\u0001\u0001\b\b��\u0001��\u0001င��\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", zzc.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
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

        public final int zzb() {
            return this.zzf;
        }

        public final zzd zze() {
            zzd zzdVar = this.zzj;
            zzd zzdVar2 = zzdVar;
            if (zzdVar == null) {
                zzdVar2 = zzd.zzc();
            }
            return zzdVar2;
        }

        public final String zzf() {
            return this.zzg;
        }

        public final List<zzc> zzg() {
            return this.zzh;
        }

        public final boolean zzh() {
            return this.zzk;
        }

        public final boolean zzi() {
            return this.zzl;
        }

        public final boolean zzj() {
            return this.zzm;
        }

        public final boolean zzk() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzl() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzm() {
            return (this.zze & 64) != 0;
        }
    }

    /* loaded from: zzfh$zzc.class */
    public static final class zzc extends zzjt<zzc, zza> implements zzli {
        private static final zzc zzc;
        private static volatile zzlp<zzc> zzd;
        private int zze;
        private zzf zzf;
        private zzd zzg;
        private boolean zzh;
        private String zzi = "";

        /* loaded from: zzfh$zzc$zza.class */
        public static final class zza extends zzjt.zza<zzc, zza> implements zzli {
            private zza() {
                super(zzc.zzc);
            }

            /* synthetic */ zza(zzfg zzfgVar) {
                this();
            }

            public final zza zza(String str) {
                zzak();
                ((zzc) this.zza).zza(str);
                return this;
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzc = zzcVar;
            zzjt.zza((Class<zzc>) zzc.class, zzcVar);
        }

        private zzc() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 8;
            this.zzi = str;
        }

        public static zzc zzb() {
            return zzc;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzjt
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzfg.zza[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zzjt.zza(zzc, "\u0001\u0004��\u0001\u0001\u0004\u0004������\u0001ဉ��\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
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

        public final zzd zzc() {
            zzd zzdVar = this.zzg;
            zzd zzdVar2 = zzdVar;
            if (zzdVar == null) {
                zzdVar2 = zzd.zzc();
            }
            return zzdVar2;
        }

        public final zzf zzd() {
            zzf zzfVar = this.zzf;
            zzf zzfVar2 = zzfVar;
            if (zzfVar == null) {
                zzfVar2 = zzf.zzd();
            }
            return zzfVar2;
        }

        public final String zze() {
            return this.zzi;
        }

        public final boolean zzf() {
            return this.zzh;
        }

        public final boolean zzg() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzh() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 1) != 0;
        }
    }

    /* loaded from: zzfh$zzd.class */
    public static final class zzd extends zzjt<zzd, zza> implements zzli {
        private static final zzd zzc;
        private static volatile zzlp<zzd> zzd;
        private int zze;
        private int zzf;
        private boolean zzg;
        private String zzh = "";
        private String zzi = "";
        private String zzj = "";

        /* loaded from: zzfh$zzd$zza.class */
        public static final class zza extends zzjt.zza<zzd, zza> implements zzli {
            private zza() {
                super(zzd.zzc);
            }

            /* synthetic */ zza(zzfg zzfgVar) {
                this();
            }
        }

        /* loaded from: zzfh$zzd$zzb.class */
        public enum zzb implements zzjv {
            UNKNOWN_COMPARISON_TYPE(0),
            LESS_THAN(1),
            GREATER_THAN(2),
            EQUAL(3),
            BETWEEN(4);

            private static final zzjy<zzb> zzf = new zzfi();
            private final int zzh;

            zzb(int i) {
                this.zzh = i;
            }

            public static zzb zza(int i) {
                if (i == 0) {
                    return UNKNOWN_COMPARISON_TYPE;
                }
                if (i == 1) {
                    return LESS_THAN;
                }
                if (i == 2) {
                    return GREATER_THAN;
                }
                if (i == 3) {
                    return EQUAL;
                }
                if (i != 4) {
                    return null;
                }
                return BETWEEN;
            }

            public static zzjx zzb() {
                return zzfj.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzjv
            public final int zza() {
                return this.zzh;
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzjt.zza((Class<zzd>) zzd.class, zzdVar);
        }

        private zzd() {
        }

        public static zzd zzc() {
            return zzc;
        }

        public final zzb zza() {
            zzb zza2 = zzb.zza(this.zzf);
            zzb zzbVar = zza2;
            if (zza2 == null) {
                zzbVar = zzb.UNKNOWN_COMPARISON_TYPE;
            }
            return zzbVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzjt
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzfg.zza[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(null);
                case 3:
                    return zzjt.zza(zzc, "\u0001\u0005��\u0001\u0001\u0005\u0005������\u0001᠌��\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", zzb.zzb(), "zzg", "zzh", "zzi", "zzj"});
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

        public final String zzd() {
            return this.zzh;
        }

        public final String zze() {
            return this.zzj;
        }

        public final String zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzg;
        }

        public final boolean zzh() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzk() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzl() {
            return (this.zze & 8) != 0;
        }
    }

    /* loaded from: zzfh$zze.class */
    public static final class zze extends zzjt<zze, zza> implements zzli {
        private static final zze zzc;
        private static volatile zzlp<zze> zzd;
        private int zze;
        private int zzf;
        private String zzg = "";
        private zzc zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;

        /* loaded from: zzfh$zze$zza.class */
        public static final class zza extends zzjt.zza<zze, zza> implements zzli {
            private zza() {
                super(zze.zzc);
            }

            /* synthetic */ zza(zzfg zzfgVar) {
                this();
            }

            public final zza zza(String str) {
                zzak();
                ((zze) this.zza).zza(str);
                return this;
            }
        }

        static {
            zze zzeVar = new zze();
            zzc = zzeVar;
            zzjt.zza((Class<zze>) zze.class, zzeVar);
        }

        private zze() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 2;
            this.zzg = str;
        }

        public static zza zzc() {
            return zzc.zzbx();
        }

        public final int zza() {
            return this.zzf;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzjt
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzfg.zza[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(null);
                case 3:
                    return zzjt.zza(zzc, "\u0001\u0006��\u0001\u0001\u0006\u0006������\u0001င��\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzc;
                case 5:
                    zzlp<zze> zzlpVar = zzd;
                    zzlp<zze> zzlpVar2 = zzlpVar;
                    if (zzlpVar == null) {
                        synchronized (zze.class) {
                            try {
                                zzlp<zze> zzlpVar3 = zzd;
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

        public final zzc zzb() {
            zzc zzcVar = this.zzh;
            zzc zzcVar2 = zzcVar;
            if (zzcVar == null) {
                zzcVar2 = zzc.zzb();
            }
            return zzcVar2;
        }

        public final String zze() {
            return this.zzg;
        }

        public final boolean zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzj;
        }

        public final boolean zzh() {
            return this.zzk;
        }

        public final boolean zzi() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 32) != 0;
        }
    }

    /* loaded from: zzfh$zzf.class */
    public static final class zzf extends zzjt<zzf, zzb> implements zzli {
        private static final zzf zzc;
        private static volatile zzlp<zzf> zzd;
        private int zze;
        private int zzf;
        private boolean zzh;
        private String zzg = "";
        private zzkc<String> zzi = zzjt.zzcc();

        /* loaded from: zzfh$zzf$zza.class */
        public enum zza implements zzjv {
            UNKNOWN_MATCH_TYPE(0),
            REGEXP(1),
            BEGINS_WITH(2),
            ENDS_WITH(3),
            PARTIAL(4),
            EXACT(5),
            IN_LIST(6);

            private static final zzjy<zza> zzh = new zzfl();
            private final int zzj;

            zza(int i) {
                this.zzj = i;
            }

            public static zza zza(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN_MATCH_TYPE;
                    case 1:
                        return REGEXP;
                    case 2:
                        return BEGINS_WITH;
                    case 3:
                        return ENDS_WITH;
                    case 4:
                        return PARTIAL;
                    case 5:
                        return EXACT;
                    case 6:
                        return IN_LIST;
                    default:
                        return null;
                }
            }

            public static zzjx zzb() {
                return zzfk.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzj + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzjv
            public final int zza() {
                return this.zzj;
            }
        }

        /* loaded from: zzfh$zzf$zzb.class */
        public static final class zzb extends zzjt.zza<zzf, zzb> implements zzli {
            private zzb() {
                super(zzf.zzc);
            }

            /* synthetic */ zzb(zzfg zzfgVar) {
                this();
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzc = zzfVar;
            zzjt.zza((Class<zzf>) zzf.class, zzfVar);
        }

        private zzf() {
        }

        public static zzf zzd() {
            return zzc;
        }

        public final int zza() {
            return this.zzi.size();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzjt
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzfg.zza[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzjt.zza(zzc, "\u0001\u0004��\u0001\u0001\u0004\u0004��\u0001��\u0001᠌��\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", zza.zzb(), "zzg", "zzh", "zzi"});
                case 4:
                    return zzc;
                case 5:
                    zzlp<zzf> zzlpVar = zzd;
                    zzlp<zzf> zzlpVar2 = zzlpVar;
                    if (zzlpVar == null) {
                        synchronized (zzf.class) {
                            try {
                                zzlp<zzf> zzlpVar3 = zzd;
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
                zzaVar = zza.UNKNOWN_MATCH_TYPE;
            }
            return zzaVar;
        }

        public final String zze() {
            return this.zzg;
        }

        public final List<String> zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzh;
        }

        public final boolean zzh() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 1) != 0;
        }
    }
}
