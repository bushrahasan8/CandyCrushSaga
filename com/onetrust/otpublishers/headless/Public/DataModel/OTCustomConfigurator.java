package com.onetrust.otpublishers.headless.Public.DataModel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: OTCustomConfigurator.class */
public final class OTCustomConfigurator {
    public static final Companion Companion = new Companion(null);
    public static OTCustomConfigurator b;
    public OTProxyManager a;

    /* loaded from: OTCustomConfigurator$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getSharedInstance$annotations() {
        }

        public final String getProxyDomainURLString(OTProxyType proxyType) {
            String str;
            Intrinsics.checkNotNullParameter(proxyType, "proxyType");
            if (OTCustomConfigurator.b != null) {
                OTCustomConfigurator oTCustomConfigurator = OTCustomConfigurator.b;
                Intrinsics.checkNotNull(oTCustomConfigurator);
                str = OTCustomConfigurator.access$getProxyDomainURL(oTCustomConfigurator, proxyType);
            } else {
                str = "";
            }
            return str;
        }

        public final OTCustomConfigurator getSharedInstance() {
            if (OTCustomConfigurator.b == null) {
                OTCustomConfigurator.b = new OTCustomConfigurator(null);
            }
            return OTCustomConfigurator.b;
        }

        public final void setupProxyManager(OTProxyManager manager) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            if (OTCustomConfigurator.b == null) {
                OTCustomConfigurator.b = new OTCustomConfigurator(null);
            }
            OTCustomConfigurator oTCustomConfigurator = OTCustomConfigurator.b;
            if (oTCustomConfigurator == null) {
                return;
            }
            oTCustomConfigurator.a = manager;
        }
    }

    private OTCustomConfigurator() {
    }

    public /* synthetic */ OTCustomConfigurator(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        if (r0.length() == 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String access$getProxyDomainURL(com.onetrust.otpublishers.headless.Public.DataModel.OTCustomConfigurator r3, com.onetrust.otpublishers.headless.Public.DataModel.OTProxyType r4) {
        /*
            r0 = r3
            com.onetrust.otpublishers.headless.Public.DataModel.OTProxyManager r0 = r0.a
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L14
            r0 = r3
            r1 = r4
            java.net.URL r0 = r0.getProxyDomain(r1)
            r3 = r0
            goto L16
        L14:
            r0 = 0
            r3 = r0
        L16:
            r0 = r3
            if (r0 == 0) goto L2e
            r0 = r3
            java.lang.String r0 = r0.toString()
            r4 = r0
            r0 = r4
            java.lang.String r1 = "proxyDomainURL.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r0 = r4
            r3 = r0
            r0 = r4
            int r0 = r0.length()
            if (r0 != 0) goto L31
        L2e:
            java.lang.String r0 = ""
            r3 = r0
        L31:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onetrust.otpublishers.headless.Public.DataModel.OTCustomConfigurator.access$getProxyDomainURL(com.onetrust.otpublishers.headless.Public.DataModel.OTCustomConfigurator, com.onetrust.otpublishers.headless.Public.DataModel.OTProxyType):java.lang.String");
    }

    public static final String getProxyDomainURLString(OTProxyType oTProxyType) {
        return Companion.getProxyDomainURLString(oTProxyType);
    }

    public static final OTCustomConfigurator getSharedInstance() {
        return Companion.getSharedInstance();
    }

    public static final void setupProxyManager(OTProxyManager oTProxyManager) {
        Companion.setupProxyManager(oTProxyManager);
    }
}
