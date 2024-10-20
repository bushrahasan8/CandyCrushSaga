package com.facebook.appevents.cloudbridge;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: AppEventUserAndAppDataField.class */
public enum AppEventUserAndAppDataField {
    ANON_ID("anon_id"),
    APP_USER_ID("app_user_id"),
    ADVERTISER_ID("advertiser_id"),
    PAGE_ID("page_id"),
    PAGE_SCOPED_USER_ID("page_scoped_user_id"),
    USER_DATA("ud"),
    ADV_TE("advertiser_tracking_enabled"),
    APP_TE("application_tracking_enabled"),
    CONSIDER_VIEWS("consider_views"),
    DEVICE_TOKEN("device_token"),
    EXT_INFO("extInfo"),
    INCLUDE_DWELL_DATA("include_dwell_data"),
    INCLUDE_VIDEO_DATA("include_video_data"),
    INSTALL_REFERRER("install_referrer"),
    INSTALLER_PACKAGE("installer_package"),
    RECEIPT_DATA("receipt_data"),
    URL_SCHEMES("url_schemes");

    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    /* loaded from: AppEventUserAndAppDataField$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AppEventUserAndAppDataField invoke(String rawValue) {
            AppEventUserAndAppDataField appEventUserAndAppDataField;
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            AppEventUserAndAppDataField[] values = AppEventUserAndAppDataField.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    appEventUserAndAppDataField = null;
                    break;
                }
                AppEventUserAndAppDataField appEventUserAndAppDataField2 = values[i];
                if (Intrinsics.areEqual(appEventUserAndAppDataField2.getRawValue(), rawValue)) {
                    appEventUserAndAppDataField = appEventUserAndAppDataField2;
                    break;
                }
                i++;
            }
            return appEventUserAndAppDataField;
        }
    }

    AppEventUserAndAppDataField(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
