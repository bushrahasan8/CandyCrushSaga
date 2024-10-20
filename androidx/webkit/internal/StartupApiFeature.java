package androidx.webkit.internal;

import java.util.HashSet;
import java.util.Set;

/* loaded from: StartupApiFeature.class */
public abstract class StartupApiFeature {
    private static final Set sValues = new HashSet();
    private final String mInternalFeatureValue;
    private final String mPublicFeatureValue;

    /* loaded from: StartupApiFeature$NoFramework.class */
    public static class NoFramework extends StartupApiFeature {
        public NoFramework(String str, String str2) {
            super(str, str2);
        }
    }

    /* loaded from: StartupApiFeature$P.class */
    public static class P extends StartupApiFeature {
        public P(String str, String str2) {
            super(str, str2);
        }
    }

    StartupApiFeature(String str, String str2) {
        this.mPublicFeatureValue = str;
        this.mInternalFeatureValue = str2;
        sValues.add(this);
    }
}
