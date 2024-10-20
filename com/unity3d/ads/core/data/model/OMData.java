package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: OMData.class */
public final class OMData {
    private final String partnerName;
    private final String partnerVersion;
    private final String version;

    public OMData(String version, String partnerName, String partnerVersion) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(partnerName, "partnerName");
        Intrinsics.checkNotNullParameter(partnerVersion, "partnerVersion");
        this.version = version;
        this.partnerName = partnerName;
        this.partnerVersion = partnerVersion;
    }

    public static /* synthetic */ OMData copy$default(OMData oMData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oMData.version;
        }
        if ((i & 2) != 0) {
            str2 = oMData.partnerName;
        }
        if ((i & 4) != 0) {
            str3 = oMData.partnerVersion;
        }
        return oMData.copy(str, str2, str3);
    }

    public final String component1() {
        return this.version;
    }

    public final String component2() {
        return this.partnerName;
    }

    public final String component3() {
        return this.partnerVersion;
    }

    public final OMData copy(String version, String partnerName, String partnerVersion) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(partnerName, "partnerName");
        Intrinsics.checkNotNullParameter(partnerVersion, "partnerVersion");
        return new OMData(version, partnerName, partnerVersion);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OMData)) {
            return false;
        }
        OMData oMData = (OMData) obj;
        return Intrinsics.areEqual(this.version, oMData.version) && Intrinsics.areEqual(this.partnerName, oMData.partnerName) && Intrinsics.areEqual(this.partnerVersion, oMData.partnerVersion);
    }

    public final String getPartnerName() {
        return this.partnerName;
    }

    public final String getPartnerVersion() {
        return this.partnerVersion;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((this.version.hashCode() * 31) + this.partnerName.hashCode()) * 31) + this.partnerVersion.hashCode();
    }

    public String toString() {
        return "OMData(version=" + this.version + ", partnerName=" + this.partnerName + ", partnerVersion=" + this.partnerVersion + ')';
    }
}
