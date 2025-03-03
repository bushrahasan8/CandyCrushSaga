package com.facebook.appevents.cloudbridge;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: CustomEventField.class */
public enum CustomEventField {
    EVENT_TIME("_logTime"),
    EVENT_NAME("_eventName"),
    VALUE_TO_SUM("_valueToSum"),
    CONTENT_IDS("fb_content_id"),
    CONTENTS("fb_content"),
    CONTENT_TYPE("fb_content_type"),
    DESCRIPTION("fb_description"),
    LEVEL("fb_level"),
    MAX_RATING_VALUE("fb_max_rating_value"),
    NUM_ITEMS("fb_num_items"),
    PAYMENT_INFO_AVAILABLE("fb_payment_info_available"),
    REGISTRATION_METHOD("fb_registration_method"),
    SEARCH_STRING("fb_search_string"),
    SUCCESS("fb_success"),
    ORDER_ID("fb_order_id"),
    AD_TYPE("ad_type"),
    CURRENCY("fb_currency");

    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    /* loaded from: CustomEventField$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CustomEventField invoke(String rawValue) {
            CustomEventField customEventField;
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            CustomEventField[] values = CustomEventField.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    customEventField = null;
                    break;
                }
                CustomEventField customEventField2 = values[i];
                if (Intrinsics.areEqual(customEventField2.getRawValue(), rawValue)) {
                    customEventField = customEventField2;
                    break;
                }
                i++;
            }
            return customEventField;
        }
    }

    CustomEventField(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
