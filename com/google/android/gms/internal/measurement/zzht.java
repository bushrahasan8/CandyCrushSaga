package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: zzht.class */
public final class zzht implements zzgy {
    private static final Map<String, zzht> zza = new ArrayMap();
    private final SharedPreferences zzb;
    private final Runnable zzc;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzd;
    private final Object zze;
    private volatile Map<String, ?> zzf;
    private final List<zzgw> zzg;

    private zzht(SharedPreferences sharedPreferences, Runnable runnable) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener(this) { // from class: com.google.android.gms.internal.measurement.zzhs
            private zzht zza;

            {
                this.zza = this;
            }

            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                this.zza.zza(sharedPreferences2, str);
            }
        };
        this.zzd = onSharedPreferenceChangeListener;
        this.zze = new Object();
        this.zzg = new ArrayList();
        this.zzb = sharedPreferences;
        this.zzc = runnable;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    private static SharedPreferences zza(Context context, String str) {
        Context createDeviceProtectedStorageContext;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!str.startsWith("direct_boot:")) {
                return context.getSharedPreferences(str, 0);
            }
            Context context2 = context;
            if (zzgp.zza()) {
                createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                context2 = createDeviceProtectedStorageContext;
            }
            return context2.getSharedPreferences(str.substring(12), 0);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzht zza(Context context, String str, Runnable runnable) {
        zzht zzhtVar;
        if (!((!zzgp.zza() || str.startsWith("direct_boot:")) ? true : zzgp.zzb(context))) {
            return null;
        }
        synchronized (zzht.class) {
            try {
                Map<String, zzht> map = zza;
                zzht zzhtVar2 = map.get(str);
                zzhtVar = zzhtVar2;
                if (zzhtVar2 == null) {
                    zzhtVar = new zzht(zza(context, str), runnable);
                    map.put(str, zzhtVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhtVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza() {
        synchronized (zzht.class) {
            try {
                for (zzht zzhtVar : zza.values()) {
                    zzhtVar.zzb.unregisterOnSharedPreferenceChangeListener(zzhtVar.zzd);
                }
                zza.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final Object zza(String str) {
        Map<String, ?> map = this.zzf;
        Map<String, ?> map2 = map;
        if (map == null) {
            synchronized (this.zze) {
                Map<String, ?> map3 = this.zzf;
                map2 = map3;
                if (map3 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map2 = this.zzb.getAll();
                        this.zzf = map2;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map2 != null) {
            return map2.get(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zze) {
            this.zzf = null;
            this.zzc.run();
        }
        synchronized (this) {
            Iterator<zzgw> it = this.zzg.iterator();
            while (it.hasNext()) {
                it.next().zza();
            }
        }
    }
}
