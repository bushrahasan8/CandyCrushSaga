package com.android.billingclient.api;

@zzk
/* loaded from: PendingPurchasesParams.class */
public final class PendingPurchasesParams {
    private final boolean enableOneTimeProducts;
    private final boolean enablePrepaidPlans;

    @zzk
    /* loaded from: PendingPurchasesParams$Builder.class */
    public static final class Builder {
        private boolean enableOneTimeProducts;
        private boolean enablePrepaidPlans;

        private Builder() {
        }

        /* synthetic */ Builder(zzco zzcoVar) {
            this();
        }

        public PendingPurchasesParams build() {
            if (this.enableOneTimeProducts) {
                return new PendingPurchasesParams(true, this.enablePrepaidPlans);
            }
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }

        public Builder enableOneTimeProducts() {
            this.enableOneTimeProducts = true;
            return this;
        }

        public Builder enablePrepaidPlans() {
            this.enablePrepaidPlans = true;
            return this;
        }
    }

    private PendingPurchasesParams(boolean z, boolean z2) {
        this.enableOneTimeProducts = z;
        this.enablePrepaidPlans = z2;
    }

    /* synthetic */ PendingPurchasesParams(boolean z, boolean z2, zzcp zzcpVar) {
        this(z, z2);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean isEnabledForOneTimeProducts() {
        return this.enableOneTimeProducts;
    }

    public boolean isEnabledForPrepaidPlans() {
        return this.enablePrepaidPlans;
    }
}
