package com.onetrust.otpublishers.headless.Public.DataModel;

import androidx.annotation.Keep;
import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
/* loaded from: OTProxyType.class */
public abstract class OTProxyType {

    @Keep
    /* loaded from: OTProxyType$AgeGateLogo.class */
    public static final class AgeGateLogo extends OTProxyType {
        public final URL url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AgeGateLogo(URL url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public static /* synthetic */ AgeGateLogo copy$default(AgeGateLogo ageGateLogo, URL url, int i, Object obj) {
            if ((i & 1) != 0) {
                url = ageGateLogo.url;
            }
            return ageGateLogo.copy(url);
        }

        public final URL component1() {
            return this.url;
        }

        public final AgeGateLogo copy(URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new AgeGateLogo(url);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AgeGateLogo) && Intrinsics.areEqual(this.url, ((AgeGateLogo) obj).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "AgeGateLogo(url=" + this.url + ')';
        }
    }

    @Keep
    /* loaded from: OTProxyType$BannerLogo.class */
    public static final class BannerLogo extends OTProxyType {
        public final URL url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BannerLogo(URL url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public static /* synthetic */ BannerLogo copy$default(BannerLogo bannerLogo, URL url, int i, Object obj) {
            if ((i & 1) != 0) {
                url = bannerLogo.url;
            }
            return bannerLogo.copy(url);
        }

        public final URL component1() {
            return this.url;
        }

        public final BannerLogo copy(URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new BannerLogo(url);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BannerLogo) && Intrinsics.areEqual(this.url, ((BannerLogo) obj).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "BannerLogo(url=" + this.url + ')';
        }
    }

    @Keep
    /* loaded from: OTProxyType$GoogleVendors.class */
    public static final class GoogleVendors extends OTProxyType {
        public final URL url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GoogleVendors(URL url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public static /* synthetic */ GoogleVendors copy$default(GoogleVendors googleVendors, URL url, int i, Object obj) {
            if ((i & 1) != 0) {
                url = googleVendors.url;
            }
            return googleVendors.copy(url);
        }

        public final URL component1() {
            return this.url;
        }

        public final GoogleVendors copy(URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new GoogleVendors(url);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GoogleVendors) && Intrinsics.areEqual(this.url, ((GoogleVendors) obj).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "GoogleVendors(url=" + this.url + ')';
        }
    }

    @Keep
    /* loaded from: OTProxyType$IABVendors.class */
    public static final class IABVendors extends OTProxyType {
        public final URL url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IABVendors(URL url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public static /* synthetic */ IABVendors copy$default(IABVendors iABVendors, URL url, int i, Object obj) {
            if ((i & 1) != 0) {
                url = iABVendors.url;
            }
            return iABVendors.copy(url);
        }

        public final URL component1() {
            return this.url;
        }

        public final IABVendors copy(URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new IABVendors(url);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IABVendors) && Intrinsics.areEqual(this.url, ((IABVendors) obj).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "IABVendors(url=" + this.url + ')';
        }
    }

    @Keep
    /* loaded from: OTProxyType$LogConsent.class */
    public static final class LogConsent extends OTProxyType {
        public final URL url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LogConsent(URL url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public static /* synthetic */ LogConsent copy$default(LogConsent logConsent, URL url, int i, Object obj) {
            if ((i & 1) != 0) {
                url = logConsent.url;
            }
            return logConsent.copy(url);
        }

        public final URL component1() {
            return this.url;
        }

        public final LogConsent copy(URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new LogConsent(url);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LogConsent) && Intrinsics.areEqual(this.url, ((LogConsent) obj).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "LogConsent(url=" + this.url + ')';
        }
    }

    @Keep
    /* loaded from: OTProxyType$PCLogo.class */
    public static final class PCLogo extends OTProxyType {
        public final URL url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PCLogo(URL url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public static /* synthetic */ PCLogo copy$default(PCLogo pCLogo, URL url, int i, Object obj) {
            if ((i & 1) != 0) {
                url = pCLogo.url;
            }
            return pCLogo.copy(url);
        }

        public final URL component1() {
            return this.url;
        }

        public final PCLogo copy(URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new PCLogo(url);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PCLogo) && Intrinsics.areEqual(this.url, ((PCLogo) obj).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "PCLogo(url=" + this.url + ')';
        }
    }

    @Keep
    /* loaded from: OTProxyType$SDKDataDownload.class */
    public static final class SDKDataDownload extends OTProxyType {
        public final URL url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SDKDataDownload(URL url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public static /* synthetic */ SDKDataDownload copy$default(SDKDataDownload sDKDataDownload, URL url, int i, Object obj) {
            if ((i & 1) != 0) {
                url = sDKDataDownload.url;
            }
            return sDKDataDownload.copy(url);
        }

        public final URL component1() {
            return this.url;
        }

        public final SDKDataDownload copy(URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new SDKDataDownload(url);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SDKDataDownload) && Intrinsics.areEqual(this.url, ((SDKDataDownload) obj).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "SDKDataDownload(url=" + this.url + ')';
        }
    }

    private OTProxyType() {
    }

    public /* synthetic */ OTProxyType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
