package com.applovin.sdk;

import java.util.List;

/* loaded from: AppLovinSdkConfiguration.class */
public interface AppLovinSdkConfiguration {

    @Deprecated
    /* loaded from: AppLovinSdkConfiguration$ConsentDialogState.class */
    public enum ConsentDialogState {
        UNKNOWN,
        APPLIES,
        DOES_NOT_APPLY
    }

    /* loaded from: AppLovinSdkConfiguration$ConsentFlowUserGeography.class */
    public enum ConsentFlowUserGeography {
        UNKNOWN,
        GDPR,
        OTHER
    }

    @Deprecated
    ConsentDialogState getConsentDialogState();

    ConsentFlowUserGeography getConsentFlowUserGeography();

    String getCountryCode();

    List<String> getEnabledAmazonAdUnitIds();

    boolean isTestModeEnabled();
}
