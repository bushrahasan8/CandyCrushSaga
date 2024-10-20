package com.applovin.impl;

import com.applovin.sdk.AppLovinSdkConfiguration;

/* loaded from: q3.class */
public class q3 {
    private final AppLovinSdkConfiguration.ConsentFlowUserGeography a;

    public q3(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        this.a = consentFlowUserGeography;
    }

    public AppLovinSdkConfiguration.ConsentFlowUserGeography a() {
        return this.a;
    }

    protected boolean a(Object obj) {
        return obj instanceof q3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj;
        if (!q3Var.a(this)) {
            return false;
        }
        AppLovinSdkConfiguration.ConsentFlowUserGeography a = a();
        AppLovinSdkConfiguration.ConsentFlowUserGeography a2 = q3Var.a();
        return a == null ? a2 == null : a.equals(a2);
    }

    public int hashCode() {
        AppLovinSdkConfiguration.ConsentFlowUserGeography a = a();
        return (a == null ? 43 : a.hashCode()) + 59;
    }

    public String toString() {
        return "CmpAdapterParameters(debugUserGeography=" + a() + ")";
    }
}
