package com.unity3d.ads.core.data.model;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: AdObject.class */
public final class AdObject {
    private final AdPlayer adPlayer;
    private final DiagnosticEventRequestOuterClass$DiagnosticAdType adType;
    private final Boolean isHeaderBidding;
    private final UnityAdsLoadOptions loadOptions;
    private final ByteString opportunityId;
    private final String placementId;
    private String playerServerId;
    private ByteString trackingToken;

    public AdObject(ByteString opportunityId, String placementId, ByteString trackingToken, AdPlayer adPlayer, String str, UnityAdsLoadOptions loadOptions, Boolean bool, DiagnosticEventRequestOuterClass$DiagnosticAdType adType) {
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(trackingToken, "trackingToken");
        Intrinsics.checkNotNullParameter(loadOptions, "loadOptions");
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.opportunityId = opportunityId;
        this.placementId = placementId;
        this.trackingToken = trackingToken;
        this.adPlayer = adPlayer;
        this.playerServerId = str;
        this.loadOptions = loadOptions;
        this.isHeaderBidding = bool;
        this.adType = adType;
    }

    public /* synthetic */ AdObject(ByteString byteString, String str, ByteString byteString2, AdPlayer adPlayer, String str2, UnityAdsLoadOptions unityAdsLoadOptions, Boolean bool, DiagnosticEventRequestOuterClass$DiagnosticAdType diagnosticEventRequestOuterClass$DiagnosticAdType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteString, str, byteString2, (i & 8) != 0 ? null : adPlayer, (i & 16) != 0 ? null : str2, unityAdsLoadOptions, (i & 64) != 0 ? null : bool, diagnosticEventRequestOuterClass$DiagnosticAdType);
    }

    public static /* synthetic */ AdObject copy$default(AdObject adObject, ByteString byteString, String str, ByteString byteString2, AdPlayer adPlayer, String str2, UnityAdsLoadOptions unityAdsLoadOptions, Boolean bool, DiagnosticEventRequestOuterClass$DiagnosticAdType diagnosticEventRequestOuterClass$DiagnosticAdType, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = adObject.opportunityId;
        }
        if ((i & 2) != 0) {
            str = adObject.placementId;
        }
        if ((i & 4) != 0) {
            byteString2 = adObject.trackingToken;
        }
        if ((i & 8) != 0) {
            adPlayer = adObject.adPlayer;
        }
        if ((i & 16) != 0) {
            str2 = adObject.playerServerId;
        }
        if ((i & 32) != 0) {
            unityAdsLoadOptions = adObject.loadOptions;
        }
        if ((i & 64) != 0) {
            bool = adObject.isHeaderBidding;
        }
        if ((i & 128) != 0) {
            diagnosticEventRequestOuterClass$DiagnosticAdType = adObject.adType;
        }
        return adObject.copy(byteString, str, byteString2, adPlayer, str2, unityAdsLoadOptions, bool, diagnosticEventRequestOuterClass$DiagnosticAdType);
    }

    public final ByteString component1() {
        return this.opportunityId;
    }

    public final String component2() {
        return this.placementId;
    }

    public final ByteString component3() {
        return this.trackingToken;
    }

    public final AdPlayer component4() {
        return this.adPlayer;
    }

    public final String component5() {
        return this.playerServerId;
    }

    public final UnityAdsLoadOptions component6() {
        return this.loadOptions;
    }

    public final Boolean component7() {
        return this.isHeaderBidding;
    }

    public final DiagnosticEventRequestOuterClass$DiagnosticAdType component8() {
        return this.adType;
    }

    public final AdObject copy(ByteString opportunityId, String placementId, ByteString trackingToken, AdPlayer adPlayer, String str, UnityAdsLoadOptions loadOptions, Boolean bool, DiagnosticEventRequestOuterClass$DiagnosticAdType adType) {
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(trackingToken, "trackingToken");
        Intrinsics.checkNotNullParameter(loadOptions, "loadOptions");
        Intrinsics.checkNotNullParameter(adType, "adType");
        return new AdObject(opportunityId, placementId, trackingToken, adPlayer, str, loadOptions, bool, adType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdObject)) {
            return false;
        }
        AdObject adObject = (AdObject) obj;
        return Intrinsics.areEqual(this.opportunityId, adObject.opportunityId) && Intrinsics.areEqual(this.placementId, adObject.placementId) && Intrinsics.areEqual(this.trackingToken, adObject.trackingToken) && Intrinsics.areEqual(this.adPlayer, adObject.adPlayer) && Intrinsics.areEqual(this.playerServerId, adObject.playerServerId) && Intrinsics.areEqual(this.loadOptions, adObject.loadOptions) && Intrinsics.areEqual(this.isHeaderBidding, adObject.isHeaderBidding) && this.adType == adObject.adType;
    }

    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    public final DiagnosticEventRequestOuterClass$DiagnosticAdType getAdType() {
        return this.adType;
    }

    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final String getPlayerServerId() {
        return this.playerServerId;
    }

    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    public int hashCode() {
        int hashCode = this.opportunityId.hashCode();
        int hashCode2 = this.placementId.hashCode();
        int hashCode3 = this.trackingToken.hashCode();
        AdPlayer adPlayer = this.adPlayer;
        int i = 0;
        int hashCode4 = adPlayer == null ? 0 : adPlayer.hashCode();
        String str = this.playerServerId;
        int hashCode5 = str == null ? 0 : str.hashCode();
        int hashCode6 = this.loadOptions.hashCode();
        Boolean bool = this.isHeaderBidding;
        if (bool != null) {
            i = bool.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i) * 31) + this.adType.hashCode();
    }

    public final Boolean isHeaderBidding() {
        return this.isHeaderBidding;
    }

    public final void setPlayerServerId(String str) {
        this.playerServerId = str;
    }

    public final void setTrackingToken(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<set-?>");
        this.trackingToken = byteString;
    }

    public String toString() {
        return "AdObject(opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", trackingToken=" + this.trackingToken + ", adPlayer=" + this.adPlayer + ", playerServerId=" + this.playerServerId + ", loadOptions=" + this.loadOptions + ", isHeaderBidding=" + this.isHeaderBidding + ", adType=" + this.adType + ')';
    }
}
