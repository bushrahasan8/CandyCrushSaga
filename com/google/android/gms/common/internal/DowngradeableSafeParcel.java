package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@KeepForSdk
/* loaded from: DowngradeableSafeParcel.class */
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    private static final Object zza = new Object();
    private boolean zzb = false;

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public static boolean canUnparcelSafely(String str) {
        synchronized (zza) {
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public static Integer getUnparcelClientVersion() {
        synchronized (zza) {
        }
        return null;
    }

    @KeepForSdk
    protected abstract boolean prepareForClientVersion(int i);

    @KeepForSdk
    public void setShouldDowngrade(boolean z) {
        this.zzb = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public boolean shouldDowngrade() {
        return this.zzb;
    }
}
