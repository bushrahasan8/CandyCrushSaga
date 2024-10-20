package com.vungle.ads.internal.model;

import com.google.android.gms.ads.AdRequest;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: Placement.class */
public final class Placement {
    public static final Companion Companion = new Companion(null);
    private final int adRefreshDuration;
    private final String adSize;
    private final boolean headerBidding;
    private final String identifier;
    private final Boolean incentivized;
    private final boolean isIncentivized;
    private final String placementAdType;
    private final String referenceId;
    private final List<String> supportedAdFormats;
    private final List<String> supportedTemplateTypes;
    private Long wakeupTime;

    /* loaded from: Placement$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return Placement$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Placement(int i, String str, String str2, Boolean bool, List list, List list2, int i2, boolean z, String str3, boolean z2, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, Placement$$serializer.INSTANCE.getDescriptor());
        }
        this.identifier = str;
        this.referenceId = str2;
        if ((i & 4) == 0) {
            this.incentivized = Boolean.FALSE;
        } else {
            this.incentivized = bool;
        }
        if ((i & 8) == 0) {
            this.supportedTemplateTypes = CollectionsKt.emptyList();
        } else {
            this.supportedTemplateTypes = list;
        }
        if ((i & 16) == 0) {
            this.supportedAdFormats = CollectionsKt.emptyList();
        } else {
            this.supportedAdFormats = list2;
        }
        if ((i & 32) == 0) {
            this.adRefreshDuration = Integer.MIN_VALUE;
        } else {
            this.adRefreshDuration = i2;
        }
        if ((i & 64) == 0) {
            this.headerBidding = false;
        } else {
            this.headerBidding = z;
        }
        if ((i & 128) == 0) {
            this.adSize = null;
        } else {
            this.adSize = str3;
        }
        if ((i & 256) == 0) {
            Boolean bool2 = this.incentivized;
            this.isIncentivized = bool2 != null ? bool2.booleanValue() : false;
        } else {
            this.isIncentivized = z2;
        }
        this.wakeupTime = null;
        if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            this.placementAdType = str4;
        } else {
            List<String> list3 = this.supportedTemplateTypes;
            this.placementAdType = list3.contains("banner") ? "TYPE_BANNER" : list3.contains("mrec") ? "TYPE_MREC" : list3.contains("native") ? "TYPE_NATIVE" : "TYPE_DEFAULT";
        }
    }

    public Placement(String identifier, String referenceId, Boolean bool, List<String> supportedTemplateTypes, List<String> supportedAdFormats, int i, boolean z, String str) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        Intrinsics.checkNotNullParameter(supportedTemplateTypes, "supportedTemplateTypes");
        Intrinsics.checkNotNullParameter(supportedAdFormats, "supportedAdFormats");
        this.identifier = identifier;
        this.referenceId = referenceId;
        this.incentivized = bool;
        this.supportedTemplateTypes = supportedTemplateTypes;
        this.supportedAdFormats = supportedAdFormats;
        this.adRefreshDuration = i;
        this.headerBidding = z;
        this.adSize = str;
        this.isIncentivized = bool != null ? bool.booleanValue() : false;
        this.placementAdType = supportedTemplateTypes.contains("banner") ? "TYPE_BANNER" : supportedTemplateTypes.contains("mrec") ? "TYPE_MREC" : supportedTemplateTypes.contains("native") ? "TYPE_NATIVE" : "TYPE_DEFAULT";
    }

    public /* synthetic */ Placement(String str, String str2, Boolean bool, List list, List list2, int i, boolean z, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? Boolean.FALSE : bool, (i2 & 8) != 0 ? CollectionsKt.emptyList() : list, (i2 & 16) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 32) != 0 ? Integer.MIN_VALUE : i, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? null : str3);
    }

    public static /* synthetic */ Placement copy$default(Placement placement, String str, String str2, Boolean bool, List list, List list2, int i, boolean z, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = placement.identifier;
        }
        if ((i2 & 2) != 0) {
            str2 = placement.referenceId;
        }
        if ((i2 & 4) != 0) {
            bool = placement.incentivized;
        }
        if ((i2 & 8) != 0) {
            list = placement.supportedTemplateTypes;
        }
        if ((i2 & 16) != 0) {
            list2 = placement.supportedAdFormats;
        }
        if ((i2 & 32) != 0) {
            i = placement.adRefreshDuration;
        }
        if ((i2 & 64) != 0) {
            z = placement.headerBidding;
        }
        if ((i2 & 128) != 0) {
            str3 = placement.adSize;
        }
        return placement.copy(str, str2, bool, list, list2, i, z, str3);
    }

    public static /* synthetic */ void getAdRefreshDuration$annotations() {
    }

    public static /* synthetic */ void getAdSize$annotations() {
    }

    public static /* synthetic */ void getHeaderBidding$annotations() {
    }

    public static /* synthetic */ void getIdentifier$annotations() {
    }

    public static /* synthetic */ void getIncentivized$annotations() {
    }

    public static /* synthetic */ void getReferenceId$annotations() {
    }

    public static /* synthetic */ void getSupportedAdFormats$annotations() {
    }

    public static /* synthetic */ void getSupportedTemplateTypes$annotations() {
    }

    public static /* synthetic */ void getWakeupTime$annotations() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0151, code lost:
    
        if (r0 != r10) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(com.vungle.ads.internal.model.Placement r7, kotlinx.serialization.encoding.CompositeEncoder r8, kotlinx.serialization.descriptors.SerialDescriptor r9) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.model.Placement.write$Self(com.vungle.ads.internal.model.Placement, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final String component1() {
        return this.identifier;
    }

    public final String component2() {
        return this.referenceId;
    }

    public final Boolean component3() {
        return this.incentivized;
    }

    public final List<String> component4() {
        return this.supportedTemplateTypes;
    }

    public final List<String> component5() {
        return this.supportedAdFormats;
    }

    public final int component6() {
        return this.adRefreshDuration;
    }

    public final boolean component7() {
        return this.headerBidding;
    }

    public final String component8() {
        return this.adSize;
    }

    public final Placement copy(String identifier, String referenceId, Boolean bool, List<String> supportedTemplateTypes, List<String> supportedAdFormats, int i, boolean z, String str) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        Intrinsics.checkNotNullParameter(supportedTemplateTypes, "supportedTemplateTypes");
        Intrinsics.checkNotNullParameter(supportedAdFormats, "supportedAdFormats");
        return new Placement(identifier, referenceId, bool, supportedTemplateTypes, supportedAdFormats, i, z, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placement)) {
            return false;
        }
        Placement placement = (Placement) obj;
        return Intrinsics.areEqual(this.identifier, placement.identifier) && Intrinsics.areEqual(this.referenceId, placement.referenceId) && Intrinsics.areEqual(this.incentivized, placement.incentivized) && Intrinsics.areEqual(this.supportedTemplateTypes, placement.supportedTemplateTypes) && Intrinsics.areEqual(this.supportedAdFormats, placement.supportedAdFormats) && this.adRefreshDuration == placement.adRefreshDuration && this.headerBidding == placement.headerBidding && Intrinsics.areEqual(this.adSize, placement.adSize);
    }

    public final int getAdRefreshDuration() {
        return this.adRefreshDuration;
    }

    public final String getAdSize() {
        return this.adSize;
    }

    public final boolean getHeaderBidding() {
        return this.headerBidding;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Boolean getIncentivized() {
        return this.incentivized;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final List<String> getSupportedAdFormats() {
        return this.supportedAdFormats;
    }

    public final List<String> getSupportedTemplateTypes() {
        return this.supportedTemplateTypes;
    }

    public final Long getWakeupTime() {
        return this.wakeupTime;
    }

    public int hashCode() {
        int hashCode = this.identifier.hashCode();
        int hashCode2 = this.referenceId.hashCode();
        Boolean bool = this.incentivized;
        int i = 0;
        int hashCode3 = bool == null ? 0 : bool.hashCode();
        int hashCode4 = this.supportedTemplateTypes.hashCode();
        int hashCode5 = this.supportedAdFormats.hashCode();
        int i2 = this.adRefreshDuration;
        boolean z = this.headerBidding;
        int i3 = z ? 1 : 0;
        if (z) {
            i3 = 1;
        }
        String str = this.adSize;
        if (str != null) {
            i = str.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i2) * 31) + i3) * 31) + i;
    }

    public final boolean isBanner() {
        return Intrinsics.areEqual(this.placementAdType, "TYPE_BANNER") || isMREC();
    }

    public final boolean isBannerNonMREC() {
        return Intrinsics.areEqual(this.placementAdType, "TYPE_BANNER");
    }

    public final boolean isDefault() {
        return Intrinsics.areEqual(this.placementAdType, "TYPE_DEFAULT");
    }

    public final boolean isIncentivized() {
        return this.isIncentivized;
    }

    public final boolean isInterstitial() {
        return isDefault() && !this.isIncentivized;
    }

    public final boolean isMREC() {
        return Intrinsics.areEqual(this.placementAdType, "TYPE_MREC");
    }

    public final boolean isNative() {
        return Intrinsics.areEqual(this.placementAdType, "TYPE_NATIVE");
    }

    public final boolean isRewardedVideo() {
        return isDefault() && this.isIncentivized;
    }

    public final void setWakeupTime(Long l) {
        this.wakeupTime = l;
    }

    public final void snooze(long j) {
        this.wakeupTime = Long.valueOf(System.currentTimeMillis() + (j * 1000));
    }

    public String toString() {
        return "Placement(identifier=" + this.identifier + ", referenceId=" + this.referenceId + ", incentivized=" + this.incentivized + ", supportedTemplateTypes=" + this.supportedTemplateTypes + ", supportedAdFormats=" + this.supportedAdFormats + ", adRefreshDuration=" + this.adRefreshDuration + ", headerBidding=" + this.headerBidding + ", adSize=" + this.adSize + ')';
    }
}
