package androidx.media3.common;

import android.view.View;

/* loaded from: AdOverlayInfo.class */
public final class AdOverlayInfo {
    public final int purpose;
    public final String reasonDetail;
    public final View view;

    /* loaded from: AdOverlayInfo$Builder.class */
    public static final class Builder {
        private String detailedReason;
        private final int purpose;
        private final View view;

        public Builder(View view, int i) {
            this.view = view;
            this.purpose = i;
        }

        public AdOverlayInfo build() {
            return new AdOverlayInfo(this.view, this.purpose, this.detailedReason);
        }

        public Builder setDetailedReason(String str) {
            this.detailedReason = str;
            return this;
        }
    }

    public AdOverlayInfo(View view, int i, String str) {
        this.view = view;
        this.purpose = i;
        this.reasonDetail = str;
    }
}
