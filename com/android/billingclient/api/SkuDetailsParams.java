package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: SkuDetailsParams.class */
public class SkuDetailsParams {
    private String zza;
    private List zzb;

    /* loaded from: SkuDetailsParams$Builder.class */
    public static class Builder {
        private String zza;
        private List zzb;

        private Builder() {
            throw null;
        }

        /* synthetic */ Builder(zzdk zzdkVar) {
        }

        public SkuDetailsParams build() {
            String str = this.zza;
            if (str == null) {
                throw new IllegalArgumentException("SKU type must be set");
            }
            if (this.zzb == null) {
                throw new IllegalArgumentException("SKU list must be set");
            }
            SkuDetailsParams skuDetailsParams = new SkuDetailsParams();
            skuDetailsParams.zza = str;
            skuDetailsParams.zzb = this.zzb;
            return skuDetailsParams;
        }

        public Builder setSkusList(List<String> list) {
            this.zzb = new ArrayList(list);
            return this;
        }

        public Builder setType(String str) {
            this.zza = str;
            return this;
        }
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public String getSkuType() {
        return this.zza;
    }

    public List<String> getSkusList() {
        return this.zzb;
    }
}
