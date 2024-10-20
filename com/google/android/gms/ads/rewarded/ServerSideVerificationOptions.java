package com.google.android.gms.ads.rewarded;

/* loaded from: ServerSideVerificationOptions.class */
public class ServerSideVerificationOptions {
    private final String zza;
    private final String zzb;

    /* loaded from: ServerSideVerificationOptions$Builder.class */
    public static final class Builder {
        private String zza = "";
        private String zzb = "";

        public ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this, null);
        }

        public Builder setCustomData(String str) {
            this.zzb = str;
            return this;
        }

        public Builder setUserId(String str) {
            this.zza = str;
            return this;
        }
    }

    /* synthetic */ ServerSideVerificationOptions(Builder builder, zzd zzdVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
    }

    public String getCustomData() {
        return this.zzb;
    }

    public String getUserId() {
        return this.zza;
    }
}
