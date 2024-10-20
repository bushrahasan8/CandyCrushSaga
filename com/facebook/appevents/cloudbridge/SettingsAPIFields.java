package com.facebook.appevents.cloudbridge;

import com.ironsource.m4;

/* loaded from: SettingsAPIFields.class */
public enum SettingsAPIFields {
    URL(m4.q),
    ENABLED("is_enabled"),
    DATASETID("dataset_id"),
    ACCESSKEY("access_key");

    private final String rawValue;

    SettingsAPIFields(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
