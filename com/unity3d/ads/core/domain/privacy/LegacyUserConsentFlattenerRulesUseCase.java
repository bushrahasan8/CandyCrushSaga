package com.unity3d.ads.core.domain.privacy;

import com.ironsource.i5;
import com.unity3d.services.core.misc.JsonFlattenerRules;
import kotlin.collections.CollectionsKt;

/* loaded from: LegacyUserConsentFlattenerRulesUseCase.class */
public final class LegacyUserConsentFlattenerRulesUseCase implements FlattenerRulesUseCase {
    @Override // com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase
    public JsonFlattenerRules invoke() {
        return new JsonFlattenerRules(CollectionsKt.mutableListOf("privacy", "unity", "pipl"), CollectionsKt.listOf("value"), CollectionsKt.mutableListOf(i5.T0, "exclude", "pii", "nonBehavioral", "nonbehavioral"));
    }
}
