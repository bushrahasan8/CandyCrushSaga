package com.unity3d.ads.core.data.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: WebViewConfiguration.class */
public final class WebViewConfiguration {
    private final List<String> additionalFiles;
    private final String entryPoint;
    private final int version;

    public WebViewConfiguration(int i, String entryPoint, List<String> additionalFiles) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(additionalFiles, "additionalFiles");
        this.version = i;
        this.entryPoint = entryPoint;
        this.additionalFiles = additionalFiles;
    }

    public static /* synthetic */ WebViewConfiguration copy$default(WebViewConfiguration webViewConfiguration, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = webViewConfiguration.version;
        }
        if ((i2 & 2) != 0) {
            str = webViewConfiguration.entryPoint;
        }
        if ((i2 & 4) != 0) {
            list = webViewConfiguration.additionalFiles;
        }
        return webViewConfiguration.copy(i, str, list);
    }

    public final int component1() {
        return this.version;
    }

    public final String component2() {
        return this.entryPoint;
    }

    public final List<String> component3() {
        return this.additionalFiles;
    }

    public final WebViewConfiguration copy(int i, String entryPoint, List<String> additionalFiles) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(additionalFiles, "additionalFiles");
        return new WebViewConfiguration(i, entryPoint, additionalFiles);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewConfiguration)) {
            return false;
        }
        WebViewConfiguration webViewConfiguration = (WebViewConfiguration) obj;
        return this.version == webViewConfiguration.version && Intrinsics.areEqual(this.entryPoint, webViewConfiguration.entryPoint) && Intrinsics.areEqual(this.additionalFiles, webViewConfiguration.additionalFiles);
    }

    public final List<String> getAdditionalFiles() {
        return this.additionalFiles;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((this.version * 31) + this.entryPoint.hashCode()) * 31) + this.additionalFiles.hashCode();
    }

    public String toString() {
        return "WebViewConfiguration(version=" + this.version + ", entryPoint=" + this.entryPoint + ", additionalFiles=" + this.additionalFiles + ')';
    }
}
