package com.android.billingclient.api;

/* loaded from: QueryPurchaseHistoryParams.class */
public final class QueryPurchaseHistoryParams {
    private final String zza;

    /* loaded from: QueryPurchaseHistoryParams$Builder.class */
    public static class Builder {
        private String zza;

        private Builder() {
            throw null;
        }

        /* synthetic */ Builder(zzdg zzdgVar) {
        }

        public QueryPurchaseHistoryParams build() {
            if (this.zza != null) {
                return new QueryPurchaseHistoryParams(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public Builder setProductType(String str) {
            this.zza = str;
            return this;
        }
    }

    /* synthetic */ QueryPurchaseHistoryParams(Builder builder, zzdh zzdhVar) {
        this.zza = builder.zza;
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public final String zza() {
        return this.zza;
    }
}
