package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: zzde.class */
public final class zzde extends zzdh {
    private final AtomicReference<Bundle> zza = new AtomicReference<>();
    private boolean zzb;

    public static <T> T zza(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ)) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e);
            throw e;
        }
    }

    public final Bundle zza(long j) {
        Bundle bundle;
        synchronized (this.zza) {
            if (!this.zzb) {
                try {
                    this.zza.wait(j);
                } catch (InterruptedException e) {
                    return null;
                }
            }
            bundle = this.zza.get();
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzdi
    public final void zza(Bundle bundle) {
        synchronized (this.zza) {
            try {
                this.zza.set(bundle);
                this.zzb = true;
            } finally {
                this.zza.notify();
            }
        }
    }

    public final Long zzb(long j) {
        return (Long) zza(zza(j), Long.class);
    }

    public final String zzc(long j) {
        return (String) zza(zza(j), String.class);
    }
}
