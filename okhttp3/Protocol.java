package okhttp3;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: Protocol.class */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public static final Companion Companion = new Companion(null);
    private final String protocol;

    /* loaded from: Protocol$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Protocol get(String protocol) {
            Protocol protocol2;
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            Protocol protocol3 = Protocol.HTTP_1_0;
            if (Intrinsics.areEqual(protocol, protocol3.protocol)) {
                protocol2 = protocol3;
            } else {
                Protocol protocol4 = Protocol.HTTP_1_1;
                if (Intrinsics.areEqual(protocol, protocol4.protocol)) {
                    protocol2 = protocol4;
                } else {
                    Protocol protocol5 = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (Intrinsics.areEqual(protocol, protocol5.protocol)) {
                        protocol2 = protocol5;
                    } else {
                        Protocol protocol6 = Protocol.HTTP_2;
                        if (Intrinsics.areEqual(protocol, protocol6.protocol)) {
                            protocol2 = protocol6;
                        } else {
                            Protocol protocol7 = Protocol.SPDY_3;
                            if (Intrinsics.areEqual(protocol, protocol7.protocol)) {
                                protocol2 = protocol7;
                            } else {
                                Protocol protocol8 = Protocol.QUIC;
                                if (!Intrinsics.areEqual(protocol, protocol8.protocol)) {
                                    throw new IOException(Intrinsics.stringPlus("Unexpected protocol: ", protocol));
                                }
                                protocol2 = protocol8;
                            }
                        }
                    }
                }
            }
            return protocol2;
        }
    }

    Protocol(String str) {
        this.protocol = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
