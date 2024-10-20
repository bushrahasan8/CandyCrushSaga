package com.android.billingclient.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: InAppMessageResult.class */
public final class InAppMessageResult {
    private final int zza;
    private final String zzb;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: InAppMessageResult$InAppMessageResponseCode.class */
    public @interface InAppMessageResponseCode {
        public static final int NO_ACTION_NEEDED = 0;
        public static final int SUBSCRIPTION_STATUS_UPDATED = 1;
    }

    public InAppMessageResult(int i, String str) {
        this.zza = i;
        this.zzb = str;
    }

    public String getPurchaseToken() {
        return this.zzb;
    }

    public int getResponseCode() {
        return this.zza;
    }
}
