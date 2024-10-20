package com.google.android.gms.common.api.internal;

/* loaded from: zas.class */
final class zas {
    final BasePendingResult zaa;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zas(BasePendingResult basePendingResult, zar zarVar) {
        this.zaa = basePendingResult;
    }

    protected final void finalize() throws Throwable {
        BasePendingResult.zal(BasePendingResult.zaj(this.zaa));
        super.finalize();
    }
}
