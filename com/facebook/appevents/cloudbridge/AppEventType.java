package com.facebook.appevents.cloudbridge;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: AppEventType.class */
public enum AppEventType {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;

    public static final Companion Companion = new Companion(null);

    /* loaded from: AppEventType$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AppEventType invoke(String rawValue) {
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            return Intrinsics.areEqual(rawValue, "MOBILE_APP_INSTALL") ? AppEventType.MOBILE_APP_INSTALL : Intrinsics.areEqual(rawValue, "CUSTOM_APP_EVENTS") ? AppEventType.CUSTOM : AppEventType.OTHER;
        }
    }
}
