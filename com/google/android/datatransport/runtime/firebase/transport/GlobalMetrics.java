package com.google.android.datatransport.runtime.firebase.transport;

/* loaded from: GlobalMetrics.class */
public final class GlobalMetrics {
    private static final GlobalMetrics DEFAULT_INSTANCE = new Builder().build();
    private final StorageMetrics storage_metrics_;

    /* loaded from: GlobalMetrics$Builder.class */
    public static final class Builder {
        private StorageMetrics storage_metrics_ = null;

        Builder() {
        }

        public GlobalMetrics build() {
            return new GlobalMetrics(this.storage_metrics_);
        }

        public Builder setStorageMetrics(StorageMetrics storageMetrics) {
            this.storage_metrics_ = storageMetrics;
            return this;
        }
    }

    GlobalMetrics(StorageMetrics storageMetrics) {
        this.storage_metrics_ = storageMetrics;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public StorageMetrics getStorageMetricsInternal() {
        return this.storage_metrics_;
    }
}
