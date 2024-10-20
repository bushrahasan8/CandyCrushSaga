package com.unity3d.services.core.configuration;

import org.json.JSONObject;

/* loaded from: PrivacyConfig.class */
public class PrivacyConfig {
    private PrivacyConfigStatus _privacyConfigStatus;
    private boolean _shouldSendNonBehavioral;

    public PrivacyConfig() {
        this(PrivacyConfigStatus.UNKNOWN);
    }

    public PrivacyConfig(PrivacyConfigStatus privacyConfigStatus) {
        this._privacyConfigStatus = privacyConfigStatus;
        this._shouldSendNonBehavioral = false;
    }

    public PrivacyConfig(JSONObject jSONObject) {
        parsePrivacyResponse(jSONObject);
    }

    private void parsePrivacyResponse(JSONObject jSONObject) {
        this._privacyConfigStatus = jSONObject.optBoolean("pas", false) ? PrivacyConfigStatus.ALLOWED : PrivacyConfigStatus.DENIED;
        this._shouldSendNonBehavioral = jSONObject.optBoolean("snb", false);
    }

    public boolean allowedToSendPii() {
        return this._privacyConfigStatus.equals(PrivacyConfigStatus.ALLOWED);
    }

    public PrivacyConfigStatus getPrivacyStatus() {
        return this._privacyConfigStatus;
    }

    public boolean shouldSendNonBehavioral() {
        return this._shouldSendNonBehavioral;
    }
}
