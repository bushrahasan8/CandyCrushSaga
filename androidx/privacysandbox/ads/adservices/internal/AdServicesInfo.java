package androidx.privacysandbox.ads.adservices.internal;

import android.os.Build;
import android.os.ext.SdkExtensions;
import com.ironsource.t2;

/* loaded from: AdServicesInfo.class */
public final class AdServicesInfo {
    public static final AdServicesInfo INSTANCE = new AdServicesInfo();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: AdServicesInfo$Extensions30Impl.class */
    public static final class Extensions30Impl {
        public static final Extensions30Impl INSTANCE = new Extensions30Impl();

        private Extensions30Impl() {
        }

        public final int getAdServicesVersion() {
            int extensionVersion;
            extensionVersion = SdkExtensions.getExtensionVersion(t2.z);
            return extensionVersion;
        }
    }

    private AdServicesInfo() {
    }

    public final int version() {
        return Build.VERSION.SDK_INT >= 30 ? Extensions30Impl.INSTANCE.getAdServicesVersion() : 0;
    }
}
