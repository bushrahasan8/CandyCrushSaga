package com.google.android.gms.internal.play_billing;

/* loaded from: zza.class */
enum zza {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);

    private static final zzal zzp;
    private final int zzr;

    static {
        zzak zzakVar = new zzak();
        for (zza zzaVar : values()) {
            zzakVar.zza(Integer.valueOf(zzaVar.zzr), zzaVar);
        }
        zzp = zzakVar.zzb();
    }

    zza(int i) {
        this.zzr = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zza zza(int i) {
        zzal zzalVar = zzp;
        Integer valueOf = Integer.valueOf(i);
        return !zzalVar.containsKey(valueOf) ? RESPONSE_CODE_UNSPECIFIED : (zza) zzalVar.get(valueOf);
    }
}
