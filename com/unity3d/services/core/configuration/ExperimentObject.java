package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.DeviceLog;
import org.json.JSONObject;

/* loaded from: ExperimentObject.class */
public class ExperimentObject {
    private static final String APPLIED_KEY = "applied";
    private static final String VALUE_KEY = "value";
    private final JSONObject _experimentData;

    public ExperimentObject(JSONObject jSONObject) {
        this._experimentData = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public ExperimentAppliedRule getAppliedRule() {
        ExperimentAppliedRule experimentAppliedRule = ExperimentAppliedRule.NEXT;
        String optString = this._experimentData.optString(APPLIED_KEY);
        ExperimentAppliedRule experimentAppliedRule2 = experimentAppliedRule;
        if (!optString.isEmpty()) {
            try {
                experimentAppliedRule2 = ExperimentAppliedRule.valueOf(optString.toUpperCase());
            } catch (IllegalArgumentException e) {
                DeviceLog.warning("Invalid rule %s for experiment", optString);
                experimentAppliedRule2 = experimentAppliedRule;
            }
        }
        return experimentAppliedRule2;
    }

    public boolean getBooleanValue() {
        return this._experimentData.optBoolean("value");
    }

    public String getStringValue() {
        return this._experimentData.optString("value");
    }
}
