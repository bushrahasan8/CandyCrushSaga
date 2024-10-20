package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: zzkv.class */
public final class zzkv extends zzg {
    protected zzks zza;
    private volatile zzks zzb;
    private volatile zzks zzc;
    private final Map<Activity, zzks> zzd;
    private Activity zze;
    private volatile boolean zzf;
    private volatile zzks zzg;
    private zzks zzh;
    private boolean zzi;
    private final Object zzj;

    public zzkv(zzho zzhoVar) {
        super(zzhoVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    private final String zza(Class<?> cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return str;
        }
        String[] split = canonicalName.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        String str3 = str2;
        if (str2.length() > zze().zza((String) null, false)) {
            str3 = str2.substring(0, zze().zza((String) null, false));
        }
        return str3;
    }

    private final void zza(Activity activity, zzks zzksVar, boolean z) {
        zzks zzksVar2;
        zzks zzksVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zzksVar.zzb == null) {
            zzksVar2 = new zzks(zzksVar.zza, activity != null ? zza(activity.getClass(), "Activity") : null, zzksVar.zzc, zzksVar.zze, zzksVar.zzf);
        } else {
            zzksVar2 = zzksVar;
        }
        this.zzc = this.zzb;
        this.zzb = zzksVar2;
        zzl().zzb(new zzkx(this, zzksVar2, zzksVar3, zzb().elapsedRealtime(), z));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v19 ??, still in use, count: 1, list:
          (r0v19 ?? I:??[long, double]) from 0x011f: MOVE (r17v2 long) = (r0v19 ?? I:??[long, double])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyIf(SimplifyVisitor.java:280)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:138)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean, android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.google.android.gms.measurement.internal.zziy, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v25, types: [android.os.Bundle, com.google.android.gms.measurement.internal.zznt, long] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.String, android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.String, android.os.BaseBundle] */
    public final void zza(com.google.android.gms.measurement.internal.zzks r8, com.google.android.gms.measurement.internal.zzks r9, long r10, boolean r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkv.zza(com.google.android.gms.measurement.internal.zzks, com.google.android.gms.measurement.internal.zzks, long, boolean, android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzks zzksVar, boolean z, long j) {
        zzc().zza(zzb().elapsedRealtime());
        if (!zzp().zza(zzksVar != null && zzksVar.zzd, z, j) || zzksVar == null) {
            return;
        }
        zzksVar.zzd = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(zzkv zzkvVar, Bundle bundle, zzks zzksVar, zzks zzksVar2, long j) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        zzkvVar.zza(zzksVar, zzksVar2, j, true, zzkvVar.zzq().zza((String) null, "screen_view", bundle, (List<String>) null, false));
    }

    private final zzks zzd(Activity activity) {
        Preconditions.checkNotNull(activity);
        zzks zzksVar = this.zzd.get(activity);
        zzks zzksVar2 = zzksVar;
        if (zzksVar == null) {
            zzksVar2 = new zzks(null, zza(activity.getClass(), "Activity"), zzq().zzm());
            this.zzd.put(activity, zzksVar2);
        }
        return this.zzg != null ? this.zzg : zzksVar2;
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final zzks zza(boolean z) {
        zzu();
        zzt();
        if (!z) {
            return this.zza;
        }
        zzks zzksVar = this.zza;
        return zzksVar != null ? zzksVar : this.zzh;
    }

    public final void zza(Activity activity) {
        synchronized (this.zzj) {
            if (activity == this.zze) {
                this.zze = null;
            }
        }
        if (zze().zzv()) {
            this.zzd.remove(activity);
        }
    }

    public final void zza(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!zze().zzv() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(activity, new zzks(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @Deprecated
    public final void zza(Activity activity, String str, String str2) {
        if (!zze().zzv()) {
            zzj().zzv().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zzks zzksVar = this.zzb;
        if (zzksVar == null) {
            zzj().zzv().zza("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.zzd.get(activity) == null) {
            zzj().zzv().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        String str3 = str2;
        if (str2 == null) {
            str3 = zza(activity.getClass(), "Activity");
        }
        boolean equals = Objects.equals(zzksVar.zzb, str3);
        boolean equals2 = Objects.equals(zzksVar.zza, str);
        if (equals && equals2) {
            zzj().zzv().zza("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > zze().zza((String) null, false))) {
            zzj().zzv().zza("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str3 != null && (str3.length() <= 0 || str3.length() > zze().zza((String) null, false))) {
            zzj().zzv().zza("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str3.length()));
            return;
        }
        zzj().zzp().zza("Setting current screen to name, class", str == null ? "null" : str, str3);
        zzks zzksVar2 = new zzks(str, str3, zzq().zzm());
        this.zzd.put(activity, zzksVar2);
        zza(activity, zzksVar2, true);
    }

    public final void zza(Bundle bundle, long j) {
        String str;
        synchronized (this.zzj) {
            if (!this.zzi) {
                zzj().zzv().zza("Cannot log screen view event when the app is in the background.");
                return;
            }
            String str2 = null;
            if (bundle != null) {
                str = bundle.getString("screen_name");
                if (str != null && (str.length() <= 0 || str.length() > zze().zza((String) null, false))) {
                    zzj().zzv().zza("Invalid screen name length for screen view. Length", Integer.valueOf(str.length()));
                    return;
                }
                str2 = bundle.getString("screen_class");
                if (str2 != null && (str2.length() <= 0 || str2.length() > zze().zza((String) null, false))) {
                    zzj().zzv().zza("Invalid screen class length for screen view. Length", Integer.valueOf(str2.length()));
                    return;
                }
            } else {
                str = null;
            }
            String str3 = str2;
            if (str2 == null) {
                Activity activity = this.zze;
                str3 = activity != null ? zza(activity.getClass(), "Activity") : "Activity";
            }
            zzks zzksVar = this.zzb;
            if (this.zzf && zzksVar != null) {
                this.zzf = false;
                boolean equals = Objects.equals(zzksVar.zzb, str3);
                boolean equals2 = Objects.equals(zzksVar.zza, str);
                if (equals && equals2) {
                    zzj().zzv().zza("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
            zzj().zzp().zza("Logging screen view with name, class", str == null ? "null" : str, str3 == null ? "null" : str3);
            zzks zzksVar2 = this.zzb == null ? this.zzc : this.zzb;
            zzks zzksVar3 = new zzks(str, str3, zzq().zzm(), true, j);
            this.zzb = zzksVar3;
            this.zzc = zzksVar2;
            this.zzg = zzksVar3;
            zzl().zzb(new zzku(this, bundle, zzksVar3, zzksVar2, zzb().elapsedRealtime()));
        }
    }

    public final zzks zzaa() {
        return this.zzb;
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    public final void zzb(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        long elapsedRealtime = zzb().elapsedRealtime();
        if (!zze().zzv()) {
            this.zzb = null;
            zzl().zzb(new zzkz(this, elapsedRealtime));
        } else {
            zzks zzd = zzd(activity);
            this.zzc = this.zzb;
            this.zzb = null;
            zzl().zzb(new zzky(this, zzd, elapsedRealtime));
        }
    }

    public final void zzb(Activity activity, Bundle bundle) {
        zzks zzksVar;
        if (!zze().zzv() || bundle == null || (zzksVar = this.zzd.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzksVar.zzc);
        bundle2.putString("name", zzksVar.zza);
        bundle2.putString("referrer_name", zzksVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zza zzc() {
        return super.zzc();
    }

    public final void zzc(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = true;
            if (activity != this.zze) {
                synchronized (this.zzj) {
                    this.zze = activity;
                    this.zzf = false;
                }
                if (zze().zzv()) {
                    this.zzg = null;
                    zzl().zzb(new zzlb(this));
                }
            }
        }
        if (!zze().zzv()) {
            this.zzb = this.zzg;
            zzl().zzb(new zzkw(this));
        } else {
            zza(activity, zzd(activity), false);
            zza zzc = zzc();
            zzc.zzl().zzb(new zze(zzc, zzc.zzb().elapsedRealtime()));
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    public final /* bridge */ /* synthetic */ zzad zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ zzae zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzfv zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzfu zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ zzfw zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    public final /* bridge */ /* synthetic */ zzgb zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ zzgm zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    public final /* bridge */ /* synthetic */ zzhh zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zziy zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzkv zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzla zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzmi zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ zznt zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzz() {
        return false;
    }
}
