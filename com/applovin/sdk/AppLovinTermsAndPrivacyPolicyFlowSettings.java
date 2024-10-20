package com.applovin.sdk;

import com.applovin.sdk.AppLovinSdkConfiguration;

/* loaded from: AppLovinTermsAndPrivacyPolicyFlowSettings.class */
public interface AppLovinTermsAndPrivacyPolicyFlowSettings extends AppLovinTermsFlowSettings {
    AppLovinSdkConfiguration.ConsentFlowUserGeography getDebugUserGeography();

    void setDebugUserGeography(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography);
}
