package com.facebook.appevents.cloudbridge;

/* loaded from: ConversionsAPISection.class */
public enum ConversionsAPISection {
    USER_DATA("user_data"),
    APP_DATA("app_data"),
    CUSTOM_DATA("custom_data"),
    CUSTOM_EVENTS("custom_events");

    private final String rawValue;

    ConversionsAPISection(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
