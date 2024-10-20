package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzhd;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: zzhg.class */
public abstract class zzhg<T> {
    private static volatile zzhr zzb;
    private static volatile boolean zzc = false;
    private final zzho zzg;
    private final String zzh;
    private final T zzi;
    private volatile int zzj;
    private volatile T zzk;
    private final boolean zzl;
    private static final Object zza = new Object();
    private static final AtomicReference<Collection<zzhg<?>>> zzd = new AtomicReference<>();
    private static zzhv zze = new zzhv(new zzhu() { // from class: com.google.android.gms.internal.measurement.zzhl
        @Override // com.google.android.gms.internal.measurement.zzhu
        public final boolean zza() {
            return zzhg.zzd();
        }
    });
    private static final AtomicInteger zzf = new AtomicInteger();

    private zzhg(zzho zzhoVar, String str, T t, boolean z) {
        this.zzj = -1;
        String str2 = zzhoVar.zza;
        if (str2 == null && zzhoVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && zzhoVar.zzb != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzg = zzhoVar;
        this.zzh = str;
        this.zzi = t;
        this.zzl = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzhg zza(zzho zzhoVar, String str, Boolean bool, boolean z) {
        return new zzhn(zzhoVar, str, bool, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzhg zza(zzho zzhoVar, String str, Double d, boolean z) {
        return new zzhm(zzhoVar, str, d, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzhg zza(zzho zzhoVar, String str, Long l, boolean z) {
        return new zzhk(zzhoVar, str, l, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzhg zza(zzho zzhoVar, String str, String str2, boolean z) {
        return new zzhp(zzhoVar, str, str2, true);
    }

    private final T zza(zzhr zzhrVar) {
        zzho zzhoVar = this.zzg;
        if (zzhoVar.zze) {
            return null;
        }
        Function function = zzhoVar.zzh;
        if (function != null && !((Boolean) function.apply(zzhrVar.zza())).booleanValue()) {
            return null;
        }
        zzgz zza2 = zzgz.zza(zzhrVar.zza());
        zzho zzhoVar2 = this.zzg;
        Object zza3 = zza2.zza(zzhoVar2.zze ? null : zza(zzhoVar2.zzc));
        if (zza3 != null) {
            return zza(zza3);
        }
        return null;
    }

    private final String zza(String str) {
        if (str != null && str.isEmpty()) {
            return this.zzh;
        }
        return str + this.zzh;
    }

    private final T zzb(zzhr zzhrVar) {
        Object zza2;
        zzgy zza3 = this.zzg.zzb != null ? zzhf.zza(zzhrVar.zza(), this.zzg.zzb) ? this.zzg.zzg ? zzgr.zza(zzhrVar.zza().getContentResolver(), zzhh.zza(zzhh.zza(zzhrVar.zza(), this.zzg.zzb.getLastPathSegment())), new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhj
            @Override // java.lang.Runnable
            public final void run() {
                zzhg.zzc();
            }
        }) : zzgr.zza(zzhrVar.zza().getContentResolver(), this.zzg.zzb, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhj
            @Override // java.lang.Runnable
            public final void run() {
                zzhg.zzc();
            }
        }) : null : zzht.zza(zzhrVar.zza(), this.zzg.zza, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhj
            @Override // java.lang.Runnable
            public final void run() {
                zzhg.zzc();
            }
        });
        if (zza3 == null || (zza2 = zza3.zza(zzb())) == null) {
            return null;
        }
        return zza(zza2);
    }

    public static void zzb(Context context) {
        if (zzb != null || context == null) {
            return;
        }
        Object obj = zza;
        synchronized (obj) {
            if (zzb == null) {
                synchronized (obj) {
                    zzhr zzhrVar = zzb;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (zzhrVar != null) {
                        if (zzhrVar.zza() != context) {
                        }
                    }
                    if (zzhrVar != null) {
                        zzgr.zzc();
                        zzht.zza();
                        zzgz.zza();
                    }
                    final Context context2 = context;
                    zzb = new zzgs(context, Suppliers.memoize(new Supplier(context2) { // from class: com.google.android.gms.internal.measurement.zzhi
                        private Context zza;

                        {
                            this.zza = context2;
                        }

                        @Override // com.google.common.base.Supplier
                        public final Object get() {
                            Optional zza2;
                            zza2 = zzhd.zza.zza(this.zza);
                            return zza2;
                        }
                    }));
                    zzf.incrementAndGet();
                }
            }
        }
    }

    public static void zzc() {
        zzf.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzd() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ca, code lost:
    
        if (r9 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ec, code lost:
    
        r9 = r6.zzi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e6, code lost:
    
        if (r9 != null) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T zza() {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhg.zza():java.lang.Object");
    }

    abstract T zza(Object obj);

    public final String zzb() {
        return zza(this.zzg.zzd);
    }
}
