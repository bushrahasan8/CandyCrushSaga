package okhttp3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: TlsVersion.class */
public enum TlsVersion {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    public static final Companion Companion = new Companion(null);
    private final String javaName;

    /* loaded from: TlsVersion$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TlsVersion forJavaName(String javaName) {
            TlsVersion tlsVersion;
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            int hashCode = javaName.hashCode();
            if (hashCode == 79201641) {
                if (javaName.equals("SSLv3")) {
                    tlsVersion = TlsVersion.SSL_3_0;
                    return tlsVersion;
                }
                throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected TLS version: ", javaName));
            }
            if (hashCode == 79923350) {
                if (javaName.equals("TLSv1")) {
                    tlsVersion = TlsVersion.TLS_1_0;
                    return tlsVersion;
                }
                throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected TLS version: ", javaName));
            }
            switch (hashCode) {
                case -503070503:
                    if (javaName.equals("TLSv1.1")) {
                        tlsVersion = TlsVersion.TLS_1_1;
                        return tlsVersion;
                    }
                    break;
                case -503070502:
                    if (javaName.equals("TLSv1.2")) {
                        tlsVersion = TlsVersion.TLS_1_2;
                        return tlsVersion;
                    }
                    break;
                case -503070501:
                    if (javaName.equals("TLSv1.3")) {
                        tlsVersion = TlsVersion.TLS_1_3;
                        return tlsVersion;
                    }
                    break;
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected TLS version: ", javaName));
        }
    }

    TlsVersion(String str) {
        this.javaName = str;
    }

    public final String javaName() {
        return this.javaName;
    }
}
