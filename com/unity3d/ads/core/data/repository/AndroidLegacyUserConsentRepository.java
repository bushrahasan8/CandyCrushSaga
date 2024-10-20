package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: AndroidLegacyUserConsentRepository.class */
public final class AndroidLegacyUserConsentRepository implements LegacyUserConsentRepository {
    private final LegacyUserConsentDataSource legacyUserConsentDataSource;

    public AndroidLegacyUserConsentRepository(LegacyUserConsentDataSource legacyUserConsentDataSource) {
        Intrinsics.checkNotNullParameter(legacyUserConsentDataSource, "legacyUserConsentDataSource");
        this.legacyUserConsentDataSource = legacyUserConsentDataSource;
    }

    @Override // com.unity3d.ads.core.data.repository.LegacyUserConsentRepository
    public String getLegacyFlowUserConsent() {
        return this.legacyUserConsentDataSource.getPrivacyData();
    }
}
