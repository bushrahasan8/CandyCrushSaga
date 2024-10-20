package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zziq;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzgm.class */
public final class zzgm extends zzil {
    static final Pair<String, Long> zza = new Pair<>("", 0L);
    private long zzaa;
    public zzgq zzb;
    public final zzgr zzc;
    public final zzgr zzd;
    public final zzgs zze;
    public final zzgr zzf;
    public final zzgp zzg;
    public final zzgs zzh;
    public final zzgo zzi;
    public final zzgp zzj;
    public final zzgr zzk;
    public final zzgr zzl;
    public boolean zzm;
    public zzgp zzn;
    public zzgp zzo;
    public zzgr zzp;
    public final zzgs zzq;
    public final zzgs zzr;
    public final zzgr zzs;
    public final zzgo zzt;
    private SharedPreferences zzv;
    private Object zzw;
    private SharedPreferences zzx;
    private String zzy;
    private boolean zzz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgm(zzho zzhoVar) {
        super(zzhoVar);
        this.zzw = new Object();
        this.zzf = new zzgr(this, "session_timeout", 1800000L);
        this.zzg = new zzgp(this, "start_new_session", true);
        this.zzk = new zzgr(this, "last_pause_time", 0L);
        this.zzl = new zzgr(this, "session_id", 0L);
        this.zzh = new zzgs(this, "non_personalized_ads", null);
        this.zzi = new zzgo(this, "last_received_uri_timestamps_by_source", null);
        this.zzj = new zzgp(this, "allow_remote_dynamite", false);
        this.zzc = new zzgr(this, "first_open_time", 0L);
        this.zzd = new zzgr(this, "app_install_time", 0L);
        this.zze = new zzgs(this, "app_instance_id", null);
        this.zzn = new zzgp(this, "app_backgrounded", false);
        this.zzo = new zzgp(this, "deep_link_retrieval_complete", false);
        this.zzp = new zzgr(this, "deep_link_retrieval_attempts", 0L);
        this.zzq = new zzgs(this, "firebase_feature_rollouts", null);
        this.zzr = new zzgs(this, "deferred_attribution_cache", null);
        this.zzs = new zzgr(this, "deferred_attribution_cache_timestamp", 0L);
        this.zzt = new zzgo(this, "default_event_parameters", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair<String, Boolean> zza(String str) {
        zzt();
        if (!zzn().zza(zziq.zza.AD_STORAGE)) {
            return new Pair<>("", Boolean.FALSE);
        }
        long elapsedRealtime = zzb().elapsedRealtime();
        if (this.zzy != null && elapsedRealtime < this.zzaa) {
            return new Pair<>(this.zzy, Boolean.valueOf(this.zzz));
        }
        this.zzaa = elapsedRealtime + zze().zzd(str);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zza());
            this.zzy = "";
            String id = advertisingIdInfo.getId();
            if (id != null) {
                this.zzy = id;
            }
            this.zzz = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e) {
            zzj().zzc().zza("Unable to get advertising id", e);
            this.zzy = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.zzy, Boolean.valueOf(this.zzz));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(Boolean bool) {
        zzt();
        SharedPreferences.Editor edit = zzg().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(boolean z) {
        zzt();
        SharedPreferences.Editor edit = zzg().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(int i) {
        return zziq.zza(i, zzg().getInt("consent_source", 100));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(long j) {
        return j - this.zzf.zza() > this.zzk.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(zzax zzaxVar) {
        zzt();
        if (!zziq.zza(zzaxVar.zza(), zzm().zza())) {
            return false;
        }
        SharedPreferences.Editor edit = zzg().edit();
        edit.putString("dma_consent_settings", zzaxVar.zzf());
        edit.apply();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(zziq zziqVar) {
        zzt();
        int zza2 = zziqVar.zza();
        if (!zza(zza2)) {
            return false;
        }
        SharedPreferences.Editor edit = zzg().edit();
        edit.putString("consent_settings", zziqVar.zzh());
        edit.putInt("consent_source", zza2);
        edit.apply();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zza(zzmt zzmtVar) {
        zzt();
        String string = zzg().getString("stored_tcf_param", "");
        String zzc = zzmtVar.zzc();
        if (zzc.equals(string)) {
            return false;
        }
        SharedPreferences.Editor edit = zzg().edit();
        edit.putString("stored_tcf_param", zzc);
        edit.apply();
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    protected final void zzaa() {
        SharedPreferences sharedPreferences = zza().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzv = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.zzm = z;
        if (!z) {
            SharedPreferences.Editor edit = this.zzv.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.zzb = new zzgq(this, "health_monitor", Math.max(0L, zzbh.zzc.zza(null).longValue()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzab() {
        SharedPreferences sharedPreferences = this.zzv;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(Boolean bool) {
        zzt();
        SharedPreferences.Editor edit = zzg().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled_from_api");
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(String str) {
        zzt();
        SharedPreferences.Editor edit = zzg().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(boolean z) {
        zzt();
        zzj().zzp().zza("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = zzg().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final SharedPreferences zzc() {
        zzt();
        zzac();
        if (this.zzx == null) {
            synchronized (this.zzw) {
                if (this.zzx == null) {
                    String str = zza().getPackageName() + "_preferences";
                    zzj().zzp().zza("Default prefs file", str);
                    this.zzx = zza().getSharedPreferences(str, 0);
                }
            }
        }
        return this.zzx;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(String str) {
        zzt();
        SharedPreferences.Editor edit = zzg().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final SharedPreferences zzg() {
        zzt();
        zzac();
        Preconditions.checkNotNull(this.zzv);
        return this.zzv;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SparseArray<Long> zzh() {
        Bundle zza2 = this.zzi.zza();
        if (zza2 == null) {
            return new SparseArray<>();
        }
        int[] intArray = zza2.getIntArray("uriSources");
        long[] longArray = zza2.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray<>();
        }
        if (intArray.length != longArray.length) {
            zzj().zzg().zza("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray<>();
        }
        SparseArray<Long> sparseArray = new SparseArray<>();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzax zzm() {
        zzt();
        return zzax.zza(zzg().getString("dma_consent_settings", null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zziq zzn() {
        zzt();
        return zziq.zza(zzg().getString("consent_settings", "G1"), zzg().getInt("consent_source", 100));
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    protected final boolean zzo() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean zzp() {
        zzt();
        if (zzg().contains("use_service")) {
            return Boolean.valueOf(zzg().getBoolean("use_service", false));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean zzu() {
        zzt();
        if (zzg().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(zzg().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean zzv() {
        zzt();
        if (zzg().contains("measurement_enabled")) {
            return Boolean.valueOf(zzg().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzw() {
        zzt();
        String string = zzg().getString("previous_os_version", null);
        zzf().zzac();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = zzg().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzx() {
        zzt();
        return zzg().getString("admob_app_id", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzy() {
        zzt();
        return zzg().getString("gmp_app_id", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzz() {
        zzt();
        Boolean zzv = zzv();
        SharedPreferences.Editor edit = zzg().edit();
        edit.clear();
        edit.apply();
        if (zzv != null) {
            zza(zzv);
        }
    }
}
