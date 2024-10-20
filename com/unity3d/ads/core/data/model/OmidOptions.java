package com.unity3d.ads.core.data.model;

import com.iab.omid.library.unity3d.adsession.CreativeType;
import com.iab.omid.library.unity3d.adsession.ImpressionType;
import com.iab.omid.library.unity3d.adsession.Owner;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: OmidOptions.class */
public final class OmidOptions {
    private final CreativeType creativeType;
    private final String customReferenceData;
    private final Owner impressionOwner;
    private final ImpressionType impressionType;
    private final boolean isolateVerificationScripts;
    private final Owner mediaEventsOwner;
    private final Owner videoEventsOwner;

    public OmidOptions() {
        this(false, null, null, null, null, null, null, 127, null);
    }

    public OmidOptions(boolean z, Owner owner, Owner owner2, String str, ImpressionType impressionType, CreativeType creativeType, Owner owner3) {
        this.isolateVerificationScripts = z;
        this.impressionOwner = owner;
        this.videoEventsOwner = owner2;
        this.customReferenceData = str;
        this.impressionType = impressionType;
        this.creativeType = creativeType;
        this.mediaEventsOwner = owner3;
    }

    public /* synthetic */ OmidOptions(boolean z, Owner owner, Owner owner2, String str, ImpressionType impressionType, CreativeType creativeType, Owner owner3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : owner, (i & 4) != 0 ? null : owner2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : impressionType, (i & 32) != 0 ? null : creativeType, (i & 64) != 0 ? null : owner3);
    }

    public static /* synthetic */ OmidOptions copy$default(OmidOptions omidOptions, boolean z, Owner owner, Owner owner2, String str, ImpressionType impressionType, CreativeType creativeType, Owner owner3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = omidOptions.isolateVerificationScripts;
        }
        if ((i & 2) != 0) {
            owner = omidOptions.impressionOwner;
        }
        if ((i & 4) != 0) {
            owner2 = omidOptions.videoEventsOwner;
        }
        if ((i & 8) != 0) {
            str = omidOptions.customReferenceData;
        }
        if ((i & 16) != 0) {
            impressionType = omidOptions.impressionType;
        }
        if ((i & 32) != 0) {
            creativeType = omidOptions.creativeType;
        }
        if ((i & 64) != 0) {
            owner3 = omidOptions.mediaEventsOwner;
        }
        return omidOptions.copy(z, owner, owner2, str, impressionType, creativeType, owner3);
    }

    public final boolean component1() {
        return this.isolateVerificationScripts;
    }

    public final Owner component2() {
        return this.impressionOwner;
    }

    public final Owner component3() {
        return this.videoEventsOwner;
    }

    public final String component4() {
        return this.customReferenceData;
    }

    public final ImpressionType component5() {
        return this.impressionType;
    }

    public final CreativeType component6() {
        return this.creativeType;
    }

    public final Owner component7() {
        return this.mediaEventsOwner;
    }

    public final OmidOptions copy(boolean z, Owner owner, Owner owner2, String str, ImpressionType impressionType, CreativeType creativeType, Owner owner3) {
        return new OmidOptions(z, owner, owner2, str, impressionType, creativeType, owner3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OmidOptions)) {
            return false;
        }
        OmidOptions omidOptions = (OmidOptions) obj;
        return this.isolateVerificationScripts == omidOptions.isolateVerificationScripts && this.impressionOwner == omidOptions.impressionOwner && this.videoEventsOwner == omidOptions.videoEventsOwner && Intrinsics.areEqual(this.customReferenceData, omidOptions.customReferenceData) && this.impressionType == omidOptions.impressionType && this.creativeType == omidOptions.creativeType && this.mediaEventsOwner == omidOptions.mediaEventsOwner;
    }

    public final CreativeType getCreativeType() {
        return this.creativeType;
    }

    public final String getCustomReferenceData() {
        return this.customReferenceData;
    }

    public final Owner getImpressionOwner() {
        return this.impressionOwner;
    }

    public final ImpressionType getImpressionType() {
        return this.impressionType;
    }

    public final boolean getIsolateVerificationScripts() {
        return this.isolateVerificationScripts;
    }

    public final Owner getMediaEventsOwner() {
        return this.mediaEventsOwner;
    }

    public final Owner getVideoEventsOwner() {
        return this.videoEventsOwner;
    }

    public int hashCode() {
        boolean z = this.isolateVerificationScripts;
        boolean z2 = z;
        if (z) {
            z2 = true;
        }
        Owner owner = this.impressionOwner;
        int i = 0;
        int hashCode = owner == null ? 0 : owner.hashCode();
        Owner owner2 = this.videoEventsOwner;
        int hashCode2 = owner2 == null ? 0 : owner2.hashCode();
        String str = this.customReferenceData;
        int hashCode3 = str == null ? 0 : str.hashCode();
        ImpressionType impressionType = this.impressionType;
        int hashCode4 = impressionType == null ? 0 : impressionType.hashCode();
        CreativeType creativeType = this.creativeType;
        int hashCode5 = creativeType == null ? 0 : creativeType.hashCode();
        Owner owner3 = this.mediaEventsOwner;
        if (owner3 != null) {
            i = owner3.hashCode();
        }
        return ((((((((((((z2 ? 1 : 0) * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public String toString() {
        return "OmidOptions(isolateVerificationScripts=" + this.isolateVerificationScripts + ", impressionOwner=" + this.impressionOwner + ", videoEventsOwner=" + this.videoEventsOwner + ", customReferenceData=" + this.customReferenceData + ", impressionType=" + this.impressionType + ", creativeType=" + this.creativeType + ", mediaEventsOwner=" + this.mediaEventsOwner + ')';
    }
}
