package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* loaded from: zzds.class */
public class zzds {
    private static volatile zzds zzb;
    protected final Clock zza;
    private final String zzc;
    private final ExecutorService zzd;
    private final AppMeasurementSdk zze;
    private final List<Pair<com.google.android.gms.measurement.internal.zzix, zzd>> zzf;
    private int zzg;
    private boolean zzh;
    private String zzi;
    private volatile zzdd zzj;

    /* loaded from: zzds$zza.class */
    static final class zza extends zzdm {
        private final com.google.android.gms.measurement.internal.zziu zza;

        zza(com.google.android.gms.measurement.internal.zziu zziuVar) {
            this.zza = zziuVar;
        }

        @Override // com.google.android.gms.internal.measurement.zzdj
        public final int zza() {
            return System.identityHashCode(this.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzdj
        public final void zza(String str, String str2, Bundle bundle, long j) {
            this.zza.interceptEvent(str, str2, bundle, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: zzds$zzb.class */
    public abstract class zzb implements Runnable {
        final long zza;
        final long zzb;
        private final boolean zzc;
        private final zzds zzd;

        /* JADX INFO: Access modifiers changed from: package-private */
        public zzb(zzds zzdsVar) {
            this(zzdsVar, true);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public zzb(zzds zzdsVar, boolean z) {
            this.zzd = zzdsVar;
            this.zza = zzdsVar.zza.currentTimeMillis();
            this.zzb = zzdsVar.zza.elapsedRealtime();
            this.zzc = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.zzd.zzh) {
                zzb();
                return;
            }
            try {
                zza();
            } catch (Exception e) {
                this.zzd.zza(e, false, this.zzc);
                zzb();
            }
        }

        abstract void zza() throws RemoteException;

        protected void zzb() {
        }
    }

    /* loaded from: zzds$zzc.class */
    final class zzc implements Application.ActivityLifecycleCallbacks {
        final zzds zza;

        zzc(zzds zzdsVar) {
            this.zza = zzdsVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            this.zza.zza(new zzfa(this, bundle, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            this.zza.zza(new zzff(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            this.zza.zza(new zzfb(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            this.zza.zza(new zzfc(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            zzde zzdeVar = new zzde();
            this.zza.zza(new zzfd(this, activity, zzdeVar));
            Bundle zza = zzdeVar.zza(50L);
            if (zza != null) {
                bundle.putAll(zza);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            this.zza.zza(new zzez(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            this.zza.zza(new zzfe(this, activity));
        }
    }

    /* loaded from: zzds$zzd.class */
    static final class zzd extends zzdm {
        private final com.google.android.gms.measurement.internal.zzix zza;

        zzd(com.google.android.gms.measurement.internal.zzix zzixVar) {
            this.zza = zzixVar;
        }

        @Override // com.google.android.gms.internal.measurement.zzdj
        public final int zza() {
            return System.identityHashCode(this.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzdj
        public final void zza(String str, String str2, Bundle bundle, long j) {
            this.zza.onEvent(str, str2, bundle, j);
        }
    }

    private zzds(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !zzc(str2, str3)) {
            this.zzc = "FA";
        } else {
            this.zzc = str;
        }
        this.zza = DefaultClock.getInstance();
        this.zzd = zzcu.zza().zza(new zzee(this), zzcz.zza);
        this.zze = new AppMeasurementSdk(this);
        this.zzf = new ArrayList();
        boolean z = true;
        if (zzb(context) && !zzk()) {
            this.zzi = null;
            this.zzh = true;
            Log.w(this.zzc, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (zzc(str2, str3)) {
            this.zzi = str2;
        } else {
            this.zzi = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 != null ? false : z)) {
                    Log.w(this.zzc, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.zzc, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            }
        }
        zza(new zzdr(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.zzc, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new zzc(this));
        }
    }

    public static zzds zza(Context context) {
        return zza(context, (String) null, (String) null, (String) null, (Bundle) null);
    }

    public static zzds zza(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (zzb == null) {
            synchronized (zzds.class) {
                try {
                    if (zzb == null) {
                        zzb = new zzds(context, str, str2, str3, bundle);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzb zzbVar) {
        this.zzd.execute(zzbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(Exception exc, boolean z, boolean z2) {
        this.zzh |= z;
        if (z) {
            Log.w(this.zzc, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            zza(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
        Log.w(this.zzc, "Error with data collection. Data lost.", exc);
    }

    private final void zza(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        zza(new zzex(this, l, str, str2, bundle, z, z2));
    }

    private static boolean zzb(Context context) {
        try {
            return new com.google.android.gms.measurement.internal.zzhi(context, com.google.android.gms.measurement.internal.zzhi.zza(context)).zza("google_app_id") != null;
        } catch (IllegalStateException e) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzc(String str, String str2) {
        return (str2 == null || str == null || zzk()) ? false : true;
    }

    private final boolean zzk() {
        boolean z = false;
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException e) {
        }
        return z;
    }

    public final int zza(String str) {
        zzde zzdeVar = new zzde();
        zza(new zzep(this, str, zzdeVar));
        Integer num = (Integer) zzde.zza(zzdeVar.zza(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long zza() {
        zzde zzdeVar = new zzde();
        zza(new zzek(this, zzdeVar));
        Long zzb2 = zzdeVar.zzb(500L);
        if (zzb2 != null) {
            return zzb2.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.zza.currentTimeMillis()).nextLong();
        int i = this.zzg + 1;
        this.zzg = i;
        return nextLong + i;
    }

    public final Bundle zza(Bundle bundle, boolean z) {
        zzde zzdeVar = new zzde();
        zza(new zzeq(this, bundle, zzdeVar));
        if (z) {
            return zzdeVar.zza(UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzdd zza(Context context, boolean z) {
        try {
            return zzdg.asInterface(DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e) {
            zza((Exception) e, true, false);
            return null;
        }
    }

    public final Object zza(int i) {
        zzde zzdeVar = new zzde();
        zza(new zzeu(this, zzdeVar, i));
        return zzde.zza(zzdeVar.zza(15000L), Object.class);
    }

    public final List<Bundle> zza(String str, String str2) {
        zzde zzdeVar = new zzde();
        zza(new zzdv(this, str, str2, zzdeVar));
        List<Bundle> list = (List) zzde.zza(zzdeVar.zza(UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS), List.class);
        List<Bundle> list2 = list;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        return list2;
    }

    public final Map<String, Object> zza(String str, String str2, boolean z) {
        zzde zzdeVar = new zzde();
        zza(new zzel(this, str, str2, z, zzdeVar));
        Bundle zza2 = zzdeVar.zza(UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS);
        if (zza2 == null || zza2.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(zza2.size());
        for (String str3 : zza2.keySet()) {
            Object obj = zza2.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void zza(int i, String str, Object obj, Object obj2, Object obj3) {
        zza(new zzeo(this, false, 5, str, obj, null, null));
    }

    public final void zza(long j) {
        zza(new zzed(this, j));
    }

    public final void zza(Activity activity, String str, String str2) {
        zza(new zzdx(this, activity, str, str2));
    }

    public final void zza(Bundle bundle) {
        zza(new zzdt(this, bundle));
    }

    public final void zza(com.google.android.gms.measurement.internal.zziu zziuVar) {
        zza zzaVar = new zza(zziuVar);
        if (this.zzj != null) {
            try {
                this.zzj.setEventInterceptor(zzaVar);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException e) {
                Log.w(this.zzc, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        zza(new zzen(this, zzaVar));
    }

    public final void zza(com.google.android.gms.measurement.internal.zzix zzixVar) {
        Preconditions.checkNotNull(zzixVar);
        synchronized (this.zzf) {
            for (int i = 0; i < this.zzf.size(); i++) {
                if (zzixVar.equals(this.zzf.get(i).first)) {
                    Log.w(this.zzc, "OnEventListener already registered.");
                    return;
                }
            }
            zzd zzdVar = new zzd(zzixVar);
            this.zzf.add(new Pair<>(zzixVar, zzdVar));
            if (this.zzj != null) {
                try {
                    this.zzj.registerOnMeasurementEventListener(zzdVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException e) {
                    Log.w(this.zzc, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zza(new zzev(this, zzdVar));
        }
    }

    public final void zza(Boolean bool) {
        zza(new zzea(this, bool));
    }

    public final void zza(String str, Bundle bundle) {
        zza(null, str, bundle, false, true, null);
    }

    public final void zza(String str, String str2, Bundle bundle) {
        zza(new zzdw(this, str, str2, bundle));
    }

    public final void zza(String str, String str2, Bundle bundle, long j) {
        zza(str, str2, bundle, true, false, Long.valueOf(j));
    }

    public final void zza(String str, String str2, Object obj, boolean z) {
        zza(new zzdu(this, str, str2, obj, z));
    }

    public final void zza(boolean z) {
        zza(new zzet(this, z));
    }

    public final AppMeasurementSdk zzb() {
        return this.zze;
    }

    public final void zzb(Bundle bundle) {
        zza(new zzdz(this, bundle));
    }

    public final void zzb(com.google.android.gms.measurement.internal.zzix zzixVar) {
        Pair<com.google.android.gms.measurement.internal.zzix, zzd> pair;
        Preconditions.checkNotNull(zzixVar);
        synchronized (this.zzf) {
            int i = 0;
            while (true) {
                if (i >= this.zzf.size()) {
                    pair = null;
                    break;
                } else {
                    if (zzixVar.equals(this.zzf.get(i).first)) {
                        pair = this.zzf.get(i);
                        break;
                    }
                    i++;
                }
            }
            if (pair == null) {
                Log.w(this.zzc, "OnEventListener had not been registered.");
                return;
            }
            this.zzf.remove(pair);
            zzd zzdVar = (zzd) pair.second;
            if (this.zzj != null) {
                try {
                    this.zzj.unregisterOnMeasurementEventListener(zzdVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException e) {
                    Log.w(this.zzc, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zza(new zzey(this, zzdVar));
        }
    }

    public final void zzb(String str) {
        zza(new zzeg(this, str));
    }

    public final void zzb(String str, String str2) {
        zza((String) null, str, (Object) str2, false);
    }

    public final void zzb(String str, String str2, Bundle bundle) {
        zza(str, str2, bundle, true, true, null);
    }

    public final Long zzc() {
        zzde zzdeVar = new zzde();
        zza(new zzer(this, zzdeVar));
        return zzdeVar.zzb(120000L);
    }

    public final void zzc(Bundle bundle) {
        zza(new zzec(this, bundle));
    }

    public final void zzc(String str) {
        zza(new zzef(this, str));
    }

    public final String zzd() {
        return this.zzi;
    }

    public final void zzd(Bundle bundle) {
        zza(new zzew(this, bundle));
    }

    public final void zzd(String str) {
        zza(new zzdy(this, str));
    }

    public final String zze() {
        zzde zzdeVar = new zzde();
        zza(new zzes(this, zzdeVar));
        return zzdeVar.zzc(120000L);
    }

    public final String zzf() {
        zzde zzdeVar = new zzde();
        zza(new zzeh(this, zzdeVar));
        return zzdeVar.zzc(50L);
    }

    public final String zzg() {
        zzde zzdeVar = new zzde();
        zza(new zzem(this, zzdeVar));
        return zzdeVar.zzc(500L);
    }

    public final String zzh() {
        zzde zzdeVar = new zzde();
        zza(new zzej(this, zzdeVar));
        return zzdeVar.zzc(500L);
    }

    public final String zzi() {
        zzde zzdeVar = new zzde();
        zza(new zzei(this, zzdeVar));
        return zzdeVar.zzc(500L);
    }

    public final void zzj() {
        zza(new zzeb(this));
    }
}
